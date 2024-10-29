package io.github.madmaximuus.persian.snackbar

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import io.github.madmaximuus.persian.avatarsAndImages.AvatarColors
import io.github.madmaximuus.persian.avatarsAndImages.AvatarDefaults
import io.github.madmaximuus.persian.avatarsAndImages.AvatarSizes
import io.github.madmaximuus.persian.avatarsAndImages.ImageColors
import io.github.madmaximuus.persian.avatarsAndImages.ImageDefaults
import io.github.madmaximuus.persian.avatarsAndImages.ImageSizes
import io.github.madmaximuus.persian.button.ButtonDefaults
import io.github.madmaximuus.persian.button.ButtonSizes
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.icon.IconDefaults
import io.github.madmaximuus.persian.icon.IconSizes
import io.github.madmaximuus.persian.iconButton.IconButtonDefaults
import io.github.madmaximuus.persian.iconButton.IconButtonSizes
import io.github.madmaximuus.persian.progressIndicator.CircularProgressBarSizes
import io.github.madmaximuus.persian.progressIndicator.ProgressBarColors
import io.github.madmaximuus.persian.progressIndicator.ProgressIndicatorDefaults

/**
 * Contains all default values used by snackbar
 */
object SnackbarDefaults {

    /**
     * A composable function to create a [SnackbarColors] instance with customizable color properties.
     *
     * This function allows you to specify the colors for various elements of the Snackbar, including
     * the container, message text, left visual elements (icon, avatar, timer, image), and right visual
     * elements (close button, action button).
     *
     * @param containerColor The background color of the Snackbar container. Defaults to
     * @param messageColor The color of the message text displayed in the Snackbar. Defaults to
     * @param leftIconColor The color of the icon displayed on the left side of the Snackbar. Defaults to
     * @param leftAvatarColors The color scheme for the avatar displayed on the left side of the Snackbar.
     * @param leftTimerColors The color scheme for the timer progress bar displayed on the left side of the
     * @param leftImageColors The color scheme for the image displayed on the left side of the Snackbar.
     * @param rightCloseColor The color of the close button displayed on the right side of the Snackbar.
     * @param rightActionColor The color of the action button displayed on the right side of the Snackbar.
     */
    @Composable
    fun colors(
        containerColor: Color = PersianTheme.colorScheme.surfaceContainerHighest,
        messageColor: Color = PersianTheme.colorScheme.onSurface,

        leftIconColor: Color = PersianTheme.colorScheme.primary,
        leftAvatarColors: AvatarColors = AvatarDefaults.colors(),
        leftTimerColors: ProgressBarColors = ProgressIndicatorDefaults.colors(),
        leftImageColors: ImageColors = ImageDefaults.colors(),

        rightCloseColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        rightActionColor: Color = PersianTheme.colorScheme.primary
    ): SnackbarColors =
        SnackbarColors(
            containerColor = containerColor,
            messageColor = messageColor,

            leftIconColor = leftIconColor,
            leftAvatarColors = leftAvatarColors,
            leftTimerColors = leftTimerColors,
            leftImageColors = leftImageColors,
            rightCloseColor = rightCloseColor,
            rightActionColor = rightActionColor
        )

