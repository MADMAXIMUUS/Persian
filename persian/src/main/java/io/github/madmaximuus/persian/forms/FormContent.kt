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

/**
 * Interface representing the scope for form content.
 *
 * This interface extends [ColumnScope] and provides additional properties
 * specific to form content, such as enabled state, error status, and validity.
 *
 * @property enabled Indicates whether the form content is enabled.
 * @property isError Indicates whether the form content is in an error state.
 * @property isValid Indicates whether the form content is valid.
 */
interface FormContentScope : ColumnScope {
    val enabled: Boolean
    val isError: Boolean
    val isValid: Boolean
}

/**
 * Internal wrapper class for [FormContentScope].
 *
 * This class implements [FormContentScope] and delegates [ColumnScope] functionality to the provided [scope].
 * It encapsulates the properties required for form content, such as enabled state, error status, and validity.
 *
 * @param scope The [ColumnScope] to delegate functionality to.
 * @param enabled Indicates whether the form content is enabled.
 * @param isError Indicates whether the form content is in an error state.
 * @param isValid Indicates whether the form content is valid.
 */
internal class FormContentScopeWrapper(
    scope: ColumnScope,
    override val enabled: Boolean,
    override val isError: Boolean,
    override val isValid: Boolean
) : FormContentScope, ColumnScope by scope

/**
 * Composable function to display an input field within a form.
 *
 * This function uses the properties from the [FormContentScope] to determine the appearance and behavior
 * of the input field. It provides various customization options such as value, placeholder, icons,
 * keyboard options, and more.
 *
 * @param value The current value of the input field.
 * @param onValueChange The callback to be invoked when the value of the input field changes.
 * @param modifier The modifier to be applied to the input field.
 * @param readOnly Indicates whether the input field is read-only.
 * @param placeholder The placeholder text to be displayed when the input field is empty.
 * @param transformation The visual transformation to be applied to the input text.
 * @param colors The colors to be used for the input field.
 * @param sizes The sizes to be used for the input field.
 * @param leadingIcon The leading icon to be displayed in the input field.
 * @param trailingIcon The trailing icon to be displayed in the input field.
 * @param keyboardOptions The keyboard options to be used for the input field.
 * @param keyboardActions The keyboard actions to be used for the input field.
 * @param onTrailingIconClick The callback to be invoked when the trailing icon is clicked.
 */
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

/**
 * Composable function to display a text area within a form.
 *
 * This function uses the properties from the [FormContentScope] to determine the appearance and behavior
 * of the text area. It provides various customization options such as value, placeholder, text style,
 * colors, keyboard options, and more.
 *
 * @param value The current value of the text area.
 * @param onValueChange The callback to be invoked when the value of the text area changes.
 * @param modifier The modifier to be applied to the text area.
 * @param textStyle The text style to be applied to the text area.
 * @param placeholder The placeholder text to be displayed when the text area is empty.
 * @param colors The colors to be used for the text area.
 * @param keyboardOptions The keyboard options to be used for the text area.
 * @param keyboardActions The keyboard actions to be used for the text area.
 */
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

/**
 * Composable function to display a six-digit code input within a form.
 *
 * This function uses the properties from the [FormContentScope] to determine the appearance and behavior
 * of the six-digit code input. It provides customization options such as values, password mode, and a callback
 * for value changes.
 *
 * @param modifier The modifier to be applied to the six-digit code input.
 * @param values The list of current values for each digit in the code input.
 * @param isPassword Indicates whether the input should be treated as a password (hidden).
 * @param onValueChange The callback to be invoked when the value of a digit changes. It provides the new value
 * and the index of the changed digit.
 */
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

/**
 * Composable function to display a four-digit code input within a form.
 *
 * This function uses the properties from the [FormContentScope] to determine the appearance and behavior
 * of the four-digit code input. It provides customization options such as values, password mode, and a callback
 * for value changes.
 *
 * @param modifier The modifier to be applied to the four-digit code input.
 * @param values The list of current values for each digit in the code input.
 * @param isPassword Indicates whether the input should be treated as a password (hidden).
 * @param onValueChange The callback to be invoked when the value of a digit changes. It provides the new value
 * and the index of the changed digit.
 */
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

/**
 * Composable function to display a select dropdown within a form.
 *
 * This function uses the properties from the [FormContentScope] to determine the appearance and behavior
 * of the select dropdown. It provides customization options such as the selected value, expanded state,
 * icons, placeholder, colors, and menu items.
 *
 * @param selected The currently selected value in the dropdown.
 * @param modifier The modifier to be applied to the select dropdown.
 * @param expanded Indicates whether the dropdown is expanded.
 * @param onExpandedChange The callback to be invoked when the expanded state of the dropdown changes.
 * @param leadingIcon The leading icon to be displayed in the dropdown.
 * @param placeholder The placeholder text to be displayed when no value is selected.
 * @param inputColors The colors to be used for the input field of the dropdown.
 * @param menuColors The colors to be used for the menu items of the dropdown.
 * @param menuItems The composable content to be displayed as menu items in the dropdown.
 */
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