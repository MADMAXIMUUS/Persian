package io.github.madmaximuus.persian.input

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.state08
import io.github.madmaximuus.persian.foundation.state12
import io.github.madmaximuus.persian.foundation.state16
import io.github.madmaximuus.persian.foundation.state38
import io.github.madmaximuus.persian.icon.IconDefaults
import io.github.madmaximuus.persian.icon.IconSize
import io.github.madmaximuus.persianSymbols.check.circle.CheckCircle
import io.github.madmaximuus.persianSymbols.exclamation.circle.ExclamationCircle
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

object InputsDefaults {

    @Composable
    fun outlineColors(
        //State Icon
        validStateIcon: Painter = rememberVectorPainter(image = PersianSymbols.Default.CheckCircle),
        errorStateIcon: Painter = rememberVectorPainter(image = PersianSymbols.Default.ExclamationCircle),

        //State Icon Colors
        validStateIconColor: Color = PersianTheme.colorScheme.valid,
        errorStateIconColor: Color = PersianTheme.colorScheme.error,

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

        //Trailing Icon Colors
        defaultTrailingIconColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        hoveredTrailingIconColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        focusedTrailingIconColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        validTrailingIconColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        errorTrailingIconColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        disabledTrailingIconColor: Color = PersianTheme.colorScheme.onSurface.state38,

        //Placeholder Colors
        defaultPlaceholderColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        hoveredPlaceholderColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        focusedPlaceholderColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        validPlaceholderColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        errorPlaceholderColor: Color = PersianTheme.colorScheme.error,
        disabledPlaceholderColor: Color = PersianTheme.colorScheme.onSurface.state38,

        //Suffix Colors
        defaultSuffixColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        hoveredSuffixColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        focusedSuffixColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        validSuffixColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        errorSuffixColor: Color = PersianTheme.colorScheme.error,
        disabledSuffixColor: Color = PersianTheme.colorScheme.onSurface.state38,
    ): InputColors =
        InputColors(
            //State Icon
            errorStateIcon = errorStateIcon,
            successStateIcon = validStateIcon,

            //State Icon Colors
            errorStateIconColor = errorStateIconColor,
            successStateIconColor = validStateIconColor,

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

            //Trailing Icon Colors
            defaultTrailingIconColor = defaultTrailingIconColor,
            hoveredTrailingIconColor = hoveredTrailingIconColor,
            focusedTrailingIconColor = focusedTrailingIconColor,
            validTrailingIconColor = validTrailingIconColor,
            errorTrailingIconColor = errorTrailingIconColor,
            disabledTrailingIconColor = disabledTrailingIconColor,

            //Placeholder Colors
            defaultPlaceholderColor = defaultPlaceholderColor,
            hoveredPlaceholderColor = hoveredPlaceholderColor,
            focusedPlaceholderColor = focusedPlaceholderColor,
            errorPlaceholderColor = errorPlaceholderColor,
            validPlaceholderColor = validPlaceholderColor,
            disabledPlaceholderColor = disabledPlaceholderColor,

            //Suffix Colors
            defaultSuffixColor = defaultSuffixColor,
            hoveredSuffixColor = hoveredSuffixColor,
            focusedSuffixColor = focusedSuffixColor,
            validSuffixColor = validSuffixColor,
            errorSuffixColor = errorSuffixColor,
            disabledSuffixColor = disabledSuffixColor,
        )

