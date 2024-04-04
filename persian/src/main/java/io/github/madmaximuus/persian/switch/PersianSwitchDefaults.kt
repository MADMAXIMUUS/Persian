package io.github.madmaximuus.persian.switch

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SwitchDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import io.github.madmaximuus.persian.foundation.extendedColorScheme
import io.github.madmaximuus.persian.foundation.state12
import io.github.madmaximuus.persian.foundation.state38

object PersianSwitchDefaults {

    @Composable
    fun colors(
        checkedThumbColor: Color = MaterialTheme.extendedColorScheme.onPrimary,
        checkedTrackColor: Color = MaterialTheme.extendedColorScheme.primary,
        checkedBorderColor: Color = MaterialTheme.extendedColorScheme.primary,
        checkedIconColor: Color = MaterialTheme.extendedColorScheme.onPrimaryContainer,
        uncheckedThumbColor: Color = MaterialTheme.extendedColorScheme.onPrimaryContainer,
        uncheckedTrackColor: Color = MaterialTheme.extendedColorScheme.surface4,
        uncheckedBorderColor: Color = MaterialTheme.extendedColorScheme.primary,
        uncheckedIconColor: Color = MaterialTheme.extendedColorScheme.onPrimary,
        disabledCheckedThumbColor: Color = MaterialTheme.extendedColorScheme.surface,
        disabledCheckedTrackColor: Color = MaterialTheme.extendedColorScheme.onSurface.state12,
        disabledCheckedBorderColor: Color = MaterialTheme.extendedColorScheme.onSurface.state12,
        disabledCheckedIconColor: Color = MaterialTheme.extendedColorScheme.onPrimaryContainer.state38,
        disabledUncheckedThumbColor: Color = MaterialTheme.extendedColorScheme.surface,
        disabledUncheckedTrackColor: Color = MaterialTheme.extendedColorScheme.onSurface.state12,
        disabledUncheckedBorderColor: Color = MaterialTheme.extendedColorScheme.onSurface.state12,
        disabledUncheckedIconColor: Color = MaterialTheme.extendedColorScheme.onSurface.state38,
    ) = SwitchDefaults.colors(
        checkedThumbColor = checkedThumbColor,
        checkedTrackColor = checkedTrackColor,
        checkedBorderColor = checkedBorderColor,
        checkedIconColor = checkedIconColor,
        uncheckedThumbColor = uncheckedThumbColor,
        uncheckedTrackColor = uncheckedTrackColor,
        uncheckedBorderColor = uncheckedBorderColor,
        uncheckedIconColor = uncheckedIconColor,
        disabledCheckedThumbColor = disabledCheckedThumbColor,
        disabledCheckedTrackColor = disabledCheckedTrackColor,
        disabledCheckedBorderColor = disabledCheckedBorderColor,
        disabledCheckedIconColor = disabledCheckedIconColor,
        disabledUncheckedBorderColor = disabledUncheckedBorderColor,
        disabledUncheckedIconColor = disabledUncheckedIconColor,
        disabledUncheckedThumbColor = disabledUncheckedThumbColor,
        disabledUncheckedTrackColor = disabledUncheckedTrackColor
    )
}