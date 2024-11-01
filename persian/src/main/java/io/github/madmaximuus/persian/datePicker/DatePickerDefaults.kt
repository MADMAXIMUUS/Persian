package io.github.madmaximuus.persian.datePicker

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import io.github.madmaximuus.persian.alert.AlertColors
import io.github.madmaximuus.persian.alert.AlertsDefaults
import io.github.madmaximuus.persian.counter.CounterColors
import io.github.madmaximuus.persian.datePicker.view.DatePickerViewColors
import io.github.madmaximuus.persian.datePicker.view.PersianDatePickerViewDefaults

/**
 * Contains the default values used by [DatePicker].
 */
object PersianDatePickerDefaults {

    /**
     * Create a [CounterColors] that represents the default container and content used in a [DatePicker].
     *
     * @param datePickerViewColors The colors used for the date picker view.
     * @param alertColors The colors used for the alert dialog of the date picker.
     */
    @Composable
    fun colors(
        datePickerViewColors: DatePickerViewColors = PersianDatePickerViewDefaults.colors(),
        alertColors: AlertColors = AlertsDefaults.colors()
    ): DatePickerColors = DatePickerColors(
        datePickerViewColors = datePickerViewColors,
        alertColors = alertColors
    )
}

/**
 * Represents the container and content colors used in a [DatePicker] in different states.
 *
 * @property datePickerViewColors The colors used for the date picker view.
 * @property alertColors The colors used for the alert dialog of the date picker.
 */
@Immutable
class DatePickerColors internal constructor(
    internal val datePickerViewColors: DatePickerViewColors,
    internal val alertColors: AlertColors
)
