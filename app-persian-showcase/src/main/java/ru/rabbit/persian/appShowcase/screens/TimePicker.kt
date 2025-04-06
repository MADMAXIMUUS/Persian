package ru.rabbit.persian.appShowcase.screens

import android.icu.util.Calendar
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavController
import io.github.madmaximuus.persian.button.Button
import io.github.madmaximuus.persian.button.ButtonDefaults
import io.github.madmaximuus.persian.formItem.Checkbox
import io.github.madmaximuus.persian.formItem.Checkboxes
import io.github.madmaximuus.persian.formItem.FormItem
import io.github.madmaximuus.persian.formItem.RadioButton
import io.github.madmaximuus.persian.formItem.RadioButtons
import io.github.madmaximuus.persian.formItem.Subhead
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.text.Text
import io.github.madmaximuus.persian.timePicker.TimePicker
import io.github.madmaximuus.persian.timePicker.state.rememberTimePickerState
import io.github.madmaximuus.persian.timePicker.util.PickerType
import ru.rabbit.persian.appShowcase.R
import ru.rabbit.persian.appShowcase.componets.SampleScaffold
import java.util.Locale

object TimePicker : Screen {

    override val name: String = "Time picker"

    override val image: Int = R.drawable.time_picker

    override val navigation: String = "timePicker"

    @Composable
    override fun Content(navController: NavController?) {
        var showDialog by remember { mutableStateOf(false) }
        val (is24HFormat, onFormatChange) = remember { mutableStateOf(false) }
        val states = remember {
            listOf(
                mutableStateOf(true),
                mutableStateOf(false),
            )
        }
        val timeState by remember {
            mutableStateOf(Calendar.getInstance())
        }
        val state = rememberTimePickerState(
            initialHour = timeState.get(Calendar.HOUR_OF_DAY),
            initialMinute = timeState.get(Calendar.MINUTE),
            is24Hour = is24HFormat
        )
        var time by remember { mutableStateOf("") }

        SampleScaffold(
            title = name,
            onBackClick = { navController?.navigateUp() }
        ) {
            Column(
                modifier = Modifier
                    .padding(it)
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
                    .padding(bottom = PersianTheme.spacing.size12)
                    .navigationBarsPadding(),
            ) {
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = PersianTheme.spacing.size16),
                    text = time,
                    textAlign = TextAlign.Center,
                    style = PersianTheme.typography.displayLarge,
                    color = PersianTheme.colorScheme.onSurface
                )
                FormItem(
                    subhead = { Subhead(text = "Style") },
                    content = {
                        RadioButtons {
                            RadioButton(
                                text = "Wheel",
                                selected = states[0].value,
                                onSelectedChange = {
                                    states.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 0
                                    }
                                }
                            )
                            RadioButton(
                                text = "Dial",
                                selected = states[1].value,
                                onSelectedChange = {
                                    states.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 1
                                    }
                                }
                            )
                        }
                    }
                )
                FormItem(
                    subhead = { Subhead(text = "Settings") },
                    content = {
                        Checkboxes {
                            Checkbox(
                                text = "24H format",
                                checked = is24HFormat,
                                onCheckedChange = onFormatChange
                            )
                        }
                    }
                )
                Button(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = PersianTheme.spacing.size16)
                        .padding(top = PersianTheme.spacing.size8),
                    text = "Time Picker",
                    sizes = ButtonDefaults.largeSizes(),
                    onClick = {
                        showDialog = true
                    }
                )
            }
        }
        if (showDialog) {
            TimePicker(
                state = state,
                pickerType = when {
                    states[0].value -> PickerType.WHEEL
                    states[1].value -> PickerType.DIAL
                    else -> PickerType.WHEEL
                },
                onConfirm = {
                    showDialog = false
                    timeState.set(Calendar.HOUR_OF_DAY, state.hour)
                    timeState.set(Calendar.MINUTE, state.minute)
                    time = String.format(Locale.getDefault(), "%02d:%02d", state.hour, state.minute)
                },
                onDismissRequest = {
                    showDialog = false
                },
            )
        }
    }
}