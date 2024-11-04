package io.github.madmaximuus.persian.forms

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.State
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.state38

/**
 * Contains all default values used by [Form].
 */
object FormDefaults {

    /**
     * Composable function that creates and returns a [FormColors] instance.
     *
     * @param subheadColors The colors for the subhead.
     * @param captionColors The colors for the caption.
     */
    @Composable
    fun formColors(
        subheadColors: SubheadColors = subheadColors(),
        captionColors: CaptionColors = captionColors()
    ): FormColors =
        FormColors(
            subheadColors = subheadColors,
            captionColors = captionColors
        )

    /**
     * Composable function that creates and returns a [FormSizes] instance.
     *
     * This function allows customization of subhead text style and caption sizes for forms.
     *
     * @param subheadTextStyle The text style for the subhead.
     * @param captionSizes The sizes for the caption.
     */
    @Composable
    fun formSizes(
        subheadTextStyle: TextStyle = PersianTheme.typography.labelLarge,
        captionSizes: CaptionSizes = captionSizes()
    ): FormSizes =
        FormSizes(
            subheadTextStyle = subheadTextStyle,
            captionSizes = captionSizes
        )

    /**
     * Composable function to create an instance of [CaptionColors] with customizable colors.
     *
     * This function allows you to specify the colors for the text and counter of a form caption,
     * including their enabled, disabled, and error states. If no custom colors are provided,
     * default colors from the [PersianTheme] are used.
     *
     * @param textColor The color of the text when enabled.
     * @param errorColor The color of the text when in an error state.
     * @param disabledColor The color of the text when disabled.
     * @param counterColor The color of the counter when enabled.
     * @param errorCounterColor The color of the counter when in an error state.
     * @param disabledCounterColor The color of the counter when disabled.
     */
    @Composable
    fun captionColors(
        textColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        errorColor: Color = PersianTheme.colorScheme.error,
        disabledColor: Color = PersianTheme.colorScheme.onSurface.state38,
        counterColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        errorCounterColor: Color = PersianTheme.colorScheme.error,
        disabledCounterColor: Color = PersianTheme.colorScheme.onSurface.state38,
    ): CaptionColors =
        CaptionColors(
            textColor = textColor,
            errorColor = errorColor,
            disabledColor = disabledColor,
            counterColor = counterColor,
            errorCounterColor = errorCounterColor,
            disabledCounterColor = disabledCounterColor
        )

    @Composable
    fun captionSizes(
        captionTextStyle: TextStyle = PersianTheme.typography.bodySmall,
        counterTextStyle: TextStyle = PersianTheme.typography.bodySmall
    ): CaptionSizes =
        CaptionSizes(
            captionTextStyle = captionTextStyle,
            counterTextStyle = counterTextStyle
        )

    /**
     * Composable function to create an instance of [SubheadColors] with customizable colors.
     *
     * This function allows you to specify the colors for the text and required indicator of a form subhead,
     * including their enabled and disabled states. If no custom colors are provided,
     * default colors from the [PersianTheme] are used.
     *
     * @param textColor The color of the text when enabled.
     * @param disabledColor The color of the text when disabled.
     * @param requiredColor The color of the required indicator when enabled.
     * @param requiredDisabledColor The color of the required indicator when disabled.
     */
    @Composable
    fun subheadColors(
        textColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        disabledColor: Color = PersianTheme.colorScheme.onSurface.state38,

        requiredColor: Color = PersianTheme.colorScheme.error,
        requiredDisabledColor: Color = PersianTheme.colorScheme.error.state38,
    ): SubheadColors =
        SubheadColors(
            textColor = textColor,
            disabledColor = disabledColor,
            requiredColor = requiredColor,
            requiredDisabledColor = requiredDisabledColor,
        )
}

/**
 * An immutable class that holds the colors for form elements.
 *
 * This class is intended for internal use and provides properties for subhead colors and caption colors.
 *
 * @property subheadColors The colors for the subhead, encapsulated in a [SubheadColors] instance.
 * @property captionColors The colors for the caption, encapsulated in a [CaptionColors] instance.
 */
