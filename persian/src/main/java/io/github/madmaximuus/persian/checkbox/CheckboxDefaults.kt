package io.github.madmaximuus.persian.checkbox

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.State
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.checkbox.toggle.BOX_IN_DURATION
import io.github.madmaximuus.persian.checkbox.toggle.BOX_OUT_DURATION
import io.github.madmaximuus.persian.checkbox.toggle.CheckboxToggle
import io.github.madmaximuus.persian.checkbox.toggle.TriStateCheckboxToggle
import io.github.madmaximuus.persian.foundation.PersianTheme

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
     * @param checkedCheckmarkColor The color of the checkmark when the checkbox is checked.
     * @param uncheckedCheckmarkColor The color of the checkmark when the checkbox is unchecked.
     */
    @Composable
    fun toggleColors(
        checkedBorderColor: Color = PersianTheme.colorScheme.primary,
        uncheckedBorderColor: Color = PersianTheme.colorScheme.outline,

        checkedBoxColor: Color = PersianTheme.colorScheme.primary,
        uncheckedBoxColor: Color = Color.Transparent,

        checkedCheckmarkColor: Color = PersianTheme.colorScheme.surface,
        uncheckedCheckmarkColor: Color = Color.Transparent,
    ) = CheckboxToggleColors(
        checkedBorderColor = checkedBorderColor,
        uncheckedBorderColor = uncheckedBorderColor,

        checkedBoxColor = checkedBoxColor,
        checkedCheckmarkColor = checkedCheckmarkColor,

        uncheckedCheckmarkColor = uncheckedCheckmarkColor,
        uncheckedBoxColor = uncheckedBoxColor,
    )

    /**
     * Creates a [CheckboxColors] that represents the default container and content colors used in a [Checkbox] and a [TriStateCheckbox].
     *
     * @param toggleColors The [CheckboxToggleColors] instance that defines the colors for the checkbox toggle.
     * @param textColor The color of the text when the checkbox is enabled.
     */
    @Composable
    fun colors(
        toggleColors: CheckboxToggleColors = toggleColors(),
        textColor: Color = PersianTheme.colorScheme.onSurface,
    ) = CheckboxColors(
        toggleColors = toggleColors,
        textColor = textColor
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
        textStyle: TextStyle = PersianTheme.typography.labelLarge,
        shape: Shape = PersianTheme.shapes.shape16,
        contentPadding: PaddingValues = PaddingValues(
            horizontal = PersianTheme.spacing.size16
        )
    ) = CheckboxSizes(
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
 */
@Immutable
class CheckboxColors internal constructor(
    internal val toggleColors: CheckboxToggleColors,
    internal val textColor: Color
)

/**
 * Represents the container and content colors used in a [CheckboxToggle] and a [TriStateCheckboxToggle] in different states.
 *
 * @param checkedCheckmarkColor The color of the checkmark when the checkbox is checked.
 * @param uncheckedCheckmarkColor The color of the checkmark when the checkbox is unchecked.
 * @param checkedBoxColor The color of the box when the checkbox is checked.
 * @param uncheckedBoxColor The color of the box when the checkbox is unchecked.
 * @param checkedBorderColor The color of the border when the checkbox is checked.
 * @param uncheckedBorderColor The color of the border when the checkbox is unchecked.
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

    private val checkedBorderColor: Color,
    private val uncheckedBorderColor: Color,
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
        val target = when (state) {
            ToggleableState.On, ToggleableState.Indeterminate -> checkedBoxColor
            ToggleableState.Off -> uncheckedBoxColor
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
        val target = when (state) {
            ToggleableState.On, ToggleableState.Indeterminate -> checkedBorderColor
            ToggleableState.Off -> uncheckedBorderColor
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
        if (checkedBorderColor != other.checkedBorderColor) return false
        return uncheckedBorderColor == other.uncheckedBorderColor
    }

    override fun hashCode(): Int {
        var result = checkedCheckmarkColor.hashCode()
        result = 31 * result + uncheckedCheckmarkColor.hashCode()
        result = 31 * result + checkedBoxColor.hashCode()
        result = 31 * result + uncheckedBoxColor.hashCode()
        result = 31 * result + checkedBorderColor.hashCode()
        result = 31 * result + uncheckedBorderColor.hashCode()
        return result
    }
}