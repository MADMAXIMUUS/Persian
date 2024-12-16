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
import io.github.madmaximuus.persian.icon.IconDefaults
import io.github.madmaximuus.persian.icon.IconSizes
import io.github.madmaximuus.persianSymbols.check.circle.CheckCircle
import io.github.madmaximuus.persianSymbols.exclamation.circle.ExclamationCircle
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

/**
 * Contains all default values used by [OutlineInput] or [PlainInput].
 */
object InputsDefaults {

    /**
     * Creates an [InputColors] instance with default colors.
     *
     * @param validStateIcon The icon to be displayed when the input field is in a valid state.
     * @param validStateIconColor The color of the icon when the input field is in a valid state.
     * @param errorStateIconColor The color of the icon when the input field is in an error state.
     * @param defaultTextColor The default color of the text in the input field.
     * @param hoveredTextColor The color of the text when the input field is hovered.
     * @param focusedTextColor The color of the text when the input field is focused.
     * @param validTextColor The color of the text when the input field is in a valid state.
     * @param errorTextColor The color of the text when the input field is in an error state.
     * @param defaultContainerColor The default color of the input field container.
     * @param hoveredContainerColor The color of the input field container when it is hovered.
     * @param focusedContainerColor The color of the input field container when it is focused.
     * @param validContainerColor The color of the input field container when it is in a valid state.
     * @param errorContainerColor The color of the input field container when it is in an error state.
     * @param defaultCursorColor The default color of the cursor in the input field.
     * @param validCursorColor The color of the cursor when the input field is in a valid state.
     * @param errorCursorColor The color of the cursor when the input field is in an error state.
     * @param textSelectionColors The colors used for text selection in the input field.
     * @param defaultIndicatorColor The default color of the indicator in the input field.
     * @param hoveredIndicatorColor The color of the indicator when the input field is hovered.
     * @param focusedIndicatorColor The color of the indicator when the input field is focused.
     * @param validIndicatorColor The color of the indicator when the input field is in a valid state.
     * @param errorIndicatorColor The color of the indicator when the input field is in an error state.
     * @param defaultLeadingIconColor The default color of the leading icon in the input field.
     * @param hoveredLeadingIconColor The color of the leading icon when the input field is hovered.
     * @param focusedLeadingIconColor The color of the leading icon when the input field is focused.
     * @param validLeadingIconColor The color of the leading icon when the input field is in a valid state.
     * @param errorLeadingIconColor The color of the leading icon when the input field is in an error state.
     * @param defaultTrailingIconColor The default color of the trailing icon in the input field.
     * @param hoveredTrailingIconColor The color of the trailing icon when the input field is hovered.
     * @param focusedTrailingIconColor The color of the trailing icon when the input field is focused.
     * @param validTrailingIconColor The color of the trailing icon when the input field is in a valid state.
     * @param errorTrailingIconColor The color of the trailing icon when the input field is in an error state.
     * @param defaultPlaceholderColor The default color of the placeholder text in the input field.
     * @param hoveredPlaceholderColor The color of the placeholder text when the input field is hovered.
     * @param focusedPlaceholderColor The color of the placeholder text when the input field is focused.
     * @param validPlaceholderColor The color of the placeholder text when the input field is in a valid state.
     * @param errorPlaceholderColor The color of the placeholder text when the input field is in an error state.
     * @param defaultSuffixColor The default color of the suffix text in the input field.
     * @param hoveredSuffixColor The color of the suffix text when the input field is hovered.
     * @param focusedSuffixColor The color of the suffix text when the input field is focused.
     * @param validSuffixColor The color of the suffix text when the input field is in a valid state.
     * @param errorSuffixColor The color of the suffix text when the input field is in an error state.
     */
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

        //Container Colors
        defaultContainerColor: Color = PersianTheme.colorScheme.primaryContainer.state08,
        hoveredContainerColor: Color = PersianTheme.colorScheme.primaryContainer.state12,
        focusedContainerColor: Color = PersianTheme.colorScheme.primaryContainer.state16,
        validContainerColor: Color = PersianTheme.colorScheme.validContainer.state12,
        errorContainerColor: Color = PersianTheme.colorScheme.errorContainer.state12,

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

