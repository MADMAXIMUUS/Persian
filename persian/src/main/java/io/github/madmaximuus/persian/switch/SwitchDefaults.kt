package io.github.madmaximuus.persian.switch

import androidx.compose.material3.Switch
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.takeOrElse
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.takeOrElse
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.state12
import io.github.madmaximuus.persian.foundation.state38
import io.github.madmaximuus.persian.icon.IconDefaults
import io.github.madmaximuus.persian.icon.IconSizes

object SwitchDefaults {

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
        disabledCheckedThumbColor: Color = PersianTheme.colorScheme.surface,
        disabledCheckedTrackColor: Color = PersianTheme.colorScheme.onSurface.state12,
        disabledCheckedBorderColor: Color = PersianTheme.colorScheme.onSurface.state12,
        disabledCheckedIconColor: Color = PersianTheme.colorScheme.onPrimaryContainer.state38,
        disabledUncheckedThumbColor: Color = PersianTheme.colorScheme.surface,
        disabledUncheckedTrackColor: Color = PersianTheme.colorScheme.onSurface.state12,
        disabledUncheckedBorderColor: Color = PersianTheme.colorScheme.onSurface.state12,
        disabledUncheckedIconColor: Color = PersianTheme.colorScheme.onSurface.state38,
    ): SwitchColors = SwitchColors(
        checkedThumbColor = checkedThumbColor,
        checkedTrackColor = checkedTrackColor,
        checkedBorderColor = checkedBorderColor,
        checkedIconColor = checkedIconColor,
        uncheckedThumbColor = uncheckedThumbColor,
        uncheckedTrackColor = uncheckedTrackColor,
        uncheckedBorderColor = uncheckedBorderColor,
        uncheckedIconColor = uncheckedIconColor,
        disabledCheckedThumbColor = disabledCheckedThumbColor,
        disabledCheckedTrackColor = disabledCheckedTrackColor,
        disabledCheckedBorderColor = disabledCheckedBorderColor,
        disabledCheckedIconColor = disabledCheckedIconColor,
        disabledUncheckedBorderColor = disabledUncheckedBorderColor,
        disabledUncheckedIconColor = disabledUncheckedIconColor,
        disabledUncheckedThumbColor = disabledUncheckedThumbColor,
        disabledUncheckedTrackColor = disabledUncheckedTrackColor
    )

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

