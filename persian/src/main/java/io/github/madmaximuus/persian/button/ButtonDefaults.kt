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
     * Creates a [ButtonColors] that represents the default container and content colors used in a
     * [PrimaryButton].
     *
     * @param containerColor the container color of this [PrimaryButton] when enabled.
     * @param contentColor the content color of this [PrimaryButton] when enabled.
     */
    @Composable
    fun primaryColors(
        containerColor: Color = PersianTheme.colorScheme.primary,
        contentColor: Color = PersianTheme.colorScheme.onPrimary,
    ): ButtonColors =
        ButtonColors(
            containerColor = containerColor,
            contentColor = contentColor
        )

    /**
     * Creates a [ButtonColors] that represents the default container and content colors used in a
     * [SecondaryButton].
     *
     * @param containerColor the container color of this [SecondaryButton] when enabled.
     * @param contentColor the content color of this [SecondaryButton] when enabled.
     */
    @Composable
    fun secondaryColors(
        containerColor: Color = PersianTheme.colorScheme.primaryContainer,
        contentColor: Color = PersianTheme.colorScheme.onPrimaryContainer,
    ): ButtonColors =
        ButtonColors(
            containerColor = containerColor,
            contentColor = contentColor,
        )

    /**
     * Creates a [ButtonColors] that represents the default container and content colors used in a
     * [TertiaryButton].
     *
     * @param containerColor the container color of this [TertiaryButton] when enabled.
     * @param contentColor the content color of this [TertiaryButton] when enabled.
     */
    @Composable
    fun tertiaryColors(
        containerColor: Color = Color.Transparent,
        contentColor: Color = PersianTheme.colorScheme.primary,
    ): ButtonColors =
        ButtonColors(
            containerColor = containerColor,
            contentColor = contentColor
        )

    /**
     * Creates a [ButtonColors] that represents the default container and content colors used in a
     * [OutlinedButton].
     *
     * @param containerColor the container color of this [OutlinedButton] when enabled.
     * @param contentColor the content color of this [OutlinedButton] when enabled.
     */
    @Composable
    fun outlinedColors(
        containerColor: Color = Color.Transparent,
        contentColor: Color = PersianTheme.colorScheme.primary,
    ): ButtonColors =
        ButtonColors(
            containerColor = containerColor,
            contentColor = contentColor,
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
        textStyle: TextStyle = PersianTheme.typography.labelSmall,
        height: Dp = 36.dp,
        loaderSize: CircularProgressBarSizes = ProgressIndicatorDefaults.circularSmall(),
        iconSizes: IconSizes = IconDefaults.size18(),
        shape: Shape = PersianTheme.shapes.shape12,
        contentPadding: PaddingValues = PaddingValues(
            horizontal = PersianTheme.spacing.size16,
            vertical = 0.dp
        )
    ): ButtonSizes =
        ButtonSizes(
            textStyle = textStyle,
            height = height,
            loaderSize = loaderSize,
            iconSizes = iconSizes,
            shape = shape,
            contentPadding = contentPadding
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
        textStyle: TextStyle = PersianTheme.typography.labelMedium,
        additionInfoTextStyle: TextStyle = PersianTheme.typography.labelSmall,
        height: Dp = 44.dp,
        loaderSize: CircularProgressBarSizes = ProgressIndicatorDefaults.circularMedium(),
        iconSizes: IconSizes = IconDefaults.size20(),
        shape: Shape = PersianTheme.shapes.shape14,
        contentPadding: PaddingValues = PaddingValues(
            horizontal = PersianTheme.spacing.size20,
            vertical = 0.dp
        )
    ): ButtonSizes =
        ButtonSizes(
            textStyle = textStyle,
            additionInfoTextStyle = additionInfoTextStyle,
            height = height,
            loaderSize = loaderSize,
            iconSizes = iconSizes,
            shape = shape,
            contentPadding = contentPadding
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
        textStyle: TextStyle = PersianTheme.typography.labelLarge,
        additionInfoTextStyle: TextStyle = PersianTheme.typography.labelMedium,
        height: Dp = 52.dp,
        loaderSize: CircularProgressBarSizes = ProgressIndicatorDefaults.circularLarge(),
        iconSizes: IconSizes = IconDefaults.size28(),
        shape: Shape = PersianTheme.shapes.shape16,
        contentPadding: PaddingValues = PaddingValues(
            horizontal = PersianTheme.spacing.size24,
            vertical = 0.dp
        )
    ): ButtonSizes =
        ButtonSizes(
            textStyle = textStyle,
            additionInfoTextStyle = additionInfoTextStyle,
            height = height,
            loaderSize = loaderSize,
            iconSizes = iconSizes,
            shape = shape,
            contentPadding = contentPadding
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
        contentPadding: PaddingValues
    ): ButtonSizes =
        ButtonSizes(
            textStyle = textStyle,
            additionInfoTextStyle = additionInfoTextStyle,
            height = height,
            iconSizes = iconSizes,
            loaderSize = loaderSize,
            shape = shape,
            contentPadding = contentPadding
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
        return contentPadding == other.contentPadding
    }

    override fun hashCode(): Int {
        var result = textStyle.hashCode()
        result = 31 * result + additionInfoTextStyle.hashCode()
        result = 31 * result + height.hashCode()
        result = 31 * result + iconSizes.hashCode()
        result = 31 * result + loaderSize.hashCode()
        result = 31 * result + shape.hashCode()
        result = 31 * result + contentPadding.hashCode()
        return result
    }
}

/**
 * Represents the container and content colors used in a button in different states.
 *
 * @param containerColor the container color of this button when enabled.
 * @param contentColor the content color of this button when enabled.
 * @constructor create an instance with arbitrary colors.
 * - See [ButtonDefaults.primaryColors] for the default colors used in a [PrimaryButton].
 * - See [ButtonDefaults.secondaryColors] for the default colors used in a [SecondaryButton].
 * - See [ButtonDefaults.tertiaryColors] for the default colors used in a [TertiaryButton].
 * - See [ButtonDefaults.outlinedColors] for the default colors used in a [OutlinedButton].
 */
@Immutable
class ButtonColors internal constructor(
    internal val contentColor: Color,
    internal val containerColor: Color,
) {

    /**
     * Returns a copy of this [ButtonColors], optionally overriding some of the values.
     */
    fun copy(
        contentColor: Color = this.contentColor,
        containerColor: Color = this.containerColor,
    ): ButtonColors =
        ButtonColors(
            contentColor = contentColor,
            containerColor = containerColor
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is ButtonColors) return false

        if (contentColor != other.contentColor) return false
        return containerColor == other.containerColor
    }

    override fun hashCode(): Int {
        var result = contentColor.hashCode()
        result = 31 * result + containerColor.hashCode()
        return result
    }
}