package io.github.madmaximuus.persian.timePicker.state

import androidx.annotation.IntRange
import androidx.compose.runtime.Composable
import androidx.compose.runtime.saveable.rememberSaveable
import io.github.madmaximuus.persian.timePicker.util.TimePickerSelectionMode

/**
 * A state object that can be hoisted to observe the time picker state. It holds the current values
 * and allows for directly setting those values.
 *
 * @see rememberTimePickerState to construct the default implementation.
 */
interface TimePickerState {

    /** The currently selected minute (0-59). */
    @get:IntRange(from = 0, to = 59)
    @setparam:IntRange(from = 0, to = 59)
    var minute: Int

    /** The currently selected hour (0-23). */
    @get:IntRange(from = 0, to = 23)
    @setparam:IntRange(from = 0, to = 23)
    var hour: Int

    /**
     * Indicates whether the time picker uses 24-hour format (`true`) or 12-hour format with AM/PM
     * (`false`).
     */
    var is24hour: Boolean

    /** Specifies whether the hour or minute component is being actively selected by the user. */
    var selection: TimePickerSelectionMode

    /** Indicates whether the selected time falls within the afternoon period (12 PM - 12 AM). */
    var isAfternoon: Boolean
}

/**
 * Creates a [TimePickerState] for a time picker that is remembered across compositions and
 * configuration changes.
 *
 * @param initialHour starting hour for this state, will be displayed in the time picker when
 *   launched. Ranges from 0 to 23
 * @param initialMinute starting minute for this state, will be displayed in the time picker when
 *   launched. Ranges from 0 to 59
 * @param is24Hour The format for this time picker. `false` for 12 hour format with an AM/PM toggle
 *   or `true` for 24 hour format without toggle. Defaults to follow system setting.
 */
@Composable
fun rememberTimePickerState(
    initialHour: Int = 0,
    initialMinute: Int = 0,
    is24Hour: Boolean = false,
): TimePickerState {
    val state: TimePickerStateImpl =
        rememberSaveable(is24Hour, saver = TimePickerStateImpl.Saver()) {
            TimePickerStateImpl(
                initialHour = initialHour,
                initialMinute = initialMinute,
                is24Hour = is24Hour,
            )
        }

    return state
}