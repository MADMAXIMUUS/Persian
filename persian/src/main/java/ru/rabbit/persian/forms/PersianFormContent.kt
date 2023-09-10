package ru.rabbit.persian.forms

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.VisualTransformation
import ru.rabbit.persian.inputs.InputColors
import ru.rabbit.persian.inputs.InputsTransformations
import ru.rabbit.persian.inputs.PersianInputColors
import ru.rabbit.persian.inputs.PersianInputs
import ru.rabbit.persian.textAreas.PersianTextAreaColors
import ru.rabbit.persian.textAreas.PersianTextAreas
import ru.rabbit.persian.textAreas.TextAreaColors

object PersianFormContent {

    @Composable
    fun Input(
        value: String,
        onValueChange: (String) -> Unit,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        isError: Boolean = false,
        isSuccess: Boolean = false,
        readOnly: Boolean = false,
        textStyle: TextStyle = MaterialTheme.typography.bodyLarge,
        placeholder: String? = null,
        transformation: VisualTransformation = InputsTransformations.none,
        colors: InputColors = PersianInputColors.primary(),
        leadingIcon: Painter? = null,
        trailingIcon: Painter? = null,
        suffix: String? = null,
        keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
        keyboardActions: KeyboardActions = KeyboardActions.Default,
        interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
        onTrailingIconClick: (() -> Unit)? = null
    ) {
        PersianInputs.Primary(
            value = value,
            onValueChange = onValueChange,
            modifier = modifier,
            enabled = enabled,
            isError = isError,
            isSuccess = isSuccess,
            readOnly = readOnly,
            textStyle = textStyle,
            placeholder = placeholder,
            transformation = transformation,
            colors = colors,
            leadingIcon = leadingIcon,
            trailingIcon = trailingIcon,
            suffix = suffix,
            keyboardOptions = keyboardOptions,
            keyboardActions = keyboardActions,
            interactionSource = interactionSource,
            onTrailingIconClick = onTrailingIconClick
        )
    }

    @Composable
    fun TextArea(
        value: String,
        onValueChange: (String) -> Unit,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        isError: Boolean = false,
        isSuccess: Boolean = false,
        readOnly: Boolean = false,
        textStyle: TextStyle = MaterialTheme.typography.bodyLarge,
        placeholder: String? = null,
        colors: TextAreaColors = PersianTextAreaColors.primary(),
        leadingIcon: Painter? = null,
        keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
        keyboardActions: KeyboardActions = KeyboardActions.Default,
        interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
    ) {
        PersianTextAreas.Primary(
            value = value,
            onValueChange = onValueChange,
            modifier = modifier,
            enabled = enabled,
            isError = isError,
            isSuccess = isSuccess,
            readOnly = readOnly,
            textStyle = textStyle,
            placeholder = placeholder,
            colors = colors,
            leadingIcon = leadingIcon,
            keyboardOptions = keyboardOptions,
            keyboardActions = keyboardActions,
            interactionSource = interactionSource
        )
    }

}