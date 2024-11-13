package io.github.madmaximuus.persian.datePicker.view.grid

import androidx.compose.runtime.Composable
import io.github.madmaximuus.persian.datePicker.view.util.DatePickerDisplayMode

/**
 * A composable function that represents the root grid for a date picker dialog.
 *
 * This function displays the appropriate grid (calendar, month, or year) based on the provided [mode].
 * The appearance and behavior of the grid are determined by the composable functions passed as parameters.
 *
 * @param mode The display mode for the date picker, which can be CALENDAR, MONTH, or YEAR.
 * @param calendarGrid A composable function that represents the calendar grid.
 * @param monthGrid A composable function that represents the month grid.
 * @param yearGrid A composable function that represents the year grid.
 */
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