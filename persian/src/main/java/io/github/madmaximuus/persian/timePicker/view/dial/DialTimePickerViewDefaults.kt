package io.github.madmaximuus.persian.timePicker.view.dial

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.takeOrElse
import androidx.compose.ui.text.TextStyle
import io.github.madmaximuus.persian.foundation.PersianTheme

object DialTimePickerViewDefaults {

    @Composable
    fun colors(
        clockDialColor: Color = PersianTheme.colorScheme.surfaceContainerHighest,
        selectorColor: Color = PersianTheme.colorScheme.primary,
        containerColor: Color = PersianTheme.colorScheme.surfaceContainerHigh,
        periodSelectorBorderColor: Color = PersianTheme.colorScheme.outline,
        clockDialSelectedContentColor: Color = PersianTheme.colorScheme.onPrimary,
        clockDialUnselectedContentColor: Color = PersianTheme.colorScheme.onSurface,
        periodSelectorSelectedContainerColor: Color = PersianTheme.colorScheme.tertiaryContainer,
        periodSelectorUnselectedContainerColor: Color = Color.Transparent,
        periodSelectorSelectedContentColor: Color = PersianTheme.colorScheme.onTertiaryContainer,
        periodSelectorUnselectedContentColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        timeSelectorSelectedContainerColor: Color = PersianTheme.colorScheme.primaryContainer,
        timeSelectorUnselectedContainerColor: Color = PersianTheme.colorScheme.surfaceContainerHighest,
        timeSelectorSelectedContentColor: Color = PersianTheme.colorScheme.onPrimaryContainer,
        timeSelectorUnselectedContentColor: Color = PersianTheme.colorScheme.onSurface,
    ): DialTimePickerViewColors = DialTimePickerViewColors(
        clockDialColor = clockDialColor,
        selectorColor = selectorColor,
        containerColor = containerColor,
        periodSelectorBorderColor = periodSelectorBorderColor,
        clockDialSelectedContentColor = clockDialSelectedContentColor,
        clockDialUnselectedContentColor = clockDialUnselectedContentColor,
        periodSelectorSelectedContainerColor = periodSelectorSelectedContainerColor,
        periodSelectorUnselectedContainerColor = periodSelectorUnselectedContainerColor,
        periodSelectorSelectedContentColor = periodSelectorSelectedContentColor,
        periodSelectorUnselectedContentColor = periodSelectorUnselectedContentColor,
        timeSelectorSelectedContainerColor = timeSelectorSelectedContainerColor,
        timeSelectorUnselectedContainerColor = timeSelectorUnselectedContainerColor,
        timeSelectorSelectedContentColor = timeSelectorSelectedContentColor,
        timeSelectorUnselectedContentColor = timeSelectorUnselectedContentColor
    )

    @Composable
    fun sizes(
        clockDisplayShape: Shape = PersianTheme.shapes.shape12,
        clockDisplayTextStyle: TextStyle = PersianTheme.typography.displayLarge,
        periodSelectorShape: Shape = PersianTheme.shapes.shape12,
        periodSelectorTextStyle: TextStyle = PersianTheme.typography.bodyLarge,
        clockDialNumberTextStyle: TextStyle = PersianTheme.typography.bodyLarge,
    ): DialTimePickerViewSizes = DialTimePickerViewSizes(
        clockDisplayShape = clockDisplayShape,
        clockDisplayTextStyle = clockDisplayTextStyle,
        periodSelectorShape = periodSelectorShape,
        periodSelectorTextStyle = periodSelectorTextStyle,
        clockDialNumberTextStyle = clockDialNumberTextStyle
    )
}


/**
 * Represents the colors used by a [TimePicker] in different states
 *
 * @param clockDialColor The color of the clock dial.
 * @param clockDialSelectedContentColor the color of the numbers of the clock dial when they are
 *   selected or overlapping with the selector
 * @param clockDialUnselectedContentColor the color of the numbers of the clock dial when they are
 *   unselected
 * @param selectorColor The color of the clock dial selector.
 * @param containerColor The container color of the time picker.
 * @param periodSelectorBorderColor the color used for the border of the AM/PM toggle.
 * @param periodSelectorSelectedContainerColor the color used for the selected container of the
 *   AM/PM toggle
 * @param periodSelectorUnselectedContainerColor the color used for the unselected container of the
 *   AM/PM toggle
 * @param periodSelectorSelectedContentColor color used for the selected content of the AM/PM toggle
 * @param periodSelectorUnselectedContentColor color used for the unselected content of the AM/PM
 *   toggle
 * @param timeSelectorSelectedContainerColor color used for the selected container of the display
 *   buttons to switch between hour and minutes
 * @param timeSelectorUnselectedContainerColor color used for the unselected container of the
 *   display buttons to switch between hour and minutes
 * @param timeSelectorSelectedContentColor color used for the selected content of the display
 *   buttons to switch between hour and minutes
 * @param timeSelectorUnselectedContentColor color used for the unselected content of the display
 *   buttons to switch between hour and minutes
 * @constructor create an instance with arbitrary colors. See [TimePickerDefaults.colors] for the
 *   default implementation that follows Material specifications.
 */
