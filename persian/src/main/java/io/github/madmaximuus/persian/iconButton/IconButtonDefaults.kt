package io.github.madmaximuus.persian.iconButton

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.icon.IconDefaults
import io.github.madmaximuus.persian.icon.IconSizes

/**
 * Contains all default values used by icon button.
 */
object IconButtonDefaults {

    /**
     * A composable function that creates a small-sized configuration for icon buttons.
     *
     * This function returns an [IconButtonSizes] object with predefined small sizes, icon sizes, and shape.
     * The default values are set to create a small button suitable for compact layouts.
     *
     * @param size The overall size of the button.
     * @param borderStrokeThickness The thickness of button border.
     * @param iconSizes The sizes of the icon within the button.
     * @param shape The shape of the button.
     */
    @Composable
    fun smallSizes(
        size: Dp = 36.dp,
        borderStrokeThickness: Dp = 1.dp,
        iconSizes: IconSizes = IconDefaults.size20(),
        shape: Shape = PersianTheme.shapes.shape12,
    ) = IconButtonSizes(
        size = size,
        borderStrokeThickness = borderStrokeThickness,
        iconSizes = iconSizes,
        shape = shape,
    )

    /**
     * A composable function that creates a medium-sized configuration for icon buttons.
     *
     * This function returns an [IconButtonSizes] object with predefined medium sizes, icon sizes, and shape.
     * The default values are set to create a medium button suitable for standard layouts.
     *
     * @param size The overall size of the button.
     * @param borderStrokeThickness The thickness of button border.
     * @param iconSizes The sizes of the icon within the button.
     * @param shape The shape of the button.
     */
    @Composable
    fun mediumSizes(
        size: Dp = 44.dp,
        borderStrokeThickness: Dp = 1.dp,
        iconSizes: IconSizes = IconDefaults.size24(),
        shape: Shape = PersianTheme.shapes.shape14,
    ) = IconButtonSizes(
        size = size,
        iconSizes = iconSizes,
        borderStrokeThickness = borderStrokeThickness,
        shape = shape,
    )

    /**
     * A composable function that creates a large-sized configuration for icon buttons.
     *
     * This function returns an [IconButtonSizes] object with predefined large sizes, icon sizes, and shape.
     * The default values are set to create a large button suitable for spacious layouts.
     *
     * @param size The overall size of the button.
     * @param borderStrokeThickness The thickness of button border.
     * @param iconSizes The sizes of the icon within the button.
     * @param shape The shape of the button.
     */
    @Composable
    fun largeSizes(
        size: Dp = 52.dp,
        borderStrokeThickness: Dp = 1.dp,
        iconSizes: IconSizes = IconDefaults.size28(),
        shape: Shape = PersianTheme.shapes.shape16
    ) = IconButtonSizes(
        size = size,
        iconSizes = iconSizes,
        borderStrokeThickness = borderStrokeThickness,
        shape = shape,
    )

    /**
     * A composable function that creates a color configuration for primary icon buttons.
     *
     * This function returns an [IconButtonColors] object with predefined colors for the primary icon button.
     * The default values are set to match the primary color scheme of the theme.
     *
     * @param containerColor The background color of the button when it is enabled.
     * @param contentColor The color of the icon within the button when it is enabled.
     * @param borderColor The color of the icon button border.
     */
    @Composable
    fun primaryIconButtonColors(
        containerColor: Color = PersianTheme.colorScheme.primary,
        contentColor: Color = PersianTheme.colorScheme.onPrimary,
        borderColor: Color = Color.Transparent
    ) = IconButtonColors(
        containerColor = containerColor,
        contentColor = contentColor,
        borderColor = borderColor
    )

