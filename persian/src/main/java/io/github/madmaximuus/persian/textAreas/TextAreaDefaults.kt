package io.github.madmaximuus.persian.textAreas

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.Color
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.state08
import io.github.madmaximuus.persian.foundation.state12
import io.github.madmaximuus.persian.foundation.state16
import io.github.madmaximuus.persian.foundation.state38

/**
 * Contains all default values used by text area
 */
object TextAreaDefaults {

    /**
     * Composable function to create a [TextAreaColors] instance with outline-style default values from the theme.
     *
     * This function provides default values for the text area colors based on the current theme's color scheme,
     * with a focus on outline-style colors.
     *
     * @param defaultTextColor The default color of the text.
     * @param hoveredTextColor The color of the text when hovered.
     * @param focusedTextColor The color of the text when focused.
     * @param validTextColor The color of the text when valid.
     * @param errorTextColor The color of the text when there is an error.
     * @param disabledTextColor The color of the text when disabled.
     * @param defaultContainerColor The default color of the container.
     * @param hoveredContainerColor The color of the container when hovered.
     * @param focusedContainerColor The color of the container when focused.
     * @param validContainerColor The color of the container when valid.
     * @param errorContainerColor The color of the container when there is an error.
     * @param disabledContainerColor The color of the container when disabled.
     * @param defaultCursorColor The default color of the cursor.
     * @param validCursorColor The color of the cursor when valid.
     * @param errorCursorColor The color of the cursor when there is an error.
     * @param textSelectionColors The colors for text selection.
     * @param defaultIndicatorColor The default color of the indicator.
     * @param hoveredIndicatorColor The color of the indicator when hovered.
     * @param focusedIndicatorColor The color of the indicator when focused.
     * @param validIndicatorColor The color of the indicator when valid.
     * @param errorIndicatorColor The color of the indicator when there is an error.
     * @param disabledIndicatorColor The color of the indicator when disabled.
     * @param defaultLeadingIconColor The default color of the leading icon.
     * @param hoveredLeadingIconColor The color of the leading icon when hovered.
     * @param focusedLeadingIconColor The color of the leading icon when focused.
     * @param validLeadingIconColor The color of the leading icon when valid.
     * @param errorLeadingIconColor The color of the leading icon when there is an error.
     * @param disabledLeadingIconColor The color of the leading icon when disabled.
     * @param defaultPlaceholderColor The default color of the placeholder.
     * @param hoveredPlaceholderColor The color of the placeholder when hovered.
     * @param focusedPlaceholderColor The color of the placeholder when focused.
     * @param validPlaceholderColor The color of the placeholder when valid.
     * @param errorPlaceholderColor The color of the placeholder when there is an error.
     * @param disabledPlaceholderColor The color of the placeholder when disabled.
     */
    @Composable
    fun outlineColors(
        //Text Colors
        defaultTextColor: Color = PersianTheme.colorScheme.onSurface,
        hoveredTextColor: Color = PersianTheme.colorScheme.onSurface,
        focusedTextColor: Color = PersianTheme.colorScheme.onSurface,
        validTextColor: Color = PersianTheme.colorScheme.valid,
        errorTextColor: Color = PersianTheme.colorScheme.error,
        disabledTextColor: Color = PersianTheme.colorScheme.onSurface.state38,

        //Container Colors
        defaultContainerColor: Color = PersianTheme.colorScheme.primaryContainer.state08,
        hoveredContainerColor: Color = PersianTheme.colorScheme.primaryContainer.state12,
        focusedContainerColor: Color = PersianTheme.colorScheme.primaryContainer.state16,
        validContainerColor: Color = PersianTheme.colorScheme.validContainer.state12,
        errorContainerColor: Color = PersianTheme.colorScheme.errorContainer.state12,
        disabledContainerColor: Color = PersianTheme.colorScheme.onSurface.state08,

        //Cursor Colors
        defaultCursorColor: Color = PersianTheme.colorScheme.primary,
        validCursorColor: Color = PersianTheme.colorScheme.valid,
        errorCursorColor: Color = PersianTheme.colorScheme.error,
        textSelectionColors: TextSelectionColors = TextSelectionColors(
            handleColor = PersianTheme.colorScheme.primary,
            backgroundColor = PersianTheme.colorScheme.primary.copy(alpha = 0.4f)
        ),

        //Indicator Colors
        defaultIndicatorColor: Color = PersianTheme.colorScheme.outlineVariant,
        hoveredIndicatorColor: Color = PersianTheme.colorScheme.outline,
        focusedIndicatorColor: Color = PersianTheme.colorScheme.primary,
        validIndicatorColor: Color = PersianTheme.colorScheme.valid,
        errorIndicatorColor: Color = PersianTheme.colorScheme.error,
        disabledIndicatorColor: Color = PersianTheme.colorScheme.onSurface.state12,

        //Leading Icon Colors
        defaultLeadingIconColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        hoveredLeadingIconColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        focusedLeadingIconColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        validLeadingIconColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        errorLeadingIconColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        disabledLeadingIconColor: Color = PersianTheme.colorScheme.onSurface.state38,

        //Placeholder Colors
        defaultPlaceholderColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        hoveredPlaceholderColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        focusedPlaceholderColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        validPlaceholderColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        errorPlaceholderColor: Color = PersianTheme.colorScheme.error,
        disabledPlaceholderColor: Color = PersianTheme.colorScheme.onSurface.state38,
    ): TextAreaColors =
        TextAreaColors(

            //Text Colors
            defaultTextColor = defaultTextColor,
            hoveredTextColor = hoveredTextColor,
            focusedTextColor = focusedTextColor,
            validTextColor = validTextColor,
            errorTextColor = errorTextColor,
            disabledTextColor = disabledTextColor,

            //Container Colors
            defaultContainerColor = defaultContainerColor,
            hoveredContainerColor = hoveredContainerColor,
            focusedContainerColor = focusedContainerColor,
            validContainerColor = validContainerColor,
            errorContainerColor = errorContainerColor,
            disabledContainerColor = disabledContainerColor,

            //Cursor Colors
            defaultCursorColor = defaultCursorColor,
            validCursorColor = validCursorColor,
            errorCursorColor = errorCursorColor,
            textSelectionColors = textSelectionColors,

            //Indicator Colors
            defaultIndicatorColor = defaultIndicatorColor,
            hoveredIndicatorColor = hoveredIndicatorColor,
            focusedIndicatorColor = focusedIndicatorColor,
            validIndicatorColor = validIndicatorColor,
            errorIndicatorColor = errorIndicatorColor,
            disabledIndicatorColor = disabledIndicatorColor,

            //Leading Icon Colors
            defaultLeadingIconColor = defaultLeadingIconColor,
            hoveredLeadingIconColor = hoveredLeadingIconColor,
            focusedLeadingIconColor = focusedLeadingIconColor,
            validLeadingIconColor = validLeadingIconColor,
            errorLeadingIconColor = errorLeadingIconColor,
            disabledLeadingIconColor = disabledLeadingIconColor,

            //Placeholder Colors
            defaultPlaceholderColor = defaultPlaceholderColor,
            hoveredPlaceholderColor = hoveredPlaceholderColor,
            focusedPlaceholderColor = focusedPlaceholderColor,
            errorPlaceholderColor = errorPlaceholderColor,
            validPlaceholderColor = validPlaceholderColor,
            disabledPlaceholderColor = disabledPlaceholderColor,
        )

