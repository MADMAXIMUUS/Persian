package io.github.madmaximuus.persian.navigationBar

import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.tooling.preview.Preview
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.elevation
import io.github.madmaximuus.persian.foundation.icons
import io.github.madmaximuus.persian.iconBox.PersianIconBox
import io.github.madmaximuus.persian.iconBox.PersianIconBoxColors

data class NavigationBarItem(
    val selected: Boolean = false,
    val icon: Painter,
    val selectedIcon: Painter,
    val text: String,
    val onClick: () -> Unit
)

object PersianNavigationBar {

    @Composable
    fun Primary(
        actions: List<NavigationBarItem>,
        modifier: Modifier = Modifier,
        windowInsets: WindowInsets = BottomAppBarDefaults.windowInsets,
        colors: NavigationBarColors = PersianNavigationBarColors.primary(),
        sizes: NavigationBarSizes = PersianNavigationBarSizes.primary()
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
                        if (item.selected) {
                            PersianIconBox.Primary(
                                icon = item.selectedIcon,
                                colors = PersianIconBoxColors.primary(
                                    defaultColor = colors.itemColors.selectedIconColor
                                )
                            )
                        } else {
                            PersianIconBox.Primary(
                                icon = item.icon,
                                colors = PersianIconBoxColors.primary(
                                    defaultColor = colors.itemColors.iconColor
                                )
                            )
                        }
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
}

@Preview
@Composable
fun BottomNavigationPreview() {
    PersianTheme {
        Surface {
            PersianNavigationBar.Primary(
                actions = listOf(
                    NavigationBarItem(
                        selected = true,
                        icon = MaterialTheme.icons.homeOutlined,
                        selectedIcon = MaterialTheme.icons.homeFilled,
                        text = "Feed",
                        onClick = {}
                    ),
                    NavigationBarItem(
                        selected = false,
                        icon = MaterialTheme.icons.searchOutlined,
                        selectedIcon = MaterialTheme.icons.searchFilled,
                        text = "Search",
                        onClick = {}
                    ),
                    NavigationBarItem(
                        selected = false,
                        icon = MaterialTheme.icons.mailOutlined,
                        selectedIcon = MaterialTheme.icons.mailFilled,
                        text = "Messages",
                        onClick = {}
                    ),
                    NavigationBarItem(
                        selected = false,
                        icon = MaterialTheme.icons.personOutlined,
                        selectedIcon = MaterialTheme.icons.personFilled,
                        text = "Profile",
                        onClick = {}
                    ),
                )
            )
        }
    }
}