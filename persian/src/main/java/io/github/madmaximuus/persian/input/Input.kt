package io.github.madmaximuus.persian.input

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.selection.LocalTextSelectionColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.LocalContentColor
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.icon.Icon
import io.github.madmaximuus.persian.text.Text

@Composable
fun OutlineInput(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    isError: Boolean = false,
    isValid: Boolean = false,
    readOnly: Boolean = false,
    placeholder: String? = null,
    transformation: VisualTransformation = InputsTransformations.none,
    colors: InputColors = InputsDefaults.outlineColors(),
    sizes: InputSizes = InputsDefaults.sizes(),
    leadingIcon: Painter? = null,
    trailingIcon: Painter? = null,
    suffix: String? = null,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onTrailingIconClick: (() -> Unit)? = null
) {
    val textColor = colors.textColor(enabled, isValid, isError, interactionSource).value
    val mergedTextStyle =
        sizes.inputTextStyle.merge(TextStyle(color = textColor, baselineShift = BaselineShift.None))

    CompositionLocalProvider(LocalTextSelectionColors provides colors.selectionColors) {
        BasicTextField(
            modifier = modifier,
            value = value,
            onValueChange = onValueChange,
            enabled = enabled,
            readOnly = readOnly,
            textStyle = mergedTextStyle,
            keyboardOptions = keyboardOptions,
            keyboardActions = keyboardActions,
            singleLine = true,
            maxLines = 1,
            minLines = 1,
            visualTransformation = transformation,
            interactionSource = interactionSource,
            cursorBrush = SolidColor(
                colors.cursorColor(
                    isError = isError,
                    isValid = isValid
                ).value
            ),
            decorationBox = { innerTextField ->
                val border = animateBorderStrokeAsState(
                    enabled = enabled,
                    isError = isError,
                    isSuccess = isValid,
                    colors = colors,
                    interactionSource = interactionSource,
                    unfocusedBorderThickness = sizes.unfocusedBorderThickness,
                    focusedBorderThickness = sizes.focusedBorderThickness
                ).value
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(
                            color = colors.containerColor(
                                enabled = enabled,
                                isValid = isValid,
                                isError = isError,
                                interactionSource = interactionSource
                            ).value,
                            shape = sizes.shape
                        )
                        .border(
                            border = border,
                            shape = sizes.shape
                        )
                        .height(52.dp)
                        .padding(sizes.contentPaddingValues),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    leadingIcon?.let { icon ->
                        Icon(
                            painter = icon,
                            tint = colors.leadingIconColor(
                                enabled = enabled,
                                isValid = isValid,
                                isError = isError,
                                interactionSource = interactionSource
                            ).value
                        )
                    }
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = PersianTheme.spacing.size4)
                            .weight(1f),
                    ) {
                        if (value.isEmpty() && placeholder != null) {
                            Text(
                                text = placeholder,
                                color = colors.placeholderColor(
                                    enabled = enabled,
                                    isError = isError,
                                    isValid = isValid,
                                    interactionSource = interactionSource
                                ).value,
                                style = sizes.placeholderTextStyle
                                    .copy(baselineShift = BaselineShift.None),
                            )
                        }
                        innerTextField()
                    }
                    if (suffix != null && trailingIcon == null) {
                        Box(
                            modifier = Modifier
                                .wrapContentSize()
                                .padding(horizontal = PersianTheme.spacing.size4)
                        ) {
                            Text(
                                text = suffix,
                                color = colors.suffixColor(
                                    enabled = enabled,
                                    isValid = isValid,
                                    isError = isError,
                                    interactionSource = interactionSource
                                ).value,
                                style = sizes.suffixTextStyle
                            )
                        }
                    }
                    trailingIcon?.let { icon ->
                        Icon(
                            modifier = Modifier
                                .clip(PersianTheme.shapes.shape8)
                                .clickable(
                                    enabled = onTrailingIconClick != null,
                                    onClick = {
                                        onTrailingIconClick?.invoke()
                                    },
                                    role = Role.Button
                                ),
                            painter = icon,
                            tint = colors.trailingIconColor(
                                enabled = enabled,
                                isValid = isValid,
                                isError = isError,
                                interactionSource = interactionSource
                            ).value
                        )
                    }
                    colors.stateIcon(
                        enabled = enabled,
                        isError = isError,
                        isSuccess = isValid
                    ).value?.let { icon ->
                        Spacer(modifier = Modifier.width(PersianTheme.spacing.size8))
                        Icon(
                            painter = icon,
                            tint = colors.stateIconColor(
                                enabled = enabled,
                                isValid = isValid,
                                isError = isError,
                            ).value
                        )
                    }
                }
            }
        )
    }
}

