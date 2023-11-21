package io.github.madmaximuus.persian.navigationBar

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.PersianContentStateDisabled
import io.github.madmaximuus.persian.foundation.elevation
import io.github.madmaximuus.persian.foundation.extendedColorScheme
import io.github.madmaximuus.persian.foundation.spacing
import io.github.madmaximuus.persian.foundation.surfaceColorAtElevation

object PersianNavigationBarDefault {

    @Composable
    fun colors(
        backgroundColor: Color = MaterialTheme.extendedColorScheme
            .surfaceColorAtElevation(MaterialTheme.elevation.small),
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
        itemSizes: NavigationBarItemSizes = withLabelItemSizes(),
        paddingValues: PaddingValues = PaddingValues(
            horizontal = MaterialTheme.spacing.small,
            vertical = MaterialTheme.spacing.extraSmall
        )
    ) = remember(
        itemCounts,
        itemSizes,
        paddingValues
    ) {
        NavigationBarSizes(
            itemSizes = itemSizes,
            itemCounts = itemCounts,
            paddingValues = paddingValues
        )
    }

    @Composable
    fun itemColor(
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

    @Composable
    fun withLabelItemSizes(
        textStyle: TextStyle = MaterialTheme.typography.labelMedium,
        paddingValues: PaddingValues = PaddingValues(
            horizontal = 0.dp,
            vertical = 4.dp
        )
    ) = remember(textStyle, paddingValues) {
        NavigationBarItemSizes(
            textStyle = textStyle,
            paddingValues = paddingValues
        )
    }

    @Composable
    fun onlyIconItemSizes(
        textStyle: TextStyle = MaterialTheme.typography.labelMedium,
        paddingValues: PaddingValues = PaddingValues(
            horizontal = 0.dp,
            vertical = 12.dp
        )
    ) = remember(textStyle, paddingValues) {
        NavigationBarItemSizes(
            textStyle = textStyle,
            paddingValues = paddingValues
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
    val itemSizes: NavigationBarItemSizes,
    val paddingValues: PaddingValues,
    val itemCounts: Int
)

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

@Immutable
data class NavigationBarItemSizes(
    val textStyle: TextStyle,
    val paddingValues: PaddingValues
)