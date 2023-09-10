package ru.rabbit.persian.checkboxes.toggle

import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import ru.rabbit.persian.foundation.PersianStatesDisabled
import ru.rabbit.persian.foundation.extendedColorScheme

object PersianCheckboxToggleColors {

    @Composable
    fun primary(
        checkedColor: Color = MaterialTheme.extendedColorScheme.primary,
        uncheckedColor: Color = MaterialTheme.extendedColorScheme.outline,
        checkmarkColor: Color = MaterialTheme.extendedColorScheme.surface,
        disabledCheckedColor: Color = MaterialTheme.extendedColorScheme.onSurface
            .copy(PersianStatesDisabled),
        disabledUncheckedColor: Color = MaterialTheme.extendedColorScheme.onSurface
            .copy(PersianStatesDisabled),
        disabledIndeterminateColor: Color = disabledCheckedColor
    ) = CheckboxDefaults
        .colors(
            checkedColor = checkedColor,
            uncheckedColor = uncheckedColor,
            checkmarkColor = checkmarkColor,
            disabledCheckedColor = disabledCheckedColor,
            disabledUncheckedColor = disabledUncheckedColor,
            disabledIndeterminateColor = disabledIndeterminateColor
        )
}