package io.github.madmaximuus.persian.datePicker

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import io.github.madmaximuus.persian.R
import io.github.madmaximuus.persian.alert.Action
import io.github.madmaximuus.persian.alert.Alert
import io.github.madmaximuus.persian.datePicker.view.DatePickerView
import io.github.madmaximuus.persian.datePicker.view.state.rememberDatePickerState
import io.github.madmaximuus.persian.datePicker.view.util.DatePickerConfig
import io.github.madmaximuus.persian.datePicker.view.util.DatePickerSelection

/**
 * Composable function to render a date picker dialog.
 *
 * @param selection The selection type for the date picker.
 * @param config The configuration for the date picker.
 * @param colors The colors used for the date picker.
 * @param onDismissRequest The callback to be invoked when the date picker dialog is dismissed.
 */
@Composable
fun DatePicker(
    selection: DatePickerSelection,
    config: DatePickerConfig = DatePickerConfig(),
    colors: DatePickerColors = PersianDatePickerDefaults.colors(),
    onDismissRequest: () -> Unit,
) {
    val state = rememberDatePickerState(
        selection = selection,
        config = config
    )

    Alert(
        title = stringResource(id = R.string.select_date),
        onDismiss = onDismissRequest,
        colors = colors.alertColors,
        confirmAction = {
            Action(
                title = stringResource(id = R.string.ok),
                onClick = {
                    state.onFinish()
                    onDismissRequest()
                }
            )
        },
        dismissAction = {
            Action(
                title = stringResource(id = R.string.cancel),
                onClick = {
                    onDismissRequest()
                }
            )
        }
    ) {
        DatePickerView(
            state = state,
            config = config,
            colors = colors.datePickerViewColors,
            onSelection = {
                state.processSelection(it)
            }
        )
    }
}