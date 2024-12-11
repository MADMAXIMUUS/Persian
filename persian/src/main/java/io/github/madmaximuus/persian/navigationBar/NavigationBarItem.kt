package io.github.madmaximuus.persian.navigationBar

import androidx.annotation.IntRange
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.indication
import androidx.compose.foundation.interaction.Interaction
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectable
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.MeasureResult
import androidx.compose.ui.layout.MeasureScope
import androidx.compose.ui.layout.Placeable
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.clearAndSetSemantics
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.constrainHeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.fastFirst
import androidx.compose.ui.util.fastFirstOrNull
import io.github.madmaximuus.persian.counter.Badge
import io.github.madmaximuus.persian.counter.utils.BadgeStyle
import io.github.madmaximuus.persian.foundation.PersianState38
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.ripple.ripple
import io.github.madmaximuus.persian.icon.Icon
import io.github.madmaximuus.persian.text.Text
import kotlin.math.roundToInt

/**
 * An interface that defines the scope for a row within a navigation bar.
 *
 * This interface extends [RowScope] and provides additional properties for sizes and colors specific to the navigation bar.
 *
 * @property sizes The sizes to be used for the navigation bar.
 * @property colors The colors to be used for the navigation bar items.
 */
interface NavigationBarRowScope : RowScope {
    val sizes: NavigationBarSizes
    val colors: NavigationBarItemColors
}

/**
 * An internal class that wraps a [RowScope] to provide additional properties for the navigation bar.
 *
 * This class implements the [NavigationBarRowScope] interface and delegates the [RowScope] methods to the provided scope.
 *
 * @param scope The [RowScope] to be wrapped.
 * @param sizes The sizes to be used for the navigation bar.
 * @param colors The colors to be used for the navigation bar items.
 */
internal class NavigationBarScopeWrapper(
    scope: RowScope,
    override val sizes: NavigationBarSizes,
    override val colors: NavigationBarItemColors,
) : NavigationBarRowScope, RowScope by scope

/**
 * Material Design navigation bar item.
 *
 * Navigation bars offer a persistent and convenient way to switch between primary destinations in
 * an app.
 *
 * The recommended configuration for a [NavigationBarItem] depends on how many items there are
 * inside a [NavigationBar]:
 * - Three destinations: Display icons and text labels for all destinations.
 * - Four destinations: Active destinations display an icon and text label. Inactive destinations
 *   display icons, and text labels are recommended.
 * - Five destinations: Active destinations display an icon and text label. Inactive destinations
 *   use icons, and use text labels if space permits.
 *
 * A [NavigationBarItem] always shows text labels (if it exists) when selected. Showing text labels
 * if not selected is controlled by [alwaysShowLabel].
 *
 * @param selected whether this item is selected
 * @param onClick called when this item is clicked
 * @param icon icon for this item, typically an [Icon]
 * @param modifier the [Modifier] to be applied to this item
 * @param enabled controls the enabled state of this item. When `false`, this component will not
 *   respond to user input, and it will appear visually disabled and disabled to accessibility
 *   services.
 * @param label optional text label for this item
 * @param alwaysShowLabel whether to always show the label for this item. If `false`, the label will
 *   only be shown when this item is selected.
 * @param interactionSource an optional hoisted [MutableInteractionSource] for observing and
 *   emitting [Interaction]s for this item. You can use this to change the item's appearance or
 *   preview the item in different states. Note that if `null` is provided, interactions will still
 *   happen internally.
 */