    /**
     * A composable function that creates a color configuration for secondary icon buttons.
     *
     * This function returns an [IconButtonColors] object with predefined colors for the secondary icon button.
     * The default values are set to match the secondary color scheme of the theme.
     *
     * @param containerColor The background color of the button when it is enabled.
     * @param contentColor The color of the icon within the button when it is enabled.
     * @param borderColor The color of the icon button border.
     */
    @Composable
    fun secondaryIconButtonColors(
        containerColor: Color = PersianTheme.colorScheme.primaryContainer,
        contentColor: Color = PersianTheme.colorScheme.onPrimaryContainer,
        borderColor: Color = Color.Transparent
    ) = IconButtonColors(
        containerColor = containerColor,
        contentColor = contentColor,
        borderColor = borderColor
    )

    /**
     * A composable function that creates a color configuration for tertiary icon buttons.
     *
     * This function returns an [IconButtonColors] object with predefined colors for the tertiary icon button.
     * The default values are set to match the tertiary color scheme of the theme, with a transparent background.
     *
     * @param containerColor The background color of the button when it is enabled.
     * @param contentColor The color of the icon within the button when it is enabled.
     * @param borderColor The color of the icon button border.
     */
    @Composable
    fun tertiaryIconButtonColors(
        containerColor: Color = Color.Transparent,
        contentColor: Color = PersianTheme.colorScheme.primary,
        borderColor: Color = Color.Transparent
    ) = IconButtonColors(
        containerColor = containerColor,
        contentColor = contentColor,
        borderColor = borderColor
    )

    /**
     * A composable function that creates a color configuration for outlined icon buttons.
     *
     * This function returns an [IconButtonColors] object with predefined colors for the outlined icon button.
     * The default values are set to match the outlined color scheme of the theme, with a transparent background.
     *
     * @param containerColor The background color of the button when it is enabled.
     * @param contentColor The color of the icon within the button when it is enabled.
     * @param borderColor The color of the icon button border.
     */
    @Composable
    fun outlinedIconButtonColors(
        containerColor: Color = Color.Transparent,
        contentColor: Color = PersianTheme.colorScheme.primary,
        borderColor: Color = PersianTheme.colorScheme.primary
    ) = IconButtonColors(
        containerColor = containerColor,
        contentColor = contentColor,
        borderColor = borderColor
    )

    /**
     * A composable function that creates a color configuration for primary toggle icon buttons.
     *
     * This function returns a [ToggleIconButtonColors] object with predefined colors for the primary toggle icon button.
     * The default values are set to match the primary color scheme of the theme, including colors for both checked and unchecked states.
     *
     * @param containerColor The background color of the button when it is enabled and unchecked.
     * @param contentColor The color of the icon within the button when it is enabled and unchecked.
     * @param borderColor The color of the border within the button when it is enabled and unchecked.
     * @param checkedContainerColor The background color of the button when it is enabled and checked.
     * @param checkedContentColor The color of the icon within the button when it is enabled and checked.
     * @param checkedBorderColor The color of the border within the button when it is enabled and checked.
     */
    @Composable
    fun primaryToggleIconButtonColors(
        containerColor: Color = PersianTheme.colorScheme.surfaceContainerHighest,
        contentColor: Color = PersianTheme.colorScheme.primary,
        borderColor: Color = Color.Transparent,
        checkedContainerColor: Color = PersianTheme.colorScheme.primary,
        checkedContentColor: Color = PersianTheme.colorScheme.onPrimary,
        checkedBorderColor: Color = Color.Transparent
    ) = ToggleIconButtonColors(
        containerColor = containerColor,
        contentColor = contentColor,
        borderColor = borderColor,
        checkedContentColor = checkedContentColor,
        checkedContainerColor = checkedContainerColor,
        checkedBorderColor = checkedBorderColor
    )

