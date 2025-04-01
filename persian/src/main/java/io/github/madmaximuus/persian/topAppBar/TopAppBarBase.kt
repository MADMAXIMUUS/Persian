package io.github.madmaximuus.persian.topAppBar

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.isFinite
import androidx.compose.ui.unit.isSpecified
import io.github.madmaximuus.persian.counter.Counter
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.surface.Surface
import io.github.madmaximuus.persian.text.Text
import io.github.madmaximuus.persian.topAppBar.util.LayoutId
import io.github.madmaximuus.persian.topAppBar.util.ScrolledOffset
import kotlin.math.roundToInt

/**
 * A single-row top app bar that is designed to be called by the small and center aligned top app
 * bar composables.
 */
@Composable
internal fun TopAppBarImpl(
    modifier: Modifier = Modifier,
    title: String,
    counterValue: Int,
    leading: (@Composable TopAppBarLeadingScope.() -> Unit)?,
    trailing: (@Composable TopAppBarTrailingScope.() -> Unit)?,
    expandedHeight: Dp,
    windowInsets: WindowInsets,
    colors: TopAppBarColors,
    sizes: TopAppBarSizes,
    scrollBehavior: TopAppBarScrollBehavior?
) {
    require(expandedHeight.isSpecified && expandedHeight.isFinite) {
        "The expandedHeight is expected to be specified and finite"
    }
    val expandedHeightPx = with(LocalDensity.current) { expandedHeight.toPx().coerceAtLeast(0f) }
    SideEffect {
        // Sets the app bar's height offset to collapse the entire bar's height when content is
        // scrolled.
        if (scrollBehavior?.state?.heightOffsetLimit != -expandedHeightPx) {
            scrollBehavior?.state?.heightOffsetLimit = -expandedHeightPx
        }
    }

    // Obtain the container color from the TopAppBarColors using the `overlapFraction`. This
    // ensures that the colors will adjust whether the app bar behavior is pinned or scrolled.
    // This may potentially animate or interpolate a transition between the container-color and the
    // container's scrolled-color according to the app bar's scroll state.
    val colorTransitionFraction by remember(scrollBehavior) {
        // derivedStateOf to prevent redundant recompositions when the content scrolls.
        derivedStateOf {
            val overlappingFraction = scrollBehavior?.state?.overlappedFraction ?: 0f
            if (overlappingFraction > 0.01f) 1f else 0f
        }
    }
    val topAppBarContainerColor by animateColorAsState(
        targetValue = colors.containerColor(colorTransitionFraction),
        animationSpec = spring(stiffness = Spring.StiffnessMediumLow),
        label = "Top app bar container animation"
    )

    Surface(modifier = modifier, color = topAppBarContainerColor) {
        TopAppBarLayout(
            modifier = Modifier
                .windowInsetsPadding(windowInsets)
                .padding(
                    horizontal = PersianTheme.spacing.size4,
                )
                // clip after padding so we don't show the title over the inset area
                .clipToBounds()
                .heightIn(max = expandedHeight),
            scrolledOffset = { scrollBehavior?.state?.heightOffset ?: 0f },
            title = title,
            counterValue = counterValue,
            colors = colors,
            sizes = sizes,
            leading = leading,
            trailing = trailing
        )
    }
}


/**
 * The base [Layout] for all top app bars. This function lays out a top app bar navigation icon
 * (leading icon), a title (header), and action icons (trailing icons). Note that the navigation and
 * the actions are optional.
 *
 * @param modifier a [Modifier]
 * @param scrolledOffset a [ScrolledOffset] that provides the app bar offset in pixels (note that
 *   when the app bar is scrolled, the lambda will output negative values)
 * @param title the top app bar title (header)
 * @param colors the [TopAppBarColors] that used by [TopAppBar] or [TopAppBar]
 * @param sizes the [TopAppBarSizes] that used by [TopAppBar] or [TopAppBar]
 * @param leading the optional content that will be displayed in left side of [TopAppBar] or [TopAppBar]
 * @param trailing the optional content that will be displayed in right side of [TopAppBar] or [TopAppBar]
 */
