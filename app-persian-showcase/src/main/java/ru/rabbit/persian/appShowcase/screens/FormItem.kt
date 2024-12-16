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
import androidx.compose.foundation.text.input.clearText
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.foundation.text.input.setTextAndPlaceCursorAtEnd
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.navigation.NavController
import io.github.madmaximuus.persian.formItem.Caption
import io.github.madmaximuus.persian.formItem.Checkbox
import io.github.madmaximuus.persian.formItem.Checkboxes
import io.github.madmaximuus.persian.formItem.FormItem
import io.github.madmaximuus.persian.formItem.Input
import io.github.madmaximuus.persian.formItem.RadioButton
import io.github.madmaximuus.persian.formItem.RadioButtons
import io.github.madmaximuus.persian.formItem.Select
import io.github.madmaximuus.persian.formItem.Subhead
import io.github.madmaximuus.persian.formItem.TextArea
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.internal.SecureInputSettings
import io.github.madmaximuus.persian.menu.DropdownMenuItem
import io.github.madmaximuus.persian.text.Text
import io.github.madmaximuus.persian.topAppBar.TopAppBarDefaults
import io.github.madmaximuus.persian.topAppBar.rememberTopAppBarState
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols
import io.github.madmaximuus.persianSymbols.user.User
import io.github.madmaximuus.persianSymbols.xmark.XMark
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object FormItem : Screen {

    override val name: String = "Form item"

    override val navigation: String = "form"

    @OptIn(ExperimentalLayoutApi::class)
    @Composable
    override fun Content(navController: NavController?) {
        val topAppBarScrollBehavior =
            TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())
        val inputState = rememberTextFieldState()

        val selectedOption = rememberTextFieldState()

        val placeholderState = rememberTextFieldState("Placeholder")
        val (enabled, onEnabledChange) = remember { mutableStateOf(true) }
        val (expanded, onExpandChange) = remember { mutableStateOf(false) }
        val (isError, onIsErrorChange) = remember { mutableStateOf(false) }
        val (isValid, onIsValidChange) = remember { mutableStateOf(false) }
        val (placeholder, onPlaceholderChange) = remember { mutableStateOf(false) }
        val (password, onPasswordChange) = remember { mutableStateOf(false) }
        val (leading, onLeadingChange) = remember { mutableStateOf(false) }
        val (trailing, onTrailingChange) = remember { mutableStateOf(false) }

        val (subhead, onSubheadChange) = remember { mutableStateOf(false) }
        val (subheadRequired, onSubheadRequiredChange) = remember { mutableStateOf(false) }

        val (caption, onCaptionChange) = remember { mutableStateOf(false) }
        val (captionCounter, onCaptionCounterChange) = remember { mutableStateOf(false) }
        val contentState = remember {
            listOf(
                mutableStateOf(true),
                mutableStateOf(false),
                mutableStateOf(false),
                mutableStateOf(false),
                mutableStateOf(false),
            )
        }

        val radioButtonsStates = remember {
            listOf(
                mutableStateOf(true),
                mutableStateOf(false),
                mutableStateOf(false),
                mutableStateOf(false),
                mutableStateOf(false),
            )
        }

        val checkboxesStates = remember {
            listOf(
                mutableStateOf(false),
                mutableStateOf(false),
                mutableStateOf(false),
                mutableStateOf(false),
                mutableStateOf(false),
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
                        .padding(horizontal = PersianTheme.spacing.size16)
                        .padding(top = PersianTheme.spacing.size8),
                    text = "Sample",
                    style = PersianTheme.typography.labelMedium,
                    color = PersianTheme.colorScheme.onSurfaceVariant
                )
                FormItem(
                    modifier = Modifier.padding(top = PersianTheme.spacing.size2),
                    enabled = enabled,
                    isError = isError,
                    isValid = isValid,
                    content = {
                        when {
                            contentState[0].value -> {
                                Input(
                                    state = inputState,
                                    placeholder = if (placeholder) placeholderState.text.toString() else null,
                                    leadingIcon = if (leading) rememberVectorPainter(image = PersianSymbols.Default.User) else null,
                                    secure = if (password) SecureInputSettings.Secure() else SecureInputSettings.NotSecure,
                                    trailingIcon = if (trailing) rememberVectorPainter(image = PersianSymbols.Default.XMark) else null,
                                    onTrailingIconClick = { inputState.clearText() }
                                )
                            }

                            contentState[1].value -> {
                                TextArea(
                                    inputState,
                                    placeholder = if (placeholder) placeholderState.text.toString() else null,
                                )
                            }

                            contentState[2].value -> {
                                Select(
                                    state = selectedOption,
                                    expanded = expanded,
                                    onExpandedChange = onExpandChange,
                                    placeholder = if (placeholder) placeholderState.text.toString() else null,
                                    leadingIcon = if (leading) rememberVectorPainter(image = PersianSymbols.Default.User) else null,
                                ) {
                                    DropdownMenuItem(
                                        text = "Option 1",
                                        onClick = {
                                            selectedOption.setTextAndPlaceCursorAtEnd("Option 1")
                                            onExpandChange(false)
                                        }
                                    )
                                    DropdownMenuItem(
                                        text = "Option 2",
                                        onClick = {
                                            selectedOption.setTextAndPlaceCursorAtEnd("Option 2")
                                            onExpandChange(false)
                                        }
                                    )
                                    DropdownMenuItem(
                                        text = "Option 3",
                                        onClick = {
                                            selectedOption.setTextAndPlaceCursorAtEnd("Option 3")
                                            onExpandChange(false)
                                        }
                                    )
                                }
                            }

                            contentState[3].value -> {
                                RadioButtons {
                                    RadioButton(
                                        text = "Radio button 1",
                                        selected = radioButtonsStates[0].value,
                                        onSelectedChange = {
                                            radioButtonsStates.forEachIndexed { index, mutableState ->
                                                mutableState.value = index == 0
                                            }
                                        }
                                    )
                                    RadioButton(
                                        text = "Radio button 2",
                                        selected = radioButtonsStates[1].value,
                                        onSelectedChange = {
                                            radioButtonsStates.forEachIndexed { index, mutableState ->
                                                mutableState.value = index == 1
                                            }
                                        }
                                    )
                                    RadioButton(
                                        text = "Radio button 3",
                                        selected = radioButtonsStates[2].value,
                                        onSelectedChange = {
                                            radioButtonsStates.forEachIndexed { index, mutableState ->
                                                mutableState.value = index == 2
                                            }
                                        }
                                    )
                                    RadioButton(
                                        text = "Radio button 4",
                                        selected = radioButtonsStates[3].value,
                                        onSelectedChange = {
                                            radioButtonsStates.forEachIndexed { index, mutableState ->
                                                mutableState.value = index == 3
                                            }
                                        }
                                    )
                                    RadioButton(
                                        text = "Radio button 5",
                                        selected = radioButtonsStates[4].value,
                                        onSelectedChange = {
                                            radioButtonsStates.forEachIndexed { index, mutableState ->
                                                mutableState.value = index == 4
                                            }
                                        }
                                    )
                                }
                            }

                            contentState[4].value -> {
                                Checkboxes {
                                    Checkbox(
                                        text = "Checkbox 1",
                                        checked = checkboxesStates[0].value,
                                        onCheckedChange = { isChecked ->
                                            checkboxesStates[0].value = isChecked
                                        }
                                    )
                                    Checkbox(
                                        text = "Checkbox 2",
                                        checked = checkboxesStates[1].value,
                                        onCheckedChange = { isChecked ->
                                            checkboxesStates[1].value = isChecked
                                        }
                                    )
                                    Checkbox(
                                        text = "Checkbox 3",
                                        checked = checkboxesStates[2].value,
                                        onCheckedChange = { isChecked ->
                                            checkboxesStates[2].value = isChecked
                                        }
                                    )
                                    Checkbox(
                                        text = "Checkbox 4",
                                        checked = checkboxesStates[3].value,
                                        onCheckedChange = { isChecked ->
                                            checkboxesStates[3].value = isChecked
                                        }
                                    )
                                    Checkbox(
                                        text = "Checkbox 5",
                                        checked = checkboxesStates[4].value,
                                        onCheckedChange = { isChecked ->
                                            checkboxesStates[4].value = isChecked
                                        }
                                    )
                                }
                            }
                        }
                    },
                    subhead = if (subhead) {
                        {
                            Subhead(
                                text = "Subhead",
                                required = subheadRequired
                            )
                        }
                    } else null,
                    caption = if (caption) {
                        {
                            if (captionCounter) {
                                Caption(
                                    text = "Caption",
                                    errorText = "Error message",
                                    counter = 10,
                                    counterMax = 20
                                )
                            } else {
                                Caption(
                                    text = "Caption",
                                    errorText = "Error message",
                                )
                            }
                        }
                    } else null
                )
                FormItem(
                    subhead = { Subhead(text = "Content") },
                    content = {
                        RadioButtons {
                            RadioButton(
                                text = "Input",
                                selected = contentState[0].value,
                                onSelectedChange = {
                                    contentState.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 0
                                    }
                                }
                            )
                            RadioButton(
                                text = "Text area",
                                selected = contentState[1].value,
                                onSelectedChange = {
                                    contentState.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 1
                                    }
                                }
                            )
                            RadioButton(
                                text = "Select",
                                selected = contentState[2].value,
                                onSelectedChange = {
                                    contentState.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 2
                                    }
                                }
                            )
                            RadioButton(
                                text = "Radio buttons",
                                selected = contentState[3].value,
                                onSelectedChange = {
                                    contentState.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 3
                                    }
                                }
                            )
                            RadioButton(
                                text = "Checkboxes",
                                selected = contentState[4].value,
                                onSelectedChange = {
                                    contentState.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 4
                                    }
                                }
                            )
                        }
                    }
                )
                if (placeholder) {
                    FormItem(
                        subhead = { Subhead(text = "Placeholder") },
                        content = { Input(state = placeholderState) }
                    )
                }
                FormItem(
                    subhead = { Subhead(text = "Settings") },
                    content = {
                        Checkboxes {
                            Checkbox(
                                text = "Enabled",
                                checked = enabled,
                                onCheckedChange = onEnabledChange
                            )
                            if (contentState[0].value || contentState[1].value || contentState[2].value) {
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
                                Checkbox(
                                    text = "Placeholder",
                                    checked = placeholder,
                                    onCheckedChange = onPlaceholderChange
                                )
                                if (contentState[0].value) {
                                    Checkbox(
                                        text = "Password",
                                        checked = password,
                                        onCheckedChange = onPasswordChange
                                    )
                                }
                                if (!contentState[1].value) {
                                    Checkbox(
                                        text = "Leading icon",
                                        checked = leading,
                                        onCheckedChange = onLeadingChange
                                    )
                                    if (!contentState[2].value) {
                                        Checkbox(
                                            text = "Trailing icon",
                                            checked = trailing,
                                            onCheckedChange = onTrailingChange
                                        )
                                    }
                                }
                            }
                        }
                    }
                )
                FormItem(
                    subhead = { Subhead(text = "Subhead") },
                    content = {
                        Checkboxes {
                            Checkbox(
                                text = "Subhead",
                                checked = subhead,
                                onCheckedChange = onSubheadChange
                            )
                            Checkbox(
                                text = "Required",
                                checked = subheadRequired,
                                onCheckedChange = onSubheadRequiredChange
                            )
                        }
                    }
                )
                FormItem(
                    subhead = { Subhead(text = "Caption") },
                    content = {
                        Checkboxes {
                            Checkbox(
                                text = "Caption",
                                checked = caption,
                                onCheckedChange = onCaptionChange
                            )
                            Checkbox(
                                text = "Counter",
                                checked = captionCounter,
                                onCheckedChange = onCaptionCounterChange
                            )
                        }
                    }
                )
            }
        }
    }
}