@Immutable
class DialTimePickerViewColors internal constructor(
    internal val clockDialColor: Color,
    internal val selectorColor: Color,
    internal val containerColor: Color,
    internal val periodSelectorBorderColor: Color,
    private val clockDialSelectedContentColor: Color,
    private val clockDialUnselectedContentColor: Color,
    private val periodSelectorSelectedContainerColor: Color,
    private val periodSelectorUnselectedContainerColor: Color,
    private val periodSelectorSelectedContentColor: Color,
    private val periodSelectorUnselectedContentColor: Color,
    private val timeSelectorSelectedContainerColor: Color,
    private val timeSelectorUnselectedContainerColor: Color,
    private val timeSelectorSelectedContentColor: Color,
    private val timeSelectorUnselectedContentColor: Color,
) {
    /**
     * Returns a copy of this DialTimePickerViewColors, optionally overriding some of the values. This uses
     * the Color.Unspecified to mean “use the value from the source”
     */
    fun copy(
        clockDialColor: Color = this.containerColor,
        selectorColor: Color = this.selectorColor,
        containerColor: Color = this.containerColor,
        periodSelectorBorderColor: Color = this.periodSelectorBorderColor,
        clockDialSelectedContentColor: Color = this.clockDialSelectedContentColor,
        clockDialUnselectedContentColor: Color = this.clockDialUnselectedContentColor,
        periodSelectorSelectedContainerColor: Color = this.periodSelectorSelectedContainerColor,
        periodSelectorUnselectedContainerColor: Color = this.periodSelectorUnselectedContainerColor,
        periodSelectorSelectedContentColor: Color = this.periodSelectorSelectedContentColor,
        periodSelectorUnselectedContentColor: Color = this.periodSelectorUnselectedContentColor,
        timeSelectorSelectedContainerColor: Color = this.timeSelectorSelectedContainerColor,
        timeSelectorUnselectedContainerColor: Color = this.timeSelectorUnselectedContainerColor,
        timeSelectorSelectedContentColor: Color = this.timeSelectorSelectedContentColor,
        timeSelectorUnselectedContentColor: Color = this.timeSelectorUnselectedContentColor,
    ) =
        DialTimePickerViewColors(
            clockDialColor.takeOrElse { this.clockDialColor },
            selectorColor.takeOrElse { this.selectorColor },
            containerColor.takeOrElse { this.containerColor },
            periodSelectorBorderColor.takeOrElse { this.periodSelectorBorderColor },
            clockDialSelectedContentColor.takeOrElse { this.clockDialSelectedContentColor },
            clockDialUnselectedContentColor.takeOrElse { this.clockDialUnselectedContentColor },
            periodSelectorSelectedContainerColor.takeOrElse {
                this.periodSelectorSelectedContainerColor
            },
            periodSelectorUnselectedContainerColor.takeOrElse {
                this.periodSelectorUnselectedContainerColor
            },
            periodSelectorSelectedContentColor.takeOrElse {
                this.periodSelectorSelectedContentColor
            },
            periodSelectorUnselectedContentColor.takeOrElse {
                this.periodSelectorUnselectedContentColor
            },
            timeSelectorSelectedContainerColor.takeOrElse {
                this.timeSelectorSelectedContainerColor
            },
            timeSelectorUnselectedContainerColor.takeOrElse {
                this.timeSelectorUnselectedContainerColor
            },
            timeSelectorSelectedContentColor.takeOrElse { this.timeSelectorSelectedContentColor },
            timeSelectorUnselectedContentColor.takeOrElse {
                this.timeSelectorUnselectedContentColor
            },
        )

    @Stable
    internal fun periodSelectorContainerColor(selected: Boolean) =
        if (selected) {
            periodSelectorSelectedContainerColor
        } else {
            periodSelectorUnselectedContainerColor
        }

    @Stable
    internal fun periodSelectorContentColor(selected: Boolean) =
        if (selected) {
            periodSelectorSelectedContentColor
        } else {
            periodSelectorUnselectedContentColor
        }

    @Stable
    internal fun timeSelectorContainerColor(selected: Boolean) =
        if (selected) {
            timeSelectorSelectedContainerColor
        } else {
            timeSelectorUnselectedContainerColor
        }

    @Stable
    internal fun timeSelectorContentColor(selected: Boolean) =
        if (selected) {
            timeSelectorSelectedContentColor
        } else {
            timeSelectorUnselectedContentColor
        }

    @Stable
    internal fun clockDialContentColor(selected: Boolean) =
        if (selected) {
            clockDialSelectedContentColor
        } else {
            clockDialUnselectedContentColor
        }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other === null) return false
        if (this::class != other::class) return false

        other as DialTimePickerViewColors

        if (clockDialColor != other.clockDialColor) return false
        if (selectorColor != other.selectorColor) return false
        if (containerColor != other.containerColor) return false
        if (periodSelectorBorderColor != other.periodSelectorBorderColor) return false
        if (periodSelectorSelectedContainerColor != other.periodSelectorSelectedContainerColor)
            return false
        if (periodSelectorUnselectedContainerColor != other.periodSelectorUnselectedContainerColor)
            return false
        if (periodSelectorSelectedContentColor != other.periodSelectorSelectedContentColor)
            return false
        if (periodSelectorUnselectedContentColor != other.periodSelectorUnselectedContentColor)
            return false
        if (timeSelectorSelectedContainerColor != other.timeSelectorSelectedContainerColor)
            return false
        if (timeSelectorUnselectedContainerColor != other.timeSelectorUnselectedContainerColor)
            return false
        if (timeSelectorSelectedContentColor != other.timeSelectorSelectedContentColor) return false
        if (timeSelectorUnselectedContentColor != other.timeSelectorUnselectedContentColor)
            return false

        return true
    }

    override fun hashCode(): Int {
        var result = clockDialColor.hashCode()
        result = 31 * result + selectorColor.hashCode()
        result = 31 * result + containerColor.hashCode()
        result = 31 * result + periodSelectorBorderColor.hashCode()
        result = 31 * result + periodSelectorSelectedContainerColor.hashCode()
        result = 31 * result + periodSelectorUnselectedContainerColor.hashCode()
        result = 31 * result + periodSelectorSelectedContentColor.hashCode()
        result = 31 * result + periodSelectorUnselectedContentColor.hashCode()
        result = 31 * result + timeSelectorSelectedContainerColor.hashCode()
        result = 31 * result + timeSelectorUnselectedContainerColor.hashCode()
        result = 31 * result + timeSelectorSelectedContentColor.hashCode()
        result = 31 * result + timeSelectorUnselectedContentColor.hashCode()
        return result
    }
}

