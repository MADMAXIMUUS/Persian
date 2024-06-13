package io.github.madmaximuus.persian.datePicker.view.grid

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import io.github.madmaximuus.persian.datePicker.view.DatePickerMonthCellColors
import io.github.madmaximuus.persian.datePicker.view.cells.PersianDatePickerDialogMonthCell
import io.github.madmaximuus.persian.datePicker.view.util.Constants
import io.github.madmaximuus.persian.foundation.PersianTheme

@Composable
internal fun PersianDatePickerDialogMonthGrid(
    monthLabels: Array<String>,
    currentMonth: Int,
    selectedMonth: Int,
    colors: DatePickerMonthCellColors,
    onMonthClick: (Int) -> Unit,
) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(Constants.MONTH_MODE_GRID_COLUMNS),
        verticalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size4),
        userScrollEnabled = false,
        horizontalArrangement = Arrangement.SpaceEvenly,
        content = {
            items(monthLabels.size) {
                PersianDatePickerDialogMonthCell(
                    month = monthLabels[it],
                    index = it,
                    enabled = true,
                    currentMonth = currentMonth == it,
                    selected = selectedMonth == it,
                    onMonthClick = onMonthClick,
                    colors = colors
                )
            }
        }
    )
}