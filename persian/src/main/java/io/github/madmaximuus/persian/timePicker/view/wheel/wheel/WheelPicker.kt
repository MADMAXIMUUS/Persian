package io.github.madmaximuus.persian.timePicker.view.wheel.wheel

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.flow.drop
import kotlinx.coroutines.flow.filter

/**
 * Composable function to display a vertical wheel picker.
 *
 * This function creates a vertical wheel picker with a specified number of items. It uses a
 * [LazyColumn] to display the items and handles scrolling and snapping behavior.
 *
 * @param modifier The modifier to apply to the vertical wheel picker.
 * @param count The number of items in the wheel picker.
 * @param state The state of the lazy list.
 * @param onScrollFinish The callback to invoke when scrolling finishes.
 * @param content The content to display for each item in the wheel picker.
 */
@Composable
internal fun VerticalWheelPicker(
    modifier: Modifier = Modifier,
    count: Int,
    state: LazyListState = rememberLazyListState(),
    onScrollFinish: (index: Int) -> Unit,
    content: @Composable BoxScope.(index: Int, isCenterItem: Boolean) -> Unit
) {
    val itemHeight = 36.dp
    val visibleItemCount = 3

    val itemHalfHeightToPx = with(LocalDensity.current) { itemHeight.toPx() / 2 }

    val currentOnScrollFinish by rememberUpdatedState(onScrollFinish)

    LaunchedEffect(state.isScrollInProgress) {
        if (!state.isScrollInProgress && state.firstVisibleItemScrollOffset != 0) {
            if (state.firstVisibleItemScrollOffset < itemHalfHeightToPx) {
                state.animateScrollToItem(state.firstVisibleItemIndex)
            } else if (state.firstVisibleItemScrollOffset > itemHalfHeightToPx) {
                state.animateScrollToItem(state.firstVisibleItemIndex + 1)
            }
        }
    }

    LaunchedEffect(state) {
        snapshotFlow { state.isScrollInProgress }
            .filter { !it && state.firstVisibleItemScrollOffset == 0 }
            .drop(1)
            .collect { currentOnScrollFinish(state.firstVisibleItemIndex) }
    }

    LazyColumn(
        modifier = modifier.height(itemHeight * visibleItemCount),
        state = state,
        contentPadding = PaddingValues(vertical = itemHeight * (visibleItemCount / 2))
    ) {
        items(count = count, key = { it }) { index ->
            Box(
                modifier = Modifier
                    .height(itemHeight),
                contentAlignment = Alignment.Center
            ) {
                content(index, index == state.firstVisibleItemIndex)
            }
        }
    }
}