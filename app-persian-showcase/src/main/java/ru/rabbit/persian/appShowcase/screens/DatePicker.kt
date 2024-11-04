package ru.rabbit.persian.appShowcase.screens

import android.icu.util.Calendar
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
import io.github.madmaximuus.persian.datePicker.DatePicker
import io.github.madmaximuus.persian.datePicker.view.util.DatePickerConfig
import io.github.madmaximuus.persian.datePicker.view.util.DatePickerSelection
import io.github.madmaximuus.persian.forms.Checkbox
import io.github.madmaximuus.persian.forms.Checkboxes
import io.github.madmaximuus.persian.forms.Form
import io.github.madmaximuus.persian.forms.RadioButton
import io.github.madmaximuus.persian.forms.RadioButtons
import io.github.madmaximuus.persian.forms.Subhead
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.text.Text
import ru.rabbit.persian.appShowcase.componets.SampleScaffold
import java.text.SimpleDateFormat
import java.util.Locale

object DatePicker : Screen {

    override val name: String = "Date picker"

    override val navigation: String = "darePicker"

    @Composable
    override fun Content(navController: NavController?) {
        var showDialog by remember { mutableStateOf(false) }
        val (selectable, selectionChange) = remember { mutableStateOf(false) }

        val selectionTypeState = remember {
            listOf(
                mutableStateOf(true),
                mutableStateOf(false),
                mutableStateOf(false)
            )
        }

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
                    .padding(it),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = PersianTheme.spacing.size16)
                        .padding(top = PersianTheme.spacing.size4),
                    text = "Date: ${dateFormat.format(selected.timeInMillis)}"
                )
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = PersianTheme.spacing.size16)
                        .padding(top = PersianTheme.spacing.size4),
                    text = "Dates: $dates"
                )
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = PersianTheme.spacing.size16)
                        .padding(top = PersianTheme.spacing.size4),
                    text = "Period: ${dateFormat.format(startDate.timeInMillis)} - " +
                            dateFormat.format(endDate.timeInMillis)
                )
                Form(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = PersianTheme.spacing.size12),
                    subhead = {
                        Subhead(text = "Selection type")
                    },
                    content = {
                        RadioButtons {
                            RadioButton(
                                text = "Date selection",
                                selected = selectionTypeState[0].value,
                                onSelectedChange = {
                                    selectionTypeState.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 0
                                    }
                                }
                            )
                            RadioButton(
                                text = "Dates selection",
                                selected = selectionTypeState[1].value,
                                onSelectedChange = {
                                    selectionTypeState.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 1
                                    }
                                }
                            )
                            RadioButton(
                                text = "Range selection",
                                selected = selectionTypeState[2].value,
                                onSelectedChange = {
                                    selectionTypeState.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 2
                                    }
                                }
                            )
                        }
                    }
                )
                Form(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = PersianTheme.spacing.size12),
                    subhead = {
                        Subhead(text = "Settings")
                    },
                    content = {
                        Checkboxes {
                            Checkbox(
                                text = "Selectable Month And Year",
                                checked = selectable,
                                onCheckedChange = selectionChange
                            )
                        }
                    }
                )
                PrimaryButton(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = PersianTheme.spacing.size16)
                        .padding(top = PersianTheme.spacing.size16),
                    text = "Show date picker",
                    sizes = ButtonDefaults.largeSizes(),
                    onClick = {
                        showDialog = true
                    }
                )
            }
        }
        if (showDialog) {
            DatePicker(
                config = DatePickerConfig(
                    selectable = selectable
                ),
                selection = when {
                    selectionTypeState[0].value -> DatePickerSelection.Date(
                        selectedDate = selected,
                        onDateSelected = {
                            selected = it
                        }
                    )

                    selectionTypeState[1].value -> DatePickerSelection.Dates(
                        selectedDates = selectedDates,
                        onDatesSelected = {
                            selectedDates = it
                        }
                    )

                    selectionTypeState[2].value -> DatePickerSelection.Period(
                        selectedRange = startDate..endDate,
                        onRangeSelected = { first: Calendar, second: Calendar ->
                            startDate = first
                            endDate = second
                        }
                    )

                    else -> DatePickerSelection.Date(
                        selectedDate = selected,
                        onDateSelected = {
                            selected = it
                        }
                    )
                },
                onDismissRequest = {
                    showDialog = false
                },
            )
        }
    }
}