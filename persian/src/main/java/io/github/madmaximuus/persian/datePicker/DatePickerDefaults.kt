package io.github.madmaximuus.persian.datePicker

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import io.github.madmaximuus.persian.alert.AlertColors
import io.github.madmaximuus.persian.alert.AlertsDefaults
import io.github.madmaximuus.persian.datePicker.view.DatePickerViewColors
import io.github.madmaximuus.persian.datePicker.view.PersianDatePickerViewDefaults

object PersianDatePickerDefaults {

    @Composable
    fun colors(
        datePickerViewColors: DatePickerViewColors = PersianDatePickerViewDefaults.colors(),
        alertColors: AlertColors = AlertsDefaults.colors()
    ): DatePickerColors = DatePickerColors(
        datePickerViewColors = datePickerViewColors,
        alertColors = alertColors
    )

}

@Immutable
class DatePickerColors internal constructor(
    internal val datePickerViewColors: DatePickerViewColors,
    internal val alertColors: AlertColors
)
