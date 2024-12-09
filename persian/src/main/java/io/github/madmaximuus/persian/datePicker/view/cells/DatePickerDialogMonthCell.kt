package io.github.madmaximuus.persian.datePicker.view.cells

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.datePicker.view.DatePickerMonthCellColors
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.text.Text

/**
 * A composable function that represents a month cell in a date picker dialog.
 *
 * @param month The name of the month to be displayed.
 * @param index The index of the month in the list of months.
 * @param enabled A boolean indicating whether the month cell is enabled.
 * @param selected A boolean indicating whether the month cell is selected.
 * @param currentMonth A boolean indicating whether the month cell represents the current month.
 * @param colors The colors to be used for the month cell, including container, content, and indicator colors.
 * @param onMonthClick A callback function that is invoked when the month cell is clicked.
 * @param modifier The modifier to be applied to the composable.
 */
@Composable
internal fun DatePickerDialogMonthCell(
    month: String,
    index: Int,
    enabled: Boolean,
    selected: Boolean,
    currentMonth: Boolean,
    colors: DatePickerMonthCellColors,
    onMonthClick: (Int) -> Unit,
    modifier: Modifier = Modifier
) {

    var todayIndicatorSize by remember { mutableStateOf(IntSize.Zero) }
    val sizeDp = with(LocalDensity.current) { todayIndicatorSize.width.toDp() }

    Column(
        modifier = modifier
            .background(
                color = colors.containerColor(selected = selected).value,
                shape = PersianTheme.shapes.shape12
            )
            .clip(PersianTheme.shapes.shape12)
            .clickable(enabled = enabled) { onMonthClick(index) }
            .padding(
                horizontal = PersianTheme.spacing.size4,
                vertical = PersianTheme.spacing.size8
            )
            .onSizeChanged {
                todayIndicatorSize = it
            },
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = month,
            style = PersianTheme.typography.labelMedium,
            color = colors.contentColor(selected = selected, enabled = enabled).value
        )
        Box(
            modifier = Modifier
                .padding(top = PersianTheme.spacing.size2)
                .width(sizeDp * 0.6f)
                .height(2.dp)
                .background(
                    color = colors.indicatorColor(selected = selected, currentMonth).value,
                    shape = PersianTheme.shapes.shape4
                )
        )
    }
}