    @Composable
    fun plainColors(
        //State Icon
        validStateIcon: Painter = rememberVectorPainter(image = PersianSymbols.Default.CheckCircle),
        errorStateIcon: Painter = rememberVectorPainter(image = PersianSymbols.Default.ExclamationCircle),

        //State Icon Colors
        validStateIconColor: Color = PersianTheme.colorScheme.valid,
        errorStateIconColor: Color = PersianTheme.colorScheme.error,

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

        //Trailing Icon Colors
        defaultTrailingIconColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        hoveredTrailingIconColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        focusedTrailingIconColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        validTrailingIconColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        errorTrailingIconColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        disabledTrailingIconColor: Color = PersianTheme.colorScheme.onSurface.state38,

        //Placeholder Colors
        defaultPlaceholderColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        hoveredPlaceholderColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        focusedPlaceholderColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        validPlaceholderColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        errorPlaceholderColor: Color = PersianTheme.colorScheme.error,
        disabledPlaceholderColor: Color = PersianTheme.colorScheme.onSurface.state38,

        //Suffix Colors
        defaultSuffixColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        hoveredSuffixColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        focusedSuffixColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        validSuffixColor: Color = PersianTheme.colorScheme.valid,
        errorSuffixColor: Color = PersianTheme.colorScheme.error,
        disabledSuffixColor: Color = PersianTheme.colorScheme.onSurface.state38,
    ): InputColors =
        InputColors(
            //State Icon
            errorStateIcon = errorStateIcon,
            successStateIcon = validStateIcon,

            //State Icon Colors
            errorStateIconColor = errorStateIconColor,
            successStateIconColor = validStateIconColor,

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

            //Trailing Icon Colors
            defaultTrailingIconColor = defaultTrailingIconColor,
            hoveredTrailingIconColor = hoveredTrailingIconColor,
            focusedTrailingIconColor = focusedTrailingIconColor,
            validTrailingIconColor = validTrailingIconColor,
            errorTrailingIconColor = errorTrailingIconColor,
            disabledTrailingIconColor = disabledTrailingIconColor,

            //Placeholder Colors
            defaultPlaceholderColor = defaultPlaceholderColor,
            hoveredPlaceholderColor = hoveredPlaceholderColor,
            focusedPlaceholderColor = focusedPlaceholderColor,
            errorPlaceholderColor = errorPlaceholderColor,
            validPlaceholderColor = validPlaceholderColor,
            disabledPlaceholderColor = disabledPlaceholderColor,

            //Suffix Colors
            defaultSuffixColor = defaultSuffixColor,
            hoveredSuffixColor = hoveredSuffixColor,
            focusedSuffixColor = focusedSuffixColor,
            validSuffixColor = validSuffixColor,
            errorSuffixColor = errorSuffixColor,
            disabledSuffixColor = disabledSuffixColor,
        )

    @Composable
    fun sizes(
        unfocusedBorderThickness: Dp = 1.dp,
        focusedBorderThickness: Dp = 2.dp,

        shape: Shape = PersianTheme.shapes.shape16,
        contentPaddingValues: PaddingValues = PaddingValues(horizontal = PersianTheme.spacing.size12),

        leadingIconSize: IconSize = IconDefaults.size24(),
        trailingIconSize: IconSize = IconDefaults.size24(),
        stateIconSize: IconSize = IconDefaults.size24(),

        placeholderTextStyle: TextStyle = PersianTheme.typography.bodyLarge,
        inputTextStyle: TextStyle = PersianTheme.typography.bodyLarge,
        suffixTextStyle: TextStyle = PersianTheme.typography.bodyMedium
    ): InputSizes =
        InputSizes(
            unfocusedBorderThickness = unfocusedBorderThickness,
            focusedBorderThickness = focusedBorderThickness,
            shape = shape,
            contentPaddingValues = contentPaddingValues,
            leadingIconSize = leadingIconSize,
            trailingIconSize = trailingIconSize,
            stateIconSize = stateIconSize,

            placeholderTextStyle = placeholderTextStyle,
            inputTextStyle = inputTextStyle,
            suffixTextStyle = suffixTextStyle
        )
}

