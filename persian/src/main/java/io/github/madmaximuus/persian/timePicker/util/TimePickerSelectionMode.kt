package io.github.madmaximuus.persian.timePicker.util


/** The selection mode for the time picker */
@JvmInline
value class TimePickerSelectionMode private constructor(val value: Int) {
    companion object {
        val Hour = TimePickerSelectionMode(0)
        val Minute = TimePickerSelectionMode(1)
    }

    override fun toString(): String =
        when (this) {
            Hour -> "Hour"
            Minute -> "Minute"
            else -> ""
        }
}