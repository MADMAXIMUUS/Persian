package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import io.github.madmaximuus.persian.alert.Action
import io.github.madmaximuus.persian.alert.Alert
import io.github.madmaximuus.persian.button.ButtonDefaults
import io.github.madmaximuus.persian.button.PrimaryButton
import io.github.madmaximuus.persian.forms.Checkbox
import io.github.madmaximuus.persian.forms.Checkboxes
import io.github.madmaximuus.persian.forms.Form
import io.github.madmaximuus.persian.forms.Subhead
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.input.OutlineInput
import io.github.madmaximuus.persian.radioButton.RadioButton
import io.github.madmaximuus.persian.textAreas.OutlineTextArea
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object Alert : Screen {

    override val name: String = "Alerts"

    override val navigation: String = "alert"

    @Composable
    override fun Content(navController: NavController?) {
        var showAlert by remember { mutableStateOf(false) }
        val (description, onDescriptionChange) = remember { mutableStateOf(false) }
        var titleError by remember { mutableStateOf(false) }
        var descriptionError by remember { mutableStateOf(false) }
        val (content, onContentChange) = remember { mutableStateOf(false) }
        val (titleValue, onTitleValueChange) = remember { mutableStateOf("Alert title") }
        val (descriptionValue, onDescriptionValueChange) = remember {
            mutableStateOf("A dialog is a type of modal window that appears in front of app content to provide critical information, or prompt for a decision to be made.")
        }
        SampleScaffold(title = name, onBackClick = { navController?.navigateUp() }) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                OutlineInput(
                    modifier = Modifier
                        .padding(horizontal = PersianTheme.spacing.size16)
                        .padding(top = PersianTheme.spacing.size8),
                    value = titleValue,
                    isError = titleError,
                    onValueChange = onTitleValueChange
                )
                if (description) {
                    OutlineTextArea(
                        modifier = Modifier
                            .padding(horizontal = PersianTheme.spacing.size16)
                            .padding(top = PersianTheme.spacing.size12),
                        value = descriptionValue,
                        isError = descriptionError,
                        onValueChange = onDescriptionValueChange
                    )
                }
                Form(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = PersianTheme.spacing.size16),
                    subhead = {
                        Subhead(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Settings"
                        )
                    },
                    content = {
                        Checkboxes {
                            Checkbox(
                                text = "Message",
                                checked = description,
                                onCheckedChange = onDescriptionChange
                            )
                            Checkbox(
                                text = "Content",
                                checked = content,
                                onCheckedChange = onContentChange
                            )
                        }
                    }
                )
                PrimaryButton(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = PersianTheme.spacing.size16)
                        .padding(top = PersianTheme.spacing.size8),
                    text = "Show alert",
                    sizes = ButtonDefaults.largeSizes()
                ) {
                    if (titleValue.isEmpty()) {
                        showAlert = false
                        titleError = true
                        descriptionError = false
                    } else if (description && descriptionValue.isEmpty()) {
                        showAlert = false
                        titleError = false
                        descriptionError = false
                    } else {
                        showAlert = true
                        titleError = false
                        descriptionError = false
                    }
                }
            }
        }
        if (showAlert) {
            Alert(
                title = titleValue,
                confirmAction = {
                    Action(title = "OK", onClick = { showAlert = false })
                },
                dismissAction = {
                    Action(title = "Cancel", onClick = { showAlert = false })
                },
                message = if (description) descriptionValue else null,
                onDismiss = { showAlert = false },
                content = if (content) {
                    {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .selectableGroup()
                        ) {
                            RadioButton(
                                modifier = Modifier.fillMaxWidth(),
                                text = "Radio Button 1",
                                selected = false,
                                onSelectedChange = {}
                            )
                            RadioButton(
                                modifier = Modifier.fillMaxWidth(),
                                text = "Radio Button 2",
                                selected = true,
                                onSelectedChange = {}
                            )
                            RadioButton(
                                modifier = Modifier.fillMaxWidth(),
                                text = "Radio Button 3",
                                selected = false,
                                onSelectedChange = {}
                            )
                        }
                    }
                } else null
            )
        }
    }
}