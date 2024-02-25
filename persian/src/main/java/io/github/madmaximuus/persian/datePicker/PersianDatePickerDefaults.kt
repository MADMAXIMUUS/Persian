package io.github.madmaximuus.persian.datePicker

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import io.github.madmaximuus.persian.alert.AlertsColors
import io.github.madmaximuus.persian.alert.PersianAlertsDefaults
import io.github.madmaximuus.persian.datePicker.view.DatePickerViewColors
import io.github.madmaximuus.persian.datePicker.view.PersianDatePickerViewDefaults

object PersianDatePickerDefaults {

    @Composable
    fun colors(
        datePickerViewColors: DatePickerViewColors = PersianDatePickerViewDefaults.colors(),
        alertsColors: AlertsColors = PersianAlertsDefaults.colors()
    ): DatePickerColors = DatePickerColors(
        datePickerViewColors = datePickerViewColors,
        alertsColors = alertsColors
    )

}

@Immutable
class DatePickerColors internal constructor(
    internal val datePickerViewColors: DatePickerViewColors,
    internal val alertsColors: AlertsColors
)