    /**
     * A composable function that creates a color configuration for secondary toggle icon buttons.
     *
     * This function returns a [ToggleIconButtonColors] object with predefined colors for the secondary toggle icon button.
     * The default values are set to match the secondary color scheme of the theme, including colors for both checked and unchecked states.
     *
     * @param containerColor The background color of the button when it is enabled and unchecked.
     * @param contentColor The color of the icon within the button when it is enabled and unchecked.
     * @param borderColor The color of the border within the button when it is enabled and unchecked.
     * @param checkedContainerColor The background color of the button when it is enabled and checked.
     * @param checkedContentColor The color of the icon within the button when it is enabled and checked.
     * @param checkedBorderColor The color of the border within the button when it is enabled and checked.
     */
    @Composable
    fun secondaryToggleIconButtonColors(
        containerColor: Color = PersianTheme.colorScheme.surfaceContainerHighest,
        contentColor: Color = PersianTheme.colorScheme.onSurface,
        borderColor: Color = Color.Transparent,
        checkedContainerColor: Color = PersianTheme.colorScheme.primaryContainer,
        checkedContentColor: Color = PersianTheme.colorScheme.onPrimaryContainer,
        checkedBorderColor: Color = Color.Transparent
    ) = ToggleIconButtonColors(
        containerColor = containerColor,
        contentColor = contentColor,
        borderColor = borderColor,
        checkedContentColor = checkedContentColor,
        checkedContainerColor = checkedContainerColor,
        checkedBorderColor = checkedBorderColor
    )

    /**
     * A composable function that creates a color configuration for tertiary toggle icon buttons.
     *
     * This function returns a [ToggleIconButtonColors] object with predefined colors for the tertiary toggle icon button.
     * The default values are set to match the tertiary color scheme of the theme, including colors for both checked and unchecked states.
     * The background color is transparent for both enabled and checked states.
     *
     * @param containerColor The background color of the button when it is enabled and unchecked.
     * @param contentColor The color of the icon within the button when it is enabled and unchecked.
     * @param borderColor The color of the border within the button when it is enabled and unchecked.
     * @param checkedContainerColor The background color of the button when it is enabled and checked.
     * @param checkedContentColor The color of the icon within the button when it is enabled and checked.
     * @param checkedBorderColor The color of the border within the button when it is enabled and checked.
     */
    @Composable
    fun tertiaryToggleIconButtonColors(
        containerColor: Color = Color.Transparent,
        borderColor: Color = Color.Transparent,
        contentColor: Color = PersianTheme.colorScheme.primary,
        checkedContainerColor: Color = Color.Transparent,
        checkedContentColor: Color = PersianTheme.colorScheme.primary,
        checkedBorderColor: Color = Color.Transparent,
    ) = ToggleIconButtonColors(
        containerColor = containerColor,
        contentColor = contentColor,
        borderColor = borderColor,
        checkedContentColor = checkedContentColor,
        checkedContainerColor = checkedContainerColor,
        checkedBorderColor = checkedBorderColor
    )

    /**
     * A composable function that creates a color configuration for outlined toggle icon buttons.
     *
     * This function returns a [ToggleIconButtonColors] object with predefined colors for the outlined toggle icon button.
     * The default values are set to match the outlined color scheme of the theme, including colors for both checked and unchecked states.
     * The background color is transparent when the button is unchecked and enabled.
     *
     * @param containerColor The background color of the button when it is enabled and unchecked.
     * @param contentColor The color of the icon within the button when it is enabled and unchecked.
     * @param borderColor The color of the border within the button when it is enabled and unchecked.
     * @param checkedContainerColor The background color of the button when it is enabled and checked.
     * @param checkedContentColor The color of the icon within the button when it is enabled and checked.
     * @param checkedBorderColor The color of the border within the button when it is enabled and checked.
     */
    @Composable
    fun outlinedToggleIconButtonColors(
        containerColor: Color = Color.Transparent,
        contentColor: Color = PersianTheme.colorScheme.primary,
        borderColor: Color = PersianTheme.colorScheme.primary,
        checkedContainerColor: Color = PersianTheme.colorScheme.primary,
        checkedContentColor: Color = PersianTheme.colorScheme.onPrimary,
        checkedBorderColor: Color = PersianTheme.colorScheme.primary
    ) = ToggleIconButtonColors(
        containerColor = containerColor,
        contentColor = contentColor,
        borderColor = borderColor,
        checkedContentColor = checkedContentColor,
        checkedContainerColor = checkedContainerColor,
        checkedBorderColor = checkedBorderColor
    )
}

