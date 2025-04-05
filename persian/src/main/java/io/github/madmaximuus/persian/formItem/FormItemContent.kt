package io.github.madmaximuus.persian.formItem

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.input.InputTransformation
import androidx.compose.foundation.text.input.KeyboardActionHandler
import androidx.compose.foundation.text.input.TextFieldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.TextStyle
import io.github.madmaximuus.persian.checkbox.Checkbox
import io.github.madmaximuus.persian.checkbox.CheckboxColors
import io.github.madmaximuus.persian.checkbox.CheckboxDefaults
import io.github.madmaximuus.persian.checkbox.CheckboxSizes
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.input.Input
import io.github.madmaximuus.persian.input.InputColors
import io.github.madmaximuus.persian.input.InputSizes
import io.github.madmaximuus.persian.input.InputsDefaults
import io.github.madmaximuus.persian.internal.SecureInputSettings
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
interface FormItemContentScope {
    val enabled: Boolean
    val isError: Boolean
    val isValid: Boolean
}

/**
 * Internal wrapper class for [FormItemContentScope].
 *
 * This class implements [FormItemContentScope].
 * It encapsulates the properties required for form content, such as enabled state, error status, and validity.
 *
 * @param enabled Indicates whether the form content is enabled.
 * @param isError Indicates whether the form content is in an error state.
 * @param isValid Indicates whether the form content is valid.
 */
internal class FormItemContentScopeWrapper(
    override val enabled: Boolean,
    override val isError: Boolean,
    override val isValid: Boolean
) : FormItemContentScope

/**
 * Display an [Input] within a form.
 *
 * @param state The state of the text field.
 * @param modifier The modifier to be applied to the input field.
 * @param readOnly Indicates whether the input field is read-only.
 * @param placeholder The placeholder text to be displayed when the input field is empty.
 * @param transformation The visual transformation to be applied to the input text.
 * @param colors The colors to be used for the input field.
 * @param sizes The sizes to be used for the input field.
 * @param leadingIcon The leading icon to be displayed in the input field.
 * @param trailingIcon The trailing icon to be displayed in the input field.
 * @param keyboardOptions The keyboard options to be used for the input field.
 * @param keyboardActionHandler The keyboard actions to be used for the input field.
 * @param onTrailingIconClick The callback to be invoked when the trailing icon is clicked.
 */
@Composable
fun FormItemContentScope.Input(
    state: TextFieldState,
    modifier: Modifier = Modifier,
    readOnly: Boolean = false,
    placeholder: String? = null,
    transformation: InputTransformation? = null,
    secure: SecureInputSettings = SecureInputSettings.NotSecure,
    colors: InputColors = InputsDefaults.outlineColors(),
    sizes: InputSizes = InputsDefaults.sizes(),
    leadingIcon: Painter? = null,
    trailingIcon: Painter? = null,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActionHandler: KeyboardActionHandler? = null,
    onTrailingIconClick: (() -> Unit)? = null
) = Input(
    state = state,
    modifier = modifier.padding(horizontal = PersianTheme.spacing.size16),
    enabled = this@Input.enabled,
    isError = this@Input.isError,
    isValid = this@Input.isValid,
    readOnly = readOnly,
    placeholder = placeholder,
    transformation = transformation,
    secure = secure,
    colors = colors,
    sizes = sizes,
    leadingIcon = leadingIcon,
    trailingIcon = trailingIcon,
    keyboardOptions = keyboardOptions,
    keyboardActionHandler = keyboardActionHandler,
    onTrailingIconClick = onTrailingIconClick
)

/**
 * Display a [TextArea] within a form.
 *
 * @param state The state of the text area.
 * @param modifier The modifier to be applied to the text area.
 * @param textStyle The text style to be applied to the text area.
 * @param placeholder The placeholder text to be displayed when the text area is empty.
 * @param colors The colors to be used for the text area.
 * @param keyboardOptions The keyboard options to be used for the text area.
 * @param keyboardActionHandler The keyboard actions to be used for the text area.
 */