@Immutable
class DialTimePickerViewSizes(
    internal val clockDisplayShape: Shape,
    internal val clockDisplayTextStyle: TextStyle,
    internal val periodSelectorShape: Shape,
    internal val periodSelectorTextStyle: TextStyle,
    internal val clockDialNumberTextStyle: TextStyle,
) {
    /**
     * Returns a copy of this DialTimePickerViewSizes, optionally overriding some of the values. This uses
     * the Color.Unspecified to mean “use the value from the source”
     */
    fun copy(
        clockDisplayShape: Shape = this.clockDisplayShape,
        clockDisplayTextStyle: TextStyle = this.clockDisplayTextStyle,
        periodSelectorShape: Shape = this.periodSelectorShape,
        periodSelectorTextStyle: TextStyle = this.periodSelectorTextStyle,
        clockDialNumberTextStyle: TextStyle = this.clockDialNumberTextStyle,
    ): DialTimePickerViewSizes =
        DialTimePickerViewSizes(
            clockDisplayShape,
            clockDisplayTextStyle,
            periodSelectorShape,
            periodSelectorTextStyle,
            clockDialNumberTextStyle
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other === null) return false
        if (this::class != other::class) return false

        other as DialTimePickerViewSizes

        if (clockDisplayShape != other.clockDisplayShape) return false
        if (clockDisplayTextStyle != other.clockDisplayTextStyle) return false
        if (periodSelectorShape != other.periodSelectorShape) return false
        if (periodSelectorTextStyle != other.periodSelectorTextStyle) return false
        if (clockDialNumberTextStyle != other.clockDialNumberTextStyle) return false

        return true
    }

    override fun hashCode(): Int {
        var result = clockDisplayShape.hashCode()
        result = 31 * result + clockDisplayTextStyle.hashCode()
        result = 31 * result + periodSelectorShape.hashCode()
        result = 31 * result + periodSelectorTextStyle.hashCode()
        result = 31 * result + clockDialNumberTextStyle.hashCode()
        return result
    }
}