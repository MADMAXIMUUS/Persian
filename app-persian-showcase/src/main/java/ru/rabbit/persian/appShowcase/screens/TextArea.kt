package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.navigation.NavController
import io.github.madmaximuus.persian.formItem.Checkbox
import io.github.madmaximuus.persian.formItem.Checkboxes
import io.github.madmaximuus.persian.formItem.FormItem
import io.github.madmaximuus.persian.formItem.Input
import io.github.madmaximuus.persian.formItem.RadioButton
import io.github.madmaximuus.persian.formItem.RadioButtons
import io.github.madmaximuus.persian.formItem.Subhead
import io.github.madmaximuus.persian.textAreas.TextArea
import io.github.madmaximuus.persian.textAreas.TextAreaDefaults
import io.github.madmaximuus.persian.topAppBar.TopAppBarDefaults
import io.github.madmaximuus.persian.topAppBar.rememberTopAppBarState
import ru.rabbit.persian.appShowcase.R
import ru.rabbit.persian.appShowcase.componets.SampleRow
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object TextArea : Screen {

    override val name: String = "Text area"

    override val image: Int = R.drawable.text_area

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

            val style = TextAreaDefaults.outlineColors()
            var styleState by remember { mutableStateOf(style) }

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
                        TextArea(
                            state = input,
                            enabled = enabled,
                            isError = isError,
                            colors = styleState,
                            isValid = isValid,
                            placeholder = if (placeholder) placeholderState.text.toString() else null,
                        )
                    }
                    if (placeholder) {
                        FormItem(
                            subhead = { Subhead(text = "Placeholder") },
                            content = { Input(state = placeholderState) }
                        )
                    }
                    val outlineStyle = TextAreaDefaults.outlineColors()
                    val plainStyle = TextAreaDefaults.plainColors()
                    FormItem(
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
                                        styleState = outlineStyle
                                    }
                                )
                                RadioButton(
                                    text = "Plain",
                                    selected = styleStates[1].value,
                                    onSelectedChange = {
                                        styleStates.forEachIndexed { index, mutableState ->
                                            mutableState.value = index == 1
                                        }
                                        styleState = plainStyle
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