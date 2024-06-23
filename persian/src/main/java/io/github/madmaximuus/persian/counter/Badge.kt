package io.github.madmaximuus.persian.counter

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.counter.utils.LayoutId
import io.github.madmaximuus.persian.counter.utils.badgeMeasurePolicy

@Composable
fun Badge(
    modifier: Modifier = Modifier,
    colors: CounterColors = CounterDefaults.badgeColors(),
    sizes: CounterSizes = CounterDefaults.badgeSizes(),
    content: @Composable (BoxScope.() -> Unit)
) = EmptyBadge(
    modifier = modifier,
    backgroundColor = colors.backgroundColor,
    sizes = sizes,
    anchor = content
)


@Composable
fun Badge(
    count: Int,
    modifier: Modifier = Modifier,
    colors: CounterColors = CounterDefaults.badgeColors(),
    sizes: CounterSizes = CounterDefaults.digitSizes(),
    content: @Composable (BoxScope.() -> Unit)
) = BadgeImpl(
    modifier = modifier,
    count = count,
    colors = colors,
    sizes = sizes,
    content = content
)

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
            Counter(
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
            badgeHorizontalOffset = sizes.badgeHorizontalOffset.roundToPx(),
            badgeWithContentVerticalOffset = sizes.badgeVerticalOffset.roundToPx()
        )
    }
}

@Composable
private fun EmptyBadge(
    backgroundColor: Color,
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
                    .size(8.dp)
                    .clip(CircleShape)
                    .background(backgroundColor)
            )
        },
        modifier = modifier
            .wrapContentSize(),
        measurePolicy = { measurables, constraints ->
            badgeMeasurePolicy(
                scope = this,
                measurables = measurables,
                constraints = constraints,
                badgeHorizontalOffset = sizes.badgeHorizontalOffset.roundToPx(),
                badgeWithContentVerticalOffset = sizes.badgeVerticalOffset.roundToPx()
            )
        }
    )
}