    /**
     * Composable function to create a [TextAreaColors] instance with default values from the theme.
     *
     * This function provides default values for the text area colors based on the current theme's color scheme.
     *
     * @param defaultTextColor The default color of the text.
     * @param hoveredTextColor The color of the text when hovered.
     * @param focusedTextColor The color of the text when focused.
     * @param validTextColor The color of the text when valid.
     * @param errorTextColor The color of the text when there is an error.
     * @param disabledTextColor The color of the text when disabled.
     * @param defaultContainerColor The default color of the container.
     * @param hoveredContainerColor The color of the container when hovered.
     * @param focusedContainerColor The color of the container when focused.
     * @param validContainerColor The color of the container when valid.
     * @param errorContainerColor The color of the container when there is an error.
     * @param disabledContainerColor The color of the container when disabled.
     * @param defaultCursorColor The default color of the cursor.
     * @param validCursorColor The color of the cursor when valid.
     * @param errorCursorColor The color of the cursor when there is an error.
     * @param textSelectionColors The colors for text selection.
     * @param defaultLeadingIconColor The default color of the leading icon.
     * @param hoveredLeadingIconColor The color of the leading icon when hovered.
     * @param focusedLeadingIconColor The color of the leading icon when focused.
     * @param validLeadingIconColor The color of the leading icon when valid.
     * @param errorLeadingIconColor The color of the leading icon when there is an error.
     * @param disabledLeadingIconColor The color of the leading icon when disabled.
     * @param defaultPlaceholderColor The default color of the placeholder.
     * @param hoveredPlaceholderColor The color of the placeholder when hovered.
     * @param focusedPlaceholderColor The color of the placeholder when focused.
     * @param validPlaceholderColor The color of the placeholder when valid.
     * @param errorPlaceholderColor The color of the placeholder when there is an error.
     * @param disabledPlaceholderColor The color of the placeholder when disabled.
     */
    @Composable
    fun plainColors(
        //Text Colors
        defaultTextColor: Color = PersianTheme.colorScheme.onSurface,
        hoveredTextColor: Color = PersianTheme.colorScheme.onSurface,
        focusedTextColor: Color = PersianTheme.colorScheme.onSurface,
        validTextColor: Color = PersianTheme.colorScheme.valid,
        errorTextColor: Color = PersianTheme.colorScheme.error,
        disabledTextColor: Color = PersianTheme.colorScheme.onSurface.state38,

        //Container Colors
        defaultContainerColor: Color = Color.Transparent,
        hoveredContainerColor: Color = PersianTheme.colorScheme.primaryContainer.state12,
        focusedContainerColor: Color = PersianTheme.colorScheme.primaryContainer.state16,
        validContainerColor: Color = PersianTheme.colorScheme.validContainer.state12,
        errorContainerColor: Color = PersianTheme.colorScheme.errorContainer.state12,
        disabledContainerColor: Color = PersianTheme.colorScheme.onSurface.state08,

        //Cursor Colors
        defaultCursorColor: Color = PersianTheme.colorScheme.primary,
        validCursorColor: Color = PersianTheme.colorScheme.valid,
        errorCursorColor: Color = PersianTheme.colorScheme.error,
        textSelectionColors: TextSelectionColors = TextSelectionColors(
            handleColor = PersianTheme.colorScheme.primary,
            backgroundColor = PersianTheme.colorScheme.primary.copy(alpha = 0.4f)
        ),

        //Leading Icon Colors
        defaultLeadingIconColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        hoveredLeadingIconColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        focusedLeadingIconColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        validLeadingIconColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        errorLeadingIconColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        disabledLeadingIconColor: Color = PersianTheme.colorScheme.onSurface.state38,

        //Placeholder Colors
        defaultPlaceholderColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        hoveredPlaceholderColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        focusedPlaceholderColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        validPlaceholderColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        errorPlaceholderColor: Color = PersianTheme.colorScheme.error,
        disabledPlaceholderColor: Color = PersianTheme.colorScheme.onSurface.state38,
    ): TextAreaColors =
        TextAreaColors(
            //Text Colors
            defaultTextColor = defaultTextColor,
            hoveredTextColor = hoveredTextColor,
            focusedTextColor = focusedTextColor,
            validTextColor = validTextColor,
            errorTextColor = errorTextColor,
            disabledTextColor = disabledTextColor,

            //Container Colors
            defaultContainerColor = defaultContainerColor,
            hoveredContainerColor = hoveredContainerColor,
            focusedContainerColor = focusedContainerColor,
            validContainerColor = validContainerColor,
            errorContainerColor = errorContainerColor,
            disabledContainerColor = disabledContainerColor,

            //Cursor Colors
            defaultCursorColor = defaultCursorColor,
            validCursorColor = validCursorColor,
            errorCursorColor = errorCursorColor,
            textSelectionColors = textSelectionColors,

            //Indicator Colors
            defaultIndicatorColor = Color.Transparent,
            hoveredIndicatorColor = Color.Transparent,
            focusedIndicatorColor = Color.Transparent,
            validIndicatorColor = Color.Transparent,
            errorIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent,

            //Leading Icon Colors
            defaultLeadingIconColor = defaultLeadingIconColor,
            hoveredLeadingIconColor = hoveredLeadingIconColor,
            focusedLeadingIconColor = focusedLeadingIconColor,
            validLeadingIconColor = validLeadingIconColor,
            errorLeadingIconColor = errorLeadingIconColor,
            disabledLeadingIconColor = disabledLeadingIconColor,

            //Placeholder Colors
            defaultPlaceholderColor = defaultPlaceholderColor,
            hoveredPlaceholderColor = hoveredPlaceholderColor,
            focusedPlaceholderColor = focusedPlaceholderColor,
            errorPlaceholderColor = errorPlaceholderColor,
            validPlaceholderColor = validPlaceholderColor,
            disabledPlaceholderColor = disabledPlaceholderColor,
        )
}

