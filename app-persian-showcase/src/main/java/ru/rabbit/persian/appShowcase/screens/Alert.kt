package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import io.github.madmaximuus.persian.alert.AlertAction
import io.github.madmaximuus.persian.alert.PersianAlert
import io.github.madmaximuus.persian.alert.PersianOnlyActionAlert
import io.github.madmaximuus.persian.buttons.PersianButtonDefaults
import io.github.madmaximuus.persian.buttons.PersianPrimaryButton
import io.github.madmaximuus.persian.checkboxes.PersianCheckbox
import io.github.madmaximuus.persian.foundation.icons
import io.github.madmaximuus.persian.foundation.spacing
import io.github.madmaximuus.persian.inputs.PersianInput
import io.github.madmaximuus.persian.radioButtons.PersianRadioButton
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object Alert : Screen {

    override val name: String = "Alerts"

    override val navigation: String = "alert"

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun Content(navController: NavController?) {
        var showOnlyActionAlert by remember { mutableStateOf(false) }
        var showAlert by remember { mutableStateOf(false) }
        val (icon, onIconChange) = remember { mutableStateOf(false) }
        val (description, onDescriptionChange) = remember { mutableStateOf(false) }
        var titleError by remember { mutableStateOf(false) }
        var descriptionError by remember { mutableStateOf(false) }
        val (content, onContentChange) = remember { mutableStateOf(false) }
        val (titleValue, onTitleValueChange) = remember { mutableStateOf("Basic Dialog Title") }
        val (descriptionValue, onDescriptionValueChange) = remember {
            mutableStateOf("A dialog is a type of modal window that appears in front of app content to provide critical information, or prompt for a decision to be made. ")
        }
        SampleScaffold(title = name, onBackClick = { navController?.navigateUp() }) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.medium)
            ) {
                PersianPrimaryButton(
                    text = "Only Action Alert",
                    sizes = PersianButtonDefaults.largeSizes()
                ) {
                    showOnlyActionAlert = true
                }
                PersianPrimaryButton(
                    text = "Primary Alert",
                    sizes = PersianButtonDefaults.largeSizes()
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
                            top = MaterialTheme.spacing.large,
                            start = MaterialTheme.spacing.large,
                            end = MaterialTheme.spacing.large
                        )
                ) {
                    PersianInput(
                        modifier = Modifier.padding(horizontal = MaterialTheme.spacing.small),
                        value = titleValue,
                        isError = titleError,
                        onValueChange = onTitleValueChange
                    )
                    Spacer(modifier = Modifier.height(MaterialTheme.spacing.small))
                    PersianCheckbox(
                        modifier = Modifier.fillMaxWidth(),
                        text = "Subtitle",
                        checked = description,
                        onCheckedChange = onDescriptionChange
                    )
                    if (description) {
                        PersianInput(
                            modifier = Modifier.padding(horizontal = MaterialTheme.spacing.small),
                            value = descriptionValue,
                            isError = descriptionError,
                            onValueChange = onDescriptionValueChange
                        )
                        Spacer(modifier = Modifier.height(MaterialTheme.spacing.small))
                    }
                    PersianCheckbox(
                        modifier = Modifier.fillMaxWidth(),
                        text = "Icons",
                        checked = icon,
                        onCheckedChange = onIconChange
                    )
                    PersianCheckbox(
                        modifier = Modifier.fillMaxWidth(),
                        text = "Content",
                        checked = content,
                        onCheckedChange = onContentChange
                    )
                }
            }
        }
        if (showOnlyActionAlert) {
            PersianOnlyActionAlert(
                actions = listOf(
                    AlertAction("Action 1", onClick = { showOnlyActionAlert = false }),
                    AlertAction("Action 2", onClick = { showOnlyActionAlert = false }),
                    AlertAction("Action 3", onClick = { showOnlyActionAlert = false }),
                    AlertAction("Action 4", onClick = { showOnlyActionAlert = false }),
                    AlertAction("Action 5", onClick = { showOnlyActionAlert = false }),
                    AlertAction("Action 6", onClick = { showOnlyActionAlert = false }),
                    AlertAction("Action 7", onClick = { showOnlyActionAlert = false }),
                    AlertAction("Action 8", onClick = { showOnlyActionAlert = false }),
                    AlertAction("Action 9", onClick = { showOnlyActionAlert = false }),
                    AlertAction("Action 10", onClick = { showOnlyActionAlert = false }),
                    AlertAction("Action 11", onClick = { showOnlyActionAlert = false }),
                )
            ) {
                showOnlyActionAlert = false
            }
        }
        if (showAlert) {
            PersianAlert(
                icon = if (icon) MaterialTheme.icons.image else null,
                title = titleValue,
                actions = listOf(
                    AlertAction("OK", onClick = { showAlert = false }),
                    AlertAction("Cancel", onClick = { showAlert = false }),
                ),
                description = if (description) descriptionValue else null,
                onDismiss = { showAlert = false },
                content = if (content) {
                    {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .selectableGroup()
                                .padding(horizontal = MaterialTheme.spacing.medium)
                        ) {
                            PersianRadioButton(
                                modifier = Modifier.fillMaxWidth(),
                                text = "Radio Button 1",
                                checked = false,
                                onCheckedChange = {}
                            )
                            PersianRadioButton(
                                modifier = Modifier.fillMaxWidth(),
                                text = "Radio Button 2",
                                checked = true,
                                onCheckedChange = {}
                            )
                            PersianRadioButton(
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