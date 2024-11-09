package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.navigation.NavController
import io.github.madmaximuus.persian.forms.Checkbox
import io.github.madmaximuus.persian.forms.Checkboxes
import io.github.madmaximuus.persian.forms.FormItem
import io.github.madmaximuus.persian.forms.Input
import io.github.madmaximuus.persian.forms.RadioButton
import io.github.madmaximuus.persian.forms.RadioButtons
import io.github.madmaximuus.persian.forms.Subhead
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.textAreas.OutlineTextArea
import io.github.madmaximuus.persian.textAreas.PlainTextArea
import io.github.madmaximuus.persian.topAppBar.TopAppBarDefaults
import io.github.madmaximuus.persian.topAppBar.rememberTopAppBarState
import ru.rabbit.persian.appShowcase.componets.SampleRow
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object TextArea : Screen {

    override val name: String = "Text area"

    override val navigation: String = "textArea"

    @Composable
    override fun Content(navController: NavController?) {
        val topAppBarScrollBehavior =
            TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())
        SampleScaffold(
            title = name,
            onBackClick = { navController?.navigateUp() },
            topAppBarScrollBehavior = topAppBarScrollBehavior
        ) {
            val input = rememberTextFieldState()
            val placeholderState = rememberTextFieldState("Placeholder")
            val (enabled, onEnabledChange) = remember { mutableStateOf(true) }
            val (isError, onIsErrorChange) = remember { mutableStateOf(false) }
            val (isValid, onIsValidChange) = remember { mutableStateOf(false) }
            val (placeholder, onPlaceholderChange) = remember { mutableStateOf(false) }

            val styleStates = remember {
                listOf(
                    mutableStateOf(true),
                    mutableStateOf(false)
                )
            }
            SampleScaffold(
                title = Input.name,
                onBackClick = { navController?.navigateUp() },
                topAppBarScrollBehavior = topAppBarScrollBehavior
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .nestedScroll(topAppBarScrollBehavior.nestedScrollConnection)
                        .padding(it),
                ) {
                    SampleRow(text = "Sample", firstItem = true) {
                        when {
                            styleStates[0].value -> {
                                OutlineTextArea(
                                    state = input,
                                    enabled = enabled,
                                    isError = isError,
                                    isValid = isValid,
                                    placeholder = if (placeholder) placeholderState.text.toString() else null,
                                )
                            }

                            styleStates[1].value -> {
                                PlainTextArea(
                                    state = input,
                                    enabled = enabled,
                                    isError = isError,
                                    isValid = isValid,
                                    placeholder = if (placeholder) placeholderState.text.toString() else null,
                                )
                            }
                        }
                    }
                    if (placeholder) {
                        FormItem(
                            modifier = Modifier.padding(top = PersianTheme.spacing.size12),
                            subhead = { Subhead(text = "Placeholder") },
                            content = { Input(state = placeholderState) }
                        )
                    }
                    FormItem(
                        modifier = Modifier.padding(top = PersianTheme.spacing.size12),
                        subhead = { Subhead(text = "Style") },
                        content = {
                            RadioButtons {
                                RadioButton(
                                    text = "Outline",
                                    selected = styleStates[0].value,
                                    onSelectedChange = {
                                        styleStates.forEachIndexed { index, mutableState ->
                                            mutableState.value = index == 0
                                        }
                                    }
                                )
                                RadioButton(
                                    text = "Plain",
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
                        modifier = Modifier.padding(top = PersianTheme.spacing.size12),
                        subhead = { Subhead(text = "Settings") },
                        content = {
                            Checkboxes {
                                Checkbox(
                                    text = "Enabled",
                                    checked = enabled,
                                    onCheckedChange = onEnabledChange
                                )
                                Checkbox(
                                    text = "Placeholder",
                                    checked = placeholder,
                                    onCheckedChange = onPlaceholderChange
                                )
                                Checkbox(
                                    text = "Error",
                                    checked = isError,
                                    onCheckedChange = onIsErrorChange
                                )
                                Checkbox(
                                    text = "Valid",
                                    checked = isValid,
                                    onCheckedChange = onIsValidChange
                                )
                            }
                        }
                    )
                }
            }
        }
    }
}