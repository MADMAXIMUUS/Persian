package io.github.madmaximuus.persian.timePicker.state

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.Saver
import androidx.compose.runtime.setValue
import io.github.madmaximuus.persian.timePicker.util.TimePickerSelectionMode

internal class TimePickerStateImpl(
    initialHour: Int,
    initialMinute: Int,
    is24Hour: Boolean,
) : TimePickerState {
    init {
        require(initialHour in 0..23) { "initialHour should in [0..23] range" }
        require(initialMinute in 0..59) { "initialMinute should be in [0..59] range" }
    }

    override var is24hour: Boolean = is24Hour

    override var selection by mutableStateOf(TimePickerSelectionMode.Hour)

    override var isAfternoon by mutableStateOf(initialHour >= 12)

    private val hourState = mutableIntStateOf(initialHour % 12)

    private val minuteState = mutableIntStateOf(initialMinute)

    override var minute: Int
        get() = minuteState.intValue
        set(value) {
            minuteState.intValue = value
        }

    override var hour: Int
        get() = hourState.intValue + if (isAfternoon) 12 else 0
        set(value) {
            isAfternoon = value >= 12
            hourState.intValue = value % 12
        }

    companion object {
        /** The default [Saver] implementation for [TimePickerState]. */
        fun Saver(): Saver<TimePickerStateImpl, *> =
            Saver(
                save = { listOf(it.hour, it.minute, it.is24hour) },
                restore = { value ->
                    TimePickerStateImpl(
                        initialHour = value[0] as Int,
                        initialMinute = value[1] as Int,
                        is24Hour = value[2] as Boolean
                    )
                }
            )
    }
}