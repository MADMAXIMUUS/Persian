package io.github.madmaximuus.persian.forms

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import io.github.madmaximuus.persian.foundation.spacing
import io.github.madmaximuus.persian.inputs.PersianInputsDefaults
import io.github.madmaximuus.persian.menus.PersianMenuDefaults

@Composable
fun PersianForm(
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    isError: Boolean = false,
    isValid: Boolean = false,
    subhead: PersianFormSubheadConfig? = null,
    content: PersianFormContent,
    caption: PersianFormCaptionConfig? = null,
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.extraExtraSmall)
    ) {
        if (subhead != null) {
            PersianFormSubhead(
                text = subhead.text,
                required = subhead.required,
                enabled = enabled,
                colors = subhead.colors,
                textStyle = subhead.textStyle
            )
        }
        when (content) {
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
                    inputColors = content.inputColors ?: PersianInputsDefaults.outlineColors(),
                    menuColors = content.menuColors ?: PersianMenuDefaults.colors()
                )
            }
        }
        if (caption != null) {
            if (caption.counter != null && caption.counterMax != null) {
                PersianFormCaption(
                    text = caption.text,
                    isError = isError,
                    errorText = caption.errorText,
                    enabled = enabled,
                    colors = caption.colors,
                    textStyle = caption.textStyle,
                    counter = caption.counter,
                    counterMax = caption.counterMax,
                    counterTextStyle = caption.counterTextStyle
                )
            } else {
                PersianFormCaption(
                    text = caption.text,
                    isError = isError,
                    errorText = caption.errorText,
                    enabled = enabled,
                    colors = caption.colors,
                    textStyle = caption.textStyle,
                )
            }
        } else {
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(MaterialTheme.spacing.large)
            )
        }
    }
}