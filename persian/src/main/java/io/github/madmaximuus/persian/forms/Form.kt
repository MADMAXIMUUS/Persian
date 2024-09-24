package io.github.madmaximuus.persian.forms

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import io.github.madmaximuus.persian.foundation.PersianTheme

@Composable
fun Form(
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    isError: Boolean = false,
    isValid: Boolean = false,
    subhead: @Composable (FormSubheadScope.() -> Unit)? = null,
    content: @Composable FormContentScope.() -> Unit,
    caption: @Composable (FormCaptionScope.() -> Unit)? = null,
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size2)
    ) {
        val subheadColors = FormDefaults.subheadColors()
        val subheadTextStyle = PersianTheme.typography.labelMedium
        subhead?.let { subhead ->
            val subheadScope = remember(subheadColors, enabled, isError) {
                FormSubheadScopeWrapper(
                    scope = this,
                    colors = subheadColors,
                    textStyle = subheadTextStyle,
                    enabled = enabled,
                )
            }
            subheadScope.subhead()
        }
        /*when (content) {
            is PersianFormContent.FourDigitCodeInput -> {
                PersianFormContentFourDigitCodeInput(
                    values = content.values,
                    onValueChange = content.onValueChange,
                    isError = isError,
                    isValid = isValid,
                    enabled = enabled
                )
            }

            is PersianFormContent.SixDigitCodeInput -> {
                PersianFormContentSixDigitCodeInput(
                    modifier = Modifier.fillMaxWidth(),
                    values = content.values,
                    onValueChange = content.onValueChange,
                    isError = isError,
                    isSuccess = isValid,
                    enabled = enabled
                )
            }

            is PersianFormContent.Input -> {
                PersianFormContentInput(
                    value = content.value,
                    onValueChange = content.onValueChange,
                    isError = isError,
                    isValid = isValid,
                    enabled = enabled,
                    textStyle = content.textStyle,
                    colors = content.colors,
                    keyboardActions = content.keyboardActions,
                    keyboardOptions = content.keyboardOptions,
                    leadingIcon = content.leadingIcon,
                    placeholder = content.placeholder,
                    trailingIcon = content.trailingIcon,
                    onTrailingIconClick = content.onTrailingIconClick,
                    transformation = content.transformation,
                    readOnly = content.readOnly
                )
            }

            is PersianFormContent.TextArea -> {
                PersianFormContentTextArea(
                    value = content.value,
                    onValueChange = content.onValueChange,
                    isError = isError,
                    isValid = isValid,
                    enabled = enabled,
                    textStyle = content.textStyle,
                    colors = content.colors,
                    keyboardActions = content.keyboardActions,
                    keyboardOptions = content.keyboardOptions,
                    leadingIcon = content.leadingIcon,
                    placeholder = content.placeholder,
                )
            }

            is PersianFormContent.Select -> {
                PersianFormContentSelect(
                    selected = content.selected,
                    values = content.values,
                    enabled = enabled,
                    isError = isError,
                    isValid = isValid,
                    placeholder = content.placeholder,
                    onSelectedChange = content.onSelectedChange,
                    expanded = content.expanded ?: remember { mutableStateOf(false) },
                    leadingIcon = content.leadingIcon,
                    inputColors = content.inputColors ?: InputsDefaults.outlineColors(),
                    menuColors = content.menuColors ?: MenuDefaults.colors()
                )
            }
        }*/
        val contentScope = remember(enabled, isError, isValid) {
            FormContentScopeWrapper(
                scope = this,
                enabled = enabled,
                isError = isError,
                isValid = isValid
            )
        }
        contentScope.content()
        val colors = FormDefaults.captionColors()
        caption?.let { caption ->
            val captionScope = remember(colors, enabled, isError) {
                FormCaptionScopeWrapper(
                    scope = this,
                    colors = colors,
                    enabled = enabled,
                    isError = isError
                )
            }
            captionScope.caption()
        }
    }
}