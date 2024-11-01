package ru.rabbit.persian.appShowcase.screens

import android.icu.util.Calendar
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import io.github.madmaximuus.persian.button.ButtonDefaults
import io.github.madmaximuus.persian.button.PrimaryButton
import io.github.madmaximuus.persian.checkboxes.Checkbox
import io.github.madmaximuus.persian.datePicker.DatePicker
import io.github.madmaximuus.persian.datePicker.view.util.DatePickerConfig
import io.github.madmaximuus.persian.datePicker.view.util.DatePickerSelection
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.text.Text
import ru.rabbit.persian.appShowcase.componets.SampleScaffold
import java.text.SimpleDateFormat
import java.util.Locale

object DatePicker : Screen {

    override val name: String = "Date Picker"

    override val navigation: String = "darePicker"

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

        SampleScaffold(title = name, onBackClick = { navController?.navigateUp() }) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it)
                    .padding(horizontal = PersianTheme.spacing.size20),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size12)
            ) {
                PrimaryButton(
                    text = "Show date picker",
                    sizes = ButtonDefaults.largeSizes(),
                    onClick = {
                        showDialogSelectDate = true
                    }
                )
                PrimaryButton(
                    text = "Show dates picker",
                    sizes = ButtonDefaults.largeSizes(),
                    onClick = {
                        showDialogSelectDates = true
                    }
                )
                PrimaryButton(
                    text = "Show period picker",
                    sizes = ButtonDefaults.largeSizes(),
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
                Checkbox(
                    modifier = Modifier
                        .fillMaxWidth(),
                    text = "Selectable Month And Year",
                    checked = selectable,
                    onCheckedChange = selectionChange
                )
            }
        }
        if (showDialogSelectDate) {
            DatePicker(
                config = DatePickerConfig(
                    selectable = selectable
                ),
                selection = DatePickerSelection.Date(
                    selectedDate = selected,
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
            DatePicker(
                config = DatePickerConfig(
                    selectable = selectable
                ),
                selection = DatePickerSelection.Dates(
                    selectedDates = selectedDates,
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
            DatePicker(
                config = DatePickerConfig(
                    selectable = selectable
                ),
                selection = DatePickerSelection.Period(
                    selectedRange = startDate..endDate,
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