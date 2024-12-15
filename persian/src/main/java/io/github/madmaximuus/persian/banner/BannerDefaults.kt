package io.github.madmaximuus.persian.banner

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import io.github.madmaximuus.persian.button.ButtonDefaults
import io.github.madmaximuus.persian.button.ButtonSizes
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.state16
import io.github.madmaximuus.persian.icon.IconDefaults
import io.github.madmaximuus.persian.icon.IconSizes
import io.github.madmaximuus.persian.iconButton.IconButtonDefaults
import io.github.madmaximuus.persian.iconButton.IconButtonSizes

/**
 * Contains all default values used by [Banner].
 */
object BannerDefaults {

    /**
     * Creates an [BannerColors] that represents the default colors used in an [Banner].
     *
     * @param containerColor the container color of this [Banner].
     * @param titleColor the title text color of this [Banner].
     * @param messageColor the message text color of this [Banner].
     * @param leadingIconColor the leading icon color of this [Banner].
     * @param trailingIconColor the trailing icon color of this [Banner].
     * @param trailingIconButtonColor the trailing icon button color of this [Banner].
     * @param trailingButtonContainerColor the trailing button container color of this [Banner].
     * @param trailingButtonContentColor the trailing button content color of this [Banner].
     * @param actionColor the action color of this [Banner].
     */
    @Composable
    fun infoColors(
        containerColor: Color = PersianTheme.colorScheme.secondaryContainer,
        titleColor: Color = PersianTheme.colorScheme.onSecondaryContainer,
        messageColor: Color = PersianTheme.colorScheme.secondary,
        leadingIconColor: Color = PersianTheme.colorScheme.onSecondaryContainer,
        trailingIconColor: Color = PersianTheme.colorScheme.onSecondaryContainer,
        trailingIconButtonColor: Color = PersianTheme.colorScheme.onSecondaryContainer,
        trailingButtonContainerColor: Color = PersianTheme.colorScheme.secondary.state16,
        trailingButtonContentColor: Color = PersianTheme.colorScheme.onSecondaryContainer,
        actionColor: Color = PersianTheme.colorScheme.onSecondaryContainer
    ): BannerColors =
        BannerColors(
            containerColor = containerColor,
            titleColor = titleColor,
            messageColor = messageColor,
            leadingIconColor = leadingIconColor,
            trailingIconColor = trailingIconColor,
            trailingIconButtonColor = trailingIconButtonColor,
            trailingButtonContainerColor = trailingButtonContainerColor,
            trailingButtonContentColor = trailingButtonContentColor,
            actionColor = actionColor
        )

    /**
     * Creates an [BannerColors] that represents the default colors used in an [Banner].
     *
     * @param containerColor the container color of this [Banner].
     * @param titleColor the title text color of this [Banner].
     * @param messageColor the message text color of this [Banner].
     * @param leadingIconColor the leading icon color of this [Banner].
     * @param trailingIconColor the trailing icon color of this [Banner].
     * @param trailingIconButtonColor the trailing icon button color of this [Banner].
     * @param trailingButtonContainerColor the trailing button container color of this [Banner].
     * @param trailingButtonContentColor the trailing button content color of this [Banner].
     * @param actionColor the action color of this [Banner].
     */
    @Composable
    fun validColors(
        containerColor: Color = PersianTheme.colorScheme.validContainer,
        titleColor: Color = PersianTheme.colorScheme.onValidContainer,
        messageColor: Color = PersianTheme.colorScheme.valid,
        leadingIconColor: Color = PersianTheme.colorScheme.onValidContainer,
        trailingIconColor: Color = PersianTheme.colorScheme.onValidContainer,
        trailingIconButtonColor: Color = PersianTheme.colorScheme.onValidContainer,
        trailingButtonContainerColor: Color = PersianTheme.colorScheme.valid.state16,
        trailingButtonContentColor: Color = PersianTheme.colorScheme.onValidContainer,
        actionColor: Color = PersianTheme.colorScheme.onValidContainer
    ): BannerColors =
        BannerColors(
            containerColor = containerColor,
            titleColor = titleColor,
            messageColor = messageColor,
            leadingIconColor = leadingIconColor,
            trailingIconColor = trailingIconColor,
            trailingIconButtonColor = trailingIconButtonColor,
            trailingButtonContainerColor = trailingButtonContainerColor,
            trailingButtonContentColor = trailingButtonContentColor,
            actionColor = actionColor
        )

