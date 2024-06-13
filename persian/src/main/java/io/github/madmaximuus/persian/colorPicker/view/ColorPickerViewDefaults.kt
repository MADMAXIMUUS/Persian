package io.github.madmaximuus.persian.colorPicker.view

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.state38

object ColorPickerViewDefaults {
    @Composable
    fun colors(
        colorModeTitle: Color = PersianTheme.colorScheme.onSurface.state38,
        colorModeTitleSelectedColor: Color = PersianTheme.colorScheme.onSurface,
        selectorBorderColor: Color = PersianTheme.colorScheme.outline,
        selectorThumbColor: Color = PersianTheme.colorScheme.primary,
        selectorThumbBorderColor: Color = PersianTheme.colorScheme.primaryContainer,
        saturationValueThumbColor: Color = PersianTheme.colorScheme.primaryContainer
    ): ColorPickerViewColors = ColorPickerViewColors(
        colorModeTitleColor = colorModeTitle,
        colorModeTitleSelectedColor = colorModeTitleSelectedColor,
        selectorBorderColor = selectorBorderColor,
        selectorThumbColor = selectorThumbColor,
        selectorThumbBorderColor = selectorThumbBorderColor,
        saturationValueThumbColor = saturationValueThumbColor
    )
}

@Immutable
class ColorPickerViewColors internal constructor(
    internal val colorModeTitleColor: Color,
    internal val colorModeTitleSelectedColor: Color,
    internal val selectorBorderColor: Color,
    internal val selectorThumbColor: Color,
    internal val selectorThumbBorderColor: Color,
    internal val saturationValueThumbColor: Color
)