    /**
     * A composable function to create a [SnackbarSizes] instance with customizable size and style properties.
     *
     * This function allows you to specify the sizes and styles for various elements of the Snackbar, including
     * the container shape, message text style, left visual elements (icon, avatar, timer, image), and right
     * visual elements (close button, action button).
     *
     * @param containerShape The shape of the Snackbar container.
     * @param messageTextStyle The text style for the message displayed in the Snackbar.
     * @param leftIconSizes The size scheme for the icon displayed on the left side of the Snackbar.
     * @param leftAvatarSizes The size scheme for the avatar displayed on the left side of the Snackbar.
     * @param leftTimerSizes The size scheme for the timer progress bar displayed on the left side of the Snackbar.
     * @param leftImageSizes The size scheme for the image displayed on the left side of the Snackbar.
     * @param rightCloseSizes The size scheme for the close button displayed on the right side of the Snackbar.
     * @param rightActionSizes The size scheme for the action button displayed on the right side of the Snackbar.
     */
    @Composable
    fun sizes(
        containerShape: Shape = PersianTheme.shapes.shape16,
        messageTextStyle: TextStyle = PersianTheme.typography.bodyMedium,

        leftIconSizes: IconSizes = IconDefaults.size28(),
        leftAvatarSizes: AvatarSizes = AvatarDefaults.size32(),
        leftTimerSizes: CircularProgressBarSizes = ProgressIndicatorDefaults.circularMedium(),
        leftImageSizes: ImageSizes = ImageDefaults.size32(),

        rightCloseSizes: IconButtonSizes = IconButtonDefaults.smallSizes(),
        rightActionSizes: ButtonSizes = ButtonDefaults.smallSizes()
    ): SnackbarSizes = SnackbarSizes(
        containerShape = containerShape,
        messageTextStyle = messageTextStyle,

        leftIconSizes = leftIconSizes,
        leftAvatarSizes = leftAvatarSizes,
        leftTimerSizes = leftTimerSizes,
        leftImageSizes = leftImageSizes,

        rightCloseSizes = rightCloseSizes,
        rightActionSizes = rightActionSizes
    )
}

/**
 * An immutable class representing the color scheme for a Snackbar.
 *
 * This class encapsulates various color properties used in different parts of the Snackbar,
 * including the container, message, left visual elements (icon, avatar, timer, image),
 * and right visual elements (close button, action button).
 *
 * @property containerColor The background color of the Snackbar container.
 * @property messageColor The color of the message text displayed in the Snackbar.
 * @property leftIconColor The color of the icon displayed on the left side of the Snackbar.
 * @property leftAvatarColors The color scheme for the avatar displayed on the left side of the Snackbar.
 * @property leftTimerColors The color scheme for the timer progress bar displayed on the left side of the Snackbar.
 * @property leftImageColors The color scheme for the image displayed on the left side of the Snackbar.
 * @property rightCloseColor The color of the close button displayed on the right side of the Snackbar.
 * @property rightActionColor The color of the action button displayed on the right side of the Snackbar.
 */
@Immutable
class SnackbarColors internal constructor(
    internal val containerColor: Color,
    internal val messageColor: Color,

    internal val leftIconColor: Color,
    internal val leftAvatarColors: AvatarColors,
    internal val leftTimerColors: ProgressBarColors,
    internal val leftImageColors: ImageColors,

    internal val rightCloseColor: Color,
    internal val rightActionColor: Color
) {

    /**
     * Returns a copy of this [SnackbarColors], optionally overriding some of the values.
     */
    fun copy(
        containerColor: Color = this.containerColor,
        messageColor: Color = this.messageColor,

        leftIconColor: Color = this.leftIconColor,
        leftAvatarColors: AvatarColors = this.leftAvatarColors,
        leftTimerColors: ProgressBarColors = this.leftTimerColors,
        leftImageColors: ImageColors = this.leftImageColors,

        rightCloseColor: Color = this.rightCloseColor,
        rightActionColor: Color = this.rightActionColor
    ): SnackbarColors = SnackbarColors(
        containerColor = containerColor,
        messageColor = messageColor,

        leftIconColor = leftIconColor,
        leftAvatarColors = leftAvatarColors,
        leftTimerColors = leftTimerColors,
        leftImageColors = leftImageColors,

        rightCloseColor = rightCloseColor,
        rightActionColor = rightActionColor
    )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is SnackbarColors) return false

        if (containerColor != other.containerColor) return false
        if (messageColor != other.messageColor) return false

        if (leftIconColor != other.leftIconColor) return false
        if (leftAvatarColors != other.leftAvatarColors) return false
        if (leftTimerColors != other.leftTimerColors) return false
        if (leftImageColors != other.leftImageColors) return false

        if (rightCloseColor != other.rightCloseColor) return false
        return rightActionColor == other.rightActionColor
    }

    override fun hashCode(): Int {
        var result = containerColor.hashCode()
        result = 31 * result + messageColor.hashCode()
        result = 31 * result + leftIconColor.hashCode()
        result = 31 * result + leftAvatarColors.hashCode()
        result = 31 * result + leftTimerColors.hashCode()
        result = 31 * result + leftImageColors.hashCode()
        result = 31 * result + rightCloseColor.hashCode()
        result = 31 * result + rightActionColor.hashCode()
        return result
    }
}

