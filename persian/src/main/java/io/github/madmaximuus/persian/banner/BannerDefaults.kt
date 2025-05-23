package io.github.madmaximuus.persian.banner

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import io.github.madmaximuus.persian.button.ButtonColors
import io.github.madmaximuus.persian.button.ButtonDefaults
import io.github.madmaximuus.persian.button.ButtonSizes
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.state16
import io.github.madmaximuus.persian.icon.IconDefaults
import io.github.madmaximuus.persian.icon.IconSizes
import io.github.madmaximuus.persian.iconButton.IconButtonColors
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
     * @param trailingIconButtonColors the trailing icon button colors of this [Banner].
     * @param trailingButtonColors the trailing button colors of this [Banner].
     * @param actionColors the action colors of this [Banner].
     */
    @Composable
    fun infoColors(
        containerColor: Color = PersianTheme.colorScheme.secondaryContainer,
        titleColor: Color = PersianTheme.colorScheme.onSecondaryContainer,
        messageColor: Color = PersianTheme.colorScheme.secondary,
        leadingIconColor: Color = PersianTheme.colorScheme.onSecondaryContainer,
        trailingIconColor: Color = PersianTheme.colorScheme.onSecondaryContainer,
        trailingIconButtonColors: IconButtonColors = IconButtonDefaults.tertiaryIconButtonColors(
            contentColor = PersianTheme.colorScheme.onSecondaryContainer
        ),
        trailingButtonColors: ButtonColors = ButtonDefaults.primaryColors(
            containerColor = PersianTheme.colorScheme.secondary.state16,
            contentColor = PersianTheme.colorScheme.onSecondaryContainer
        ),
        actionColors: ButtonColors = ButtonDefaults.tertiaryColors(
            contentColor = PersianTheme.colorScheme.onSecondaryContainer
        )
    ) = BannerColors(
        containerColor = containerColor,
        titleColor = titleColor,
        messageColor = messageColor,
        leadingIconColor = leadingIconColor,
        trailingIconColor = trailingIconColor,
        trailingIconButtonColors = trailingIconButtonColors,
        trailingButtonColors = trailingButtonColors,
        actionColors = actionColors
    )

    /**
     * Creates an [BannerColors] that represents the default colors used in an [Banner].
     *
     * @param containerColor the container color of this [Banner].
     * @param titleColor the title text color of this [Banner].
     * @param messageColor the message text color of this [Banner].
     * @param leadingIconColor the leading icon color of this [Banner].
     * @param trailingIconColor the trailing icon color of this [Banner].
     * @param trailingIconButtonColors the trailing icon button colors of this [Banner].
     * @param trailingButtonColors the trailing button colors of this [Banner].
     * @param actionColors the action colors of this [Banner].
     */
    @Composable
    fun validColors(
        containerColor: Color = PersianTheme.colorScheme.validContainer,
        titleColor: Color = PersianTheme.colorScheme.onValidContainer,
        messageColor: Color = PersianTheme.colorScheme.valid,
        leadingIconColor: Color = PersianTheme.colorScheme.onValidContainer,
        trailingIconColor: Color = PersianTheme.colorScheme.onValidContainer,
        trailingIconButtonColors: IconButtonColors = IconButtonDefaults.tertiaryIconButtonColors(
            contentColor = PersianTheme.colorScheme.onValidContainer
        ),
        trailingButtonColors: ButtonColors = ButtonDefaults.primaryColors(
            containerColor = PersianTheme.colorScheme.valid.state16,
            contentColor = PersianTheme.colorScheme.onValidContainer
        ),
        actionColors: ButtonColors = ButtonDefaults.tertiaryColors(
            contentColor = PersianTheme.colorScheme.onValidContainer
        )
    ) = BannerColors(
        containerColor = containerColor,
        titleColor = titleColor,
        messageColor = messageColor,
        leadingIconColor = leadingIconColor,
        trailingIconColor = trailingIconColor,
        trailingIconButtonColors = trailingIconButtonColors,
        trailingButtonColors = trailingButtonColors,
        actionColors = actionColors
    )

    /**
     * Creates an [BannerColors] that represents the default colors used in an [Banner].
     *
     * @param containerColor the container color of this [Banner].
     * @param titleColor the title text color of this [Banner].
     * @param messageColor the message text color of this [Banner].
     * @param leadingIconColor the leading icon color of this [Banner].
     * @param trailingIconColor the trailing icon color of this [Banner].
     * @param trailingIconButtonColors the trailing icon button colors of this [Banner].
     * @param trailingButtonColors the trailing button colors of this [Banner].
     * @param actionColors the action colors of this [Banner].
     */
    @Composable
    fun warningColors(
        containerColor: Color = PersianTheme.colorScheme.warningContainer,
        titleColor: Color = PersianTheme.colorScheme.onWarningContainer,
        messageColor: Color = PersianTheme.colorScheme.warning,
        leadingIconColor: Color = PersianTheme.colorScheme.onWarningContainer,
        trailingIconColor: Color = PersianTheme.colorScheme.onWarningContainer,
        trailingIconButtonColors: IconButtonColors = IconButtonDefaults.tertiaryIconButtonColors(
            contentColor = PersianTheme.colorScheme.onWarningContainer
        ),
        trailingButtonColors: ButtonColors = ButtonDefaults.primaryColors(
            containerColor = PersianTheme.colorScheme.warning.state16,
            contentColor = PersianTheme.colorScheme.onWarningContainer
        ),
        actionColors: ButtonColors = ButtonDefaults.tertiaryColors(
            contentColor = PersianTheme.colorScheme.onWarningContainer
        )
    ) = BannerColors(
        containerColor = containerColor,
        titleColor = titleColor,
        messageColor = messageColor,
        leadingIconColor = leadingIconColor,
        trailingIconColor = trailingIconColor,
        trailingIconButtonColors = trailingIconButtonColors,
        trailingButtonColors = trailingButtonColors,
        actionColors = actionColors
    )

    /**
     * Creates an [BannerColors] that represents the default colors used in an [Banner].
     *
     * @param containerColor the container color of this [Banner].
     * @param titleColor the title text color of this [Banner].
     * @param messageColor the message text color of this [Banner].
     * @param leadingIconColor the leading icon color of this [Banner].
     * @param trailingIconColor the trailing icon color of this [Banner].
     * @param trailingIconButtonColors the trailing icon button colors of this [Banner].
     * @param trailingButtonColors the trailing button colors of this [Banner].
     * @param actionColors the action colors of this [Banner].
     */
    @Composable
    fun errorColors(
        containerColor: Color = PersianTheme.colorScheme.errorContainer,
        titleColor: Color = PersianTheme.colorScheme.onErrorContainer,
        messageColor: Color = PersianTheme.colorScheme.error,
        leadingIconColor: Color = PersianTheme.colorScheme.onErrorContainer,
        trailingIconColor: Color = PersianTheme.colorScheme.onErrorContainer,
        trailingIconButtonColors: IconButtonColors = IconButtonDefaults.tertiaryIconButtonColors(
            contentColor = PersianTheme.colorScheme.onErrorContainer
        ),
        trailingButtonColors: ButtonColors = ButtonDefaults.primaryColors(
            containerColor = PersianTheme.colorScheme.error.state16,
            contentColor = PersianTheme.colorScheme.onErrorContainer
        ),
        actionColors: ButtonColors = ButtonDefaults.tertiaryColors(
            contentColor = PersianTheme.colorScheme.onErrorContainer
        )
    ) = BannerColors(
        containerColor = containerColor,
        titleColor = titleColor,
        messageColor = messageColor,
        leadingIconColor = leadingIconColor,
        trailingIconColor = trailingIconColor,
        trailingIconButtonColors = trailingIconButtonColors,
        trailingButtonColors = trailingButtonColors,
        actionColors = actionColors
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
    ) = BannerSizes(
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
    ) = BannerSizes(
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
 * @param trailingIconButtonColors the trailing icon button colors of this [Banner].
 * @param trailingButtonColors the trailing button colors of this [Banner].
 * @param actionColors the actions colors of this [Banner].
 *
 * @constructor create an instance with arbitrary sizes.
 *
 * - See [BannerDefaults.infoColors] for the info colors used in an [Banner].
 * - See [BannerDefaults.validColors] for the valid colors used in an [Banner].
 * - See [BannerDefaults.warningColors] for the waring colors used in an [Banner].
 * - See [BannerDefaults.errorColors] for the error colors used in an [Banner].
 */
@Immutable
class BannerColors internal constructor(
    internal val containerColor: Color,
    internal val titleColor: Color,
    internal val messageColor: Color,
    internal val leadingIconColor: Color,
    internal val trailingIconColor: Color,
    internal val trailingIconButtonColors: IconButtonColors,
    internal val trailingButtonColors: ButtonColors,
    internal val actionColors: ButtonColors
) {
    fun copy(
        containerColor: Color = this.containerColor,
        titleColor: Color = this.titleColor,
        messageColor: Color = this.messageColor,
        leadingIconColor: Color = this.leadingIconColor,
        trailingIconColor: Color = this.trailingIconColor,
        trailingIconButtonColors: IconButtonColors = this.trailingIconButtonColors,
        trailingButtonColors: ButtonColors = this.trailingButtonColors,
        actionColors: ButtonColors = this.actionColors
    ) = BannerColors(
        containerColor = containerColor,
        titleColor = titleColor,
        messageColor = messageColor,
        leadingIconColor = leadingIconColor,
        trailingIconColor = trailingIconColor,
        trailingIconButtonColors = trailingIconButtonColors,
        trailingButtonColors = trailingButtonColors,
        actionColors = actionColors
    )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is BannerColors) return false

        if (containerColor != other.containerColor) return false
        if (titleColor != other.titleColor) return false
        if (messageColor != other.messageColor) return false
        if (leadingIconColor != other.leadingIconColor) return false
        if (trailingIconColor != other.trailingIconColor) return false
        if (trailingIconButtonColors != other.trailingIconButtonColors) return false
        if (trailingButtonColors != other.trailingButtonColors) return false
        return actionColors == other.actionColors
    }

    override fun hashCode(): Int {
        var result = containerColor.hashCode()
        result = 31 * result + titleColor.hashCode()
        result = 31 * result + messageColor.hashCode()
        result = 31 * result + leadingIconColor.hashCode()
        result = 31 * result + trailingIconColor.hashCode()
        result = 31 * result + trailingIconButtonColors.hashCode()
        result = 31 * result + trailingButtonColors.hashCode()
        result = 31 * result + actionColors.hashCode()
        return result
    }
}