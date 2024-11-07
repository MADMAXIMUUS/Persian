package io.github.madmaximuus.persian.codeInput

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.text.input.TextFieldState
import androidx.compose.foundation.text.input.clearText
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.input.key.key
import androidx.compose.ui.input.key.onKeyEvent
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.codeInput.cell.CodeInputCell
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.internal.SecureInputSettings

/**
 * A four-digit code input is useful for enhancing security by requiring users to enter a specific
 * numerical sequence, providing an additional layer of protection for accessing sensitive information
 * or systems. It offers a straightforward and widely recognized method for authentication, making it
 * an effective tool for securing accounts.
 *
 * @param modifier The modifier to be applied to the input field.
 * @param values The list of [TextFieldState] representing the state of each digit input cell.
 * This list must contain exactly four items.
 * @param enabled Whether the input field is enabled.
 * @param isError Whether the input field is in an error state.
 * @param isValid Whether the input field is in a valid state.
 * @param colors The color settings for the input cells.
 * @param secure The security settings for the input field.
 */
@Composable
fun FourDigitCodeInput(
    modifier: Modifier = Modifier,
    values: List<TextFieldState>,
    enabled: Boolean = true,
    isError: Boolean = false,
    isValid: Boolean = false,
    colors: CellColors = CodeInputDefaults.cellColors(),
    secure: SecureInputSettings = SecureInputSettings.NotSecure,
) {
    LaunchedEffect(Unit) {
        if (values.size != 4) {
            throw IllegalArgumentException("Code input values must have 4 items")
        }
    }

    val focusRequesters = List(4) { FocusRequester() }

    Row(
        modifier = Modifier
            .widthIn(min = 190.dp, max = 250.dp)
            .then(modifier),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        values.forEachIndexed { index, textFieldState ->
            CodeInputCell(
                modifier = Modifier
                    .onKeyEvent {
                        if (it.key == Key.Backspace && textFieldState.text.isEmpty()) {
                            if (index > 0) {
                                focusRequesters[index - 1].requestFocus()
                                return@onKeyEvent true
                            }
                            return@onKeyEvent false
                        } else if (it.key == Key.Backspace && textFieldState.text.isNotEmpty()) {
                            textFieldState.clearText()
                            return@onKeyEvent true
                        }
                        return@onKeyEvent false
                    },
                state = textFieldState,
                focusRequester = focusRequesters[index],
                isValid = isValid,
                enabled = enabled,
                isError = isError,
                secure = secure,
                colors = colors,
                textStyle = PersianTheme.typography.bodyLarge,
                interactionSource = remember { MutableInteractionSource() }
            )
            LaunchedEffect(textFieldState.text.isNotEmpty()) {
                nextFocus(index, textFieldState.text.toString(), focusRequesters)
            }
        }
    }
}

/**
 * A six-digit code input is useful for enhancing security by requiring users to enter a specific
 * numerical sequence, providing a robust layer of protection for accessing sensitive information
 * or systems. It offers a straightforward and widely recognized method for authentication, making
 * it an effective tool for securing accounts.
 *
 * @param modifier The modifier to be applied to the input field.
 * @param values The list of [TextFieldState] representing the state of each digit input cell.
 * This list must contain exactly six items.
 * @param enabled Whether the input field is enabled.
 * @param isError Whether the input field is in an error state
 * @param isValid Whether the input field is in a valid state.
 * @param colors The color settings for the input cells.
 * @param secure The security settings for the input field.

 */
@Composable
fun SixDigitCodeInput(
    modifier: Modifier = Modifier,
    values: List<TextFieldState>,
    enabled: Boolean = true,
    isError: Boolean = false,
    isValid: Boolean = false,
    colors: CellColors = CodeInputDefaults.cellColors(),
    secure: SecureInputSettings = SecureInputSettings.NotSecure,
) {
    LaunchedEffect(Unit) {
        if (values.size != 6) {
            throw IllegalArgumentException("Code input values must have 6 items")
        }
    }

    val focusRequesters = List(6) { FocusRequester() }

    Row(
        modifier = Modifier
            .widthIn(min = 310.dp, max = 360.dp)
            .then(modifier),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        values.forEachIndexed { index, textFieldState ->
            CodeInputCell(
                modifier = Modifier
                    .onKeyEvent {
                        if (it.key == Key.Backspace && textFieldState.text.isEmpty()) {
                            if (index > 0) {
                                focusRequesters[index - 1].requestFocus()
                                return@onKeyEvent true
                            }
                            return@onKeyEvent false
                        } else if (it.key == Key.Backspace && textFieldState.text.isNotEmpty()) {
                            textFieldState.clearText()
                            return@onKeyEvent true
                        }
                        return@onKeyEvent false
                    },
                state = textFieldState,
                focusRequester = focusRequesters[index],
                isValid = isValid,
                enabled = enabled,
                isError = isError,
                secure = secure,
                colors = colors,
                textStyle = PersianTheme.typography.bodyLarge,
                interactionSource = remember { MutableInteractionSource() }
            )
            LaunchedEffect(textFieldState.text.isNotEmpty()) {
                nextFocus(index, textFieldState.text.toString(), focusRequesters)
            }
        }
    }
}

/**
 * Moves the focus to the next input cell if the current cell's value is of length 1.
 *
 * This function is used to automatically shift the focus to the next input cell when the user
 * enters a single character in the current cell.
 *
 * @param index The index of the current input cell.
 * @param value The current value of the input cell.
 * @param focusRequesters A list of [FocusRequester] objects corresponding to each input cell.
 */
private fun nextFocus(
    index: Int,
    value: String,
    focusRequesters: List<FocusRequester>
) {
    if (value.length == 1 && index + 1 < focusRequesters.size) {
        focusRequesters[index + 1].requestFocus()
    }
}