/**
 * An immutable class representing the size and style scheme for a Snackbar.
 *
 * This class encapsulates various size and style properties used in different parts of the Snackbar,
 * including the container shape, message text style, left visual elements (icon, avatar, timer, image),
 * and right visual elements (close button, action button).
 *
 * @property containerShape The shape of the Snackbar container.
 * @property messageTextStyle The text style for the message displayed in the Snackbar.
 * @property leftIconSizes The size scheme for the icon displayed on the left side of the Snackbar.
 * @property leftAvatarSizes The size scheme for the avatar displayed on the left side of the Snackbar.
 * @property leftTimerSizes The size scheme for the timer progress bar displayed on the left side of the Snackbar.
 * @property leftImageSizes The size scheme for the image displayed on the left side of the Snackbar.
 * @property rightCloseSizes The size scheme for the close button displayed on the right side of the Snackbar.
 * @property rightActionSizes The size scheme for the action button displayed on the right side of the Snackbar.
 */
@Immutable
class SnackbarSizes internal constructor(
    internal val containerShape: Shape,
    internal val messageTextStyle: TextStyle,

    internal val leftIconSizes: IconSizes,
    internal val leftAvatarSizes: AvatarSizes,
    internal val leftTimerSizes: CircularProgressBarSizes,
    internal val leftImageSizes: ImageSizes,

    internal val rightCloseSizes: IconButtonSizes,
    internal val rightActionSizes: ButtonSizes
) {
    /**
     * Returns a copy of this [SnackbarSizes], optionally overriding some of the values.
     */
    fun copy(
        containerShape: Shape = this.containerShape,
        messageTextStyle: TextStyle = this.messageTextStyle,

        leftIconSizes: IconSizes = this.leftIconSizes,
        leftAvatarSizes: AvatarSizes = this.leftAvatarSizes,
        leftTimerSizes: CircularProgressBarSizes = this.leftTimerSizes,
        leftIMageSizes: ImageSizes = this.leftImageSizes,

        rightCloseSizes: IconButtonSizes = this.rightCloseSizes,
        rightActionSizes: ButtonSizes = this.rightActionSizes
    ): SnackbarSizes = SnackbarSizes(
        containerShape = containerShape,
        messageTextStyle = messageTextStyle,

        leftIconSizes = leftIconSizes,
        leftAvatarSizes = leftAvatarSizes,
        leftTimerSizes = leftTimerSizes,
        leftImageSizes = leftIMageSizes,

        rightCloseSizes = rightCloseSizes,
        rightActionSizes = rightActionSizes
    )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is SnackbarSizes) return false

        if (containerShape != other.containerShape) return false
        if (messageTextStyle != other.messageTextStyle) return false

        if (leftIconSizes != other.leftIconSizes) return false
        if (leftAvatarSizes != other.leftAvatarSizes) return false
        if (leftTimerSizes != other.leftTimerSizes) return false
        if (leftImageSizes != other.leftImageSizes) return false

        if (rightCloseSizes != other.rightCloseSizes) return false
        return rightActionSizes == other.rightActionSizes
    }

    override fun hashCode(): Int {
        var result = containerShape.hashCode()
        result = 31 * result + messageTextStyle.hashCode()
        result = 31 * result + leftIconSizes.hashCode()
        result = 31 * result + leftAvatarSizes.hashCode()
        result = 31 * result + leftTimerSizes.hashCode()
        result = 31 * result + leftImageSizes.hashCode()
        result = 31 * result + rightCloseSizes.hashCode()
        result = 31 * result + rightActionSizes.hashCode()
        return result
    }
}
