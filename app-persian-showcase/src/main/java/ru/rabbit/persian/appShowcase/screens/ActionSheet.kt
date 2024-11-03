package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.navigation.NavController
import io.github.madmaximuus.persian.actionSheet.Action
import io.github.madmaximuus.persian.actionSheet.ActionSheet
import io.github.madmaximuus.persian.actionSheet.Header
import io.github.madmaximuus.persian.button.ButtonDefaults
import io.github.madmaximuus.persian.button.PrimaryButton
import io.github.madmaximuus.persian.forms.Checkbox
import io.github.madmaximuus.persian.forms.Checkboxes
import io.github.madmaximuus.persian.forms.Form
import io.github.madmaximuus.persian.forms.Subhead
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.input.OutlineInput
import io.github.madmaximuus.persian.textAreas.OutlineTextArea
import io.github.madmaximuus.persian.topAppBar.TopAppBarDefaults
import io.github.madmaximuus.persian.topAppBar.rememberTopAppBarState
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols
import io.github.madmaximuus.persianSymbols.image.base.Image
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object ActionSheet : Screen {
    override val name: String = "Action Sheet"

    override val navigation: String = "actionSheet"

    @Composable
    override fun Content(navController: NavController?) {
        var needShow by remember { mutableStateOf(false) }
        val (title, onTitleChange) = remember { mutableStateOf(false) }
        val (message, onMessageChange) = remember { mutableStateOf(false) }
        val (titleValue, onTitleValueChange) = remember { mutableStateOf("Title") }
        val (subtitleValue, onSubtitleValueChange) = remember { mutableStateOf("A message should be a short, complete sentence.") }
        val (icons, onIconsChange) = remember { mutableStateOf(false) }
        val (negative, onNegativeChange) = remember { mutableStateOf(false) }
        var titleError by remember { mutableStateOf(false) }
        var subtitleError by remember { mutableStateOf(false) }
        val (enabled, onEnabledChange) = remember { mutableStateOf(true) }
        val topAppBarScrollBehavior =
            TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())
        SampleScaffold(
            title = name,
            onBackClick = {
                navController?.navigateUp()
            },
            topAppBarScrollBehavior = topAppBarScrollBehavior
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it)
                    .navigationBarsPadding(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                if (title) {
                    OutlineInput(
                        modifier = Modifier
                            .padding(horizontal = PersianTheme.spacing.size16)
                            .padding(top = PersianTheme.spacing.size8),
                        value = titleValue,
                        isError = titleError,
                        onValueChange = onTitleValueChange
                    )
                }
                if (message) {
                    OutlineTextArea(
                        modifier = Modifier
                            .padding(horizontal = PersianTheme.spacing.size16)
                            .padding(top = PersianTheme.spacing.size12),
                        value = subtitleValue,
                        isError = subtitleError,
                        onValueChange = onSubtitleValueChange
                    )
                }
                Form(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = PersianTheme.spacing.size20),
                    subhead = {
                        Subhead(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Settings"
                        )
                    },
                    content = {
                        Checkboxes {
                            Checkbox(
                                text = "Title",
                                checked = title,
                                onCheckedChange = onTitleChange
                            )
                            Checkbox(
                                text = "Message",
                                checked = message,
                                onCheckedChange = onMessageChange
                            )
                            Checkbox(
                                text = "Icons",
                                checked = icons,
                                onCheckedChange = onIconsChange
                            )
                            Checkbox(
                                text = "Negative",
                                checked = negative,
                                onCheckedChange = onNegativeChange
                            )
                            Checkbox(
                                text = "Enabled",
                                checked = enabled,
                                onCheckedChange = onEnabledChange
                            )
                        }
                    }
                )
                PrimaryButton(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = PersianTheme.spacing.size8)
                        .padding(horizontal = PersianTheme.spacing.size16),
                    text = "Show Action sheet",
                    sizes = ButtonDefaults.largeSizes(),
                    colors = ButtonDefaults.primaryColors()
                ) {
                    if (title && titleValue.isEmpty()) {
                        needShow = false
                        titleError = true
                        subtitleError = false
                    } else if (message && subtitleValue.isEmpty()) {
                        needShow = false
                        titleError = false
                        subtitleError = true
                    } else {
                        needShow = true
                        titleError = false
                        subtitleError = false
                    }
                }
            }
        }
        if (needShow) {
            ActionSheet(
                header = if (title || message) {
                    {
                        Header(
                            title = if (title) titleValue else null,
                            message = if (message) subtitleValue else null,
                        )
                    }
                } else null,
                actions = {
                    Action(
                        text = "Action 1",
                        leadingIcon = if (icons) rememberVectorPainter(PersianSymbols.Default.Image) else null,
                        destructive = negative,
                        enabled = enabled,
                        onClick = {}
                    )
                    Action(
                        text = "Action 2",
                        leadingIcon = if (icons) rememberVectorPainter(PersianSymbols.Default.Image) else null,
                        destructive = negative,
                        enabled = enabled,
                        onClick = {}
                    )
                    Action(
                        text = "Action 3",
                        leadingIcon = if (icons) rememberVectorPainter(PersianSymbols.Default.Image) else null,
                        destructive = negative,
                        enabled = enabled,
                        onClick = {}
                    )
                    Action(
                        text = "Action 4",
                        leadingIcon = if (icons) rememberVectorPainter(PersianSymbols.Default.Image) else null,
                        destructive = negative,
                        enabled = enabled,
                        onClick = {}
                    )
                    Action(
                        text = "Action 5",
                        leadingIcon = if (icons) rememberVectorPainter(PersianSymbols.Default.Image) else null,
                        destructive = negative,
                        enabled = enabled,
                        onClick = {}
                    )
                    Action(
                        text = "Action 6",
                        leadingIcon = if (icons) rememberVectorPainter(PersianSymbols.Default.Image) else null,
                        destructive = negative,
                        enabled = enabled,
                        onClick = {}
                    )
                    Action(
                        text = "Action 7",
                        leadingIcon = if (icons) rememberVectorPainter(PersianSymbols.Default.Image) else null,
                        destructive = negative,
                        enabled = enabled,
                        onClick = {}
                    )
                    Action(
                        text = "Action 8",
                        leadingIcon = if (icons) rememberVectorPainter(PersianSymbols.Default.Image) else null,
                        destructive = negative,
                        enabled = enabled,
                        onClick = {}
                    )
                    Action(
                        text = "Action 9",
                        leadingIcon = if (icons) rememberVectorPainter(PersianSymbols.Default.Image) else null,
                        destructive = negative,
                        enabled = enabled,
                        onClick = {}
                    )
                    Action(
                        text = "Action 10",
                        leadingIcon = if (icons) rememberVectorPainter(PersianSymbols.Default.Image) else null,
                        destructive = negative,
                        enabled = enabled,
                        onClick = {}
                    )
                },
                onDismissRequest = { needShow = false }
            )
        }
    }
}