/**
 * An immutable class that defines the sizes and shape for an icon button.
 *
 * This class encapsulates the size of the button, the sizes of the icon within the button, and the shape of the button.
 * It is used to configure the appearance of icon buttons in a consistent manner.
 *
 * @property size The overall size of the button.
 * @property iconSizes The sizes of the icon within the button.
 * @property shape The shape of the button.
 */
@Immutable
class IconButtonSizes internal constructor(
    internal val size: Dp,
    internal val borderStrokeThickness: Dp,
    internal val iconSizes: IconSizes,
    internal val shape: Shape,
)

/**
 * An immutable class that defines the colors for an icon button.
 *
 * This class encapsulates the colors for the button's container and content, both when the button is enabled
 * and when it is disabled. It provides methods to retrieve the appropriate colors based on the enabled state.
 *
 * @property containerColor The background color of the button when it is enabled.
 * @property contentColor The color of the icon within the button when it is enabled.
 */
@Immutable
class IconButtonColors internal constructor(
    internal val borderColor: Color,
    internal val containerColor: Color,
    internal val contentColor: Color,
) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is IconButtonColors) return false

        if (containerColor != other.containerColor) return false
        if (borderColor != other.borderColor) return false
        return contentColor == other.contentColor
    }

    override fun hashCode(): Int {
        var result = containerColor.hashCode()
        result = 31 * result + contentColor.hashCode()
        result = 31 * result + borderColor.hashCode()

        return result
    }
}

/**
 * An immutable class that defines the colors for a toggle icon button.
 *
 * This class encapsulates the colors for the button's container and content, both when the button is enabled
 * and when it is disabled, as well as when the button is checked and unchecked. It provides methods to retrieve
 * the appropriate colors based on the enabled and checked states.
 *
 * @property containerColor The background color of the button when it is enabled and unchecked.
 * @property contentColor The color of the icon within the button when it is enabled and unchecked.
 * @property checkedContainerColor The background color of the button when it is enabled and checked.
 * @property checkedContentColor The color of the icon within the button when it is enabled and checked.
 */
@Immutable
class ToggleIconButtonColors internal constructor(
    private val containerColor: Color,
    private val contentColor: Color,
    private val borderColor: Color,
    private val checkedContainerColor: Color,
    private val checkedContentColor: Color,
    private val checkedBorderColor: Color
) {

    /**
     * Returns the container color based on the checked state of the button.
     *
     * @param checked Whether the button is checked.
     */
    @Stable
    internal fun containerColor(checked: Boolean): Color {

        return when {
            !checked -> containerColor
            else -> checkedContainerColor
        }
    }

    /**
     * Returns the content color based on the checked state of the button.
     *
     * @param checked Whether the button is checked.
     */
    @Stable
    internal fun contentColor(checked: Boolean): Color {
        return when {
            !checked -> contentColor
            else -> checkedContentColor
        }
    }

    /**
     * Returns the border color based on the checked state of the button.
     *
     * @param checked Whether the button is checked.
     */
    @Stable
    internal fun borderColor(checked: Boolean): Color {
        return when {
            !checked -> borderColor
            else -> checkedBorderColor
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is ToggleIconButtonColors) return false

        if (containerColor != other.containerColor) return false
        if (contentColor != other.contentColor) return false
        if (borderColor != other.borderColor) return false
        if (checkedContainerColor != other.checkedContainerColor) return false
        if (checkedBorderColor != other.checkedBorderColor) return false
        return checkedContentColor == other.checkedContentColor
    }

    override fun hashCode(): Int {
        var result = containerColor.hashCode()
        result = 31 * result + contentColor.hashCode()
        result = 31 * result + checkedContainerColor.hashCode()
        result = 31 * result + checkedContentColor.hashCode()
        result = 31 * result + borderColor.hashCode()
        result = 31 * result + checkedBorderColor.hashCode()

        return result
    }
}

