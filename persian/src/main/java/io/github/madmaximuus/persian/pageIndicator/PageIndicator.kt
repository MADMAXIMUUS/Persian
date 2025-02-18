package io.github.madmaximuus.persian.pageIndicator

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.pager.PagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.pageIndicator.IndicatorOrientation.HORIZONTAL
import io.github.madmaximuus.persian.pageIndicator.IndicatorOrientation.VERTICAL
import io.github.madmaximuus.persian.pageIndicator.IndicatorStyle.DOT
import io.github.madmaximuus.persian.pageIndicator.IndicatorStyle.LINE

/**
 * A page indicator is useful for showing the current position within a sequence of pages,
 * providing users with a clear and visual cue of their progress. It offers a straightforward
 * and effective method for enhancing navigation and orientation, making it an essential tool
 * for improving user experience and usability.
 *
 * @param pagerState The state of the pager, containing information about the current page and total pages.
 * @param modifier The modifier to be applied to the indicator.
 * @param style The style of the indicator (dot or line).
 * @param visibleIndicatorCount The number of indicators that are visible at a time.
 * @param colors The colors to be used for the indicators.
 */
@Composable
fun PageIndicator(
    pagerState: PagerState,
    modifier: Modifier = Modifier,
    style: IndicatorStyle = LINE,
    visibleIndicatorCount: Int = 5,
    colors: PageIndicatorColors = PageIndicatorDefaults.indicatorColor()
) {
    val space = when (style) {
        DOT -> PersianTheme.spacing.size8
        LINE -> PersianTheme.spacing.size4
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
        listState.animateScrollToItem(
            currentItem,
            (widthInPx / 2 - viewportSize.width / 2).toInt()
        )
    }

    val height = when (style) {
        DOT -> 24.dp
        LINE -> 4.dp
    }
    LazyRow(
        modifier = modifier
            .width(totalWidth)
            .height(height),
        state = listState,
        horizontalArrangement = Arrangement.spacedBy(space),
        userScrollEnabled = false
    ) {
        when (style) {
            DOT -> persianPageDotIndicatorItem(
                itemCount,
                currentItem,
                correctedIndicatorCount,
                colors
            )

            LINE -> persianPageLineIndicatorItem(
                itemCount,
                currentItem,
                colors
            )
        }

    }
}

/**
 * Enum class representing the orientation of the page indicator.
 *
 * @property HORIZONTAL Indicates that the page indicator is displayed horizontally.
 * @property VERTICAL Indicates that the page indicator is displayed vertically.
 */
enum class IndicatorOrientation {
    HORIZONTAL, VERTICAL
}

/**
 * Enum class representing the style of the page indicator.
 *
 * @property DOT Indicates that the page indicator is displayed as a dot.
 * @property LINE Indicates that the page indicator is displayed as a line.
 */
enum class IndicatorStyle {
    DOT, LINE
}