@Immutable
class FormColors internal constructor(
    internal val subheadColors: SubheadColors,
    internal val captionColors: CaptionColors
)

/**
 * An immutable class that holds the sizes for form elements.
 *
 * @property subheadTextStyle The text style for the subhead.
 * @property captionSizes The sizes for the caption, encapsulated in a [CaptionSizes] instance.
 */
@Immutable
class FormSizes internal constructor(
    internal val subheadTextStyle: TextStyle,
    internal val captionSizes: CaptionSizes
)

/**
 * An immutable class that holds the sizes for caption text styles.
 *ø
 * @property captionTextStyle The text style for the caption.
 * @property counterTextStyle The text style for the counter.
 */
@Immutable
class CaptionSizes internal constructor(
    internal val captionTextStyle: TextStyle,
    internal val counterTextStyle: TextStyle
)

/**
 * Immutable class representing the colors for a form caption.
 *
 * This class encapsulates the colors used for the text and counter of a form caption,
 * including their enabled, disabled, and error states.
 *
 * @property textColor The color of the text when enabled.
 * @property errorColor The color of the text when in an error state.
 * @property disabledColor The color of the text when disabled.
 * @property counterColor The color of the counter when enabled.
 * @property errorCounterColor The color of the counter when in an error state.
 * @property disabledCounterColor The color of the counter when disabled.
 */
@Immutable
class CaptionColors internal constructor(
    private val textColor: Color,
    private val errorColor: Color,
    private val disabledColor: Color,

    private val counterColor: Color,
    private val errorCounterColor: Color,
    private val disabledCounterColor: Color
) {
    /**
     * Composable function to get the text color based on the enabled and error states.
     *
     * @param enabled Indicates whether the text is enabled.
     * @param isError Indicates whether the text is in an error state.
     */
    @Composable
    internal fun textColor(
        enabled: Boolean,
        isError: Boolean
    ): State<Color> {
        val target = when {
            !enabled -> disabledColor
            isError -> errorColor
            else -> textColor
        }
        return rememberUpdatedState(newValue = target)
    }

    /**
     * Composable function to get the counter color based on the enabled and error states.
     *
     * @param enabled Indicates whether the counter is enabled.
     * @param isError Indicates whether the counter is in an error state.
     */
    @Composable
    internal fun counterColor(
        enabled: Boolean,
        isError: Boolean
    ): State<Color> {
        val target = when {
            !enabled -> disabledCounterColor
            isError -> errorCounterColor
            else -> counterColor
        }
        return rememberUpdatedState(newValue = target)
    }
}

/**
 * Immutable class representing the colors for a form subhead.
 *
 * This class encapsulates the colors used for the text and required indicator of a form subhead,
 * including their enabled and disabled states.
 *
 * @property textColor The color of the text when enabled.
 * @property disabledColor The color of the text when disabled.
 * @property requiredColor The color of the required indicator when enabled.
 * @property requiredDisabledColor The color of the required indicator when disabled.
 */
@Immutable
class SubheadColors internal constructor(
    private val textColor: Color,
    private val disabledColor: Color,

    private val requiredColor: Color,
    private val requiredDisabledColor: Color
) {
    /**
     * Composable function to get the text color based on the enabled state.
     *
     * @param enabled Indicates whether the text is enabled.
     */
    @Composable
    internal fun textColor(
        enabled: Boolean
    ): State<Color> {
        val target = when {
            !enabled -> disabledColor
            else -> textColor
        }
        return rememberUpdatedState(newValue = target)
    }

    /**
     * Composable function to get the required indicator color based on the enabled state.
     *
     * @param enabled Indicates whether the required indicator is enabled.
     */
    @Composable
    internal fun requiredColor(
        enabled: Boolean
    ): State<Color> {
        val target = when {
            !enabled -> requiredDisabledColor
            else -> requiredColor
        }
        return rememberUpdatedState(newValue = target)
    }
}