@Composable
fun NavigationBarRowScope.NavigationBarItem(
    selected: Boolean,
    onClick: () -> Unit,
    icon: Painter,
    selectedIcon: Painter,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    label: String? = null,
    @IntRange(from = 0) badge: Int = 0,
    badgeStyle: BadgeStyle = BadgeStyle.NUMBER,
    alwaysShowLabel: Boolean = true,
    interactionSource: MutableInteractionSource? = null
) {
    @Suppress("NAME_SHADOWING")
    val interactionSource = interactionSource ?: remember { MutableInteractionSource() }
    val styledIcon =
        @Composable {
            val iconColor by
            animateColorAsState(
                targetValue = colors.iconColor(selected = selected),
                animationSpec = tween(ItemAnimationDurationMillis),
                label = ""
            )
            // If there's a label, don't have a11y services repeat the icon description.
            val clearSemantics = label != null && (alwaysShowLabel || selected)
            Box(modifier = if (clearSemantics) Modifier.clearAndSetSemantics {} else Modifier) {
                if (badge != 0) {
                    Badge(
                        style = badgeStyle,
                        count = badge,
                        sizes = this@NavigationBarItem.sizes.badgeSizes
                    ) {
                        if (selected) {
                            Icon(
                                painter = selectedIcon,
                                sizes = this@NavigationBarItem.sizes.iconSize,
                                tint = iconColor
                            )
                        } else {
                            Icon(
                                painter = icon,
                                sizes = this@NavigationBarItem.sizes.iconSize,
                                tint = iconColor
                            )
                        }
                    }
                } else {
                    if (selected) {
                        Icon(
                            painter = selectedIcon,
                            sizes = this@NavigationBarItem.sizes.iconSize,
                            tint = iconColor
                        )
                    } else {
                        Icon(
                            painter = icon,
                            sizes = this@NavigationBarItem.sizes.iconSize,
                            tint = iconColor
                        )
                    }
                }
            }
        }

    val styledLabel: @Composable (() -> Unit)? =
        label?.let {
            @Composable {
                val style = sizes.textStyle
                val textColor by
                animateColorAsState(
                    targetValue = colors.textColor(selected = selected),
                    animationSpec = tween(ItemAnimationDurationMillis),
                    label = ""
                )
                Text(
                    text = label,
                    style = style,
                    color = textColor
                )
            }
        }

    var itemWidth by remember { mutableIntStateOf(0) }

    Box(
        modifier
            .selectable(
                selected = selected,
                onClick = onClick,
                enabled = enabled,
                role = Role.Tab,
                interactionSource = interactionSource,
                indication = null,
            )
            .defaultMinSize(minHeight = NavigationBarHeight)
            .weight(1f)
            .onSizeChanged { itemWidth = it.width }
            .graphicsLayer {
                alpha = if (enabled) 1f
                else PersianState38
            },
        contentAlignment = Alignment.Center,
        propagateMinConstraints = true,
    ) {
        val animationProgress: State<Float> =
            animateFloatAsState(
                targetValue = if (selected) 1f else 0f,
                animationSpec = tween(ItemAnimationDurationMillis),
                label = ""
            )

        // The entire item is selectable, but only the indicator pill shows the ripple. To achieve
        // this, we re-map the coordinates of the item's InteractionSource into the coordinates of
        // the indicator.
        val deltaOffset: Offset
        with(LocalDensity.current) {
            val indicatorWidth = 32.dp.roundToPx()
            deltaOffset =
                Offset(
                    (itemWidth - indicatorWidth).toFloat() / 2,
                    IndicatorVerticalOffset.toPx()
                )
        }
        val offsetInteractionSource =
            remember(interactionSource, deltaOffset) {
                MappedInteractionSource(interactionSource, deltaOffset)
            }

        // The indicator has a width-expansion animation which interferes with the timing of the
        // ripple, which is why they are separate composables
        val indicatorRipple =
            @Composable {
                Box(
                    Modifier
                        .layoutId(IndicatorRippleLayoutIdTag)
                        .clip(PersianTheme.shapes.full)
                        .indication(offsetInteractionSource, ripple())
                )
            }
        val indicator =
            @Composable {
                Box(
                    Modifier
                        .layoutId(IndicatorLayoutIdTag)
                        .graphicsLayer { alpha = animationProgress.value }
                        .background(
                            color = this@NavigationBarItem.colors.indicatorColor,
                            shape = PersianTheme.shapes.full,
                        )
                )
            }

        NavigationBarItemLayout(
            indicatorRipple = indicatorRipple,
            indicator = indicator,
            icon = styledIcon,
            label = styledLabel,
            alwaysShowLabel = alwaysShowLabel,
            animationProgress = { animationProgress.value },
        )
    }
}


