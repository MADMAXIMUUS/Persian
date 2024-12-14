package io.github.madmaximuus.persian.timePicker.view.wheel

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.State
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.state38

/**
 * Contains all default values used by [WheelTimePickerView].
 */
object WheelTimePickerViewDefaults {

    /**
     * Create and return a [WheelTimePickerViewColors] instance with the specified colors.
     *
     * @param textColor The default text color for the items in the wheel time picker.
     * @param selectedTextColor The text color for the selected item in the wheel time picker.
     */
    @Composable
    fun colors(
        textColor: Color = PersianTheme.colorScheme.onSurface.state38,
        selectedTextColor: Color = PersianTheme.colorScheme.onSurface
    ): WheelTimePickerViewColors =
        WheelTimePickerViewColors(
            textColor = textColor,
            selectedTextColor = selectedTextColor
        )

    /**
     * Create and return a [WheelTimePickerViewSizes] instance with the specified text style.
     *
     * @param textStyle The text style to use for the items in the wheel time picker.
     */
    @Composable
    fun sizes(
        textStyle: TextStyle = PersianTheme.typography.labelLarge,
    ): WheelTimePickerViewSizes =
        WheelTimePickerViewSizes(
            textStyle = textStyle
        )
}

/**
 * Immutable class representing the colors for the wheel time picker view.
 *
 * This class holds the text colors to be used for the items in the wheel time picker,
 * including the default text color and the selected text color.
 *
 * @param textColor The default text color for the items in the wheel time picker.
 * @param selectedTextColor The text color for the selected item in the wheel time picker.
 */
@Immutable
class WheelTimePickerViewColors internal constructor(
    private val textColor: Color,
    private val selectedTextColor: Color,
) {
    /**
     * Composable function to get the text color based on the selected state.
     *
     * @param selected Whether the item is selected.
     */
    @Composable
    internal fun textColor(selected: Boolean): State<Color> {
        val target = if (selected) selectedTextColor else textColor
        return rememberUpdatedState(newValue = target)
    }
}

/**
 * Immutable class representing the sizes and styles for the wheel time picker view.
 *
 * This class holds the text style to be used for the items in the wheel time picker.
 *
 * @param textStyle The text style to use for the items in the wheel time picker.
 */
@Immutable
class WheelTimePickerViewSizes internal constructor(
    internal val textStyle: TextStyle,
)