        //Leading Icon Colors
        defaultLeadingIconColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        hoveredLeadingIconColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        focusedLeadingIconColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        validLeadingIconColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        errorLeadingIconColor: Color = PersianTheme.colorScheme.onSurfaceVariant,

        //Trailing Icon Colors
        defaultTrailingIconColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        hoveredTrailingIconColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        focusedTrailingIconColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        validTrailingIconColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        errorTrailingIconColor: Color = PersianTheme.colorScheme.onSurfaceVariant,

        //Placeholder Colors
        defaultPlaceholderColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        hoveredPlaceholderColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        focusedPlaceholderColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        validPlaceholderColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        errorPlaceholderColor: Color = PersianTheme.colorScheme.error,

        //Suffix Colors
        defaultSuffixColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        hoveredSuffixColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        focusedSuffixColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        validSuffixColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        errorSuffixColor: Color = PersianTheme.colorScheme.error,
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

            //Container Colors
            defaultContainerColor = defaultContainerColor,
            hoveredContainerColor = hoveredContainerColor,
            focusedContainerColor = focusedContainerColor,
            validContainerColor = validContainerColor,
            errorContainerColor = errorContainerColor,

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

            //Leading Icon Colors
            defaultLeadingIconColor = defaultLeadingIconColor,
            hoveredLeadingIconColor = hoveredLeadingIconColor,
            focusedLeadingIconColor = focusedLeadingIconColor,
            validLeadingIconColor = validLeadingIconColor,
            errorLeadingIconColor = errorLeadingIconColor,

            //Trailing Icon Colors
            defaultTrailingIconColor = defaultTrailingIconColor,
            hoveredTrailingIconColor = hoveredTrailingIconColor,
            focusedTrailingIconColor = focusedTrailingIconColor,
            validTrailingIconColor = validTrailingIconColor,
            errorTrailingIconColor = errorTrailingIconColor,

            //Placeholder Colors
            defaultPlaceholderColor = defaultPlaceholderColor,
            hoveredPlaceholderColor = hoveredPlaceholderColor,
            focusedPlaceholderColor = focusedPlaceholderColor,
            errorPlaceholderColor = errorPlaceholderColor,
            validPlaceholderColor = validPlaceholderColor,

