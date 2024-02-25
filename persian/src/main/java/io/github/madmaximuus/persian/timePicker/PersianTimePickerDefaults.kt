package io.github.madmaximuus.persian.timePicker

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import io.github.madmaximuus.persian.alert.AlertsColors
import io.github.madmaximuus.persian.alert.PersianAlertsDefaults
import io.github.madmaximuus.persian.timePicker.view.PersianTimePickerViewDefaults
import io.github.madmaximuus.persian.timePicker.view.TimePickerViewColors

object PersianTimePickerDefaults {

    @Composable
    fun colors(
        timePickerViewColors: TimePickerViewColors = PersianTimePickerViewDefaults.colors(),
        alertsColors: AlertsColors = PersianAlertsDefaults.colors()
    ): TimePickerColors = TimePickerColors(
        timePickerViewColors = timePickerViewColors,
        alertsColors = alertsColors
    )
}

@Immutable
class TimePickerColors(
    internal val timePickerViewColors: TimePickerViewColors,
    internal val alertsColors: AlertsColors
)