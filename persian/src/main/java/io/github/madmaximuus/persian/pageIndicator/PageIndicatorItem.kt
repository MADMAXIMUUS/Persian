package io.github.madmaximuus.persian.pageIndicator

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.PersianTheme


internal fun LazyListScope.persianPageDotIndicatorItem(
    itemCount: Int,
    currentItem: Int,
    visibleIndicatorCount: Int,
    colors: PageIndicatorColors
) {
    items(itemCount) { index ->

        val isSelected = (index == currentItem)

        val centerItemIndex = visibleIndicatorCount / 2

        val right1 =
            currentItem < centerItemIndex &&
                    index >= visibleIndicatorCount - 1 &&
                    itemCount != visibleIndicatorCount

        val right2 =
            currentItem >= centerItemIndex &&
                    index >= currentItem + centerItemIndex &&
                    index < itemCount - centerItemIndex + 1 &&
                    itemCount != visibleIndicatorCount &&
                    index != itemCount - 1

        val isRightEdgeItem = right1 || right2

        val isLeftEdgeItem =
            index <= currentItem - centerItemIndex &&
                    currentItem > centerItemIndex &&
                    index < itemCount - visibleIndicatorCount + 1 &&
                    itemCount != visibleIndicatorCount


        Box(
            modifier = Modifier
                .size(24.dp),
            contentAlignment = Alignment.Center
        ) {
            Box(
                modifier = Modifier
                    .graphicsLayer {
                        val scale = if (isSelected) {
                            1f
                        } else if (isLeftEdgeItem || isRightEdgeItem) {
                            .7f
                        } else {
                            1f
                        }
                        scaleX = scale
                        scaleY = scale
                    }
                    .size(12.dp)
                    .clip(PersianTheme.shapes.full)
                    .background(
                        colors.indicatorColor(isSelected).value
                    )
            )
        }
    }
}

internal fun LazyListScope.persianPageLineIndicatorItem(
    itemCount: Int,
    currentItem: Int,
    colors: PageIndicatorColors
) {
    items(itemCount) { index ->

        val isSelected = (index == currentItem)
        Box(
            modifier = Modifier
                .width(24.dp)
                .height(4.dp)
                .clip(PersianTheme.shapes.full)
                .background(
                    colors.indicatorColor(isSelected).value
                )
        )
    }
}