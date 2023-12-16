package ru.rabbit.persian.appShowcase.screens

import android.icu.util.Calendar
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
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
import io.github.madmaximuus.persian.checkboxes.PersianCheckbox
import io.github.madmaximuus.persian.datePickerDIalog.PersianDatePickerDialog
import io.github.madmaximuus.persian.datePickerDIalog.util.DatePickerConfig
import io.github.madmaximuus.persian.datePickerDIalog.util.DatePickerSelection
import io.github.madmaximuus.persian.foundation.spacing
import ru.rabbit.persian.appShowcase.componets.SampleScaffold
import java.text.SimpleDateFormat
import java.util.Locale

object DatePickerDialog : Screen {

    override val name: String = "Date Picker Dialog"

    override val navigation: String = "darePickerDialog"

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun Content(navController: NavController?) {
        var showDialogSelectDate by remember { mutableStateOf(false) }
        var showDialogSelectDates by remember { mutableStateOf(false) }
        var showDialogSelectPeriod by remember { mutableStateOf(false) }
        val (selectable, selectionChange) = remember { mutableStateOf(false) }

        var selected by remember {
            mutableStateOf(
                Calendar.getInstance().apply {
                    firstDayOfWeek = Calendar.MONDAY
                }
            )
        }

        var selectedDates by remember {
            mutableStateOf(emptyList<Calendar>())
        }

        var startDate by remember {
            mutableStateOf(
                Calendar.getInstance().apply {
                    firstDayOfWeek = Calendar.MONDAY
                }
            )
        }

        var endDate by remember {
            mutableStateOf(
                Calendar.getInstance().apply {
                    firstDayOfWeek = Calendar.MONDAY
                }
            )
        }

        val dateFormat = SimpleDateFormat("dd.MM.yyyy", Locale.getDefault())

        val dates = StringBuilder()

        selectedDates.forEach {
            dates.append(dateFormat.format(it.timeInMillis) + " ")
        }

        SampleScaffold(title = Alert.name, onBackClick = { navController?.navigateUp() }) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it)
                    .padding(horizontal = MaterialTheme.spacing.extraLarge),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.medium)
            ) {
                PersianPrimaryButton(
                    text = "Date Picker Selection Date",
                    onClick = {
                        showDialogSelectDate = true
                    }
                )
                PersianPrimaryButton(
                    text = "Date Picker Selection Dates",
                    onClick = {
                        showDialogSelectDates = true
                    }
                )
                PersianPrimaryButton(
                    text = "Date Picker Selection Period",
                    onClick = {
                        showDialogSelectPeriod = true
                    }
                )
                Text(
                    modifier = Modifier
                        .fillMaxWidth(),
                    text = "Date: ${dateFormat.format(selected.timeInMillis)}"
                )
                Text(
                    modifier = Modifier
                        .fillMaxWidth(),
                    text = "Dates: $dates"
                )
                Text(
                    modifier = Modifier
                        .fillMaxWidth(),
                    text = "Period: ${dateFormat.format(startDate.timeInMillis)} - " +
                            dateFormat.format(endDate.timeInMillis)
                )
                PersianCheckbox(
                    modifier = Modifier
                        .fillMaxWidth(),
                    text = "Selectable Month And Year",
                    checked = selectable,
                    onCheckedChange = selectionChange
                )
            }
        }
        if (showDialogSelectDate) {
            PersianDatePickerDialog(
                config = DatePickerConfig(
                    selectable = selectable
                ),
                selection = DatePickerSelection.Date(
                    onDateSelected = {
                        selected = it
                    }
                ),
                onDismissRequest = {
                    showDialogSelectDate = false
                },
            )
        }
        if (showDialogSelectDates) {
            PersianDatePickerDialog(
                config = DatePickerConfig(
                    selectable = selectable
                ),
                selection = DatePickerSelection.Dates(
                    onDatesSelected = {
                        selectedDates = it
                    }
                ),
                onDismissRequest = {
                    showDialogSelectDates = false
                },
            )
        }
        if (showDialogSelectPeriod) {
            PersianDatePickerDialog(
                config = DatePickerConfig(
                    selectable = selectable
                ),
                selection = DatePickerSelection.Period(
                    onRangeSelected = { first: Calendar, second: Calendar ->
                        startDate = first
                        endDate = second
                    }
                ),
                onDismissRequest = {
                    showDialogSelectPeriod = false
                },
            )
        }
    }
}