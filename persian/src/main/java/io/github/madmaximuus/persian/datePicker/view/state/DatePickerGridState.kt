package io.github.madmaximuus.persian.datePicker.view.state

import android.icu.util.Calendar

/**
 * A data class that represents the state of a grid in a date picker.
 *
 * This class holds the month, year, and calendar information for a specific grid state in the date picker.
 *
 * @property month The month represented by this grid state, defaulting to January (1).
 * @property year The year represented by this grid state, defaulting to 1970.
 * @property calendar The calendar instance representing the date for this grid state.
 */
data class DatePickerGridState(
    val month: Int = 1,
    val year: Int = 1970,
    val calendar: Calendar
)