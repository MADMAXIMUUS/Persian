package io.github.madmaximuus.persian.radioButton

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.takeOrElse
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.state12
import io.github.madmaximuus.persian.foundation.state38

/**
 * Contains all default values used by [RadioButton]
 */
object RadioButtonDefaults {

    /**
     * Creates a [RadioButtonToggleColors] object with the specified colors.
     *
     * @param selectedColor The color to be used for the selected state of the radio button toggle.
     * @param unselectedColor The color to be used for the unselected state of the radio button toggle.
     * @param disabledSelectedColor The color to be used for the selected state of the radio button toggle
     * when it is disabled.
     * @param disabledUnselectedColor The color to be used for the unselected state of the radio button toggle
     * when it is disabled.
     */
    @Composable
    fun toggleColors(
        selectedColor: Color = PersianTheme.colorScheme.primary,
        unselectedColor: Color = PersianTheme.colorScheme.outline,
        disabledSelectedColor: Color = PersianTheme.colorScheme.onSurface.state12,
        disabledUnselectedColor: Color = PersianTheme.colorScheme.onSurface.state12
    ): RadioButtonToggleColors =
        RadioButtonToggleColors(
            selectedColor = selectedColor,
            unselectedColor = unselectedColor,
            disabledSelectedColor = disabledSelectedColor,
            disabledUnselectedColor = disabledUnselectedColor,
        )

    /**
     * Creates a [RadioButtonColors] object with the specified colors.
     *
     * @param toggleColor The colors to be used for the radio button toggle. Default is the result of [toggleColors].
     * @param textColor The color to be used for the radio button's text label when it is enabled.
     * @param disabledTextColor The color to be used for the radio button's text label when it is disabled.
     */
    @Composable
    fun colors(
        toggleColor: RadioButtonToggleColors = toggleColors(),
        textColor: Color = PersianTheme.colorScheme.onSurface,
        disabledTextColor: Color = PersianTheme.colorScheme.onSurface.state38
    ): RadioButtonColors =
        RadioButtonColors(
            toggleColor = toggleColor,
            textColor = textColor,
            disabledTextColor = disabledTextColor
        )

    /**
     * Creates a [RadioButtonSizes] object with the specified sizes and styles.
     *
     * @param toggleSize The size of the radio button toggle. Default is 24.dp.
     * @param textStyle The text style to be applied to the radio button's text label.
     * @param contentPadding The padding values to be applied around the content of the radio button.
     */
    @Composable
    fun sizes(
        toggleSize: Dp = 24.dp,
        textStyle: TextStyle = PersianTheme.typography.bodyLarge,
        shape: Shape = PersianTheme.shapes.shape16,
        contentPadding: PaddingValues = PaddingValues(
            horizontal = PersianTheme.spacing.size16
        )
    ): RadioButtonSizes =
        RadioButtonSizes(
            toggleSize = toggleSize,
            textStyle = textStyle,
            shape = shape,
            contentPadding = contentPadding
        )
}

/**
 * Represents the color used by a [RadioButton] in different states.
 *
 * @param selectedColor the color to use for the RadioButton when selected and enabled.
 * @param unselectedColor the color to use for the RadioButton when unselected and enabled.
 * @param disabledSelectedColor the color to use for the RadioButton when disabled and selected.
 * @param disabledUnselectedColor the color to use for the RadioButton when disabled and not
 *   selected.
 * @constructor create an instance with arbitrary colors. See [RadioButtonDefaults.colors] for the
 *   default implementation that follows Material specifications.
 */
@Immutable
class RadioButtonToggleColors(
    internal val selectedColor: Color,
    internal val unselectedColor: Color,
    internal val disabledSelectedColor: Color,
    internal val disabledUnselectedColor: Color
) {
    /**
     * Returns a copy of this SelectableChipColors, optionally overriding some of the values. This
     * uses the Color.Unspecified to mean “use the value from the source”
     */
    fun copy(
        selectedColor: Color = this.selectedColor,
        unselectedColor: Color = this.unselectedColor,
        disabledSelectedColor: Color = this.disabledSelectedColor,
        disabledUnselectedColor: Color = this.disabledUnselectedColor,
    ) =
        RadioButtonToggleColors(
            selectedColor.takeOrElse { this.selectedColor },
            unselectedColor.takeOrElse { this.unselectedColor },
            disabledSelectedColor.takeOrElse { this.disabledSelectedColor },
            disabledUnselectedColor.takeOrElse { this.disabledUnselectedColor },
        )

    /**
     * Represents the main color used to draw the outer and inner circles, depending on whether the
     * [RadioButton] is [enabled] / [selected].
     *
     * @param enabled whether the [RadioButton] is enabled
     * @param selected whether the [RadioButton] is selected
     */
    @Composable
    internal fun radioColor(enabled: Boolean, selected: Boolean): State<Color> {
        val target =
            when {
                enabled && selected -> selectedColor
                enabled && !selected -> unselectedColor
                !enabled && selected -> disabledSelectedColor
                else -> disabledUnselectedColor
            }

        // If not enabled 'snap' to the disabled state, as there should be no animations between
        // enabled / disabled.
        return if (enabled) {
            animateColorAsState(
                target,
                tween(durationMillis = RadioAnimationDuration),
                label = ""
            )
        } else {
            rememberUpdatedState(target)
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is RadioButtonToggleColors) return false

        if (selectedColor != other.selectedColor) return false
        if (unselectedColor != other.unselectedColor) return false
        if (disabledSelectedColor != other.disabledSelectedColor) return false
        return disabledUnselectedColor != other.disabledUnselectedColor
    }

    override fun hashCode(): Int {
        var result = selectedColor.hashCode()
        result = 31 * result + unselectedColor.hashCode()
        result = 31 * result + disabledSelectedColor.hashCode()
        result = 31 * result + disabledUnselectedColor.hashCode()
        return result
    }
}

/**
 * An immutable class that defines the colors for a radio button.
 *
 * @property toggleColor The colors to be used for the radio button toggle.
 * @property textColor The color to be used for the radio button's text label when it is enabled.
 * @property disabledTextColor The color to be used for the radio button's text label when it is disabled.
 */
@Immutable
class RadioButtonColors internal constructor(
    internal val toggleColor: RadioButtonToggleColors,
    private val textColor: Color,
    private val disabledTextColor: Color
) {
    /**
     * Returns the color for the radio button's text label based on its enabled state.
     *
     * @param enabled Whether the radio button is enabled.
     */
    @Stable
    internal fun textColor(enabled: Boolean): Color =
        if (enabled) textColor else disabledTextColor

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is RadioButtonColors) return false

        if (toggleColor != other.toggleColor) return false
        if (textColor != other.textColor) return false
        return disabledTextColor != other.disabledTextColor
    }

    override fun hashCode(): Int {
        var result = toggleColor.hashCode()
        result = 31 * result + textColor.hashCode()
        result = 31 * result + disabledTextColor.hashCode()
        return result
    }
}

/**
 * An immutable data class that defines the sizes and styles for a radio button.
 *
 * @property toggleSize The size of the radio button toggle.
 * @property textStyle The text style to be applied to the radio button's text label.
 * @property shape The shape of radio button container.
 * @property contentPadding The padding values to be applied around the content of the radio button.
 */
@Immutable
class RadioButtonSizes internal constructor(
    internal val toggleSize: Dp,
    internal val textStyle: TextStyle,
    internal val shape: Shape,
    internal val contentPadding: PaddingValues
)

private const val RadioAnimationDuration = 150