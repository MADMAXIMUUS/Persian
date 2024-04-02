package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavController
import io.github.madmaximuus.persian.actionSheet.ActionSheetItem
import io.github.madmaximuus.persian.actionSheet.PersianActionSheet
import io.github.madmaximuus.persian.buttons.PersianButtonDefaults
import io.github.madmaximuus.persian.buttons.PersianPrimaryButton
import io.github.madmaximuus.persian.checkboxes.PersianCheckbox
import io.github.madmaximuus.persian.foundation.spacing
import io.github.madmaximuus.persian.inputs.PersianOutlineInput
import io.github.madmaximuus.persian.navigationBar.NavigationBarItem
import ru.rabbit.persian.appShowcase.R
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object ActionSheet : Screen {
    override val name: String = "Action Sheets"

    override val navigation: String = "actionSheets"

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun Content(navController: NavController?) {
        var needShow by remember { mutableStateOf(false) }
        val (title, onTitleChange) = remember { mutableStateOf(false) }
        val (subtitle, onSubtitleChange) = remember { mutableStateOf(false) }
        val (titleValue, onTitleValueChange) = remember { mutableStateOf("Title") }
        val (subtitleValue, onSubtitleValueChange) = remember { mutableStateOf("A message should be a short, complete sentence.") }
        val (icons, onIconsChange) = remember { mutableStateOf(false) }
        val (negative, onNegativeChange) = remember { mutableStateOf(false) }
        var titleError by remember { mutableStateOf(false) }
        var subtitleError by remember { mutableStateOf(false) }
        val (enabled, onEnabledChange) = remember { mutableStateOf(true) }
        var selected1 by remember { mutableStateOf(true) }
        var selected2 by remember { mutableStateOf(false) }
        val topAppBarScrollBehavior =
            TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())
        SampleScaffold(
            title = name,
            onBackClick = {
                navController?.navigateUp()
            },
            navigationBarItems = listOf(
                NavigationBarItem(
                    selected = selected1,
                    text = "Playground",
                    onClick = {
                        selected1 = true
                        selected2 = false
                    },
                    icon = painterResource(id = R.drawable.ic_settings),
                    selectedIcon = painterResource(id = R.drawable.ic_settings)
                ),
                NavigationBarItem(
                    selected = selected2,
                    text = "Documentation",
                    onClick = {
                        selected1 = false
                        selected2 = true
                    },
                    icon = painterResource(id = R.drawable.ic_documentation_outlined),
                    selectedIcon = painterResource(id = R.drawable.ic_documentation_filled)
                ),
            ),
            topAppBarScrollBehavior = topAppBarScrollBehavior
        ) {
            if (selected1) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(it),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    PersianPrimaryButton(
                        modifier = Modifier.padding(top = MaterialTheme.spacing.extraExtraLarge),
                        text = "Show sheet",
                        sizes = PersianButtonDefaults.largeSizes(),
                        colors = PersianButtonDefaults.primaryColors()
                    ) {
                        if (title && titleValue.isEmpty()) {
                            needShow = false
                            titleError = true
                            subtitleError = false
                        } else if (subtitle && subtitleValue.isEmpty()) {
                            needShow = false
                            titleError = false
                            subtitleError = true
                        } else {
                            needShow = true
                            titleError = false
                            subtitleError = false
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
                        PersianCheckbox(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Title",
                            checked = title,
                            onCheckedChange = onTitleChange
                        )
                        if (title) {
                            PersianOutlineInput(
                                modifier = Modifier.padding(horizontal = MaterialTheme.spacing.small),
                                value = titleValue,
                                isError = titleError,
                                onValueChange = onTitleValueChange
                            )
                            Spacer(modifier = Modifier.height(MaterialTheme.spacing.small))
                        }
                        PersianCheckbox(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Subtitle",
                            checked = subtitle,
                            onCheckedChange = onSubtitleChange
                        )
                        if (subtitle) {
                            PersianOutlineInput(
                                modifier = Modifier.padding(horizontal = MaterialTheme.spacing.small),
                                value = subtitleValue,
                                isError = subtitleError,
                                onValueChange = onSubtitleValueChange
                            )
                            Spacer(modifier = Modifier.height(MaterialTheme.spacing.small))
                        }
                        PersianCheckbox(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Icons",
                            checked = icons,
                            onCheckedChange = onIconsChange
                        )
                        PersianCheckbox(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Negative",
                            checked = negative,
                            onCheckedChange = onNegativeChange
                        )
                        PersianCheckbox(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Enabled",
                            checked = enabled,
                            onCheckedChange = onEnabledChange
                        )
                    }
                }
            }
            if (selected2) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(it)
                        .nestedScroll(topAppBarScrollBehavior.nestedScrollConnection)
                        .verticalScroll(rememberScrollState()),
                    verticalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.large)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = MaterialTheme.spacing.large),
                        verticalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.small),
                    ) {
                        Text(
                            text = "Description",
                            style = MaterialTheme.typography.headlineSmall
                        )
                        Text(
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Justify,
                            text = "Action sheet is an element that presents a contextual menu displayed at the bottom of the screen. This element provides the user with several action options related to the current context. Action sheet is used in cases where an action selection is required, but there is no need to display these actions permanently on the screen.",
                            style = MaterialTheme.typography.bodyLarge
                        )
                    }
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = MaterialTheme.spacing.large),
                        verticalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.small),
                    ) {
                        Text(
                            text = "Usage",
                            style = MaterialTheme.typography.headlineSmall
                        )
                        Text(
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Justify,
                            text = "Action sheet is invoked in response to a specific user action, such as pressing a button. When invoked, the action sheet appears from the bottom of the screen, dimming the rest of the screen. The user can select one of the proposed actions by clicking on the corresponding menu item, or cancel the selection by clicking on the area outside the action sheet.",
                            style = MaterialTheme.typography.bodyLarge
                        )
                    }
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = MaterialTheme.spacing.large),
                        verticalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.small),
                    ) {
                        Text(
                            text = "Menu Item States",
                            style = MaterialTheme.typography.headlineSmall
                        )
                        Text(
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Justify,
                            text = "Menu items in the action sheet can have two states: default and negative. The default state is used for standard actions that do not have negative consequences. The negative state is used for actions that may lead to undesirable consequences, such as data deletion.",
                            style = MaterialTheme.typography.bodyLarge
                        )
                    }
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = MaterialTheme.spacing.large),
                        verticalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.small),
                    ) {
                        Text(
                            text = "Title and Message",
                            style = MaterialTheme.typography.headlineSmall
                        )
                        Text(
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Justify,
                            text = "In the action sheet, you can add a title and a message that will be displayed above the menu items. The title should briefly describe the purpose of the action sheet, and the message should provide additional information necessary for selecting an action.",
                            style = MaterialTheme.typography.bodyLarge
                        )
                    }
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = MaterialTheme.spacing.large),
                        verticalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.small),
                    ) {
                        Text(
                            text = "Example of Use",
                            style = MaterialTheme.typography.headlineSmall
                        )
                        Text(
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Justify,
                            text = "For example, in a photo editing application, an action sheet can be invoked when the \"Actions\" button is pressed while viewing a photo. The action sheet may contain the following menu items:\n" +
                                    "— \"Save photo\" (regular state)\n" +
                                    "— \"*Share photo\" (regular state)\n" +
                                    "— \"Delete photo\" (negative state)\n" +
                                    "\nIn addition, the action sheet may contain a title \"What to do with the photo?\" and a message \"Select one of the following actions\".",
                            style = MaterialTheme.typography.bodyLarge
                        )
                    }
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = MaterialTheme.spacing.large)
                            .padding(bottom = MaterialTheme.spacing.small),
                        verticalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.small),
                    ) {
                        Text(
                            text = "Design Recommendations",
                            style = MaterialTheme.typography.headlineSmall
                        )
                        Text(
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Justify,
                            text = "— Use action sheet only for contextual actions related to the current screen.\n" +
                                    "— Do not add too many menu items to the action sheet to avoid overwhelming the user with choices.\n" +
                                    "— Use the negative state for actions that may lead to undesirable consequences.\n" +
                                    "— Make the title and message in the action sheet concise and informative.",
                            style = MaterialTheme.typography.bodyLarge
                        )
                    }
                }
            }
        }
        if (needShow) {
            PersianActionSheet(
                title = if (title) titleValue else null,
                subtitle = if (subtitle) subtitleValue else null,
                actions = listOf(
                    ActionSheetItem(
                        text = "Action 1",
                        leadingIcon = if (icons) painterResource(id = R.drawable.pentagon) else null,
                        negative = negative,
                        enabled = enabled,
                        onClick = {}
                    ),
                    ActionSheetItem(
                        text = "Action 2",
                        leadingIcon = if (icons) painterResource(id = R.drawable.pentagon) else null,
                        negative = negative,
                        enabled = enabled,
                        onClick = {}
                    ),
                    ActionSheetItem(
                        text = "Action 3",
                        leadingIcon = if (icons) painterResource(id = R.drawable.pentagon) else null,
                        negative = negative,
                        enabled = enabled,
                        onClick = {}
                    ),
                    ActionSheetItem(
                        text = "Action 4",
                        leadingIcon = if (icons) painterResource(id = R.drawable.pentagon) else null,
                        negative = negative,
                        enabled = enabled,
                        onClick = {}
                    ),
                    ActionSheetItem(
                        text = "Action 5",
                        leadingIcon = if (icons) painterResource(id = R.drawable.pentagon) else null,
                        negative = negative,
                        enabled = enabled,
                        onClick = {}
                    ),
                    ActionSheetItem(
                        text = "Action 6",
                        leadingIcon = if (icons) painterResource(id = R.drawable.pentagon) else null,
                        negative = negative,
                        enabled = enabled,
                        onClick = {}
                    ),
                    ActionSheetItem(
                        text = "Action 7",
                        leadingIcon = if (icons) painterResource(id = R.drawable.pentagon) else null,
                        negative = negative,
                        enabled = enabled,
                        onClick = {}
                    ),
                    ActionSheetItem(
                        text = "Action 8",
                        leadingIcon = if (icons) painterResource(id = R.drawable.pentagon) else null,
                        negative = negative,
                        enabled = enabled,
                        onClick = {}
                    ),
                    ActionSheetItem(
                        text = "Action 9",
                        leadingIcon = if (icons) painterResource(id = R.drawable.pentagon) else null,
                        negative = negative,
                        enabled = enabled,
                        onClick = {}
                    ),
                    ActionSheetItem(
                        text = "Action 10",
                        leadingIcon = if (icons) painterResource(id = R.drawable.pentagon) else null,
                        negative = negative,
                        enabled = enabled,
                        onClick = {}
                    ),
                ),
                onDismissRequest = { needShow = false }
            )
        }
    }
}