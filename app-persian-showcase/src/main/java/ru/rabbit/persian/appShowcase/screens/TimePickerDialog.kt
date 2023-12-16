package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import io.github.madmaximuus.persian.buttons.PersianPrimaryButton
import io.github.madmaximuus.persian.foundation.spacing
import io.github.madmaximuus.persian.timePickerDialog.PersianTimePickerDialog
import io.github.madmaximuus.persian.timePickerDialog.TimePickerDialogConfig
import ru.rabbit.persian.appShowcase.componets.SampleScaffold
import java.time.LocalTime

object TimePickerDialog : Screen {

    override val name: String = "Time Picker Dialog"

    override val navigation: String = "timePickerDialog"

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun Content(navController: NavController?) {
        var showDialog by remember { mutableStateOf(false) }
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
                verticalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.extraExtraLarge)
            ) {
                PersianPrimaryButton(text = "Time Picker") {
                    showDialog = true
                }
                Text(text = time.toString())
            }
        }
        if (showDialog) {
            PersianTimePickerDialog(
                config = TimePickerDialogConfig(
                    is24HFormat = true
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