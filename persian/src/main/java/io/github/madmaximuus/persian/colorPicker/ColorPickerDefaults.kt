package io.github.madmaximuus.persian.colorPicker

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import io.github.madmaximuus.persian.alert.AlertColors
import io.github.madmaximuus.persian.alert.AlertsDefaults
import io.github.madmaximuus.persian.codeInput.FourDigitCodeInput
import io.github.madmaximuus.persian.codeInput.SixDigitCodeInput
import io.github.madmaximuus.persian.colorPicker.view.ColorPickerViewColors
import io.github.madmaximuus.persian.colorPicker.view.ColorPickerViewDefaults

/**
 * Contains the default values used by [SixDigitCodeInput] and [FourDigitCodeInput].
 */
object ColorPickerDefaults {

    /**
     * Composable function to create a [ColorPickerColors] object with customizable colors for the color picker.
     *
     * @param colorPickerViewColors The color configurations for the color picker view.
     * @param alertColors The color configurations for alert dialogs associated with the color picker.
     * @return A [ColorPickerColors] object with the specified colors.
     */
    @Composable
    fun colors(
        colorPickerViewColors: ColorPickerViewColors = ColorPickerViewDefaults.colors(),
        alertColors: AlertColors = AlertsDefaults.colors()
    ): ColorPickerColors = ColorPickerColors(
        colorPickerViewColors = colorPickerViewColors,
        alertColors = alertColors
    )
}

/**
 * An immutable class that holds the color configurations for a color picker.
 *
 * @param colorPickerViewColors The color configurations for the color picker view.
 * @param alertColors The color configurations for alert dialogs associated with the color picker.
 */
@Immutable
class ColorPickerColors internal constructor(
    internal val colorPickerViewColors: ColorPickerViewColors,
    internal val alertColors: AlertColors
)