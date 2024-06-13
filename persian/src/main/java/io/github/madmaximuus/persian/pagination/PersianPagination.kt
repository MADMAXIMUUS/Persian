package io.github.madmaximuus.persian.pagination

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.iconButtons.PersianIconButtonDefaults
import io.github.madmaximuus.persian.iconButtons.PersianTertiaryIconButton
import io.github.madmaximuus.persian.pagination.cell.persianPaginationCell
import io.github.madmaximuus.persian.surface.Surface
import io.github.madmaximuus.persianSymbols.chevronLeft.base.ChevronLeft
import io.github.madmaximuus.persianSymbols.chevronRight.base.ChevronRight
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

@Composable
fun PersianPagination(
    state: PersianPaginationState,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    showEndPage: Boolean = true,
    colors: PaginationColors = PersianPaginationDefaults.colors(),
    numberTextStyle: TextStyle = PersianTheme.typography.bodyMedium
) {
    val lazyListState = rememberLazyListState()

    val widthInPx = LocalDensity.current.run { 36.dp.toPx() }

    var visibleItemCount by remember {
        mutableIntStateOf(0)
    }

    LaunchedEffect(key1 = state.currentPosition) {
        val viewportSize = lazyListState.layoutInfo.viewportSize
        visibleItemCount = (viewportSize.width / widthInPx).toInt()
        lazyListState.animateScrollToItem(
            state.currentPosition,
            (widthInPx / 2 - viewportSize.width / 2).toInt()
        )
    }

    Row(
        modifier = modifier
            .padding(horizontal = PersianTheme.spacing.size12),
        horizontalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size8),
        verticalAlignment = Alignment.CenterVertically
    ) {
        PersianTertiaryIconButton(
            icon = rememberVectorPainter(image = PersianSymbols.Default.ChevronLeft),
            enabled = !state.isPrevDisabled && enabled,
            colors = PersianIconButtonDefaults.tertiaryIconButtonColors(
                contentColor = PersianTheme.colorScheme.onSurface
            ),
            onClick = state::prevPage
        )
        LazyRow(
            modifier = Modifier
                .weight(1f),
            state = lazyListState,
            userScrollEnabled = false
        ) {
            persianPaginationCell(
                itemCount = state.pageCount,
                visibleItemCount = visibleItemCount,
                currentItem = state.currentPosition,
                enabled = enabled,
                textStyle = numberTextStyle,
                colors = colors,
                showEndPage = showEndPage
            ) { index ->
                state.goToPage(index)
            }
        }
        PersianTertiaryIconButton(
            icon = rememberVectorPainter(image = PersianSymbols.Default.ChevronRight),
            enabled = !state.isNextDisabled && enabled,
            colors = PersianIconButtonDefaults.tertiaryIconButtonColors(
                contentColor = PersianTheme.colorScheme.onSurface
            ),
            onClick = state::nextPage
        )
    }
}

@Preview
@Composable
fun PaginationPreview() {
    PersianTheme {
        Surface {
            PersianPagination(
                state = rememberPaginationState(pageCount = 100)
            )
        }
    }
}

@Preview(uiMode = UI_MODE_NIGHT_YES)
@Composable
fun PaginationDarkPreview() {
    PersianTheme {
        Surface {
            PersianPagination(
                state = rememberPaginationState(pageCount = 100)
            )
        }
    }
}