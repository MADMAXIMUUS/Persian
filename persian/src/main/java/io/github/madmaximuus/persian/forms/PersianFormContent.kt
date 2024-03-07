package io.github.madmaximuus.persian.forms

import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.VisualTransformation
import io.github.madmaximuus.persian.codeInput.PersianFourDigitCodeInput
import io.github.madmaximuus.persian.codeInput.PersianSixDigitCodeInput
import io.github.madmaximuus.persian.inputs.InputColors
import io.github.madmaximuus.persian.inputs.InputsTransformations
import io.github.madmaximuus.persian.inputs.PersianInput
import io.github.madmaximuus.persian.inputs.PersianInputDefaults
import io.github.madmaximuus.persian.menus.MenuColors
import io.github.madmaximuus.persian.select.PersianSelect
import io.github.madmaximuus.persian.select.SelectActionItem
import io.github.madmaximuus.persian.textAreas.PersianTextArea
import io.github.madmaximuus.persian.textAreas.PersianTextAreaDefaults
import io.github.madmaximuus.persian.textAreas.TextAreaColors

sealed class PersianFormContent {
    data class Input(
        val value: String,
        val onValueChange: (String) -> Unit,
        val textStyle: TextStyle? = null,
        val colors: InputColors? = null,
        val placeholder: String? = null,
        val readOnly: Boolean = false,
        val leadingIcon: Painter? = null,
        val trailingIcon: Painter? = null,
        val transformation: VisualTransformation = InputsTransformations.none,
        val keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
        val keyboardActions: KeyboardActions = KeyboardActions.Default,
        val onTrailingIconClick: (() -> Unit)? = null
    ) : PersianFormContent()

    data class TextArea(
        val value: String,
        val onValueChange: (String) -> Unit,
        val textStyle: TextStyle? = null,
        val placeholder: String? = null,
        val colors: TextAreaColors? = null,
        val leadingIcon: Painter? = null,
        val keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
        val keyboardActions: KeyboardActions = KeyboardActions.Default,
    ) : PersianFormContent()

    data class FourDigitCodeInput(
        val values: List<String>,
        val onValueChange: (value: String, index: Int) -> Unit,
    ) : PersianFormContent()

    data class SixDigitCodeInput(
        val values: List<String>,
        val onValueChange: (value: String, index: Int) -> Unit,
    ) : PersianFormContent()

    data class Select(
        val selected: String,
        val values: List<SelectActionItem>,
        val placeholder: String? = null,
        val onSelectedChange: (option: String, index: Int) -> Unit,
        val expanded: MutableState<Boolean>? = null,
        val leadingIcon: Painter? = null,
        val inputColors: InputColors? = null,
        val menuColors: MenuColors? = null
    ) : PersianFormContent()

}

@Composable
internal fun PersianFormContentInput(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean,
    isError: Boolean,
    isSuccess: Boolean,
    textStyle: TextStyle?,
    readOnly: Boolean,
    placeholder: String?,
    transformation: VisualTransformation,
    colors: InputColors?,
    leadingIcon: Painter?,
    trailingIcon: Painter?,
    keyboardOptions: KeyboardOptions,
    keyboardActions: KeyboardActions,
    onTrailingIconClick: (() -> Unit)?
) {
    val resolvedTextStyle = textStyle ?: MaterialTheme.typography.bodyLarge
    val resolvedColors = colors ?: PersianInputDefaults.colors()
    PersianInput(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier,
        enabled = enabled,
        isError = isError,
        isSuccess = isSuccess,
        readOnly = readOnly,
        textStyle = resolvedTextStyle,
        placeholder = placeholder,
        transformation = transformation,
        colors = resolvedColors,
        leadingIcon = leadingIcon,
        trailingIcon = trailingIcon,
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        onTrailingIconClick = onTrailingIconClick
    )
}

@Composable
internal fun PersianFormContentTextArea(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean,
    isError: Boolean,
    isSuccess: Boolean,
    textStyle: TextStyle?,
    placeholder: String?,
    colors: TextAreaColors?,
    leadingIcon: Painter?,
    keyboardOptions: KeyboardOptions,
    keyboardActions: KeyboardActions
) {
    val resolvedTextStyle = textStyle ?: MaterialTheme.typography.bodyLarge
    val resolvedColors = colors ?: PersianTextAreaDefaults.colors()
    PersianTextArea(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier,
        enabled = enabled,
        isError = isError,
        isSuccess = isSuccess,
        textStyle = resolvedTextStyle,
        placeholder = placeholder,
        colors = resolvedColors,
        leadingIcon = leadingIcon,
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions
    )
}

@Composable
internal fun PersianFormContentSixDigitCodeInput(
    modifier: Modifier = Modifier,
    values: List<String>,
    enabled: Boolean = true,
    isError: Boolean = false,
    isSuccess: Boolean = false,
    onValueChange: (value: String, index: Int) -> Unit
) {
    PersianSixDigitCodeInput(
        values = values,
        onValueChange = onValueChange,
        modifier = modifier,
        enabled = enabled,
        isError = isError,
        isSuccess = isSuccess,
    )
}

@Composable
internal fun PersianFormContentFourDigitCodeInput(
    modifier: Modifier = Modifier,
    values: List<String>,
    enabled: Boolean = true,
    isError: Boolean = false,
    isSuccess: Boolean = false,
    onValueChange: (value: String, index: Int) -> Unit
) {
    PersianFourDigitCodeInput(
        values = values,
        onValueChange = onValueChange,
        modifier = modifier,
        enabled = enabled,
        isError = isError,
        isSuccess = isSuccess,
    )
}

@Composable
internal fun PersianFormContentSelect(
    selected: String,
    values: List<SelectActionItem>,
    onSelectedChange: (option: String, index: Int) -> Unit,
    modifier: Modifier = Modifier,
    expanded: MutableState<Boolean>,
    leadingIcon: Painter?,
    placeholder: String?,
    inputColors: InputColors,
    menuColors: MenuColors,
    isError: Boolean,
    isSuccess: Boolean,
    enabled: Boolean
) {
    PersianSelect(
        selected = selected,
        values = values,
        onSelectedChange = onSelectedChange,
        modifier = modifier,
        expanded = expanded,
        isSuccess = isSuccess,
        enabled = enabled,
        placeholder = placeholder,
        isError = isError,
        leadingIcon = leadingIcon,
        inputColors = inputColors,
        menuColors = menuColors
    )
}