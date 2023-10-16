package io.github.madmaximuus.persian.datePickerDIalog.util

import android.icu.util.Calendar
import android.util.Range

sealed class DatePickerSelection {
    class Date(
        val selectedDate: Calendar? = null,
        val onDateSelected: (date: Calendar) -> Unit
    ) : DatePickerSelection()

    class Dates(
        val selectedDates: List<Calendar>? = null,
        val onDatesSelected: (dates: List<Calendar>) -> Unit
    ) : DatePickerSelection()

    class Period(
        val selectedRange: Range<Calendar>? = null,
        val onRangeSelected: (startDate: Calendar, endDate: Calendar) -> Unit
    ) : DatePickerSelection()

}
