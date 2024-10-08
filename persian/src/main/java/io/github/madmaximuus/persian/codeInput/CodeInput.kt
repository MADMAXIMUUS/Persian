package io.github.madmaximuus.persian.codeInput

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.widthIn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.input.key.key
import androidx.compose.ui.input.key.onKeyEvent
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.codeInput.cell.CodeInputCell

/**
 * A four-digit code input field.
 *
 * This input typically used for entering a four-digit verification code.
 *
 * @param modifier The [Modifier] to be applied to this composable.
 * @param values A list of strings representing the current values of the four cells.
 * @param enabled Whether the input cells are enabled or disabled.
 * @param isError Whether the input cells are in an error state.
 * @param isValid Whether the input cells are in a valid state.
 * @param isPassword Whether the input cells should mask their input as a password.
 * @param onValueChange Callback invoked when the value of any cell changes. The callback receives
 * the new value and the index of the cell that changed.
 */
@Composable
fun FourDigitCodeInput(
    modifier: Modifier = Modifier,
    values: List<String>,
    enabled: Boolean = true,
    isError: Boolean = false,
    isValid: Boolean = false,
    isPassword: Boolean = false,
    onValueChange: (value: String, index: Int) -> Unit
) {
    LaunchedEffect(Unit) {
        if (values.size != 4) {
            throw IllegalArgumentException("Code input values must have 4 items")
        }
    }

    val focusRequesters = listOf(
        FocusRequester(),
        FocusRequester(),
        FocusRequester(),
        FocusRequester()
    )

    Row(
        modifier = Modifier
            .widthIn(min = 190.dp, max = 250.dp)
            .then(modifier),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        repeat(4) { index ->
            CodeInputCell(
                modifier = Modifier
                    .onKeyEvent {
                        if (it.key == Key.Backspace && values[index].isEmpty()) {
                            if (index > 0) {
                                focusRequesters[index - 1].requestFocus()
                                return@onKeyEvent true
                            }
                            return@onKeyEvent false
                        }
                        return@onKeyEvent false
                    },
                value = values[index],
                focusRequester = focusRequesters[index],
                isValid = isValid,
                enabled = enabled,
                isError = isError,
                isPassword = isPassword,
                onValueChange = { value ->
                    onValueChange(value, index)
                    nextFocus(index, value, focusRequesters)
                }
            )
        }
    }
}

/**
 * A six-digit code input field.
 *
 * This input typically used for entering a six-digit verification code.
 *
 * @param modifier The [Modifier] to be applied to this composable.
 * @param values A list of strings representing the current values of the four cells.
 * @param enabled Whether the input cells are enabled or disabled.
 * @param isError Whether the input cells are in an error state.
 * @param isValid Whether the input cells are in a valid state.
 * @param isPassword Whether the input cells should mask their input as a password.
 * @param onValueChange Callback invoked when the value of any cell changes. The callback receives
 * the new value and the index of the cell that changed.
 */
@Composable
fun SixDigitCodeInput(
    modifier: Modifier = Modifier,
    values: List<String>,
    enabled: Boolean = true,
    isError: Boolean = false,
    isValid: Boolean = false,
    isPassword: Boolean = false,
    onValueChange: (value: String, index: Int) -> Unit
) {
    LaunchedEffect(Unit) {
        if (values.size != 6) {
            throw IllegalArgumentException("Code input values must have 6 items")
        }
    }

    val focusRequesters = listOf(
        FocusRequester(),
        FocusRequester(),
        FocusRequester(),
        FocusRequester(),
        FocusRequester(),
        FocusRequester()
    )

    Row(
        modifier = Modifier
            .widthIn(min = 310.dp, max = 360.dp)
            .then(modifier),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        repeat(6) { index ->
            CodeInputCell(
                modifier = Modifier
                    .onKeyEvent {
                        if (it.key == Key.Backspace && values[index].isEmpty()) {
                            if (index > 0) {
                                focusRequesters[index - 1].requestFocus()
                                return@onKeyEvent true
                            }
                            return@onKeyEvent false
                        }
                        return@onKeyEvent false
                    },
                value = values[index],
                focusRequester = focusRequesters[index],
                isValid = isValid,
                enabled = enabled,
                isError = isError,
                isPassword = isPassword,
                onValueChange = { value ->
                    onValueChange(value, index)
                    nextFocus(index, value, focusRequesters)
                }
            )
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