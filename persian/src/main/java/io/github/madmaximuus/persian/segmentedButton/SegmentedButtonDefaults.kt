package io.github.madmaximuus.persian.segmentedButton

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
     * Creates a [SegmentedButtonColors] instance with customizable color configurations.
     *
     * @param activeContainerColor The container color for active buttons.
     * @param activeContentColor The content color for active buttons.
     * @param activeBorderColor The border color for active buttons.
     * @param inactiveContainerColor The container color for inactive buttons.
     * @param inactiveContentColor The content color for inactive buttons.
     * @param inactiveBorderColor The border color for inactive buttons.
     */
    @Composable
    fun colors(
        activeContainerColor: Color = PersianTheme.colorScheme.secondaryContainer,
        activeContentColor: Color = PersianTheme.colorScheme.onSecondaryContainer,
        activeBorderColor: Color = PersianTheme.colorScheme.outline,
        inactiveContainerColor: Color = PersianTheme.colorScheme.surface,
        inactiveContentColor: Color = PersianTheme.colorScheme.onSurface,
        inactiveBorderColor: Color = PersianTheme.colorScheme.outline,
    ): SegmentedButtonColors =
        SegmentedButtonColors(
            activeContainerColor = activeContainerColor,
            activeContentColor = activeContentColor,
            activeBorderColor = activeBorderColor,
            inactiveContainerColor = inactiveContainerColor,
            inactiveContentColor = inactiveContentColor,
            inactiveBorderColor = inactiveBorderColor,
        )

    /**
     * Creates a [SegmentedButtonSizes] instance with small size configurations.
     *
     * @param height The height of the segmented buttons.
     * @param iconSize The size of the default icons.
     * @param selectedIconSizes The size of the selected icons.
     * @param labelTextStyle The text style for the labels.
     * @param baseShape The base shape of the segmented buttons.
     * @param border The border width of the segmented buttons.
     */
    @Composable
    fun smallSizes(
        height: Dp = 36.dp,
        iconSize: IconSizes = IconDefaults.size18(),
        selectedIconSizes: IconSizes = IconDefaults.size18(),
        labelTextStyle: TextStyle = PersianTheme.typography.buttonSmall,
        baseShape: CornerBasedShape = PersianTheme.shapes.shape12,
        border: Dp = 1.dp
    ): SegmentedButtonSizes =
        SegmentedButtonSizes(
            height = height,
            iconSize = iconSize,
            selectedIconSizes = selectedIconSizes,
            labelTextStyle = labelTextStyle,
            baseShape = baseShape,
            border = border
        )

    /**
     * Creates a [SegmentedButtonSizes] instance with medium size configurations.
     *
     * @param height The height of the segmented buttons.
     * @param iconSize The size of the default icons.
     * @param selectedIconSizes The size of the selected icons.
     * @param labelTextStyle The text style for the labels.
     * @param baseShape The base shape of the segmented buttons.
     * @param border The border width of the segmented buttons.
     */
    @Composable
    fun mediumSizes(
        height: Dp = 44.dp,
        iconSize: IconSizes = IconDefaults.size20(),
        selectedIconSizes: IconSizes = IconDefaults.size20(),
        labelTextStyle: TextStyle = PersianTheme.typography.buttonMedium,
        baseShape: CornerBasedShape = PersianTheme.shapes.shape14,
        border: Dp = 1.dp
    ): SegmentedButtonSizes =
        SegmentedButtonSizes(
            height = height,
            iconSize = iconSize,
            selectedIconSizes = selectedIconSizes,
            labelTextStyle = labelTextStyle,
            baseShape = baseShape,
            border = border
        )

    /**
     * Creates a [SegmentedButtonSizes] instance with large size configurations.
     *
     * @param height The height of the segmented buttons.
     * @param iconSize The size of the default icons.
     * @param selectedIconSizes The size of the selected icons.
     * @param labelTextStyle The text style for the labels.
     * @param baseShape The base shape of the segmented buttons.
     * @param border The border width of the segmented buttons.
     */
    @Composable
    fun largeSizes(
        height: Dp = 52.dp,
        iconSize: IconSizes = IconDefaults.size24(),
        selectedIconSizes: IconSizes = IconDefaults.size24(),
        labelTextStyle: TextStyle = PersianTheme.typography.buttonLarge,
        baseShape: CornerBasedShape = PersianTheme.shapes.shape16,
        border: Dp = 1.dp
    ): SegmentedButtonSizes =
        SegmentedButtonSizes(
            height = height,
            iconSize = iconSize,
            selectedIconSizes = selectedIconSizes,
            labelTextStyle = labelTextStyle,
            baseShape = baseShape,
            border = border
        )
}

/**
 * The different colors used in parts of the [StartSegment],[MiddleSegment],[EndSegment]  in different states
 *
 * @param activeContainerColor the color used for the container when enabled and active
 * @param activeContentColor the color used for the content when enabled and active
 * @param activeBorderColor the color used for the border when enabled and active
 * @param inactiveContainerColor the color used for the container when enabled and inactive
 * @param inactiveContentColor the color used for the content when enabled and inactive
 * @param inactiveBorderColor the color used for the border when enabled and active
 */
