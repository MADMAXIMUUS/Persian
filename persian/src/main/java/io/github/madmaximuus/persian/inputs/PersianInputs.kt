package io.github.madmaximuus.persian.inputs

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
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
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
import io.github.madmaximuus.persian.foundation.spacing
import io.github.madmaximuus.persian.iconBox.PersianIconBox

@Composable
fun PersianInput(
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
    colors: InputColors = PersianInputDefaults.colors(),
    leadingIcon: Painter? = null,
    trailingIcon: Painter? = null,
    suffix: String? = null,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onTrailingIconClick: (() -> Unit)? = null
) {
    val textColor = colors.textColor(enabled, isSuccess, isError, interactionSource).value
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
                    isSuccess = isSuccess
                ).value
            ),
            decorationBox = { innerTextField ->
                val border = animateBorderStrokeAsState(
                    enabled = enabled,
                    isError = isError,
                    isSuccess = isSuccess,
                    colors = colors,
                    interactionSource = interactionSource,
                    unfocusedBorderThickness = 1.dp,
                    focusedBorderThickness = 2.dp
                ).value
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(
                            color = colors.containerColor(
                                enabled = enabled,
                                isSuccess = isSuccess,
                                isError = isError,
                                interactionSource = interactionSource
                            ).value,
                            shape = MaterialTheme.shapes.large
                        )
                        .border(
                            border = border,
                            shape = MaterialTheme.shapes.large
                        )
                        .padding(all = MaterialTheme.spacing.medium)
                        .height(24.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    leadingIcon?.let { icon ->
                        CompositionLocalProvider(
                            LocalContentColor provides colors.leadingIconColor(
                                enabled = enabled,
                                isSuccess = isSuccess,
                                isError = isError,
                                interactionSource = interactionSource
                            ).value
                        ) {
                            PersianIconBox(
                                icon = icon,
                            )
                        }
                    }
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = MaterialTheme.spacing.extraSmall)
                            .weight(1f),
                    ) {
                        if (value.isEmpty() && placeholder != null) {
                            Text(
                                text = placeholder,
                                color = colors.placeholderColor(
                                    enabled = enabled,
                                    isError = isError,
                                    interactionSource = interactionSource
                                ).value,
                                style = MaterialTheme.typography.bodyLarge
                                    .copy(baselineShift = BaselineShift.None),
                            )
                        }
                        innerTextField()
                    }
                    if (suffix != null && trailingIcon == null) {
                        Box(
                            modifier = Modifier
                                .wrapContentSize()
                                .padding(horizontal = MaterialTheme.spacing.extraSmall)
                        ) {
                            Text(
                                text = suffix,
                                color = colors.suffixColor(
                                    enabled = enabled,
                                    isSuccess = isSuccess,
                                    isError = isError,
                                    interactionSource = interactionSource
                                ).value,
                                style = MaterialTheme.typography.bodyLarge
                            )
                        }
                    }
                    trailingIcon?.let { icon ->
                        CompositionLocalProvider(
                            LocalContentColor provides colors.trailingIconColor(
                                enabled = enabled,
                                isSuccess = isSuccess,
                                isError = isError,
                                interactionSource = interactionSource
                            ).value
                        ) {
                            PersianIconBox(
                                modifier = Modifier
                                    .clip(MaterialTheme.shapes.small)
                                    .clickable(
                                        enabled = onTrailingIconClick != null,
                                        onClick = {
                                            onTrailingIconClick?.invoke()
                                        },
                                        role = Role.Button
                                    ),
                                icon = icon
                            )
                        }
                    }
                    colors.stateIcon(
                        enabled = enabled,
                        isError = isError,
                        isSuccess = isSuccess
                    ).value?.let { icon ->
                        Spacer(modifier = Modifier.width(MaterialTheme.spacing.small))
                        CompositionLocalProvider(
                            LocalContentColor provides colors.stateIconColor(
                                enabled = enabled,
                                isSuccess = isSuccess,
                                isError = isError,
                            ).value
                        ) {
                            PersianIconBox(icon = icon)
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
        isSuccess = isSuccess,
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