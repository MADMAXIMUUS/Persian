package io.github.madmaximuus.persian.datePicker

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import io.github.madmaximuus.persian.R
import io.github.madmaximuus.persian.alert.AlertAction
import io.github.madmaximuus.persian.alert.PersianAlert
import io.github.madmaximuus.persian.datePicker.view.PersianDatePickerView
import io.github.madmaximuus.persian.datePicker.view.state.rememberDatePickerState
import io.github.madmaximuus.persian.datePicker.view.util.DatePickerConfig
import io.github.madmaximuus.persian.datePicker.view.util.DatePickerSelection
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.surface.Surface

@Composable
fun PersianDatePicker(
    selection: DatePickerSelection,
    config: DatePickerConfig = DatePickerConfig(),
    colors: DatePickerColors = PersianDatePickerDefaults.colors(),
    onDismissRequest: () -> Unit,
) {
    val state = rememberDatePickerState(
        selection = selection,
        config = config
    )

    PersianAlert(
        title = stringResource(id = R.string.select_date),
        onDismiss = onDismissRequest,
        colors = colors.alertsColors,
        actions = listOf(
            AlertAction(
                title = stringResource(id = R.string.ok),
                onClick = {
                    state.onFinish()
                    onDismissRequest()
                }
            ),
            AlertAction(
                title = stringResource(id = R.string.cancel),
                onClick = {
                    onDismissRequest()
                }
            )
        )
    ) {
        PersianDatePickerView(
            state = state,
            config = config,
            colors = colors.datePickerViewColors,
            onSelection = {
                state.processSelection(it)
            }
        )
    }
}

@Preview(showSystemUi = true)
@Preview(showBackground = false, uiMode = UI_MODE_NIGHT_YES, showSystemUi = true)
@Composable
private fun DatePickerPreview() {
    PersianTheme {
        Surface {
            PersianDatePicker(
                selection = DatePickerSelection.Date(
                    onDateSelected = {

                    }
                ),
                onDismissRequest = {}
            )
        }
    }
}