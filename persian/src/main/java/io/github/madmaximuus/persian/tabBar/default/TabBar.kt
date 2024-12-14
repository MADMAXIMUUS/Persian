package io.github.madmaximuus.persian.tabBar.default

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import io.github.madmaximuus.persian.counter.utils.BadgeStyle
import io.github.madmaximuus.persian.divider.Divider
import io.github.madmaximuus.persian.tabBar.TabBarDefaults
import io.github.madmaximuus.persian.tabBar.TabColors
import io.github.madmaximuus.persian.tabBar.TabSizes
import io.github.madmaximuus.persian.tabBar.indicator.Indicator
import io.github.madmaximuus.persian.tabBar.indicator.TabIndicatorScope
import io.github.madmaximuus.persian.tabBar.scrollable.ScrollableTabBar
import io.github.madmaximuus.persian.tabBar.tab.IconSide
import io.github.madmaximuus.persian.tabBar.tab.Tab
import io.github.madmaximuus.persian.tabBar.tab.TabBarItemScope

/**
 * Primary tabs are placed at the top of the content pane under a top app bar. They display the main
 * content destinations. Fixed tabs display all tabs in a set simultaneously. They are best for
 * switching between related content quickly, such as between transportation methods in a map. To
 * navigate between fixed tabs, tap an individual tab, or swipe left or right in the content area.
 *
 * A TabRow contains a row of [Tab]s, and displays an indicator underneath the currently selected
 * tab. A TabRow places its tabs evenly spaced along the entire row, with each tab taking up an
 * equal amount of space. See [ScrollableTabBar] for a tab row that does not enforce equal
 * size, and allows scrolling to tabs that do not fit on screen.
 *
 * @param selectedTabIndex the index of the currently selected tab
 * @param modifier the [Modifier] to be applied to this tab row
 * @param colors the [TabColors] colors that used by tabs
 * @param sizes the [TabSizes] sizes that used by tabs
 * @param iconSide The optional [IconSide] that determines whether the icons are displayed above or below the text in the tabs.
 * @param badgeStyle The optional [BadgeStyle] that determines the style of the badges that are displayed in the tabs.
 * @param indicator the indicator that represents which tab is currently selected. By default this
 *   will be a [Indicator], using a [Modifier.tabIndicatorOffset]
 *   modifier to animate its position.
 * @param divider the divider displayed at the bottom of the tab row. This provides a layer of
 *   separation between the tab row and the content displayed underneath.
 * @param tabs the tabs inside this tab row. Typically this will be multiple [Tab]s. Each element
 *   inside this lambda will be measured and placed evenly across the row, each taking up equal
 *   space.
 */
@Composable
fun TabBar(
    selectedTabIndex: Int,
    modifier: Modifier = Modifier,
    indicator: @Composable TabIndicatorScope.() -> Unit = {
        Indicator(
            modifier = Modifier.tabIndicatorOffset(selectedTabIndex, matchContentSize = true)
        )
    },
    colors: TabColors = TabBarDefaults.tabColors(),
    sizes: TabSizes = TabBarDefaults.tabSizes(),
    iconSide: IconSide = IconSide.TOP,
    badgeStyle: BadgeStyle = BadgeStyle.NUMBER,
    divider: @Composable () -> Unit = @Composable { Divider() },
    tabs: @Composable TabBarItemScope.() -> Unit
) {
    TabRowImpl(
        modifier = modifier,
        colors = colors,
        sizes = sizes,
        iconSide = iconSide,
        badgeStyle = badgeStyle,
        indicator = indicator,
        divider = divider,
        tabs = tabs
    )
}