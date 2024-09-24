package io.github.madmaximuus.persian.timePicker.view.wheel

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.State
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.state38

object WheelTimePickerViewDefaults {

    @Composable
    fun colors(
        textColor: Color = PersianTheme.colorScheme.onSurface.state38,
        selectedTextColor: Color = PersianTheme.colorScheme.onSurface
    ): WheelTimePickerViewColors = WheelTimePickerViewColors(
        textColor = textColor,
        selectedTextColor = selectedTextColor
    )

    @Composable
    fun sizes(
        textStyle: TextStyle = PersianTheme.typography.titleMedium,
    ): WheelTimePickerViewSizes = WheelTimePickerViewSizes(
        textStyle = textStyle,
    )
}

@Immutable
class WheelTimePickerViewColors internal constructor(
    private val textColor: Color,
    private val selectedTextColor: Color,
) {

    @Composable
    internal fun textColor(selected: Boolean): State<Color> {
        val target = if (selected) selectedTextColor else textColor
        return rememberUpdatedState(newValue = target)
    }
}

@Immutable
class WheelTimePickerViewSizes internal constructor(
    internal val textStyle: TextStyle,
)