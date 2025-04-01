package io.github.madmaximuus.persian.codeInput

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.text.BasicSecureTextField
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.input.TextFieldLineLimits
import androidx.compose.foundation.text.input.TextFieldState
import androidx.compose.foundation.text.input.TextObfuscationMode
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.input.KeyboardType
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
 * @param state the [TextFieldState] representing the state of code input.
 * @param enabled Whether the input field is enabled.
 * @param isError Whether the input field is in an error state.
 * @param isValid Whether the input field is in a valid state.
 * @param colors The color settings for the input cells.
 * @param secure The security settings for the input field.
 */
@Composable
fun FourDigitCodeInput(
    modifier: Modifier = Modifier,
    state: TextFieldState,
    enabled: Boolean = true,
    isError: Boolean = false,
    isValid: Boolean = false,
    colors: CellColors = CodeInputDefaults.cellColors(),
    secure: SecureInputSettings = SecureInputSettings.NotSecure,
) {
    val focusRequester = FocusRequester()
    var isFocused by remember { mutableStateOf(false) }
    Box(
        modifier = Modifier
            .widthIn(min = 190.dp, max = 250.dp)
            .then(modifier),
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            repeat(4) { index ->
                val char = state.text.toString().getOrNull(index)?.toString() ?: ""
                CodeInputCell(
                    modifier = Modifier
                        .clickable(enabled, role = Role.Button) {
                            focusRequester.requestFocus()
                        },
                    value = if (char.isNotEmpty() && secure is SecureInputSettings.Secure) secure.textObfuscationChar.toString() else char,
                    isValid = isValid,
                    enabled = enabled,
                    isError = isError,
                    isFocused = index == state.text.length && isFocused,
                    secure = secure,
                    colors = colors,
                    textStyle = PersianTheme.typography.bodyLarge,
                )
            }
        }

        LaunchedEffect(state.text.toString()) {
            val filtered = state.text.toString().filter { it.isDigit() }.take(4)
            if (state.text.toString() != filtered) {
                state.edit { replace(0, state.text.length, filtered) }
            }
        }

        when (secure) {
            SecureInputSettings.NotSecure -> {
                BasicTextField(
                    modifier = modifier
                        .focusRequester(focusRequester)
                        .onFocusChanged {
                            isFocused = it.isFocused
                        }
                        .size(0.dp),
                    state = state,
                    readOnly = false,
                    enabled = enabled,
                    lineLimits = TextFieldLineLimits.SingleLine,
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.NumberPassword),
                )
            }

            is SecureInputSettings.Secure -> {
                BasicSecureTextField(
                    modifier = modifier
                        .focusRequester(focusRequester)
                        .onFocusChanged {
                            isFocused = it.isFocused
                        }
                        .size(0.dp),
                    state = state,
                    enabled = enabled,
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.NumberPassword),
                    textObfuscationMode = if (secure.visible) TextObfuscationMode.Visible else TextObfuscationMode.RevealLastTyped,
                    textObfuscationCharacter = secure.textObfuscationChar,
                )
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
 * @param state the [TextFieldState] representing the state of code input.
 * @param enabled Whether the input field is enabled.
 * @param isError Whether the input field is in an error state.
 * @param isValid Whether the input field is in a valid state.
 * @param colors The color settings for the input cells.
 * @param secure The security settings for the input field.
 */
@Composable
fun SixDigitCodeInput(
    modifier: Modifier = Modifier,
    state: TextFieldState,
    enabled: Boolean = true,
    isError: Boolean = false,
    isValid: Boolean = false,
    colors: CellColors = CodeInputDefaults.cellColors(),
    secure: SecureInputSettings = SecureInputSettings.NotSecure,
) {
    val focusRequester = FocusRequester()
    var isFocused by remember { mutableStateOf(false) }
    Box(
        modifier = Modifier
            .widthIn(min = 310.dp, max = 360.dp)
            .then(modifier),
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            repeat(6) { index ->
                val char = state.text.toString().getOrNull(index)?.toString() ?: ""
                CodeInputCell(
                    modifier = Modifier
                        .clickable(enabled, role = Role.Button) {
                            focusRequester.requestFocus()
                        },
                    value = if (char.isNotEmpty() && secure is SecureInputSettings.Secure) secure.textObfuscationChar.toString() else char,
                    isValid = isValid,
                    enabled = enabled,
                    isError = isError,
                    isFocused = index == state.text.length && isFocused,
                    secure = secure,
                    colors = colors,
                    textStyle = PersianTheme.typography.bodyLarge,
                )
            }
        }

        LaunchedEffect(state.text.toString()) {
            val filtered = state.text.toString().filter { it.isDigit() }.take(6)
            if (state.text.toString() != filtered) {
                state.edit { replace(0, state.text.length, filtered) }
            }
        }

        when (secure) {
            SecureInputSettings.NotSecure -> {
                BasicTextField(
                    modifier = modifier
                        .focusRequester(focusRequester)
                        .onFocusChanged {
                            isFocused = it.isFocused
                        }
                        .size(0.dp),
                    state = state,
                    readOnly = false,
                    enabled = enabled,
                    lineLimits = TextFieldLineLimits.SingleLine,
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.NumberPassword),
                )
            }

            is SecureInputSettings.Secure -> {
                BasicSecureTextField(
                    modifier = modifier
                        .focusRequester(focusRequester)
                        .onFocusChanged {
                            isFocused = it.isFocused
                        }
                        .size(0.dp),
                    state = state,
                    enabled = enabled,
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.NumberPassword),
                    textObfuscationMode = if (secure.visible) TextObfuscationMode.Visible else TextObfuscationMode.RevealLastTyped,
                    textObfuscationCharacter = secure.textObfuscationChar,
                )
            }
        }
    }
}