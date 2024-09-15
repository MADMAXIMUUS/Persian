package io.github.madmaximuus.persian.datePicker.view.grid

import androidx.compose.runtime.Composable
import io.github.madmaximuus.persian.datePicker.view.util.DatePickerDisplayMode

@Composable
internal fun DatePickerDialogRootGrid(
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