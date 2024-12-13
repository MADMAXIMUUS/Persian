package io.github.madmaximuus.persian.slider

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.slider.continuous.Slider

/**
 * Contains all default values used by all type of slider
 */
object SliderDefaults {

    /**
     * Creates a [SliderColors] that represents the different colors used in parts of the [Slider]
     * in different states.
     *
     * For the name references below the words "active" and "inactive" are used. Active part of the
     * slider is filled with progress, so if slider's progress is 30% out of 100%, left (or right in
     * RTL) 30% of the track will be active, while the rest is inactive.
     *
     * @param thumbColor thumb color when enabled
     * @param activeTrackColor color of the track in the part that is "active", meaning that the
     *   thumb is ahead of it
     * @param activeTickColor colors to be used to draw tick marks on the active track, if `steps`
     *   is specified
     * @param inactiveTrackColor color of the track in the part that is "inactive", meaning that the
     *   thumb is before it
     * @param inactiveTickColor colors to be used to draw tick marks on the inactive track, if
     *   `steps` are specified on the Slider is specified
     * @param labelTextColor label text color
     * @param labelContainerColor container color of label
     */
    @Composable
    fun colors(
        thumbColor: Color = PersianTheme.colorScheme.primary,
        activeTrackColor: Color = PersianTheme.colorScheme.primary,
        activeTickColor: Color = PersianTheme.colorScheme.secondaryContainer,
        inactiveTrackColor: Color = PersianTheme.colorScheme.secondaryContainer,
        inactiveTickColor: Color = PersianTheme.colorScheme.primary,
        labelTextColor: Color = PersianTheme.colorScheme.onSurface,
        labelContainerColor: Color = PersianTheme.colorScheme.surfaceContainerHighest,
        contentColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
    ): SliderColors =
        SliderColors(
            thumbColor = thumbColor,
            activeTrackColor = activeTrackColor,
            activeTickColor = activeTickColor,
            inactiveTrackColor = inactiveTrackColor,
            inactiveTickColor = inactiveTickColor,
            labelTextColor = labelTextColor,
            labelContainerColor = labelContainerColor,
            contentColor = contentColor,
        )
}

/**
 * Represents the color used by a [Slider] in different states.
 *
 * @param thumbColor thumb color when enabled
 * @param activeTrackColor color of the track in the part that is "active", meaning that the thumb
 *   is ahead of it
 * @param activeTickColor colors to be used to draw tick marks on the active track, if `steps` is
 *   specified
 * @param inactiveTrackColor color of the track in the part that is "inactive", meaning that the
 *   thumb is before it
 * @param inactiveTickColor colors to be used to draw tick marks on the inactive track, if `steps`
 *   are specified on the Slider is specified
 * @param labelTextColor label text color
 * @param labelContainerColor container color of label
 * @constructor create an instance with arbitrary colors. See [SliderDefaults.colors] for the
 *   default implementation that follows Material specifications.
 */
@Immutable
class SliderColors internal constructor(
    internal val thumbColor: Color,
    private val activeTrackColor: Color,
    private val activeTickColor: Color,
    private val inactiveTrackColor: Color,
    private val inactiveTickColor: Color,
    internal val labelTextColor: Color,
    internal val labelContainerColor: Color,
    internal val contentColor: Color
) {

    /**
     * Returns a copy of this SelectableChipColors, optionally overriding some of the values. This
     * uses the Color.Unspecified to mean “use the value from the source”
     */
    fun copy(
        thumbColor: Color = this.thumbColor,
        activeTrackColor: Color = this.activeTrackColor,
        activeTickColor: Color = this.activeTickColor,
        inactiveTrackColor: Color = this.inactiveTrackColor,
        inactiveTickColor: Color = this.inactiveTickColor,
        labelTextColor: Color = this.inactiveTickColor,
        labelContainerColor: Color = this.inactiveTickColor,
        contentColor: Color = this.contentColor,
    ): SliderColors =
        SliderColors(
            thumbColor = thumbColor,
            activeTrackColor = activeTrackColor,
            activeTickColor = activeTickColor,
            inactiveTrackColor = inactiveTrackColor,
            inactiveTickColor = inactiveTickColor,
            labelTextColor = labelTextColor,
            labelContainerColor = labelContainerColor,
            contentColor = contentColor
        )

    /**
     * Returns the color of the track based on its enabled and active states.
     *
     * @param active The activity state of the track.
     */
    @Stable
    internal fun trackColor(active: Boolean): Color =
        if (active) activeTrackColor else inactiveTrackColor

    /**
     * Returns the color of the tick based on its enabled and active states.
     *
     * @param active The activity state of the tick.
     */
    @Stable
    internal fun tickColor(active: Boolean): Color =
        if (active) activeTickColor else inactiveTickColor

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is SliderColors) return false

        if (thumbColor != other.thumbColor) return false
        if (activeTrackColor != other.activeTrackColor) return false
        if (activeTickColor != other.activeTickColor) return false
        if (inactiveTrackColor != other.inactiveTrackColor) return false
        if (inactiveTickColor != other.inactiveTickColor) return false
        if (labelTextColor != other.labelTextColor) return false
        if (labelContainerColor != other.labelContainerColor) return false
        if (contentColor != other.contentColor) return false

        return true
    }

    override fun hashCode(): Int {
        var result = thumbColor.hashCode()
        result = 31 * result + activeTrackColor.hashCode()
        result = 31 * result + activeTickColor.hashCode()
        result = 31 * result + inactiveTrackColor.hashCode()
        result = 31 * result + inactiveTickColor.hashCode()
        result = 31 * result + labelTextColor.hashCode()
        result = 31 * result + labelContainerColor.hashCode()
        result = 31 * result + contentColor.hashCode()
        return result
    }
}