@Composable
fun PlainInput(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    isError: Boolean = false,
    isValid: Boolean = false,
    readOnly: Boolean = false,
    textStyle: TextStyle = PersianTheme.typography.bodyLarge,
    placeholder: String? = null,
    transformation: VisualTransformation = InputsTransformations.none,
    colors: InputColors = InputsDefaults.plainColors(),
    leadingIcon: Painter? = null,
    trailingIcon: Painter? = null,
    suffix: String? = null,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onTrailingIconClick: (() -> Unit)? = null
) {
    val textColor = colors.textColor(enabled, isValid, isError, interactionSource).value
    val mergedTextStyle =
        textStyle.merge(TextStyle(color = textColor, baselineShift = BaselineShift.None))

    CompositionLocalProvider(LocalTextSelectionColors provides colors.selectionColors) {
        BasicTextField(
            modifier = modifier,
            value = value,
            onValueChange = onValueChange,
            enabled = enabled,
            readOnly = readOnly,
            textStyle = mergedTextStyle,
            keyboardOptions = keyboardOptions,
            keyboardActions = keyboardActions,
            singleLine = true,
            maxLines = 1,
            minLines = 1,
            visualTransformation = transformation,
            interactionSource = interactionSource,
            cursorBrush = SolidColor(
                colors.cursorColor(
                    isError = isError,
                    isValid = isValid
                ).value
            ),
            decorationBox = { innerTextField ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(
                            color = colors.containerColor(
                                enabled = enabled,
                                isValid = isValid,
                                isError = isError,
                                interactionSource = interactionSource
                            ).value,
                            shape = PersianTheme.shapes.shape16
                        )
                        .height(52.dp)
                        .padding(horizontal = PersianTheme.spacing.size12),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    leadingIcon?.let { icon ->
                        CompositionLocalProvider(
                            LocalContentColor provides colors.leadingIconColor(
                                enabled = enabled,
                                isValid = isValid,
                                isError = isError,
                                interactionSource = interactionSource
                            ).value
                        ) {
                            Icon(
                                painter = icon,
                            )
                        }
                    }
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = PersianTheme.spacing.size4)
                            .weight(1f),
                    ) {
                        if (value.isEmpty() && placeholder != null) {
                            Text(
                                text = placeholder,
                                color = colors.placeholderColor(
                                    enabled = enabled,
                                    isError = isError,
                                    isValid = isValid,
                                    interactionSource = interactionSource
                                ).value,
                                style = PersianTheme.typography.bodyLarge
                                    .copy(baselineShift = BaselineShift.None),
                            )
                        }
                        innerTextField()
                    }
                    if (suffix != null && trailingIcon == null) {
                        Box(
                            modifier = Modifier
                                .wrapContentSize()
                                .padding(horizontal = PersianTheme.spacing.size4)
                        ) {
                            Text(
                                text = suffix,
                                color = colors.suffixColor(
                                    enabled = enabled,
                                    isValid = isValid,
                                    isError = isError,
                                    interactionSource = interactionSource
                                ).value,
                                style = PersianTheme.typography.bodyMedium
                            )
                        }
                    }
                    trailingIcon?.let { icon ->
                        CompositionLocalProvider(
                            LocalContentColor provides colors.trailingIconColor(
                                enabled = enabled,
                                isValid = isValid,
                                isError = isError,
                                interactionSource = interactionSource
                            ).value
                        ) {
                            Icon(
                                modifier = Modifier
                                    .clip(PersianTheme.shapes.shape8)
                                    .clickable(
                                        enabled = onTrailingIconClick != null,
                                        onClick = {
                                            onTrailingIconClick?.invoke()
                                        },
                                        role = Role.Button
                                    ),
                                painter = icon
                            )
                        }
                    }
                    colors.stateIcon(
                        enabled = enabled,
                        isError = isError,
                        isSuccess = isValid
                    ).value?.let { icon ->
                        Spacer(modifier = Modifier.width(PersianTheme.spacing.size8))
                        CompositionLocalProvider(
                            LocalContentColor provides colors.stateIconColor(
                                enabled = enabled,
                                isValid = isValid,
                                isError = isError,
                            ).value
                        ) {
                            Icon(painter = icon)
                        }

                    }
                }
            }
        )
    }
}

object InputsTransformations {
    val none = VisualTransformation.None
    val password = PasswordVisualTransformation()
}

@Composable
private fun animateBorderStrokeAsState(
    enabled: Boolean,
    isError: Boolean,
    isSuccess: Boolean,
    interactionSource: InteractionSource,
    colors: InputColors,
    focusedBorderThickness: Dp,
    unfocusedBorderThickness: Dp
): State<BorderStroke> {
    val focused by interactionSource.collectIsFocusedAsState()
    val indicatorColor = colors.indicatorColor(
        enabled = enabled,
        isValid = isSuccess,
        isError = isError,
        interactionSource = interactionSource
    )
    val targetThickness = if (focused || isError || isSuccess)
        focusedBorderThickness
    else
        unfocusedBorderThickness
    val animatedThickness = if (enabled) {
        animateDpAsState(targetThickness, tween(durationMillis = 150), label = "")
    } else {
        rememberUpdatedState(unfocusedBorderThickness)
    }
    return rememberUpdatedState(
        BorderStroke(animatedThickness.value, SolidColor(indicatorColor.value))
    )
}