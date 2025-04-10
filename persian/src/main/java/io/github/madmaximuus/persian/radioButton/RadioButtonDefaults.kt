package io.github.madmaximuus.persian.radioButton

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.State
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.radioButton.RadioButtonDefaults.toggleColors

/**
 * Contains all default values used by [RadioButton]
 */
object RadioButtonDefaults {

    /**
     * Creates a [RadioButtonToggleColors] object with the specified colors.
     *
     * @param selectedColor The color to be used for the selected state of the radio button toggle.
     * @param unselectedColor The color to be used for the unselected state of the radio button toggle.
     */
    @Composable
    fun toggleColors(
        selectedColor: Color = PersianTheme.colorScheme.primary,
        unselectedColor: Color = PersianTheme.colorScheme.outline,
    ) = RadioButtonToggleColors(
        selectedColor = selectedColor,
        unselectedColor = unselectedColor,
    )

    /**
     * Creates a [RadioButtonColors] object with the specified colors.
     *
     * @param toggleColor The colors to be used for the radio button toggle. Default is the result of [toggleColors].
     * @param textColor The color to be used for the radio button's text label when it is enabled.
     */
    @Composable
    fun colors(
        toggleColor: RadioButtonToggleColors = toggleColors(),
        textColor: Color = PersianTheme.colorScheme.onSurface,
    ) = RadioButtonColors(
        toggleColor = toggleColor,
        textColor = textColor,
    )

    /**
     * Creates a [RadioButtonSizes] object with the specified sizes and styles.
     *
     * @param toggleSize The size of the radio button toggle. Default is 24.dp.
     * @param textStyle The text style to be applied to the radio button's text label.
     * @param shape The shape of radio button row.
     * @param contentPadding The padding values to be applied around the content of the radio button.
     */
    @Composable
    fun sizes(
        toggleSize: Dp = 24.dp,
        textStyle: TextStyle = PersianTheme.typography.labelLarge,
        shape: Shape = PersianTheme.shapes.shape16,
        contentPadding: PaddingValues = PaddingValues(
            horizontal = PersianTheme.spacing.size16
        )
    ) = RadioButtonSizes(
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
 * @constructor create an instance with arbitrary colors. See [RadioButtonDefaults.colors] for the
 *   default implementation that follows Material specifications.
 */
@Immutable
class RadioButtonToggleColors(
    internal val selectedColor: Color,
    internal val unselectedColor: Color,
) {
    /**
     * Returns a copy of this SelectableChipColors, optionally overriding some of the values. This
     * uses the Color.Unspecified to mean “use the value from the source”
     */
    fun copy(
        selectedColor: Color = this.selectedColor,
        unselectedColor: Color = this.unselectedColor,
    ) = RadioButtonToggleColors(
        selectedColor = selectedColor,
        unselectedColor = unselectedColor
    )

    /**
     * Represents the main color used to draw the outer and inner circles, depending on whether the
     * [RadioButton] is [selected].
     *
     * @param selected whether the [RadioButton] is selected
     */
    @Composable
    internal fun radioColor(selected: Boolean): State<Color> {
        val target = if (selected) selectedColor else unselectedColor

        // If not enabled 'snap' to the disabled state, as there should be no animations between
        // enabled / disabled.
        return animateColorAsState(
            targetValue = target,
            animationSpec = tween(durationMillis = RadioAnimationDuration),
            label = "Radio toggle animation"
        )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is RadioButtonToggleColors) return false

        if (selectedColor != other.selectedColor) return false
        return unselectedColor != other.unselectedColor
    }

    override fun hashCode(): Int {
        var result = selectedColor.hashCode()
        result = 31 * result + unselectedColor.hashCode()
        return result
    }
}

/**
 * An immutable class that defines the colors for a radio button.
 *
 * @property toggleColor The colors to be used for the radio button toggle.
 * @property textColor The color to be used for the radio button's text label when it is enabled.
 */
@Immutable
class RadioButtonColors internal constructor(
    internal val toggleColor: RadioButtonToggleColors,
    internal val textColor: Color,
) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is RadioButtonColors) return false

        if (toggleColor != other.toggleColor) return false
        return textColor != other.textColor
    }

    override fun hashCode(): Int {
        var result = toggleColor.hashCode()
        result = 31 * result + textColor.hashCode()
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