/**
 * Base layout for a [NavigationBarItem].
 *
 * @param indicatorRipple indicator ripple for this item when it is selected
 * @param indicator indicator for this item when it is selected
 * @param icon icon for this item
 * @param label text label for this item
 * @param alwaysShowLabel whether to always show the label for this item. If false, the label will
 *   only be shown when this item is selected.
 * @param animationProgress progress of the animation, where 0 represents the unselected state of
 *   this item and 1 represents the selected state. This value controls other values such as
 *   indicator size, icon and label positions, etc.
 */
@Composable
private fun NavigationBarItemLayout(
    indicatorRipple: @Composable () -> Unit,
    indicator: @Composable () -> Unit,
    icon: @Composable () -> Unit,
    label: @Composable (() -> Unit)?,
    alwaysShowLabel: Boolean,
    animationProgress: () -> Float,
) {
    Layout({
        indicatorRipple()
        indicator()

        Box(Modifier.layoutId(IconLayoutIdTag)) { icon() }

        if (label != null) {
            Box(
                Modifier
                    .layoutId(LabelLayoutIdTag)
                    .graphicsLayer { alpha = if (alwaysShowLabel) 1f else animationProgress() }
                    .padding(horizontal = NavigationBarItemHorizontalPadding / 2)
            ) {
                label()
            }
        }
    }) { measurables, constraints ->
        @Suppress("NAME_SHADOWING") val animationProgress = animationProgress()
        val looseConstraints = constraints.copy(minWidth = 0, minHeight = 0)
        val iconPlaceable =
            measurables.fastFirst { it.layoutId == IconLayoutIdTag }.measure(looseConstraints)

        val totalIndicatorWidth =
            iconPlaceable.width + (IndicatorHorizontalPadding * 2).roundToPx()
        val animatedIndicatorWidth = (totalIndicatorWidth * animationProgress).roundToInt()
        val indicatorHeight = iconPlaceable.height + (IndicatorVerticalPadding * 2).roundToPx()
        val indicatorRipplePlaceable =
            measurables
                .fastFirst { it.layoutId == IndicatorRippleLayoutIdTag }
                .measure(
                    Constraints.fixed(
                        width = totalIndicatorWidth,
                        height = indicatorHeight
                    )
                )
        val indicatorPlaceable =
            measurables
                .fastFirstOrNull { it.layoutId == IndicatorLayoutIdTag }
                ?.measure(
                    Constraints.fixed(width = animatedIndicatorWidth, height = indicatorHeight)
                )

        val labelPlaceable =
            label?.let {
                measurables.fastFirst { it.layoutId == LabelLayoutIdTag }
                    .measure(looseConstraints)
            }

        if (label == null) {
            placeIcon(iconPlaceable, indicatorRipplePlaceable, indicatorPlaceable, constraints)
        } else {
            placeLabelAndIcon(
                labelPlaceable!!,
                iconPlaceable,
                indicatorRipplePlaceable,
                indicatorPlaceable,
                constraints,
                alwaysShowLabel,
                animationProgress
            )
        }
    }
}

/** Places the provided [Placeable]s in the center of the provided [constraints]. */
private fun MeasureScope.placeIcon(
    iconPlaceable: Placeable,
    indicatorRipplePlaceable: Placeable,
    indicatorPlaceable: Placeable?,
    constraints: Constraints
): MeasureResult {
    val width = constraints.maxWidth
    val height = constraints.constrainHeight(NavigationBarHeight.roundToPx())

    val iconX = (width - iconPlaceable.width) / 2
    val iconY = (height - iconPlaceable.height) / 2

    val rippleX = (width - indicatorRipplePlaceable.width) / 2
    val rippleY = (height - indicatorRipplePlaceable.height) / 2

    return layout(width, height) {
        indicatorPlaceable?.let {
            val indicatorX = (width - it.width) / 2
            val indicatorY = (height - it.height) / 2
            it.placeRelative(indicatorX, indicatorY)
        }
        iconPlaceable.placeRelative(iconX, iconY)
        indicatorRipplePlaceable.placeRelative(rippleX, rippleY)
    }
}

