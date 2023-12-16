package io.github.madmaximuus.persian.timePickerDialog

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.Saver
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import java.io.Serializable
import java.time.LocalTime

internal class TimePickerState(
    val config: TimePickerDialogConfig,
    stateData: TimePickerStateData? = null,
) {

    var time by mutableStateOf(
        stateData?.time ?: parseTime(config.time, config.is24HFormat)
    )

    fun onHourSelected(hour: Int) {
        time.hours = if (config.is24HFormat) (hour % 24) else (hour + 1) % 24
    }

    fun onMinuteSelected(minutes: Int) {
        time.minutes = minutes
    }

    fun onAmPmSelected(index: Int) {
        time.timesOfDay = when (index) {
            0 -> TimePickerDialogAmPM.AM
            1 -> TimePickerDialogAmPM.PM
            else -> TimePickerDialogAmPM.AM
        }
    }

    fun finnish(): LocalTime {
        return time.toLocalTime()
    }

    companion object {
        fun Saver(
            config: TimePickerDialogConfig
        ): Saver<TimePickerState, *> = Saver(
            save = { state ->
                TimePickerStateData(
                    time = state.time
                )
            },
            restore = { data ->
                TimePickerState(config, data)
            }
        )
    }

    data class TimePickerStateData(
        val time: PickerTime
    ) : Serializable {

        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (javaClass != other?.javaClass) return false

            other as TimePickerStateData

            return time == other.time
        }

        override fun hashCode(): Int {
            return time.hashCode()
        }
    }
}

@Composable
internal fun rememberDatePickerState(
    config: TimePickerDialogConfig,
): TimePickerState = rememberSaveable(
    inputs = arrayOf(config),
    saver = TimePickerState.Saver(config),
    init = { TimePickerState(config) }
)