package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
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
import io.github.madmaximuus.persian.actionSheet.ActionSheetItem
import io.github.madmaximuus.persian.actionSheet.PersianActionSheet
import io.github.madmaximuus.persian.buttons.PersianButtonDefaults
import io.github.madmaximuus.persian.buttons.PersianPrimaryButton
import io.github.madmaximuus.persian.foundation.icons
import io.github.madmaximuus.persian.foundation.spacing
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object ActionSheet : Screen {
    override val name: String = "Action Sheets"

    override val navigation: String = "actionSheets"

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun Content(navController: NavController?) {
        var needShow by remember {
            mutableStateOf(false)
        }
        var needShowWithTitle by remember {
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
                contentAlignment = Alignment.TopCenter
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    PersianPrimaryButton(
                        text = "Show sheet",
                        sizes = PersianButtonDefaults.largeSizes(),
                        colors = PersianButtonDefaults.primaryColors()
                    ) {
                        needShow = true
                    }
                    Spacer(modifier = Modifier.height(MaterialTheme.spacing.extraExtraLarge))
                    PersianPrimaryButton(
                        text = "Show sheet with title",
                        sizes = PersianButtonDefaults.largeSizes(),
                        colors = PersianButtonDefaults.primaryColors()
                    ) {
                        needShowWithTitle = true
                    }
                }
            }
        }
        if (needShowWithTitle) {
            PersianActionSheet(
                title = "Title",
                subtitle = "Subtitle",
                actions = listOf(
                    ActionSheetItem(
                        text = "Action 1",
                        leadingIcon = MaterialTheme.icons.person,
                        onClick = {
                            it::triggerAnimatedDismiss.invoke()
                        }
                    ),
                    ActionSheetItem(
                        text = "Action 2",
                        leadingIcon = MaterialTheme.icons.search,
                        onClick = {
                            it::triggerAnimatedDismiss.invoke()
                        }
                    ),
                    ActionSheetItem(
                        text = "Action 3",
                        leadingIcon = MaterialTheme.icons.done,
                        onClick = {
                            it::triggerAnimatedDismiss.invoke()
                        }
                    ),
                    ActionSheetItem(
                        text = "Action 4",
                        leadingIcon = MaterialTheme.icons.add,
                        onClick = {
                            it::triggerAnimatedDismiss.invoke()
                        }
                    ),
                    ActionSheetItem(
                        text = "Action 5",
                        leadingIcon = MaterialTheme.icons.image,
                        onClick = {
                            it::triggerAnimatedDismiss.invoke()
                        }
                    ),
                    ActionSheetItem(
                        text = "Action 6",
                        leadingIcon = MaterialTheme.icons.close,
                        onClick = {

                        }
                    ),
                    ActionSheetItem(
                        text = "Action 7",
                        leadingIcon = MaterialTheme.icons.expendMore,
                        onClick = {
                            it::triggerAnimatedDismiss.invoke()
                        }
                    ),
                    ActionSheetItem(
                        text = "Action 8",
                        leadingIcon = MaterialTheme.icons.expendLess,
                        onClick = {
                            it::triggerAnimatedDismiss.invoke()
                        }
                    ),
                    ActionSheetItem(
                        text = "Action 9",
                        leadingIcon = MaterialTheme.icons.checkCircle,
                        negative = true,
                        onClick = {
                            it::triggerAnimatedDismiss.invoke()
                        }
                    ),
                ), onDismissRequest = { needShowWithTitle = false }
            )
        }
        if (needShow) {
            PersianActionSheet(
                actions = listOf(
                    ActionSheetItem(
                        text = "Action 1",
                        leadingIcon = MaterialTheme.icons.person,
                        onClick = {
                            it::triggerAnimatedDismiss.invoke()
                        }
                    ),
                    ActionSheetItem(
                        text = "Action 2",
                        leadingIcon = MaterialTheme.icons.search,
                        onClick = {
                            it::triggerAnimatedDismiss.invoke()
                        }
                    ),
                    ActionSheetItem(
                        text = "Action 3",
                        leadingIcon = MaterialTheme.icons.done,
                        onClick = {
                            it::triggerAnimatedDismiss.invoke()
                        }
                    ),
                    ActionSheetItem(
                        text = "Action 4",
                        leadingIcon = MaterialTheme.icons.add,
                        onClick = {
                            it::triggerAnimatedDismiss.invoke()
                        }
                    ),
                    ActionSheetItem(
                        text = "Action 5",
                        leadingIcon = MaterialTheme.icons.image,
                        onClick = {
                            it::triggerAnimatedDismiss.invoke()
                        }
                    ),
                    ActionSheetItem(
                        text = "Action 6",
                        leadingIcon = MaterialTheme.icons.close,
                        onClick = {

                        }
                    ),
                    ActionSheetItem(
                        text = "Action 7",
                        leadingIcon = MaterialTheme.icons.expendMore,
                        onClick = {
                            it::triggerAnimatedDismiss.invoke()
                        }
                    ),
                    ActionSheetItem(
                        text = "Action 8",
                        leadingIcon = MaterialTheme.icons.expendLess,
                        onClick = {
                            it::triggerAnimatedDismiss.invoke()
                        }
                    ),
                    ActionSheetItem(
                        text = "Action 9",
                        leadingIcon = MaterialTheme.icons.checkCircle,
                        negative = true,
                        onClick = {
                            it::triggerAnimatedDismiss.invoke()
                        }
                    ),
                ),

                onDismissRequest = { needShow = false }
            )
        }
    }
}