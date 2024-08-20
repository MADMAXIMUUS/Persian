package io.github.madmaximuus.persian.pageIndicator

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.surface.Surface

@Composable
fun PersianPageIndicator(
    pagerState: PagerState,
    modifier: Modifier = Modifier,
    orientation: IndicatorOrientation = IndicatorOrientation.HORIZONTAL,
    style: IndicatorStyle = IndicatorStyle.LINE,
    visibleIndicatorCount: Int = 5,
    colors: PageIndicatorColors = PageIndicatorDefaults.indicatorColor()
) {
    val space = when (style) {
        IndicatorStyle.DOT -> PersianTheme.spacing.size8
        IndicatorStyle.LINE -> PersianTheme.spacing.size4
    }
    val correctedIndicatorCount =
        if (visibleIndicatorCount > pagerState.pageCount) pagerState.pageCount
        else if (visibleIndicatorCount % 2 == 0 && visibleIndicatorCount != pagerState.pageCount) visibleIndicatorCount - 1
        else visibleIndicatorCount

    val listState = rememberLazyListState()

    val totalWidth: Dp = 24.dp * correctedIndicatorCount + space * (correctedIndicatorCount - 1)
    val widthInPx = LocalDensity.current.run { 24.dp.toPx() }

    val currentItem by remember {
        derivedStateOf {
            pagerState.currentPage
        }
    }

    val itemCount = pagerState.pageCount

    LaunchedEffect(key1 = currentItem) {
        val viewportSize = listState.layoutInfo.viewportSize
        when (orientation) {
            IndicatorOrientation.HORIZONTAL -> listState.animateScrollToItem(
                currentItem,
                (widthInPx / 2 - viewportSize.width / 2).toInt()
            )

            IndicatorOrientation.VERTICAL -> listState.animateScrollToItem(
                currentItem,
                (widthInPx / 2 - viewportSize.height / 2).toInt()
            )
        }
    }

    val height = when (style) {
        IndicatorStyle.DOT -> 24.dp
        IndicatorStyle.LINE -> 4.dp
    }
    when (orientation) {
        IndicatorOrientation.HORIZONTAL -> {
            LazyRow(
                modifier = modifier
                    .width(totalWidth)
                    .height(height),
                state = listState,
                horizontalArrangement = Arrangement.spacedBy(space),
                userScrollEnabled = false
            ) {
                when (style) {
                    IndicatorStyle.DOT -> persianPageDotIndicatorItem(
                        itemCount,
                        currentItem,
                        correctedIndicatorCount,
                        colors
                    )

                    IndicatorStyle.LINE -> persianPageLineIndicatorItem(
                        itemCount,
                        currentItem,
                        colors
                    )
                }

            }
        }

        IndicatorOrientation.VERTICAL -> {
            LazyColumn(
                modifier = modifier
                    .width(24.dp)
                    .height(totalWidth),
                state = listState,
                verticalArrangement = Arrangement.spacedBy(space),
                userScrollEnabled = false
            ) {
                persianPageDotIndicatorItem(
                    itemCount,
                    currentItem,
                    correctedIndicatorCount,
                    colors
                )
            }
        }
    }
}

enum class IndicatorOrientation {
    HORIZONTAL, VERTICAL
}

enum class IndicatorStyle {
    DOT, LINE
}

@Preview
@Preview(uiMode = UI_MODE_NIGHT_YES)
@Composable
fun PageIndicatorPreview() {
    PersianTheme {
        Surface {
            PersianPageIndicator(
                pagerState = rememberPagerState {
                    6
                },
                style = IndicatorStyle.LINE
            )
        }
    }
}