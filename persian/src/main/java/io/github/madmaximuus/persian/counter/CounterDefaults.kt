package io.github.madmaximuus.persian.counter

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.counter.CounterDefaults.sizes
import io.github.madmaximuus.persian.foundation.PersianTheme

/**
 * Contains the default values used by all 4 counter styles.
 */
object CounterDefaults {

    /**
     * Create a [CounterColors] that represents the default container and content colors in error style.
     *
     * @param containerColor The container color of the badge.
     * @param contentColor The content color of the badge.
     */
    @Composable
    fun errorColors(
        containerColor: Color = PersianTheme.colorScheme.error,
        contentColor: Color = PersianTheme.colorScheme.onError
    ) = CounterColors(
        containerColor = containerColor,
        contentColor = contentColor
    )

    /**
     * Create a [CounterColors] that represents the default container and content colors in error style.
     *
     * @param containerColor The container color of the badge.
     * @param contentColor The content color of the badge.
     */
    @Composable
    fun primaryColors(
        containerColor: Color = PersianTheme.colorScheme.primary,
        contentColor: Color = PersianTheme.colorScheme.onPrimary
    ) = CounterColors(
        containerColor = containerColor,
        contentColor = contentColor
    )

    /**
     * Create a [CounterColors] that represents the default container and content colors in error style.
     *
     * @param containerColor The container color of the badge.
     * @param contentColor The content color of the badge.
     */
    @Composable
    fun secondaryColors(
        containerColor: Color = PersianTheme.colorScheme.primaryContainer,
        contentColor: Color = PersianTheme.colorScheme.onPrimaryContainer
    ) = CounterColors(
        containerColor = containerColor,
        contentColor = contentColor
    )

    /**
     * Create a [CounterColors] that represents the default container and content colors in error style.
     *
     * @param containerColor The container color of the badge.
     * @param contentColor The content color of the badge.
     */
    @Composable
    fun tertiaryColors(
        containerColor: Color = Color.Transparent,
        contentColor: Color = PersianTheme.colorScheme.onSurface
    ) = CounterColors(
        containerColor = containerColor,
        contentColor = contentColor
    )

    /**
     * Composable function to create a [sizes] object with customizable horizontal and vertical offsets for a badge.
     *
     * @param size The size of container for the dot badge.
     * @param contentPadding The padding values for the digits in the counter.
     * @param shape The shape defining the corner radius of the counter.
     * @param badgeRightOffset The offset on the right side of the anchor
     * @param badgeTopOffset The offset from the top of the anchor.
     * @param textStyle The text style for the digits in the counter.
     */
    @Composable
    fun sizes(
        size: Dp = 8.dp,
        contentPadding: PaddingValues = PaddingValues(horizontal = 6.dp, vertical = 2.dp),
        shape: Shape = PersianTheme.shapes.shape12,
        badgeRightOffset: Dp = 10.dp,
        badgeTopOffset: Dp = 10.dp,
        textStyle: TextStyle = PersianTheme.typography.labelMedium
    ) = CounterSizes(
        size = size,
        contentPadding = contentPadding,
        shape = shape,
        badgeRightOffset = badgeRightOffset,
        badgeTopOffset = badgeTopOffset,
        textStyle = textStyle
    )
}

/**
 * Represents the container and content colors used in a counter in different states.
 *
 * @param containerColor The background color of the counter.
 * @param contentColor The text color of the counter.
 */
@Immutable
class CounterColors internal constructor(
    val containerColor: Color,
    val contentColor: Color
)

/**
 * Represents the container and content sizes used in a counter in different states.
 *
 * @param size The size of container for the dot badge.
 * @param contentPadding The padding values for the digits in the counter.
 * @param shape The shape defining the corner radius of the counter.
 * @param badgeRightOffset The offset on the right side of the anchor
 * @param badgeTopOffset The offset from the top of the anchor.
 * @param textStyle The text style for the digits in the counter.
 */
@Immutable
class CounterSizes internal constructor(
    internal val size: Dp,
    internal val contentPadding: PaddingValues,
    internal val shape: Shape,
    internal val badgeRightOffset: Dp,
    internal val badgeTopOffset: Dp,
    internal val textStyle: TextStyle
) {

    /**
     * Creates a copy of this [CounterSizes] instance with the specified properties.
     */
    fun copy(
        size: Dp = this.size,
        contentPadding: PaddingValues = this.contentPadding,
        shape: Shape = this.shape,

        badgeHorizontalOffset: Dp = this.badgeRightOffset,
        badgeVerticalOffset: Dp = this.badgeTopOffset,

        textStyle: TextStyle = this.textStyle
    ) = CounterSizes(
        size = size,
        contentPadding = contentPadding,
        shape = shape,

        badgeRightOffset = badgeHorizontalOffset,
        badgeTopOffset = badgeVerticalOffset,

        textStyle = textStyle
    )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is CounterSizes) return false

        if (size != other.size) return false
        if (contentPadding != other.contentPadding) return false
        if (shape != other.shape) return false

        if (badgeRightOffset != other.badgeRightOffset) return false
        if (badgeTopOffset != other.badgeTopOffset) return false

        return textStyle == other.textStyle
    }

    override fun hashCode(): Int {
        var result = size.hashCode()
        result = 31 * result + contentPadding.hashCode()
        result = 31 * result + shape.hashCode()

        result = 31 * result + badgeRightOffset.hashCode()
        result = 31 * result + badgeTopOffset.hashCode()

        result = 31 * result + textStyle.hashCode()
        return result
    }
}