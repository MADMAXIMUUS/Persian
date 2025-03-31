package io.github.madmaximuus.persian.colorPicker.view

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.segmentedControls.tabs.SegmentedTabsColors
import io.github.madmaximuus.persian.segmentedControls.tabs.SegmentedTabsDefaults
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
     * @param segmentedTabsColors The colors used for the segmented tabs.
     */
    @Composable
    fun colors(
        selectorBorderColor: Color = PersianTheme.colorScheme.outlineVariant,
        selectorThumbBorderColor: Color = PersianTheme.colorScheme.surface,
        saturationValueThumbColor: Color = PersianTheme.colorScheme.surface,
        slidersColors: SliderColors = SliderDefaults.colors(),
        segmentedTabsColors: SegmentedTabsColors = SegmentedTabsDefaults.colors(),
    ) = ColorPickerViewColors(
        selectorBorderColor = selectorBorderColor,
        selectorThumbBorderColor = selectorThumbBorderColor,
        saturationValueThumbColor = saturationValueThumbColor,
        slidersColors = slidersColors,
        segmentedTabsColors = segmentedTabsColors
    )
}

/**
 * Represents the container and content colors used in a [ColorPickerView] in different states.
 *
 * @property selectorBorderColor The color of the border for the selector.
 * @property selectorThumbBorderColor The color of the border for the selector thumb.
 * @property saturationValueThumbColor The color of the thumb for the saturation and value sliders.
 * @property slidersColors The colors used for the sliders.
 * @property segmentedTabsColors The colors used for the segmented tabs.
 */
@Immutable
class ColorPickerViewColors internal constructor(
    internal val selectorBorderColor: Color,
    internal val selectorThumbBorderColor: Color,
    internal val saturationValueThumbColor: Color,
    internal val slidersColors: SliderColors,
    internal val segmentedTabsColors: SegmentedTabsColors
)