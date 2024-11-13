package io.github.madmaximuus.persian.colorPicker

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import io.github.madmaximuus.persian.alert.AlertColors
import io.github.madmaximuus.persian.alert.AlertsDefaults
import io.github.madmaximuus.persian.colorPicker.view.ColorPickerViewColors
import io.github.madmaximuus.persian.colorPicker.view.ColorPickerViewDefaults

/**
 * Contains the default values used by [ColorPicker].
 */
object ColorPickerDefaults {

    /**
     * Create a [ColorPickerColors] that represents the default container and content colors.
     *
     * @param colorPickerViewColors The color configurations for the color picker view.
     * @param alertColors The color configurations for alert dialogs associated with the color picker.
     */
    @Composable
    fun colors(
        colorPickerViewColors: ColorPickerViewColors = ColorPickerViewDefaults.colors(),
        alertColors: AlertColors = AlertsDefaults.colors()
    ): ColorPickerColors =
        ColorPickerColors(
            colorPickerViewColors = colorPickerViewColors,
            alertColors = alertColors
        )
}

/**
 * Represents the container and content colors used in a color picker in different states.
 *
 * @param colorPickerViewColors The color configurations for the color picker view.
 * @param alertColors The color configurations for alert dialogs associated with the color picker.
 */
@Immutable
class ColorPickerColors internal constructor(
    internal val colorPickerViewColors: ColorPickerViewColors,
    internal val alertColors: AlertColors
)