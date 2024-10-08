package io.github.madmaximuus.persian.codeInput.cell

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.interaction.Interaction
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.selection.LocalTextSelectionColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.codeInput.CellColors
import io.github.madmaximuus.persian.codeInput.CodeInputDefaults
import io.github.madmaximuus.persian.codeInput.FourDigitCodeInput
import io.github.madmaximuus.persian.codeInput.SixDigitCodeInput
import io.github.madmaximuus.persian.foundation.PersianTheme

/**
 * Create a cell that used by [SixDigitCodeInput] and [FourDigitCodeInput]
 *
 * @param modifier The [Modifier] to be applied to this composable.
 * @param value The current value of the cell.
 * @param onValueChange Callback invoked when the value of the cell changes.
 * @param enabled Whether the cell is enabled or disabled.
 * @param isValid Whether the cell's value is valid.
 * @param isError Whether the cell's value is in error state.
 * @param isPassword Whether the cell should mask its input as a password.
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
    value: String,
    onValueChange: (String) -> Unit,
    enabled: Boolean = true,
    isValid: Boolean = false,
    isError: Boolean = false,
    isPassword: Boolean = false,
    colors: CellColors = CodeInputDefaults.cellColors(),
    focusRequester: FocusRequester = FocusRequester(),
    textStyle: TextStyle = PersianTheme.typography.bodyLarge,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val focused by interactionSource.collectIsFocusedAsState()

    val textColor = colors.textColor(enabled, isValid, isError, interactionSource).value

    val mergedTextStyle = textStyle.merge(
        TextStyle(
            color = textColor,
            baselineShift = BaselineShift.None,
            textAlign = TextAlign.Center
        )
    )

    val borderThickness = if (enabled && (focused || isError || isValid)) 2.dp else 1.dp

    val containerColor = colors.containerColor(
        enabled = enabled,
        isValid = isValid,
        isError = isError,
        interactionSource = interactionSource
    ).value

    val borderColor = colors.indicatorColor(
        enabled = enabled,
        isValid = isValid,
        isError = isError,
        interactionSource = interactionSource
    ).value

    CompositionLocalProvider(LocalTextSelectionColors provides colors.selectionColors) {
        BasicTextField(
            modifier = modifier
                .focusRequester(focusRequester),
            value = value,
            onValueChange = onValueChange,
            readOnly = false,
            enabled = enabled,
            singleLine = true,
            minLines = 1,
            maxLines = 1,
            textStyle = mergedTextStyle,
            cursorBrush = SolidColor(
                colors.cursorColor(
                    isError = isError,
                    isValid = isValid
                ).value
            ),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.NumberPassword
            ),
            visualTransformation = if (isPassword) SecretTransformation() else VisualTransformation.None,
            interactionSource = interactionSource,
            decorationBox = { innerTextField ->
                Box(
                    modifier = Modifier.run {
                        width(48.dp)
                            .height(52.dp)
                            .border(
                                borderThickness,
                                borderColor,
                                PersianTheme.shapes.shape16
                            )
                            .background(
                                containerColor,
                                PersianTheme.shapes.shape16
                            )
                    },
                    contentAlignment = Alignment.Center
                ) {
                    innerTextField()
                }
            }
        )
    }
}