package io.github.madmaximuus.persian.datePicker.view.util

import android.icu.util.Calendar

class DatePickerConfig(
    val selectable: Boolean = false,
    val boundary: ClosedRange<Calendar> = Constants.DEFAULT_DATE_RANGE,
)
