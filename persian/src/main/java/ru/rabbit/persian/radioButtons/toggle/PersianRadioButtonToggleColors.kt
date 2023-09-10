package ru.rabbit.persian.radioButtons.toggle

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import ru.rabbit.persian.foundation.PersianStatesDisabled
import ru.rabbit.persian.foundation.extendedColorScheme

object PersianRadioButtonToggleColors {

    @Composable
    fun primary(
        selectedColor: Color = MaterialTheme.extendedColorScheme.primary,
        unselectedColor: Color = MaterialTheme.extendedColorScheme.outline,
        disabledSelectedColor: Color = MaterialTheme.extendedColorScheme.onSurface
            .copy(PersianStatesDisabled),
        disabledUnselectedColor: Color = MaterialTheme.extendedColorScheme.onSurface
            .copy(PersianStatesDisabled)
    ) = RadioButtonDefaults
        .colors(
            selectedColor = selectedColor,
            unselectedColor = unselectedColor,
            disabledSelectedColor = disabledSelectedColor,
            disabledUnselectedColor = disabledUnselectedColor,
        )
}