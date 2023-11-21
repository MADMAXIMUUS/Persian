package io.github.madmaximuus.persian.datePickerDIalog.grid

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyGridState
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import io.github.madmaximuus.persian.datePickerDIalog.cells.PersianDatePickerDialogYearCell
import io.github.madmaximuus.persian.datePickerDIalog.util.Constants
import io.github.madmaximuus.persian.foundation.spacing

@Composable
internal fun PersianDatePickerDialogYearGrid(
    yearsRange: ClosedRange<Int>,
    yearListState: LazyGridState,
    currentYear: Int,
    selectedYear: Int,
    onYearClick: (Int) -> Unit,
) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(Constants.YEAR_MODE_GRID_COLUMNS),
        verticalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.extraSmall),
        horizontalArrangement = Arrangement.SpaceEvenly,
        state = yearListState,
        content = {
            items(yearsRange.endInclusive.minus(yearsRange.start)) {
                PersianDatePickerDialogYearCell(
                    year = (yearsRange.start + it).toString(),
                    index = it,
                    currentYear = currentYear == yearsRange.start + it,
                    selected = selectedYear == yearsRange.start + it,
                    onYearClick = onYearClick
                )
            }
        }
    )
}
