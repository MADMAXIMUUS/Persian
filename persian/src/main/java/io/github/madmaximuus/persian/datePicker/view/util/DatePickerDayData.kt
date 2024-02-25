package io.github.madmaximuus.persian.datePicker.view.util

import android.icu.util.Calendar

internal data class DatePickerDayData(
    val date: Calendar? = null,
    val disabledPassively: Boolean = false,
    val selected: Boolean = false,
    val selectedBetween: Boolean = false,
    val selectedStart: Boolean = false,
    val selectedEnd: Boolean = false,
    val otherMonth: Boolean = false,
)
