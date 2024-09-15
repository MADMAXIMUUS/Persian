package io.github.madmaximuus.persian.tabBar.indicator

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.AnimationVector1D
import androidx.compose.animation.core.VectorConverter
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.Measurable
import androidx.compose.ui.layout.MeasureResult
import androidx.compose.ui.layout.MeasureScope
import androidx.compose.ui.node.LayoutModifierNode
import androidx.compose.ui.node.ModifierNodeElement
import androidx.compose.ui.platform.InspectorInfo
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Dp
import io.github.madmaximuus.persian.tabBar.TabColors
import io.github.madmaximuus.persian.tabBar.TabSizes
import io.github.madmaximuus.persian.tabBar.util.TabPosition
import io.github.madmaximuus.persian.tabBar.util.TabRowIndicatorSpec
import kotlinx.coroutines.launch

/**
 * Primary indicator, which will be positioned at the bottom of the [TabRow], on top of the
 * divider.
 *
 * @param modifier modifier for the indicator's layout
 * @param width width of the indicator
 * @param height height of the indicator
 * @param color color of the indicator
 * @param shape shape of the indicator
 */
@Composable
fun TabIndicatorScope.Indicator(
    modifier: Modifier = Modifier,
    width: Dp = Dp.Unspecified,
) {
    Spacer(
        modifier
            .height(sizes.indicatorThickness)
            .requiredWidth(width)
            .background(color = colors.indicatorColor, shape = sizes.indicatorShape)
    )
}

/**
 * Scope for the composable used to render a Tab indicator, this can be used for more complex
 * indicators requiring layout information about the tabs like [TabRowDefaults.PrimaryIndicator] and
 * [TabRowDefaults.SecondaryIndicator]
 */
interface TabIndicatorScope {

    val sizes: TabSizes
    val colors: TabColors

    /**
     * A layout modifier that provides tab positions, this can be used to animate and layout a
     * TabIndicator depending on size, position, and content size of each Tab.
     */
    fun Modifier.tabIndicatorLayout(
        measure:
        MeasureScope.(
            Measurable,
            Constraints,
            List<TabPosition>,
        ) -> MeasureResult
    ): Modifier

    /**
     * A Modifier that follows the default offset and animation
     *
     * @param selectedTabIndex the index of the current selected tab
     * @param matchContentSize this modifier can also animate the width of the indicator \ to match
     *   the content size of the tab.
     */
    fun Modifier.tabIndicatorOffset(
        selectedTabIndex: Int,
        matchContentSize: Boolean = false
    ): Modifier
}


internal data class TabIndicatorModifier(
    val tabPositionsState: State<List<TabPosition>>,
    val selectedTabIndex: Int,
    val followContentSize: Boolean,
) : ModifierNodeElement<TabIndicatorOffsetNode>() {

    override fun create(): TabIndicatorOffsetNode {
        return TabIndicatorOffsetNode(
            tabPositionsState = tabPositionsState,
            selectedTabIndex = selectedTabIndex,
            followContentSize = followContentSize,
        )
    }

    override fun update(node: TabIndicatorOffsetNode) {
        node.tabPositionsState = tabPositionsState
        node.selectedTabIndex = selectedTabIndex
        node.followContentSize = followContentSize
    }

    override fun InspectorInfo.inspectableProperties() {
        // Show nothing in the inspector.
    }
}

internal class TabIndicatorOffsetNode(
    var tabPositionsState: State<List<TabPosition>>,
    var selectedTabIndex: Int,
    var followContentSize: Boolean
) : Modifier.Node(), LayoutModifierNode {

    private var offsetAnimatable: Animatable<Dp, AnimationVector1D>? = null
    private var widthAnimatable: Animatable<Dp, AnimationVector1D>? = null
    private var initialOffset: Dp? = null
    private var initialWidth: Dp? = null

    override fun MeasureScope.measure(
        measurable: Measurable,
        constraints: Constraints
    ): MeasureResult {
        if (tabPositionsState.value.isEmpty()) {
            return layout(0, 0) {}
        }

        val currentTabWidth =
            if (followContentSize) {
                tabPositionsState.value[selectedTabIndex].contentWidth
            } else {
                tabPositionsState.value[selectedTabIndex].width
            }

        if (initialWidth != null) {
            val widthAnim =
                widthAnimatable
                    ?: Animatable(initialWidth!!, Dp.VectorConverter).also { widthAnimatable = it }

            if (currentTabWidth != widthAnim.targetValue) {
                coroutineScope.launch { widthAnim.animateTo(currentTabWidth, TabRowIndicatorSpec) }
            }
        } else {
            initialWidth = currentTabWidth
        }

        val indicatorOffset = tabPositionsState.value[selectedTabIndex].left

        if (initialOffset != null) {
            val offsetAnim =
                offsetAnimatable
                    ?: Animatable(initialOffset!!, Dp.VectorConverter).also {
                        offsetAnimatable = it
                    }

            if (indicatorOffset != offsetAnim.targetValue) {
                coroutineScope.launch { offsetAnim.animateTo(indicatorOffset, TabRowIndicatorSpec) }
            }
        } else {
            initialOffset = indicatorOffset
        }

        val offset = offsetAnimatable?.value ?: indicatorOffset

        val width = widthAnimatable?.value ?: currentTabWidth

        val placeable =
            measurable.measure(
                constraints.copy(minWidth = width.roundToPx(), maxWidth = width.roundToPx())
            )

        return layout(placeable.width, placeable.height) { placeable.place(offset.roundToPx(), 0) }
    }
}