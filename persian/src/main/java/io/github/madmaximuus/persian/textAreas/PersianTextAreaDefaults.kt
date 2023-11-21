package io.github.madmaximuus.persian.textAreas

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
import androidx.compose.ui.graphics.painter.Painter
import io.github.madmaximuus.persian.foundation.PersianContentStateDisabled
import io.github.madmaximuus.persian.foundation.PersianStatesDisabled
import io.github.madmaximuus.persian.foundation.extendedColorScheme
import io.github.madmaximuus.persian.foundation.icons

@Immutable
class TextAreaColors internal constructor(

    //State Icon
    private val errorStateIcon: Painter,
    private val successStateIcon: Painter,

    //State Icon Colors
    private val errorStateIconColor: Color,
    private val successStateIconColor: Color,

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

    //Leading Icon Colors
    private val focusedLeadingIconColor: Color,
    private val unfocusedLeadingIconColor: Color,
    private val disabledLeadingIconColor: Color,
    private val errorLeadingIconColor: Color,
    private val successLeadingIconColor: Color,

    //Placeholder Colors
    private val focusedPlaceholderColor: Color,
    private val unfocusedPlaceholderColor: Color,
    private val disabledPlaceholderColor: Color,
    private val errorPlaceholderColor: Color,
) {
    @Composable
    internal fun stateIcon(
        enabled: Boolean,
        isSuccess: Boolean,
        isError: Boolean
    ): State<Painter?> {

        val targetValue = when {
            !enabled -> null
            isError -> errorStateIcon
            isSuccess -> successStateIcon

            else -> null
        }
        return rememberUpdatedState(targetValue)
    }

    @Composable
    internal fun stateIconColor(
        enabled: Boolean,
        isSuccess: Boolean,
        isError: Boolean
    ): State<Color> {

        val targetValue = when {
            !enabled -> Color.Transparent
            isError -> errorStateIconColor
            isSuccess -> successStateIconColor

            else -> Color.Transparent
        }
        return rememberUpdatedState(targetValue)
    }

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

    @Composable
    internal fun leadingIconColor(
        enabled: Boolean,
        isSuccess: Boolean,
        isError: Boolean,
        interactionSource: InteractionSource
    ): State<Color> {
        val focused by interactionSource.collectIsFocusedAsState()

        return rememberUpdatedState(
            when {
                !enabled -> disabledLeadingIconColor
                isError -> errorLeadingIconColor
                isSuccess -> successLeadingIconColor
                focused -> focusedLeadingIconColor
                else -> unfocusedLeadingIconColor
            }
        )
    }

    @Composable
    internal fun placeholderColor(
        enabled: Boolean,
        isError: Boolean,
        interactionSource: InteractionSource
    ): State<Color> {
        val focused by interactionSource.collectIsFocusedAsState()

        val targetValue = when {
            !enabled -> disabledPlaceholderColor
            isError -> errorPlaceholderColor
            focused -> focusedPlaceholderColor
            else -> unfocusedPlaceholderColor
        }
        return rememberUpdatedState(targetValue)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is TextAreaColors) return false

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
        if (focusedLeadingIconColor != other.focusedLeadingIconColor) return false
        if (unfocusedLeadingIconColor != other.unfocusedLeadingIconColor) return false
        if (disabledLeadingIconColor != other.disabledLeadingIconColor) return false
        if (errorLeadingIconColor != other.errorLeadingIconColor) return false
        if (focusedPlaceholderColor != other.focusedPlaceholderColor) return false
        if (unfocusedPlaceholderColor != other.unfocusedPlaceholderColor) return false
        if (disabledPlaceholderColor != other.disabledPlaceholderColor) return false
        if (errorPlaceholderColor != other.errorPlaceholderColor) return false

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
        result = 31 * result + focusedLeadingIconColor.hashCode()
        result = 31 * result + unfocusedLeadingIconColor.hashCode()
        result = 31 * result + disabledLeadingIconColor.hashCode()
        result = 31 * result + errorLeadingIconColor.hashCode()
        result = 31 * result + focusedPlaceholderColor.hashCode()
        result = 31 * result + unfocusedPlaceholderColor.hashCode()
        result = 31 * result + disabledPlaceholderColor.hashCode()
        return result
    }

    private companion object {
        const val ANIMATION_DURATION = 150
    }
}

object PersianTextAreaDefaults {

    @Composable
    fun colors(
        //State Icon
        errorStateIcon: Painter = MaterialTheme.icons.errorCircleRounded,
        successStateIcon: Painter = MaterialTheme.icons.checkCircle,

        //State Icon Colors
        errorStateIconColor: Color = MaterialTheme.extendedColorScheme.error,
        successStateIconColor: Color = MaterialTheme.extendedColorScheme.correct,

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
            .copy(alpha = PersianContentStateDisabled),
        successContainerColor: Color = MaterialTheme.extendedColorScheme.correctContainer
            .copy(alpha = PersianContentStateDisabled),

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

        //Leading Icon Colors
        focusedLeadingIconColor: Color = MaterialTheme.extendedColorScheme.onSurfaceVariant,
        unfocusedLeadingIconColor: Color = MaterialTheme.extendedColorScheme.onSurfaceVariant,
        disabledLeadingIconColor: Color = MaterialTheme.extendedColorScheme.onSurfaceVariant
            .copy(alpha = PersianContentStateDisabled),
        errorLeadingIconColor: Color = MaterialTheme.extendedColorScheme.onSurfaceVariant,
        successLeadingIconColor: Color = MaterialTheme.extendedColorScheme.onSurfaceVariant,

        //Placeholder Colors
        focusedPlaceholderColor: Color = MaterialTheme.extendedColorScheme.onSurfaceVariant,
        unfocusedPlaceholderColor: Color = MaterialTheme.extendedColorScheme.onSurfaceVariant,
        disabledPlaceholderColor: Color = MaterialTheme.extendedColorScheme.onSurface
            .copy(alpha = PersianContentStateDisabled),
        errorPlaceholderColor: Color = MaterialTheme.extendedColorScheme.error,
    ): TextAreaColors =
        TextAreaColors(
            //State Icon
            errorStateIcon = errorStateIcon,
            successStateIcon = successStateIcon,

            //State Icon Colors
            errorStateIconColor = errorStateIconColor,
            successStateIconColor = successStateIconColor,

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

            //Leading Icon Colors
            focusedLeadingIconColor = focusedLeadingIconColor,
            unfocusedLeadingIconColor = unfocusedLeadingIconColor,
            disabledLeadingIconColor = disabledLeadingIconColor,
            errorLeadingIconColor = errorLeadingIconColor,
            successLeadingIconColor = successLeadingIconColor,

            //Placeholder Colors
            focusedPlaceholderColor = focusedPlaceholderColor,
            unfocusedPlaceholderColor = unfocusedPlaceholderColor,
            disabledPlaceholderColor = disabledPlaceholderColor,
            errorPlaceholderColor = errorPlaceholderColor
        )
}