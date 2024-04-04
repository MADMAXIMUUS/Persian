package io.github.madmaximuus.persian.search

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
import io.github.madmaximuus.persian.foundation.extendedColorScheme
import io.github.madmaximuus.persian.foundation.state12
import io.github.madmaximuus.persian.foundation.state38

object PersianSearchDefaults {

    @Composable
    fun colors(
        //Text Color
        unfocusedTextColor: Color = MaterialTheme.extendedColorScheme.onSurface,
        focusedTextColor: Color = MaterialTheme.extendedColorScheme.onSurface,
        disabledTextColor: Color = MaterialTheme.extendedColorScheme.onSurface.state38,

        //Container Color
        unfocusedBackgroundColor: Color = MaterialTheme.extendedColorScheme.surfaceVariant,
        focusedBackgroundColor: Color = MaterialTheme.extendedColorScheme.surfaceVariant,
        disabledBackgroundColor: Color = MaterialTheme.extendedColorScheme.onSurface.state12,

        //Cursor Color
        cursorColor: Color = MaterialTheme.extendedColorScheme.primary,
        textSelectionColors: TextSelectionColors = TextSelectionColors(
            handleColor = MaterialTheme.extendedColorScheme.primary,
            backgroundColor = MaterialTheme.extendedColorScheme.primary.copy(alpha = 0.4f)
        ),

        //Placeholder Color
        unfocusedPlaceholderColor: Color = MaterialTheme.extendedColorScheme.onSurfaceVariant,
        focusedPlaceholderColor: Color = MaterialTheme.extendedColorScheme.onSurfaceVariant,
        disabledPlaceholderColor: Color = MaterialTheme.extendedColorScheme.onSurface.state38,

        //Leading Icon Color
        unfocusedLeadingIconColor: Color = MaterialTheme.extendedColorScheme.onSurfaceVariant,
        focusedLeadingIconColor: Color = MaterialTheme.extendedColorScheme.onSurfaceVariant,
        disabledLeadingIconColor: Color = MaterialTheme.extendedColorScheme.onSurface.state38,

        //Clear Icon Color
        unfocusedClearIconColor: Color = MaterialTheme.extendedColorScheme.onSurfaceVariant,
        focusedClearIconColor: Color = MaterialTheme.extendedColorScheme.onSurfaceVariant,
        disabledClearIconColor: Color = MaterialTheme.extendedColorScheme.onSurface.state38,
    ): SearchColors = SearchColors(
        //Text Color
        unfocusedTextColor = unfocusedTextColor,
        focusedTextColor = focusedTextColor,
        disabledTextColor = disabledTextColor,

        //Container Color
        unfocusedBackgroundColor = unfocusedBackgroundColor,
        focusedBackgroundColor = focusedBackgroundColor,
        disabledBackgroundColor = disabledBackgroundColor,

        //Cursor Color
        cursorColor = cursorColor,
        textSelectionColors = textSelectionColors,

        //Placeholder Color
        unfocusedPlaceholderColor = unfocusedPlaceholderColor,
        focusedPlaceholderColor = focusedPlaceholderColor,
        disabledPlaceholderColor = disabledPlaceholderColor,

        //Leading Icon Color
        unfocusedLeadingIconColor = unfocusedLeadingIconColor,
        focusedLeadingIconColor = focusedLeadingIconColor,
        disabledLeadingIconColor = disabledLeadingIconColor,

        //Clear Icon Color
        unfocusedClearIconColor = unfocusedClearIconColor,
        focusedClearIconColor = focusedClearIconColor,
        disabledClearIconColor = disabledClearIconColor
    )

}