            //Suffix Colors
            defaultSuffixColor = defaultSuffixColor,
            hoveredSuffixColor = hoveredSuffixColor,
            focusedSuffixColor = focusedSuffixColor,
            validSuffixColor = validSuffixColor,
            errorSuffixColor = errorSuffixColor,
        )

    /**
     * Creates an [InputColors] instance with default colors.
     *
     * @param validStateIcon The icon to be displayed when the input field is in a valid state.
     * @param validStateIconColor The color of the icon when the input field is in a valid state.
     * @param errorStateIconColor The color of the icon when the input field is in an error state.
     * @param defaultTextColor The default color of the text in the input field.
     * @param hoveredTextColor The color of the text when the input field is hovered.
     * @param focusedTextColor The color of the text when the input field is focused.
     * @param validTextColor The color of the text when the input field is in a valid state.
     * @param errorTextColor The color of the text when the input field is in an error state.
     * @param defaultContainerColor The default color of the input field container.
     * @param hoveredContainerColor The color of the input field container when it is hovered.
     * @param focusedContainerColor The color of the input field container when it is focused.
     * @param validContainerColor The color of the input field container when it is in a valid state.
     * @param errorContainerColor The color of the input field container when it is in an error state.
     * @param defaultCursorColor The default color of the cursor in the input field.
     * @param validCursorColor The color of the cursor when the input field is in a valid state.
     * @param errorCursorColor The color of the cursor when the input field is in an error state.
     * @param textSelectionColors The colors used for text selection in the input field.
     * @param defaultLeadingIconColor The default color of the leading icon in the input field.
     * @param hoveredLeadingIconColor The color of the leading icon when the input field is hovered.
     * @param focusedLeadingIconColor The color of the leading icon when the input field is focused.
     * @param validLeadingIconColor The color of the leading icon when the input field is in a valid state.
     * @param errorLeadingIconColor The color of the leading icon when the input field is in an error state.
     * @param defaultTrailingIconColor The default color of the trailing icon in the input field.
     * @param hoveredTrailingIconColor The color of the trailing icon when the input field is hovered.
     * @param focusedTrailingIconColor The color of the trailing icon when the input field is focused.
     * @param validTrailingIconColor The color of the trailing icon when the input field is in a valid state.
     * @param errorTrailingIconColor The color of the trailing icon when the input field is in an error state.
     * @param defaultPlaceholderColor The default color of the placeholder text in the input field.
     * @param hoveredPlaceholderColor The color of the placeholder text when the input field is hovered.
     * @param focusedPlaceholderColor The color of the placeholder text when the input field is focused.
     * @param validPlaceholderColor The color of the placeholder text when the input field is in a valid state.
     * @param errorPlaceholderColor The color of the placeholder text when the input field is in an error state.
     * @param defaultSuffixColor The default color of the suffix text in the input field.
     * @param hoveredSuffixColor The color of the suffix text when the input field is hovered.
     * @param focusedSuffixColor The color of the suffix text when the input field is focused.
     * @param validSuffixColor The color of the suffix text when the input field is in a valid state.
     * @param errorSuffixColor The color of the suffix text when the input field is in an error state.
     */
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

        //Container Colors
        defaultContainerColor: Color = Color.Transparent,
        hoveredContainerColor: Color = PersianTheme.colorScheme.primaryContainer.state12,
        focusedContainerColor: Color = PersianTheme.colorScheme.primaryContainer.state16,
        validContainerColor: Color = PersianTheme.colorScheme.validContainer.state12,
        errorContainerColor: Color = PersianTheme.colorScheme.errorContainer.state12,

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

        //Trailing Icon Colors
        defaultTrailingIconColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        hoveredTrailingIconColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        focusedTrailingIconColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        validTrailingIconColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        errorTrailingIconColor: Color = PersianTheme.colorScheme.onSurfaceVariant,

        //Placeholder Colors
        defaultPlaceholderColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        hoveredPlaceholderColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        focusedPlaceholderColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        validPlaceholderColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        errorPlaceholderColor: Color = PersianTheme.colorScheme.error,

        //Suffix Colors
        defaultSuffixColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        hoveredSuffixColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        focusedSuffixColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        validSuffixColor: Color = PersianTheme.colorScheme.valid,
        errorSuffixColor: Color = PersianTheme.colorScheme.error,
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

            //Container Colors
            defaultContainerColor = defaultContainerColor,
            hoveredContainerColor = hoveredContainerColor,
            focusedContainerColor = focusedContainerColor,
            validContainerColor = validContainerColor,
            errorContainerColor = errorContainerColor,

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

            //Leading Icon Colors
            defaultLeadingIconColor = defaultLeadingIconColor,
            hoveredLeadingIconColor = hoveredLeadingIconColor,
            focusedLeadingIconColor = focusedLeadingIconColor,
            validLeadingIconColor = validLeadingIconColor,
            errorLeadingIconColor = errorLeadingIconColor,

            //Trailing Icon Colors
            defaultTrailingIconColor = defaultTrailingIconColor,
            hoveredTrailingIconColor = hoveredTrailingIconColor,
            focusedTrailingIconColor = focusedTrailingIconColor,
            validTrailingIconColor = validTrailingIconColor,
            errorTrailingIconColor = errorTrailingIconColor,

            //Placeholder Colors
            defaultPlaceholderColor = defaultPlaceholderColor,
            hoveredPlaceholderColor = hoveredPlaceholderColor,
            focusedPlaceholderColor = focusedPlaceholderColor,
            errorPlaceholderColor = errorPlaceholderColor,
            validPlaceholderColor = validPlaceholderColor,

            //Suffix Colors
            defaultSuffixColor = defaultSuffixColor,
            hoveredSuffixColor = hoveredSuffixColor,
            focusedSuffixColor = focusedSuffixColor,
            validSuffixColor = validSuffixColor,
            errorSuffixColor = errorSuffixColor,
        )

    /**
     * Create an [InputSizes] object with customizable properties for an input field.
     *
     * @param unfocusedBorderThickness The thickness of the border when the input field is not focused.
     * @param focusedBorderThickness The thickness of the border when the input field is focused.
     * @param shape The shape of the input field.
     * @param contentPaddingValues The padding values for the content inside the input field.
     * @param leadingIconSizes The sizes for the leading icon.
     * @param trailingIconSizes The sizes for the trailing icon.
     * @param stateIconSizes The sizes for the state icon.
     * @param placeholderTextStyle The text style for the placeholder text.
     * @param inputTextStyle The text style for the input text.
     * @param suffixTextStyle The text style for the suffix text.
     */
    @Composable
    fun sizes(
        unfocusedBorderThickness: Dp = 1.dp,
        focusedBorderThickness: Dp = 2.dp,

        shape: Shape = PersianTheme.shapes.shape16,
        contentPaddingValues: PaddingValues = PaddingValues(
            horizontal = PersianTheme.spacing.size12
        ),

        leadingIconSizes: IconSizes = IconDefaults.size24(),
        trailingIconSizes: IconSizes = IconDefaults.size24(),
        stateIconSizes: IconSizes = IconDefaults.size24(),

        placeholderTextStyle: TextStyle = PersianTheme.typography.bodyLarge,
        inputTextStyle: TextStyle = PersianTheme.typography.bodyLarge,
        suffixTextStyle: TextStyle = PersianTheme.typography.labelMedium
    ): InputSizes =
        InputSizes(
            unfocusedBorderThickness = unfocusedBorderThickness,
            focusedBorderThickness = focusedBorderThickness,
            shape = shape,
            contentPaddingValues = contentPaddingValues,
            leadingIconSizes = leadingIconSizes,
            trailingIconSizes = trailingIconSizes,
            stateIconSizes = stateIconSizes,

            placeholderTextStyle = placeholderTextStyle,
            inputTextStyle = inputTextStyle,
            suffixTextStyle = suffixTextStyle
        )
}

