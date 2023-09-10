package ru.rabbit.persian.navigationBar

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import ru.rabbit.persian.foundation.spacing
import ru.rabbit.persian.navigationBar.item.NavigationBarItemSizes
import ru.rabbit.persian.navigationBar.item.PersianNavigationBarItemSizes

@Immutable
data class NavigationBarSizes(
    val itemSizes: NavigationBarItemSizes,
    val paddingValues: PaddingValues,
    val itemCounts: Int
)

object PersianNavigationBarSizes {

    @Composable
    fun primary(
        itemCounts: Int = 4,
        itemSizes: NavigationBarItemSizes = PersianNavigationBarItemSizes.iconAndLabel(),
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
}