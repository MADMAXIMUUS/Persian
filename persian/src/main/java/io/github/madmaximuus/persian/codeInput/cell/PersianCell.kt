package io.github.madmaximuus.persian.codeInput.cell

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.selection.LocalTextSelectionColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
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
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.codeInput.CellColors
import io.github.madmaximuus.persian.codeInput.PersianCodeInputDefaults
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.shape

@Composable
internal fun PersianCodeInputCell(
    modifier: Modifier = Modifier,
    value: String,
    onValueChange: (String) -> Unit,
    enabled: Boolean = true,
    isValid: Boolean = false,
    isError: Boolean = false,
    colors: CellColors = PersianCodeInputDefaults.cellColors(),
    focusRequester: FocusRequester = FocusRequester(),
    textStyle: TextStyle = MaterialTheme.typography.bodyLarge,
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
            interactionSource = interactionSource,
            decorationBox = { innerTextField ->
                Box(
                    modifier = Modifier.run {
                        width(48.dp)
                            .height(52.dp)
                            .border(
                                borderThickness,
                                borderColor,
                                MaterialTheme.shape.shape16
                            )
                            .background(
                                containerColor,
                                MaterialTheme.shape.shape16
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

@Preview
@Composable
fun CellPreview() {
    PersianTheme {
        Surface {
            PersianCodeInputCell(
                modifier = Modifier.padding(10.dp),
                value = "1",
                onValueChange = {}
            )
        }
    }
}

@Preview(uiMode = UI_MODE_NIGHT_YES)
@Composable
fun CellDarkPreview() {
    PersianTheme {
        Surface {
            PersianCodeInputCell(
                modifier = Modifier.padding(10.dp),
                value = "0",
                onValueChange = {}
            )
        }
    }
}