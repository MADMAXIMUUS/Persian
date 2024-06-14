package io.github.madmaximuus.persian.navigationBar

import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.counter.PersianBadge
import io.github.madmaximuus.persian.counter.PersianCounterDefaults
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.icon.Icon

data class NavigationBarItem(
    val selected: Boolean,
    val icon: Painter,
    val selectedIcon: Painter,
    val text: String? = null,
    val badgeCount: Int = 0,
    val onClick: () -> Unit
)

@Composable
fun PersianNavigationBar(
    actions: List<NavigationBarItem>,
    modifier: Modifier = Modifier,
    windowInsets: WindowInsets = BottomAppBarDefaults.windowInsets,
    colors: NavigationBarColors = PersianNavigationBarDefault.colors(),
    sizes: NavigationBarSizes = PersianNavigationBarDefault.sizes()
) {
    require(actions.all { it.text != null } || actions.all { it.text == null }) {
        throw IllegalArgumentException("All items must have a text or none must have one.")
    }
    NavigationBar(
        modifier = modifier,
        containerColor = colors.backgroundColor,
        windowInsets = windowInsets,
        tonalElevation = PersianTheme.elevation.small,
    ) {
        actions.forEach { item ->
            NavigationBarItem(
                selected = item.selected,
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = colors.itemColors.selectedIconColor,
                    unselectedIconColor = colors.itemColors.iconColor,
                    unselectedTextColor = colors.itemColors.textColor,
                    selectedTextColor = colors.itemColors.selectedTextColor,
                    indicatorColor = colors.itemColors.selectedBackgroundColor,
                ),
                icon = {
                    if (item.badgeCount > 0) {
                        PersianBadge(
                            count = item.badgeCount,
                            sizes = PersianCounterDefaults.sizes(
                                badgeHorizontalOffset = (-16).dp
                            )
                        ) {
                            if (item.selected)
                                Icon(painter = item.selectedIcon)
                            else
                                Icon(painter = item.icon)
                        }
                    } else {
                        val iconColor = if (item.selected) colors.itemColors.selectedIconColor
                        else colors.itemColors.iconColor
                        CompositionLocalProvider(
                            LocalContentColor provides iconColor
                        ) {
                            if (item.selected)
                                Icon(painter = item.selectedIcon)
                            else
                                Icon(painter = item.icon)
                        }
                    }
                },
                label = item.text?.let { text ->
                    {
                        Text(
                            text = text,
                            style = sizes.textStyle,
                        )
                    }
                },
                alwaysShowLabel = true,
                onClick = { item.onClick() }
            )
        }
    }
}