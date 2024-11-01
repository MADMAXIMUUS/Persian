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
     * Create a [ColorPickerViewColors] that represents the default container and content colors.
     *
     * @param selectorBorderColor The color of the border for the selector.
     * @param selectorThumbBorderColor The color of the border for the selector thumb.
     * @param saturationValueThumbColor The color of the thumb for the saturation and value sliders.
     * @param slidersColors The colors used for the sliders.
     * @param segmentedButton The colors used for the segmented buttons.
     */
    @Composable
    fun colors(
        selectorBorderColor: Color = PersianTheme.colorScheme.outline,
        selectorThumbBorderColor: Color = PersianTheme.colorScheme.primaryContainer,
        saturationValueThumbColor: Color = PersianTheme.colorScheme.primaryContainer,
        slidersColors: SliderColors = SliderDefaults.colors(),
        segmentedButton: SegmentedButtonColors = SegmentedButtonDefaults.colors(),
    ): ColorPickerViewColors =
        ColorPickerViewColors(
            selectorBorderColor = selectorBorderColor,
            selectorThumbBorderColor = selectorThumbBorderColor,
            saturationValueThumbColor = saturationValueThumbColor,
            slidersColors = slidersColors,
            segmentedButton = segmentedButton
        )
}

/**
 * Represents the container and content colors used in a [ColorPickerView] in different states.
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