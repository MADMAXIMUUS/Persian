package io.github.madmaximuus.persian.checkboxes

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
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.checkboxes.toggle.BOX_IN_DURATION
import io.github.madmaximuus.persian.checkboxes.toggle.BOX_OUT_DURATION
import io.github.madmaximuus.persian.checkboxes.toggle.CheckboxToggle
import io.github.madmaximuus.persian.checkboxes.toggle.TriStateCheckboxToggle
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.state12
import io.github.madmaximuus.persian.foundation.state38

/**
 * Contains the default values used by [Checkbox].
 */
object CheckboxDefaults {

    /**
     * Creates a [CheckboxToggleColors] that represents the default container and content colors used in a [CheckboxToggle] and a [TriStateCheckboxToggle].
     *
     * @param checkedBorderColor The color of the border when the checkbox is checked.
     * @param uncheckedBorderColor The color of the border when the checkbox is unchecked.
     * @param checkedBoxColor The color of the box when the checkbox is checked.
     * @param uncheckedBoxColor The color of the box when the checkbox is unchecked.
     * @param disabledCheckedBoxColor The color of the box when the checkbox is checked and disabled.
     * @param checkedCheckmarkColor The color of the checkmark when the checkbox is checked.
     * @param uncheckedCheckmarkColor The color of the checkmark when the checkbox is unchecked.
     * @param disabledBorderColor The color of the border when the checkbox is disabled.
     * @param disabledUncheckedColor The color of the box when the checkbox is unchecked and disabled.
     * @param disabledIndeterminateColor The color of the box when the checkbox is in an indeterminate state and disabled.
     */
    @Composable
    fun toggleColors(
        checkedBorderColor: Color = PersianTheme.colorScheme.primary,
        uncheckedBorderColor: Color = PersianTheme.colorScheme.outline,

        checkedBoxColor: Color = PersianTheme.colorScheme.primary,
        uncheckedBoxColor: Color = Color.Transparent,
        disabledCheckedBoxColor: Color = PersianTheme.colorScheme.onSurface.state12,

        checkedCheckmarkColor: Color = PersianTheme.colorScheme.surface,
        uncheckedCheckmarkColor: Color = Color.Transparent,

        disabledBorderColor: Color = PersianTheme.colorScheme.onSurface.state12,
        disabledUncheckedColor: Color = PersianTheme.colorScheme.onSurface.state12,
        disabledIndeterminateColor: Color = disabledBorderColor
    ): CheckboxToggleColors =
        CheckboxToggleColors(
            checkedBorderColor = checkedBorderColor,
            uncheckedBorderColor = uncheckedBorderColor,
            disabledBorderColor = disabledBorderColor,

            checkedBoxColor = checkedBoxColor,
            checkedCheckmarkColor = checkedCheckmarkColor,

            uncheckedCheckmarkColor = uncheckedCheckmarkColor,
            uncheckedBoxColor = uncheckedBoxColor,
            disabledCheckedBoxColor = disabledCheckedBoxColor,
            disabledUncheckedBoxColor = disabledUncheckedColor.copy(alpha = 0f),
            disabledIndeterminateBoxColor = disabledIndeterminateColor,

            disabledIndeterminateBorderColor = disabledIndeterminateColor
        )

    /**
     * Creates a [CheckboxColors] that represents the default container and content colors used in a [Checkbox] and a [TriStateCheckbox].
     *
     * @param toggleColors The [CheckboxToggleColors] instance that defines the colors for the checkbox toggle.
     * @param textColor The color of the text when the checkbox is enabled.
     * @param disabledTextColor The color of the text when the checkbox is disabled.
     */
    @Composable
    fun colors(
        toggleColors: CheckboxToggleColors = toggleColors(),
        textColor: Color = PersianTheme.colorScheme.onSurface,
        disabledTextColor: Color = PersianTheme.colorScheme.onSurface.state38
    ): CheckboxColors =
        CheckboxColors(
            toggleColors = toggleColors,
            textColor = textColor,
            disabledTextColor = disabledTextColor
        )

