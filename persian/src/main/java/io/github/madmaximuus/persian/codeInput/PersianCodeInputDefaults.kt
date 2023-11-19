package io.github.madmaximuus.persian.codeInput

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.Color
import io.github.madmaximuus.persian.foundation.PersianContentStateDisabled
import io.github.madmaximuus.persian.foundation.PersianStatesDisabled
import io.github.madmaximuus.persian.foundation.extendedColorScheme

object PersianCodeInputDefaults {

    @Composable
    fun cellColors(
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

@Immutable
class CellColors(

    //Text Colors
    private val focusedTextColor: Color,
    private val unfocusedTextColor: Color,
    private val disabledTextColor: Color,
    private val errorTextColor: Color,
    private val successTextColor: Color,

    //Container Colors
    private val focusedContainerColor: Color,
    private val unfocusedContainerColor: Color,
    private val disabledContainerColor: Color,
    private val errorContainerColor: Color,
    private val successContainerColor: Color,

    //Cursor Colors
    private val cursorColor: Color,
    private val errorCursorColor: Color,
    private val successCursorColor: Color,
    private val textSelectionColors: TextSelectionColors,

    //Indicator Colors
    private val focusedIndicatorColor: Color,
    private val unfocusedIndicatorColor: Color,
    private val disabledIndicatorColor: Color,
    private val errorIndicatorColor: Color,
    private val successIndicatorColor: Color,
) {
    @Composable
    internal fun textColor(
        enabled: Boolean,
        isSuccess: Boolean,
        isError: Boolean,
        interactionSource: InteractionSource
    ): State<Color> {
        val focused by interactionSource.collectIsFocusedAsState()

        val targetValue = when {
            !enabled -> disabledTextColor
            isError -> errorTextColor
            isSuccess -> successTextColor
            focused -> focusedTextColor

            else -> unfocusedTextColor
        }
        return rememberUpdatedState(targetValue)
    }

    @Composable
    internal fun containerColor(
        enabled: Boolean,
        isSuccess: Boolean,
        isError: Boolean,
        interactionSource: InteractionSource
    ): State<Color> {
        val focused by interactionSource.collectIsFocusedAsState()

        val targetValue = when {
            !enabled -> disabledContainerColor
            isError -> errorContainerColor
            isSuccess -> successContainerColor
            focused -> focusedContainerColor
            else -> unfocusedContainerColor
        }
        return animateColorAsState(
            targetValue, tween(durationMillis = ANIMATION_DURATION),
            label = "Container Color Animation"
        )
    }

    @Composable
    internal fun cursorColor(isError: Boolean, isSuccess: Boolean): State<Color> {
        val targetValue = when {
            isError -> errorCursorColor
            isSuccess -> successCursorColor
            else -> cursorColor
        }
        return rememberUpdatedState(targetValue)
    }

    internal val selectionColors: TextSelectionColors
        @Composable get() = textSelectionColors

    @Composable
    internal fun indicatorColor(
        enabled: Boolean,
        isSuccess: Boolean,
        isError: Boolean,
        interactionSource: InteractionSource
    ): State<Color> {
        val focused by interactionSource.collectIsFocusedAsState()

        val targetValue = when {
            !enabled -> disabledIndicatorColor
            isError -> errorIndicatorColor
            isSuccess -> successIndicatorColor
            focused -> focusedIndicatorColor
            else -> unfocusedIndicatorColor
        }
        return if (enabled) {
            animateColorAsState(
                targetValue, tween(durationMillis = ANIMATION_DURATION),
                label = "Indicator Color Animation"
            )
        } else {
            rememberUpdatedState(targetValue)
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is CellColors) return false

        if (focusedTextColor != other.focusedTextColor) return false
        if (unfocusedTextColor != other.unfocusedTextColor) return false
        if (disabledTextColor != other.disabledTextColor) return false
        if (errorTextColor != other.errorTextColor) return false
        if (focusedContainerColor != other.focusedContainerColor) return false
        if (unfocusedContainerColor != other.unfocusedContainerColor) return false
        if (disabledContainerColor != other.disabledContainerColor) return false
        if (errorContainerColor != other.errorContainerColor) return false
        if (cursorColor != other.cursorColor) return false
        if (errorCursorColor != other.errorCursorColor) return false
        if (textSelectionColors != other.textSelectionColors) return false
        if (focusedIndicatorColor != other.focusedIndicatorColor) return false
        if (unfocusedIndicatorColor != other.unfocusedIndicatorColor) return false
        if (disabledIndicatorColor != other.disabledIndicatorColor) return false
        if (errorIndicatorColor != other.errorIndicatorColor) return false

        return true
    }

    override fun hashCode(): Int {
        var result = focusedTextColor.hashCode()
        result = 31 * result + unfocusedTextColor.hashCode()
        result = 31 * result + disabledTextColor.hashCode()
        result = 31 * result + errorTextColor.hashCode()
        result = 31 * result + focusedContainerColor.hashCode()
        result = 31 * result + unfocusedContainerColor.hashCode()
        result = 31 * result + disabledContainerColor.hashCode()
        result = 31 * result + errorContainerColor.hashCode()
        result = 31 * result + cursorColor.hashCode()
        result = 31 * result + errorCursorColor.hashCode()
        result = 31 * result + textSelectionColors.hashCode()
        result = 31 * result + focusedIndicatorColor.hashCode()
        result = 31 * result + unfocusedIndicatorColor.hashCode()
        result = 31 * result + disabledIndicatorColor.hashCode()
        result = 31 * result + errorIndicatorColor.hashCode()
        return result
    }

    private companion object {
        const val ANIMATION_DURATION = 150
    }
}