package io.github.madmaximuus.persian.tabBar.scrollable

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import io.github.madmaximuus.persian.dividers.FullWidthHorizontalDivider
import io.github.madmaximuus.persian.tabBar.TabBarDefaults
import io.github.madmaximuus.persian.tabBar.TabColors
import io.github.madmaximuus.persian.tabBar.TabSizes
import io.github.madmaximuus.persian.tabBar.default.TabBar
import io.github.madmaximuus.persian.tabBar.indicator.Indicator
import io.github.madmaximuus.persian.tabBar.indicator.TabIndicatorScope
import io.github.madmaximuus.persian.tabBar.tab.IconSide
import io.github.madmaximuus.persian.tabBar.tab.Tab
import io.github.madmaximuus.persian.tabBar.tab.TabBarItemScope

/**
 * Primary tabs are placed at the top of the content pane under a top app bar. They display the main
 * content destinations. When a set of tabs cannot fit on screen, use scrollable tabs. Scrollable
 * tabs can use longer text labels and a larger number of tabs. They are best used for browsing on
 * touch interfaces.
 *
 * A scrollable tab row contains a row of [Tab]s, and displays an indicator underneath the currently
 * selected tab. A scrollable tab row places its tabs offset from the starting edge, and allows
 * scrolling to tabs that are placed off screen. For a fixed tab row that does not allow scrolling,
 * and evenly places its tabs, see [TabBar].
 *
 * @param selectedTabIndex the index of the currently selected tab
 * @param modifier the [Modifier] to be applied to this tab row
 * @param scrollState the [ScrollState] of this tab row
 * @param colors the [TabColors] colors that used by tabs
 * @param sizes the [TabSizes] sizes that used by tabs
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
fun ScrollableTabBar(
    selectedTabIndex: Int,
    modifier: Modifier = Modifier,
    scrollState: ScrollState = rememberScrollState(),
    iconSide: IconSide = IconSide.TOP,
    colors: TabColors = TabBarDefaults.tabColors(),
    sizes: TabSizes = TabBarDefaults.tabSizes(),
    indicator: @Composable TabIndicatorScope.() -> Unit =
        @Composable {
            Indicator(
                Modifier.tabIndicatorOffset(selectedTabIndex, matchContentSize = true),
            )
        },
    divider: @Composable () -> Unit = @Composable { FullWidthHorizontalDivider() },
    tabs: @Composable TabBarItemScope.() -> Unit
) {
    ScrollableTabRowImpl(
        selectedTabIndex = selectedTabIndex,
        indicator = indicator,
        modifier = modifier,
        iconSide = iconSide,
        colors = colors,
        sizes = sizes,
        divider = divider,
        tabs = tabs,
        scrollState = scrollState,
    )
}