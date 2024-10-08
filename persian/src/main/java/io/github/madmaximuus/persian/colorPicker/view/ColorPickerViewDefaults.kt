package io.github.madmaximuus.persian.colorPicker.view

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.segmentedButton.SegmentedButtonColors
import io.github.madmaximuus.persian.segmentedButton.SegmentedButtonDefaults
import io.github.madmaximuus.persian.slider.SliderColors
import io.github.madmaximuus.persian.slider.SliderDefaults

/**
 * Contains the default values used by [ColorPickerView].
 */
object ColorPickerViewDefaults {

    /**
     * A composable function that creates and returns a [ColorPickerViewColors] instance with the specified color properties.
     *
     * This function allows customizing the colors used in the color picker view by providing default values for various color properties.
     * The default values are sourced from the [PersianTheme] color scheme and default color settings for sliders and segmented buttons.
     *
     * @param selectorBorderColor The color of the border for the selector.
     * @param selectorThumbBorderColor The color of the border for the selector thumb.
     * @param saturationValueThumbColor The color of the thumb for the saturation and value sliders.
     * @param slidersColors The colors used for the sliders.
     * @param segmentedButton The colors used for the segmented buttons.
     * @return A [ColorPickerViewColors] instance with the specified color properties.
     */
    @Composable
    fun colors(
        selectorBorderColor: Color = PersianTheme.colorScheme.outline,
        selectorThumbBorderColor: Color = PersianTheme.colorScheme.primaryContainer,
        saturationValueThumbColor: Color = PersianTheme.colorScheme.primaryContainer,
        slidersColors: SliderColors = SliderDefaults.colors(),
        segmentedButton: SegmentedButtonColors = SegmentedButtonDefaults.colors(),
    ): ColorPickerViewColors = ColorPickerViewColors(
        selectorBorderColor = selectorBorderColor,
        selectorThumbBorderColor = selectorThumbBorderColor,
        saturationValueThumbColor = saturationValueThumbColor,
        slidersColors = slidersColors,
        segmentedButton = segmentedButton
    )
}

/**
 * A class representing the colors used in the color picker view.
 *
 * This class encapsulates various color properties used in the color picker view, such as the border colors for selectors,
 * thumb colors for saturation and value sliders, colors for sliders, and colors for segmented buttons.
 *
 * @property selectorBorderColor The color of the border for the selector.
 * @property selectorThumbBorderColor The color of the border for the selector thumb.
 * @property saturationValueThumbColor The color of the thumb for the saturation and value sliders.
 * @property slidersColors The colors used for the sliders.
 * @property segmentedButton The colors used for the segmented buttons.
 */
@Immutable
class ColorPickerViewColors internal constructor(
    internal val selectorBorderColor: Color,
    internal val selectorThumbBorderColor: Color,
    internal val saturationValueThumbColor: Color,
    internal val slidersColors: SliderColors,
    internal val segmentedButton: SegmentedButtonColors
)