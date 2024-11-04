package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.imeNestedScroll
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.navigation.NavController
import io.github.madmaximuus.persian.forms.Caption
import io.github.madmaximuus.persian.forms.Checkbox
import io.github.madmaximuus.persian.forms.Checkboxes
import io.github.madmaximuus.persian.forms.Form
import io.github.madmaximuus.persian.forms.Input
import io.github.madmaximuus.persian.forms.RadioButton
import io.github.madmaximuus.persian.forms.RadioButtons
import io.github.madmaximuus.persian.forms.Select
import io.github.madmaximuus.persian.forms.Subhead
import io.github.madmaximuus.persian.forms.TextArea
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.input.InputsTransformations
import io.github.madmaximuus.persian.menu.DropdownMenuItem
import io.github.madmaximuus.persian.topAppBar.TopAppBarDefaults
import io.github.madmaximuus.persian.topAppBar.rememberTopAppBarState
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols
import io.github.madmaximuus.persianSymbols.user.base.User
import io.github.madmaximuus.persianSymbols.xmark.base.XMark
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object Forms : Screen {

    override val name: String = "Forms"

    override val navigation: String = "form"

    @OptIn(ExperimentalLayoutApi::class)
    @Composable
    override fun Content(navController: NavController?) {
        val topAppBarScrollBehavior =
            TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())
        val (value, onValueChange) = remember { mutableStateOf("") }

        var selectedOption by remember { mutableStateOf("") }

        val (placeholderValue, onPlaceholderValueChange) = remember { mutableStateOf("Placeholder") }
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
                    .nestedScroll(topAppBarScrollBehavior.nestedScrollConnection)
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
                    .padding(it)
                    .navigationBarsPadding()
                    .imeNestedScroll(),
            ) {
                Form(
                    enabled = enabled,
                    isError = isError,
                    isValid = isValid,
                    content = {
                        when {
                            contentState[0].value -> {
                                Input(
                                    value = value,
                                    onValueChange = onValueChange,
                                    placeholder = if (placeholder) placeholderValue else null,
                                    leadingIcon = if (leading) rememberVectorPainter(image = PersianSymbols.Default.User) else null,
                                    transformation = if (password) InputsTransformations.password else InputsTransformations.none,
                                    trailingIcon = if (trailing) rememberVectorPainter(image = PersianSymbols.Default.XMark) else null,
                                    onTrailingIconClick = {}
                                )
                            }

                            contentState[1].value -> {
                                TextArea(
                                    value = value,
                                    onValueChange = onValueChange,
                                    placeholder = if (placeholder) placeholderValue else null,
                                )
                            }

                            contentState[2].value -> {
                                Select(
                                    selected = selectedOption,
                                    expanded = expanded,
                                    onExpandedChange = onExpandChange,
                                    placeholder = if (placeholder) placeholderValue else null,
                                    leadingIcon = if (leading) rememberVectorPainter(image = PersianSymbols.Default.User) else null,
                                ) {
                                    DropdownMenuItem(
                                        text = "Option 1",
                                        onClick = {
                                            selectedOption = "Option 1"
                                            onExpandChange(false)
                                        }
                                    )
                                    DropdownMenuItem(
                                        text = "Option 2",
                                        onClick = {
                                            selectedOption = "Option 2"
                                            onExpandChange(false)
                                        }
                                    )
                                    DropdownMenuItem(
                                        text = "Option 3",
                                        onClick = {
                                            selectedOption = "Option 3"
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
                                    errorText = "Error Message",
                                    counter = 10,
                                    counterMax = 20
                                )
                            } else {
                                Caption(
                                    text = "Caption",
                                    errorText = "Error Message",
                                )
                            }
                        }
                    } else null
                )
                Spacer(modifier = Modifier.height(PersianTheme.spacing.size20))
                Form(
                    modifier = Modifier.fillMaxWidth(),
                    subhead = {
                        Subhead(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Content"
                        )
                    },
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
                    Form(
                        subhead = {
                            Subhead(text = "Placeholder")
                        },
                        content = {
                            Input(
                                value = placeholderValue,
                                onValueChange = onPlaceholderValueChange
                            )
                        }
                    )
                }
                Form(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = PersianTheme.spacing.size12),
                    subhead = {
                        Subhead(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Settings"
                        )
                    },
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
                Form(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = PersianTheme.spacing.size12),
                    subhead = {
                        Subhead(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Subhead"
                        )
                    },
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
                Form(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = PersianTheme.spacing.size12),
                    subhead = {
                        Subhead(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Caption"
                        )
                    },
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