    /**
     * Creates an [BannerColors] that represents the default colors used in an [Banner].
     *
     * @param containerColor the container color of this [Banner].
     * @param titleColor the title text color of this [Banner].
     * @param messageColor the message text color of this [Banner].
     * @param leadingIconColor the leading icon color of this [Banner].
     * @param trailingIconColor the trailing icon color of this [Banner].
     * @param trailingIconButtonColor the trailing icon button color of this [Banner].
     * @param trailingButtonContainerColor the trailing button container color of this [Banner].
     * @param trailingButtonContentColor the trailing button content color of this [Banner].
     * @param actionColor the action color of this [Banner].
     */
    @Composable
    fun warningColors(
        containerColor: Color = PersianTheme.colorScheme.warningContainer,
        titleColor: Color = PersianTheme.colorScheme.onWarningContainer,
        messageColor: Color = PersianTheme.colorScheme.warning,
        leadingIconColor: Color = PersianTheme.colorScheme.onWarningContainer,
        trailingIconColor: Color = PersianTheme.colorScheme.onWarningContainer,
        trailingIconButtonColor: Color = PersianTheme.colorScheme.onWarningContainer,
        trailingButtonContainerColor: Color = PersianTheme.colorScheme.warning.state16,
        trailingButtonContentColor: Color = PersianTheme.colorScheme.onWarningContainer,
        actionColor: Color = PersianTheme.colorScheme.onWarningContainer
    ): BannerColors =
        BannerColors(
            containerColor = containerColor,
            titleColor = titleColor,
            messageColor = messageColor,
            leadingIconColor = leadingIconColor,
            trailingIconColor = trailingIconColor,
            trailingIconButtonColor = trailingIconButtonColor,
            trailingButtonContainerColor = trailingButtonContainerColor,
            trailingButtonContentColor = trailingButtonContentColor,
            actionColor = actionColor
        )

    /**
     * Creates an [BannerColors] that represents the default colors used in an [Banner].
     *
     * @param containerColor the container color of this [Banner].
     * @param titleColor the title text color of this [Banner].
     * @param messageColor the message text color of this [Banner].
     * @param leadingIconColor the leading icon color of this [Banner].
     * @param trailingIconColor the trailing icon color of this [Banner].
     * @param trailingIconButtonColor the trailing icon button color of this [Banner].
     * @param trailingButtonContainerColor the trailing button container color of this [Banner].
     * @param trailingButtonContentColor the trailing button content color of this [Banner].
     * @param actionColor the action color of this [Banner].
     */
    @Composable
    fun errorColors(
        containerColor: Color = PersianTheme.colorScheme.errorContainer,
        titleColor: Color = PersianTheme.colorScheme.onErrorContainer,
        messageColor: Color = PersianTheme.colorScheme.error,
        leadingIconColor: Color = PersianTheme.colorScheme.onErrorContainer,
        trailingIconColor: Color = PersianTheme.colorScheme.onErrorContainer,
        trailingIconButtonColor: Color = PersianTheme.colorScheme.onErrorContainer,
        trailingButtonContainerColor: Color = PersianTheme.colorScheme.error.state16,
        trailingButtonContentColor: Color = PersianTheme.colorScheme.onErrorContainer,
        actionColor: Color = PersianTheme.colorScheme.onErrorContainer
    ): BannerColors =
        BannerColors(
            containerColor = containerColor,
            titleColor = titleColor,
            messageColor = messageColor,
            leadingIconColor = leadingIconColor,
            trailingIconColor = trailingIconColor,
            trailingIconButtonColor = trailingIconButtonColor,
            trailingButtonContainerColor = trailingButtonContainerColor,
            trailingButtonContentColor = trailingButtonContentColor,
            actionColor = actionColor
        )

    /**
     * Creates an [BannerSizes] that represents the default sizes used in an [Banner].
     *
     * @param containerShape the container shape of this [Banner].
     * @param titleTextStyle the title text style of this [Banner].
     * @param messageTextStyle the message text style of this [Banner].
     * @param leadingIconSize the size of leading icon of this [Banner].
     * @param trailingIconSize the size of trailing icon of this [Banner].
     * @param trailingIconButtonSizes the size of trailing icon button of this [Banner].
     * @param trailingButtonSizes the size of trailing button of this [Banner].
     * @param actionSizes the action sizes of this [Banner].
     */
    @Composable
    fun sizes(
        containerShape: Shape = PersianTheme.shapes.shape16,
        titleTextStyle: TextStyle = PersianTheme.typography.titleMedium,
        messageTextStyle: TextStyle = PersianTheme.typography.bodyMedium,
        leadingIconSize: IconSizes = IconDefaults.size24(),
        trailingIconSize: IconSizes = IconDefaults.size24(),
        trailingIconButtonSizes: IconButtonSizes = IconButtonDefaults.smallSizes(),
        trailingButtonSizes: ButtonSizes = ButtonDefaults.smallSizes(),
        actionSizes: ButtonSizes = ButtonDefaults.smallSizes()
    ): BannerSizes =
        BannerSizes(
            containerShape = containerShape,
            titleTextStyle = titleTextStyle,
            messageTextStyle = messageTextStyle,
            leadingIconSize = leadingIconSize,
            trailingIconSize = trailingIconSize,
            trailingIconButtonSizes = trailingIconButtonSizes,
            trailingButtonSizes = trailingButtonSizes,
            actionSizes = actionSizes
        )
}

