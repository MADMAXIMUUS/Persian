package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
import io.github.madmaximuus.persian.alert.OnlyActionAlert
import io.github.madmaximuus.persian.button.ButtonDefaults
import io.github.madmaximuus.persian.button.PrimaryButton
import io.github.madmaximuus.persian.checkboxes.Checkbox
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.input.OutlineInput
import io.github.madmaximuus.persian.radioButton.RadioButton
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object Alert : Screen {

    override val name: String = "Alerts"

    override val navigation: String = "alert"

    @Composable
    override fun Content(navController: NavController?) {
        var showOnlyActionAlert by remember { mutableStateOf(false) }
        var showAlert by remember { mutableStateOf(false) }
        val (description, onDescriptionChange) = remember { mutableStateOf(false) }
        var titleError by remember { mutableStateOf(false) }
        var descriptionError by remember { mutableStateOf(false) }
        val (content, onContentChange) = remember { mutableStateOf(false) }
        val (titleValue, onTitleValueChange) = remember { mutableStateOf("Basic Dialog Title") }
        val (descriptionValue, onDescriptionValueChange) = remember {
            mutableStateOf("A dialog is a type of modal window that appears in front of app content to provide critical information, or prompt for a decision to be made.")
        }
        SampleScaffold(title = name, onBackClick = { navController?.navigateUp() }) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size12)
            ) {
                PrimaryButton(
                    text = "Show only action alert",
                    sizes = ButtonDefaults.largeSizes()
                ) {
                    showOnlyActionAlert = true
                }
                PrimaryButton(
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
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            top = PersianTheme.spacing.size16,
                            start = PersianTheme.spacing.size16,
                            end = PersianTheme.spacing.size16
                        )
                ) {
                    OutlineInput(
                        modifier = Modifier.padding(horizontal = PersianTheme.spacing.size8),
                        value = titleValue,
                        isError = titleError,
                        onValueChange = onTitleValueChange
                    )
                    Spacer(modifier = Modifier.height(PersianTheme.spacing.size8))
                    Checkbox(
                        modifier = Modifier.fillMaxWidth(),
                        text = "Message",
                        checked = description,
                        onCheckedChange = onDescriptionChange
                    )
                    if (description) {
                        OutlineInput(
                            modifier = Modifier.padding(horizontal = PersianTheme.spacing.size8),
                            value = descriptionValue,
                            isError = descriptionError,
                            onValueChange = onDescriptionValueChange
                        )
                        Spacer(modifier = Modifier.height(PersianTheme.spacing.size8))
                    }
                    Checkbox(
                        modifier = Modifier.fillMaxWidth(),
                        text = "Content",
                        checked = content,
                        onCheckedChange = onContentChange
                    )
                }
            }
        }
        if (showOnlyActionAlert) {
            OnlyActionAlert(
                actions = {
                    Action(title = "Action 1", onClick = { showOnlyActionAlert = false })
                    Action(title = "Action 2", onClick = { showOnlyActionAlert = false })
                    Action(title = "Action 3", onClick = { showOnlyActionAlert = false })
                    Action(title = "Action 4", onClick = { showOnlyActionAlert = false })
                    Action(title = "Action 5", onClick = { showOnlyActionAlert = false })
                    Action(title = "Action 6", onClick = { showOnlyActionAlert = false })
                    Action(title = "Action 7", onClick = { showOnlyActionAlert = false })
                    Action(title = "Action 8", onClick = { showOnlyActionAlert = false })
                    Action(title = "Action 9", onClick = { showOnlyActionAlert = false })
                    Action(title = "Action 10", onClick = { showOnlyActionAlert = false })
                }
            ) {
                showOnlyActionAlert = false
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
                                .padding(horizontal = PersianTheme.spacing.size12)
                        ) {
                            RadioButton(
                                modifier = Modifier.fillMaxWidth(),
                                text = "Radio Button 1",
                                checked = false,
                                onCheckedChange = {}
                            )
                            RadioButton(
                                modifier = Modifier.fillMaxWidth(),
                                text = "Radio Button 2",
                                checked = true,
                                onCheckedChange = {}
                            )
                            RadioButton(
                                modifier = Modifier.fillMaxWidth(),
                                text = "Radio Button 3",
                                checked = false,
                                onCheckedChange = {}
                            )
                        }
                    }
                } else null
            )
        }
    }
}