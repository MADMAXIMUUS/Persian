package io.github.madmaximuus.persian.colorPicker

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import io.github.madmaximuus.persian.R
import io.github.madmaximuus.persian.alert.Action
import io.github.madmaximuus.persian.alert.Alert
import io.github.madmaximuus.persian.colorPicker.view.ColorPickerView
import io.github.madmaximuus.persian.colorPicker.view.util.ColorPickerState

@Composable
fun ColorPicker(
    state: ColorPickerState,
    colors: ColorPickerColors = PersianColorPickerDefaults.colors(),
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