@Immutable
class InputColors internal constructor(

    //State Icon
    private val errorStateIcon: Painter,
    private val successStateIcon: Painter,

    //State Icon Colors
    private val errorStateIconColor: Color,
    private val successStateIconColor: Color,

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

    //Trailing Icon Colors
    private val defaultTrailingIconColor: Color,
    private val hoveredTrailingIconColor: Color,
    private val focusedTrailingIconColor: Color,
    private val validTrailingIconColor: Color,
    private val errorTrailingIconColor: Color,
    private val disabledTrailingIconColor: Color,

    //Placeholder Colors
    private val defaultPlaceholderColor: Color,
    private val hoveredPlaceholderColor: Color,
    private val focusedPlaceholderColor: Color,
    private val validPlaceholderColor: Color,
    private val errorPlaceholderColor: Color,
    private val disabledPlaceholderColor: Color,

    //Suffix Colors
    private val defaultSuffixColor: Color,
    private val hoveredSuffixColor: Color,
    private val focusedSuffixColor: Color,
    private val validSuffixColor: Color,
    private val errorSuffixColor: Color,
    private val disabledSuffixColor: Color,
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
        isValid: Boolean,
        isError: Boolean
    ): State<Color> {

        val targetValue = when {
            !enabled -> Color.Transparent
            isError -> errorStateIconColor
            isValid -> successStateIconColor

            else -> Color.Transparent
        }
        return rememberUpdatedState(targetValue)
    }

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

    @Composable
    internal fun cursorColor(isError: Boolean, isValid: Boolean): State<Color> {
        val targetValue = when {
            isError -> errorCursorColor
            isValid -> validCursorColor
            else -> defaultCursorColor
        }
        return rememberUpdatedState(targetValue)
    }

    internal val selectionColors: TextSelectionColors
        @Composable get() = textSelectionColors

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
    internal fun leadingIconColor(
        enabled: Boolean,
        isValid: Boolean,
        isError: Boolean,
        interactionSource: InteractionSource
    ): State<Color> {
        val focused by interactionSource.collectIsFocusedAsState()
        val hovered by interactionSource.collectIsHoveredAsState()

        return rememberUpdatedState(
            when {
                !enabled -> disabledLeadingIconColor
                isError -> errorLeadingIconColor
                isValid -> validLeadingIconColor
                focused -> focusedLeadingIconColor
                hovered -> hoveredLeadingIconColor
                else -> defaultLeadingIconColor
            }
        )
    }

    @Composable
    internal fun trailingIconColor(
        enabled: Boolean,
        isValid: Boolean,
        isError: Boolean,
        interactionSource: InteractionSource
    ): State<Color> {
        val focused by interactionSource.collectIsFocusedAsState()
        val hovered by interactionSource.collectIsHoveredAsState()

        return rememberUpdatedState(
            when {
                !enabled -> disabledTrailingIconColor
                isError -> errorTrailingIconColor
                isValid -> validTrailingIconColor
                focused -> focusedTrailingIconColor
                hovered -> hoveredTrailingIconColor
                else -> defaultTrailingIconColor
            }
        )
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

    @Composable
    internal fun suffixColor(
        enabled: Boolean,
        isValid: Boolean,
        isError: Boolean,
        interactionSource: InteractionSource
    ): State<Color> {
        val focused by interactionSource.collectIsFocusedAsState()
        val hovered by interactionSource.collectIsHoveredAsState()

        val targetValue = when {
            !enabled -> disabledSuffixColor
            isError -> errorSuffixColor
            isValid -> validSuffixColor
            focused -> focusedSuffixColor
            hovered -> hoveredSuffixColor
            else -> defaultSuffixColor
        }
        return rememberUpdatedState(targetValue)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is InputColors) return false

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

        //Trailing Icon Colors
        if (defaultTrailingIconColor != other.defaultTrailingIconColor) return false
        if (hoveredTrailingIconColor != other.hoveredTrailingIconColor) return false
        if (focusedTrailingIconColor != other.focusedTrailingIconColor) return false
        if (validTrailingIconColor != other.validTrailingIconColor) return false
        if (errorTrailingIconColor != other.errorTrailingIconColor) return false
        if (disabledTrailingIconColor != other.disabledTrailingIconColor) return false

        //Placeholder Colors
        if (defaultPlaceholderColor != other.defaultPlaceholderColor) return false
        if (hoveredPlaceholderColor != other.hoveredPlaceholderColor) return false
        if (focusedPlaceholderColor != other.focusedPlaceholderColor) return false
        if (validPlaceholderColor != other.validPlaceholderColor) return false
        if (errorPlaceholderColor != other.errorPlaceholderColor) return false
        if (disabledPlaceholderColor != other.disabledPlaceholderColor) return false

        //Suffix Colors
        if (defaultSuffixColor != other.defaultSuffixColor) return false
        if (validSuffixColor != other.validSuffixColor) return false
        if (focusedSuffixColor != other.focusedSuffixColor) return false
        if (errorSuffixColor != other.errorSuffixColor) return false
        if (validSuffixColor != other.validSuffixColor) return false
        return disabledSuffixColor == other.disabledSuffixColor
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

        //Trailing Icon Colors
        result = 31 * result + defaultTrailingIconColor.hashCode()
        result = 31 * result + hoveredTrailingIconColor.hashCode()
        result = 31 * result + focusedTrailingIconColor.hashCode()
        result = 31 * result + errorTrailingIconColor.hashCode()
        result = 31 * result + validTrailingIconColor.hashCode()
        result = 31 * result + disabledTrailingIconColor.hashCode()

        //Placeholder Colors
        result = 31 * result + defaultPlaceholderColor.hashCode()
        result = 31 * result + hoveredPlaceholderColor.hashCode()
        result = 31 * result + focusedPlaceholderColor.hashCode()
        result = 31 * result + errorPlaceholderColor.hashCode()
        result = 31 * result + validPlaceholderColor.hashCode()
        result = 31 * result + disabledPlaceholderColor.hashCode()

        //Placeholder Colors
        result = 31 * result + defaultSuffixColor.hashCode()
        result = 31 * result + hoveredSuffixColor.hashCode()
        result = 31 * result + focusedSuffixColor.hashCode()
        result = 31 * result + errorSuffixColor.hashCode()
        result = 31 * result + validSuffixColor.hashCode()
        result = 31 * result + disabledSuffixColor.hashCode()
        return result
    }

    private companion object {
        const val ANIMATION_DURATION = 150
    }
}


