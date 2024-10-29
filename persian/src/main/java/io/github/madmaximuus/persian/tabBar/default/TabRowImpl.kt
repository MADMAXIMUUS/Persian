package io.github.madmaximuus.persian.tabBar.default

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.Measurable
import androidx.compose.ui.layout.MeasureResult
import androidx.compose.ui.layout.MeasureScope
import androidx.compose.ui.layout.layout
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.fastFold
import androidx.compose.ui.util.fastForEach
import androidx.compose.ui.util.fastForEachIndexed
import androidx.compose.ui.util.fastMap
import io.github.madmaximuus.persian.surface.Surface
import io.github.madmaximuus.persian.tabBar.TabColors
import io.github.madmaximuus.persian.tabBar.TabSizes
import io.github.madmaximuus.persian.tabBar.indicator.TabIndicatorModifier
import io.github.madmaximuus.persian.tabBar.indicator.TabIndicatorScope
import io.github.madmaximuus.persian.tabBar.tab.IconSide
import io.github.madmaximuus.persian.tabBar.tab.TabBarItemScope
import io.github.madmaximuus.persian.tabBar.tab.TabBarItemScopeWrapper
import io.github.madmaximuus.persian.tabBar.util.TabPosition
import io.github.madmaximuus.persian.tabBar.util.TabPositionsHolder

/**
 * Internal composable function to implement a tab row.
 *
 * This function creates a tab row with customizable colors, sizes, icon placement,
 * indicator, and divider. It uses a [Surface] as the base container and manages the layout
 * of the tabs, divider, and indicator using a [Layout] composable.
 *
 * @param modifier The modifier to be applied to the tab row.
 * @param colors The colors to be used for the tabs.
 * @param sizes The sizes to be used for the tabs.
 * @param iconSide The side on which the icon should be placed.
 * @param indicator A composable function that defines the tab indicator.
 * @param divider A composable function that defines the divider between tabs.
 * @param tabs A composable function that defines the content of the tabs.
 */
@Composable
internal fun TabRowImpl(
    modifier: Modifier,
    colors: TabColors,
    sizes: TabSizes,
    iconSide: IconSide,
    indicator: @Composable TabIndicatorScope.() -> Unit,
    divider: @Composable () -> Unit,
    tabs: @Composable TabBarItemScope.() -> Unit
) {
    Surface(
        modifier = modifier.selectableGroup(),
        needClip = false
    ) {
        val tabsScope = remember(colors, sizes, iconSide) {
            TabBarItemScopeWrapper(iconSide, colors, sizes)
        }
        val indicatorScope = remember {
            object : TabIndicatorScope, TabPositionsHolder {

                val tabPositions = mutableStateOf<(List<TabPosition>)>(listOf())
                override val sizes: TabSizes
                    get() = sizes
                override val colors: TabColors
                    get() = colors

                override fun Modifier.tabIndicatorLayout(
                    measure:
                    MeasureScope.(Measurable, Constraints, List<TabPosition>) -> MeasureResult
                ): Modifier =
                    this.layout { measurable: Measurable, constraints: Constraints ->
                        measure(
                            measurable,
                            constraints,
                            tabPositions.value,
                        )
                    }

                override fun Modifier.tabIndicatorOffset(
                    selectedTabIndex: Int,
                    matchContentSize: Boolean
                ): Modifier =
                    this.then(
                        TabIndicatorModifier(tabPositions, selectedTabIndex, matchContentSize)
                    )

                override fun setTabPositions(positions: List<TabPosition>) {
                    tabPositions.value = positions
                }
            }
        }

        Layout(
            modifier = Modifier.fillMaxWidth(),
            contents = listOf(
                { tabsScope.tabs() },
                divider,
                { indicatorScope.indicator() },
            )
        ) { (tabMeasurables, dividerMeasurables, indicatorMeasurables), constraints ->
            val tabRowWidth = constraints.maxWidth
            val tabCount = tabMeasurables.size
            var tabWidth = 0
            if (tabCount > 0) {
                tabWidth = (tabRowWidth / tabCount)
            }
            val tabRowHeight =
                tabMeasurables.fastFold(initial = 0) { max, curr ->
                    maxOf(curr.maxIntrinsicHeight(tabWidth), max)
                }

            indicatorScope.setTabPositions(
                List(tabCount) { index ->
                    var contentWidth = minOf(
                        tabMeasurables[index].maxIntrinsicWidth(tabRowHeight),
                        tabWidth
                    ).toDp()

                    contentWidth -= 64.dp

                    // Enforce minimum touch target of 24.dp
                    val indicatorWidth = maxOf(contentWidth, 24.dp)

                    TabPosition(tabWidth.toDp() * index, tabWidth.toDp(), indicatorWidth)
                }
            )

            val tabPlaceables = tabMeasurables.fastMap {
                it.measure(
                    constraints.copy(
                        minWidth = tabWidth,
                        maxWidth = tabWidth,
                        minHeight = tabRowHeight,
                        maxHeight = tabRowHeight,
                    )
                )
            }

            val dividerPlaceables =
                dividerMeasurables.fastMap { it.measure(constraints.copy(minHeight = 0)) }

            val indicatorPlaceables =
                indicatorMeasurables.fastMap {
                    it.measure(
                        constraints.copy(
                            minWidth = tabWidth,
                            maxWidth = tabWidth,
                            minHeight = 0,
                            maxHeight = tabRowHeight
                        )
                    )
                }

            layout(tabRowWidth, tabRowHeight) {
                tabPlaceables.fastForEachIndexed { index, placeable ->
                    placeable.placeRelative(index * tabWidth, 0)
                }

                dividerPlaceables.fastForEach { placeable ->
                    placeable.placeRelative(0, tabRowHeight - placeable.height)
                }

                indicatorPlaceables.fastForEach { it.placeRelative(0, tabRowHeight - it.height) }
            }
        }
    }
}