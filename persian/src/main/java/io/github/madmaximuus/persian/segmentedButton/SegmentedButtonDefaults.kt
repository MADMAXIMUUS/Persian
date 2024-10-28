package io.github.madmaximuus.persian.segmentedButton

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.takeOrElse
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.state12
import io.github.madmaximuus.persian.foundation.state38
import io.github.madmaximuus.persian.icon.IconDefaults
import io.github.madmaximuus.persian.icon.IconSizes

/**
 * Contains all default values used by segmented button
 */
object SegmentedButtonDefaults {

    /**
     * A composable function that creates a [SegmentedButtonColors] instance with customizable color configurations.
     *
     * This function allows you to define the colors for different states of segmented buttons, including active,
     * inactive, and disabled states. Each state can have its own container, content, and border colors.
     *
     * @param activeContainerColor The container color for active buttons.
     * @param activeContentColor The content color for active buttons.
     * @param activeBorderColor The border color for active buttons.
     * @param inactiveContainerColor The container color for inactive buttons.
     * @param inactiveContentColor The content color for inactive buttons.
     * @param inactiveBorderColor The border color for inactive buttons.
     * @param disabledActiveContainerColor The container color for disabled active buttons.
     * @param disabledActiveContentColor The content color for disabled active buttons.
     * @param disabledActiveBorderColor The border color for disabled active buttons.
     * @param disabledInactiveContainerColor The container color for disabled inactive buttons.
     * @param disabledInactiveContentColor The content color for disabled inactive buttons.
     * @param disabledInactiveBorderColor The border color for disabled inactive buttons.
     */
    @Composable
    fun colors(
        activeContainerColor: Color = PersianTheme.colorScheme.secondaryContainer,
        activeContentColor: Color = PersianTheme.colorScheme.onSecondaryContainer,
        activeBorderColor: Color = PersianTheme.colorScheme.outline,
        inactiveContainerColor: Color = PersianTheme.colorScheme.surface,
        inactiveContentColor: Color = PersianTheme.colorScheme.onSurface,
        inactiveBorderColor: Color = PersianTheme.colorScheme.outline,
        disabledActiveContainerColor: Color = PersianTheme.colorScheme.surface,
        disabledActiveContentColor: Color = PersianTheme.colorScheme.onSurface.state38,
        disabledActiveBorderColor: Color = PersianTheme.colorScheme.onSurface.state12,
        disabledInactiveContainerColor: Color = PersianTheme.colorScheme.surface,
        disabledInactiveContentColor: Color = PersianTheme.colorScheme.onSurface.state38,
        disabledInactiveBorderColor: Color = PersianTheme.colorScheme.onSurface.state12,
    ): SegmentedButtonColors =
        SegmentedButtonColors(
            activeContainerColor = activeContainerColor,
            activeContentColor = activeContentColor,
            activeBorderColor = activeBorderColor,
            inactiveContainerColor = inactiveContainerColor,
            inactiveContentColor = inactiveContentColor,
            inactiveBorderColor = inactiveBorderColor,
            disabledActiveContainerColor = disabledActiveContainerColor,
            disabledActiveContentColor = disabledActiveContentColor,
            disabledActiveBorderColor = disabledActiveBorderColor,
            disabledInactiveContainerColor = disabledInactiveContainerColor,
            disabledInactiveContentColor = disabledInactiveContentColor,
            disabledInactiveBorderColor = disabledInactiveBorderColor
        )

