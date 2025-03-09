package io.github.madmaximuus.persian.button

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.icon.IconDefaults
import io.github.madmaximuus.persian.icon.IconSizes
import io.github.madmaximuus.persian.progressIndicator.CircularProgressBarSizes
import io.github.madmaximuus.persian.progressIndicator.ProgressIndicatorDefaults

/**
 * Contains the default values used by all 4 button types.
 */
object ButtonDefaults {

    /**
     * Creates a [ButtonColors] that represents the default container, border and content colors used in a
     * primary [Button].
     *
     * @param containerColor the container color of this primary [Button].
     * @param contentColor the content color of this primary [Button].
     * @param borderColor the border color of this primary [Button].
     */
    @Composable
    fun primaryColors(
        containerColor: Color = PersianTheme.colorScheme.primary,
        contentColor: Color = PersianTheme.colorScheme.onPrimary,
        borderColor: Color = Color.Unspecified
    ) = ButtonColors(
        containerColor = containerColor,
        contentColor = contentColor,
        borderColor = borderColor
    )

    /**
     * Creates a [ButtonColors] that represents the default container, border and content colors used in a
     * secondary [Button].
     *
     * @param containerColor the container color of this secondary [Button].
     * @param contentColor the content color of this secondary [Button].
     * @param borderColor the border color of this secondary [Button].
     */
    @Composable
    fun secondaryColors(
        containerColor: Color = PersianTheme.colorScheme.primaryContainer,
        contentColor: Color = PersianTheme.colorScheme.onPrimaryContainer,
        borderColor: Color = Color.Unspecified
    ) = ButtonColors(
        containerColor = containerColor,
        contentColor = contentColor,
        borderColor = borderColor
    )

    /**
     * Creates a [ButtonColors] that represents the default container, border and content colors used in a
     * tertiary [Button].
     *
     * @param containerColor the container color of this tertiary [Button].
     * @param contentColor the content color of this tertiary [Button].
     * @param borderColor the border color of this tertiary [Button].
     */
    @Composable
    fun tertiaryColors(
        containerColor: Color = Color.Transparent,
        contentColor: Color = PersianTheme.colorScheme.primary,
        borderColor: Color = Color.Unspecified
    ) = ButtonColors(
        containerColor = containerColor,
        contentColor = contentColor,
        borderColor = borderColor
    )

    /**
     * Creates a [ButtonColors] that represents the default container, border and content colors used in a
     * outlined [Button].
     *
     * @param containerColor the container color of this outlined [Button].
     * @param contentColor the content color of this outlined [Button].
     * @param borderColor the border color of this outlined [Button].
     */
    @Composable
    fun outlinedColors(
        containerColor: Color = Color.Transparent,
        contentColor: Color = PersianTheme.colorScheme.primary,
        borderColor: Color = PersianTheme.colorScheme.primary
    ) = ButtonColors(
        containerColor = containerColor,
        contentColor = contentColor,
        borderColor = borderColor
    )

    /**
     * Creates a [ButtonSizes] that represents the default container and content sizes used in a button.
     *
     * @param textStyle the primary text style of this button.
     * @param additionInfoTextStyle the secondary text style of this button.
     * @param height the height of this button.
     * @param loaderSize the size of inner loader of this button.
     * @param iconSizes the icon size color of this button.
     * @param shape the shape of this button.
     * @param contentPadding the spacing values to apply internally between the container and the
     * content of this button.
     */
    @Composable
    fun largeSizes(
        textStyle: TextStyle = PersianTheme.typography.buttonLarge,
        additionInfoTextStyle: TextStyle = PersianTheme.typography.labelMedium,
        height: Dp = 52.dp,
        loaderSize: CircularProgressBarSizes = ProgressIndicatorDefaults.circularLarge(
            diameter = 32.dp,
            strokeSize = 3.dp
        ),
        iconSizes: IconSizes = IconDefaults.size28(),
        shape: Shape = PersianTheme.shapes.shape16,
        contentPadding: PaddingValues = PaddingValues(
            horizontal = PersianTheme.spacing.size24,
            vertical = 0.dp
        ),
        borderThickness: Dp = 0.dp
    ) = ButtonSizes(
        textStyle = textStyle,
        additionInfoTextStyle = additionInfoTextStyle,
        height = height,
        loaderSize = loaderSize,
        iconSizes = iconSizes,
        shape = shape,
        contentPadding = contentPadding,
        borderThickness = borderThickness
    )

    /**
     * Creates a [ButtonSizes] that represents the default container and content sizes used in a button.
     *
     * @param textStyle the primary text style of this button.
     * @param additionInfoTextStyle the secondary text style of this button.
     * @param height the height of this button.
     * @param loaderSize the size of inner loader of this button.
     * @param iconSizes the icon size color of this button.
     * @param shape the shape of this button.
     * @param contentPadding the spacing values to apply internally between the container and the
     * content of this button.
     */
    @Composable
    fun mediumSizes(
        textStyle: TextStyle = PersianTheme.typography.buttonMedium,
        additionInfoTextStyle: TextStyle = PersianTheme.typography.labelSmall,
        height: Dp = 44.dp,
        loaderSize: CircularProgressBarSizes = ProgressIndicatorDefaults.circularMedium(
            diameter = 26.dp,
            strokeSize = 2.5.dp
        ),
        iconSizes: IconSizes = IconDefaults.size20(),
        shape: Shape = PersianTheme.shapes.shape14,
        contentPadding: PaddingValues = PaddingValues(
            horizontal = PersianTheme.spacing.size20,
            vertical = 0.dp
        ),
        borderThickness: Dp = 0.dp
    ) = ButtonSizes(
        textStyle = textStyle,
        additionInfoTextStyle = additionInfoTextStyle,
        height = height,
        loaderSize = loaderSize,
        iconSizes = iconSizes,
        shape = shape,
        contentPadding = contentPadding,
        borderThickness = borderThickness
    )

