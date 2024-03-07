package io.github.madmaximuus.persian.colorPicker

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import io.github.madmaximuus.persian.R
import io.github.madmaximuus.persian.alert.AlertAction
import io.github.madmaximuus.persian.alert.PersianAlert
import io.github.madmaximuus.persian.colorPicker.view.ColorPickerView
import io.github.madmaximuus.persian.colorPicker.view.util.ColorPickerConfig
import io.github.madmaximuus.persian.colorPicker.view.util.rememberColorPickerState

@Composable
fun PersianColorPicker(
    config: ColorPickerConfig,
    onColorSelected: (Color) -> Unit,
    colors: ColorPickerColors = PersianColorPickerDefaults.colors(),
    onDismissRequest: () -> Unit
) {

    val state = rememberColorPickerState(config)

    PersianAlert(
        title = stringResource(id = R.string.select_color),
        onDismiss = onDismissRequest,
        colors = colors.alertsColors,
        actions = listOf(
            AlertAction(
                title = stringResource(id = R.string.ok),
                onClick = {
                    onColorSelected(state.onFinish())
                    onDismissRequest()
                }
            ),
            AlertAction(
                title = stringResource(id = R.string.cancel),
                onClick = {
                    onDismissRequest()
                }
            )
        )
    ) {
        ColorPickerView(
            state = state,
            colors = colors.colorPickerViewColors
        )
    }
}