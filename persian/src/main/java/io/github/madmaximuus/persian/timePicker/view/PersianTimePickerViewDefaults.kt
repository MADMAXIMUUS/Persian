package io.github.madmaximuus.persian.timePicker.view

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.State
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.Color
import io.github.madmaximuus.persian.foundation.PersianContentStateDisabled
import io.github.madmaximuus.persian.foundation.extendedColorScheme

object PersianTimePickerViewDefaults {

    @Composable
    fun colors(
        textColor: Color = MaterialTheme.extendedColorScheme.onSurface.copy(
            alpha = PersianContentStateDisabled
        ),
        selectedTextColor: Color = MaterialTheme.extendedColorScheme.onSurface
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