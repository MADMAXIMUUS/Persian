package ru.rabbit.persian.appShowcase.screens

import android.net.Uri
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
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
import io.github.madmaximuus.persian.chips.assist.Image
import io.github.madmaximuus.persian.chips.filter.FilterChip
import io.github.madmaximuus.persian.chips.filter.Icon
import io.github.madmaximuus.persian.chips.input.Avatar
import io.github.madmaximuus.persian.chips.input.Icon
import io.github.madmaximuus.persian.chips.input.InputShip
import io.github.madmaximuus.persian.chips.suggestion.Icon
import io.github.madmaximuus.persian.chips.suggestion.SuggestionChip
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.input.OutlineInput
import io.github.madmaximuus.persian.text.Text
import io.github.madmaximuus.persian.topAppBar.TopAppBarDefaults
import io.github.madmaximuus.persian.topAppBar.rememberTopAppBarState
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols
import io.github.madmaximuus.persianSymbols.plus.base.Plus
import io.github.madmaximuus.persianSymbols.xmark.base.XMark
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
            val (filterChipLabel, onFilterLabelChange) = remember { mutableStateOf("Filter chip") }
            val (suggestionChipLabel, onSuggestionLabelChange) = remember { mutableStateOf("Suggestion chip") }
            val (assistChipLabel, onAssistLabelChange) = remember { mutableStateOf("Assist chip") }
            val (inputChipLabel, onInputLabelChange) = remember { mutableStateOf("Input chip") }
            val (showLeadingIcon, onLeadingChange) = remember { mutableStateOf(true) }
            val (showTrailingIcon, onTrailingChange) = remember { mutableStateOf(true) }
            val (enabled, onEnabledChane) = remember { mutableStateOf(true) }
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
                        FilterChip(
                            label = filterChipLabel,
                            selected = selected,
                            enabled = enabled,
                            leading = if (showLeadingIcon) {
                                {
                                    Icon(icon = rememberVectorPainter(image = PersianSymbols.Default.Plus))
                                }
                            } else null,
                            trailing = if (showTrailingIcon) {
                                {
                                    Icon(
                                        icon = rememberVectorPainter(image = PersianSymbols.Default.XMark),
                                        onClick = {}
                                    )
                                }
                            } else null,
                            onClick = { selected = !selected }
                        )
                        SuggestionChip(
                            label = suggestionChipLabel,
                            enabled = enabled,
                            leading = if (showLeadingIcon) {
                                {
                                    Icon(painter = rememberVectorPainter(image = PersianSymbols.Default.Plus))
                                }
                            } else null,
                            onClick = { }
                        )
                        AssistChip(
                            label = assistChipLabel,
                            enabled = enabled,
                            leading = if (showLeadingIcon) {
                                {
                                    Image(imageUrl = Uri.parse("https://loremflickr.com/320/240"))
                                }
                            } else null,
                            onClick = { }
                        )
                        InputShip(
                            label = inputChipLabel,
                            selected = selected,
                            enabled = enabled,
                            leading = if (showLeadingIcon) {
                                {
                                    Avatar(avatarUrl = Uri.parse("https://loremflickr.com/320/240"))
                                }
                            } else null,
                            trailing = if (showTrailingIcon) {
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
                SampleRow(text = "Filter chip label") {
                    OutlineInput(
                        value = filterChipLabel,
                        onValueChange = onFilterLabelChange
                    )
                }
                SampleRow(text = "Suggestion chip label") {
                    OutlineInput(
                        value = suggestionChipLabel,
                        onValueChange = onSuggestionLabelChange
                    )
                }
                SampleRow(text = "Assist chip label") {
                    OutlineInput(
                        value = assistChipLabel,
                        onValueChange = onAssistLabelChange
                    )
                }
                SampleRow(text = "Input chip label") {
                    OutlineInput(
                        value = inputChipLabel,
                        onValueChange = onInputLabelChange
                    )
                }
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            top = PersianTheme.spacing.size8,
                            bottom = PersianTheme.spacing.size8,
                            start = PersianTheme.spacing.size12,
                            end = PersianTheme.spacing.size12
                        ),
                ) {
                    Text(
                        text = "Additional settings",
                        style = PersianTheme.typography.titleMedium,
                        color = PersianTheme.colorScheme.onSurface
                    )
                    Spacer(modifier = Modifier.height(PersianTheme.spacing.size4))
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        Checkbox(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Show leading",
                            checked = showLeadingIcon,
                            onCheckedChange = onLeadingChange
                        )
                        Checkbox(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Show trailing",
                            checked = showTrailingIcon,
                            onCheckedChange = onTrailingChange
                        )
                        Checkbox(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Enabled",
                            checked = enabled,
                            onCheckedChange = onEnabledChane
                        )
                    }
                }
            }
        }
    }
}