/**
 * Immutable class representing the colors for a text area.
 *
 * This class encapsulates various color properties for a text area, including text colors,
 * container colors, cursor colors, indicator colors, leading icon colors, and placeholder colors.
 *
 * @param defaultTextColor The default color of the text.
 * @param hoveredTextColor The color of the text when hovered.
 * @param focusedTextColor The color of the text when focused.
 * @param validTextColor The color of the text when valid.
 * @param errorTextColor The color of the text when there is an error.
 * @param disabledTextColor The color of the text when disabled.
 * @param defaultContainerColor The default color of the container.
 * @param hoveredContainerColor The color of the container when hovered.
 * @param focusedContainerColor The color of the container when focused.
 * @param validContainerColor The color of the container when valid.
 * @param errorContainerColor The color of the container when there is an error.
 * @param disabledContainerColor The color of the container when disabled.
 * @param defaultCursorColor The default color of the cursor.
 * @param validCursorColor The color of the cursor when valid.
 * @param errorCursorColor The color of the cursor when there is an error.
 * @param textSelectionColors The colors for text selection.
 * @param defaultIndicatorColor The default color of the indicator.
 * @param hoveredIndicatorColor The color of the indicator when hovered.
 * @param focusedIndicatorColor The color of the indicator when focused.
 * @param validIndicatorColor The color of the indicator when valid.
 * @param errorIndicatorColor The color of the indicator when there is an error.
 * @param disabledIndicatorColor The color of the indicator when disabled.
 * @param defaultLeadingIconColor The default color of the leading icon.
 * @param hoveredLeadingIconColor The color of the leading icon when hovered.
 * @param focusedLeadingIconColor The color of the leading icon when focused.
 * @param validLeadingIconColor The color of the leading icon when valid.
 * @param errorLeadingIconColor The color of the leading icon when there is an error.
 * @param disabledLeadingIconColor The color of the leading icon when disabled.
 * @param defaultPlaceholderColor The default color of the placeholder.
 * @param hoveredPlaceholderColor The color of the placeholder when hovered.
 * @param focusedPlaceholderColor The color of the placeholder when focused.
 * @param validPlaceholderColor The color of the placeholder when valid.
 * @param errorPlaceholderColor The color of the placeholder when there is an error.
 * @param disabledPlaceholderColor The color of the placeholder when disabled.
 */
