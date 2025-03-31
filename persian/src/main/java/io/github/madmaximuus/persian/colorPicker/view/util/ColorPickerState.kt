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
import io.github.madmaximuus.persian.colorPicker.view.util.ColorPickerState.Companion.Saver
import java.io.Serializable
import android.graphics.Color as AndroidColor

/**
 * A class representing the state of a color picker.
 *
 * This class manages the state of a color picker, including the selected color, display mode,
 * saturation, value, hue, alpha, and saved colors. It provides methods to manipulate the state
 * and retrieve the selected color in different formats.
 *
 * @param initialColor The initial color of the color picker.
 * @property isSupportOpacity A boolean indicating whether the color picker supports opacity.
 * @property mode The current display mode of the color picker.
 * @property colorSaturationState The current saturation value of the selected color.
 * @property colorValueState The current value (brightness) of the selected color.
 * @property colorHueState The current hue value of the selected color.
 * @property alpha The current alpha (opacity) value of the selected color.
 * @property savedColors The list of saved colors.
 * @property selectedColor The currently selected color in HSV format.
 */
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

    val selectedColor: Color
        get() = Color.hsv(colorHueState, colorSaturationState, colorValueState, alpha)

    /**
     * Change the color picker view mode to the spectrum display mode.
     */
    internal fun moveToSpectrum() {
        mode = ColorPickerDisplayMode.SPECTRUM
    }

    /**
     * Change the color picker view mode to the grid display mode.
     */
    internal fun moveToGrid() {
        mode = ColorPickerDisplayMode.GRID
    }

    /**
     * Change the color picker view mode to the sliders display mode.
     */
    internal fun moveToSliders() {
        mode = ColorPickerDisplayMode.SLIDERS
    }

    /**
     * Add the currently selected color to the list of saved colors.
     */
    internal fun saveColor() {
        val list = savedColors.toMutableList()
        list.add(list.size - 1, selectedColor.copy(alpha))
        savedColors = list
    }

    /**
     * Removes a color from the list of saved colors.
     *
     * @param color The color to be removed.
     */
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

    /**
     * Gets the currently selected color in RGB format.
     *
     * @return The currently selected color in RGB format.
     */
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

        /**
         * A saver for the [ColorPickerState] that allows saving and restoring the state.
         *
         * @return A [Saver] for the [ColorPickerState].
         */
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

    /**
     * A data class representing the state data of the color picker.
     *
     * @property colorHue The hue value of the selected color.
     * @property colorSaturation The saturation value of the selected color.
     * @property colorValue The value (brightness) of the selected color.
     * @property alpha The alpha (opacity) value of the selected color.
     * @property isSupportOpacity A boolean indicating whether the color picker supports opacity.
     */
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

/**
 * A composable function that creates and remembers a [ColorPickerState] instance.
 *
 * This function initializes and remembers a [ColorPickerState] instance with the provided initial color and opacity support flag.
 * The state is saved and restored using the [ColorPickerState.Saver] to ensure persistence across recompositions and configuration changes.
 *
 * @param initialColor The initial color of the color picker.
 * @param isSupportOpacity A boolean indicating whether the color picker supports opacity. Defaults to `false`.
 * @return A remembered [ColorPickerState] instance.
 */
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