package io.github.madmaximuus.persian.datePicker.view.util

import android.icu.util.Calendar

/**
 * Data class representing the state of a single day in the date picker.
 *
 * @property date The calendar date represented by this day.
 * @property disabledPassively Indicates whether the day is passively disabled.
 * @property selected Indicates whether the day is selected.
 * @property selectedBetween Indicates whether the day is selected as part of a range.
 * @property selectedStart Indicates whether the day is the start of a selected range.
 * @property selectedEnd Indicates whether the day is the end of a selected range.
 * @property otherMonth Indicates whether the day belongs to a different month than the current one.
 */
internal data class DatePickerDayData(
    val date: Calendar? = null,
    val disabledPassively: Boolean = false,
    val selected: Boolean = false,
    val selectedBetween: Boolean = false,
    val selectedStart: Boolean = false,
    val selectedEnd: Boolean = false,
    val otherMonth: Boolean = false,
)
