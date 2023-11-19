package io.github.madmaximuus.persian.codeInput.cell

import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import io.github.madmaximuus.persian.codeInput.CellColors
import io.github.madmaximuus.persian.foundation.PersianContentStateDisabled
import io.github.madmaximuus.persian.foundation.PersianStatesDisabled
import io.github.madmaximuus.persian.foundation.extendedColorScheme

@Deprecated("Replace with PersianCodeInputDefaults")
object PersianCellColors {

    @Composable
    fun primary(
        //Text Colors
        focusedTextColor: Color = MaterialTheme.extendedColorScheme.onSurface,
        unfocusedTextColor: Color = MaterialTheme.extendedColorScheme.onSurface,
        disabledTextColor: Color = MaterialTheme.extendedColorScheme.onSurface
            .copy(alpha = PersianContentStateDisabled),
        errorTextColor: Color = MaterialTheme.extendedColorScheme.error,
        successTextColor: Color = MaterialTheme.extendedColorScheme.correct,

        //Container Colors
        focusedContainerColor: Color = MaterialTheme.extendedColorScheme.surface,
        unfocusedContainerColor: Color = MaterialTheme.extendedColorScheme.surface,
        disabledContainerColor: Color = MaterialTheme.extendedColorScheme.surface,
        errorContainerColor: Color = MaterialTheme.extendedColorScheme.errorContainer
            .copy(alpha = PersianStatesDisabled),
        successContainerColor: Color = MaterialTheme.extendedColorScheme.correctContainer
            .copy(alpha = PersianStatesDisabled),

        //Cursor Colors
        cursorColor: Color = MaterialTheme.extendedColorScheme.primary,
        errorCursorColor: Color = MaterialTheme.extendedColorScheme.error,
        successCursorColor: Color = MaterialTheme.extendedColorScheme.correct,
        textSelectionColors: TextSelectionColors = TextSelectionColors(
            handleColor = MaterialTheme.extendedColorScheme.primary,
            backgroundColor = MaterialTheme.extendedColorScheme.primary.copy(alpha = 0.4f)
        ),

        //Indicator Colors
        focusedIndicatorColor: Color = MaterialTheme.extendedColorScheme.primary,
        unfocusedIndicatorColor: Color = MaterialTheme.extendedColorScheme.outline,
        disabledIndicatorColor: Color = MaterialTheme.extendedColorScheme.onSurface
            .copy(alpha = PersianStatesDisabled),
        errorIndicatorColor: Color = MaterialTheme.extendedColorScheme.error,
        successIndicatorColor: Color = MaterialTheme.extendedColorScheme.correct,
    ): CellColors =
        CellColors(
            //Text Colors
            focusedTextColor = focusedTextColor,
            unfocusedTextColor = unfocusedTextColor,
            disabledTextColor = disabledTextColor,
            errorTextColor = errorTextColor,
            successTextColor = successTextColor,

            //Container Colors
            focusedContainerColor = focusedContainerColor,
            unfocusedContainerColor = unfocusedContainerColor,
            disabledContainerColor = disabledContainerColor,
            errorContainerColor = errorContainerColor,
            successContainerColor = successContainerColor,

            //Cursor Colors
            cursorColor = cursorColor,
            errorCursorColor = errorCursorColor,
            successCursorColor = successCursorColor,
            textSelectionColors = textSelectionColors,

            //Indicator Colors
            focusedIndicatorColor = focusedIndicatorColor,
            unfocusedIndicatorColor = unfocusedIndicatorColor,
            disabledIndicatorColor = disabledIndicatorColor,
            errorIndicatorColor = errorIndicatorColor,
            successIndicatorColor = successIndicatorColor,
        )
}