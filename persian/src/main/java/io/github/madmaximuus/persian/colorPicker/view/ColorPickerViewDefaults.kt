package io.github.madmaximuus.persian.colorPicker.view

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import io.github.madmaximuus.persian.foundation.extendedColorScheme
import io.github.madmaximuus.persian.foundation.state38

object ColorPickerViewDefaults {
    @Composable
    fun colors(
        colorModeTitle: Color = MaterialTheme.extendedColorScheme.onSurface.state38,
        colorModeTitleSelectedColor: Color = MaterialTheme.extendedColorScheme.onSurface,
        selectorBorderColor: Color = MaterialTheme.extendedColorScheme.outline,
        selectorThumbColor: Color = MaterialTheme.extendedColorScheme.primary,
        selectorThumbBorderColor: Color = MaterialTheme.extendedColorScheme.primaryContainer,
        saturationValueThumbColor: Color = MaterialTheme.extendedColorScheme.primaryContainer
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