    /**
     * Creates a [CheckboxSizes] that represents the default container and content sized used in a [Checkbox] and a [TriStateCheckbox].
     *
     * @param toggleSize The size of the checkbox toggle.
     * @param textStyle The style of the text associated with the checkbox.
     * @param shape The shape of checkbox container.
     * @param contentPadding The padding values for the content of the checkbox.
     */
    @Composable
    fun sizes(
        toggleSize: Dp = 24.dp,
        textStyle: TextStyle = PersianTheme.typography.bodyLarge,
        shape: Shape = PersianTheme.shapes.shape16,
        contentPadding: PaddingValues = PaddingValues(
            horizontal = PersianTheme.spacing.size16
        )
    ): CheckboxSizes =
        CheckboxSizes(
            toggleSize = toggleSize,
            textStyle = textStyle,
            shape = shape,
            contentPadding = contentPadding
        )
}

/**
 * Represents the container and content sizes used in a [Checkbox] and a [TriStateCheckbox] in different states.
 *
 * @param toggleSize The size of the checkbox toggle.
 * @param textStyle The style of the text associated with the checkbox.
 * @param contentPadding The padding values for the content of the checkbox.
 */
@Immutable
class CheckboxSizes internal constructor(
    internal val toggleSize: Dp,
    internal val textStyle: TextStyle,
    internal val shape: Shape,
    internal val contentPadding: PaddingValues
)

/**
 * Represents the container and content colors used in a checkbox in different states.
 *
 * @param toggleColors The [CheckboxToggleColors] instance that defines the colors for the checkbox toggle.
 * @param textColor The color of the text when the checkbox is enabled.
 * @param disabledTextColor The color of the text when the checkbox is disabled.
 */
@Immutable
class CheckboxColors internal constructor(
    internal val toggleColors: CheckboxToggleColors,
    private val textColor: Color,
    private val disabledTextColor: Color
) {

    /**
     * Returns the color of the text based on the enabled status of the checkbox.
     *
     * @param enabled Whether the checkbox is enabled.
     */
    @Stable
    internal fun textColor(enabled: Boolean): Color =
        if (enabled) textColor else disabledTextColor
}

/**
 * Represents the container and content colors used in a [CheckboxToggle] and a [TriStateCheckboxToggle] in different states.
 *
 * @param checkedCheckmarkColor The color of the checkmark when the checkbox is checked.
 * @param uncheckedCheckmarkColor The color of the checkmark when the checkbox is unchecked.
 * @param checkedBoxColor The color of the box when the checkbox is checked.
 * @param uncheckedBoxColor The color of the box when the checkbox is unchecked.
 * @param disabledCheckedBoxColor The color of the box when the checkbox is checked and disabled.
 * @param disabledUncheckedBoxColor The color of the box when the checkbox is unchecked and disabled.
 * @param disabledIndeterminateBoxColor The color of the box when the checkbox is in an indeterminate state and disabled.
 * @param checkedBorderColor The color of the border when the checkbox is checked.
 * @param uncheckedBorderColor The color of the border when the checkbox is unchecked.
 * @param disabledBorderColor The color of the border when the checkbox is disabled.
 * @param disabledIndeterminateBorderColor The color of the border when the checkbox is in an indeterminate state and disabled.
 *
 * @constructor create an instance with arbitrary colors.
 * - See [CheckboxDefaults.toggleColors] for the default colors used in a Checkbox toggle.
 */
