package io.github.madmaximuus.persian.colorPicker.view.util

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.Saver
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.core.graphics.toColor
import java.io.Serializable
import android.graphics.Color as AndroidColor

internal class ColorPickerState(
    val config: ColorPickerConfig,
    stateData: ColorPickerStateData? = null
) {
    var mode by mutableStateOf(stateData?.mode ?: ColorPickerDisplayMode.HEX)
    var color by mutableStateOf(stateData?.color ?: resolveColor(config))
    var alpha by mutableFloatStateOf(stateData?.alpha ?: config.alpha)

    fun updateSatVal(saturation: Float, value: Float) {
        color = color.copy(second = saturation, third = value)
    }

    fun updateColor(newColor: Float) {
        color = color.copy(first = newColor)
    }

    fun updateAlpha(newAlpha: Float) {
        alpha = newAlpha
    }

    fun setRGB() {
        mode = ColorPickerDisplayMode.RGB
    }

    fun setHEX() {
        mode = ColorPickerDisplayMode.HEX
    }

    fun setHSV() {
        mode = ColorPickerDisplayMode.HSV
    }

    @OptIn(ExperimentalStdlibApi::class)
    fun getHexColor(): String {
        return "#${
            AndroidColor.HSVToColor(
                (alpha * 255).toInt(),
                floatArrayOf(color.first, color.second, color.third)
            ).toHexString(HexFormat.UpperCase)
        }"
    }

    fun getRGBColor(): Triple<Int, Int, Int> {
        val color =
            AndroidColor.HSVToColor(
                floatArrayOf(
                    this.color.first,
                    this.color.second,
                    this.color.third
                )
            )
        val rgb = color.toColor()
        return Triple(
            (rgb.red() * 255).toInt(),
            (rgb.green() * 255).toInt(),
            (rgb.blue() * 255).toInt()
        )
    }

    fun onFinish(): Color {
        return Color.hsv(color.first, color.second, color.third, alpha)
    }

    companion object {
        fun Saver(
            config: ColorPickerConfig
        ): Saver<ColorPickerState, *> = Saver(
            save = { state ->
                ColorPickerStateData(
                    mode = state.mode,
                    color = state.color,
                    alpha = state.alpha
                )
            },
            restore = { data ->
                ColorPickerState(config, data)
            }
        )
    }

    internal data class ColorPickerStateData(
        val mode: ColorPickerDisplayMode,
        val color: Triple<Float, Float, Float>,
        val alpha: Float
    ) : Serializable {

        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (javaClass != other?.javaClass) return false

            other as ColorPickerStateData

            if (mode != other.mode) return false
            return color == other.color
        }

        override fun hashCode(): Int {
            var result = mode.hashCode()
            result = 31 * result + color.hashCode()
            return result
        }
    }
}

@Composable
internal fun rememberColorPickerState(
    config: ColorPickerConfig
): ColorPickerState = rememberSaveable(
    inputs = arrayOf(config),
    saver = ColorPickerState.Saver(config),
    init = { ColorPickerState(config, null) }
)