package io.github.madmaximuus.persian.timePicker

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.res.stringResource
import io.github.madmaximuus.persian.R
import io.github.madmaximuus.persian.alert.Action
import io.github.madmaximuus.persian.alert.Alert
import io.github.madmaximuus.persian.timePicker.state.AnalogTimePickerState
import io.github.madmaximuus.persian.timePicker.state.TimePickerState
import io.github.madmaximuus.persian.timePicker.util.PickerType
import io.github.madmaximuus.persian.timePicker.view.dial.DialTimePickerView
import io.github.madmaximuus.persian.timePicker.view.wheel.WheelTimePickerView

/**
 *
 * Time pickers help users select and set a specific time.
 *
 * Shows a picker that allows the user to select time. Subscribe to updates through
 * [TimePickerState]
 *
 * [state] state for this timepicker, allows to subscribe to changes to [TimePickerState.hour] and
 * [TimePickerState.minute], and set the initial time for this picker.
 *
 * @param state state for this time input, allows to subscribe to changes to [TimePickerState.hour]
 *   and [TimePickerState.minute], and set the initial time for this input.
 * @param colors colors [TimePickerColors] that will be used to resolve the colors used for this
 *   time picker in different states. See [TimePickerDefaults.colors].
 * @param layoutType, the different [TimePickerLayoutType] supported by this time picker, it will
 *   change the position and sizing of different components of the timepicker.
 */
@Composable
fun TimePicker(
    state: TimePickerState,
    pickerType: PickerType = PickerType.DIAL,
    colors: TimePickerColors = TimePickerDefaults.colors(),
    sizes: TimePickerSizes = TimePickerDefaults.sizes(),
    onDismissRequest: () -> Unit,
) {
    Alert(
        title = stringResource(id = R.string.select_time),
        colors = colors.alertColors,
        sizes = sizes.alertSizes,
        onDismiss = {
            onDismissRequest()
        },
        confirmAction = {
            Action(
                title = stringResource(id = R.string.ok),
                onClick = {
                    onDismissRequest()
                }
            )
        },
        dismissAction = {
            Action(
                title = stringResource(id = R.string.cancel),
                onClick = {
                    onDismissRequest()
                }
            )
        }
    ) {
        if (pickerType == PickerType.DIAL) {
            val analogState = remember(state) { AnalogTimePickerState(state) }
            DialTimePickerView(
                analogState = analogState,
                sizes = sizes.dialTimePickerViewSizes,
                colors = colors.dialTimePickerViewColors
            )
        } else {
            WheelTimePickerView(
                state = state,
                colors = colors.wheelTimePickerViewColors,
                sizes = sizes.wheelTimePickerViewSizes
            )
        }
    }
}