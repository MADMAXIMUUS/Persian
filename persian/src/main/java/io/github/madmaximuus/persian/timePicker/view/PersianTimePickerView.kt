package io.github.madmaximuus.persian.timePicker.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.spacing
import io.github.madmaximuus.persian.timePicker.view.wheel.VerticalWheelPicker
import java.time.LocalTime

@Composable
internal fun PersianTimePickerView(
    state: TimePickerState,
    config: TimePickerConfig,
    colors: TimePickerViewColors
) {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(
            MaterialTheme.spacing.medium,
            Alignment.CenterHorizontally
        )
    ) {
        VerticalWheelPicker(
            count = if (config.is24HFormat) 24 else 12,
            state = rememberLazyListState(
                initialFirstVisibleItemIndex = if (config.is24HFormat)
                    state.time.hours
                else state.time.hours - 1
            ),
            onScrollFinish = {
                state.onHourSelected(it)
            }
        ) { index, isCenterItem ->
            Box(
                modifier = Modifier.size(40.dp, 36.dp),
                contentAlignment = Alignment.Center
            ) {
                val text = if (config.is24HFormat) index else index + 1
                Text(
                    text = String.format("%02d", text),
                    color = colors.textColor(selected = isCenterItem).value
                )
            }
        }
        Text(text = ":")
        VerticalWheelPicker(
            count = 60,
            state = rememberLazyListState(
                initialFirstVisibleItemIndex = state.time.minutes
            ),
            onScrollFinish = {
                state.onMinuteSelected(it)
            }
        ) { index, isCenterItem ->
            Box(
                modifier = Modifier.size(40.dp, 36.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = String.format("%02d", index),
                    color = colors.textColor(selected = isCenterItem).value
                )
            }
        }
        if (config.is24HFormat.not()) {
            VerticalWheelPicker(
                count = 2,
                state = rememberLazyListState(
                    initialFirstVisibleItemIndex = when (state.time.timesOfDay) {
                        TimePickerDialogAmPM.AM -> 0
                        TimePickerDialogAmPM.PM -> 1
                        null -> 0
                    }
                ),
                onScrollFinish = {
                    state.onAmPmSelected(it)
                }
            ) { index, isCenterItem ->
                Box(
                    modifier = Modifier.size(40.dp, 36.dp),
                    contentAlignment = Alignment.Center
                ) {
                    when (index) {
                        0 -> Text(
                            text = "Am",
                            color = colors.textColor(selected = isCenterItem).value
                        )

                        1 -> Text(
                            text = "Pm",
                            color = colors.textColor(selected = isCenterItem).value
                        )
                    }
                }
            }
        }
    }
}


internal class PickerTime(
    var hours: Int,
    var minutes: Int,
    var timesOfDay: TimePickerDialogAmPM? = null
) {
    override fun toString(): String {
        return "${String.format("%02d", hours)}:${
            String.format(
                "%02d",
                minutes
            )
        } ${timesOfDay?.toString() ?: ""}"
    }
}

internal enum class TimePickerDialogAmPM {
    AM, PM
}

class TimePickerConfig(
    val time: LocalTime = LocalTime.now(),
    val is24HFormat: Boolean = false,
)