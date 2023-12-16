package io.github.madmaximuus.persian.navigationBar

import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import io.github.madmaximuus.persian.foundation.elevation
import io.github.madmaximuus.persian.iconBox.PersianIconBox

data class NavigationBarItem(
    val selected: Boolean = false,
    val icon: Painter,
    val selectedIcon: Painter,
    val text: String,
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
    NavigationBar(
        modifier = modifier,
        containerColor = colors.backgroundColor,
        windowInsets = windowInsets,
        tonalElevation = MaterialTheme.elevation.small,
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
                    disabledIconColor = colors.itemColors.disabledIconColor,
                    disabledTextColor = colors.itemColors.disabledTextColor
                ),
                icon = {
                    val iconColor = if (item.selected) colors.itemColors.selectedIconColor
                    else colors.itemColors.iconColor
                    CompositionLocalProvider(
                        LocalContentColor provides iconColor
                    ) {}
                    if (item.selected)
                        PersianIconBox(icon = item.selectedIcon)
                    else
                        PersianIconBox(icon = item.icon)

                },
                label = {
                    Text(
                        text = item.text,
                        style = sizes.itemSizes.textStyle,
                    )
                },
                alwaysShowLabel = true,
                onClick = { item.onClick() }
            )
        }
    }
}