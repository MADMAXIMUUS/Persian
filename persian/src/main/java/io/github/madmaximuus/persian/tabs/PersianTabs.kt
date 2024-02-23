package io.github.madmaximuus.persian.tabs

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ScrollableTabRow
import androidx.compose.material3.TabRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp

@Composable
fun PersianFixedTabs(
    tabItems: List<TabItem>,
    modifier: Modifier = Modifier,
    colors: TabColors = PersianTabsDefaults.colors(),
    textStyle: TextStyle = MaterialTheme.typography.titleSmall,
    textOverflow: TextOverflow = TextOverflow.Ellipsis,
    onTabClicked: (tabItem: TabItem) -> Unit
) {
    validateTabItems(tabItems)
    val selectedTab = tabItems.firstOrNull { it.selected } ?: tabItems.first()
    val indexOfSelectedTab = tabItems.indexOf(selectedTab)
    val iconSide = tabItems[0].iconSide
    TabRow(
        selectedTabIndex = indexOfSelectedTab,
        containerColor = colors.backgroundColor,
        indicator = {
            PersianTabItemIndicator(
                it, indexOfSelectedTab, colors.indicatorColor
            )
        },
        modifier = modifier.height(getTabHeight())
    ) {
        tabItems.forEachIndexed { index, tabItem ->
            PersianTab(
                selectedTabIndex = indexOfSelectedTab,
                index = index,
                tabItem = tabItem,
                activeColor = colors.activeColor,
                disabledColor = colors.disabledColor,
                onTabClicked = onTabClicked,
                textStyle = textStyle,
                textOverflow = textOverflow,
                iconSide = iconSide
            )
        }
    }
}


@Composable
fun PersianScrollableTabs(
    tabItems: List<TabItem>,
    modifier: Modifier = Modifier,
    colors: TabColors = PersianTabsDefaults.colors(),
    textStyle: TextStyle = MaterialTheme.typography.titleSmall,
    textOverflow: TextOverflow = TextOverflow.Ellipsis,
    onTabClicked: (tabItem: TabItem) -> Unit
) {
    validateTabItems(tabItems)
    val selectedTab = tabItems.firstOrNull { it.selected } ?: tabItems.first()
    val indexOfSelectedTab = tabItems.indexOf(selectedTab)
    val iconSide = tabItems[0].iconSide

    Column(modifier = modifier) {
        ScrollableTabRow(
            selectedTabIndex = indexOfSelectedTab,
            containerColor = colors.backgroundColor,
            indicator = {
                PersianTabItemIndicator(
                    it,
                    indexOfSelectedTab,
                    colors.indicatorColor
                )
            },
            modifier = Modifier.height(getTabHeight())
        ) {
            tabItems.forEachIndexed { index, tabItem ->
                PersianTab(
                    selectedTabIndex = indexOfSelectedTab,
                    index = index,
                    tabItem = tabItem,
                    activeColor = colors.activeColor,
                    disabledColor = colors.disabledColor,
                    onTabClicked = onTabClicked,
                    textStyle = textStyle,
                    textOverflow = textOverflow,
                    iconSide = iconSide
                )
            }
        }
    }
}

private fun getTabHeight() = 64.dp

private fun validateTabItems(tabItems: List<TabItem>) {
    if (tabItems.size < 2) {
        throw IllegalArgumentException("tabItems must have at least 2 items")
    }
}