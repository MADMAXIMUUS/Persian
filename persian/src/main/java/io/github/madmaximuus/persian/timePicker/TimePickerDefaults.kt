package io.github.madmaximuus.persian.timePicker

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import io.github.madmaximuus.persian.alert.AlertColors
import io.github.madmaximuus.persian.alert.AlertSizes
import io.github.madmaximuus.persian.alert.AlertsDefaults
import io.github.madmaximuus.persian.timePicker.view.dial.DialTimePickerViewColors
import io.github.madmaximuus.persian.timePicker.view.dial.DialTimePickerViewDefaults
import io.github.madmaximuus.persian.timePicker.view.dial.DialTimePickerViewSizes
import io.github.madmaximuus.persian.timePicker.view.wheel.WheelTimePickerViewColors
import io.github.madmaximuus.persian.timePicker.view.wheel.WheelTimePickerViewDefaults
import io.github.madmaximuus.persian.timePicker.view.wheel.WheelTimePickerViewSizes

object TimePickerDefaults {

    @Composable
    fun colors(
        wheelTimePickerViewColors: WheelTimePickerViewColors = WheelTimePickerViewDefaults.colors(),
        dialTimePickerViewColors: DialTimePickerViewColors = DialTimePickerViewDefaults.colors(),
        alertColors: AlertColors = AlertsDefaults.colors()
    ): TimePickerColors = TimePickerColors(
        wheelTimePickerViewColors = wheelTimePickerViewColors,
        dialTimePickerViewColors = dialTimePickerViewColors,
        alertColors = alertColors
    )

    @Composable
    fun sizes(
        wheelTimePickerViewSizes: WheelTimePickerViewSizes = WheelTimePickerViewDefaults.sizes(),
        dialTimePickerViewSizes: DialTimePickerViewSizes = DialTimePickerViewDefaults.sizes(),
        alertSizes: AlertSizes = AlertsDefaults.alertSizes()
    ): TimePickerSizes = TimePickerSizes(
        wheelTimePickerViewSizes = wheelTimePickerViewSizes,
        dialTimePickerViewSizes = dialTimePickerViewSizes,
        alertSizes = alertSizes
    )
}

@Immutable
class TimePickerColors(
    internal val wheelTimePickerViewColors: WheelTimePickerViewColors,
    internal val dialTimePickerViewColors: DialTimePickerViewColors,
    internal val alertColors: AlertColors
)

@Immutable
class TimePickerSizes(
    internal val wheelTimePickerViewSizes: WheelTimePickerViewSizes,
    internal val dialTimePickerViewSizes: DialTimePickerViewSizes,
    internal val alertSizes: AlertSizes
)