@Composable
private fun TopAppBarLayout(
    modifier: Modifier,
    title: String,
    counterValue: Int,
    scrolledOffset: ScrolledOffset,
    colors: TopAppBarColors,
    sizes: TopAppBarSizes,
    leading: (@Composable TopAppBarLeadingScope.() -> Unit)?,
    trailing: (@Composable TopAppBarTrailingScope.() -> Unit)?,
) {
    val leftScope = remember(colors, sizes) {
        TopAppBarLeadingScopeWrapper(colors, sizes)
    }
    val rightScope = remember(colors, sizes) {
        TopAppBarTrailingScopeWrapper(colors, sizes)
    }
    val padding = with(LocalDensity.current) { 8.dp.roundToPx() }
    Layout(
        content = {
            leading?.let { leftScope.it() }
            Row(
                modifier = Modifier.layoutId(LayoutId.TITLE),
                horizontalArrangement = Arrangement.spacedBy(
                    PersianTheme.spacing.size4,
                    Alignment.CenterHorizontally
                )
            ) {
                Text(
                    text = title,
                    style = sizes.titleTextStyle,
                    color = colors.titleTextColor
                )
                if (counterValue > 0) {
                    Counter(
                        count = counterValue,
                        sizes = sizes.counterSizes,
                        colors = colors.counterColors
                    )
                }
            }
            trailing?.let { rightScope.it() }
        },
        modifier = modifier
    ) { measurables, constraints ->
        val leftPlaceable = measurables
            .firstOrNull { it.layoutId == LayoutId.LEFT }
            ?.measure(constraints.copy(minWidth = 0))

        val rightAction = measurables
            .firstOrNull { it.layoutId == LayoutId.RIGHT_BUTTON }
            ?.measure(constraints.copy(minWidth = 0))

        val rightOverflow = measurables
            .firstOrNull { it.layoutId == LayoutId.RIGHT_OVERFLOW }
            ?.measure(constraints.copy(minWidth = 0))

        val rightIcons = measurables
            .filter { it.layoutId == LayoutId.RIGHT_ICON }
            .map { it.measure(constraints.copy(minWidth = 0)) }

        val isRightValid = (rightAction != null && rightOverflow == null && rightIcons.isEmpty()) ||
                (rightAction == null && rightOverflow == null && rightIcons.size <= 3) ||
                (rightAction == null && rightOverflow != null && rightIcons.size <= 2)

        require(isRightValid) {
            throw IllegalArgumentException("Top App Bar Right slot must contain no more than one action or three icon buttons or icon buttons and overflow")
        }

        val leftWidth = leftPlaceable?.width ?: 0
        val rightActionWidth = rightAction?.width ?: 0
        val rightIconWidth = rightIcons.firstOrNull()?.width ?: 0
        val rightIconsWidth = rightIcons.sumOf { it.width }
        val rightOverflowWidth = rightOverflow?.width ?: 0

        val maxTitleWidth = if (constraints.maxWidth == Constraints.Infinity) {
            constraints.maxWidth
        } else {
            (constraints.maxWidth
                    - leftWidth
                    - rightActionWidth
                    - rightIcons.sumOf { it.width }
                    - rightOverflowWidth
                    - padding * 2
                    ).coerceAtLeast(0)
        }
        val titlePlaceable = measurables
            .first { it.layoutId == LayoutId.TITLE }
            .measure(constraints.copy(minWidth = 0, maxWidth = maxTitleWidth))

        // Subtract the scrolledOffset from the maxHeight. The scrolledOffset is expected to be
        // equal or smaller than zero.
        val scrolledOffsetValue = scrolledOffset.offset()
        val heightOffset = if (scrolledOffsetValue.isNaN()) 0 else scrolledOffsetValue.roundToInt()

        val layoutHeight =
            if (constraints.maxHeight == Constraints.Infinity) {
                constraints.maxHeight
            } else {
                constraints.maxHeight + heightOffset
            }

        layout(constraints.maxWidth, layoutHeight) {
            // Navigation icon
            leftPlaceable?.placeRelative(
                x = 0,
                y = (layoutHeight - leftPlaceable.height) / 2
            )

            // Action icons
            rightAction?.placeRelative(
                x = constraints.maxWidth - rightActionWidth,
                y = (layoutHeight - rightAction.height) / 2
            )

            var x =
                constraints.maxWidth - rightIconsWidth - rightOverflowWidth
            rightIcons.forEach { icon ->
                icon.placeRelative(
                    x = x,
                    y = (layoutHeight - icon.height) / 2
                )
                x += icon.width
            }

            rightOverflow?.placeRelative(
                x = x,
                y = (layoutHeight - rightOverflow.height) / 2
            )

            val isCentered = rightActionWidth != 0
                    || rightIconsWidth != rightIconWidth * 3
                    && rightIconsWidth + rightOverflowWidth != rightIconWidth * 3
                    || trailing == null

            // Title
            titlePlaceable.placeRelative(
                x = if (isCentered) {
                    var baseX = (constraints.maxWidth - titlePlaceable.width) / 2
                    if (baseX < leftWidth) {
                        // May happen if the navigation is wider than the actions and the
                        // title is long. In this case, prioritize showing more of the title
                        // by
                        // offsetting it to the right.
                        baseX += (leftWidth - baseX)
                    } else if (
                        baseX + titlePlaceable.width >
                        constraints.maxWidth - rightIconsWidth - rightActionWidth - rightOverflowWidth
                    ) {
                        // May happen if the actions are wider than the navigation and the
                        // title
                        // is long. In this case, offset to the left.
                        baseX +=
                            ((constraints.maxWidth - rightIconsWidth - rightActionWidth - rightOverflowWidth) -
                                    (baseX + titlePlaceable.width))
                    }
                    baseX
                } else {
                    leftWidth + padding
                    /*constraints.maxWidth - titlePlaceable.width - rightIconsWidth - rightActionWidth - rightOverflowWidth*/
                },
                y = (layoutHeight - titlePlaceable.height) / 2
            )
        }
    }
}