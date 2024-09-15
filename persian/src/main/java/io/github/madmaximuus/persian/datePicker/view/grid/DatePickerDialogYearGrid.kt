package io.github.madmaximuus.persian.datePicker.view.grid

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyGridState
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import io.github.madmaximuus.persian.datePicker.view.DatePickerYearCellColors
import io.github.madmaximuus.persian.datePicker.view.cells.PersianDatePickerDialogYearCell
import io.github.madmaximuus.persian.datePicker.view.util.Constants
import io.github.madmaximuus.persian.foundation.PersianTheme

@Composable
internal fun DatePickerDialogYearGrid(
    yearsRange: ClosedRange<Int>,
    yearListState: LazyGridState,
    currentYear: Int,
    selectedYear: Int,
    colors: DatePickerYearCellColors,
    onYearClick: (Int) -> Unit,
) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(Constants.YEAR_MODE_GRID_COLUMNS),
        verticalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size4),
        horizontalArrangement = Arrangement.SpaceEvenly,
        state = yearListState,
        content = {
            items(yearsRange.endInclusive.minus(yearsRange.start)) {
                PersianDatePickerDialogYearCell(
                    year = (yearsRange.start + it).toString(),
                    index = it,
                    currentYear = currentYear == yearsRange.start + it,
                    selected = selectedYear == yearsRange.start + it,
                    colors = colors,
                    onYearClick = onYearClick
                )
            }
        }
    )
}
