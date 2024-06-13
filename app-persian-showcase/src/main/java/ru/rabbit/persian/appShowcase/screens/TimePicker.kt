package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import io.github.madmaximuus.persian.buttons.PersianPrimaryButton
import io.github.madmaximuus.persian.checkboxes.PersianCheckbox
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.text.Text
import io.github.madmaximuus.persian.timePicker.PersianTimePicker
import io.github.madmaximuus.persian.timePicker.view.TimePickerConfig
import ru.rabbit.persian.appShowcase.componets.SampleScaffold
import java.time.LocalTime

object TimePicker : Screen {

    override val name: String = "Time Picker"

    override val navigation: String = "timePicker"

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun Content(navController: NavController?) {
        var showDialog by remember { mutableStateOf(false) }
        val (is24HFormat, onFormatChange) = remember { mutableStateOf(false) }
        var time by remember { mutableStateOf(LocalTime.now()) }
        SampleScaffold(
            title = name,
            onBackClick = { navController?.navigateUp() }
        ) {
            Column(
                modifier = Modifier
                    .padding(it)
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size24)
            ) {
                PersianPrimaryButton(text = "Time Picker") {
                    showDialog = true
                }
                Text(text = time.toString())
                PersianCheckbox(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = PersianTheme.spacing.size12),
                    text = "24H Format",
                    checked = is24HFormat,
                    onCheckedChange = onFormatChange
                )
            }
        }
        if (showDialog) {
            PersianTimePicker(
                config = TimePickerConfig(
                    time = time,
                    is24HFormat = is24HFormat
                ),
                onDismissRequest = {
                    showDialog = false
                },
                onTimeSelected = {
                    time = it
                }
            )
        }
    }
}