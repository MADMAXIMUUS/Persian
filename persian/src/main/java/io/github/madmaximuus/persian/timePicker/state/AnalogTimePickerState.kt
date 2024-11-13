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

/**
 * Internal class representing the state of an analog time picker.
 *
 * This class extends [TimePickerState] and provides additional functionality for managing
 * the state of an analog time picker, including animations and gesture handling.
 *
 * @param state The underlying [TimePickerState] that this class delegates to.
 */
internal class AnalogTimePickerState(val state: TimePickerState) : TimePickerState by state {

    /**
     * Gets the current angle of the time picker.
     */
    val currentAngle: Float
        get() = anim.value

    /**
     * The angle corresponding to the current hour, normalized to the range of a full circle.
     */
    private var hourAngle = RadiansPerHour * (state.hour % 12) - FullCircle / 4

    /**
     * The angle corresponding to the current minute, normalized to the range of a full circle.
     */
    private var minuteAngle = RadiansPerMinute * state.minute - FullCircle / 4

    /**
     * Animates the time picker to the current time.
     *
     * This function checks if the time picker needs to be updated and animates to the current
     * hour or minute angle accordingly.
     */
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

    /**
     * Checks if the time picker state needs to be updated.
     */
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

    /**
     * Gets the list of values to be displayed on the clock face.
     */
    val clockFaceValues: IntList
        get() = if (selection == TimePickerSelectionMode.Minute) Minutes else Hours

    /**
     * Calculates the end value for the animation.
     *
     * @param new The new angle to animate to.
     */
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

    /**
     * The animatable object used for animating the time picker.
     */
    private var anim = Animatable(hourAngle)

    /**
     * Handles the end of a gesture.
     *
     * This function calculates the end value for the animation and animates to it.
     */
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

    /**
     * Rotates the time picker to a specified angle.
     *
     * @param angle The angle to rotate to.
     * @param animate Whether to animate the rotation.
     */
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

    /**
     * Gets or sets the current minute.
     */
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

    /**
     * Updates the base state minute without triggering recomposition.
     */
    private fun updateBaseStateMinute() = Snapshot.withoutReadObservation { state.minute = minute }

    /**
     * Gets or sets the current hour.
     */
    override var hour: Int
        get() = state.hour
        set(value) {
            hourAngle = RadiansPerHour * (value % 12) - FullCircle / 4
            state.hour = value
            if (selection == TimePickerSelectionMode.Hour) {
                anim = Animatable(hourAngle)
            }
        }

    /**
     * Normalizes an angle to the range [0, 2π).
     */
    private fun Float.normalize(): Float {
        var normalizedAngle = this % (2 * PI)

        if (normalizedAngle < 0) {
            normalizedAngle += 2 * PI
        }

        return normalizedAngle.toFloat()
    }

    /**
     * A mutex used to prevent concurrent mutations.
     */
    private val mutex = MutatorMutex()

    /**
     * Converts an angle to the corresponding hour.
     */
    private fun Float.toHour(): Int {
        val hourOffset: Float = RadiansPerHour / 2
        val totalOffset = hourOffset + QuarterCircle
        return ((this + totalOffset) / RadiansPerHour).toInt() % 12
    }

    /**
     * Converts an angle to the corresponding minute.
     */
    private fun Float.toMinute(): Int {
        val minuteOffset: Float = RadiansPerMinute / 2
        val totalOffset = minuteOffset + QuarterCircle
        return ((this + totalOffset) / RadiansPerMinute).toInt() % 60
    }

    /**
     * Offsets an angle by a quarter circle.
     *
     * @param angle The angle to offset.
     */
    private fun offsetAngle(angle: Float): Float {
        val ret = angle + QuarterCircle.toFloat()
        return if (ret < 0) ret + FullCircle else ret
    }
}