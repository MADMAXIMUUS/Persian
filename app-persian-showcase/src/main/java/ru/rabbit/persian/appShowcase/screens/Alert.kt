package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.foundation.text.input.rememberTextFieldState
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
import io.github.madmaximuus.persian.formItem.Checkbox
import io.github.madmaximuus.persian.formItem.Checkboxes
import io.github.madmaximuus.persian.formItem.FormItem
import io.github.madmaximuus.persian.formItem.Input
import io.github.madmaximuus.persian.formItem.Subhead
import io.github.madmaximuus.persian.formItem.TextArea
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.radioButton.RadioButton
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
        val titleState = rememberTextFieldState("Alert title")
        val messageState =
            rememberTextFieldState("A dialog is a type of modal window that appears in front of app content to provide critical information, or prompt for a decision to be made.")
        SampleScaffold(title = name, onBackClick = { navController?.navigateUp() }) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                FormItem(
                    subhead = { Subhead(text = "Title") },
                    content = { Input(state = titleState) },
                    isError = titleError,
                )
                if (description) {
                    FormItem(
                        subhead = { Subhead(text = "Message") },
                        content = { TextArea(state = messageState) },
                        isError = descriptionError,
                    )
                }
                FormItem(
                    subhead = { Subhead(text = "Settings") },
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
                    if (titleState.text.isEmpty()) {
                        showAlert = false
                        titleError = true
                        descriptionError = false
                    } else if (description && messageState.text.isEmpty()) {
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
                title = titleState.text.toString(),
                confirmAction = {
                    Action(title = "OK", onClick = { showAlert = false })
                },
                dismissAction = {
                    Action(title = "Cancel", onClick = { showAlert = false })
                },
                message = if (description) messageState.text.toString() else null,
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