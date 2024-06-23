package io.github.madmaximuus.persian.codeInput

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.input.key.key
import androidx.compose.ui.input.key.onKeyEvent
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.codeInput.cell.CodeInputCell
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.surface.Surface

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

private fun nextFocus(
    index: Int,
    value: String,
    focusRequesters: List<FocusRequester>
) {
    if (value.length == 1 && index + 1 < focusRequesters.size) {
        focusRequesters[index + 1].requestFocus()
    }
}

@Preview
@Preview(uiMode = UI_MODE_NIGHT_YES)
@Composable
private fun CodeInputPreview() {
    PersianTheme {
        Surface(
            modifier = Modifier.fillMaxSize()
        ) {
            Column(
                modifier = Modifier
                    .padding(10.dp)
            ) {
                FourDigitCodeInput(
                    modifier = Modifier.fillMaxWidth(),
                    values = listOf(
                        "1",
                        "2",
                        "3",
                        "4"
                    ),
                    onValueChange = { _, _ ->

                    }
                )
                Spacer(modifier = Modifier.height(PersianTheme.spacing.size4))
                SixDigitCodeInput(
                    modifier = Modifier.fillMaxWidth(),
                    values = listOf(
                        "1",
                        "2",
                        "3",
                        "4",
                        "5",
                        "6"
                    ),
                    onValueChange = { _, _ ->

                    }
                )
            }

        }
    }
}