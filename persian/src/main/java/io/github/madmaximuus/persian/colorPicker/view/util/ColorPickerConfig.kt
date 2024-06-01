package io.github.madmaximuus.persian.colorPicker.view.util

import androidx.compose.ui.graphics.Color

sealed class ColorPickerConfig {

    abstract val alpha: Float

    data class HEX(
        val color: Color,
        override val alpha: Float = color.alpha
    ) : ColorPickerConfig()

    data class RGB(
        val red: Float,
        val green: Float,
        val blue: Float,
        override val alpha: Float = 1f
    ) : ColorPickerConfig()

    data class HSV(
        val hue: Float,
        val saturation: Float,
        val value: Float,
        override val alpha: Float = 1f
    ) : ColorPickerConfig()
}