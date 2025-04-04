package io.github.madmaximuus.persian.snackbar

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import io.github.madmaximuus.persian.avatarAndImage.AvatarColors
import io.github.madmaximuus.persian.avatarAndImage.AvatarDefaults
import io.github.madmaximuus.persian.avatarAndImage.AvatarSizes
import io.github.madmaximuus.persian.avatarAndImage.ImageColors
import io.github.madmaximuus.persian.avatarAndImage.ImageDefaults
import io.github.madmaximuus.persian.avatarAndImage.ImageSizes
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
 * Contains all default values used by [Snackbar]
 */
object SnackbarDefaults {

    /**
     * Create a [SnackbarColors] instance with customizable color properties.
     *
     * @param containerColor The background color of the Snackbar container. Defaults to
     * @param messageColor The color of the message text displayed in the Snackbar. Defaults to
     * @param leadingIconColor The color of the icon displayed on the left side of the Snackbar. Defaults to
     * @param leadingAvatarColors The color scheme for the avatar displayed on the left side of the Snackbar.
     * @param leadingTimerColors The color scheme for the timer progress bar displayed on the left side of the
     * @param leadingImageColors The color scheme for the image displayed on the left side of the Snackbar.
     * @param trailingCloseColor The color of the close button displayed on the right side of the Snackbar.
     * @param trailingActionColor The color of the action button displayed on the right side of the Snackbar.
     */
    @Composable
    fun colors(
        containerColor: Color = PersianTheme.colorScheme.surfaceContainerHighest,
        messageColor: Color = PersianTheme.colorScheme.onSurface,

        leadingIconColor: Color = PersianTheme.colorScheme.primary,
        leadingAvatarColors: AvatarColors = AvatarDefaults.colors(),
        leadingTimerColors: ProgressBarColors = ProgressIndicatorDefaults.colors(),
        leadingImageColors: ImageColors = ImageDefaults.colors(),

        trailingCloseColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        trailingActionColor: Color = PersianTheme.colorScheme.primary
    ) = SnackbarColors(
        containerColor = containerColor,
        messageColor = messageColor,

        leadingIconColor = leadingIconColor,
        leadingAvatarColors = leadingAvatarColors,
        leadingTimerColors = leadingTimerColors,
        leadingImageColors = leadingImageColors,
        trailingCloseColor = trailingCloseColor,
        trailingActionColor = trailingActionColor
    )

    /**
     * Create a [SnackbarSizes] instance with customizable size and style properties.
     *
     * @param containerShape The shape of the Snackbar container.
     * @param messageTextStyle The text style for the message displayed in the Snackbar.
     * @param leadingIconSizes The size scheme for the icon displayed on the left side of the Snackbar.
     * @param leadingAvatarSizes The size scheme for the avatar displayed on the left side of the Snackbar.
     * @param leadingTimerSizes The size scheme for the timer progress bar displayed on the left side of the Snackbar.
     * @param leadingImageSizes The size scheme for the image displayed on the left side of the Snackbar.
     * @param trailingCloseSizes The size scheme for the close button displayed on the right side of the Snackbar.
     * @param trailingActionSizes The size scheme for the action button displayed on the right side of the Snackbar.
     */
    @Composable
    fun sizes(
        containerShape: Shape = PersianTheme.shapes.shape16,
        messageTextStyle: TextStyle = PersianTheme.typography.bodyMedium,

        leadingIconSizes: IconSizes = IconDefaults.size28(),
        leadingAvatarSizes: AvatarSizes = AvatarDefaults.size36(),
        leadingTimerSizes: CircularProgressBarSizes = ProgressIndicatorDefaults.circularMedium(),
        leadingImageSizes: ImageSizes = ImageDefaults.size36(),

        trailingCloseSizes: IconButtonSizes = IconButtonDefaults.mediumSizes(),
        trailingActionSizes: ButtonSizes = ButtonDefaults.smallSizes()
    ) = SnackbarSizes(
        containerShape = containerShape,
        messageTextStyle = messageTextStyle,

        leadingIconSizes = leadingIconSizes,
        leadingAvatarSizes = leadingAvatarSizes,
        leadingTimerSizes = leadingTimerSizes,
        leadingImageSizes = leadingImageSizes,

        trailingCloseSizes = trailingCloseSizes,
        trailingActionSizes = trailingActionSizes
    )
}

/**
 * An immutable class representing the color scheme for a Snackbar.
 *
 * @property containerColor The background color of the Snackbar container.
 * @property messageColor The color of the message text displayed in the Snackbar.
 * @property leadingIconColor The color of the icon displayed on the left side of the Snackbar.
 * @property leadingAvatarColors The color scheme for the avatar displayed on the left side of the Snackbar.
 * @property leadingTimerColors The color scheme for the timer progress bar displayed on the left side of the Snackbar.
 * @property leadingImageColors The color scheme for the image displayed on the left side of the Snackbar.
 * @property trailingCloseColor The color of the close button displayed on the right side of the Snackbar.
 * @property trailingActionColor The color of the action button displayed on the right side of the Snackbar.
 */
