package io.github.madmaximuus.persian.topAppBar

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.gestures.rememberDraggableState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.layout.LastBaseline
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.isFinite
import androidx.compose.ui.unit.isSpecified
import androidx.compose.ui.util.fastFirst
import io.github.madmaximuus.persian.foundation.LocalContentColor
import io.github.madmaximuus.persian.surface.Surface
import io.github.madmaximuus.persian.text.Text
import io.github.madmaximuus.persian.topAppBar.util.LayoutId
import io.github.madmaximuus.persian.topAppBar.util.ScrolledOffset
import io.github.madmaximuus.persian.topAppBar.util.TopAppBarHorizontalPadding
import io.github.madmaximuus.persian.topAppBar.util.TopAppBarTitleInset
import io.github.madmaximuus.persian.topAppBar.util.settleAppBar
import kotlin.math.max
import kotlin.math.roundToInt

/**
 * A single-row top app bar that is designed to be called by the small and center aligned top app
 * bar composables.
 *
 * This SingleRowTopAppBar has slots for a title, navigation icon, and actions. When the
 * [centeredTitle] flag is true, the title will be horizontally aligned to the center of the top app
 * bar width.
 */
@Composable
internal fun SingleRowTopAppBar(
    modifier: Modifier = Modifier,
    title: String,
    centeredTitle: Boolean,
    left: (@Composable TopAppBarLeftScope.() -> Unit)?,
    right: (@Composable TopAppBarRightScope.() -> Unit)?,
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
    val appBarContainerColor by animateColorAsState(
        targetValue = colors.containerColor(colorTransitionFraction),
        animationSpec = spring(stiffness = Spring.StiffnessMediumLow),
        label = "Top App Bar Container Animation"
    )

    // Wrap the given actions in a Row.
    val actionsRow = @Composable {
        Row(
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.CenterVertically,
            content = {
                val scope = remember {
                    TopAppBarRightScopeWrapper(colors, sizes)
                }
                right?.let { scope.it() }
            }
        )
    }

    // Set up support for resizing the top app bar when vertically dragging the bar itself.
    val appBarDragModifier =
        if (scrollBehavior != null && !scrollBehavior.isPinned) {
            Modifier.draggable(
                orientation = Orientation.Vertical,
                state =
                rememberDraggableState { delta -> scrollBehavior.state.heightOffset += delta },
                onDragStopped = { velocity ->
                    settleAppBar(
                        scrollBehavior.state,
                        velocity,
                        scrollBehavior.flingAnimationSpec,
                        scrollBehavior.snapAnimationSpec
                    )
                }
            )
        } else {
            Modifier
        }

    // Compose a Surface with a TopAppBarLayout content.
    // The surface's background color is animated as specified above.
    // The height of the app bar is determined by subtracting the bar's height offset from the
    // app bar's defined constant height value (i.e. the ContainerHeight token).
    Surface(modifier = modifier.then(appBarDragModifier), color = appBarContainerColor) {
        TopAppBarLayout(
            modifier = Modifier
                .windowInsetsPadding(windowInsets)
                // clip after padding so we don't show the title over the inset area
                .clipToBounds()
                .heightIn(max = expandedHeight),
            scrolledOffset = { scrollBehavior?.state?.heightOffset ?: 0f },
            title = title,
            colors = colors,
            sizes = sizes,
            titleHorizontalArrangement = if (centeredTitle) Arrangement.Center else Arrangement.Start,
            left = left,
            right = right
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
 * @param navigationIconContentColor the content color that will be applied via a
 *   [LocalContentColor] when composing the navigation icon
 * @param titleContentColor the color that will be applied via a [LocalContentColor] when composing
 *   the title
 * @param actionIconContentColor the content color that will be applied via a [LocalContentColor]
 *   when composing the action icons
 * @param title the top app bar title (header)
 * @param titleTextStyle the title's text style
 * @param titleAlpha the title's alpha
 * @param titleVerticalArrangement the title's vertical arrangement
 * @param titleHorizontalArrangement the title's horizontal arrangement
 * @param titleBottomPadding the title's bottom padding
 * @param hideTitleSemantics hides the title node from the semantic tree. Apply this boolean when
 *   this layout is part of a [TwoRowsTopAppBar] to hide the title's semantics from accessibility
 *   services. This is needed to avoid having multiple titles visible to accessibility services at
 *   the same time, when animating between collapsed / expanded states.
 * @param navigationIcon a navigation icon [Composable]
 * @param actions actions [Composable]
 */
@Composable
private fun TopAppBarLayout(
    modifier: Modifier,
    title: String,
    scrolledOffset: ScrolledOffset,
    colors: TopAppBarColors,
    sizes: TopAppBarSizes,
    titleHorizontalArrangement: Arrangement.Horizontal,
    left: (@Composable TopAppBarLeftScope.() -> Unit)?,
    right: (@Composable TopAppBarRightScope.() -> Unit)?,
) {
    val leftScope = remember {
        TopAppBarLeftScopeWrapper(colors, sizes)
    }
    val rightScope = remember {
        TopAppBarRightScopeWrapper(colors, sizes)
    }
    Layout(
        content = {
            left?.let { leftScope.it() }
            Box(
                Modifier
                    .layoutId(LayoutId.TITLE)
                    .padding(horizontal = TopAppBarHorizontalPadding)
            ) {
                Text(
                    text = title,
                    style = sizes.titleTextStyle,
                    color = colors.titleTextColor
                )
            }
            right?.let { rightScope.it() }
        },
        modifier = modifier
    ) { measurables, constraints ->
        val leftPlaceable = measurables
            .filter { it.layoutId == LayoutId.LEFT }
            .map { it.measure(constraints.copy(maxWidth = 0)) }

        require(leftPlaceable.size <= 1) {
            throw IllegalArgumentException("Top App Bar Left slot must contain no more than one element")
        }
        val rightAction = measurables
            .filter { it.layoutId == LayoutId.RIGHT_ICON }
            .map { it.measure(constraints.copy(maxWidth = 0)) }

        val rightOverflow = measurables
            .filter { it.layoutId == LayoutId.RIGHT_OVERFLOW }
            .map { it.measure(constraints.copy(maxWidth = 0)) }

        val rightIcons = measurables
            .filter { it.layoutId == LayoutId.RIGHT_ICON }
            .map { it.measure(constraints.copy(maxWidth = 0)) }

        require(rightAction.size <= 1 && rightOverflow.isEmpty() && rightIcons.isEmpty()) {
            throw IllegalArgumentException("Top App Bar Right slot must contain no more than one action and don't contain icon buttons")
        }

        require(rightIcons.size <= 3 && rightOverflow.isEmpty() && rightAction.isEmpty()) {
            throw IllegalArgumentException("Top App Bar Right slot must contain no more than three icon button and don't contain action button")
        }

        require(rightIcons.size <= 2 && rightOverflow.size == 1 && rightAction.isEmpty()) {
            throw IllegalArgumentException("Top App Bar Right slot must contain no more than two icon button with overflow button and don't contain action button")
        }

        val leftWidth = leftPlaceable.sumOf { it.width }
        val rightActionWidth = rightAction.sumOf { it.width }
        val rightIconsWidth = rightIcons.sumOf { it.width }
        val rightOverflowWidth = rightOverflow.sumOf { it.width }

        val maxTitleWidth = if (constraints.maxWidth == Constraints.Infinity) {
            constraints.maxWidth
        } else {
            (constraints.maxWidth
                    - leftPlaceable.sumOf { it.width }
                    - rightAction.sumOf { it.width }
                    - rightIcons.sumOf { it.width }
                    - rightOverflow.sumOf { it.width }
                    ).coerceAtLeast(0)
        }
        val titlePlaceable = measurables
            .fastFirst { it.layoutId == LayoutId.TITLE }
            .measure(constraints.copy(minWidth = 0, maxWidth = maxTitleWidth))

        // Locate the title's baseline.
        val titleBaseline = if (titlePlaceable[LastBaseline] != AlignmentLine.Unspecified) {
            titlePlaceable[LastBaseline]
        } else {
            0
        }

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
            leftPlaceable.forEach { placeable ->
                placeable.placeRelative(
                    x = 0,
                    y = (layoutHeight - leftWidth / 2)
                )
            }

            // Title
            titlePlaceable.placeRelative(
                x = when (titleHorizontalArrangement) {
                    Arrangement.Center -> {
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
                    }

                    Arrangement.End ->
                        constraints.maxWidth - titlePlaceable.width - rightIconsWidth - rightActionWidth - rightOverflowWidth
                    // Arrangement.Start.
                    // An TopAppBarTitleInset will make sure the title is offset in case the
                    // navigation icon is missing.
                    else -> max(TopAppBarTitleInset.roundToPx(), leftWidth)
                },
                y = (layoutHeight - titlePlaceable.height) / 2
            )

            // Action icons
            rightAction.forEach { action ->
                action.placeRelative(
                    x = constraints.maxWidth - rightActionWidth,
                    y = (layoutHeight - rightAction.sumOf { it.height }) / 2
                )
            }

            rightIcons.forEach { action ->
                action.placeRelative(
                    x = constraints.maxWidth - rightActionWidth,
                    y = (layoutHeight - rightAction.sumOf { it.height }) / 2
                )
            }

            var x = constraints.maxWidth - rightIconsWidth - rightOverflowWidth
            rightIcons.forEach { action ->
                action.placeRelative(
                    x = x,
                    y = (layoutHeight - rightIcons.sumOf { it.height }) / 2
                )
                x += action.width
            }

            rightOverflow.forEach { action ->
                action.placeRelative(
                    x = x,
                    y = (layoutHeight - rightOverflow.sumOf { it.height }) / 2
                )
                x += action.width
            }
        }
    }
}