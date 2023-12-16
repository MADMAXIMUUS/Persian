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
import androidx.compose.foundation.selection.selectableGroup
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import io.github.madmaximuus.persian.checkboxes.PersianCheckbox
import io.github.madmaximuus.persian.forms.PersianForm
import io.github.madmaximuus.persian.forms.PersianFormCaptionConfig
import io.github.madmaximuus.persian.forms.PersianFormContent
import io.github.madmaximuus.persian.forms.PersianFormSubheadConfig
import io.github.madmaximuus.persian.foundation.icons
import io.github.madmaximuus.persian.inputs.InputsTransformations
import io.github.madmaximuus.persian.inputs.PersianInput
import io.github.madmaximuus.persian.radioButtons.PersianRadioButton
import io.github.madmaximuus.persian.select.ActionItem
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object Forms : Screen {

    override val name: String = "Forms"

    override val navigation: String = "form"

    @OptIn(ExperimentalMaterial3Api::class, ExperimentalLayoutApi::class)
    @Composable
    override fun Content(navController: NavController?) {
        val topAppBarScrollBehavior =
            TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())
        val (value, onValueChange) = remember { mutableStateOf("") }
        var values by remember {
            mutableStateOf(
                listOf(
                    "",
                    "",
                    "",
                    "",
                    "",
                    ""
                )
            )
        }
        val onValuesChange: (String, Int) -> Unit = { code, index ->
            if (values[index].length != 1 || code.isEmpty()) {
                val tempList = values.toMutableList()
                tempList[index] = code
                values = tempList.toList()
            }
        }
        val selectValues = listOf<ActionItem>(
            ActionItem(
                title = "Option 1"
            ),
            ActionItem(
                title = "Option 2"
            ),
            ActionItem(
                title = "Option 3"
            ),
            ActionItem(
                title = "Option 4"
            )
        )
        var selected by remember {
            mutableStateOf("")
        }

        val (placeholderValue, onPlaceholderValueChange) = remember { mutableStateOf("") }
        val (enabled, onEnabledChange) = remember { mutableStateOf(true) }
        val (isError, onIsErrorChange) = remember { mutableStateOf(false) }
        val (isSuccess, onIsSuccessChange) = remember { mutableStateOf(false) }
        val (placeholder, onPlaceholderChange) = remember { mutableStateOf(false) }
        val (password, onPasswordChange) = remember { mutableStateOf(false) }
        val (leading, onLeadingChange) = remember { mutableStateOf(false) }
        val (trailing, onTrailingChange) = remember { mutableStateOf(false) }

        val (subhead, onSubheadChange) = remember { mutableStateOf(false) }
        val (subheadRequired, onSubheadRequiredChange) = remember { mutableStateOf(false) }

        val (caption, onCaptionChange) = remember { mutableStateOf(false) }
        val (captionCounter, onCaptionCounterChange) = remember { mutableStateOf(false) }
        var content by remember {
            mutableStateOf<PersianFormContent>(
                PersianFormContent.Input(
                    value = value,
                    onValueChange = onValueChange
                )
            )
        }
        val contentState = remember {
            listOf(
                mutableStateOf(true),
                mutableStateOf(false),
                mutableStateOf(false),
                mutableStateOf(false),
            )
        }
        content = if (contentState[0].value) {
            PersianFormContent.Input(
                value = value,
                onValueChange = onValueChange,
                placeholder = placeholderValue,
                leadingIcon = if (leading) MaterialTheme.icons.person else null,
                transformation = if (password) InputsTransformations.password else InputsTransformations.none,
                trailingIcon = if (trailing) MaterialTheme.icons.close else null,
                onTrailingIconClick = {}
            )
        } else if (contentState[1].value) {
            PersianFormContent.TextArea(
                value = value,
                onValueChange = onValueChange,
                placeholder = placeholderValue,
                leadingIcon = if (leading) MaterialTheme.icons.person else null
            )
        } else if (contentState[2].value) {
            PersianFormContent.SixDigitCodeInput(
                values = values,
                onValueChange = onValuesChange
            )
        } else {
            PersianFormContent.Select(
                selected = selected,
                values = selectValues,
                onSelectedChange = {
                    selected = it
                }
            )
        }
        SampleScaffold(
            title = name,
            onBackClick = { navController?.navigateUp() },
            topAppBarScrollBehavior = topAppBarScrollBehavior
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
                    .nestedScroll(topAppBarScrollBehavior.nestedScrollConnection)
                    .padding(it)
                    .navigationBarsPadding()
                    .imeNestedScroll(),
            ) {
                PersianForm(
                    modifier = Modifier.padding(horizontal = 20.dp),
                    enabled = enabled,
                    isError = isError,
                    isSuccess = isSuccess,
                    content = content,
                    subhead = if (subhead) PersianFormSubheadConfig(
                        text = "Subhead",
                        required = subheadRequired
                    ) else null,
                    caption = if (caption) PersianFormCaptionConfig(
                        text = "Caption",
                        errorText = "Error Message",
                        counter = if (captionCounter) 10 else null,
                        counterMax = if (captionCounter) 20 else null
                    ) else null
                )
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    modifier = Modifier.padding(horizontal = 20.dp),
                    text = "Content"
                )
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .selectableGroup()
                        .padding(horizontal = 20.dp)
                ) {
                    PersianRadioButton(
                        text = "Input",
                        checked = contentState[0].value,
                        onCheckedChange = {
                            contentState.forEachIndexed { index, mutableState ->
                                mutableState.value = index == 0
                            }
                        }
                    )
                    PersianRadioButton(
                        text = "Text Area",
                        checked = contentState[1].value,
                        onCheckedChange = {
                            contentState.forEachIndexed { index, mutableState ->
                                mutableState.value = index == 1
                            }
                        }
                    )
                    PersianRadioButton(
                        text = "Code Input",
                        checked = contentState[2].value,
                        onCheckedChange = {
                            contentState.forEachIndexed { index, mutableState ->
                                mutableState.value = index == 2
                            }
                        }
                    )
                    PersianRadioButton(
                        text = "Select",
                        checked = contentState[3].value,
                        onCheckedChange = {
                            contentState.forEachIndexed { index, mutableState ->
                                mutableState.value = index == 3
                            }
                        }
                    )
                }
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    modifier = Modifier.padding(horizontal = 20.dp),
                    text = "Settings"
                )
                PersianCheckbox(
                    modifier = Modifier.padding(horizontal = 20.dp),
                    text = "Enabled",
                    checked = enabled,
                    onCheckedChange = onEnabledChange
                )
                PersianCheckbox(
                    modifier = Modifier.padding(horizontal = 20.dp),
                    text = "Is Error State",
                    checked = isError,
                    onCheckedChange = onIsErrorChange
                )
                PersianCheckbox(
                    modifier = Modifier.padding(horizontal = 20.dp),
                    text = "Is Success State",
                    checked = isSuccess,
                    onCheckedChange = onIsSuccessChange
                )
                PersianCheckbox(
                    modifier = Modifier.padding(horizontal = 20.dp),
                    text = "Placeholder",
                    checked = placeholder,
                    onCheckedChange = onPlaceholderChange
                )
                if (placeholder) {
                    PersianInput(
                        modifier = Modifier.padding(horizontal = 20.dp),
                        value = placeholderValue,
                        onValueChange = onPlaceholderValueChange
                    )
                }
                PersianCheckbox(
                    modifier = Modifier.padding(horizontal = 20.dp),
                    text = "Password",
                    checked = password,
                    onCheckedChange = onPasswordChange
                )
                PersianCheckbox(
                    modifier = Modifier.padding(horizontal = 20.dp),
                    text = "Leading Icon",
                    checked = leading,
                    onCheckedChange = onLeadingChange
                )
                PersianCheckbox(
                    modifier = Modifier.padding(horizontal = 20.dp),
                    text = "Trailing Icon",
                    checked = trailing,
                    onCheckedChange = onTrailingChange
                )
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    modifier = Modifier.padding(horizontal = 20.dp),
                    text = "Subhead"
                )
                PersianCheckbox(
                    modifier = Modifier.padding(horizontal = 20.dp),
                    text = "Add subhead",
                    checked = subhead,
                    onCheckedChange = onSubheadChange
                )
                PersianCheckbox(
                    modifier = Modifier.padding(horizontal = 20.dp),
                    text = "Required",
                    checked = subheadRequired,
                    onCheckedChange = onSubheadRequiredChange
                )
                Text(
                    modifier = Modifier.padding(horizontal = 20.dp),
                    text = "Caption"
                )
                PersianCheckbox(
                    modifier = Modifier.padding(horizontal = 20.dp),
                    text = "Add caption",
                    checked = caption,
                    onCheckedChange = onCaptionChange
                )
                PersianCheckbox(
                    modifier = Modifier.padding(horizontal = 20.dp),
                    text = "Counter",
                    checked = captionCounter,
                    onCheckedChange = onCaptionCounterChange
                )
            }
        }
    }
}