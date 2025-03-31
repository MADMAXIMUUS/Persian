package io.github.madmaximuus.persian.colorPicker.view.toolsPanel

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.colorPicker.view.util.ColorPickerState
import io.github.madmaximuus.persian.colorPicker.view.util.ColorPreferences
import io.github.madmaximuus.persian.colorPicker.view.util.resolveColor
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.icon.Icon
import io.github.madmaximuus.persian.icon.IconDefaults
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols
import io.github.madmaximuus.persianSymbols.plus.Plus
import kotlinx.coroutines.launch

/**
 * A composable function that represents a view for displaying saved colors in a horizontal list.
 *
 * This function displays a lazy row of saved colors, allowing the user to interact with them.
 * Each color is displayed in a grid cell, and the user can click to select a color or long-press to remove it.
 * The view also includes an option to add a new color.
 * The state of the saved colors and the selected color is managed by the provided [state].
 *
 * @param modifier The modifier to be applied to the layout.
 * @param lazyRowState The state of the lazy row, which manages the scrolling behavior.
 * @param colorPreferences The preferences for saving colors, which handles the persistence of saved colors.
 * @param state The state of the color picker, which contains information about the saved colors, selected color, and other configurations.
 */
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun RowScope.SavedColorView(
    modifier: Modifier = Modifier,
    lazyRowState: LazyListState = rememberLazyListState(),
    colorPreferences: ColorPreferences,
    state: ColorPickerState,
) {
    val scope = rememberCoroutineScope()
    var size by remember { mutableStateOf(IntSize.Zero) }
    val widthDp = with(LocalDensity.current) { size.width.toDp() }
    val itemPerPageRow = (widthDp / (34.dp + 16.dp)).toInt()
    val itemWidth = 34.dp * itemPerPageRow
    val itemWidthHalf = with(LocalDensity.current) { itemWidth.toPx() / 2 }

    LaunchedEffect(lazyRowState.isScrollInProgress) {
        if (!lazyRowState.isScrollInProgress && lazyRowState.firstVisibleItemScrollOffset != 0) {
            if (lazyRowState.firstVisibleItemScrollOffset < itemWidthHalf) {
                lazyRowState.animateScrollToItem(lazyRowState.firstVisibleItemIndex)
            } else if (lazyRowState.firstVisibleItemScrollOffset > itemWidthHalf) {
                lazyRowState.animateScrollToItem(lazyRowState.firstVisibleItemIndex + 1)
            }
        }
    }

    LaunchedEffect(state.savedColors) {
        scope.launch {
            colorPreferences.saveColors(
                state.savedColors.toMutableList().apply {
                    remove(Color.Unspecified)
                }
            )
        }
    }

    val pages = state.savedColors.chunked(if (itemPerPageRow == 0) 1 else itemPerPageRow * 2)

    LazyRow(
        modifier = modifier
            .height(88.dp)
            .weight(1f)
            .onSizeChanged { size = it },
        state = lazyRowState
    ) {
        items(pages.size, key = { it }) { page ->
            LazyVerticalGrid(
                modifier = Modifier
                    .fillParentMaxSize(),
                columns = GridCells.FixedSize(34.dp),
                horizontalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size16),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                items(pages[page]) { item ->
                    if (item == Color.Unspecified) {
                        Box(
                            modifier = Modifier
                                .size(34.dp)
                                .background(
                                    color = PersianTheme.colorScheme.surfaceContainer,
                                    shape = PersianTheme.shapes.full
                                )
                                .border(
                                    width = 0.5.dp,
                                    color = PersianTheme.colorScheme.outlineVariant,
                                    shape = PersianTheme.shapes.full
                                )
                                .clip(PersianTheme.shapes.full)
                                .clickable {
                                    state.saveColor()
                                },
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                painter = rememberVectorPainter(PersianSymbols.Default.Plus),
                                sizes = IconDefaults.size24(),
                                tint = PersianTheme.colorScheme.onSecondaryContainer
                            )
                        }
                    } else {
                        val dotRadius by animateDpAsState(
                            targetValue = if (item == state.selectedColor) 22.dp else 34.dp,
                            animationSpec = tween(durationMillis = 350),
                            label = ""
                        )
                        val baseModifier = Modifier
                            .size(34.dp)
                            .clip(PersianTheme.shapes.full)
                            .combinedClickable(
                                onClick = {
                                    val newColor = resolveColor(item)
                                    state.colorHueState = newColor.first
                                    state.colorSaturationState = newColor.second
                                    state.colorValueState = newColor.third
                                    state.alpha = item.alpha
                                },
                                onLongClick = {
                                    state.removeColor(item)
                                },
                                role = Role.RadioButton
                            )
                        val borderModifier = if (item == state.selectedColor) baseModifier.border(
                            width = 3.dp,
                            color = item,
                            shape = PersianTheme.shapes.full
                        )
                        else baseModifier
                        Box(
                            modifier = borderModifier,
                            contentAlignment = Alignment.Center
                        ) {
                            Box(
                                modifier = Modifier
                                    .size(dotRadius)
                                    .background(item, PersianTheme.shapes.full)
                                    .clip(PersianTheme.shapes.full)
                            )
                        }
                    }
                }
            }
        }
    }
}