/**
 * A class that defines the colors and icons for an input field.
 *
 * @property errorStateIcon The icon to be displayed when the input field is in an error state.
 * @property successStateIcon The icon to be displayed when the input field is in a valid state.
 * @property errorStateIconColor The color of the icon when the input field is in an error state.
 * @property successStateIconColor The color of the icon when the input field is in a valid state.
 * @property defaultTextColor The default color of the text in the input field.
 * @property hoveredTextColor The color of the text when the input field is hovered.
 * @property focusedTextColor The color of the text when the input field is focused.
 * @property validTextColor The color of the text when the input field is in a valid state.
 * @property errorTextColor The color of the text when the input field is in an error state.
 * @property defaultContainerColor The default color of the input field container.
 * @property hoveredContainerColor The color of the input field container when it is hovered.
 * @property focusedContainerColor The color of the input field container when it is focused.
 * @property validContainerColor The color of the input field container when it is in a valid state.
 * @property errorContainerColor The color of the input field container when it is in an error state.
 * @property defaultCursorColor The default color of the cursor in the input field.
 * @property validCursorColor The color of the cursor when the input field is in a valid state.
 * @property errorCursorColor The color of the cursor when the input field is in an error state.
 * @property textSelectionColors The colors used for text selection in the input field.
 * @property defaultIndicatorColor The default color of the indicator in the input field.
 * @property hoveredIndicatorColor The color of the indicator when the input field is hovered.
 * @property focusedIndicatorColor The color of the indicator when the input field is focused.
 * @property validIndicatorColor The color of the indicator when the input field is in a valid state.
 * @property errorIndicatorColor The color of the indicator when the input field is in an error state.
 * @property defaultLeadingIconColor The default color of the leading icon in the input field.
 * @property hoveredLeadingIconColor The color of the leading icon when the input field is hovered.
 * @property focusedLeadingIconColor The color of the leading icon when the input field is focused.
 * @property validLeadingIconColor The color of the leading icon when the input field is in a valid state.
 * @property errorLeadingIconColor The color of the leading icon when the input field is in an error state.
 * @property defaultTrailingIconColor The default color of the trailing icon in the input field.
 * @property hoveredTrailingIconColor The color of the trailing icon when the input field is hovered.
 * @property focusedTrailingIconColor The color of the trailing icon when the input field is focused.
 * @property validTrailingIconColor The color of the trailing icon when the input field is in a valid state.
 * @property errorTrailingIconColor The color of the trailing icon when the input field is in an error state.
 * @property defaultPlaceholderColor The default color of the placeholder text in the input field.
 * @property hoveredPlaceholderColor The color of the placeholder text when the input field is hovered.
 * @property focusedPlaceholderColor The color of the placeholder text when the input field is focused.
 * @property validPlaceholderColor The color of the placeholder text when the input field is in a valid state.
 * @property errorPlaceholderColor The color of the placeholder text when the input field is in an error state.
 * @property defaultSuffixColor The default color of the suffix text in the input field.
 * @property hoveredSuffixColor The color of the suffix text when the input field is hovered.
 * @property focusedSuffixColor The color of the suffix text when the input field is focused.
 * @property validSuffixColor The color of the suffix text when the input field is in a valid state.
 * @property errorSuffixColor The color of the suffix text when the input field is in an error state.
 */
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

    //Container Colors
    private val defaultContainerColor: Color,
    private val hoveredContainerColor: Color,
    private val focusedContainerColor: Color,
    private val validContainerColor: Color,
    private val errorContainerColor: Color,

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

    //Leading Icon Colors
    private val defaultLeadingIconColor: Color,
    private val hoveredLeadingIconColor: Color,
    private val focusedLeadingIconColor: Color,
    private val validLeadingIconColor: Color,
    private val errorLeadingIconColor: Color,

    //Trailing Icon Colors
    private val defaultTrailingIconColor: Color,
    private val hoveredTrailingIconColor: Color,
    private val focusedTrailingIconColor: Color,
    private val validTrailingIconColor: Color,
    private val errorTrailingIconColor: Color,

    //Placeholder Colors
    private val defaultPlaceholderColor: Color,
    private val hoveredPlaceholderColor: Color,
    private val focusedPlaceholderColor: Color,
    private val validPlaceholderColor: Color,
    private val errorPlaceholderColor: Color,

    //Suffix Colors
    private val defaultSuffixColor: Color,
    private val hoveredSuffixColor: Color,
    private val focusedSuffixColor: Color,
    private val validSuffixColor: Color,
    private val errorSuffixColor: Color,
) {
    /**
     * Returns the state icon based on the enabled, success, and error states.
     *
     * @param enabled Whether the input field is enabled.
     * @param isSuccess Whether the input field is in a valid state.
     * @param isError Whether the input field is in an error state.
     */
    @Composable
    internal fun stateIcon(
        enabled: Boolean,
        isSuccess: Boolean,
        isError: Boolean
    ): Painter? {

        val targetValue = when {
            !enabled -> null
            isError -> errorStateIcon
            isSuccess -> successStateIcon

            else -> null
        }
        return targetValue
    }

    /**
     * Returns the color of the state icon based on the enabled, valid, and error states.
     *
     * @param enabled Whether the input field is enabled.
     * @param isValid Whether the input field is in a valid state.
     * @param isError Whether the input field is in an error state.
     */
    @Composable
    internal fun stateIconColor(
        enabled: Boolean,
        isValid: Boolean,
        isError: Boolean
    ): Color {

        val targetValue = when {
            !enabled -> Color.Transparent
            isError -> errorStateIconColor
            isValid -> successStateIconColor

            else -> Color.Transparent
        }
        return targetValue
    }

    /**
     * Returns the text color based on the enabled, valid, error, and interaction states.
     *
     * @param enabled Whether the input field is enabled.
     * @param isValid Whether the input field is in a valid state.
     * @param isError Whether the input field is in an error state.
     * @param interactionSource The [InteractionSource] to be used for the input field.
     */
    @Composable
    internal fun textColor(
        enabled: Boolean,
        isValid: Boolean,
        isError: Boolean,
        interactionSource: InteractionSource
    ): Color {
        val focused by interactionSource.collectIsFocusedAsState()
        val hovered by interactionSource.collectIsHoveredAsState()

        val targetValue = when {
            !enabled -> defaultTextColor
            isError -> errorTextColor
            isValid -> validTextColor
            hovered -> hoveredTextColor
            focused -> focusedTextColor

            else -> defaultTextColor
        }
        return targetValue
    }

    /**
     * Returns the container color based on the enabled, valid, error, and interaction states.
     *
     * @param enabled Whether the input field is enabled.
     * @param isValid Whether the input field is in a valid state.
     * @param isError Whether the input field is in an error state.
     * @param interactionSource The [InteractionSource] to be used for the input field.
     */
    @Composable
    internal fun containerColor(
        enabled: Boolean,
        isValid: Boolean,
        isError: Boolean,
        interactionSource: InteractionSource
    ): Color {
        val focused by interactionSource.collectIsFocusedAsState()
        val hovered by interactionSource.collectIsHoveredAsState()

        val targetValue = when {
            !enabled -> defaultContainerColor
            isError -> errorContainerColor
            isValid -> validContainerColor
            hovered -> hoveredContainerColor
            focused -> focusedContainerColor
            else -> defaultContainerColor
        }
        return targetValue
    }

    /**
     * Returns the cursor color based on the error and valid states.
     *
     * @param isError Whether the input field is in an error state.
     * @param isValid Whether the input field is in a valid state.
     */
    @Composable
    internal fun cursorColor(isError: Boolean, isValid: Boolean): Color {
        val targetValue = when {
            isError -> errorCursorColor
            isValid -> validCursorColor
            else -> defaultCursorColor
        }
        return targetValue
    }

    /**
     * Returns the text selection colors.
     */
    internal val selectionColors: TextSelectionColors
        @Composable get() = textSelectionColors

    /**
     * Returns the indicator color based on the enabled, valid, error, and interaction states.
     *
     * @param enabled Whether the input field is enabled.
     * @param isValid Whether the input field is in a valid state.
     * @param isError Whether the input field is in an error state.
     * @param interactionSource The [InteractionSource] to be used for the input field.
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
            !enabled -> defaultIndicatorColor
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

    /**
     * Returns the leading icon color based on the enabled, valid, error, and interaction states.
     *
     * @param enabled Whether the input field is enabled.
     * @param isValid Whether the input field is in a valid state.
     * @param isError Whether the input field is in an error state.
     * @param interactionSource The [InteractionSource] to be used for the input field.
     */
    @Composable
    internal fun leadingIconColor(
        enabled: Boolean,
        isValid: Boolean,
        isError: Boolean,
        interactionSource: InteractionSource
    ): Color {
        val focused by interactionSource.collectIsFocusedAsState()
        val hovered by interactionSource.collectIsHoveredAsState()

        val target = when {
            !enabled -> defaultLeadingIconColor
            isError -> errorLeadingIconColor
            isValid -> validLeadingIconColor
            focused -> focusedLeadingIconColor
            hovered -> hoveredLeadingIconColor
            else -> defaultLeadingIconColor
        }

        return target
    }

    /**
     * Returns the trailing icon color based on the enabled, valid, error, and interaction states.
     *
     * @param enabled Whether the input field is enabled.
     * @param isValid Whether the input field is in a valid state.
     * @param isError Whether the input field is in an error state.
     * @param interactionSource The [InteractionSource] to be used for the input field.
     */
    @Composable
    internal fun trailingIconColor(
        enabled: Boolean,
        isValid: Boolean,
        isError: Boolean,
        interactionSource: InteractionSource
    ): Color {
        val focused by interactionSource.collectIsFocusedAsState()
        val hovered by interactionSource.collectIsHoveredAsState()

        val targetValue = when {
            !enabled -> defaultTrailingIconColor
            isError -> errorTrailingIconColor
            isValid -> validTrailingIconColor
            focused -> focusedTrailingIconColor
            hovered -> hoveredTrailingIconColor
            else -> defaultTrailingIconColor
        }

        return targetValue
    }

    /**
     * Returns the placeholder color based on the enabled, valid, error, and interaction states.
     *
     * @param enabled Whether the input field is enabled.
     * @param isError Whether the input field is in an error state.
     * @param isValid Whether the input field is in a valid state.
     * @param interactionSource The [InteractionSource] to be used for the input field.
     */
    @Composable
    internal fun placeholderColor(
        enabled: Boolean,
        isError: Boolean,
        isValid: Boolean,
        interactionSource: InteractionSource
    ): Color {
        val focused by interactionSource.collectIsFocusedAsState()
        val hovered by interactionSource.collectIsHoveredAsState()

        val targetValue = when {
            !enabled -> defaultPlaceholderColor
            isError -> errorPlaceholderColor
            isValid -> validPlaceholderColor
            focused -> focusedPlaceholderColor
            hovered -> hoveredPlaceholderColor
            else -> defaultPlaceholderColor
        }
        return targetValue
    }

    /**
     * Returns the suffix color based on the enabled, valid, error, and interaction states.
     *
     * @param enabled Whether the input field is enabled.
     * @param isValid Whether the input field is in a valid state.
     * @param isError Whether the input field is in an error state.
     * @param interactionSource The [InteractionSource] to be used for the input field.
     */
    @Composable
    internal fun suffixColor(
        enabled: Boolean,
        isValid: Boolean,
        isError: Boolean,
        interactionSource: InteractionSource
    ): Color {
        val focused by interactionSource.collectIsFocusedAsState()
        val hovered by interactionSource.collectIsHoveredAsState()

        val targetValue = when {
            !enabled -> defaultSuffixColor
            isError -> errorSuffixColor
            isValid -> validSuffixColor
            focused -> focusedSuffixColor
            hovered -> hoveredSuffixColor
            else -> defaultSuffixColor
        }
        return targetValue
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

        //Container Colors
        if (defaultContainerColor != other.defaultContainerColor) return false
        if (hoveredContainerColor != other.hoveredContainerColor) return false
        if (focusedContainerColor != other.focusedContainerColor) return false
        if (errorContainerColor != other.errorContainerColor) return false
        if (validContainerColor != other.validContainerColor) return false

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

        //Leading Icon Colors
        if (defaultLeadingIconColor != other.defaultLeadingIconColor) return false
        if (hoveredLeadingIconColor != other.hoveredLeadingIconColor) return false
        if (focusedLeadingIconColor != other.focusedLeadingIconColor) return false
        if (validLeadingIconColor != other.validLeadingIconColor) return false
        if (errorLeadingIconColor != other.errorLeadingIconColor) return false

        //Trailing Icon Colors
        if (defaultTrailingIconColor != other.defaultTrailingIconColor) return false
        if (hoveredTrailingIconColor != other.hoveredTrailingIconColor) return false
        if (focusedTrailingIconColor != other.focusedTrailingIconColor) return false
        if (validTrailingIconColor != other.validTrailingIconColor) return false
        if (errorTrailingIconColor != other.errorTrailingIconColor) return false

        //Placeholder Colors
        if (defaultPlaceholderColor != other.defaultPlaceholderColor) return false
        if (hoveredPlaceholderColor != other.hoveredPlaceholderColor) return false
        if (focusedPlaceholderColor != other.focusedPlaceholderColor) return false
        if (validPlaceholderColor != other.validPlaceholderColor) return false
        if (errorPlaceholderColor != other.errorPlaceholderColor) return false

        //Suffix Colors
        if (defaultSuffixColor != other.defaultSuffixColor) return false
        if (validSuffixColor != other.validSuffixColor) return false
        if (focusedSuffixColor != other.focusedSuffixColor) return false
        if (errorSuffixColor != other.errorSuffixColor) return false
        return validSuffixColor == other.validSuffixColor
    }

    override fun hashCode(): Int {
        //Text Colors
        var result = defaultTextColor.hashCode()
        result = 31 * result + hoveredTextColor.hashCode()
        result = 31 * result + focusedTextColor.hashCode()
        result = 31 * result + errorTextColor.hashCode()
        result = 31 * result + validTextColor.hashCode()

        //Container Colors
        result = 31 * result + defaultContainerColor.hashCode()
        result = 31 * result + hoveredContainerColor.hashCode()
        result = 31 * result + focusedContainerColor.hashCode()
        result = 31 * result + errorContainerColor.hashCode()
        result = 31 * result + validContainerColor.hashCode()

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

        //Leading Icon Colors
        result = 31 * result + defaultLeadingIconColor.hashCode()
        result = 31 * result + hoveredLeadingIconColor.hashCode()
        result = 31 * result + focusedLeadingIconColor.hashCode()
        result = 31 * result + validLeadingIconColor.hashCode()
        result = 31 * result + errorLeadingIconColor.hashCode()

        //Trailing Icon Colors
        result = 31 * result + defaultTrailingIconColor.hashCode()
        result = 31 * result + hoveredTrailingIconColor.hashCode()
        result = 31 * result + focusedTrailingIconColor.hashCode()
        result = 31 * result + errorTrailingIconColor.hashCode()
        result = 31 * result + validTrailingIconColor.hashCode()

        //Placeholder Colors
        result = 31 * result + defaultPlaceholderColor.hashCode()
        result = 31 * result + hoveredPlaceholderColor.hashCode()
        result = 31 * result + focusedPlaceholderColor.hashCode()
        result = 31 * result + errorPlaceholderColor.hashCode()
        result = 31 * result + validPlaceholderColor.hashCode()

        //Placeholder Colors
        result = 31 * result + defaultSuffixColor.hashCode()
        result = 31 * result + hoveredSuffixColor.hashCode()
        result = 31 * result + focusedSuffixColor.hashCode()
        result = 31 * result + errorSuffixColor.hashCode()
        result = 31 * result + validSuffixColor.hashCode()
        return result
    }

    private companion object {
        const val ANIMATION_DURATION = 150
    }
}

