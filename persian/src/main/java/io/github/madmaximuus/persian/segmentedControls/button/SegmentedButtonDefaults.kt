package io.github.madmaximuus.persian.segmentedControls.button

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.icon.IconDefaults
import io.github.madmaximuus.persian.icon.IconSizes

/**
 * Contains all default values used by [SingleChoiceSegmentedButtonRow] and [MultiChoiceSegmentedButtonRow]
 */
object SegmentedButtonDefaults {

    /**
     * Creates a [SegmentedButtonRowColors] instance with customizable color configurations.
     *
     * @param containerColor The container color for container of segmented button.
     * @param segmentColors The content color for segments of segmented button.
     */
    @Composable
    fun colors(
        containerColor: Color = PersianTheme.colorScheme.surfaceContainerHighest,
        segmentColors: SegmentColors = segmentColors(),
    ) = SegmentedButtonRowColors(
        containerColor = containerColor,
        segmentColors = segmentColors,
    )

    /**
     * Creates a [SegmentColors] instance with customizable color configurations.
     *
     * @param activeContainerColor The container color for active buttons.
     * @param activeContentColor The content color for active buttons.
     * @param inactiveContentColor The content color for inactive buttons.
     */
    @Composable
    fun segmentColors(
        activeContainerColor: Color = PersianTheme.colorScheme.primary,
        activeContentColor: Color = PersianTheme.colorScheme.onPrimary,
        inactiveContentColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
    ) = SegmentColors(
        activeContainerColor = activeContainerColor,
        activeContentColor = activeContentColor,
        inactiveContentColor = inactiveContentColor,
    )

    /**
     * Creates a [SegmentedButtonRowSizes] instance with small size configurations.
     *
     * @param height The height of the segmented buttons.
     * @param iconSize The size of the default icons.
     * @param selectedIconSizes The size of the selected icons.
     * @param labelTextStyle The text style for the labels.
     * @param shape The base shape of the segmented buttons.
     */
    @Composable
    fun smallSizes(
        height: Dp = 36.dp,
        iconSize: IconSizes = IconDefaults.size18(),
        selectedIconSizes: IconSizes = IconDefaults.size18(),
        labelTextStyle: TextStyle = PersianTheme.typography.buttonSmall,
        shape: CornerBasedShape = PersianTheme.shapes.shape12,
    ) = SegmentedButtonRowSizes(
        height = height,
        iconSize = iconSize,
        labelTextStyle = labelTextStyle,
        shape = shape
    )

    /**
     * Creates a [SegmentedButtonRowSizes] instance with medium size configurations.
     *
     * @param height The height of the segmented buttons.
     * @param iconSize The size of the default icons.
     * @param labelTextStyle The text style for the labels.
     * @param shape The shape of the segmented buttons.
     */
    @Composable
    fun mediumSizes(
        height: Dp = 44.dp,
        iconSize: IconSizes = IconDefaults.size20(),
        labelTextStyle: TextStyle = PersianTheme.typography.buttonMedium,
        shape: CornerBasedShape = PersianTheme.shapes.shape14
    ) = SegmentedButtonRowSizes(
        height = height,
        iconSize = iconSize,
        labelTextStyle = labelTextStyle,
        shape = shape
    )

    /**
     * Creates a [SegmentedButtonRowSizes] instance with large size configurations.
     *
     * @param height The height of the segmented buttons.
     * @param iconSize The size of the default icons.
     * @param labelTextStyle The text style for the labels.
     * @param shape The shape of the segmented buttons.
     */
    @Composable
    fun largeSizes(
        height: Dp = 52.dp,
        iconSize: IconSizes = IconDefaults.size24(),
        labelTextStyle: TextStyle = PersianTheme.typography.buttonLarge,
        shape: CornerBasedShape = PersianTheme.shapes.shape16,
    ) = SegmentedButtonRowSizes(
        height = height,
        iconSize = iconSize,
        labelTextStyle = labelTextStyle,
        shape = shape,
    )
}

