package io.github.madmaximuus.persian.timePickerDialog

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import io.github.madmaximuus.persian.buttons.PersianTertiaryButton
import io.github.madmaximuus.persian.dividers.PersianInsetHorizontalDivider
import io.github.madmaximuus.persian.foundation.elevation
import io.github.madmaximuus.persian.foundation.extendedColorScheme
import io.github.madmaximuus.persian.foundation.spacing
import java.time.LocalTime

@Composable
fun PersianTimePickerDialog(
    modifier: Modifier = Modifier,
    config: TimePickerDialogConfig = TimePickerDialogConfig(),
    onDismissRequest: () -> Unit,
    onTimeSelected: (LocalTime) -> Unit
) {

    val state = rememberDatePickerState(config = config)

    Dialog(
        properties = DialogProperties(
            usePlatformDefaultWidth = false,
            decorFitsSystemWindows = false
        ),
        onDismissRequest = onDismissRequest
    ) {
        Surface(
            modifier = modifier
                .widthIn(max = 480.dp)
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(MaterialTheme.spacing.extraExtraLarge),
            shape = MaterialTheme.shapes.extraLarge,
            color = MaterialTheme.extendedColorScheme.surface,
            tonalElevation = MaterialTheme.elevation.small,
            shadowElevation = 0.dp,
            content = {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .animateContentSize(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentHeight()
                            .heightIn(max = 400.dp)
                            .padding(MaterialTheme.spacing.medium),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.extraSmall)
                    ) {
                        Text(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(
                                    top = MaterialTheme.spacing.extraExtraLarge,
                                    start = MaterialTheme.spacing.extraExtraLarge,
                                    end = MaterialTheme.spacing.extraExtraLarge,
                                    bottom = MaterialTheme.spacing.medium
                                ),
                            text = "Select date",
                            style = MaterialTheme.typography.headlineSmall,
                            textAlign = TextAlign.Center,
                            color = MaterialTheme.colorScheme.onSurface
                        )
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
                            ) {
                                Box(
                                    modifier = Modifier.size(40.dp, 36.dp),
                                    contentAlignment = Alignment.Center
                                ) {
                                    val text = if (config.is24HFormat) it else it + 1
                                    Text(text = String.format("%02d", text))
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
                            ) {
                                Box(
                                    modifier = Modifier.size(40.dp, 36.dp),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text(text = String.format("%02d", it))
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
                                ) {
                                    Box(
                                        modifier = Modifier.size(40.dp, 36.dp),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        when (it) {
                                            0 -> Text(text = "Am")
                                            1 -> Text(text = "Pm")
                                        }
                                    }
                                }
                            }
                        }
                    }
                    PersianInsetHorizontalDivider()
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(MaterialTheme.spacing.large),
                        horizontalArrangement = Arrangement.spacedBy(
                            MaterialTheme.spacing.small,
                            Alignment.End

                        )
                    ) {
                        PersianTertiaryButton(
                            text = "Cancel"
                        ) {
                            onDismissRequest()
                        }
                        PersianTertiaryButton(
                            text = "OK"
                        ) {
                            onTimeSelected(state.finnish())
                            onDismissRequest()
                        }
                    }
                }
            }
        )
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

class TimePickerDialogConfig(
    val time: LocalTime = LocalTime.now(),
    val is24HFormat: Boolean = false,
)