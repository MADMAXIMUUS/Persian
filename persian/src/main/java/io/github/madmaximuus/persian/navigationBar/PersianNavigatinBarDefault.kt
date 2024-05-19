package io.github.madmaximuus.persian.navigationBar

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import io.github.madmaximuus.persian.foundation.extendedColorScheme
import io.github.madmaximuus.persian.foundation.spacing

object PersianNavigationBarDefault {

    @Composable
    fun colors(
        backgroundColor: Color = MaterialTheme.extendedColorScheme.surface2,
        itemColors: NavigationBarItemColors = itemColor()
    ) = remember(
        itemColors,
        backgroundColor
    ) {
        NavigationBarColors(
            itemColors = itemColors,
            backgroundColor = backgroundColor
        )
    }

    @Composable
    fun sizes(
        itemCounts: Int = 4,
        textStyle: TextStyle = MaterialTheme.typography.labelMedium,
        paddingValues: PaddingValues = PaddingValues(
            horizontal = MaterialTheme.spacing.small,
            vertical = MaterialTheme.spacing.extraSmall
        )
    ) = remember(
        itemCounts,
        paddingValues,
        textStyle
    ) {
        NavigationBarSizes(
            itemCounts = itemCounts,
            paddingValues = paddingValues,
            textStyle = textStyle
        )
    }

    @Composable
    fun itemColor(
        iconColor: Color = MaterialTheme.extendedColorScheme.onSurfaceVariant,
        selectedIconColor: Color = MaterialTheme.extendedColorScheme.onSecondaryContainer,
        textColor: Color = MaterialTheme.extendedColorScheme.onSurfaceVariant,
        selectedTextColor: Color = MaterialTheme.extendedColorScheme.onSurface,
        selectedBackgroundColor: Color = MaterialTheme.extendedColorScheme.secondaryContainer,
    ) = remember(
        iconColor,
        selectedIconColor,
        textColor,
        selectedTextColor,
        selectedBackgroundColor,
    ) {
        NavigationBarItemColors(
            iconColor = iconColor,
            selectedIconColor = selectedIconColor,
            textColor = textColor,
            selectedTextColor = selectedTextColor,
            selectedBackgroundColor = selectedBackgroundColor,
        )
    }
}

@Immutable
data class NavigationBarColors(
    val itemColors: NavigationBarItemColors,
    val backgroundColor: Color
)

@Immutable
data class NavigationBarSizes(
    val paddingValues: PaddingValues,
    val itemCounts: Int,
    val textStyle: TextStyle
)

@Immutable
data class NavigationBarItemColors(
    val iconColor: Color,
    val selectedIconColor: Color,
    val textColor: Color,
    val selectedTextColor: Color,
    val selectedBackgroundColor: Color,
)