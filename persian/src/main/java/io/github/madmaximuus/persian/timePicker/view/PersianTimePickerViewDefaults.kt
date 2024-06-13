package io.github.madmaximuus.persian.timePicker.view

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.State
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.Color
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.state38

object PersianTimePickerViewDefaults {

    @Composable
    fun colors(
        textColor: Color = PersianTheme.colorScheme.onSurface.state38,
        selectedTextColor: Color = PersianTheme.colorScheme.onSurface
    ): TimePickerViewColors = TimePickerViewColors(
        textColor = textColor,
        selectedTextColor = selectedTextColor
    )
}

@Immutable
class TimePickerViewColors internal constructor(
    private val textColor: Color,
    private val selectedTextColor: Color,
) {

    @Composable
    internal fun textColor(selected: Boolean): State<Color> {
        val target = if (selected) selectedTextColor else textColor
        return rememberUpdatedState(newValue = target)
    }
}