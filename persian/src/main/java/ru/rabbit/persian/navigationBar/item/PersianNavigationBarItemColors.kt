package ru.rabbit.persian.navigationBar.item

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import ru.rabbit.persian.foundation.PersianContentStateDisabled
import ru.rabbit.persian.foundation.extendedColorScheme

@Immutable
data class NavigationBarItemColors(
    val iconColor: Color,
    val selectedIconColor: Color,
    val textColor: Color,
    val selectedTextColor: Color,
    val selectedBackgroundColor: Color,
    val disabledIconColor: Color,
    val disabledTextColor: Color
)

object PersianNavigationBarItemColors {

    @Composable
    fun primary(
        iconColor: Color = MaterialTheme.extendedColorScheme.onSurfaceVariant,
        selectedIconColor: Color = MaterialTheme.extendedColorScheme.onPrimaryContainer,
        textColor: Color = MaterialTheme.extendedColorScheme.onSurfaceVariant,
        selectedTextColor: Color = MaterialTheme.extendedColorScheme.onSurface,
        selectedBackgroundColor: Color = MaterialTheme.extendedColorScheme.secondaryContainer,
        disabledTextColor: Color = MaterialTheme.extendedColorScheme.onSurfaceVariant
            .copy(PersianContentStateDisabled),
        disabledIconColor: Color = MaterialTheme.extendedColorScheme.onSurfaceVariant
            .copy(PersianContentStateDisabled),
    ) = remember(
        iconColor,
        selectedIconColor,
        textColor,
        selectedTextColor,
        selectedBackgroundColor,
        disabledIconColor,
        disabledTextColor
    ) {
        NavigationBarItemColors(
            iconColor = iconColor,
            selectedIconColor = selectedIconColor,
            textColor = textColor,
            selectedTextColor = selectedTextColor,
            selectedBackgroundColor = selectedBackgroundColor,
            disabledIconColor = disabledIconColor,
            disabledTextColor = disabledTextColor
        )
    }

}