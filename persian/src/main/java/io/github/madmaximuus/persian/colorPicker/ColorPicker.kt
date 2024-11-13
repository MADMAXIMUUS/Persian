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
 * A color picker dialog is useful for selecting and customizing colors, providing users with
 * a convenient interface to choose from a wide range of color options. It offers a straightforward
 * and intuitive method for color selection, making it an effective tool for enhancing design
 * and user experience.
 *
 * @param state The state of the color picker, which contains information about the selected color
 * and other configurations.
 * @param colors The colors used for the color picker and the alert dialog.
 * @param onConfirm A callback function that is invoked when the user confirms the color selection.
 * It receives the selected color as a parameter.
 * @param onDismissRequest A callback function that is invoked when the user requests to dismiss
 * the dialog.
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