/**
 * Represents the container and content sizes in a [Banner] in different state.
 *
 * @param containerShape the container shape of this [Banner].
 * @param titleTextStyle the title text style of this [Banner].
 * @param messageTextStyle the message text style of this [Banner].
 * @param leadingIconSize the size of leading icon of this [Banner].
 * @param trailingIconSize the size of trailing icon of this [Banner].
 * @param trailingIconButtonSizes the size of trailing icon button of this [Banner].
 * @param trailingButtonSizes the size of trailing button of this [Banner].
 * @param actionSizes the action sizes of this [Banner].
 *
 * @constructor create an instance with arbitrary sizes.
 *
 * - See [BannerDefaults.sizes] for the default sizes used in an [Banner].
 */
@Immutable
class BannerSizes internal constructor(
    internal val containerShape: Shape,
    internal val titleTextStyle: TextStyle,
    internal val messageTextStyle: TextStyle,
    internal val leadingIconSize: IconSizes,
    internal val trailingIconSize: IconSizes,
    internal val trailingIconButtonSizes: IconButtonSizes,
    internal val trailingButtonSizes: ButtonSizes,
    internal val actionSizes: ButtonSizes,
) {

    /**
     * Returns a copy of this [BannerSizes], optionally overriding some of the values
     */
    fun copy(
        containerShape: Shape = this.containerShape,
        titleTextStyle: TextStyle = this.titleTextStyle,
        messageTextStyle: TextStyle = this.messageTextStyle,
        leadingIconSize: IconSizes = this.leadingIconSize,
        trailingIconSize: IconSizes = this.trailingIconSize,
        trailingIconButtonSizes: IconButtonSizes = this.trailingIconButtonSizes,
        trailingButtonSizes: ButtonSizes = this.trailingButtonSizes,
        actionSizes: ButtonSizes = this.actionSizes
    ): BannerSizes =
        BannerSizes(
            containerShape = containerShape,
            titleTextStyle = titleTextStyle,
            messageTextStyle = messageTextStyle,
            leadingIconSize = leadingIconSize,
            trailingIconSize = trailingIconSize,
            trailingIconButtonSizes = trailingIconButtonSizes,
            trailingButtonSizes = trailingButtonSizes,
            actionSizes = actionSizes
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is BannerSizes) return false

        if (containerShape != other.containerShape) return false
        if (titleTextStyle != other.titleTextStyle) return false
        if (actionSizes != other.actionSizes) return false
        return messageTextStyle == other.messageTextStyle
    }

    override fun hashCode(): Int {
        var result = containerShape.hashCode()
        result = 31 * result + titleTextStyle.hashCode()
        result = 31 * result + messageTextStyle.hashCode()
        result = 31 * result + actionSizes.hashCode()
        return result
    }
}

/**
 * Represents the container and content colors in a [Banner] in different state.
 *
 * @param containerColor the container color of this [Banner].
 * @param titleColor the title text color of this [Banner].
 * @param messageColor the message text color of this [Banner].
 * @param leadingIconColor the leading icon color of this [Banner].
 * @param trailingIconColor the trailing icon color of this [Banner].
 * @param trailingIconButtonColor the trailing icon button color of this [Banner].
 * @param trailingButtonContainerColor the trailing button container color of this [Banner].
 * @param trailingButtonContentColor the trailing button content color of this [Banner].
 * @param trailingButtonContentColor the trailing button content color of this [Banner].
 * @param actionColor the action color of this [Banner].
 *
 * @constructor create an instance with arbitrary sizes.
 *
 * - See [BannerDefaults.infoColors] for the info colors used in an [Banner].
 * - See [BannerDefaults.validColors] for the valid colors used in an [Banner].
 * - See [BannerDefaults.warningColors] for the valid colors used in an [Banner].
 * - See [BannerDefaults.errorColors] for the error colors used in an [Banner].
 */
@Immutable
class BannerColors internal constructor(
    internal val containerColor: Color,
    internal val titleColor: Color,
    internal val messageColor: Color,
    internal val leadingIconColor: Color,
    internal val trailingIconColor: Color,
    internal val trailingIconButtonColor: Color,
    internal val trailingButtonContainerColor: Color,
    internal val trailingButtonContentColor: Color,
    internal val actionColor: Color
)