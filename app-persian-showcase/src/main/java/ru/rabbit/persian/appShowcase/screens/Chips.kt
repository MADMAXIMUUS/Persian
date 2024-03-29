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
import androidx.navigation.NavController
import io.github.madmaximuus.persian.checkboxes.PersianCheckbox
import io.github.madmaximuus.persian.chips.assist.PersianAssistChip
import io.github.madmaximuus.persian.chips.filter.PersianFilterChip
import io.github.madmaximuus.persian.chips.input.PersianInputShip
import io.github.madmaximuus.persian.chips.suggestion.PersianSuggestionChip
import io.github.madmaximuus.persian.foundation.icons
import io.github.madmaximuus.persian.foundation.spacing
import io.github.madmaximuus.persian.inputs.PersianInput
import ru.rabbit.persian.appShowcase.componets.SampleRow
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object Chips : Screen {
    override val name: String = "Chips"

    override val navigation: String = "chips"

    @OptIn(ExperimentalMaterial3Api::class)
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
                    .padding(it),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.extraExtraSmall)
            ) {
                SampleRow(
                    text = "Sample chip",
                    firstItem = true
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.small)
                    ) {
                        PersianFilterChip(
                            label = filterChipLabel,
                            selected = selected,
                            enabled = enabled,
                            leadingIcon = if (showLeadingIcon) MaterialTheme.icons.person else null,
                            trailingIcon = if (showTrailingIcon) MaterialTheme.icons.expendMore else null,
                            onClick = { selected = !selected }
                        )
                        PersianSuggestionChip(
                            label = suggestionChipLabel,
                            enabled = enabled,
                            icon = if (showLeadingIcon) MaterialTheme.icons.person else null,
                            onClick = { }
                        )
                        PersianAssistChip(
                            label = assistChipLabel,
                            enabled = enabled,
                            leadingIcon = if (showLeadingIcon) MaterialTheme.icons.person else null,
                            onClick = { }
                        )
                        PersianInputShip(
                            label = inputChipLabel,
                            selected = selected,
                            enabled = enabled,
                            avatar = if (showLeadingIcon) "https://loremflickr.com/320/240" else null,
                            trailingIcon = if (showTrailingIcon) MaterialTheme.icons.close else null,
                            onClick = { selected = !selected }
                        )
                    }
                }
                SampleRow(text = "Filter Chip Label") {
                    PersianInput(
                        value = filterChipLabel,
                        onValueChange = onFilterLabelChange
                    )
                }
                SampleRow(text = "Suggestion Chip Label") {
                    PersianInput(
                        value = suggestionChipLabel,
                        onValueChange = onSuggestionLabelChange
                    )
                }
                SampleRow(text = "Assist Chip Label") {
                    PersianInput(
                        value = assistChipLabel,
                        onValueChange = onAssistLabelChange
                    )
                }
                SampleRow(text = "Input Chip Label") {
                    PersianInput(
                        value = inputChipLabel,
                        onValueChange = onInputLabelChange
                    )
                }
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            top = MaterialTheme.spacing.small,
                            bottom = MaterialTheme.spacing.small,
                            start = MaterialTheme.spacing.medium,
                            end = MaterialTheme.spacing.medium
                        ),
                ) {
                    Text(
                        text = "Additional settings",
                        style = MaterialTheme.typography.titleMedium,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                    Spacer(modifier = Modifier.height(MaterialTheme.spacing.extraSmall))
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        PersianCheckbox(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Show Leading icon",
                            checked = showLeadingIcon,
                            onCheckedChange = onLeadingChange
                        )
                        PersianCheckbox(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Show Trailing icon",
                            checked = showTrailingIcon,
                            onCheckedChange = onTrailingChange
                        )
                        PersianCheckbox(
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