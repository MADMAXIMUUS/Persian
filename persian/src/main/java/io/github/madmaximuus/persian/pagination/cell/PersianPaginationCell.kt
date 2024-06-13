package io.github.madmaximuus.persian.pagination.cell

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.pagination.PaginationColors
import io.github.madmaximuus.persian.text.Text

internal fun LazyListScope.persianPaginationCell(
    itemCount: Int,
    currentItem: Int,
    visibleItemCount: Int,
    enabled: Boolean,
    textStyle: TextStyle,
    colors: PaginationColors,
    modifier: Modifier = Modifier,
    showEndPage: Boolean,
    onClick: (Int) -> Unit
) {
    items(itemCount) { index ->

        val selected = (index == currentItem)

        val centerItemIndex = visibleItemCount / 2

        val right1 =
            (currentItem < centerItemIndex &&
                    index >= visibleItemCount - 1) &&
                    itemCount != visibleItemCount

        val right2 =
            (currentItem >= centerItemIndex &&
                    index >= currentItem + centerItemIndex &&
                    index < itemCount - centerItemIndex + 1)

        val isLeftEdgeItem =
            index <= currentItem - centerItemIndex &&
                    currentItem > centerItemIndex &&
                    index < itemCount - visibleItemCount + 1 &&
                    itemCount != visibleItemCount


        val isMore = right1 || right2 || isLeftEdgeItem


        val backgroundColor = colors.containerColor(selected = selected, enabled = enabled).value
        val textColor = when {
            isMore -> colors.moreColor(enabled = enabled).value
            else -> colors.numberColor(selected = selected, enabled = enabled).value
        }

        Box(
            modifier = modifier
                .size(36.dp, 40.dp)
                .clip(shape = PersianTheme.shapes.shape8)
                .background(backgroundColor, shape = PersianTheme.shapes.shape8)
                .clickable { onClick(index) },
            contentAlignment = Alignment.Center
        ) {
            Text(
                modifier = Modifier,
                text = if (isMore) "..." else (index + 1).toString(),
                style = textStyle,
                color = textColor
            )
        }
    }
}