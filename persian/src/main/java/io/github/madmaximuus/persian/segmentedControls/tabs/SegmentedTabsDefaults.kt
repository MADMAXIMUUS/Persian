package io.github.madmaximuus.persian.segmentedControls.tabs

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
 * Contains all default values used by [SegmentedTabsRow]
 */
object SegmentedTabsDefaults {

    /**
     * Creates a [SegmentedTabsColors] instance with customizable color configurations.
     *
     * @param indicatorColor The indicator color.
     * @param containerColor The container color.
     * @param activeContentColor The content color for active segment state.
     * @param inactiveContentColor The content color for inactive segment state.
     */
    @Composable
    fun colors(
        indicatorColor: Color = PersianTheme.colorScheme.surface,
        containerColor: Color = PersianTheme.colorScheme.surfaceContainerHighest,
        activeContentColor: Color = PersianTheme.colorScheme.onSurface,
        inactiveContentColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
    ) = SegmentedTabsColors(
        indicatorColor = indicatorColor,
        containerColor = containerColor,
        activeContentColor = activeContentColor,
        inactiveContentColor = inactiveContentColor
    )

    /**
     * Creates a [SegmentedTabsSizes] instance with small size configurations.
     *
     * @param height The height of the segmented tabs.
     * @param iconSize The size of the default icons.
     * @param labelTextStyle The text style for the labels.
     * @param indicatorPadding The padding for the indicator.
     * @param shape The shape of the segmented tabs.
     * @param segmentShape The border width of the segmented tabs.
     */
    @Composable
    fun smallSizes(
        height: Dp = 36.dp,
        iconSize: IconSizes = IconDefaults.size18(),
        labelTextStyle: TextStyle = PersianTheme.typography.buttonSmall,
        indicatorPadding: Dp = PersianTheme.spacing.size2,
        shape: CornerBasedShape = PersianTheme.shapes.shape12,
        segmentShape: CornerBasedShape = PersianTheme.shapes.shape10
    ) = SegmentedTabsSizes(
        height = height,
        iconSize = iconSize,
        labelTextStyle = labelTextStyle,
        indicatorPadding = indicatorPadding,
        shape = shape,
        segmentShape = segmentShape
    )

    /**
     * Creates a [SegmentedTabsSizes] instance with medium size configurations.
     *
     * @param height The height of the segmented tabs.
     * @param iconSize The size of the default icons.
     * @param labelTextStyle The text style for the labels.
     * @param indicatorPadding The padding for the indicator.
     * @param shape The shape of the segmented tabs.
     * @param segmentShape The border width of the segmented tabs.
     */
    @Composable
    fun mediumSizes(
        height: Dp = 44.dp,
        iconSize: IconSizes = IconDefaults.size20(),
        labelTextStyle: TextStyle = PersianTheme.typography.buttonMedium,
        indicatorPadding: Dp = PersianTheme.spacing.size2,
        shape: CornerBasedShape = PersianTheme.shapes.shape14,
        segmentShape: CornerBasedShape = PersianTheme.shapes.shape12
    ) = SegmentedTabsSizes(
        height = height,
        iconSize = iconSize,
        labelTextStyle = labelTextStyle,
        indicatorPadding = indicatorPadding,
        shape = shape,
        segmentShape = segmentShape
    )

    /**
     * Creates a [SegmentedTabsSizes] instance with large size configurations.
     *
     * @param height The height of the segmented tabs.
     * @param iconSize The size of the default icons.
     * @param labelTextStyle The text style for the labels.
     * @param indicatorPadding The padding for the indicator.
     * @param shape The shape of the segmented tabs.
     * @param segmentShape The border width of the segmented tabs.
     */
    @Composable
    fun largeSizes(
        height: Dp = 52.dp,
        iconSize: IconSizes = IconDefaults.size24(),
        labelTextStyle: TextStyle = PersianTheme.typography.buttonLarge,
        indicatorPadding: Dp = PersianTheme.spacing.size2,
        shape: CornerBasedShape = PersianTheme.shapes.shape16,
        segmentShape: CornerBasedShape = PersianTheme.shapes.shape14
    ) = SegmentedTabsSizes(
        height = height,
        iconSize = iconSize,
        labelTextStyle = labelTextStyle,
        indicatorPadding = indicatorPadding,
        shape = shape,
        segmentShape = segmentShape
    )
}

