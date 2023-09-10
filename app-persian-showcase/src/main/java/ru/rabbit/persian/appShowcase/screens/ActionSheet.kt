package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.Box
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
import ru.rabbit.persian.actionSheet.ActionItem
import ru.rabbit.persian.actionSheet.PersianActionSheet
import ru.rabbit.persian.appShowcase.componets.SampleScaffold
import ru.rabbit.persian.buttons.PersianButton
import ru.rabbit.persian.buttons.PersianButtonColors
import ru.rabbit.persian.buttons.PersianButtonSizes
import ru.rabbit.persian.foundation.PersianComponentStyle
import ru.rabbit.persian.foundation.icons

object ActionSheet : Screen {
    override val name: String = "Action Sheets"

    override val navigation: String = "actionSheets"

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun Content(navController: NavController?) {
        var needShow by remember {
            mutableStateOf(false)
        }
        SampleScaffold(
            title = name,
            onBackClick = {
                navController?.navigateUp()
            }
        ) {

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it),
                contentAlignment = Alignment.Center
            ) {
                PersianButton.Primary(
                    text = "Show sheet",
                    size = PersianButtonSizes.large(),
                    colors = PersianButtonColors.primary(style = PersianComponentStyle.FILL)
                ) {
                    needShow = true
                }
            }
        }
        if (needShow) {
            PersianActionSheet.Primary(
                header = {
                    Primary(
                        title = "Title",
                        subtitle = "Subtitle"
                    )
                },
                actions = listOf(
                    ActionItem(
                        text = "Action 1",
                        leadingIcon = MaterialTheme.icons.edit,
                        onClick = {}),
                    ActionItem(
                        text = "Action 2",
                        leadingIcon = MaterialTheme.icons.edit,
                        onClick = {}),
                    ActionItem(
                        text = "Action 3",
                        leadingIcon = MaterialTheme.icons.edit,
                        onClick = {}),
                    ActionItem(
                        text = "Action 4",
                        leadingIcon = MaterialTheme.icons.edit,
                        onClick = {}),
                    ActionItem(
                        text = "Action 5",
                        leadingIcon = MaterialTheme.icons.edit,
                        onClick = {}),
                    ActionItem(
                        text = "Action 6",
                        leadingIcon = MaterialTheme.icons.edit,
                        onClick = {}),
                    ActionItem(
                        text = "Action 7",
                        leadingIcon = MaterialTheme.icons.edit,
                        onClick = {}),
                    ActionItem(
                        text = "Action 8",
                        leadingIcon = MaterialTheme.icons.edit,
                        onClick = {}),
                    ActionItem(
                        text = "Action 9",
                        leadingIcon = MaterialTheme.icons.edit,
                        negative = true,
                        onClick = {}),
                ),
                onDismissRequest = { needShow = false }
            )
        }
    }
}