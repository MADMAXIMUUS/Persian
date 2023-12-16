package io.github.madmaximuus.persian.datePickerDIalog.grid

import androidx.compose.runtime.Composable
import io.github.madmaximuus.persian.datePickerDIalog.util.DatePickerDisplayMode

@Composable
internal fun PersianDatePickerDialogRootGrid(
    mode: DatePickerDisplayMode,
    calendarGrid: @Composable () -> Unit,
    monthGrid: @Composable () -> Unit,
    yearGrid: @Composable () -> Unit
) {
    when (mode) {
        DatePickerDisplayMode.CALENDAR -> {
            calendarGrid()
        }

        DatePickerDisplayMode.MONTH -> {
            monthGrid()
        }

        DatePickerDisplayMode.YEAR -> {
            yearGrid()
        }
    }
}