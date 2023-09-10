package ru.rabbit.persian.tabs

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

object PersianTabs {

    @Composable
    fun Fixed(
        tabItems: List<TabItem>,
        modifier: Modifier = Modifier,
        colors: TabColors = PersianTabsColors.primary(),
        textStyle: TextStyle = MaterialTheme.typography.titleSmall,
        textOverflow: TextOverflow = TextOverflow.Ellipsis,
        onTabClicked: (tabItem: TabItem) -> Unit
    ) {
        validateTabItems(tabItems)
        val selectedTab = tabItems.firstOrNull { it.selected } ?: tabItems.first()
        val indexOfSelectedTab = tabItems.indexOf(selectedTab)

        TabRow(
            selectedTabIndex = indexOfSelectedTab,
            containerColor = colors.backgroundColor,
            indicator = {
                PersianTabItemIndicator(
                    it, indexOfSelectedTab, colors.indicatorColor
                )
            },
            modifier = modifier.height(getTabHeight(tabItems))
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
                    textOverflow = textOverflow
                )
            }
        }
    }


    @Composable
    fun Scrollable(
        tabItems: List<TabItem>,
        modifier: Modifier = Modifier,
        colors: TabColors = PersianTabsColors.primary(),
        textStyle: TextStyle = MaterialTheme.typography.titleSmall,
        textOverflow: TextOverflow = TextOverflow.Ellipsis,
        onTabClicked: (tabItem: TabItem) -> Unit
    ) {
        validateTabItems(tabItems)
        val selectedTab = tabItems.firstOrNull { it.selected } ?: tabItems.first()
        val indexOfSelectedTab = tabItems.indexOf(selectedTab)

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
                modifier = Modifier.height(getTabHeight(tabItems))
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
                        textOverflow = textOverflow
                    )
                }
            }
        }
    }

    private fun getTabHeight(list: List<TabItem>) =
        if (list.any { it.topIcon }) 64.dp else 48.dp

    private fun validateTabItems(tabItems: List<TabItem>) {
        if (tabItems.size < 2) {
            throw IllegalArgumentException("tabItems must have at least 2 items")
        }
    }
}