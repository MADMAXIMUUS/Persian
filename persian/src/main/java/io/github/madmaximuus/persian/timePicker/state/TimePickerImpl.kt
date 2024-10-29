package io.github.madmaximuus.persian.timePicker.state

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.Saver
import androidx.compose.runtime.setValue
import io.github.madmaximuus.persian.timePicker.util.TimePickerSelectionMode

/**
 * Internal implementation of the [TimePickerState] interface.
 *
 * This class manages the state of a time picker, including the hour, minute, and whether the time
 * is in 24-hour format. It also handles the selection mode (hour or minute) and whether the time
 * is in the afternoon.
 *
 * @param initialHour The initial hour value, must be in the range [0..23].
 * @param initialMinute The initial minute value, must be in the range [0..59].
 * @param is24Hour Whether the time picker is in 24-hour format.
 */
internal class TimePickerStateImpl(
    initialHour: Int,
    initialMinute: Int,
    is24Hour: Boolean,
) : TimePickerState {
    init {
        require(initialHour in 0..23) { "initialHour should in [0..23] range" }
        require(initialMinute in 0..59) { "initialMinute should be in [0..59] range" }
    }

    /**
     * Whether the time picker is in 24-hour format.
     */
    override var is24hour: Boolean = is24Hour

    /**
     * The current selection mode of the time picker (hour or minute).
     */
    override var selection by mutableStateOf(TimePickerSelectionMode.Hour)

    /**
     * Whether the current time is in the afternoon.
     */
    override var isAfternoon by mutableStateOf(initialHour >= 12)

    /**
     * The state of the hour, normalized to the range [0..11].
     */
    private val hourState = mutableIntStateOf(initialHour % 12)

    /**
     * The state of the minute.
     */
    private val minuteState = mutableIntStateOf(initialMinute)

    /**
     * Gets or sets the current minute.
     */
    override var minute: Int
        get() = minuteState.intValue
        set(value) {
            minuteState.intValue = value
        }

    /**
     * Gets or sets the current hour.
     */
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