@Composable
fun FormItemContentScope.TextArea(
    state: TextFieldState,
    modifier: Modifier = Modifier,
    textStyle: TextStyle = PersianTheme.typography.bodyLarge,
    placeholder: String? = null,
    colors: TextAreaColors = TextAreaDefaults.outlineColors(),
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActionHandler: KeyboardActionHandler? = null
) = OutlineTextArea(
    state = state,
    modifier = modifier.padding(horizontal = PersianTheme.spacing.size16),
    enabled = this@TextArea.enabled,
    isError = this@TextArea.isError,
    isValid = this@TextArea.isValid,
    textStyle = textStyle,
    placeholder = placeholder,
    colors = colors,
    keyboardOptions = keyboardOptions,
    keyboardActionHandler = keyboardActionHandler
)

/**
 * Display a [Select] within a form.
 *
 * @param state The currently selected value in the dropdown.
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
fun FormItemContentScope.Select(
    state: TextFieldState,
    modifier: Modifier = Modifier,
    expanded: Boolean,
    onExpandedChange: (Boolean) -> Unit,
    leadingIcon: Painter? = null,
    placeholder: String? = null,
    inputColors: InputColors = InputsDefaults.outlineColors(),
    menuColors: MenuColors = MenuDefaults.colors(),
    menuItems: @Composable (DropdownMenuItemScope.() -> Unit)
) = Select(
    state = state,
    modifier = modifier.padding(horizontal = PersianTheme.spacing.size16),
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

/**
 * Display a [RadioButton] list within a form.
 *
 * @param modifier The modifier to be applied to the column.
 * @param colors The colors to be used for radio buttons inside this column.
 * @param sizes The colors to be used for radio buttons inside this column.
 * @param content Composable for provide a [RadioButton] to this column.
 */
@Composable
fun FormItemContentScope.RadioButtons(
    modifier: Modifier = Modifier,
    colors: RadioButtonColors = RadioButtonDefaults.colors(),
    sizes: RadioButtonSizes = RadioButtonDefaults.sizes(),
    content: @Composable FormRadioButtonScope.() -> Unit
) = Column(
    modifier = modifier
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

/**
 * Display a [RadioButton] inside [RadioButtons] within a form.
 *
 * @param modifier The modifier to be applied to the column.
 * @param text The text to be displayed in this radio button.
 * @param selected The selected state of this radio button.
 * @param onSelectedChange The call to be called when this or other radio buttons was clicked.
 */
@Composable
fun FormRadioButtonScope.RadioButton(
    modifier: Modifier = Modifier,
    text: String,
    selected: Boolean,
    onSelectedChange: (Boolean) -> Unit
) = RadioButton(
    modifier = modifier.fillMaxWidth(),
    text = text,
    selected = selected,
    enabled = this@RadioButton.enabled,
    colors = this@RadioButton.colors,
    sizes = this@RadioButton.sizes,
    onSelectedChange = onSelectedChange
)

/**
 * Display a [Checkbox] list within a form.
 *
 * @param modifier The modifier to be applied to the column.
 * @param colors The colors to be used for checkboxes inside this column.
 * @param sizes The colors to be used for checkboxes inside this column.
 * @param content Composable for provide a [Checkbox] to this column.
 */
@Composable
fun FormItemContentScope.Checkboxes(
    modifier: Modifier = Modifier,
    colors: CheckboxColors = CheckboxDefaults.colors(),
    sizes: CheckboxSizes = CheckboxDefaults.sizes(),
    content: @Composable FormCheckboxScope.() -> Unit
) = Column(
    modifier = modifier
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

/**
 * Display a [Checkbox] inside [Checkboxes] within a form.
 *
 * @param modifier The modifier to be applied to the column.
 * @param text The text to be displayed in this radio button.
 * @param checked The checked state of this radio button.
 * @param onCheckedChange The call to be called when this checkbox was clicked.
 */
@Composable
fun FormCheckboxScope.Checkbox(
    modifier: Modifier = Modifier,
    text: String,
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit
) = Checkbox(
    modifier = modifier.fillMaxWidth(),
    text = text,
    checked = checked,
    enabled = this@Checkbox.enabled,
    colors = this@Checkbox.colors,
    sizes = this@Checkbox.sizes,
    onCheckedChange = onCheckedChange
)