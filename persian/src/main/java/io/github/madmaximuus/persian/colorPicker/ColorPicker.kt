package io.github.madmaximuus.persian.colorPicker

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import io.github.madmaximuus.persian.R
import io.github.madmaximuus.persian.alert.Action
import io.github.madmaximuus.persian.alert.Alert
import io.github.madmaximuus.persian.colorPicker.view.ColorPickerView
import io.github.madmaximuus.persian.colorPicker.view.util.ColorPickerState

/**
 * A composable function that represents a color picker dialog.
 *
 * This function displays a color picker dialog with a title, confirmation and dismiss actions, and a color picker view.
 * The dialog allows the user to select a color and either confirm the selection or dismiss the dialog.
 * The state of the color picker and the colors used in the dialog are managed by the provided [state] and [colors] parameters.
 *
 * @param state The state of the color picker, which contains information about the selected color and other configurations.
 * @param colors The colors used for the color picker and the alert dialog.
 * @param onConfirm A callback function that is invoked when the user confirms the color selection. It receives the selected color as a parameter.
 * @param onDismissRequest A callback function that is invoked when the user requests to dismiss the dialog.
 */
@Composable
fun ColorPicker(
    state: ColorPickerState,
    colors: ColorPickerColors = ColorPickerDefaults.colors(),
    onConfirm: (color: Color) -> Unit,
    onDismissRequest: () -> Unit
) {
    Alert(
        title = stringResource(id = R.string.select_color),
        onDismiss = onDismissRequest,
        colors = colors.alertColors,
        confirmAction = {
            Action(
                title = stringResource(id = R.string.ok),
                onClick = {
                    onConfirm(state.selectedColor)
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
        ColorPickerView(
            state = state,
            colors = colors.colorPickerViewColors
        )
    }
}