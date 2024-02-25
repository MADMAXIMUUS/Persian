package io.github.madmaximuus.persian.timePicker.view

import java.time.LocalTime

internal fun parseTime(time: LocalTime, is24TimeFormat: Boolean): PickerTime {
    return PickerTime(
        hours = if (is24TimeFormat.not() && time.hour > 12) time.hour - 12 else time.hour,
        minutes = time.minute,
        if (is24TimeFormat) null else if (time.hour > 12) TimePickerDialogAmPM.PM else TimePickerDialogAmPM.AM
    )
}

internal fun PickerTime.toLocalTime(): LocalTime {
    return LocalTime.of(
        when (timesOfDay) {
            TimePickerDialogAmPM.AM -> hours % 12
            TimePickerDialogAmPM.PM -> hours % 12 + 12
            else -> hours
        },
        minutes
    )
}