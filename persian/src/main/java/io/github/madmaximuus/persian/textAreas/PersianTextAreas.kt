package io.github.madmaximuus.persian.textAreas

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.selection.LocalTextSelectionColors
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.shape
import io.github.madmaximuus.persian.foundation.spacing
import io.github.madmaximuus.persian.iconBox.PersianIconBox

@Composable
fun PersianOutlineTextArea(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    isError: Boolean = false,
    isValid: Boolean = false,
    readOnly: Boolean = false,
    textStyle: TextStyle = MaterialTheme.typography.bodyLarge,
    placeholder: String? = null,
    colors: TextAreaColors = PersianTextAreaDefaults.outlineColors(),
    leadingIcon: Painter? = null,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) {
    val textColor = colors.textColor(enabled, isValid, isError, interactionSource).value
    val mergedTextStyle = textStyle.merge(
        TextStyle(
            color = textColor,
            textAlign = TextAlign.Justify,
            baselineShift = BaselineShift.Superscript
        )
    )

    val border = animateBorderStrokeAsState(
        enabled = enabled,
        isError = isError,
        isSuccess = isValid,
        interactionSource = interactionSource,
        colors = colors,
        focusedBorderThickness = 2.dp,
        unfocusedBorderThickness = 1.dp
    ).value
    CompositionLocalProvider(LocalTextSelectionColors provides colors.selectionColors) {
        BasicTextField(
            value = value,
            onValueChange = onValueChange,
            modifier = modifier,
            enabled = enabled,
            readOnly = readOnly,
            textStyle = mergedTextStyle,
            keyboardOptions = keyboardOptions,
            keyboardActions = keyboardActions,
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
                            shape = MaterialTheme.shape.shape16
                        )
                        .border(
                            border = border,
                            shape = MaterialTheme.shape.shape16
                        )
                        .padding(all = MaterialTheme.spacing.medium)
                        .height(120.dp),
                    verticalAlignment = Alignment.Top
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
                            PersianIconBox(icon = icon)
                        }
                    }
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = MaterialTheme.spacing.extraSmall)
                            .weight(1f)
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
                                style = MaterialTheme.typography.bodyLarge
                                    .copy(baselineShift = BaselineShift.Superscript)
                            )
                        }
                        innerTextField()
                    }
                    colors.stateIcon(
                        enabled = enabled,
                        isError = isError,
                        isSuccess = isValid
                    ).value?.let { icon ->
                        Spacer(modifier = Modifier.width(MaterialTheme.spacing.small))
                        CompositionLocalProvider(
                            LocalContentColor provides colors.stateIconColor(
                                enabled = enabled,
                                isValid = isValid,
                                isError = isError
                            ).value
                        ) {
                            PersianIconBox(
                                icon = icon,
                                contentDescription = ""
                            )
                        }
                    }
                }
            }
        )
    }
}

@Composable
fun PersianPlainTextArea(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    isError: Boolean = false,
    isValid: Boolean = false,
    readOnly: Boolean = false,
    textStyle: TextStyle = MaterialTheme.typography.bodyLarge,
    placeholder: String? = null,
    colors: TextAreaColors = PersianTextAreaDefaults.plainColors(),
    leadingIcon: Painter? = null,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) {
    val textColor = colors.textColor(enabled, isValid, isError, interactionSource).value
    val mergedTextStyle = textStyle.merge(
        TextStyle(
            color = textColor,
            textAlign = TextAlign.Justify,
            baselineShift = BaselineShift.Superscript
        )
    )

    val border = animateBorderStrokeAsState(
        enabled = enabled,
        isError = isError,
        isSuccess = isValid,
        interactionSource = interactionSource,
        colors = colors,
        focusedBorderThickness = 2.dp,
        unfocusedBorderThickness = 1.dp
    ).value
    CompositionLocalProvider(LocalTextSelectionColors provides colors.selectionColors) {
        BasicTextField(
            value = value,
            onValueChange = onValueChange,
            modifier = modifier,
            enabled = enabled,
            readOnly = readOnly,
            textStyle = mergedTextStyle,
            keyboardOptions = keyboardOptions,
            keyboardActions = keyboardActions,
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
                            shape = MaterialTheme.shape.shape16
                        )
                        .border(
                            border = border,
                            shape = MaterialTheme.shape.shape16
                        )
                        .padding(all = MaterialTheme.spacing.medium)
                        .height(120.dp),
                    verticalAlignment = Alignment.Top
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
                            PersianIconBox(icon = icon)
                        }
                    }
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = MaterialTheme.spacing.extraSmall)
                            .weight(1f)
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
                                style = MaterialTheme.typography.bodyLarge
                                    .copy(baselineShift = BaselineShift.Superscript)
                            )
                        }
                        innerTextField()
                    }
                    colors.stateIcon(
                        enabled = enabled,
                        isError = isError,
                        isSuccess = isValid
                    ).value?.let { icon ->
                        Spacer(modifier = Modifier.width(MaterialTheme.spacing.small))
                        CompositionLocalProvider(
                            LocalContentColor provides colors.stateIconColor(
                                enabled = enabled,
                                isValid = isValid,
                                isError = isError
                            ).value
                        ) {
                            PersianIconBox(
                                icon = icon,
                                contentDescription = ""
                            )
                        }
                    }
                }
            }
        )
    }
}


@Suppress("UNUSED")
@Composable
private fun animateBorderStrokeAsState(
    enabled: Boolean,
    isError: Boolean,
    isSuccess: Boolean,
    interactionSource: InteractionSource,
    colors: TextAreaColors,
    focusedBorderThickness: Dp,
    unfocusedBorderThickness: Dp
): State<BorderStroke> {
    val focused by interactionSource.collectIsFocusedAsState()
    val indicatorColor = colors.indicatorColor(enabled, isSuccess, isError, interactionSource)
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

@Preview
@Composable
fun TextAreaPreview() {
    PersianTheme {
        Surface {
            PersianOutlineTextArea(
                modifier = Modifier
                    .padding(10.dp),
                value = "",
                placeholder = "Я текст",
                onValueChange = {}
            )
        }
    }
}

@Preview(uiMode = UI_MODE_NIGHT_YES)
@Composable
fun DarkTextAreaPreview() {
    PersianTheme {
        Surface {
            PersianOutlineTextArea(
                modifier = Modifier
                    .padding(10.dp),
                value = "Я введенный текст",
                placeholder = "Я текст",
                onValueChange = {}
            )
        }
    }
}