package io.github.madmaximuus.persian.navigationBar

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import io.github.madmaximuus.persian.foundation.elevation
import io.github.madmaximuus.persian.foundation.extendedColorScheme
import io.github.madmaximuus.persian.foundation.surfaceColorAtElevation
import io.github.madmaximuus.persian.navigationBar.item.NavigationBarItemColors
import io.github.madmaximuus.persian.navigationBar.item.PersianNavigationBarItemColors

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