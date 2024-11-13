package io.github.madmaximuus.persian.timePicker.view.wheel

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.text.Text
import io.github.madmaximuus.persian.timePicker.state.TimePickerState
import io.github.madmaximuus.persian.timePicker.view.wheel.wheel.VerticalWheelPicker
import java.util.Locale

/**
 * Display the wheel time picker view.
 *
 * @param state The state of the time picker.
 * @param colors The colors to use for the time picker components.
 * @param sizes The sizes to use for the time picker components.
 */
@Composable
internal fun WheelTimePickerView(
    state: TimePickerState,
    colors: WheelTimePickerViewColors,
    sizes: WheelTimePickerViewSizes
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = PersianTheme.spacing.size8),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(
            PersianTheme.spacing.size12,
            Alignment.CenterHorizontally
        )
    ) {
        VerticalWheelPicker(
            count = if (state.is24hour) 24 else 12,
            state = rememberLazyListState(
                initialFirstVisibleItemIndex = if (state.is24hour) state.hour else state.hour % 12
            ),
            onScrollFinish = {
                state.hour = it
            }
        ) { index, isCenterItem ->
            Box(
                modifier = Modifier.size(40.dp, 36.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = String.format(Locale.getDefault(), "%02d", index),
                    color = colors.textColor(selected = isCenterItem).value,
                    style = sizes.textStyle
                )
            }
        }
        Text(
            text = ":",
            color = PersianTheme.colorScheme.onSurface,
            style = PersianTheme.typography.titleMedium
        )
        VerticalWheelPicker(
            count = 60,
            state = rememberLazyListState(
                initialFirstVisibleItemIndex = state.minute
            ),
            onScrollFinish = {
                state.minute = it
            }
        ) { index, isCenterItem ->
            Box(
                modifier = Modifier.size(40.dp, 36.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = String.format(Locale.getDefault(), "%02d", index),
                    color = colors.textColor(selected = isCenterItem).value,
                    style = sizes.textStyle
                )
            }
        }
        if (state.is24hour.not()) {
            VerticalWheelPicker(
                count = 2,
                state = rememberLazyListState(
                    initialFirstVisibleItemIndex = if (state.isAfternoon) 1 else 0
                ),
                onScrollFinish = {
                    state.isAfternoon = it == 1
                }
            ) { index, isCenterItem ->
                Box(
                    modifier = Modifier.size(40.dp, 36.dp),
                    contentAlignment = Alignment.Center
                ) {
                    when (index) {
                        0 -> Text(
                            text = "AM",
                            color = colors.textColor(selected = isCenterItem).value,
                            style = sizes.textStyle
                        )

                        1 -> Text(
                            text = "PM",
                            color = colors.textColor(selected = isCenterItem).value,
                            style = sizes.textStyle
                        )
                    }
                }
            }
        }
    }
}