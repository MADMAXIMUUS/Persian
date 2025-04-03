package io.github.madmaximuus.persian.timePicker

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.adaptive.currentWindowAdaptiveInfo
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.window.core.layout.WindowHeightSizeClass
import io.github.madmaximuus.persian.R
import io.github.madmaximuus.persian.alert.Action
import io.github.madmaximuus.persian.alert.Alert
import io.github.madmaximuus.persian.foundation.PersianTheme
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
 * @param sizes sizes [TimePickerSizes] that will be used to resolve the sizes used for this
 * time picker in different states. See [TimePickerDefaults.sizes].
 * @param onDismissRequest invoked when dialog is closed
 */
@Composable
fun TimePicker(
    state: TimePickerState,
    title: String = stringResource(R.string.select_time),
    pickerType: PickerType = PickerType.DIAL,
    colors: TimePickerColors = TimePickerDefaults.colors(),
    sizes: TimePickerSizes = TimePickerDefaults.sizes(),
    onDismissRequest: () -> Unit,
) {
    Alert(
        title = title,
        colors = colors.alertColors,
        sizes = sizes.alertSizes,
        onDismissRequest = {
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
            val windowHeightSizeClass =
                currentWindowAdaptiveInfo().windowSizeClass.windowHeightSizeClass
            val maxWidth = if (windowHeightSizeClass == WindowHeightSizeClass.COMPACT)
                440.dp
            else 320.dp
            DialTimePickerView(
                modifier = Modifier
                    .padding(horizontal = PersianTheme.spacing.size12)
                    .widthIn(min = 300.dp, max = maxWidth),
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