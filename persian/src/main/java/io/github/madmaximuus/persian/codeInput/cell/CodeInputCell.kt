package io.github.madmaximuus.persian.codeInput.cell

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.interaction.Interaction
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.BasicSecureTextField
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.input.TextFieldLineLimits
import androidx.compose.foundation.text.input.TextFieldState
import androidx.compose.foundation.text.input.TextObfuscationMode
import androidx.compose.foundation.text.selection.LocalTextSelectionColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.codeInput.CellColors
import io.github.madmaximuus.persian.codeInput.FourDigitCodeInput
import io.github.madmaximuus.persian.codeInput.SixDigitCodeInput
import io.github.madmaximuus.persian.foundation.PersianState38
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.internal.SecureInputSettings

/**
 * Create a cell that used by [SixDigitCodeInput] and [FourDigitCodeInput]
 *
 * @param modifier The [Modifier] to be applied to this composable.
 * @param state The [TextFieldState] The state of the input field, which contains information
 * about the text in this input field.
 * @param enabled Whether the cell is enabled or disabled.
 * @param isValid Whether the cell's value is valid.
 * @param isError Whether the cell's value is in error state.
 * @param secure Whether the cell should mask its input as a password.
 * @param colors The colors to be used for the cell.
 * @param focusRequester The [FocusRequester] to control the focus of the cell.
 * @param textStyle The [TextStyle] to be applied to the text in the cell.
 * @param interactionSource an optional hoisted [MutableInteractionSource] for observing and
 *   emitting [Interaction]s for this chip. You can use this to change the chip's appearance or
 *   preview the chip in different states. Note that if `null` is provided, interactions will still
 *   happen internally.
 */
@Composable
internal fun CodeInputCell(
    modifier: Modifier = Modifier,
    state: TextFieldState,
    enabled: Boolean,
    isValid: Boolean,
    isError: Boolean,
    secure: SecureInputSettings,
    colors: CellColors,
    focusRequester: FocusRequester,
    textStyle: TextStyle,
    interactionSource: MutableInteractionSource,
) {
    val focused by interactionSource.collectIsFocusedAsState()

    val textColor = colors.textColor(isValid, isError, interactionSource).value

    val mergedTextStyle = textStyle.merge(
        TextStyle(
            color = textColor,
            baselineShift = BaselineShift.None,
            textAlign = TextAlign.Center
        )
    )

    val borderThickness = if (enabled && (focused || isError || isValid)) 2.dp else 1.dp

    val containerColor = colors.containerColor(
        isValid = isValid,
        isError = isError,
        interactionSource = interactionSource
    ).value

    val borderColor = colors.indicatorColor(
        isValid = isValid,
        isError = isError,
        interactionSource = interactionSource
    ).value

    CompositionLocalProvider(LocalTextSelectionColors provides colors.selectionColors) {
        Box(
            modifier = Modifier
                .graphicsLayer {
                    alpha = if (enabled) 1f
                    else PersianState38
                }
                .width(48.dp)
                .height(52.dp)
                .border(
                    borderThickness,
                    borderColor,
                    PersianTheme.shapes.shape16
                )
                .background(
                    containerColor,
                    PersianTheme.shapes.shape16
                ),
            contentAlignment = Alignment.Center
        ) {
            when (secure) {
                SecureInputSettings.NotSecure -> {
                    BasicTextField(
                        modifier = modifier
                            .focusRequester(focusRequester),
                        state = state,
                        readOnly = false,
                        enabled = enabled,
                        lineLimits = TextFieldLineLimits.SingleLine,
                        inputTransformation = {
                            if (originalText.length == 1) revertAllChanges()
                        },
                        textStyle = mergedTextStyle,
                        cursorBrush = SolidColor(
                            colors.cursorColor(
                                isError = isError,
                                isValid = isValid
                            )
                        ),
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.NumberPassword
                        ),
                        interactionSource = interactionSource,
                        decorator = { innerTextField ->
                            Box(
                                modifier = Modifier
                                    .width(48.dp)
                                    .height(52.dp)
                                    .border(
                                        borderThickness,
                                        borderColor,
                                        PersianTheme.shapes.shape16
                                    )
                                    .background(
                                        containerColor,
                                        PersianTheme.shapes.shape16
                                    ),
                                contentAlignment = Alignment.Center
                            ) {
                                innerTextField()
                            }
                        }
                    )
                }

                is SecureInputSettings.Secure -> {
                    BasicSecureTextField(
                        modifier = modifier
                            .focusRequester(focusRequester),
                        state = state,
                        enabled = enabled,
                        textStyle = mergedTextStyle,
                        cursorBrush = SolidColor(
                            colors.cursorColor(
                                isError = isError,
                                isValid = isValid
                            )
                        ),
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.NumberPassword
                        ),
                        textObfuscationMode = if (secure.visible) TextObfuscationMode.Visible else TextObfuscationMode.RevealLastTyped,
                        textObfuscationCharacter = secure.textObfuscationChar,
                        interactionSource = interactionSource,
                        inputTransformation = {
                            if (originalText.length == 1) revertAllChanges()
                        },
                        decorator = { innerTextField ->
                            Box(
                                modifier = Modifier
                                    .width(48.dp)
                                    .height(52.dp)
                                    .border(
                                        borderThickness,
                                        borderColor,
                                        PersianTheme.shapes.shape16
                                    )
                                    .background(
                                        containerColor,
                                        PersianTheme.shapes.shape16
                                    ),
                                contentAlignment = Alignment.Center
                            ) {
                                innerTextField()
                            }
                        }
                    )
                }
            }
        }
    }
}