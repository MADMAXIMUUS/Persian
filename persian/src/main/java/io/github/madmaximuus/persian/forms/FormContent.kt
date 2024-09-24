package io.github.madmaximuus.persian.forms

import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.VisualTransformation
import io.github.madmaximuus.persian.codeInput.FourDigitCodeInput
import io.github.madmaximuus.persian.codeInput.SixDigitCodeInput
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.input.InputColors
import io.github.madmaximuus.persian.input.InputSizes
import io.github.madmaximuus.persian.input.InputsDefaults
import io.github.madmaximuus.persian.input.OutlineInput
import io.github.madmaximuus.persian.menu.DropdownMenuItemScope
import io.github.madmaximuus.persian.menu.MenuColors
import io.github.madmaximuus.persian.menu.MenuDefaults
import io.github.madmaximuus.persian.select.Select
import io.github.madmaximuus.persian.textAreas.OutlineTextArea
import io.github.madmaximuus.persian.textAreas.TextAreaColors
import io.github.madmaximuus.persian.textAreas.TextAreaDefaults

interface FormContentScope : ColumnScope {
    val enabled: Boolean
    val isError: Boolean
    val isValid: Boolean
}

internal class FormContentScopeWrapper(
    scope: ColumnScope,
    override val enabled: Boolean,
    override val isError: Boolean,
    override val isValid: Boolean
) : FormContentScope, ColumnScope by scope

@Composable
fun FormContentScope.Input(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    readOnly: Boolean = false,
    placeholder: String? = null,
    transformation: VisualTransformation = VisualTransformation.None,
    colors: InputColors = InputsDefaults.outlineColors(),
    sizes: InputSizes = InputsDefaults.sizes(),
    leadingIcon: Painter? = null,
    trailingIcon: Painter? = null,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    onTrailingIconClick: (() -> Unit)?
) {
    OutlineInput(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier,
        enabled = this@Input.enabled,
        isError = this@Input.isError,
        isValid = this@Input.isValid,
        readOnly = readOnly,
        placeholder = placeholder,
        transformation = transformation,
        colors = colors,
        sizes = sizes,
        leadingIcon = leadingIcon,
        trailingIcon = trailingIcon,
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        onTrailingIconClick = onTrailingIconClick
    )
}

@Composable
fun FormContentScope.TextArea(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    textStyle: TextStyle = PersianTheme.typography.bodyLarge,
    placeholder: String? = null,
    colors: TextAreaColors = TextAreaDefaults.outlineColors(),
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default
) {
    OutlineTextArea(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier,
        enabled = this@TextArea.enabled,
        isError = this@TextArea.isError,
        isValid = this@TextArea.isValid,
        textStyle = textStyle,
        placeholder = placeholder,
        colors = colors,
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions
    )
}

@Composable
fun FormContentScope.SixDigitCodeInput(
    modifier: Modifier = Modifier,
    values: List<String>,
    isPassword: Boolean = false,
    onValueChange: (value: String, index: Int) -> Unit
) {
    SixDigitCodeInput(
        values = values,
        onValueChange = onValueChange,
        modifier = modifier,
        enabled = this@SixDigitCodeInput.enabled,
        isError = this@SixDigitCodeInput.isError,
        isValid = this@SixDigitCodeInput.isValid,
        isPassword = isPassword
    )
}

@Composable
fun FormContentScope.FourDigitCodeInput(
    modifier: Modifier = Modifier,
    values: List<String>,
    isPassword: Boolean = false,
    onValueChange: (value: String, index: Int) -> Unit
) {
    FourDigitCodeInput(
        values = values,
        onValueChange = onValueChange,
        modifier = modifier,
        enabled = this@FourDigitCodeInput.enabled,
        isError = this@FourDigitCodeInput.isError,
        isValid = this@FourDigitCodeInput.isValid,
        isPassword = isPassword
    )
}

@Composable
fun FormContentScope.Select(
    selected: String,
    modifier: Modifier = Modifier,
    expanded: Boolean,
    onExpandedChange: (Boolean) -> Unit,
    leadingIcon: Painter? = null,
    placeholder: String? = null,
    inputColors: InputColors = InputsDefaults.outlineColors(),
    menuColors: MenuColors = MenuDefaults.colors(),
    menuItems: @Composable (DropdownMenuItemScope.() -> Unit)
) {
    Select(
        selected = selected,
        modifier = modifier,
        expanded = expanded,
        onExpandedChange = onExpandedChange,
        isValid = this@Select.isValid,
        isError = this@Select.isError,
        enabled = this@Select.enabled,
        leadingIcon = leadingIcon,
        placeholder = placeholder,
        inputColors = inputColors,
        menuColors = menuColors,
        menuItems = menuItems
    )
}