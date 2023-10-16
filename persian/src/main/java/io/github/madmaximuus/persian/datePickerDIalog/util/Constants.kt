package io.github.madmaximuus.persian.datePickerDIalog.util

import android.icu.util.Calendar

object Constants {

    private val DEFAULT_MIN_DATE = Calendar.getInstance().apply {
        set(1900, 1, 1)
    }
    private val DEFAULT_MAX_DATE = Calendar.getInstance().apply {
        set(2100, 12, 31)
    }

    val DEFAULT_DATE_RANGE = DEFAULT_MIN_DATE..DEFAULT_MAX_DATE

    const val CALENDAR_MODE_GRID_COLUMNS = 7
    const val YEAR_MODE_GRID_COLUMNS = 4
    const val MONTH_MODE_GRID_COLUMNS = 3

}