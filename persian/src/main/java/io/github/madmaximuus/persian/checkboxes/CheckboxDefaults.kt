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
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.checkboxes.toggle.BOX_IN_DURATION
import io.github.madmaximuus.persian.checkboxes.toggle.BOX_OUT_DURATION
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.state12
import io.github.madmaximuus.persian.foundation.state38

object CheckboxDefaults {

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
    ): CheckboxToggleColors = CheckboxToggleColors(
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

    @Composable
    fun colors(
        toggleColors: CheckboxToggleColors = toggleColors(),
        textColor: Color = PersianTheme.colorScheme.onSurface,
        disabledTextColor: Color = PersianTheme.colorScheme.onSurface.state38
    ): CheckboxColors = CheckboxColors(
        toggleColors = toggleColors,
        textColor = textColor,
        disabledTextColor = disabledTextColor
    )

    @Composable
    fun sizes(
        toggleSize: Dp = 48.dp,
        textStyle: TextStyle = PersianTheme.typography.bodyLarge,
        contentPadding: PaddingValues = PaddingValues(
            end = PersianTheme.spacing.size12
        )
    ) = CheckboxSizes(
        toggleSize = toggleSize,
        textStyle = textStyle,
        contentPadding = contentPadding
    )
}

@Immutable
data class CheckboxSizes(
    val toggleSize: Dp,
    val textStyle: TextStyle,
    val contentPadding: PaddingValues
)

@Immutable
class CheckboxColors internal constructor(
    internal val toggleColors: CheckboxToggleColors,
    private val textColor: Color,
    private val disabledTextColor: Color
) {

    @Stable
    internal fun textColor(enabled: Boolean): Color =
        if (enabled) textColor else disabledTextColor
}

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
    private val disabledIndeterminateBorderColor: Color,

    ) {

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