@Immutable
class SnackbarColors internal constructor(
    internal val containerColor: Color,
    internal val messageColor: Color,

    internal val leadingIconColor: Color,
    internal val leadingAvatarColors: AvatarColors,
    internal val leadingTimerColors: ProgressBarColors,
    internal val leadingImageColors: ImageColors,

    internal val trailingCloseColor: Color,
    internal val trailingActionColor: Color
) {

    /**
     * Returns a copy of this [SnackbarColors], optionally overriding some of the values.
     */
    fun copy(
        containerColor: Color = this.containerColor,
        messageColor: Color = this.messageColor,

        leadingIconColor: Color = this.leadingIconColor,
        leadingAvatarColors: AvatarColors = this.leadingAvatarColors,
        leadingTimerColors: ProgressBarColors = this.leadingTimerColors,
        leadingImageColors: ImageColors = this.leadingImageColors,

        trailingCloseColor: Color = this.trailingCloseColor,
        trailingActionColor: Color = this.trailingActionColor
    ) = SnackbarColors(
        containerColor = containerColor,
        messageColor = messageColor,

        leadingIconColor = leadingIconColor,
        leadingAvatarColors = leadingAvatarColors,
        leadingTimerColors = leadingTimerColors,
        leadingImageColors = leadingImageColors,

        trailingCloseColor = trailingCloseColor,
        trailingActionColor = trailingActionColor
    )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is SnackbarColors) return false

        if (containerColor != other.containerColor) return false
        if (messageColor != other.messageColor) return false

        if (leadingIconColor != other.leadingIconColor) return false
        if (leadingAvatarColors != other.leadingAvatarColors) return false
        if (leadingTimerColors != other.leadingTimerColors) return false
        if (leadingImageColors != other.leadingImageColors) return false

        if (trailingCloseColor != other.trailingCloseColor) return false
        return trailingActionColor == other.trailingActionColor
    }

    override fun hashCode(): Int {
        var result = containerColor.hashCode()
        result = 31 * result + messageColor.hashCode()
        result = 31 * result + leadingIconColor.hashCode()
        result = 31 * result + leadingAvatarColors.hashCode()
        result = 31 * result + leadingTimerColors.hashCode()
        result = 31 * result + leadingImageColors.hashCode()
        result = 31 * result + trailingCloseColor.hashCode()
        result = 31 * result + trailingActionColor.hashCode()
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
 * @property leadingIconSizes The size scheme for the icon displayed on the left side of the Snackbar.
 * @property leadingAvatarSizes The size scheme for the avatar displayed on the left side of the Snackbar.
 * @property leadingTimerSizes The size scheme for the timer progress bar displayed on the left side of the Snackbar.
 * @property leadingImageSizes The size scheme for the image displayed on the left side of the Snackbar.
 * @property trailingCloseSizes The size scheme for the close button displayed on the right side of the Snackbar.
 * @property trailingActionSizes The size scheme for the action button displayed on the right side of the Snackbar.
 */
@Immutable
class SnackbarSizes internal constructor(
    internal val containerShape: Shape,
    internal val messageTextStyle: TextStyle,

    internal val leadingIconSizes: IconSizes,
    internal val leadingAvatarSizes: AvatarSizes,
    internal val leadingTimerSizes: CircularProgressBarSizes,
    internal val leadingImageSizes: ImageSizes,

    internal val trailingCloseSizes: IconButtonSizes,
    internal val trailingActionSizes: ButtonSizes
) {
    /**
     * Returns a copy of this [SnackbarSizes], optionally overriding some of the values.
     */
    fun copy(
        containerShape: Shape = this.containerShape,
        messageTextStyle: TextStyle = this.messageTextStyle,

        leftIconSizes: IconSizes = this.leadingIconSizes,
        leftAvatarSizes: AvatarSizes = this.leadingAvatarSizes,
        leftTimerSizes: CircularProgressBarSizes = this.leadingTimerSizes,
        leftIMageSizes: ImageSizes = this.leadingImageSizes,

        rightCloseSizes: IconButtonSizes = this.trailingCloseSizes,
        rightActionSizes: ButtonSizes = this.trailingActionSizes
    ) = SnackbarSizes(
        containerShape = containerShape,
        messageTextStyle = messageTextStyle,

        leadingIconSizes = leftIconSizes,
        leadingAvatarSizes = leftAvatarSizes,
        leadingTimerSizes = leftTimerSizes,
        leadingImageSizes = leftIMageSizes,

        trailingCloseSizes = rightCloseSizes,
        trailingActionSizes = rightActionSizes
    )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is SnackbarSizes) return false

        if (containerShape != other.containerShape) return false
        if (messageTextStyle != other.messageTextStyle) return false

        if (leadingIconSizes != other.leadingIconSizes) return false
        if (leadingAvatarSizes != other.leadingAvatarSizes) return false
        if (leadingTimerSizes != other.leadingTimerSizes) return false
        if (leadingImageSizes != other.leadingImageSizes) return false

        if (trailingCloseSizes != other.trailingCloseSizes) return false
        return trailingActionSizes == other.trailingActionSizes
    }

    override fun hashCode(): Int {
        var result = containerShape.hashCode()
        result = 31 * result + messageTextStyle.hashCode()
        result = 31 * result + leadingIconSizes.hashCode()
        result = 31 * result + leadingAvatarSizes.hashCode()
        result = 31 * result + leadingTimerSizes.hashCode()
        result = 31 * result + leadingImageSizes.hashCode()
        result = 31 * result + trailingCloseSizes.hashCode()
        result = 31 * result + trailingActionSizes.hashCode()
        return result
    }
}
