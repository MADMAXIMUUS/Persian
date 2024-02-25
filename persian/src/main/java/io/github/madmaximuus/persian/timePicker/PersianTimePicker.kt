package io.github.madmaximuus.persian.timePicker

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import io.github.madmaximuus.persian.R
import io.github.madmaximuus.persian.alert.AlertAction
import io.github.madmaximuus.persian.alert.PersianAlert
import io.github.madmaximuus.persian.timePicker.view.PersianTimePickerView
import io.github.madmaximuus.persian.timePicker.view.TimePickerConfig
import io.github.madmaximuus.persian.timePicker.view.rememberDatePickerState
import java.time.LocalTime

@Composable
fun PersianTimePicker(
    config: TimePickerConfig = TimePickerConfig(),
    colors: TimePickerColors = PersianTimePickerDefaults.colors(),
    onDismissRequest: () -> Unit,
    onTimeSelected: (LocalTime) -> Unit
) {

    val state = rememberDatePickerState(config = config)

    PersianAlert(
        title = stringResource(id = R.string.select_time),
        colors = colors.alertsColors,
        onDismiss = {
            onDismissRequest()
        },
        actions = listOf(
            AlertAction(
                title = stringResource(id = R.string.ok),
                onClick = {
                    onTimeSelected(state.finnish())
                    onDismissRequest()
                }
            ),
            AlertAction(
                title = stringResource(id = R.string.cancel),
                onClick = {
                    onDismissRequest()
                }
            ),
        )
    ) {
        PersianTimePickerView(
            state = state,
            config = config,
            colors = colors.timePickerViewColors
        )
    }
}