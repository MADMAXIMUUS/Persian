package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
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
import io.github.madmaximuus.persian.buttons.PersianButton
import io.github.madmaximuus.persian.buttons.PersianButtonSizes
import io.github.madmaximuus.persian.foundation.spacing
import io.github.madmaximuus.persian.modalPage.PersianModalPage
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object ModalPage : Screen {

    override val name: String = "Modal Pages"

    override val navigation: String = "modalPage"

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun Content(navController: NavController?) {
        var showHalfExpanded by remember { mutableStateOf(false) }
        var showExpanded by remember { mutableStateOf(false) }
        var showFullScreen by remember { mutableStateOf(false) }
        SampleScaffold(title = name,
            onBackClick = { navController?.navigateUp() }
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.medium)
            ) {
                PersianButton.Primary(
                    text = "Half Expended",
                    sizes = PersianButtonSizes.large()
                ) {
                    showHalfExpanded = true
                }
                PersianButton.Primary(text = "Expanded", sizes = PersianButtonSizes.large()) {
                    showExpanded = true
                }
                PersianButton.Primary(
                    text = "Full Screen",
                    sizes = PersianButtonSizes.large()
                ) {
                    showFullScreen = true
                }
            }
        }
        if (showHalfExpanded) {
            PersianModalPage.DynamicHeight(
                onDismissRequest = { showHalfExpanded = false },
                title = "Half Expended",
                actionTitle = "Action",
                onActionClick = { },
                content = {
                }
            )
        }
        if (showExpanded) {
            PersianModalPage.Extended(
                onDismissRequest = { showExpanded = false },
                title = "Expended",
                actionTitle = "Action",
                onActionClick = { },
                content = {}
            )
        }
        if (showFullScreen) {
            PersianModalPage.FullScreen(
                onDismissRequest = { showFullScreen = false },
                title = "Full Screen",
                actionTitle = "Action",
                onActionClick = { },
                content = {}
            )
        }
    }
}