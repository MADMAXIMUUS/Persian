package ru.rabbit.persian.navigationBar

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import ru.rabbit.persian.foundation.elevation
import ru.rabbit.persian.foundation.extendedColorScheme
import ru.rabbit.persian.foundation.surfaceColorAtElevation
import ru.rabbit.persian.navigationBar.item.NavigationBarItemColors
import ru.rabbit.persian.navigationBar.item.PersianNavigationBarItemColors

@Immutable
data class NavigationBarColors(
    val itemColors: NavigationBarItemColors,
    val backgroundColor: Color
)

object PersianNavigationBarColors {

    @Composable
    fun primary(
        backgroundColor: Color = MaterialTheme.extendedColorScheme
            .surfaceColorAtElevation(MaterialTheme.elevation.small),
        itemColors: NavigationBarItemColors = PersianNavigationBarItemColors.primary()
    ) = remember(
        itemColors,
        backgroundColor
    ) {
        NavigationBarColors(
            itemColors = itemColors,
            backgroundColor = backgroundColor
        )
    }
}