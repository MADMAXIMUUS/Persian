package io.github.madmaximuus.persian.pageIndicator

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Surface
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

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun PersianPageIndicator(
    pagerState: PagerState,
    modifier: Modifier = Modifier,
    orientation: IndicatorOrientation = IndicatorOrientation.HORIZONTAL,
    visibleIndicatorCount: Int = 5,
    space: Dp = PersianTheme.spacing.size8,
    colors: PageIndicatorColors = PersianPageIndicatorDefaults.indicatorColor()
) {

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

    when (orientation) {
        IndicatorOrientation.HORIZONTAL -> {
            LazyRow(
                modifier = modifier
                    .width(totalWidth)
                    .height(24.dp),
                state = listState,
                horizontalArrangement = Arrangement.spacedBy(space),
                userScrollEnabled = false
            ) {
                persianPageIndicatorItem(
                    itemCount,
                    currentItem,
                    correctedIndicatorCount,
                    colors
                )
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
                persianPageIndicatorItem(
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

@OptIn(ExperimentalFoundationApi::class)
@Preview
@Composable
fun PageIndicatorPreview() {
    PersianTheme {
        Surface {
            PersianPageIndicator(
                pagerState = rememberPagerState {
                    3
                },
                orientation = IndicatorOrientation.VERTICAL
            )
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Preview(uiMode = UI_MODE_NIGHT_YES)
@Composable
fun PageIndicatorDarkPreview() {
    PersianTheme {
        Surface {
            PersianPageIndicator(
                pagerState = rememberPagerState {
                    3
                })
        }
    }
}