@Immutable
class SwitchColors internal constructor(
    private val checkedThumbColor: Color,
    private val checkedTrackColor: Color,
    private val checkedBorderColor: Color,
    private val checkedIconColor: Color,
    private val uncheckedThumbColor: Color,
    private val uncheckedTrackColor: Color,
    private val uncheckedBorderColor: Color,
    private val uncheckedIconColor: Color,
    private val disabledCheckedThumbColor: Color,
    private val disabledCheckedTrackColor: Color,
    private val disabledCheckedBorderColor: Color,
    private val disabledCheckedIconColor: Color,
    private val disabledUncheckedThumbColor: Color,
    private val disabledUncheckedTrackColor: Color,
    private val disabledUncheckedBorderColor: Color,
    private val disabledUncheckedIconColor: Color
) {
    /**
     * Returns a copy of this SwitchColors, optionally overriding some of the values. This uses the
     * Color.Unspecified to mean “use the value from the source”
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
        disabledCheckedThumbColor: Color = this.disabledCheckedThumbColor,
        disabledCheckedTrackColor: Color = this.disabledCheckedTrackColor,
        disabledCheckedBorderColor: Color = this.disabledCheckedBorderColor,
        disabledCheckedIconColor: Color = this.disabledCheckedIconColor,
        disabledUncheckedThumbColor: Color = this.disabledUncheckedThumbColor,
        disabledUncheckedTrackColor: Color = this.disabledUncheckedTrackColor,
        disabledUncheckedBorderColor: Color = this.disabledUncheckedBorderColor,
        disabledUncheckedIconColor: Color = this.disabledUncheckedIconColor,
    ) =
        SwitchColors(
            checkedThumbColor.takeOrElse { this.checkedThumbColor },
            checkedTrackColor.takeOrElse { this.checkedTrackColor },
            checkedBorderColor.takeOrElse { this.checkedBorderColor },
            checkedIconColor.takeOrElse { this.checkedIconColor },
            uncheckedThumbColor.takeOrElse { this.uncheckedThumbColor },
            uncheckedTrackColor.takeOrElse { this.uncheckedTrackColor },
            uncheckedBorderColor.takeOrElse { this.uncheckedBorderColor },
            uncheckedIconColor.takeOrElse { this.uncheckedIconColor },
            disabledCheckedThumbColor.takeOrElse { this.disabledCheckedThumbColor },
            disabledCheckedTrackColor.takeOrElse { this.disabledCheckedTrackColor },
            disabledCheckedBorderColor.takeOrElse { this.disabledCheckedBorderColor },
            disabledCheckedIconColor.takeOrElse { this.disabledCheckedIconColor },
            disabledUncheckedThumbColor.takeOrElse { this.disabledUncheckedThumbColor },
            disabledUncheckedTrackColor.takeOrElse { this.disabledUncheckedTrackColor },
            disabledUncheckedBorderColor.takeOrElse { this.disabledUncheckedBorderColor },
            disabledUncheckedIconColor.takeOrElse { this.disabledUncheckedIconColor },
        )

    /**
     * Represents the color used for the switch's thumb, depending on [enabled] and [checked].
     *
     * @param enabled whether the [Switch] is enabled or not
     * @param checked whether the [Switch] is checked or not
     */
    @Stable
    internal fun thumbColor(enabled: Boolean, checked: Boolean): Color =
        if (enabled) {
            if (checked) checkedThumbColor else uncheckedThumbColor
        } else {
            if (checked) disabledCheckedThumbColor else disabledUncheckedThumbColor
        }

    /**
     * Represents the color used for the switch's track, depending on [enabled] and [checked].
     *
     * @param enabled whether the [Switch] is enabled or not
     * @param checked whether the [Switch] is checked or not
     */
    @Stable
    internal fun trackColor(enabled: Boolean, checked: Boolean): Color =
        if (enabled) {
            if (checked) checkedTrackColor else uncheckedTrackColor
        } else {
            if (checked) disabledCheckedTrackColor else disabledUncheckedTrackColor
        }

    /**
     * Represents the color used for the switch's border, depending on [enabled] and [checked].
     *
     * @param enabled whether the [Switch] is enabled or not
     * @param checked whether the [Switch] is checked or not
     */
    @Stable
    internal fun borderColor(enabled: Boolean, checked: Boolean): Color =
        if (enabled) {
            if (checked) checkedBorderColor else uncheckedBorderColor
        } else {
            if (checked) disabledCheckedBorderColor else disabledUncheckedBorderColor
        }

    /**
     * Represents the content color passed to the icon if used
     *
     * @param enabled whether the [Switch] is enabled or not
     * @param checked whether the [Switch] is checked or not
     */
    @Stable
    internal fun iconColor(enabled: Boolean, checked: Boolean): Color =
        if (enabled) {
            if (checked) checkedIconColor else uncheckedIconColor
        } else {
            if (checked) disabledCheckedIconColor else disabledUncheckedIconColor
        }

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
        if (disabledCheckedThumbColor != other.disabledCheckedThumbColor) return false
        if (disabledCheckedTrackColor != other.disabledCheckedTrackColor) return false
        if (disabledCheckedBorderColor != other.disabledCheckedBorderColor) return false
        if (disabledCheckedIconColor != other.disabledCheckedIconColor) return false
        if (disabledUncheckedThumbColor != other.disabledUncheckedThumbColor) return false
        if (disabledUncheckedTrackColor != other.disabledUncheckedTrackColor) return false
        if (disabledUncheckedBorderColor != other.disabledUncheckedBorderColor) return false
        if (disabledUncheckedIconColor != other.disabledUncheckedIconColor) return false

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
        result = 31 * result + disabledCheckedThumbColor.hashCode()
        result = 31 * result + disabledCheckedTrackColor.hashCode()
        result = 31 * result + disabledCheckedBorderColor.hashCode()
        result = 31 * result + disabledCheckedIconColor.hashCode()
        result = 31 * result + disabledUncheckedThumbColor.hashCode()
        result = 31 * result + disabledUncheckedTrackColor.hashCode()
        result = 31 * result + disabledUncheckedBorderColor.hashCode()
        result = 31 * result + disabledUncheckedIconColor.hashCode()
        return result
    }
}

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
     * Returns a copy of this SwitchColors, optionally overriding some of the values. This uses the
     * Color.Unspecified to mean “use the value from the source”
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