@Immutable
class CheckboxToggleColors internal constructor(
    private val checkedCheckmarkColor: Color,
    private val uncheckedCheckmarkColor: Color,

    private val checkedBoxColor: Color,
    private val uncheckedBoxColor: Color,
    private val disabledCheckedBoxColor: Color,
    private val disabledUncheckedBoxColor: Color,
    private val disabledIndeterminateBoxColor: Color,

    private val checkedBorderColor: Color,
    private val uncheckedBorderColor: Color,
    private val disabledBorderColor: Color,
    private val disabledIndeterminateBorderColor: Color
) {

    /**
     * Returns the color of the checkmark based on the current state of the checkbox.
     *
     * @param state The current state of the checkbox.
     */
    @Composable
    internal fun checkmarkColor(state: ToggleableState): State<Color> {
        val target = if (state == ToggleableState.Off) {
            uncheckedCheckmarkColor
        } else {
            checkedCheckmarkColor
        }

        val duration = if (state == ToggleableState.Off) BOX_OUT_DURATION else BOX_IN_DURATION
        return animateColorAsState(
            target,
            tween(durationMillis = duration),
            label = "Checkmark color animation"
        )
    }

    /**
     * Returns the color of the box based on the current state and enabled status of the checkbox.
     *
     * @param enabled Whether the checkbox is enabled.
     * @param state The current state of the checkbox.
     */
    @Composable
    internal fun boxColor(enabled: Boolean, state: ToggleableState): State<Color> {
        val target = if (enabled) {
            when (state) {
                ToggleableState.On, ToggleableState.Indeterminate -> checkedBoxColor
                ToggleableState.Off -> uncheckedBoxColor
            }
        } else {
            when (state) {
                ToggleableState.On -> disabledCheckedBoxColor
                ToggleableState.Indeterminate -> disabledIndeterminateBoxColor
                ToggleableState.Off -> disabledUncheckedBoxColor
            }
        }


        return if (enabled) {
            val duration = if (state == ToggleableState.Off) BOX_OUT_DURATION else BOX_IN_DURATION
            animateColorAsState(
                target,
                tween(durationMillis = duration),
                label = "Box color animation"
            )
        } else {
            rememberUpdatedState(target)
        }
    }

    /**
     * Returns the color of the border based on the current state and enabled status of the checkbox.
     *
     * @param enabled Whether the checkbox is enabled.
     * @param state The current state of the checkbox.
     */
    @Composable
    internal fun borderColor(enabled: Boolean, state: ToggleableState): State<Color> {
        val target = if (enabled) {
            when (state) {
                ToggleableState.On, ToggleableState.Indeterminate -> checkedBorderColor
                ToggleableState.Off -> uncheckedBorderColor
            }
        } else {
            when (state) {
                ToggleableState.Indeterminate -> disabledIndeterminateBorderColor
                ToggleableState.On, ToggleableState.Off -> disabledBorderColor
            }
        }

        return if (enabled) {
            val duration = if (state == ToggleableState.Off) BOX_OUT_DURATION else BOX_IN_DURATION
            animateColorAsState(
                target,
                tween(durationMillis = duration),
                label = "Border color animation"
            )
        } else {
            rememberUpdatedState(target)
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is CheckboxToggleColors) return false

        if (checkedCheckmarkColor != other.checkedCheckmarkColor) return false
        if (uncheckedCheckmarkColor != other.uncheckedCheckmarkColor) return false
        if (checkedBoxColor != other.checkedBoxColor) return false
        if (uncheckedBoxColor != other.uncheckedBoxColor) return false
        if (disabledCheckedBoxColor != other.disabledCheckedBoxColor) return false
        if (disabledUncheckedBoxColor != other.disabledUncheckedBoxColor) return false
        if (disabledIndeterminateBoxColor != other.disabledIndeterminateBoxColor) return false
        if (checkedBorderColor != other.checkedBorderColor) return false
        if (uncheckedBorderColor != other.uncheckedBorderColor) return false
        if (disabledBorderColor != other.disabledBorderColor) return false
        return disabledIndeterminateBorderColor == other.disabledIndeterminateBorderColor
    }

    override fun hashCode(): Int {
        var result = checkedCheckmarkColor.hashCode()
        result = 31 * result + uncheckedCheckmarkColor.hashCode()
        result = 31 * result + checkedBoxColor.hashCode()
        result = 31 * result + uncheckedBoxColor.hashCode()
        result = 31 * result + disabledCheckedBoxColor.hashCode()
        result = 31 * result + disabledUncheckedBoxColor.hashCode()
        result = 31 * result + disabledIndeterminateBoxColor.hashCode()
        result = 31 * result + checkedBorderColor.hashCode()
        result = 31 * result + uncheckedBorderColor.hashCode()
        result = 31 * result + disabledBorderColor.hashCode()
        result = 31 * result + disabledIndeterminateBorderColor.hashCode()
        return result
    }
}