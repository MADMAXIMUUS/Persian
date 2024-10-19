package io.github.madmaximuus.persian.datePicker.view.util

import android.icu.util.Calendar

/**
 * Sealed class representing different types of date picker selections.
 */
sealed class DatePickerSelection {

    /**
     * Represents a selection of a single date.
     *
     * @property selectedDate The selected date. Default is `null`.
     * @property onDateSelected Callback invoked when a date is selected.
     */
    class Date(
        val selectedDate: Calendar? = null,
        val onDateSelected: (date: Calendar) -> Unit
    ) : DatePickerSelection()

    /**
     * Represents a selection of multiple dates.
     *
     * @property selectedDates The list of selected dates. Default is `null`.
     * @property onDatesSelected Callback invoked when dates are selected.
     */
    class Dates(
        val selectedDates: List<Calendar>? = null,
        val onDatesSelected: (dates: List<Calendar>) -> Unit
    ) : DatePickerSelection()

    /**
     * Represents a selection of a date range.
     *
     * @property selectedRange The range of selected dates. Default is `null`.
     * @property onRangeSelected Callback invoked when a range is selected.
     */
    class Period(
        val selectedRange: ClosedRange<Calendar>? = null,
        val onRangeSelected: (startDate: Calendar, endDate: Calendar) -> Unit
    ) : DatePickerSelection()
}
