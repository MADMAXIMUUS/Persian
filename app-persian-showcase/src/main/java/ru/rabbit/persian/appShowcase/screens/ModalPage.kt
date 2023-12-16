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
import io.github.madmaximuus.persian.buttons.PersianButtonDefaults
import io.github.madmaximuus.persian.buttons.PersianPrimaryButton
import io.github.madmaximuus.persian.foundation.spacing
import io.github.madmaximuus.persian.modalPage.PersianDynamicHeightModalPage
import io.github.madmaximuus.persian.modalPage.PersianExtendedModalPage
import io.github.madmaximuus.persian.modalPage.PersianFullScreenModalPage
import io.github.madmaximuus.persian.modalPage.PersianModalPageTop
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object ModalPage : Screen {

    override val name: String = "Modal Pages"

    override val navigation: String = "modalPage"

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun Content(navController: NavController?) {
        var showHalfExpandedTop by remember { mutableStateOf(false) }
        var showHalfExpandedHandle by remember { mutableStateOf(false) }
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
                PersianPrimaryButton(
                    text = "Half Expended with TopBar",
                    sizes = PersianButtonDefaults.largeSizes()
                ) {
                    showHalfExpandedTop = true
                }
                PersianPrimaryButton(
                    text = "Half Expended with Handle",
                    sizes = PersianButtonDefaults.largeSizes()
                ) {
                    showHalfExpandedHandle = true
                }
                PersianPrimaryButton(
                    text = "Expanded",
                    sizes = PersianButtonDefaults.largeSizes()
                ) {
                    showExpanded = true
                }
                PersianPrimaryButton(
                    text = "Full Screen",
                    sizes = PersianButtonDefaults.largeSizes()
                ) {
                    showFullScreen = true
                }
            }
        }
        if (showHalfExpandedTop) {
            PersianDynamicHeightModalPage(
                onDismissRequest = { showHalfExpandedTop = false },
                top = PersianModalPageTop.TopBar(
                    title = "Half Expended",
                    actionTitle = "Action",
                    onActionClick = { }
                ),
                content = {
                }
            )
        }
        if (showHalfExpandedHandle) {
            PersianDynamicHeightModalPage(
                onDismissRequest = { showHalfExpandedHandle = false },
                top = PersianModalPageTop.Handle,
                content = {
                }
            )
        }
        if (showExpanded) {
            PersianExtendedModalPage(
                onDismissRequest = { showExpanded = false },
                title = "Expended",
                actionTitle = "Action",
                onActionClick = { },
                content = {}
            )
        }
        if (showFullScreen) {
            PersianFullScreenModalPage(
                onDismissRequest = { showFullScreen = false },
                title = "Full Screen",
                actionTitle = "Action",
                onActionClick = { },
                content = {}
            )
        }
    }
}