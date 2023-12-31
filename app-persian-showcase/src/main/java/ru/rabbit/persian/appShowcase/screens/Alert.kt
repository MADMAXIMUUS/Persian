package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
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
import io.github.madmaximuus.persian.foundation.icons
import io.github.madmaximuus.persian.foundation.spacing
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
        var showAlertWithIcon by remember { mutableStateOf(false) }
        var showAlertWithContent by remember { mutableStateOf(false) }
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
                    showAlert = true
                }
                PersianPrimaryButton(
                    text = "Primary Alert With Icon",
                    sizes = PersianButtonDefaults.largeSizes()
                ) {
                    showAlertWithIcon = true
                }
                PersianPrimaryButton(
                    text = "Primary Alert With Content",
                    sizes = PersianButtonDefaults.largeSizes()
                ) {
                    showAlertWithContent = true
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
                title = "Alert",
                actions = listOf(
                    AlertAction("OK", onClick = { showAlert = false }),
                    AlertAction("Cancel", onClick = { showAlert = false }),
                ),
                description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi malesuada, felis sit amet maximus scelerisque, ligula risus volutpat leo, vitae maximus nisi velit eu ante. Cras bibendum arcu non ultricies.",
                onDismiss = { showAlert = false }
            )
        }
        if (showAlertWithIcon) {
            PersianAlert(
                title = "Alert",
                icon = MaterialTheme.icons.errorCircle,
                actions = listOf(
                    AlertAction("OK", onClick = { showAlertWithIcon = false }),
                    AlertAction("Cancel", onClick = { showAlertWithIcon = false }),
                ),
                description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi malesuada, felis sit amet maximus scelerisque, ligula risus volutpat leo, vitae maximus nisi velit eu ante. Cras bibendum arcu non ultricies.",
                onDismiss = { showAlertWithIcon = false }
            )
        }
        if (showAlertWithContent) {
            PersianAlert(
                title = "Alert",
                actions = listOf(
                    AlertAction("OK", onClick = { showAlertWithContent = false }),
                    AlertAction("Cancel", onClick = { showAlertWithContent = false }),
                ),
                description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi malesuada, felis sit amet maximus scelerisque, ligula risus volutpat leo, vitae maximus nisi velit eu ante. Cras bibendum arcu non ultricies.",
                onDismiss = { showAlertWithContent = false },
                content = {
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
                            onCheckedChange = {})
                        PersianRadioButton(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Radio Button 2",
                            checked = true,
                            onCheckedChange = {})
                        PersianRadioButton(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Radio Button 3",
                            checked = false,
                            onCheckedChange = {})
                    }
                }
            )
        }
    }
}