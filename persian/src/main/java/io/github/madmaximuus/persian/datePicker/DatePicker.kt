package io.github.madmaximuus.persian.datePicker

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.R
import io.github.madmaximuus.persian.alert.Action
import io.github.madmaximuus.persian.alert.Alert
import io.github.madmaximuus.persian.datePicker.view.DatePickerView
import io.github.madmaximuus.persian.datePicker.view.state.DatePickerState
import io.github.madmaximuus.persian.datePicker.view.state.rememberDatePickerState
import io.github.madmaximuus.persian.datePicker.view.util.DatePickerConfig
import io.github.madmaximuus.persian.datePicker.view.util.DatePickerSelection
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.surface.Surface

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

@Preview(
    device = "spec:width=411dp,height=891dp,dpi=420,isRound=false,chinSize=0dp,orientation=landscape"
)
@Preview(
    uiMode = UI_MODE_NIGHT_YES,
    device = "spec:width=411dp,height=891dp,dpi=420,isRound=false,chinSize=0dp,orientation=landscape"
)
@Composable
private fun DatePickerPreview() {
    PersianTheme {
        Surface(
            modifier = Modifier
                .widthIn(max = 460.dp)
                .fillMaxWidth()
                .wrapContentHeight(),
            shape = PersianTheme.shapes.shape20,
            color = PersianTheme.colorScheme.surfaceContainer,
            tonalElevation = PersianTheme.elevation.small,
            shadowElevation = 0.dp,
            content = {
                Column(
                    modifier = Modifier
                        .wrapContentHeight()
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    content = {
                        DatePickerView(
                            state = DatePickerState(
                                DatePickerSelection.Date(
                                    onDateSelected = {

                                    }
                                ),
                                config = DatePickerConfig()
                            )
                        ) {

                        }
                    }
                )
            }
        )
    }
}