package io.github.madmaximuus.persian.checkboxes

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import io.github.madmaximuus.persian.checkboxes.toggle.PersianCheckboxToggleColors
import io.github.madmaximuus.persian.foundation.extendedColorScheme

@Immutable
data class CheckboxColors(
    val toggleColor: androidx.compose.material3.CheckboxColors,
    val textColor: Color
)

object PersianCheckboxColors {

    @Composable
    fun primary(
        toggleColor: androidx.compose.material3.CheckboxColors = PersianCheckboxToggleColors.primary(),
        textColor: Color = MaterialTheme.extendedColorScheme.onSurface
    ) = remember(
        toggleColor,
        textColor
    ) {
        CheckboxColors(
            toggleColor = toggleColor,
            textColor = textColor
        )
    }
}