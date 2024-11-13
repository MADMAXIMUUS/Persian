package io.github.madmaximuus.persian.counter

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.layoutId
import io.github.madmaximuus.persian.counter.utils.BadgeStyle
import io.github.madmaximuus.persian.counter.utils.LayoutId
import io.github.madmaximuus.persian.counter.utils.badgeMeasurePolicy

/**
 * A badge is useful for displaying important information or status updates in a compact and visually
 * appealing manner, providing users with quick and easy access to relevant data. It offers
 * a straightforward and effective method for conveying notifications, alerts, or achievements,
 * making it an essential tool for enhancing user experience.
 *
 * @param count The count to be displayed in the badge.
 * @param modifier The [Modifier] to be applied to this badge.
 * @param colors The color configurations for the badge.
 * @param sizes The size configurations for the badge.
 * @param content The content on which the badge will be displayed.
 */
@Composable
fun Badge(
    count: Int = 0,
    modifier: Modifier = Modifier,
    style: BadgeStyle = BadgeStyle.DOT,
    colors: CounterColors = CounterDefaults.errorColors(),
    sizes: CounterSizes = CounterDefaults.sizes(),
    content: @Composable (BoxScope.() -> Unit)
) = when (style) {
    BadgeStyle.DOT -> EmptyBadge(
        modifier = modifier,
        sizes = sizes,
        colors = colors,
        anchor = content
    )

    BadgeStyle.NUMBER -> BadgeImpl(
        modifier = modifier,
        count = count,
        colors = colors,
        sizes = sizes,
        content = content
    )
}

/**
 * Base implementation a badge with counter inside.
 *
 * @param count The count to be displayed in the badge.
 * @param colors The color configurations for the badge.
 * @param sizes The size configurations for the badge.
 * @param modifier The [Modifier] to be applied to this composable.
 * @param content The content to be displayed inside the badge. This is a composable lambda that
 * provides a [BoxScope] to define the content.
 */
@Composable
private fun BadgeImpl(
    count: Int,
    colors: CounterColors,
    sizes: CounterSizes,
    modifier: Modifier = Modifier,
    content: @Composable BoxScope.() -> Unit
) {
    Layout(
        content = {
            Box(
                modifier = Modifier.layoutId(LayoutId.ANCHOR),
                contentAlignment = Alignment.Center,
                content = content
            )
            CounterImpl(
                modifier = Modifier
                    .layoutId(LayoutId.BADGE),
                count = count,
                colors = colors,
                sizes = sizes
            )
        },
        modifier = modifier
            .wrapContentSize()
    ) { measurables, constraints ->
        badgeMeasurePolicy(
            scope = this,
            measurables = measurables,
            constraints = constraints,
            badgeRightOffset = sizes.badgeRightOffset.roundToPx(),
            badgeTopOffset = sizes.badgeTopOffset.roundToPx()
        )
    }
}

/**
 * Base implementation a badge without counter inside.
 *
 * @param colors The background color of the badge.
 * @param anchor The content to be displayed inside the badge. This is a composable lambda that
 * provides a [BoxScope] to define the content.
 * @param sizes The size configurations for the badge.
 * @param modifier The [Modifier] to be applied to this composable.
 */
@Composable
private fun EmptyBadge(
    colors: CounterColors,
    anchor: @Composable BoxScope.() -> Unit,
    sizes: CounterSizes,
    modifier: Modifier = Modifier,
) {
    Layout(
        content = {
            Box(
                modifier = Modifier.layoutId(LayoutId.ANCHOR),
                contentAlignment = Alignment.Center,
                content = anchor
            )
            Box(
                modifier = Modifier
                    .layoutId(LayoutId.BADGE)
                    .size(sizes.size)
                    .clip(sizes.shape)
                    .background(colors.containerColor)
            )
        },
        modifier = modifier
            .wrapContentSize(),
        measurePolicy = { measurables, constraints ->
            badgeMeasurePolicy(
                scope = this,
                measurables = measurables,
                constraints = constraints,
                badgeRightOffset = sizes.badgeRightOffset.roundToPx(),
                badgeTopOffset = sizes.badgeTopOffset.roundToPx()
            )
        }
    )
}