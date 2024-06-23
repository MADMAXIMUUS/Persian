package io.github.madmaximuus.persian.colorPicker

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import io.github.madmaximuus.persian.alert.AlertsColors
import io.github.madmaximuus.persian.alert.AlertsDefaults
import io.github.madmaximuus.persian.colorPicker.view.ColorPickerViewColors
import io.github.madmaximuus.persian.colorPicker.view.ColorPickerViewDefaults

object PersianColorPickerDefaults {

    @Composable
    fun colors(
        colorPickerViewColors: ColorPickerViewColors = ColorPickerViewDefaults.colors(),
        alertsColors: AlertsColors = AlertsDefaults.colors()
    ): ColorPickerColors = ColorPickerColors(
        colorPickerViewColors = colorPickerViewColors,
        alertsColors = alertsColors
    )
}

@Immutable
class ColorPickerColors internal constructor(
    internal val colorPickerViewColors: ColorPickerViewColors,
    internal val alertsColors: AlertsColors
)