/**
 * The different colors used in parts of the [Segment]  in different states
 *
 * @param indicatorColor the color used for the indicator
 * @param containerColor the color used for the container
 * @param activeContentColor the color used for the content when active
 * @param inactiveContentColor the color used for the content when inactive
 */
@Immutable
class SegmentedTabsColors internal constructor(
    internal val indicatorColor: Color,
    internal val containerColor: Color,
    private val activeContentColor: Color,
    private val inactiveContentColor: Color,
) {
    /**
     * Returns a copy of this SegmentedButtonColors, optionally overriding some of the ues.
     */
    fun copy(
        indicatorColor: Color = this.indicatorColor,
        containerColor: Color = this.containerColor,
        activeContentColor: Color = this.activeContentColor,
        inactiveContentColor: Color = this.inactiveContentColor,
    ) = SegmentedTabsColors(
        indicatorColor = indicatorColor,
        containerColor = containerColor,
        activeContentColor = activeContentColor,
        inactiveContentColor = inactiveContentColor,
    )

    /**
     * Represents the content color passed to the items
     *
     * @param checked whether the [Segment] item is checked or not
     */
    @Stable
    internal fun contentColor(checked: Boolean): Color {
        return if (checked) activeContentColor
        else inactiveContentColor
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other === null) return false
        if (this::class != other::class) return false

        other as SegmentedTabsColors

        if (indicatorColor != other.indicatorColor) return false
        if (containerColor != other.containerColor) return false
        if (activeContentColor != other.activeContentColor) return false
        if (inactiveContentColor != other.inactiveContentColor) return false

        return true
    }

    override fun hashCode(): Int {
        var result = indicatorColor.hashCode()
        result = 31 * result + containerColor.hashCode()
        result = 31 * result + activeContentColor.hashCode()
        result = 31 * result + inactiveContentColor.hashCode()
        return result
    }
}


/**
 * The different sizes used in parts of the [Segment] in different states
 *
 * @param height the height of segmented tabs.
 * @param iconSize the size used for leading icon
 * @param labelTextStyle the style used for label
 * @param indicatorPadding the style used for label
 * @param shape the shape used for segmented row
 * @param segmentShape the shape used for segment
 */
@Immutable
class SegmentedTabsSizes internal constructor(
    internal val height: Dp,
    internal val iconSize: IconSizes,
    internal val labelTextStyle: TextStyle,
    internal val indicatorPadding: Dp,
    internal val shape: CornerBasedShape,
    internal val segmentShape: CornerBasedShape
) {
    /**
     * Returns a copy of this SegmentedButtonSizes, optionally overriding some of the ues.
     */
    fun copy(
        height: Dp = this.height,
        iconSize: IconSizes = this.iconSize,
        labelTextStyle: TextStyle = this.labelTextStyle,
        indicatorPadding: Dp = this.indicatorPadding,
        shape: CornerBasedShape = this.shape,
        segmentShape: CornerBasedShape = this.segmentShape
    ) = SegmentedTabsSizes(
        height = height,
        iconSize = iconSize,
        labelTextStyle = labelTextStyle,
        indicatorPadding = indicatorPadding,
        shape = shape,
        segmentShape = segmentShape
    )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other === null) return false
        if (this::class != other::class) return false

        other as SegmentedTabsSizes

        if (iconSize != other.iconSize) return false
        if (height != other.height) return false
        if (labelTextStyle != other.labelTextStyle) return false
        if (indicatorPadding != other.indicatorPadding) return false
        if (shape != other.shape) return false
        if (segmentShape != other.segmentShape) return false

        return true
    }

    override fun hashCode(): Int {
        var result = iconSize.hashCode()
        result = 31 * result + height.hashCode()
        result = 31 * result + labelTextStyle.hashCode()
        result = 31 * result + indicatorPadding.hashCode()
        result = 31 * result + shape.hashCode()
        result = 31 * result + segmentShape.hashCode()
        return result
    }
}