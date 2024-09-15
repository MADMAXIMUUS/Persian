package io.github.madmaximuus.persian.tabBar.scrollable

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
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
import io.github.madmaximuus.persian.tabBar.util.ScrollableTabData
import io.github.madmaximuus.persian.tabBar.util.TabPosition
import io.github.madmaximuus.persian.tabBar.util.TabPositionsHolder
import kotlin.math.max

@Composable
internal fun ScrollableTabRowImpl(
    selectedTabIndex: Int,
    modifier: Modifier,
    colors: TabColors,
    sizes: TabSizes,
    iconSide: IconSide,
    scrollState: ScrollState,
    indicator: @Composable TabIndicatorScope.() -> Unit,
    divider: @Composable () -> Unit,
    tabs: @Composable TabBarItemScope.() -> Unit
) {
    Surface(
        modifier = modifier
            .fillMaxWidth()
            .wrapContentSize(align = Alignment.CenterStart)
            .horizontalScroll(scrollState)
            .selectableGroup(),
        needClip = false
    ) {
        val coroutineScope = rememberCoroutineScope()
        val scrollableTabData =
            remember(scrollState, coroutineScope) {
                ScrollableTabData(
                    scrollState = scrollState,
                    coroutineScope = coroutineScope
                )
            }

        val tabScope = remember(colors, sizes, iconSide) {
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
            contents = listOf(
                { tabScope.tabs() },
                divider,
                { indicatorScope.indicator() },
            )
        ) { (tabMeasurables, dividerMeasurables, indicatorMeasurables), constraints ->
            val padding = sizes.edgePadding.roundToPx()
            val tabCount = tabMeasurables.size
            val minTabWidth = 90.dp.roundToPx()
            val layoutHeight =
                tabMeasurables.fastFold(initial = 0) { curr, measurable ->
                    maxOf(curr, measurable.maxIntrinsicHeight(Constraints.Infinity))
                }
            var layoutWidth = padding * 2
            val tabConstraints =
                constraints.copy(
                    minWidth = minTabWidth,
                    minHeight = layoutHeight,
                    maxHeight = layoutHeight,
                )

            var left = sizes.edgePadding
            val tabPlaceables = tabMeasurables.fastMap { it.measure(tabConstraints) }

            val positions = List(tabCount) { index ->
                val tabWidth = maxOf(90.dp, tabPlaceables[index].width.toDp())
                layoutWidth += tabWidth.roundToPx()
                // Enforce minimum touch target of 24.dp
                val contentWidth = maxOf(tabWidth - 64.dp, 24.dp)
                val tabPosition = TabPosition(
                    left = left,
                    width = tabWidth,
                    contentWidth = contentWidth
                )
                left += tabWidth
                tabPosition
            }
            indicatorScope.setTabPositions(positions)

            val dividerPlaceables =
                dividerMeasurables.fastMap {
                    it.measure(
                        constraints.copy(
                            minHeight = 0,
                            minWidth = layoutWidth,
                            maxWidth = layoutWidth
                        )
                    )
                }

            val indicatorPlaceables =
                indicatorMeasurables.fastMap {
                    it.measure(
                        constraints.copy(
                            minWidth = 0,
                            maxWidth = positions[selectedTabIndex].width.roundToPx(),
                            minHeight = 0,
                            maxHeight = layoutHeight
                        )
                    )
                }

            layout(layoutWidth, layoutHeight) {
                left = sizes.edgePadding
                tabPlaceables.fastForEachIndexed { index, placeable ->
                    placeable.placeRelative(left.roundToPx(), 0)
                    left += positions[index].width
                }

                dividerPlaceables.fastForEach { placeable ->
                    placeable.placeRelative(0, layoutHeight - placeable.height)
                }

                indicatorPlaceables.fastForEach {
                    val relativeOffset =
                        max(0, (positions[selectedTabIndex].width.roundToPx() - it.width) / 2)
                    it.placeRelative(relativeOffset, layoutHeight - it.height)
                }

                scrollableTabData.onLaidOut(
                    density = this@Layout,
                    edgeOffset = padding,
                    tabPositions = positions,
                    selectedTab = selectedTabIndex
                )
            }
        }
    }
}