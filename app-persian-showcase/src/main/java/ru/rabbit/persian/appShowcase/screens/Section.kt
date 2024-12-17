package ru.rabbit.persian.appShowcase.screens

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.imeNestedScroll
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.navigation.NavController
import io.github.madmaximuus.persian.formItem.Checkbox
import io.github.madmaximuus.persian.formItem.Checkboxes
import io.github.madmaximuus.persian.formItem.FormItem
import io.github.madmaximuus.persian.formItem.Input
import io.github.madmaximuus.persian.formItem.RadioButton
import io.github.madmaximuus.persian.formItem.RadioButtons
import io.github.madmaximuus.persian.formItem.Subhead
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.listItem.Icon
import io.github.madmaximuus.persian.listItem.Middle
import io.github.madmaximuus.persian.section.Item
import io.github.madmaximuus.persian.section.Section
import io.github.madmaximuus.persian.section.SectionDefaults
import io.github.madmaximuus.persian.text.Text
import io.github.madmaximuus.persian.topAppBar.TopAppBarDefaults
import io.github.madmaximuus.persian.topAppBar.rememberTopAppBarState
import io.github.madmaximuus.persianSymbols.chevronRight.ChevronRight
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols
import io.github.madmaximuus.persianSymbols.pentagon.Pentagon
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object Section : Screen {

    override val name: String = "Section"

    override val navigation: String = "section"

    @OptIn(ExperimentalLayoutApi::class)
    @Composable
    override fun Content(navController: NavController?) {
        val topAppBarScrollBehavior =
            TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())
        val titleState = rememberTextFieldState("Title")
        val detailsState = rememberTextFieldState("Details")
        val captionState = rememberTextFieldState("Caption")

        val (divider, onDividerChange) = remember { mutableStateOf(false) }
        val (title, onTitleChange) = remember { mutableStateOf(false) }
        val (details, onDetailsChange) = remember { mutableStateOf(false) }
        val (caption, onCaptionChange) = remember { mutableStateOf(false) }

        val styleStates = remember {
            listOf(
                mutableStateOf(true),
                mutableStateOf(false)
            )
        }

        SampleScaffold(
            title = name,
            onBackClick = { navController?.navigateUp() },
            topAppBarScrollBehavior = topAppBarScrollBehavior
        ) {
            Column(
                modifier = Modifier
                    .animateContentSize()
                    .nestedScroll(topAppBarScrollBehavior.nestedScrollConnection)
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
                    .padding(it)
                    .navigationBarsPadding()
                    .imeNestedScroll(),
            ) {
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = PersianTheme.spacing.size16),
                    text = "Sample",
                    style = PersianTheme.typography.labelSmall,
                    color = PersianTheme.colorScheme.onSurfaceVariant
                )
                Section(
                    title = if (title) titleState.text.toString() else null,
                    details = if (details) detailsState.text.toString() else null,
                    caption = if (caption) captionState.text.toString() else null,
                    colors = if (styleStates[0].value) SectionDefaults.plainColors()
                    else SectionDefaults.fillColors(),
                    divider = divider
                ) {
                    repeat(6) {
                        Item(
                            left = { Icon(icon = rememberVectorPainter(PersianSymbols.Default.Pentagon)) },
                            middle = { Middle(title = "Item ${it + 1}") },
                            right = { Icon(icon = rememberVectorPainter(PersianSymbols.Default.ChevronRight)) }
                        )
                    }
                }
                if (title) {
                    FormItem(
                        subhead = { Subhead(text = "Title") },
                        content = { Input(state = titleState) }
                    )
                }
                if (details) {
                    FormItem(
                        subhead = { Subhead(text = "Details") },
                        content = { Input(state = detailsState) }
                    )
                }
                if (caption) {
                    FormItem(
                        subhead = { Subhead(text = "Caption") },
                        content = { Input(state = captionState) }
                    )
                }
                FormItem(
                    subhead = { Subhead(text = "Style") },
                    content = {
                        RadioButtons {
                            RadioButton(
                                text = "Plain",
                                selected = styleStates[0].value,
                                onSelectedChange = {
                                    styleStates.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 0
                                    }
                                }
                            )
                            RadioButton(
                                text = "Fill",
                                selected = styleStates[1].value,
                                onSelectedChange = {
                                    styleStates.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 1
                                    }
                                }
                            )
                        }
                    }
                )
                FormItem(
                    subhead = { Subhead(text = "Settings") },
                    content = {
                        Checkboxes {
                            Checkbox(
                                text = "Title",
                                checked = title,
                                onCheckedChange = onTitleChange
                            )
                            Checkbox(
                                text = "Details",
                                checked = details,
                                onCheckedChange = onDetailsChange
                            )
                            Checkbox(
                                text = "Caption",
                                checked = caption,
                                onCheckedChange = onCaptionChange
                            )
                            Checkbox(
                                text = "Divider",
                                checked = divider,
                                onCheckedChange = onDividerChange
                            )
                        }
                    }
                )
            }
        }
    }
}