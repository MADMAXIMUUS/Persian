package io.github.madmaximuus.persian.datePickerDIalog.grid

import androidx.compose.runtime.Composable
import io.github.madmaximuus.persian.datePickerDIalog.util.DatePickerDisplayMode

internal object PersianDatePickerDialogRootGrid {

    @Composable
    fun Primary(
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
}