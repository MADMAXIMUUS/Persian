package io.github.madmaximuus.persian.datePickerDIalog.state

import android.icu.util.Calendar

data class DatePickerGridState(
    val month: Int = 1,
    val year: Int = 1970,
    val calendar: Calendar
)