@Immutable
class SearchColors internal constructor(
    //Text Color
    private val unfocusedTextColor: Color,
    private val focusedTextColor: Color,
    private val disabledTextColor: Color,

    //Container Color
    private val unfocusedBackgroundColor: Color,
    private val focusedBackgroundColor: Color,
    private val disabledBackgroundColor: Color,

    //Cursor Color
    private val cursorColor: Color,
    private val textSelectionColors: TextSelectionColors,

    //Placeholder Color
    private val unfocusedPlaceholderColor: Color,
    private val focusedPlaceholderColor: Color,
    private val disabledPlaceholderColor: Color,

    //Leading Icon Color
    private val unfocusedLeadingIconColor: Color,
    private val focusedLeadingIconColor: Color,
    private val disabledLeadingIconColor: Color,

    //Clear Icon Color
    private val unfocusedClearIconColor: Color,
    private val focusedClearIconColor: Color,
    private val disabledClearIconColor: Color
) {

    @Composable
    internal fun textColor(
        enabled: Boolean,
        interactionSource: InteractionSource
    ): State<Color> {
        val focused by interactionSource.collectIsFocusedAsState()

        val targetValue = when {
            !enabled -> disabledTextColor
            focused -> focusedTextColor

            else -> unfocusedTextColor
        }
        return rememberUpdatedState(targetValue)
    }

    @Composable
    internal fun containerColor(
        enabled: Boolean,
        interactionSource: InteractionSource
    ): State<Color> {
        val focused by interactionSource.collectIsFocusedAsState()

        val targetValue = when {
            !enabled -> disabledBackgroundColor
            focused -> focusedBackgroundColor
            else -> unfocusedBackgroundColor
        }
        return rememberUpdatedState(targetValue)
    }

    @Composable
    internal fun cursorColor(): State<Color> = rememberUpdatedState(cursorColor)

    internal val selectionColors: TextSelectionColors
        @Composable get() = textSelectionColors

    @Composable
    internal fun leadingIconColor(
        enabled: Boolean,
        interactionSource: InteractionSource
    ): State<Color> {
        val focused by interactionSource.collectIsFocusedAsState()

        return rememberUpdatedState(
            when {
                !enabled -> disabledLeadingIconColor
                focused -> focusedLeadingIconColor
                else -> unfocusedLeadingIconColor
            }
        )
    }

    @Composable
    internal fun clearIconColor(
        enabled: Boolean,
        interactionSource: InteractionSource
    ): State<Color> {
        val focused by interactionSource.collectIsFocusedAsState()

        return rememberUpdatedState(
            when {
                !enabled -> disabledClearIconColor
                focused -> focusedClearIconColor
                else -> unfocusedClearIconColor
            }
        )
    }

    @Composable
    internal fun placeholderColor(
        enabled: Boolean,
        interactionSource: InteractionSource
    ): State<Color> {
        val focused by interactionSource.collectIsFocusedAsState()

        val targetValue = when {
            !enabled -> disabledPlaceholderColor
            focused -> focusedPlaceholderColor
            else -> unfocusedPlaceholderColor
        }
        return rememberUpdatedState(targetValue)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is SearchColors) return false

        if (focusedTextColor != other.focusedTextColor) return false
        if (unfocusedTextColor != other.unfocusedTextColor) return false
        if (disabledTextColor != other.disabledTextColor) return false
        if (focusedBackgroundColor != other.focusedBackgroundColor) return false
        if (unfocusedBackgroundColor != other.unfocusedBackgroundColor) return false
        if (disabledBackgroundColor != other.disabledBackgroundColor) return false
        if (cursorColor != other.cursorColor) return false
        if (textSelectionColors != other.textSelectionColors) return false
        if (focusedLeadingIconColor != other.focusedLeadingIconColor) return false
        if (unfocusedLeadingIconColor != other.unfocusedLeadingIconColor) return false
        if (disabledLeadingIconColor != other.disabledLeadingIconColor) return false
        if (focusedClearIconColor != other.focusedClearIconColor) return false
        if (unfocusedClearIconColor != other.unfocusedClearIconColor) return false
        if (disabledClearIconColor != other.disabledClearIconColor) return false
        if (focusedPlaceholderColor != other.focusedPlaceholderColor) return false
        if (unfocusedPlaceholderColor != other.unfocusedPlaceholderColor) return false
        if (disabledPlaceholderColor != other.disabledPlaceholderColor) return false
        return true
    }

    override fun hashCode(): Int {
        var result = focusedTextColor.hashCode()
        result = 31 * result + unfocusedTextColor.hashCode()
        result = 31 * result + disabledTextColor.hashCode()
        result = 31 * result + focusedTextColor.hashCode()
        result = 31 * result + cursorColor.hashCode()
        result = 31 * result + textSelectionColors.hashCode()
        result = 31 * result + focusedBackgroundColor.hashCode()
        result = 31 * result + unfocusedBackgroundColor.hashCode()
        result = 31 * result + disabledBackgroundColor.hashCode()
        result = 31 * result + focusedLeadingIconColor.hashCode()
        result = 31 * result + unfocusedLeadingIconColor.hashCode()
        result = 31 * result + disabledLeadingIconColor.hashCode()
        result = 31 * result + focusedClearIconColor.hashCode()
        result = 31 * result + unfocusedClearIconColor.hashCode()
        result = 31 * result + disabledClearIconColor.hashCode()
        result = 31 * result + focusedPlaceholderColor.hashCode()
        result = 31 * result + unfocusedPlaceholderColor.hashCode()
        result = 31 * result + disabledPlaceholderColor.hashCode()
        return result
    }
}