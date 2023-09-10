package ru.rabbit.persian.counter

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.rabbit.persian.counter.utils.LayoutId
import ru.rabbit.persian.counter.utils.badgeMeasurePolicy
import ru.rabbit.persian.foundation.PersianComponentStyle
import ru.rabbit.persian.foundation.PersianTheme
import ru.rabbit.persian.foundation.icons
import ru.rabbit.persian.iconButtons.PersianIconButton

object PersianBadge {

    @Composable
    fun Primary(
        modifier: Modifier = Modifier,
        colors: CounterColors = PersianCounterColors.default(),
        sizes: CounterSizes = PersianCounterSizes.medium(),
        content: @Composable (BoxScope.() -> Unit)
    ) = PersianEmptyBadge(
        modifier = modifier,
        backgroundColor = colors.backgroundColor,
        sizes = sizes,
        anchor = content
    )


    @Composable
    fun Primary(
        count: Int,
        modifier: Modifier = Modifier,
        sizes: CounterSizes = PersianCounterSizes.medium(),
        colors: CounterColors = PersianCounterColors.default(),
        content: @Composable (BoxScope.() -> Unit)
    ) = PersianBadgeImpl(
        modifier = modifier,
        count = count,
        colors = colors,
        sizes = sizes,
        anchor = content
    )
}

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
            PersianCounter.Default(
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

@Preview
@Composable
fun BadgePreview() {
    PersianTheme {
        Surface(
            modifier = Modifier
                .fillMaxSize()
        ) {
            PersianBadge.Primary(
                modifier = Modifier,
                sizes = PersianCounterSizes.medium(
                    badgeHorizontalOffset = (-12).dp,
                    badgeVerticalOffset = 15.dp
                )
            ) {
                PersianIconButton.Primary(
                    icon = MaterialTheme.icons.share,
                    style = PersianComponentStyle.STANDARD,
                    onClick = {}
                )
            }
        }
    }
}

@Preview
@Composable
fun CounterPreview() {
    PersianTheme {
        Surface{
            PersianCounter.Tonal(
                count = 100
            )
        }
    }
}