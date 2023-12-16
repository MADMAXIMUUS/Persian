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
fun PersianBadge(
    modifier: Modifier = Modifier,
    colors: CounterColors = PersianCounterDefaults.colors(),
    sizes: CounterSizes = PersianCounterDefaults.sizes(),
    content: @Composable (BoxScope.() -> Unit)
) = PersianEmptyBadge(
    modifier = modifier,
    backgroundColor = colors.backgroundColor,
    sizes = sizes,
    anchor = content
)


@Composable
fun PersianBadge(
    count: Int,
    modifier: Modifier = Modifier,
    colors: CounterColors = PersianCounterDefaults.colors(),
    sizes: CounterSizes = PersianCounterDefaults.sizes(),
    content: @Composable (BoxScope.() -> Unit)
) = PersianBadgeImpl(
    modifier = modifier,
    count = count,
    colors = colors,
    sizes = sizes,
    anchor = content
)

@Composable
private fun PersianBadgeImpl(
    count: Int,
    colors: CounterColors,
    sizes: CounterSizes,
    modifier: Modifier = Modifier,
    anchor: @Composable BoxScope.() -> Unit
) {
    Layout(
        content = {
            Box(
                modifier = Modifier.layoutId(LayoutId.ANCHOR),
                contentAlignment = Alignment.Center,
                content = anchor
            )
            PersianCounter(
                modifier = Modifier.layoutId(LayoutId.BADGE),
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
private fun PersianEmptyBadge(
    backgroundColor: Color,
    anchor: @Composable BoxScope.() -> Unit,
    sizes: CounterSizes,
    modifier: Modifier = Modifier,
) {
    Layout(
        {
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