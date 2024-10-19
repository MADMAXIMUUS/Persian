package io.github.madmaximuus.persian.datePicker.view.util

import android.icu.util.Calendar

/**
 * Configuration class for the date picker.
 *
 * @property selectable Indicates whether the date picker is selectable.
 * @property boundary The range of selectable dates for the date picker.
 */
class DatePickerConfig(
    val selectable: Boolean = false,
    val boundary: ClosedRange<Calendar> = Constants.DEFAULT_DATE_RANGE,
)
