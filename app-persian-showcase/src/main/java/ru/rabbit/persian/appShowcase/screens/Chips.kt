package ru.rabbit.persian.appShowcase.screens

import android.net.Uri
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.navigation.NavController
import io.github.madmaximuus.persian.checkboxes.Checkbox
import io.github.madmaximuus.persian.chips.assist.AssistChip
import io.github.madmaximuus.persian.chips.assist.Icon
import io.github.madmaximuus.persian.chips.assist.Image
import io.github.madmaximuus.persian.chips.filter.FilterChip
import io.github.madmaximuus.persian.chips.filter.Icon
import io.github.madmaximuus.persian.chips.input.Avatar
import io.github.madmaximuus.persian.chips.input.Icon
import io.github.madmaximuus.persian.chips.input.Image
import io.github.madmaximuus.persian.chips.input.InputShip
import io.github.madmaximuus.persian.chips.suggestion.Icon
import io.github.madmaximuus.persian.chips.suggestion.SuggestionChip
import io.github.madmaximuus.persian.forms.Checkboxes
import io.github.madmaximuus.persian.forms.FormItem
import io.github.madmaximuus.persian.forms.Input
import io.github.madmaximuus.persian.forms.RadioButton
import io.github.madmaximuus.persian.forms.RadioButtons
import io.github.madmaximuus.persian.forms.Subhead
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.topAppBar.TopAppBarDefaults
import io.github.madmaximuus.persian.topAppBar.rememberTopAppBarState
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols
import io.github.madmaximuus.persianSymbols.globe.Globe
import io.github.madmaximuus.persianSymbols.xmark.XMark
import ru.rabbit.persian.appShowcase.componets.SampleRow
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object Chips : Screen {
    override val name: String = "Chips"

    override val navigation: String = "chips"

    @Composable
    override fun Content(navController: NavController?) {
        val topAppBarScrollBehavior =
            TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())
        SampleScaffold(
            title = name,
            onBackClick = { navController?.navigateUp() }
        ) {
            var selected by remember { mutableStateOf(false) }
            val labelState = rememberTextFieldState("Chip")
            val (leading, onLeadingChange) = remember { mutableStateOf(true) }
            val (trailing, onTrailingChange) = remember { mutableStateOf(true) }
            val (enabled, onEnabledChane) = remember { mutableStateOf(true) }

            val styleStates = remember {
                listOf(
                    mutableStateOf(true),
                    mutableStateOf(false),
                    mutableStateOf(false),
                    mutableStateOf(false)
                )
            }

            val leadingStates = remember {
                listOf(
                    mutableStateOf(true),
                    mutableStateOf(false),
                    mutableStateOf(false),
                )
            }

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .nestedScroll(topAppBarScrollBehavior.nestedScrollConnection)
                    .verticalScroll(rememberScrollState())
                    .padding(it)
                    .navigationBarsPadding(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size2)
            ) {
                SampleRow(
                    text = "Sample",
                    firstItem = true
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size8)
                    ) {
                        when {
                            styleStates[0].value -> {
                                FilterChip(
                                    label = labelState.text.toString(),
                                    selected = selected,
                                    enabled = enabled,
                                    leading = if (leading) {
                                        {
                                            Icon(
                                                icon = rememberVectorPainter(
                                                    PersianSymbols.Filled.Globe
                                                )
                                            )
                                        }
                                    } else null,
                                    trailing = if (trailing) {
                                        {
                                            Icon(
                                                icon = rememberVectorPainter(image = PersianSymbols.Default.XMark),
                                                onClick = {}
                                            )
                                        }
                                    } else null,
                                    onClick = { selected = !selected }
                                )
                            }

                            styleStates[1].value -> {
                                SuggestionChip(
                                    label = labelState.text.toString(),
                                    enabled = enabled,
                                    leading = if (leading) {
                                        {
                                            Icon(
                                                painter = rememberVectorPainter(
                                                    PersianSymbols.Filled.Globe
                                                )
                                            )
                                        }
                                    } else null,
                                    onClick = { }
                                )
                            }

                            styleStates[2].value -> {
                                AssistChip(
                                    label = labelState.text.toString(),
                                    enabled = enabled,
                                    leading = if (leading) {
                                        {
                                            when {
                                                leadingStates[0].value -> {
                                                    Icon(
                                                        painter = rememberVectorPainter(
                                                            PersianSymbols.Filled.Globe
                                                        )
                                                    )
                                                }

                                                leadingStates[2].value -> {
                                                    Image(imageUrl = Uri.parse("https://loremflickr.com/320/240"))
                                                }
                                            }
                                        }
                                    } else null,
                                    onClick = { }
                                )
                            }

                            styleStates[3].value -> {
                                InputShip(
                                    label = labelState.text.toString(),
                                    selected = selected,
                                    enabled = enabled,
                                    leading = if (leading) {
                                        {
                                            when {
                                                leadingStates[0].value -> {
                                                    Icon(
                                                        icon = rememberVectorPainter(
                                                            PersianSymbols.Filled.Globe
                                                        )
                                                    )
                                                }

                                                leadingStates[1].value -> {
                                                    Avatar(avatarUrl = Uri.parse("https://loremflickr.com/320/240"))
                                                }

                                                leadingStates[2].value -> {
                                                    Image(imageUrl = Uri.parse("https://loremflickr.com/320/240"))
                                                }
                                            }
                                        }
                                    } else null,
                                    trailing = if (trailing) {
                                        {
                                            Icon(
                                                onClick = {}
                                            )
                                        }
                                    } else null,
                                    onClick = { selected = !selected }
                                )
                            }
                        }
                    }
                }
                FormItem(
                    subhead = { Subhead(text = "Label") },
                    content = { Input(state = labelState) }
                )
                FormItem(
                    modifier = Modifier.padding(top = PersianTheme.spacing.size12),
                    subhead = { Subhead(text = "Style") },
                    content = {
                        RadioButtons {
                            RadioButton(
                                text = "Filter",
                                selected = styleStates[0].value,
                                onSelectedChange = {
                                    styleStates.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 0
                                    }
                                }
                            )
                            RadioButton(
                                text = "Suggestion",
                                selected = styleStates[1].value,
                                onSelectedChange = {
                                    styleStates.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 1
                                    }
                                }
                            )
                            RadioButton(
                                text = "Assist",
                                selected = styleStates[2].value,
                                onSelectedChange = {
                                    styleStates.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 2
                                    }
                                    if (leadingStates[1].value) {
                                        leadingStates.forEachIndexed { index, mutableState ->
                                            mutableState.value = index == 0
                                        }
                                    }
                                }
                            )
                            RadioButton(
                                text = "Input",
                                selected = styleStates[3].value,
                                onSelectedChange = {
                                    styleStates.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 3
                                    }
                                }
                            )
                        }
                    }
                )
                FormItem(
                    modifier = Modifier.padding(top = PersianTheme.spacing.size12),
                    subhead = {
                        Subhead(text = "Settings")
                    },
                    content = {
                        Checkboxes {
                            Checkbox(
                                modifier = Modifier.fillMaxWidth(),
                                text = "Leading",
                                checked = leading,
                                onCheckedChange = onLeadingChange
                            )
                            if (styleStates[0].value || styleStates[3].value) {
                                Checkbox(
                                    modifier = Modifier.fillMaxWidth(),
                                    text = "Trailing",
                                    checked = trailing,
                                    onCheckedChange = onTrailingChange
                                )
                            }
                            Checkbox(
                                modifier = Modifier.fillMaxWidth(),
                                text = "Enabled",
                                checked = enabled,
                                onCheckedChange = onEnabledChane
                            )
                        }
                    }
                )
                if (leading && !styleStates[0].value && !styleStates[1].value) {
                    FormItem(
                        modifier = Modifier.padding(top = PersianTheme.spacing.size12),
                        subhead = {
                            Subhead(text = "Leading")
                        },
                        content = {
                            RadioButtons {
                                RadioButton(
                                    text = "Icon",
                                    selected = leadingStates[0].value,
                                    onSelectedChange = {
                                        leadingStates.forEachIndexed { index, mutableState ->
                                            mutableState.value = index == 0
                                        }
                                    }
                                )
                                if (styleStates[3].value) {
                                    RadioButton(
                                        text = "Avatar",
                                        selected = leadingStates[1].value,
                                        onSelectedChange = {
                                            leadingStates.forEachIndexed { index, mutableState ->
                                                mutableState.value = index == 1
                                            }
                                        }
                                    )
                                }
                                if (styleStates[3].value || styleStates[2].value) {
                                    RadioButton(
                                        text = "Image",
                                        selected = leadingStates[2].value,
                                        onSelectedChange = {
                                            leadingStates.forEachIndexed { index, mutableState ->
                                                mutableState.value = index == 2
                                            }
                                        }
                                    )
                                }
                            }
                        }
                    )
                }
            }
        }
    }
}