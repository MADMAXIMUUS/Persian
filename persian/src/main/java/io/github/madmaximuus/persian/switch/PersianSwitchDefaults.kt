package io.github.madmaximuus.persian.switch

import androidx.compose.material3.SwitchDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.state12
import io.github.madmaximuus.persian.foundation.state38

object PersianSwitchDefaults {

    @Composable
    fun colors(
        checkedThumbColor: Color = PersianTheme.colorScheme.onPrimary,
        checkedTrackColor: Color = PersianTheme.colorScheme.primary,
        checkedBorderColor: Color = PersianTheme.colorScheme.primary,
        checkedIconColor: Color = PersianTheme.colorScheme.onPrimaryContainer,
        uncheckedThumbColor: Color = PersianTheme.colorScheme.onPrimaryContainer,
        uncheckedTrackColor: Color = PersianTheme.colorScheme.surface4,
        uncheckedBorderColor: Color = PersianTheme.colorScheme.primary,
        uncheckedIconColor: Color = PersianTheme.colorScheme.onPrimary,
        disabledCheckedThumbColor: Color = PersianTheme.colorScheme.surface,
        disabledCheckedTrackColor: Color = PersianTheme.colorScheme.onSurface.state12,
        disabledCheckedBorderColor: Color = PersianTheme.colorScheme.onSurface.state12,
        disabledCheckedIconColor: Color = PersianTheme.colorScheme.onPrimaryContainer.state38,
        disabledUncheckedThumbColor: Color = PersianTheme.colorScheme.surface,
        disabledUncheckedTrackColor: Color = PersianTheme.colorScheme.onSurface.state12,
        disabledUncheckedBorderColor: Color = PersianTheme.colorScheme.onSurface.state12,
        disabledUncheckedIconColor: Color = PersianTheme.colorScheme.onSurface.state38,
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