    /**
     * Creates a [ButtonSizes] that represents the default container and content sizes used in a button.
     *
     * @param textStyle the main text style of this button.
     * @param height the height of this button.
     * @param loaderSize the size of inner loader of this button.
     * @param iconSizes the icon size color of this button.
     * @param shape the shape of this button.
     * @param contentPadding the spacing values to apply internally between the container and the
     * content of this button.
     */
    @Composable
    fun smallSizes(
        textStyle: TextStyle = PersianTheme.typography.buttonSmall,
        height: Dp = 36.dp,
        loaderSize: CircularProgressBarSizes = ProgressIndicatorDefaults.circularSmall(
            diameter = 20.dp,
        ),
        iconSizes: IconSizes = IconDefaults.size18(),
        shape: Shape = PersianTheme.shapes.shape12,
        contentPadding: PaddingValues = PaddingValues(
            horizontal = PersianTheme.spacing.size16,
            vertical = 0.dp
        ),
        borderThickness: Dp = 0.dp
    ) = ButtonSizes(
        textStyle = textStyle,
        height = height,
        loaderSize = loaderSize,
        iconSizes = iconSizes,
        shape = shape,
        contentPadding = contentPadding,
        borderThickness = borderThickness
    )
}

/**
 * Represents the container and content sized used in a button in different size variant.
 *
 * @param textStyle the primary text style of this button.
 * @param additionInfoTextStyle the secondary text style of this button.
 * @param height the height of this button.
 * @param iconSizes the icon size color of this button.
 * @param loaderSize the size of inner loader of this button.
 * @param shape the shape of this button.
 * @param borderThickness the thickness of border of this button.
 * @param contentPadding the spacing values to apply internally between the container and the
 * @constructor create an instance with arbitrary colors.
 * - See [ButtonDefaults.smallSizes] for the default sizes used in a small button.
 * - See [ButtonDefaults.mediumSizes] for the default sizes used in a medium button.
 * - See [ButtonDefaults.largeSizes] for the default sizes used in a large button.
 */
@Immutable
class ButtonSizes internal constructor(
    internal val textStyle: TextStyle,
    internal val additionInfoTextStyle: TextStyle? = null,
    internal val height: Dp,
    internal val iconSizes: IconSizes,
    internal val loaderSize: CircularProgressBarSizes,
    internal val shape: Shape,
    internal val borderThickness: Dp,
    internal val contentPadding: PaddingValues,
) {
    /**
     * Returns a copy of this [ButtonSizes], optionally overriding some of the values.
     */
    fun copy(
        textStyle: TextStyle = this.textStyle,
        additionInfoTextStyle: TextStyle? = this.additionInfoTextStyle,
        height: Dp = this.height,
        iconSizes: IconSizes = this.iconSizes,
        loaderSize: CircularProgressBarSizes = this.loaderSize,
        shape: Shape = this.shape,
        contentPadding: PaddingValues = this.contentPadding,
        borderThickness: Dp = this.borderThickness
    ) = ButtonSizes(
        textStyle = textStyle,
        additionInfoTextStyle = additionInfoTextStyle,
        height = height,
        iconSizes = iconSizes,
        loaderSize = loaderSize,
        shape = shape,
        contentPadding = contentPadding,
        borderThickness = borderThickness
    )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is ButtonSizes) return false

        if (textStyle != other.textStyle) return false
        if (additionInfoTextStyle != other.additionInfoTextStyle) return false
        if (height != other.height) return false
        if (iconSizes != other.iconSizes) return false
        if (loaderSize != other.loaderSize) return false
        if (shape != other.shape) return false
        if (borderThickness != other.borderThickness) return false
        return contentPadding == other.contentPadding
    }

    override fun hashCode(): Int {
        var result = textStyle.hashCode()
        result = 31 * result + additionInfoTextStyle.hashCode()
        result = 31 * result + height.hashCode()
        result = 31 * result + iconSizes.hashCode()
        result = 31 * result + loaderSize.hashCode()
        result = 31 * result + shape.hashCode()
        result = 31 * result + borderThickness.hashCode()
        result = 31 * result + contentPadding.hashCode()
        return result
    }
}

/**
 * Represents the container and content colors used in a button in different states.
 *
 * @param containerColor the container color of this button.
 * @param contentColor the content color of this button.
 * @param borderColor the border color of this button.
 * @constructor create an instance with arbitrary colors.
 * - See [ButtonDefaults.primaryColors] for the default colors used in a primary [Button].
 * - See [ButtonDefaults.secondaryColors] for the default colors used in a secondary [Button].
 * - See [ButtonDefaults.tertiaryColors] for the default colors used in a tertiary [Button].
 * - See [ButtonDefaults.outlinedColors] for the default colors used in a outlined [Button].
 */
@Immutable
class ButtonColors internal constructor(
    internal val contentColor: Color,
    internal val containerColor: Color,
    internal val borderColor: Color,
) {

    /**
     * Returns a copy of this [ButtonColors], optionally overriding some of the values.
     */
    fun copy(
        contentColor: Color = this.contentColor,
        containerColor: Color = this.containerColor,
        borderColor: Color = this.borderColor
    ) = ButtonColors(
        contentColor = contentColor,
        containerColor = containerColor,
        borderColor = borderColor
    )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is ButtonColors) return false

        if (contentColor != other.contentColor) return false
        if (borderColor != other.borderColor) return false
        return containerColor == other.containerColor
    }

    override fun hashCode(): Int {
        var result = contentColor.hashCode()
        result = 31 * result + containerColor.hashCode()
        result = 31 * result + borderColor.hashCode()
        return result
    }
}