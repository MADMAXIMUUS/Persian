package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.navigation.NavController
import io.github.madmaximuus.persian.actionSheet.ActionSheetItem
import io.github.madmaximuus.persian.actionSheet.PersianActionSheet
import io.github.madmaximuus.persian.buttons.PersianButtonDefaults
import io.github.madmaximuus.persian.buttons.PersianPrimaryButton
import io.github.madmaximuus.persian.checkboxes.PersianCheckbox
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.inputs.PersianOutlineInput
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols
import io.github.madmaximuus.persianSymbols.image.base.Image
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
                    .padding(it),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                PersianPrimaryButton(
                    modifier = Modifier.padding(top = PersianTheme.spacing.size24),
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
                            top = PersianTheme.spacing.size16,
                            start = PersianTheme.spacing.size16,
                            end = PersianTheme.spacing.size16
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
                            modifier = Modifier.padding(horizontal = PersianTheme.spacing.size8),
                            value = titleValue,
                            isError = titleError,
                            onValueChange = onTitleValueChange
                        )
                        Spacer(modifier = Modifier.height(PersianTheme.spacing.size8))
                    }
                    PersianCheckbox(
                        modifier = Modifier.fillMaxWidth(),
                        text = "Subtitle",
                        checked = subtitle,
                        onCheckedChange = onSubtitleChange
                    )
                    if (subtitle) {
                        PersianOutlineInput(
                            modifier = Modifier.padding(horizontal = PersianTheme.spacing.size8),
                            value = subtitleValue,
                            isError = subtitleError,
                            onValueChange = onSubtitleValueChange
                        )
                        Spacer(modifier = Modifier.height(PersianTheme.spacing.size8))
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
        if (needShow) {
            PersianActionSheet(
                title = if (title) titleValue else null,
                subtitle = if (subtitle) subtitleValue else null,
                actions = listOf(
                    ActionSheetItem(
                        text = "Action 1",
                        leadingIcon = if (icons) rememberVectorPainter(PersianSymbols.Default.Image) else null,
                        negative = negative,
                        enabled = enabled,
                        onClick = {}
                    ),
                    ActionSheetItem(
                        text = "Action 2",
                        leadingIcon = if (icons) rememberVectorPainter(PersianSymbols.Default.Image) else null,
                        negative = negative,
                        enabled = enabled,
                        onClick = {}
                    ),
                    ActionSheetItem(
                        text = "Action 3",
                        leadingIcon = if (icons) rememberVectorPainter(PersianSymbols.Default.Image) else null,
                        negative = negative,
                        enabled = enabled,
                        onClick = {}
                    ),
                    ActionSheetItem(
                        text = "Action 4",
                        leadingIcon = if (icons) rememberVectorPainter(PersianSymbols.Default.Image) else null,
                        negative = negative,
                        enabled = enabled,
                        onClick = {}
                    ),
                    ActionSheetItem(
                        text = "Action 5",
                        leadingIcon = if (icons) rememberVectorPainter(PersianSymbols.Default.Image) else null,
                        negative = negative,
                        enabled = enabled,
                        onClick = {}
                    ),
                    ActionSheetItem(
                        text = "Action 6",
                        leadingIcon = if (icons) rememberVectorPainter(PersianSymbols.Default.Image) else null,
                        negative = negative,
                        enabled = enabled,
                        onClick = {}
                    ),
                    ActionSheetItem(
                        text = "Action 7",
                        leadingIcon = if (icons) rememberVectorPainter(PersianSymbols.Default.Image) else null,
                        negative = negative,
                        enabled = enabled,
                        onClick = {}
                    ),
                    ActionSheetItem(
                        text = "Action 8",
                        leadingIcon = if (icons) rememberVectorPainter(PersianSymbols.Default.Image) else null,
                        negative = negative,
                        enabled = enabled,
                        onClick = {}
                    ),
                    ActionSheetItem(
                        text = "Action 9",
                        leadingIcon = if (icons) rememberVectorPainter(PersianSymbols.Default.Image) else null,
                        negative = negative,
                        enabled = enabled,
                        onClick = {}
                    ),
                    ActionSheetItem(
                        text = "Action 10",
                        leadingIcon = if (icons) rememberVectorPainter(PersianSymbols.Default.Image) else null,
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