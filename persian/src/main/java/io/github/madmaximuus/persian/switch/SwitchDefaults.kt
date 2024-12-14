package io.github.madmaximuus.persian.switch

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.takeOrElse
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.icon.IconDefaults
import io.github.madmaximuus.persian.icon.IconSizes

/**
 * Contains all default values used by [Switch]
 */
object SwitchDefaults {

    /**
     * Create a [SwitchColors] instance with customizable color properties.
     *
     * This function allows you to specify the colors for various states of a switch component,
     * including checked, unchecked, and disabled states for the thumb, track, border, and icon.
     *
     * @param checkedThumbColor The color of the thumb when the switch is checked.
     * @param checkedTrackColor The color of the track when the switch is checked.
     * @param checkedBorderColor The color of the border when the switch is checked.
     * @param checkedIconColor The color of the icon when the switch is checked.
     * @param uncheckedThumbColor The color of the thumb when the switch is unchecked.
     * @param uncheckedTrackColor The color of the track when the switch is unchecked.
     * @param uncheckedBorderColor The color of the border when the switch is unchecked.
     * @param uncheckedIconColor The color of the icon when the switch is unchecked.
     */
    @Composable
    fun colors(
        checkedThumbColor: Color = PersianTheme.colorScheme.onPrimary,
        checkedTrackColor: Color = PersianTheme.colorScheme.primary,
        checkedBorderColor: Color = PersianTheme.colorScheme.primary,
        checkedIconColor: Color = PersianTheme.colorScheme.onPrimaryContainer,
        uncheckedThumbColor: Color = PersianTheme.colorScheme.onPrimaryContainer,
        uncheckedTrackColor: Color = PersianTheme.colorScheme.surfaceContainerHighest,
        uncheckedBorderColor: Color = PersianTheme.colorScheme.primary,
        uncheckedIconColor: Color = PersianTheme.colorScheme.onPrimary,
    ): SwitchColors =
        SwitchColors(
            checkedThumbColor = checkedThumbColor,
            checkedTrackColor = checkedTrackColor,
            checkedBorderColor = checkedBorderColor,
            checkedIconColor = checkedIconColor,
            uncheckedThumbColor = uncheckedThumbColor,
            uncheckedTrackColor = uncheckedTrackColor,
            uncheckedBorderColor = uncheckedBorderColor,
            uncheckedIconColor = uncheckedIconColor
        )

    /**
     * Create a [SwitchSizes] instance with customizable size and shape properties.
     *
     * This function allows you to specify the sizes and shapes for various parts of a switch component,
     * including the toggle (thumb), icon, track, and track border.
     *
     * @param toggleSize The size of the toggle (thumb) when the switch is checked.
     * @param uncheckedToggleSizes The size of the toggle (thumb) when the switch is unchecked.
     * @param iconSizes The sizes of the icon within the switch.
     * @param toggleShape The shape of the toggle (thumb).
     * @param trackShape The shape of the track.
     * @param trackBorderWith The width of the border around the track.
     */
    @Composable
    fun sizes(
        toggleSize: Dp = 24.dp,
        uncheckedToggleSizes: Dp = 16.dp,
        iconSizes: IconSizes = IconDefaults.size18(),
        toggleShape: Shape = PersianTheme.shapes.full,
        trackShape: Shape = PersianTheme.shapes.full,
        trackBorderWith: Dp = 2.dp
    ): SwitchSizes = SwitchSizes(
        toggleSize = toggleSize,
        uncheckedToggleSizes = uncheckedToggleSizes,
        iconSizes = iconSizes,
        toggleShape = toggleShape,
        trackShape = trackShape,
        trackBorderWith = trackBorderWith
    )
}

/**
 * Immutable class representing the colors for a switch UI component.
 *
 * This class encapsulates the various color states for a switch, including checked, unchecked,
 * and disabled states for the thumb, track, border, and icon.
 *
 * @param checkedThumbColor The color of the thumb when the switch is checked.
 * @param checkedTrackColor The color of the track when the switch is checked.
 * @param checkedBorderColor The color of the border when the switch is checked.
 * @param checkedIconColor The color of the icon when the switch is checked.
 * @param uncheckedThumbColor The color of the thumb when the switch is unchecked.
 * @param uncheckedTrackColor The color of the track when the switch is unchecked.
 * @param uncheckedBorderColor The color of the border when the switch is unchecked.
 * @param uncheckedIconColor The color of the icon when the switch is unchecked.
 */
