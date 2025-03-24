package io.github.madmaximuus.persian.segmentedControls.tabs

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.Measurable
import androidx.compose.ui.layout.MeasureResult
import androidx.compose.ui.layout.MeasureScope
import androidx.compose.ui.layout.layout
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.util.fastForEach
import androidx.compose.ui.util.fastForEachIndexed
import androidx.compose.ui.util.fastMap
import io.github.madmaximuus.persian.foundation.PersianState38
import io.github.madmaximuus.persian.segmentedControls.tabs.util.TabPosition
import io.github.madmaximuus.persian.segmentedControls.tabs.util.TabPositionsHolder
import io.github.madmaximuus.persian.surface.Surface

/**
 * A segmented button is useful for allowing users to select one option from a set of related choices,
 * providing a clear and intuitive interface for making single-selection decisions. It offers
 * a straightforward and effective method for capturing user preferences, making it an essential tool
 * for enhancing user experience and data collection.
 *
 * @param modifier the [Modifier] to be applied to this row
 * @param content the content of this Segmented Button Row, typically a sequence of [SegmentedTabsRowScope.Segment]
 * @param colors [SegmentedTabsColors] that will be used to resolve the colors used for this
 * @param sizes [SegmentedTabsSizes] that will be used to resolve the sizes used for this
 * @param enabled controls the enabled state of this button. When `false`, this component will not
 *   respond to user input, and it will appear visually disabled and disabled to accessibility
 *   services.
 */
@Composable
fun SegmentedTabsRow(
    modifier: Modifier = Modifier,
    selectedIndex: Int,
    enabled: Boolean = true,
    sizes: SegmentedTabsSizes = SegmentedTabsDefaults.smallSizes(),
    colors: SegmentedTabsColors = SegmentedTabsDefaults.colors(),
    indicator: @Composable() SelectedTabIndicatorScope.() -> Unit = {
        Indicator(modifier = Modifier.tabIndicatorOffset(selectedIndex, matchContentSize = true))
    },
    content: @Composable SegmentedTabsRowScope.() -> Unit
) {
    Surface(
        modifier = modifier
            .selectableGroup()
            .height(sizes.height)
            .graphicsLayer {
                alpha = if (enabled) 1f
                else PersianState38
            },
        shape = sizes.shape,
        color = colors.containerColor
    ) {
        val scope =
            remember(sizes, colors, enabled) {
                SegmentedTabsRowScopeWrapper(
                    sizes = sizes,
                    colors = colors,
                    enabled = enabled
                )
            }
        val indicatorScope = remember(colors, sizes) {
            object : SelectedTabIndicatorScope, TabPositionsHolder {

                val tabPositions = mutableStateOf<(List<TabPosition>)>(listOf())
                override val sizes: SegmentedTabsSizes
                    get() = sizes
                override val colors: SegmentedTabsColors
                    get() = colors

                override fun Modifier.tabIndicatorLayout(
                    measure: MeasureScope.(Measurable, Constraints, List<TabPosition>) -> MeasureResult
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

        val density = LocalDensity.current
        Layout(
            modifier = Modifier.fillMaxWidth(),
            contents = listOf(
                { scope.content() },
                { indicatorScope.indicator() },
            )
        ) { (tabMeasurables, indicatorMeasurables), constraints ->
            val tabRowWidth = constraints.maxWidth
            val tabCount = tabMeasurables.size
            var tabWidth = 0
            if (tabCount > 0) {
                tabWidth = (tabRowWidth / tabCount)
            }
            val tabRowHeight = with(density) { sizes.height.toPx().toInt() }
            val padding = with(density) { sizes.indicatorPadding.toPx().toInt() }

            indicatorScope.setTabPositions(
                List(tabCount) { index ->
                    TabPosition(
                        left = tabWidth.toDp() * index + padding.toDp(),
                        width = tabWidth.toDp(),
                        contentWidth = (tabWidth - padding * 2).toDp()
                    )
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

            val indicatorPlaceables =
                indicatorMeasurables.fastMap {
                    it.measure(
                        constraints.copy(
                            minWidth = tabWidth - padding * 2,
                            maxWidth = tabWidth - padding * 2,
                            minHeight = tabRowHeight - padding * 2,
                            maxHeight = tabRowHeight - padding * 2
                        )
                    )
                }

            layout(tabRowWidth, tabRowHeight) {
                indicatorPlaceables.fastForEach { it.placeRelative(0, padding) }

                tabPlaceables.fastForEachIndexed { index, placeable ->
                    placeable.placeRelative(index * tabWidth, 0)
                }
            }
        }
    }
}