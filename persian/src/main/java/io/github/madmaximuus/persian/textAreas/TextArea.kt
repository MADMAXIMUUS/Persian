package io.github.madmaximuus.persian.textAreas

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
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.input.KeyboardActionHandler
import androidx.compose.foundation.text.input.TextFieldLineLimits
import androidx.compose.foundation.text.input.TextFieldState
import androidx.compose.foundation.text.selection.LocalTextSelectionColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.text.Text

/**
 * A composable function that creates an outlined text area with customizable properties.
 *
 * @param value The current text value of the text area.
 * @param onValueChange A callback that is invoked when the text value changes.
 * @param modifier The modifier to be applied to the text area.
 * @param enabled Whether the text area is enabled or disabled.
 * @param isError Whether the text area is in an error state.
 * @param isValid Whether the text area is in a valid state.
 * @param readOnly Whether the text area is read-only.
 * @param textStyle The text style to be applied to the text area.
 * @param placeholder The placeholder text to be displayed when the text area is empty.
 * @param colors The colors to be applied to the text area.
 * @param keyboardOptions The keyboard options for the text area.
 * @param keyboardActionHandler The keyboard actions for the text area.
 * @param interactionSource The interaction source for the text area.
 */
@Composable
fun OutlineTextArea(
    state: TextFieldState,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    isError: Boolean = false,
    isValid: Boolean = false,
    readOnly: Boolean = false,
    textStyle: TextStyle = PersianTheme.typography.bodyLarge,
    placeholder: String? = null,
    colors: TextAreaColors = TextAreaDefaults.outlineColors(),
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActionHandler: KeyboardActionHandler? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) {
    val textColor = colors.textColor(enabled, isValid, isError, interactionSource).value
    val mergedTextStyle = textStyle.merge(
        TextStyle(
            color = textColor,
            textAlign = TextAlign.Justify
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
            state = state,
            modifier = modifier,
            enabled = enabled,
            readOnly = readOnly,
            textStyle = mergedTextStyle,
            keyboardOptions = keyboardOptions,
            onKeyboardAction = keyboardActionHandler,
            lineLimits = TextFieldLineLimits.MultiLine(
                minHeightInLines = 2,
                maxHeightInLines = 6
            ),
            interactionSource = interactionSource,
            cursorBrush = SolidColor(
                colors.cursorColor(
                    isError = isError,
                    isValid = isValid
                ).value
            ),
            decorator = { innerTextField ->
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
                        .border(
                            border = border,
                            shape = PersianTheme.shapes.shape16
                        )
                        .padding(PersianTheme.spacing.size12)
                        .heightIn(min = 48.dp, max = 144.dp),
                    verticalAlignment = Alignment.Top
                ) {
                    Box(
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        if (state.text.isEmpty() && placeholder != null) {
                            Text(
                                text = placeholder,
                                color = colors.placeholderColor(
                                    enabled = enabled,
                                    isError = isError,
                                    isValid = isValid,
                                    interactionSource = interactionSource
                                ).value,
                                style = PersianTheme.typography.bodyLarge
                                    .copy(baselineShift = BaselineShift.Superscript)
                            )
                        }
                        innerTextField()
                    }
                }
            }
        )
    }
}

/**
 * A composable function that creates a plain text area with customizable properties.
 *
 * @param value The current text value of the text area.
 * @param onValueChange A callback that is invoked when the text value changes.
 * @param modifier The modifier to be applied to the text area.
 * @param enabled Whether the text area is enabled or disabled.
 * @param isError Whether the text area is in an error state.
 * @param isValid Whether the text area is in a valid state.
 * @param readOnly Whether the text area is read-only.
 * @param textStyle The text style to be applied to the text area.
 * @param placeholder The placeholder text to be displayed when the text area is empty.
 * @param colors The colors to be applied to the text area.
 * @param keyboardOptions The keyboard options for the text area.
 * @param keyboardActionHandler The keyboard actions for the text area.
 * @param interactionSource The interaction source for the text area.
 */
@Composable
fun PlainTextArea(
    state: TextFieldState,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    isError: Boolean = false,
    isValid: Boolean = false,
    readOnly: Boolean = false,
    textStyle: TextStyle = PersianTheme.typography.bodyLarge,
    placeholder: String? = null,
    colors: TextAreaColors = TextAreaDefaults.plainColors(),
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActionHandler: KeyboardActionHandler? = null,
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
            state = state,
            modifier = modifier,
            enabled = enabled,
            readOnly = readOnly,
            textStyle = mergedTextStyle,
            keyboardOptions = keyboardOptions,
            onKeyboardAction = keyboardActionHandler,
            interactionSource = interactionSource,
            lineLimits = TextFieldLineLimits.MultiLine(
                minHeightInLines = 2,
                maxHeightInLines = 6
            ),
            cursorBrush = SolidColor(
                colors.cursorColor(
                    isError = isError,
                    isValid = isValid
                ).value
            ),
            decorator = { innerTextField ->
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
                        .border(
                            border = border,
                            shape = PersianTheme.shapes.shape16
                        )
                        .padding(PersianTheme.spacing.size12)
                        .heightIn(min = 48.dp, max = 144.dp),
                    verticalAlignment = Alignment.Top
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = PersianTheme.spacing.size4)
                            .weight(1f)
                    ) {
                        if (state.text.isEmpty() && placeholder != null) {
                            Text(
                                text = placeholder,
                                color = colors.placeholderColor(
                                    enabled = enabled,
                                    isError = isError,
                                    isValid = isValid,
                                    interactionSource = interactionSource
                                ).value,
                                style = PersianTheme.typography.bodyLarge
                                    .copy(baselineShift = BaselineShift.Superscript)
                            )
                        }
                        innerTextField()
                    }
                }
            }
        )
    }
}

/**
 * A composable function that animates the border stroke of a text area based on its state.
 *
 * @param enabled Whether the text area is enabled or disabled.
 * @param isError Whether the text area is in an error state.
 * @param isSuccess Whether the text area is in a success state.
 * @param interactionSource The interaction source for the text area.
 * @param colors The colors to be applied to the text area.
 * @param focusedBorderThickness The thickness of the border when the text area is focused.
 * @param unfocusedBorderThickness The thickness of the border when the text area is not focused.
 */
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