package io.github.madmaximuus.persian.timePicker.state

import androidx.collection.IntList
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.spring
import androidx.compose.foundation.MutatePriority
import androidx.compose.foundation.MutatePriority.PreventUserInput
import androidx.compose.foundation.MutatorMutex
import androidx.compose.runtime.snapshots.Snapshot
import io.github.madmaximuus.persian.timePicker.util.FullCircle
import io.github.madmaximuus.persian.timePicker.util.HalfCircle
import io.github.madmaximuus.persian.timePicker.util.Hours
import io.github.madmaximuus.persian.timePicker.util.Minutes
import io.github.madmaximuus.persian.timePicker.util.QuarterCircle
import io.github.madmaximuus.persian.timePicker.util.RadiansPerHour
import io.github.madmaximuus.persian.timePicker.util.RadiansPerMinute
import io.github.madmaximuus.persian.timePicker.util.TimePickerSelectionMode
import kotlin.math.PI

internal class AnalogTimePickerState(val state: TimePickerState) : TimePickerState by state {

    val currentAngle: Float
        get() = anim.value

    private var hourAngle = RadiansPerHour * (state.hour % 12) - FullCircle / 4
    private var minuteAngle = RadiansPerMinute * state.minute - FullCircle / 4

    suspend fun animateToCurrent() {
        if (!isUpdated()) {
            return
        }

        val end =
            if (selection == TimePickerSelectionMode.Hour) {
                endValueForAnimation(hourAngle)
            } else {
                endValueForAnimation(minuteAngle)
            }
        mutex.mutate(priority = PreventUserInput) {
            anim.animateTo(end, spring(dampingRatio = 1f, stiffness = 700f))
        }
    }

    private fun isUpdated(): Boolean {
        if (
            selection == TimePickerSelectionMode.Hour &&
            anim.targetValue.normalize() == hourAngle.normalize()
        ) {
            return false
        }

        if (
            selection == TimePickerSelectionMode.Minute &&
            anim.targetValue.normalize() == minuteAngle.normalize()
        ) {
            return false
        }

        return true
    }

    val clockFaceValues: IntList
        get() = if (selection == TimePickerSelectionMode.Minute) Minutes else Hours

    private fun endValueForAnimation(new: Float): Float {
        // Calculate the absolute angular difference
        var diff = anim.value - new
        // Normalize the angular difference to be between -π and π
        while (diff > HalfCircle) {
            diff -= FullCircle
        }
        while (diff <= -HalfCircle) {
            diff += FullCircle
        }

        return anim.value - diff
    }

    private var anim = Animatable(hourAngle)

    suspend fun onGestureEnd() {
        val end =
            endValueForAnimation(
                if (selection == TimePickerSelectionMode.Hour) {
                    hourAngle
                } else {
                    minuteAngle
                }
            )

        mutex.mutate(priority = PreventUserInput) { anim.animateTo(end, spring()) }
    }

    suspend fun rotateTo(angle: Float, animate: Boolean = false) {
        mutex.mutate(MutatePriority.UserInput) {
            if (selection == TimePickerSelectionMode.Hour) {
                hourAngle = angle.toHour() % 12 * RadiansPerHour
                state.hour = hourAngle.toHour() % 12 + if (isAfternoon) 12 else 0
            } else {
                minuteAngle = angle.toMinute() * RadiansPerMinute
                state.minute = minuteAngle.toMinute()
            }

            if (!animate) {
                anim.snapTo(offsetAngle(angle))
            } else {
                val endAngle = endValueForAnimation(offsetAngle(angle))
                anim.animateTo(endAngle, spring(dampingRatio = 1f, stiffness = 700f))
            }
        }
    }

    override var minute: Int
        get() = state.minute
        set(value) {
            minuteAngle = RadiansPerMinute * value - FullCircle / 4
            state.minute = value
            if (selection == TimePickerSelectionMode.Minute) {
                anim = Animatable(minuteAngle)
            }
            updateBaseStateMinute()
        }

    private fun updateBaseStateMinute() = Snapshot.withoutReadObservation { state.minute = minute }

    override var hour: Int
        get() = state.hour
        set(value) {
            hourAngle = RadiansPerHour * (value % 12) - FullCircle / 4
            state.hour = value
            if (selection == TimePickerSelectionMode.Hour) {
                anim = Animatable(hourAngle)
            }
        }

    private fun Float.normalize(): Float {
        var normalizedAngle = this % (2 * PI)

        if (normalizedAngle < 0) {
            normalizedAngle += 2 * PI
        }

        return normalizedAngle.toFloat()
    }

    private val mutex = MutatorMutex()

    private fun Float.toHour(): Int {
        val hourOffset: Float = RadiansPerHour / 2
        val totalOffset = hourOffset + QuarterCircle
        return ((this + totalOffset) / RadiansPerHour).toInt() % 12
    }

    private fun Float.toMinute(): Int {
        val minuteOffset: Float = RadiansPerMinute / 2
        val totalOffset = minuteOffset + QuarterCircle
        return ((this + totalOffset) / RadiansPerMinute).toInt() % 60
    }

    private fun offsetAngle(angle: Float): Float {
        val ret = angle + QuarterCircle.toFloat()
        return if (ret < 0) ret + FullCircle else ret
    }
}