/**
 * A class that defines the sizes and styles for an input field.
 *
 * @property unfocusedBorderThickness The thickness of the border when the input field is not focused.
 * @property focusedBorderThickness The thickness of the border when the input field is focused.
 * @property shape The shape of the input field container.
 * @property contentPaddingValues The padding values for the content inside the input field.
 * @property leadingIconSizes The sizes for the leading icon in the input field.
 * @property trailingIconSizes The sizes for the trailing icon in the input field.
 * @property stateIconSizes The sizes for the state icon in the input field.
 * @property placeholderTextStyle The text style for the placeholder text in the input field.
 * @property inputTextStyle The text style for the input text in the input field.
 * @property suffixTextStyle The text style for the suffix text in the input field.
 */
@Stable
class InputSizes(
    internal val unfocusedBorderThickness: Dp,
    internal val focusedBorderThickness: Dp,

    internal val shape: Shape,
    internal val contentPaddingValues: PaddingValues,

    internal val leadingIconSizes: IconSizes,
    internal val trailingIconSizes: IconSizes,
    internal val stateIconSizes: IconSizes,

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
        if (leadingIconSizes != other.leadingIconSizes) return false
        if (trailingIconSizes != other.trailingIconSizes) return false
        if (stateIconSizes != other.stateIconSizes) return false

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
        result = 31 * result + leadingIconSizes.hashCode()
        result = 31 * result + trailingIconSizes.hashCode()
        result = 31 * result + stateIconSizes.hashCode()

        //Indicator Colors
        result = 31 * result + placeholderTextStyle.hashCode()
        result = 31 * result + inputTextStyle.hashCode()
        result = 31 * result + suffixTextStyle.hashCode()
        return result
    }
}