    /**
     * A composable function that creates a [SegmentedButtonSizes] instance with small size configurations.
     *
     * This function allows you to define the sizes for segmented buttons, including height, icon sizes, label text style,
     * base shape, and border width. These configurations are typically used for small-sized segmented buttons.
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
        labelTextStyle: TextStyle = PersianTheme.typography.labelMedium,
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
     * A composable function that creates a [SegmentedButtonSizes] instance with medium size configurations.
     *
     * This function allows you to define the sizes for segmented buttons, including height, icon sizes, label text style,
     * base shape, and border width. These configurations are typically used for medium-sized segmented buttons.
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
        labelTextStyle: TextStyle = PersianTheme.typography.labelLarge,
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
     * A composable function that creates a [SegmentedButtonSizes] instance with large size configurations.
     *
     * This function allows you to define the sizes for segmented buttons, including height, icon sizes, label text style,
     * base shape, and border width. These configurations are typically used for large-sized segmented buttons.
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
        labelTextStyle: TextStyle = PersianTheme.typography.titleMedium,
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
 * @param disabledActiveContainerColor the color used for the container when disabled and active
 * @param disabledActiveContentColor the color used for the content when disabled and active
 * @param disabledActiveBorderColor the color used for the border when disabled and active
 * @param disabledInactiveContainerColor the color used for the container when disabled and inactive
 * @param disabledInactiveContentColor the color used for the content when disabled and inactive
 * @param disabledInactiveBorderColor the color used for the border when disabled and inactive
 * @constructor create an instance with arbitrary colors, see [SegmentedButtonDefaults] for a
 *   factory method using the default material3 spec
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
    private val inactiveBorderColor: Color,
    // disable & active
    private val disabledActiveContainerColor: Color,
    private val disabledActiveContentColor: Color,
    private val disabledActiveBorderColor: Color,
    // disable & inactive
    private val disabledInactiveContainerColor: Color,
    private val disabledInactiveContentColor: Color,
    private val disabledInactiveBorderColor: Color
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
        inactiveBorderColor: Color = this.inactiveBorderColor,
        disabledActiveContainerColor: Color = this.disabledActiveContainerColor,
        disabledActiveContentColor: Color = this.disabledActiveContentColor,
        disabledActiveBorderColor: Color = this.disabledActiveBorderColor,
        disabledInactiveContainerColor: Color = this.disabledInactiveContainerColor,
        disabledInactiveContentColor: Color = this.disabledInactiveContentColor,
        disabledInactiveBorderColor: Color = this.disabledInactiveBorderColor
    ): SegmentedButtonColors =
        SegmentedButtonColors(
            activeContainerColor.takeOrElse { this.activeContainerColor },
            activeContentColor.takeOrElse { this.activeContentColor },
            activeBorderColor.takeOrElse { this.activeBorderColor },
            inactiveContainerColor.takeOrElse { this.inactiveContainerColor },
            inactiveContentColor.takeOrElse { this.inactiveContentColor },
            inactiveBorderColor.takeOrElse { this.inactiveBorderColor },
            disabledActiveContainerColor.takeOrElse { this.disabledActiveContainerColor },
            disabledActiveContentColor.takeOrElse { this.disabledActiveContentColor },
            disabledActiveBorderColor.takeOrElse { this.disabledActiveBorderColor },
            disabledInactiveContainerColor.takeOrElse { this.disabledInactiveContainerColor },
            disabledInactiveContentColor.takeOrElse { this.disabledInactiveContentColor },
            disabledInactiveBorderColor.takeOrElse { this.disabledInactiveBorderColor }
        )

    /**
     * Represents the color used for the SegmentedButton's border, depending on [enabled] and
     * [active].
     *
     * @param enabled whether the [StartSegment], [MiddleSegment], [EndSegment] is enabled or not
     * @param active whether the [StartSegment], [MiddleSegment], [EndSegment] item is checked or not
     */
    @Stable
    internal fun borderColor(enabled: Boolean, active: Boolean): Color {
        return when {
            enabled && active -> activeBorderColor
            enabled && !active -> inactiveBorderColor
            !enabled && active -> disabledActiveBorderColor
            else -> disabledInactiveBorderColor
        }
    }

    /**
     * Represents the content color passed to the items
     *
     * @param enabled whether the [StartSegment], [MiddleSegment], [EndSegment] is enabled or not
     * @param checked whether the [StartSegment], [MiddleSegment], [EndSegment] item is checked or not
     */
    @Stable
    internal fun contentColor(enabled: Boolean, checked: Boolean): Color {
        return when {
            enabled && checked -> activeContentColor
            enabled && !checked -> inactiveContentColor
            !enabled && checked -> disabledActiveContentColor
            else -> disabledInactiveContentColor
        }
    }

    /**
     * Represents the container color passed to the items
     *
     * @param enabled whether the [StartSegment], [MiddleSegment], [EndSegment] is enabled or not
     * @param active whether the [StartSegment], [MiddleSegment], [EndSegment] item is active or not
     */
    @Stable
    internal fun containerColor(enabled: Boolean, active: Boolean): Color {
        return when {
            enabled && active -> activeContainerColor
            enabled && !active -> inactiveContainerColor
            !enabled && active -> disabledActiveContainerColor
            else -> disabledInactiveContainerColor
        }
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
        if (disabledActiveBorderColor != other.disabledActiveBorderColor) return false
        if (disabledActiveContentColor != other.disabledActiveContentColor) return false
        if (disabledActiveContainerColor != other.disabledActiveContainerColor) return false
        if (disabledInactiveBorderColor != other.disabledInactiveBorderColor) return false
        if (disabledInactiveContentColor != other.disabledInactiveContentColor) return false
        if (disabledInactiveContainerColor != other.disabledInactiveContainerColor) return false

        return true
    }

    override fun hashCode(): Int {
        var result = activeBorderColor.hashCode()
        result = 31 * result + activeContentColor.hashCode()
        result = 31 * result + activeContainerColor.hashCode()
        result = 31 * result + inactiveBorderColor.hashCode()
        result = 31 * result + inactiveContentColor.hashCode()
        result = 31 * result + inactiveContainerColor.hashCode()
        result = 31 * result + disabledActiveBorderColor.hashCode()
        result = 31 * result + disabledActiveContentColor.hashCode()
        result = 31 * result + disabledActiveContainerColor.hashCode()
        result = 31 * result + disabledInactiveBorderColor.hashCode()
        result = 31 * result + disabledInactiveContentColor.hashCode()
        result = 31 * result + disabledInactiveContainerColor.hashCode()
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