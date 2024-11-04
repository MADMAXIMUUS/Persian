package io.github.madmaximuus.persian.forms

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.VisualTransformation
import io.github.madmaximuus.persian.checkboxes.Checkbox
import io.github.madmaximuus.persian.checkboxes.CheckboxColors
import io.github.madmaximuus.persian.checkboxes.CheckboxDefaults
import io.github.madmaximuus.persian.checkboxes.CheckboxSizes
import io.github.madmaximuus.persian.forms.utils.LayoutId
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.input.InputColors
import io.github.madmaximuus.persian.input.InputSizes
import io.github.madmaximuus.persian.input.InputsDefaults
import io.github.madmaximuus.persian.input.OutlineInput
import io.github.madmaximuus.persian.menu.DropdownMenuItemScope
import io.github.madmaximuus.persian.menu.MenuColors
import io.github.madmaximuus.persian.menu.MenuDefaults
import io.github.madmaximuus.persian.radioButton.RadioButton
import io.github.madmaximuus.persian.radioButton.RadioButtonColors
import io.github.madmaximuus.persian.radioButton.RadioButtonDefaults
import io.github.madmaximuus.persian.radioButton.RadioButtonSizes
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
interface FormContentScope {
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
 * @param enabled Indicates whether the form content is enabled.
 * @param isError Indicates whether the form content is in an error state.
 * @param isValid Indicates whether the form content is valid.
 */
internal class FormContentScopeWrapper(
    override val enabled: Boolean,
    override val isError: Boolean,
    override val isValid: Boolean
) : FormContentScope

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
    onTrailingIconClick: (() -> Unit)? = null
) {
    OutlineInput(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier.layoutId(LayoutId.INPUT),
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
        modifier = modifier.layoutId(LayoutId.TEXT_AREA),
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
        modifier = modifier.layoutId(LayoutId.SELECT),
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

@Composable
fun FormContentScope.RadioButtons(
    modifier: Modifier = Modifier,
    colors: RadioButtonColors = RadioButtonDefaults.colors(),
    sizes: RadioButtonSizes = RadioButtonDefaults.sizes(),
    content: @Composable FormRadioButtonScope.() -> Unit
) {
    Column(
        modifier = modifier
            .layoutId(LayoutId.RADIO_BUTTONS)
            .fillMaxWidth()
            .selectableGroup(),
        content = {
            val scope = remember(colors, sizes) {
                FormRadioButtonScopeWrapper(
                    scope = this,
                    colors = colors,
                    sizes = sizes,
                    enabled = this@RadioButtons.enabled
                )
            }
            scope.content()
        }
    )
}

interface FormRadioButtonScope : ColumnScope {
    val enabled: Boolean
    val colors: RadioButtonColors
    val sizes: RadioButtonSizes
}

internal class FormRadioButtonScopeWrapper(
    val scope: ColumnScope,
    override val enabled: Boolean,
    override val colors: RadioButtonColors,
    override val sizes: RadioButtonSizes
) : FormRadioButtonScope, ColumnScope by scope

@Composable
fun FormRadioButtonScope.RadioButton(
    modifier: Modifier = Modifier,
    text: String,
    selected: Boolean,
    onSelectedChange: (Boolean) -> Unit
) {
    RadioButton(
        modifier = modifier.fillMaxWidth(),
        text = text,
        selected = selected,
        enabled = this@RadioButton.enabled,
        colors = this@RadioButton.colors,
        sizes = this@RadioButton.sizes,
        onSelectedChange = onSelectedChange
    )
}

@Composable
fun FormContentScope.Checkboxes(
    modifier: Modifier = Modifier,
    colors: CheckboxColors = CheckboxDefaults.colors(),
    sizes: CheckboxSizes = CheckboxDefaults.sizes(),
    content: @Composable FormCheckboxScope.() -> Unit
) {
    Column(
        modifier = modifier
            .layoutId(LayoutId.CHECKBOXES)
            .fillMaxWidth(),
        content = {
            val scope = remember(colors, sizes) {
                FormCheckboxScopeWrapper(
                    scope = this,
                    colors = colors,
                    sizes = sizes,
                    enabled = this@Checkboxes.enabled
                )
            }
            scope.content()
        }
    )
}

interface FormCheckboxScope : ColumnScope {
    val enabled: Boolean
    val colors: CheckboxColors
    val sizes: CheckboxSizes
}

internal class FormCheckboxScopeWrapper(
    val scope: ColumnScope,
    override val enabled: Boolean,
    override val colors: CheckboxColors,
    override val sizes: CheckboxSizes
) : FormCheckboxScope, ColumnScope by scope

@Composable
fun FormCheckboxScope.Checkbox(
    modifier: Modifier = Modifier,
    text: String,
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit
) {
    Checkbox(
        modifier = modifier.fillMaxWidth(),
        text = text,
        checked = checked,
        enabled = this@Checkbox.enabled,
        colors = this@Checkbox.colors,
        sizes = this@Checkbox.sizes,
        onCheckedChange = onCheckedChange
    )
}