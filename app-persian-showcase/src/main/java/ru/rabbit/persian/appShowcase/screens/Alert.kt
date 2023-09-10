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
import ru.rabbit.persian.alert.AlertAction
import ru.rabbit.persian.alert.PersianAlerts
import ru.rabbit.persian.appShowcase.componets.SampleScaffold
import ru.rabbit.persian.buttons.PersianButton
import ru.rabbit.persian.buttons.PersianButtonSizes
import ru.rabbit.persian.foundation.icons
import ru.rabbit.persian.foundation.spacing
import ru.rabbit.persian.radioButtons.PersianRadioButton

object Alert : Screen {

    override val name: String = "Alerts"

    override val navigation: String = "alert"

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun Content(navController: NavController?) {
        var showOnlyActionAlert by remember { mutableStateOf(false) }
        var showAlert by remember { mutableStateOf(false) }
        var showAlertWithIcon by remember { mutableStateOf(false) }
        var showAlertWithDescription by remember { mutableStateOf(false) }
        var showAlertWithContent by remember { mutableStateOf(false) }
        SampleScaffold(title = name, onBackClick = { navController?.navigateUp() }) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.medium)
            ) {
                PersianButton.Primary(
                    text = "Only Action Alert",
                    size = PersianButtonSizes.large()
                ) {
                    showOnlyActionAlert = true
                }
                PersianButton.Primary(text = "Primary Alert", size = PersianButtonSizes.large()) {
                    showAlert = true
                }
                PersianButton.Primary(
                    text = "Primary Alert With Icon",
                    size = PersianButtonSizes.large()
                ) {
                    showAlertWithIcon = true
                }
                PersianButton.Primary(
                    text = "Primary Alert With Description",
                    size = PersianButtonSizes.large()
                ) {
                    showAlertWithDescription = true
                }
                PersianButton.Primary(
                    text = "Primary Alert With Content",
                    size = PersianButtonSizes.large()
                ) {
                    showAlertWithContent = true
                }
            }
        }
        if (showOnlyActionAlert) {
            PersianAlerts.OnlyAction(
                actions = listOf(
                    AlertAction("Action 1", onClick = {}),
                    AlertAction("Action 1", onClick = {}),
                )
            ) {
                showOnlyActionAlert = false
            }
        }
        if (showAlert) {
            PersianAlerts.Primary(
                title = "Alert",
                actions = listOf(
                    AlertAction("Action 1", onClick = {}),
                    AlertAction("Action 1", onClick = {}),
                ),
                onDismiss = { showAlert = false }
            )
        }
        if (showAlertWithIcon) {
            PersianAlerts.Primary(
                title = "Alert",
                icon = MaterialTheme.icons.appLogo,
                actions = listOf(
                    AlertAction("Action 1", onClick = {}),
                    AlertAction("Action 1", onClick = {}),
                ),
                onDismiss = { showAlertWithIcon = false }
            )
        }
        if (showAlertWithDescription) {
            PersianAlerts.Primary(
                title = "Alert",
                description = "s;oifudsikfgjgj`;klsxfhjgdjkl;fhg;udfhgjkdfhgjkehruioghdriuoghderio;gjhdeir;ohgio;dsrhg;ls`jgl;ishjg;jldhgj;odrhgdrhgerhguerioguhoihjg",
                actions = listOf(
                    AlertAction("Action 1", onClick = {}),
                    AlertAction("Action 1", onClick = {}),
                ),
                onDismiss = { showAlertWithDescription = false }
            )
        }
        if (showAlertWithContent) {
            PersianAlerts.Primary(
                title = "Alert",
                actions = listOf(
                    AlertAction("Action 1", onClick = {}),
                    AlertAction("Action 1", onClick = {}),
                ),
                onDismiss = { showAlertWithContent = false },
                content = {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .selectableGroup()
                            .padding(horizontal = MaterialTheme.spacing.medium)
                    ) {
                        PersianRadioButton.Primary(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Radio Button 1",
                            checked = false,
                            onCheckedChange = {})
                        PersianRadioButton.Primary(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Radio Button 1",
                            checked = false,
                            onCheckedChange = {})
                        PersianRadioButton.Primary(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Radio Button 1",
                            checked = false,
                            onCheckedChange = {})
                    }
                }
            )
        }
    }
}