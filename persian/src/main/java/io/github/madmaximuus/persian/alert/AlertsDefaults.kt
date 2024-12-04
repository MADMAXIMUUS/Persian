package io.github.madmaximuus.persian.alert

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import io.github.madmaximuus.persian.button.ButtonDefaults
import io.github.madmaximuus.persian.button.ButtonSizes
import io.github.madmaximuus.persian.dividers.DividerDefaults
import io.github.madmaximuus.persian.dividers.DividerSizes
import io.github.madmaximuus.persian.foundation.PersianTheme

/**
 * Contains all default values used by all alert types
 */
object AlertsDefaults {

    /**
     * Creates an [AlertColors] that represents the default colors used in an alerts.
     *
     * @param containerColor the container color of this [Alert].
     * @param titleColor the title color of this [Alert].
     * @param messageColor the message color of this [Alert].
     * @param dividerColor the divider color of this [Alert].
     * @param actionColor the actions color of this [Alert].
     */
    @Composable
    fun colors(
        containerColor: Color = PersianTheme.colorScheme.surfaceContainer,
        titleColor: Color = PersianTheme.colorScheme.onSurface,
        messageColor: Color = PersianTheme.colorScheme.onSurface,
        dividerColor: Color = PersianTheme.colorScheme.outlineVariant,
        actionColor: Color = PersianTheme.colorScheme.primary
    ) = AlertColors(
        containerColor = containerColor,
        titleColor = titleColor,
        messageColor = messageColor,
        dividerColor = dividerColor,
        actionColor = actionColor
    )

    /**
     * Creates an [AlertSizes] that represents the default sizes used in an [OnlyActionAlert].
     *
     * @param containerShape the container shape size of this [OnlyActionAlert].
     * @param titleTextStyle the title text style of this [OnlyActionAlert].
     * @param messageTextStyle the message text style of this [OnlyActionAlert].
     * @param dividerSizes the divider thickness and padding of this [OnlyActionAlert].
     * @param actionSize the actions sizes of this [OnlyActionAlert].
     */
    @Composable
    fun onlyActionSizes(
        containerShape: Shape = PersianTheme.shapes.shape20,
        titleTextStyle: TextStyle = PersianTheme.typography.headlineSmall,
        messageTextStyle: TextStyle = PersianTheme.typography.bodyMedium,
        dividerSizes: DividerSizes = DividerDefaults.sizes(),
        actionSize: ButtonSizes = ButtonDefaults.largeSizes()
    ): AlertSizes = AlertSizes(
        containerShape = containerShape,
        titleTextStyle = titleTextStyle,
        messageTextStyle = messageTextStyle,
        dividerSizes = dividerSizes,
        actionSize = actionSize
    )

    /**
     * Creates an [AlertSizes] that represents the default sizes used in an [Alert].
     *
     * @param containerShape the container shape size of this [Alert].
     * @param titleTextStyle the title text style of this [Alert].
     * @param messageTextStyle the message text style of this [Alert].
     * @param dividerSizes the divider thickness and padding of this [Alert].
     * @param actionSize the actions sizes of this [Alert].
     */
    @Composable
    fun alertSizes(
        containerShape: Shape = PersianTheme.shapes.shape20,
        titleTextStyle: TextStyle = PersianTheme.typography.headlineSmall,
        messageTextStyle: TextStyle = PersianTheme.typography.bodyMedium,
        dividerSizes: DividerSizes = DividerDefaults.sizes(),
        actionSize: ButtonSizes = ButtonDefaults.smallSizes()
    ): AlertSizes = AlertSizes(
        containerShape = containerShape,
        titleTextStyle = titleTextStyle,
        messageTextStyle = messageTextStyle,
        dividerSizes = dividerSizes,
        actionSize = actionSize
    )
}

/**
 * Represents the container, texts, divider and actions colors in different state.
 *
 * @param containerColor the container color of this alert.
 * @param titleColor the title color of this alert.
 * @param messageColor the message color of this alert.
 * @param dividerColor the divider color of this alert.
 * @param actionColor the actions color of this alert.
 *
 * @constructor create an instance with arbitrary colors.
 *
 * - See [AlertsDefaults.colors] for the default colors used in an [Alert].
 */
@Immutable
class AlertColors internal constructor(
    internal val containerColor: Color,
    internal val titleColor: Color,
    internal val messageColor: Color,
    internal val dividerColor: Color,
    internal val actionColor: Color
) {
    /**
     * Returns a copy of this [AlertColors], optionally overriding some of the values
     */
    fun copy(
        containerColor: Color = this.containerColor,
        titleColor: Color = this.titleColor,
        descriptionColor: Color = this.messageColor,
        dividerColor: Color = this.dividerColor,
        actionColor: Color = this.actionColor
    ): AlertColors =
        AlertColors(
            containerColor = containerColor,
            titleColor = titleColor,
            messageColor = descriptionColor,
            dividerColor = dividerColor,
            actionColor = actionColor
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is AlertColors) return false

        if (containerColor != other.containerColor) return false
        if (titleColor != other.titleColor) return false
        if (messageColor != other.messageColor) return false
        if (dividerColor != other.dividerColor) return false
        return actionColor == other.actionColor
    }

    override fun hashCode(): Int {
        var result = containerColor.hashCode()
        result = 31 * result + titleColor.hashCode()
        result = 31 * result + messageColor.hashCode()
        result = 31 * result + dividerColor.hashCode()
        result = 31 * result + actionColor.hashCode()
        return result
    }
}

/**
 * Represents the container, texts, divider and actions colors in different state.
 *
 * @param containerShape the container shape size of this alert.
 * @param titleTextStyle the title text style of this alert.
 * @param messageTextStyle the message text style of this alert.
 * @param dividerSizes the divider thickness and padding sizes of this alert.
 * @param actionSize the actions sizes of this alert.
 *
 * @constructor create an instance with arbitrary sizes.
 *
 * - See [AlertsDefaults.onlyActionSizes] for the default sizes used in an [OnlyActionAlert].
 * - See [AlertsDefaults.alertSizes] for the default sizes user in an [Alert].
 */
@Immutable
class AlertSizes internal constructor(
    internal val containerShape: Shape,
    internal val titleTextStyle: TextStyle,
    internal val messageTextStyle: TextStyle,
    internal val dividerSizes: DividerSizes,
    internal val actionSize: ButtonSizes,
) {
    /**
     * Returns a copy of this [AlertSizes], optionally overriding some of the values
     */
    fun copy(
        containerShape: Shape = this.containerShape,
        titleTextStyle: TextStyle = this.titleTextStyle,
        descriptionTextStyle: TextStyle = this.messageTextStyle,
        dividerSizes: DividerSizes = this.dividerSizes,
        actionSize: ButtonSizes = this.actionSize,
    ): AlertSizes = AlertSizes(
        containerShape = containerShape,
        titleTextStyle = titleTextStyle,
        messageTextStyle = descriptionTextStyle,
        dividerSizes = dividerSizes,
        actionSize = actionSize,
    )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is AlertSizes) return false

        if (containerShape != other.containerShape) return false
        if (titleTextStyle != other.titleTextStyle) return false
        if (messageTextStyle != other.messageTextStyle) return false
        if (dividerSizes != other.dividerSizes) return false
        return actionSize == other.actionSize
    }

    override fun hashCode(): Int {
        var result = containerShape.hashCode()
        result = 31 * result + titleTextStyle.hashCode()
        result = 31 * result + messageTextStyle.hashCode()
        result = 31 * result + dividerSizes.hashCode()
        result = 31 * result + actionSize.hashCode()
        return result
    }
}