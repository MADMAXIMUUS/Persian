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

class ColorPickerState internal constructor(
    initialColor: Color,
    internal val isSupportOpacity: Boolean,
) {
    internal var mode by mutableStateOf(ColorPickerDisplayMode.GRID)
    internal var colorSaturationState by mutableFloatStateOf(0f)
    internal var colorValueState by mutableFloatStateOf(0f)
    internal var colorHueState by mutableFloatStateOf(0f)
    internal var alpha by mutableFloatStateOf(if (isSupportOpacity) initialColor.alpha else 1f)
    private var savedColorsState = mutableStateOf(emptyList<Color>())
    var savedColors: List<Color>
        get() = savedColorsState.value
        set(value) {
            savedColorsState.value = value
        }

    init {
        val resolvedColor = resolveColor(initialColor)
        colorHueState = resolvedColor.first
        colorSaturationState = resolvedColor.second
        colorValueState = resolvedColor.third
    }

    internal val selectedColor: Color
        get() = Color.hsv(colorHueState, colorSaturationState, colorValueState, alpha)

    internal fun moveToSpectrum() {
        mode = ColorPickerDisplayMode.SPECTRUM
    }

    internal fun moveToGrid() {
        mode = ColorPickerDisplayMode.GRID
    }

    internal fun moveToSliders() {
        mode = ColorPickerDisplayMode.SLIDERS
    }

    internal fun saveColor() {
        val list = savedColors.toMutableList()
        list.add(list.size - 1, selectedColor.copy(alpha))
        savedColors = list
    }

    internal fun removeColor(color: Color) {
        val list = savedColors.toMutableList()
        list.remove(color)
        savedColors = list
    }

    /*@OptIn(ExperimentalStdlibApi::class)
    fun getHexColor(): String {
        return "#${
            AndroidColor.HSVToColor(
                (alpha * 255).toInt(),
                floatArrayOf(color.first, color.second, color.third)
            ).toHexString(HexFormat.UpperCase)
        }"
    }*/

    internal fun getRGBColor(): AndroidColor {
        val color =
            AndroidColor.HSVToColor(
                floatArrayOf(
                    colorHueState,
                    colorSaturationState,
                    colorValueState
                )
            )
        val rgb = color.toColor()
        return rgb
    }

    companion object {
        internal fun Saver(): Saver<ColorPickerState, *> = Saver(
            save = { state ->
                ColorPickerStateData(
                    state.colorHueState,
                    state.colorSaturationState,
                    state.colorValueState,
                    state.alpha,
                    state.isSupportOpacity
                )
            },
            restore = { value ->
                ColorPickerState(
                    initialColor = Color.hsv(
                        value.colorHue,
                        value.colorSaturation,
                        value.colorValue,
                        value.alpha
                    ),
                    isSupportOpacity = value.isSupportOpacity
                )
            }
        )
    }

    internal data class ColorPickerStateData(
        val colorHue: Float,
        val colorSaturation: Float,
        val colorValue: Float,
        val alpha: Float,
        val isSupportOpacity: Boolean
    ) : Serializable {

        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (javaClass != other?.javaClass) return false

            other as ColorPickerStateData

            if (colorHue != other.colorHue) return false
            if (colorSaturation != other.colorSaturation) return false
            if (colorValue != other.colorValue) return false
            if (alpha != other.alpha) return false
            return isSupportOpacity == other.isSupportOpacity
        }

        override fun hashCode(): Int {
            var result = colorHue.hashCode()
            result = 31 * result + colorSaturation.hashCode()
            result = 31 * result + colorValue.hashCode()
            result = 31 * result + alpha.hashCode()
            result = 31 * result + isSupportOpacity.hashCode()
            return result
        }
    }
}

@Composable
fun rememberColorPickerState(
    initialColor: Color,
    isSupportOpacity: Boolean = false
): ColorPickerState {
    return rememberSaveable(
        inputs = arrayOf(isSupportOpacity),
        saver = ColorPickerState.Saver(),
        init = {
            ColorPickerState(
                initialColor = initialColor,
                isSupportOpacity = isSupportOpacity
            )
        }
    )
}