/**
 * The different colors used in parts of the [Segment] in different states
 *
 * @param containerColor the color used for the container when active
 * @param segmentColors the color used for the content when active
 */
@Immutable
class SegmentedButtonRowColors internal constructor(
    internal val containerColor: Color,
    internal val segmentColors: SegmentColors,
) {
    /**
     * Returns a copy of this SegmentedButtonColors, optionally overriding some of the ues.
     */
    fun copy(
        containerColor: Color = this.containerColor,
        segmentColors: SegmentColors = this.segmentColors,
    ) = SegmentedButtonRowColors(
        containerColor = containerColor,
        segmentColors = segmentColors
    )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other === null) return false
        if (this::class != other::class) return false

        other as SegmentedButtonRowColors

        if (containerColor != other.containerColor) return false
        if (segmentColors != other.segmentColors) return false

        return true
    }

    override fun hashCode(): Int {
        var result = containerColor.hashCode()
        result = 31 * result + segmentColors.hashCode()
        return result
    }
}

/**
 * The different colors used in parts of the [Segment] in different states
 *
 * @param activeContainerColor the color used for the container when active
 * @param activeContentColor the color used for the content when active
 * @param inactiveContentColor the color used for the content when inactive
 */
@Immutable
class SegmentColors internal constructor(
    // active
    internal val activeContainerColor: Color,
    private val activeContentColor: Color,
    // inactive
    private val inactiveContentColor: Color,
) {
    /**
     * Returns a copy of this SegmentedButtonColors, optionally overriding some of the ues.
     */
    fun copy(
        activeContainerColor: Color = this.activeContainerColor,
        activeContentColor: Color = this.activeContentColor,
        inactiveContentColor: Color = this.inactiveContentColor,
    ) = SegmentColors(
        activeContainerColor = activeContainerColor,
        activeContentColor = activeContentColor,
        inactiveContentColor = inactiveContentColor
    )

    /**
     * Represents the content color passed to the items
     *
     * @param active whether the [Segment] item is checked or not
     */
    @Stable
    internal fun contentColor(active: Boolean): Color {
        return if (active) activeContentColor
        else inactiveContentColor
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other === null) return false
        if (this::class != other::class) return false

        other as SegmentColors

        if (activeContentColor != other.activeContentColor) return false
        if (activeContainerColor != other.activeContainerColor) return false
        if (inactiveContentColor != other.inactiveContentColor) return false

        return true
    }

    override fun hashCode(): Int {
        var result = activeContentColor.hashCode()
        result = 31 * result + activeContainerColor.hashCode()
        result = 31 * result + inactiveContentColor.hashCode()
        return result
    }
}

/**
 * The different sizes used in parts of the [Segment] in different states
 *
 * @param iconSize the size used for leading icon
 * @param labelTextStyle the style used for label
 * @param shape the shape used for segment row
 */
@Immutable
class SegmentedButtonRowSizes internal constructor(
    internal val height: Dp,
    internal val iconSize: IconSizes,
    internal val labelTextStyle: TextStyle,
    internal val shape: CornerBasedShape,
) {
    /**
     * Returns a copy of this SegmentedButtonSizes, optionally overriding some of the ues.
     */
    fun copy(
        height: Dp = this.height,
        iconSize: IconSizes = this.iconSize,
        labelTextStyle: TextStyle = this.labelTextStyle,
        shape: CornerBasedShape = this.shape,
    ) = SegmentedButtonRowSizes(
        height = height,
        iconSize = iconSize,
        labelTextStyle = labelTextStyle,
        shape = shape
    )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other === null) return false
        if (this::class != other::class) return false

        other as SegmentedButtonRowSizes

        if (iconSize != other.iconSize) return false
        if (height != other.height) return false
        if (labelTextStyle != other.labelTextStyle) return false
        if (shape != other.shape) return false

        return true
    }

    override fun hashCode(): Int {
        var result = iconSize.hashCode()
        result = 31 * result + height.hashCode()
        result = 31 * result + labelTextStyle.hashCode()
        result = 31 * result + shape.hashCode()
        return result
    }
}