/**
 * Places the provided [Placeable]s in the correct position, depending on [alwaysShowLabel] and
 * [animationProgress].
 *
 * When [alwaysShowLabel] is true, the positions do not move. The [iconPlaceable] and
 * [labelPlaceable] will be placed together in the center with padding between them, according to
 * the spec.
 *
 * When [animationProgress] is 1 (representing the selected state), the positions will be the same
 * as above.
 *
 * Otherwise, when [animationProgress] is 0, [iconPlaceable] will be placed in the center, like in
 * [placeIcon], and [labelPlaceable] will not be shown.
 *
 * When [animationProgress] is animating between these values, [iconPlaceable] and [labelPlaceable]
 * will be placed at a corresponding interpolated position.
 *
 * [indicatorRipplePlaceable] and [indicatorPlaceable] will always be placed in such a way that to
 * share the same center as [iconPlaceable].
 *
 * @param labelPlaceable text label placeable inside this item
 * @param iconPlaceable icon placeable inside this item
 * @param indicatorRipplePlaceable indicator ripple placeable inside this item
 * @param indicatorPlaceable indicator placeable inside this item, if it exists
 * @param constraints constraints of the item
 * @param alwaysShowLabel whether to always show the label for this item. If true, icon and label
 *   positions will not change. If false, positions transition between 'centered icon with no label'
 *   and 'top aligned icon with label'.
 * @param animationProgress progress of the animation, where 0 represents the unselected state of
 *   this item and 1 represents the selected state. Values between 0 and 1 interpolate positions of
 *   the icon and label.
 */
private fun MeasureScope.placeLabelAndIcon(
    labelPlaceable: Placeable,
    iconPlaceable: Placeable,
    indicatorRipplePlaceable: Placeable,
    indicatorPlaceable: Placeable?,
    constraints: Constraints,
    alwaysShowLabel: Boolean,
    animationProgress: Float,
): MeasureResult {
    val contentHeight =
        iconPlaceable.height +
                IndicatorVerticalPadding.toPx() +
                NavigationBarIndicatorToLabelPadding.toPx() +
                labelPlaceable.height
    val contentVerticalPadding =
        ((constraints.minHeight - contentHeight) / 2).coerceAtLeast(IndicatorVerticalPadding.toPx())
    val height = contentHeight + contentVerticalPadding * 2

    // Icon (when selected) should be `contentVerticalPadding` from top
    val selectedIconY = contentVerticalPadding
    val unselectedIconY =
        if (alwaysShowLabel) selectedIconY else (height - iconPlaceable.height) / 2

    // How far the icon needs to move between unselected and selected states.
    val iconDistance = unselectedIconY - selectedIconY

    // The interpolated fraction of iconDistance that all placeables need to move based on
    // animationProgress.
    val offset = iconDistance * (1 - animationProgress)

    // Label should be fixed padding below icon
    val labelY =
        selectedIconY +
                iconPlaceable.height +
                IndicatorVerticalPadding.toPx() +
                NavigationBarIndicatorToLabelPadding.toPx()

    val containerWidth = constraints.maxWidth

    val labelX = (containerWidth - labelPlaceable.width) / 2
    val iconX = (containerWidth - iconPlaceable.width) / 2

    val rippleX = (containerWidth - indicatorRipplePlaceable.width) / 2
    val rippleY = selectedIconY - IndicatorVerticalPadding.toPx()

    return layout(containerWidth, height.roundToInt()) {
        indicatorPlaceable?.let {
            val indicatorX = (containerWidth - it.width) / 2
            val indicatorY = selectedIconY - IndicatorVerticalPadding.roundToPx()
            it.placeRelative(indicatorX, (indicatorY + offset).roundToInt(), 0f)
        }
        if (alwaysShowLabel || animationProgress != 0f) {
            labelPlaceable.placeRelative(labelX, (labelY + offset).roundToInt(), 1f)
        }
        iconPlaceable.placeRelative(iconX, (selectedIconY + offset).roundToInt(), 2f)
        indicatorRipplePlaceable.placeRelative(rippleX, (rippleY + offset).roundToInt(), 1f)
    }
}