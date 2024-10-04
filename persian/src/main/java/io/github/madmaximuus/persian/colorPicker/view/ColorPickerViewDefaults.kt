package io.github.madmaximuus.persian.colorPicker.view

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.segmentedButton.SegmentedButtonColors
import io.github.madmaximuus.persian.segmentedButton.SegmentedButtonDefaults
import io.github.madmaximuus.persian.slider.SliderColors
import io.github.madmaximuus.persian.slider.SliderDefaults

object ColorPickerViewDefaults {
    @Composable
    fun colors(
        selectorBorderColor: Color = PersianTheme.colorScheme.outline,
        selectorThumbColor: Color = PersianTheme.colorScheme.primary,
        selectorThumbBorderColor: Color = PersianTheme.colorScheme.primaryContainer,
        saturationValueThumbColor: Color = PersianTheme.colorScheme.primaryContainer,
        slidersColors: SliderColors = SliderDefaults.colors(),
        segmentedButton: SegmentedButtonColors = SegmentedButtonDefaults.colors(),
    ): ColorPickerViewColors = ColorPickerViewColors(
        selectorBorderColor = selectorBorderColor,
        selectorThumbColor = selectorThumbColor,
        selectorThumbBorderColor = selectorThumbBorderColor,
        saturationValueThumbColor = saturationValueThumbColor,
        slidersColors = slidersColors,
        segmentedButton = segmentedButton
    )
}

@Immutable
class ColorPickerViewColors internal constructor(
    internal val selectorBorderColor: Color,
    internal val selectorThumbColor: Color,
    internal val selectorThumbBorderColor: Color,
    internal val saturationValueThumbColor: Color,
    internal val slidersColors: SliderColors,
    internal val segmentedButton: SegmentedButtonColors
)