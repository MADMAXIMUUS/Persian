package io.github.madmaximuus.persian.navigationBar

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import io.github.madmaximuus.persian.foundation.PersianTheme

object PersianNavigationBarDefault {

    @Composable
    fun colors(
        backgroundColor: Color = PersianTheme.colorScheme.surface2,
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
        textStyle: TextStyle = PersianTheme.typography.labelMedium,
        paddingValues: PaddingValues = PaddingValues(
            horizontal = PersianTheme.spacing.size8,
            vertical = PersianTheme.spacing.size4
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
        iconColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        selectedIconColor: Color = PersianTheme.colorScheme.onSecondaryContainer,
        textColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        selectedTextColor: Color = PersianTheme.colorScheme.onSurface,
        selectedBackgroundColor: Color = PersianTheme.colorScheme.secondaryContainer,
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