@Stable
class InputSizes(
    internal val unfocusedBorderThickness: Dp,
    internal val focusedBorderThickness: Dp,

    internal val shape: Shape,
    internal val contentPaddingValues: PaddingValues,

    internal val leadingIconSize: IconSize,
    internal val trailingIconSize: IconSize,
    internal val stateIconSize: IconSize,

    internal val placeholderTextStyle: TextStyle,
    internal val inputTextStyle: TextStyle,
    internal val suffixTextStyle: TextStyle
) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is InputSizes) return false

        //Border
        if (unfocusedBorderThickness != other.unfocusedBorderThickness) return false
        if (focusedBorderThickness != other.focusedBorderThickness) return false

        //Container
        if (shape != other.shape) return false
        if (contentPaddingValues != other.contentPaddingValues) return false

        //Icons
        if (leadingIconSize != other.leadingIconSize) return false
        if (trailingIconSize != other.trailingIconSize) return false
        if (stateIconSize != other.stateIconSize) return false

        //Text Style
        if (placeholderTextStyle != other.placeholderTextStyle) return false
        if (inputTextStyle != other.inputTextStyle) return false
        return suffixTextStyle == other.suffixTextStyle
    }

    override fun hashCode(): Int {
        //Border
        var result = unfocusedBorderThickness.hashCode()
        result = 31 * result + focusedBorderThickness.hashCode()

        //Container
        result = 31 * result + shape.hashCode()
        result = 31 * result + contentPaddingValues.hashCode()

        //Icons
        result = 31 * result + leadingIconSize.hashCode()
        result = 31 * result + trailingIconSize.hashCode()
        result = 31 * result + stateIconSize.hashCode()

        //Indicator Colors
        result = 31 * result + placeholderTextStyle.hashCode()
        result = 31 * result + inputTextStyle.hashCode()
        result = 31 * result + suffixTextStyle.hashCode()
        return result
    }
}