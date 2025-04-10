package io.github.madmaximuus.persian.formItem

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import io.github.madmaximuus.persian.foundation.PersianTheme

/**
 * Contains all default values used by [FormItem].
 */
object FormItemDefaults {

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
    ) = FormColors(
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
        subheadTextStyle: TextStyle = PersianTheme.typography.labelMedium,
        captionSizes: CaptionSizes = captionSizes()
    ) = FormSizes(
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
     * @param counterColor The color of the counter when enabled.
     * @param errorCounterColor The color of the counter when in an error state.
     */
    @Composable
    fun captionColors(
        textColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        errorColor: Color = PersianTheme.colorScheme.error,
        counterColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        errorCounterColor: Color = PersianTheme.colorScheme.error,
    ) = CaptionColors(
        textColor = textColor,
        errorColor = errorColor,
        counterColor = counterColor,
        errorCounterColor = errorCounterColor,
    )

    @Composable
    fun captionSizes(
        captionTextStyle: TextStyle = PersianTheme.typography.bodySmall,
        counterTextStyle: TextStyle = PersianTheme.typography.bodySmall
    ) = CaptionSizes(
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
     * @param requiredColor The color of the required indicator when enabled.
     */
    @Composable
    fun subheadColors(
        textColor: Color = PersianTheme.colorScheme.onSurfaceVariant,

        requiredColor: Color = PersianTheme.colorScheme.error,
    ) = SubheadColors(
        textColor = textColor,
        requiredColor = requiredColor,
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
 * @property counterColor The color of the counter when enabled.
 * @property errorCounterColor The color of the counter when in an error state.
 */
@Immutable
class CaptionColors internal constructor(
    private val textColor: Color,
    private val errorColor: Color,

    private val counterColor: Color,
    private val errorCounterColor: Color,
) {
    /**
     * Composable function to get the text color based on the enabled and error states.
     *
     * @param enabled Indicates whether the text is enabled.
     * @param isError Indicates whether the text is in an error state.
     */
    @Stable
    internal fun textColor(
        enabled: Boolean,
        isError: Boolean
    ): Color {
        val target = when {
            !enabled -> textColor
            isError -> errorColor
            else -> textColor
        }
        return target
    }

    /**
     * Composable function to get the counter color based on the enabled and error states.
     *
     * @param enabled Indicates whether the counter is enabled.
     * @param isError Indicates whether the counter is in an error state.
     */
    @Stable
    internal fun counterColor(
        enabled: Boolean,
        isError: Boolean
    ): Color {
        val target = when {
            !enabled -> counterColor
            isError -> errorCounterColor
            else -> counterColor
        }
        return target
    }
}

/**
 * Immutable class representing the colors for a form subhead.
 *
 * This class encapsulates the colors used for the text and required indicator of a form subhead,
 * including their enabled and disabled states.
 *
 * @property textColor The color of the text when enabled.
 * @property requiredColor The color of the required indicator when enabled.
 */
@Immutable
class SubheadColors internal constructor(
    internal val textColor: Color,

    internal val requiredColor: Color,
)