@Immutable
class SwitchColors internal constructor(
    private val checkedThumbColor: Color,
    private val checkedTrackColor: Color,
    private val checkedBorderColor: Color,
    private val checkedIconColor: Color,
    private val uncheckedThumbColor: Color,
    private val uncheckedTrackColor: Color,
    private val uncheckedBorderColor: Color,
    private val uncheckedIconColor: Color
) {
    /**
     * Returns a copy of this SwitchColors, optionally overriding some of the values.
     */
    fun copy(
        checkedThumbColor: Color = this.checkedThumbColor,
        checkedTrackColor: Color = this.checkedTrackColor,
        checkedBorderColor: Color = this.checkedBorderColor,
        checkedIconColor: Color = this.checkedIconColor,
        uncheckedThumbColor: Color = this.uncheckedThumbColor,
        uncheckedTrackColor: Color = this.uncheckedTrackColor,
        uncheckedBorderColor: Color = this.uncheckedBorderColor,
        uncheckedIconColor: Color = this.uncheckedIconColor,
    ): SwitchColors =
        SwitchColors(
            checkedThumbColor = checkedThumbColor,
            checkedTrackColor = checkedTrackColor,
            checkedBorderColor = checkedBorderColor,
            checkedIconColor = checkedIconColor,
            uncheckedThumbColor = uncheckedThumbColor,
            uncheckedTrackColor = uncheckedTrackColor,
            uncheckedBorderColor = uncheckedBorderColor,
            uncheckedIconColor = uncheckedIconColor
        )

    /**
     * Represents the color used for the switch's thumb, depending on [checked].
     *
     * @param checked whether the [Switch] is checked or not
     */
    @Stable
    internal fun thumbColor(checked: Boolean): Color =
        if (checked) checkedThumbColor else uncheckedThumbColor

    /**
     * Represents the color used for the switch's track, depending on [checked].
     *
     * @param checked whether the [Switch] is checked or not
     */
    @Stable
    internal fun trackColor(checked: Boolean): Color =
        if (checked) checkedTrackColor else uncheckedTrackColor

    /**
     * Represents the color used for the switch's border, depending on [checked].
     *
     * @param checked whether the [Switch] is checked or not
     */
    @Stable
    internal fun borderColor(checked: Boolean): Color =
        if (checked) checkedBorderColor else uncheckedBorderColor

    /**
     * Represents the content color passed to the icon if used
     *
     * @param checked whether the [Switch] is checked or not
     */
    @Stable
    internal fun iconColor(checked: Boolean): Color =
        if (checked) checkedIconColor else uncheckedIconColor

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is SwitchColors) return false

        if (checkedThumbColor != other.checkedThumbColor) return false
        if (checkedTrackColor != other.checkedTrackColor) return false
        if (checkedBorderColor != other.checkedBorderColor) return false
        if (checkedIconColor != other.checkedIconColor) return false
        if (uncheckedThumbColor != other.uncheckedThumbColor) return false
        if (uncheckedTrackColor != other.uncheckedTrackColor) return false
        if (uncheckedBorderColor != other.uncheckedBorderColor) return false
        if (uncheckedIconColor != other.uncheckedIconColor) return false

        return true
    }

    override fun hashCode(): Int {
        var result = checkedThumbColor.hashCode()
        result = 31 * result + checkedTrackColor.hashCode()
        result = 31 * result + checkedBorderColor.hashCode()
        result = 31 * result + checkedIconColor.hashCode()
        result = 31 * result + uncheckedThumbColor.hashCode()
        result = 31 * result + uncheckedTrackColor.hashCode()
        result = 31 * result + uncheckedBorderColor.hashCode()
        result = 31 * result + uncheckedIconColor.hashCode()
        return result
    }
}

/**
 * Immutable class representing the sizes and shapes for a switch UI component.
 *
 * This class encapsulates the various size and shape properties for a switch, including the sizes
 * of the toggle, icon, and track, as well as the shapes of the toggle and track, and the width of
 * the track border.
 *
 * @param toggleSize The size of the toggle (thumb) when the switch is checked.
 * @param uncheckedToggleSizes The size of the toggle (thumb) when the switch is unchecked.
 * @param iconSizes The sizes of the icon within the switch.
 * @param toggleShape The shape of the toggle (thumb).
 * @param trackShape The shape of the track.
 * @param trackBorderWith The width of the border around the track.
 */
@Immutable
class SwitchSizes(
    internal val toggleSize: Dp,
    internal val uncheckedToggleSizes: Dp,
    internal val iconSizes: IconSizes,
    internal val toggleShape: Shape,
    internal val trackShape: Shape,
    internal val trackBorderWith: Dp
) {
    /**
     * Returns a copy of this SwitchS, optionally overriding some of the values.
     */
    fun copy(
        toggleSize: Dp = this.toggleSize,
        uncheckedToggleSizes: Dp = this.uncheckedToggleSizes,
        iconSizes: IconSizes = this.iconSizes,
        toggleShape: Shape = this.toggleShape,
        trackShape: Shape = this.trackShape,
        trackBorderWith: Dp = this.trackBorderWith,
    ): SwitchSizes =
        SwitchSizes(
            toggleSize = toggleSize.takeOrElse { this.toggleSize },
            uncheckedToggleSizes = uncheckedToggleSizes.takeOrElse { this.uncheckedToggleSizes },
            iconSizes = iconSizes,
            toggleShape = toggleShape,
            trackShape = trackShape,
            trackBorderWith = trackBorderWith.takeOrElse { this.trackBorderWith },
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is SwitchSizes) return false

        if (toggleSize != other.toggleSize) return false
        if (uncheckedToggleSizes != other.uncheckedToggleSizes) return false
        if (iconSizes != other.iconSizes) return false
        if (toggleShape != other.toggleShape) return false
        if (trackShape != other.trackShape) return false
        if (trackBorderWith != other.trackBorderWith) return false

        return true
    }

    override fun hashCode(): Int {
        var result = toggleSize.hashCode()
        result = 31 * result + uncheckedToggleSizes.hashCode()
        result = 31 * result + iconSizes.hashCode()
        result = 31 * result + toggleShape.hashCode()
        result = 31 * result + trackShape.hashCode()
        result = 31 * result + trackBorderWith.hashCode()
        return result
    }
}