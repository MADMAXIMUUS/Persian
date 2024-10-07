package io.github.madmaximuus.persian.banner

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import io.github.madmaximuus.persian.button.ButtonDefaults
import io.github.madmaximuus.persian.button.ButtonSizes
import io.github.madmaximuus.persian.foundation.PersianTheme

/**
 * Default values for [Banner]
 */
object BannerDefaults {

    /**
     * Creates an [BannerColors] that represents the default colors used in an [Banner].
     *
     * @param background the container color of this [Banner].
     * @param titleColor the title text color of this [Banner].
     * @param messageColor the message text color of this [Banner].
     * @param leftIconColor the leading icon color of this [Banner].
     * @param rightIconColor the trailing icon color of this [Banner].
     */
    @Composable
    fun colors(
        background: Color = PersianTheme.colorScheme.tertiaryContainer,
        leftIconColor: Color = PersianTheme.colorScheme.onTertiaryContainer,
        rightIconColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        titleColor: Color = PersianTheme.colorScheme.onTertiaryContainer,
        messageColor: Color = PersianTheme.colorScheme.tertiary
    ) = BannerColors(
        background = background,
        leftIconColor = leftIconColor,
        rightIconColor = rightIconColor,
        titleColor = titleColor,
        messageColor = messageColor
    )

    /**
     * Creates an [BannerSizes] that represents the default sizes used in an [Banner].
     *
     * @param containerShape the container shape of this [Banner].
     * @param titleTextStyle the title text style of this [Banner].
     * @param messageTextStyle the message text style of this [Banner].
     * @param buttonSizes the bottom button sizes of this [Banner].
     */
    @Composable
    fun sizes(
        containerShape: Shape = PersianTheme.shapes.shape14,
        titleTextStyle: TextStyle = PersianTheme.typography.titleMedium,
        messageTextStyle: TextStyle = PersianTheme.typography.bodyMedium,
        buttonSizes: ButtonSizes = ButtonDefaults.smallSizes()
    ) = BannerSizes(
        containerShape = containerShape,
        titleStyle = titleTextStyle,
        messageTextStyle = messageTextStyle,
        buttonSizes = buttonSizes
    )
}

/**
 * Represents the container and content sizes in a [Banner] in different state.
 *
 * @param containerShape the container shape of this [Banner].
 * @param titleStyle the title text style of this [Banner].
 * @param messageTextStyle the message text style of this [Banner].
 * @param buttonSizes the bottom button sizes of this [Banner].
 *
 * @constructor create an instance with arbitrary sizes.
 *
 * - See [BannerDefaults.sizes] for the default sizes used in an [Banner].
 */
@Immutable
class BannerSizes internal constructor(
    internal val containerShape: Shape,
    internal val titleStyle: TextStyle,
    internal val messageTextStyle: TextStyle,
    internal val buttonSizes: ButtonSizes,
) {

    /**
     * Returns a copy of this [BannerSizes], optionally overriding some of the values
     */
    fun copy(
        cornerRadius: Shape = this.containerShape,
        titleStyle: TextStyle = this.titleStyle,
        descriptionStyle: TextStyle = this.messageTextStyle,
        buttonSizes: ButtonSizes = this.buttonSizes
    ): BannerSizes = BannerSizes(
        containerShape = cornerRadius,
        titleStyle = titleStyle,
        messageTextStyle = descriptionStyle,
        buttonSizes = buttonSizes
    )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is BannerSizes) return false

        if (containerShape != other.containerShape) return false
        if (titleStyle != other.titleStyle) return false
        if (buttonSizes != other.buttonSizes) return false
        return messageTextStyle == other.messageTextStyle
    }

    override fun hashCode(): Int {
        var result = containerShape.hashCode()
        result = 31 * result + titleStyle.hashCode()
        result = 31 * result + messageTextStyle.hashCode()
        result = 31 * result + buttonSizes.hashCode()
        return result
    }
}

/**
 * Represents the container and content colors in a [Banner] in different state.
 *
 * @param background the container color of this [Banner].
 * @param titleColor the title text color of this [Banner].
 * @param messageColor the message text color of this [Banner].
 * @param leftIconColor the leading icon color of this [Banner].
 * @param rightIconColor the trailing icon color of this [Banner].
 *
 * @constructor create an instance with arbitrary sizes.
 *
 * - See [BannerDefaults.colors] for the default colors used in an [Banner].
 */
@Immutable
class BannerColors internal constructor(
    internal val background: Color,
    internal val titleColor: Color,
    internal val messageColor: Color,
    internal val leftIconColor: Color,
    internal val rightIconColor: Color
)