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

object SnackbarDefaults {

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
