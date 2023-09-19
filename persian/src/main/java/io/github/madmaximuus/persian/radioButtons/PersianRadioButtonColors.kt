package io.github.madmaximuus.persian.radioButtons

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import io.github.madmaximuus.persian.foundation.extendedColorScheme
import io.github.madmaximuus.persian.radioButtons.toggle.PersianRadioButtonToggleColors

@Immutable
data class RadioButtonColors(
    val toggleColor: androidx.compose.material3.RadioButtonColors,
    val textColor: Color
)

object PersianRadioButtonColors {

    @Composable
    fun primary(
        toggleColor: androidx.compose.material3.RadioButtonColors = PersianRadioButtonToggleColors.primary(),
        textColor: Color = MaterialTheme.extendedColorScheme.onSurface
    ) = remember(
        toggleColor,
        textColor
    ) {
        RadioButtonColors(
            toggleColor = toggleColor,
            textColor = textColor
        )
    }
}