@Immutable
class TextAreaColors internal constructor(
    //Text Colors
    private val defaultTextColor: Color,
    private val hoveredTextColor: Color,
    private val focusedTextColor: Color,
    private val validTextColor: Color,
    private val errorTextColor: Color,
    private val disabledTextColor: Color,

    //Container Colors
    private val defaultContainerColor: Color,
    private val hoveredContainerColor: Color,
    private val focusedContainerColor: Color,
    private val validContainerColor: Color,
    private val errorContainerColor: Color,
    private val disabledContainerColor: Color,

    //Cursor Colors
    private val defaultCursorColor: Color,
    private val validCursorColor: Color,
    private val errorCursorColor: Color,
    private val textSelectionColors: TextSelectionColors,

    //Indicator Colors
    private val defaultIndicatorColor: Color,
    private val hoveredIndicatorColor: Color,
    private val focusedIndicatorColor: Color,
    private val validIndicatorColor: Color,
    private val errorIndicatorColor: Color,
    private val disabledIndicatorColor: Color,

    //Leading Icon Colors
    private val defaultLeadingIconColor: Color,
    private val hoveredLeadingIconColor: Color,
    private val focusedLeadingIconColor: Color,
    private val validLeadingIconColor: Color,
    private val errorLeadingIconColor: Color,
    private val disabledLeadingIconColor: Color,

    //Placeholder Colors
    private val defaultPlaceholderColor: Color,
    private val hoveredPlaceholderColor: Color,
    private val focusedPlaceholderColor: Color,
    private val validPlaceholderColor: Color,
    private val errorPlaceholderColor: Color,
    private val disabledPlaceholderColor: Color,
) {
    /**
     * Returns the text color based on the enabled state, validity, error state, and interaction source.
     *
     * @param enabled Whether the text area is enabled.
     * @param isValid Whether the text area is valid.
     * @param isError Whether the text area has an error.
     * @param interactionSource The interaction source for the text area.
     */
    @Composable
    internal fun textColor(
        enabled: Boolean,
        isValid: Boolean,
        isError: Boolean,
        interactionSource: InteractionSource
    ): State<Color> {
        val focused by interactionSource.collectIsFocusedAsState()
        val hovered by interactionSource.collectIsHoveredAsState()

        val targetValue = when {
            !enabled -> disabledTextColor
            isError -> errorTextColor
            isValid -> validTextColor
            hovered -> hoveredTextColor
            focused -> focusedTextColor

            else -> defaultTextColor
        }
        return rememberUpdatedState(targetValue)
    }

    /**
     * Returns the container color based on the enabled state, validity, error state, and interaction source.
     *
     * @param enabled Whether the text area is enabled.
     * @param isValid Whether the text area is valid.
     * @param isError Whether the text area has an error.
     * @param interactionSource The interaction source for the text area.
     */
    @Composable
    internal fun containerColor(
        enabled: Boolean,
        isValid: Boolean,
        isError: Boolean,
        interactionSource: InteractionSource
    ): State<Color> {
        val focused by interactionSource.collectIsFocusedAsState()
        val hovered by interactionSource.collectIsHoveredAsState()

        val targetValue = when {
            !enabled -> disabledContainerColor
            isError -> errorContainerColor
            isValid -> validContainerColor
            hovered -> hoveredContainerColor
            focused -> focusedContainerColor
            else -> defaultContainerColor
        }
        return rememberUpdatedState(targetValue)
    }

    /**
     * Returns the cursor color based on the error state and validity.
     *
     * @param isError Whether the text area has an error.
     * @param isValid Whether the text area is valid.
     */
    @Composable
    internal fun cursorColor(isError: Boolean, isValid: Boolean): State<Color> {
        val targetValue = when {
            isError -> errorCursorColor
            isValid -> validCursorColor
            else -> defaultCursorColor
        }
        return rememberUpdatedState(targetValue)
    }

    /**
     * Returns the text selection colors.
     */
    internal val selectionColors: TextSelectionColors
        @Composable get() = textSelectionColors

    /**
     * Returns the indicator color based on the enabled state, validity, error state, and interaction source.
     *
     * @param enabled Whether the text area is enabled.
     * @param isValid Whether the text area is valid.
     * @param isError Whether the text area has an error.
     * @param interactionSource The interaction source for the text area.
     */
    @Composable
    internal fun indicatorColor(
        enabled: Boolean,
        isValid: Boolean,
        isError: Boolean,
        interactionSource: InteractionSource
    ): State<Color> {
        val focused by interactionSource.collectIsFocusedAsState()
        val hovered by interactionSource.collectIsHoveredAsState()

        val targetValue = when {
            !enabled -> disabledIndicatorColor
            isError -> errorIndicatorColor
            isValid -> validIndicatorColor
            hovered -> hoveredIndicatorColor
            focused -> focusedIndicatorColor
            else -> defaultIndicatorColor
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
    internal fun placeholderColor(
        enabled: Boolean,
        isError: Boolean,
        isValid: Boolean,
        interactionSource: InteractionSource
    ): State<Color> {
        val focused by interactionSource.collectIsFocusedAsState()
        val hovered by interactionSource.collectIsHoveredAsState()

        val targetValue = when {
            !enabled -> disabledPlaceholderColor
            isError -> errorPlaceholderColor
            isValid -> validPlaceholderColor
            focused -> focusedPlaceholderColor
            hovered -> hoveredPlaceholderColor
            else -> defaultPlaceholderColor
        }
        return rememberUpdatedState(targetValue)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is TextAreaColors) return false

        //Text Colors
        if (defaultTextColor != other.defaultTextColor) return false
        if (hoveredTextColor != other.hoveredTextColor) return false
        if (focusedTextColor != other.focusedTextColor) return false
        if (validTextColor != other.validTextColor) return false
        if (errorTextColor != other.errorTextColor) return false
        if (disabledTextColor != other.disabledTextColor) return false

        //Container Colors
        if (defaultContainerColor != other.defaultContainerColor) return false
        if (hoveredContainerColor != other.hoveredContainerColor) return false
        if (focusedContainerColor != other.focusedContainerColor) return false
        if (errorContainerColor != other.errorContainerColor) return false
        if (validContainerColor != other.validContainerColor) return false
        if (disabledContainerColor != other.disabledContainerColor) return false

        //Cursor Colors
        if (defaultCursorColor != other.defaultCursorColor) return false
        if (errorCursorColor != other.errorCursorColor) return false
        if (validCursorColor != other.validCursorColor) return false
        if (textSelectionColors != other.textSelectionColors) return false

        //Indicator Colors
        if (defaultIndicatorColor != other.defaultIndicatorColor) return false
        if (focusedIndicatorColor != other.focusedIndicatorColor) return false
        if (hoveredIndicatorColor != other.hoveredIndicatorColor) return false
        if (validIndicatorColor != other.validIndicatorColor) return false
        if (errorIndicatorColor != other.errorIndicatorColor) return false
        if (disabledIndicatorColor != other.disabledIndicatorColor) return false

        //Leading Icon Colors
        if (defaultLeadingIconColor != other.defaultLeadingIconColor) return false
        if (hoveredLeadingIconColor != other.hoveredLeadingIconColor) return false
        if (focusedLeadingIconColor != other.focusedLeadingIconColor) return false
        if (validLeadingIconColor != other.validLeadingIconColor) return false
        if (errorLeadingIconColor != other.errorLeadingIconColor) return false
        if (disabledLeadingIconColor != other.disabledLeadingIconColor) return false

        //Placeholder Colors
        if (defaultPlaceholderColor != other.defaultPlaceholderColor) return false
        if (hoveredPlaceholderColor != other.hoveredPlaceholderColor) return false
        if (focusedPlaceholderColor != other.focusedPlaceholderColor) return false
        if (validPlaceholderColor != other.validPlaceholderColor) return false
        if (errorPlaceholderColor != other.errorPlaceholderColor) return false
        return disabledPlaceholderColor == other.disabledPlaceholderColor
    }

    override fun hashCode(): Int {
        //Text Colors
        var result = defaultTextColor.hashCode()
        result = 31 * result + hoveredTextColor.hashCode()
        result = 31 * result + focusedTextColor.hashCode()
        result = 31 * result + errorTextColor.hashCode()
        result = 31 * result + validTextColor.hashCode()
        result = 31 * result + disabledTextColor.hashCode()

        //Container Colors
        result = 31 * result + defaultContainerColor.hashCode()
        result = 31 * result + hoveredContainerColor.hashCode()
        result = 31 * result + focusedContainerColor.hashCode()
        result = 31 * result + errorContainerColor.hashCode()
        result = 31 * result + validContainerColor.hashCode()
        result = 31 * result + disabledContainerColor.hashCode()

        //Cursor Colors
        result = 31 * result + defaultCursorColor.hashCode()
        result = 31 * result + validCursorColor.hashCode()
        result = 31 * result + errorCursorColor.hashCode()
        result = 31 * result + textSelectionColors.hashCode()

        //Indicator Colors
        result = 31 * result + defaultIndicatorColor.hashCode()
        result = 31 * result + hoveredIndicatorColor.hashCode()
        result = 31 * result + focusedIndicatorColor.hashCode()
        result = 31 * result + errorIndicatorColor.hashCode()
        result = 31 * result + validIndicatorColor.hashCode()
        result = 31 * result + disabledIndicatorColor.hashCode()

        //Leading Icon Colors
        result = 31 * result + defaultLeadingIconColor.hashCode()
        result = 31 * result + hoveredLeadingIconColor.hashCode()
        result = 31 * result + focusedLeadingIconColor.hashCode()
        result = 31 * result + validLeadingIconColor.hashCode()
        result = 31 * result + errorLeadingIconColor.hashCode()
        result = 31 * result + disabledLeadingIconColor.hashCode()

        //Placeholder Colors
        result = 31 * result + defaultPlaceholderColor.hashCode()
        result = 31 * result + hoveredPlaceholderColor.hashCode()
        result = 31 * result + focusedPlaceholderColor.hashCode()
        result = 31 * result + errorPlaceholderColor.hashCode()
        result = 31 * result + validPlaceholderColor.hashCode()
        result = 31 * result + disabledPlaceholderColor.hashCode()
        return result
    }

    private companion object {
        const val ANIMATION_DURATION = 150
    }
}