@Immutable
class SegmentedButtonColors internal constructor(
    // enabled & active
    private val activeContainerColor: Color,
    private val activeContentColor: Color,
    private val activeBorderColor: Color,
    // enabled & inactive
    private val inactiveContainerColor: Color,
    private val inactiveContentColor: Color,
    private val inactiveBorderColor: Color
) {
    /**
     * Returns a copy of this SegmentedButtonColors, optionally overriding some of the ues.
     */
    fun copy(
        activeContainerColor: Color = this.activeContainerColor,
        activeContentColor: Color = this.activeContentColor,
        activeBorderColor: Color = this.activeBorderColor,
        inactiveContainerColor: Color = this.inactiveContainerColor,
        inactiveContentColor: Color = this.inactiveContentColor,
        inactiveBorderColor: Color = this.inactiveBorderColor
    ): SegmentedButtonColors =
        SegmentedButtonColors(
            activeContainerColor = activeContainerColor,
            activeContentColor = activeContentColor,
            activeBorderColor = activeBorderColor,
            inactiveContainerColor = inactiveContainerColor,
            inactiveContentColor = inactiveContentColor,
            inactiveBorderColor = inactiveBorderColor
        )

    /**
     * Represents the color used for the SegmentedButton's border, depending on [active].
     *
     * @param active whether the [StartSegment], [MiddleSegment], [EndSegment] item is checked or not
     */
    @Stable
    internal fun borderColor(active: Boolean): Color {
        return if (active) activeBorderColor
        else inactiveBorderColor

    }

    /**
     * Represents the content color passed to the items
     *
     * @param checked whether the [StartSegment], [MiddleSegment], [EndSegment] item is checked or not
     */
    @Stable
    internal fun contentColor(checked: Boolean): Color {
        return if (checked) activeContentColor
        else inactiveContentColor
    }

    /**
     * Represents the container color passed to the items
     *
     * @param active whether the [StartSegment], [MiddleSegment], [EndSegment] item is active or not
     */
    @Stable
    internal fun containerColor(active: Boolean): Color {
        return if (active)
            activeContainerColor
        else inactiveContainerColor
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other === null) return false
        if (this::class != other::class) return false

        other as SegmentedButtonColors

        if (activeBorderColor != other.activeBorderColor) return false
        if (activeContentColor != other.activeContentColor) return false
        if (activeContainerColor != other.activeContainerColor) return false
        if (inactiveBorderColor != other.inactiveBorderColor) return false
        if (inactiveContentColor != other.inactiveContentColor) return false
        if (inactiveContainerColor != other.inactiveContainerColor) return false

        return true
    }

    override fun hashCode(): Int {
        var result = activeBorderColor.hashCode()
        result = 31 * result + activeContentColor.hashCode()
        result = 31 * result + activeContainerColor.hashCode()
        result = 31 * result + inactiveBorderColor.hashCode()
        result = 31 * result + inactiveContentColor.hashCode()
        result = 31 * result + inactiveContainerColor.hashCode()
        return result
    }
}


/**
 * The different sizes used in parts of the [StartSegment], [MiddleSegment], [EndSegment] in different states
 *
 * @param iconSize the size used for leading icon
 * @param selectedIconSizes the size used for selected icon
 * @param labelTextStyle the style used for label
 * @param baseShape the base shape used for segment
 */
@Immutable
class SegmentedButtonSizes internal constructor(
    internal val height: Dp,
    internal val iconSize: IconSizes,
    internal val selectedIconSizes: IconSizes,
    internal val labelTextStyle: TextStyle,
    internal val baseShape: CornerBasedShape,
    internal val border: Dp
) {
    /**
     * Returns a copy of this SegmentedButtonSizes, optionally overriding some of the ues.
     */
    fun copy(
        height: Dp = this.height,
        iconSize: IconSizes = this.iconSize,
        selectedIconSizes: IconSizes = this.selectedIconSizes,
        labelTextStyle: TextStyle = this.labelTextStyle,
        baseShape: CornerBasedShape = this.baseShape,
        border: Dp = this.border
    ): SegmentedButtonSizes =
        SegmentedButtonSizes(
            height = height,
            iconSize = iconSize,
            selectedIconSizes = selectedIconSizes,
            labelTextStyle = labelTextStyle,
            baseShape = baseShape,
            border = border
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other === null) return false
        if (this::class != other::class) return false

        other as SegmentedButtonSizes

        if (iconSize != other.iconSize) return false
        if (height != other.height) return false
        if (selectedIconSizes != other.selectedIconSizes) return false
        if (labelTextStyle != other.labelTextStyle) return false
        if (baseShape != other.baseShape) return false
        if (border != other.border) return false

        return true
    }

    override fun hashCode(): Int {
        var result = iconSize.hashCode()
        result = 31 * result + height.hashCode()
        result = 31 * result + selectedIconSizes.hashCode()
        result = 31 * result + labelTextStyle.hashCode()
        result = 31 * result + baseShape.hashCode()
        result = 31 * result + border.hashCode()
        return result
    }
}