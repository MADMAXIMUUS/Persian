package io.github.madmaximuus.persian.radioButton

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.State
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.takeOrElse
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.state12
import io.github.madmaximuus.persian.foundation.state38

object RadioButtonDefaults {

    @Composable
    fun toggleColors(
        selectedColor: Color = PersianTheme.colorScheme.primary,
        unselectedColor: Color = PersianTheme.colorScheme.outline,
        disabledSelectedColor: Color = PersianTheme.colorScheme.onSurface.state12,
        disabledUnselectedColor: Color = PersianTheme.colorScheme.onSurface.state12
    ) = RadioButtonToggleColors(
        selectedColor = selectedColor,
        unselectedColor = unselectedColor,
        disabledSelectedColor = disabledSelectedColor,
        disabledUnselectedColor = disabledUnselectedColor,
    )

    @Composable
    fun colors(
        toggleColor: RadioButtonToggleColors = toggleColors(),
        textColor: Color = PersianTheme.colorScheme.onSurface,
        disabledTextColor: Color = PersianTheme.colorScheme.onSurface.state38
    ) = RadioButtonColors(
        toggleColor = toggleColor,
        textColor = textColor,
        disabledTextColor = disabledTextColor
    )

    @Composable
    fun sizes(
        toggleSize: Dp = 24.dp,
        textStyle: TextStyle = PersianTheme.typography.bodyLarge,
        contentPadding: PaddingValues = PaddingValues(
            horizontal = PersianTheme.spacing.size12
        )
    ): RadioButtonSizes = RadioButtonSizes(
        toggleSize = toggleSize,
        textStyle = textStyle,
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

@Immutable
class RadioButtonColors(
    internal val toggleColor: RadioButtonToggleColors,
    private val textColor: Color,
    private val disabledTextColor: Color
) {
    fun textColor(enabled: Boolean): Color =
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

@Immutable
data class RadioButtonSizes(
    internal val toggleSize: Dp,
    internal val textStyle: TextStyle,
    internal val contentPadding: PaddingValues
)

private const val RadioAnimationDuration = 150