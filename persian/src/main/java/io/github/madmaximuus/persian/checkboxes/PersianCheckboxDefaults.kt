package io.github.madmaximuus.persian.checkboxes

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.MaterialTheme
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
import io.github.madmaximuus.persian.foundation.PersianContentStateDisabled
import io.github.madmaximuus.persian.foundation.PersianStatesDisabled
import io.github.madmaximuus.persian.foundation.extendedColorScheme
import io.github.madmaximuus.persian.foundation.spacing

object PersianCheckboxDefaults {

    @Composable
    fun colors(
        checkedColor: Color = MaterialTheme.extendedColorScheme.primary,
        uncheckedColor: Color = MaterialTheme.extendedColorScheme.outline,
        checkmarkColor: Color = MaterialTheme.extendedColorScheme.surface,
        disabledCheckedColor: Color = MaterialTheme.extendedColorScheme.onSurface
            .copy(PersianStatesDisabled),
        disabledUncheckedColor: Color = MaterialTheme.extendedColorScheme.onSurface
            .copy(PersianStatesDisabled),
        disabledIndeterminateColor: Color = disabledCheckedColor,
        textColor: Color = MaterialTheme.extendedColorScheme.onSurface,
        disabledTextColor: Color = MaterialTheme.extendedColorScheme.onSurface
            .copy(PersianContentStateDisabled)
    ): CheckboxColors = CheckboxColors(
        checkedBorderColor = checkedColor,
        checkedBoxColor = checkedColor,
        checkedCheckmarkColor = checkmarkColor,
        uncheckedCheckmarkColor = checkmarkColor.copy(alpha = 0f),
        uncheckedBoxColor = checkedColor.copy(alpha = 0f),
        disabledCheckedBoxColor = disabledCheckedColor,
        disabledUncheckedBoxColor = disabledUncheckedColor.copy(alpha = 0f),
        disabledIndeterminateBoxColor = disabledIndeterminateColor,
        uncheckedBorderColor = uncheckedColor,
        disabledBorderColor = disabledCheckedColor,
        disabledIndeterminateBorderColor = disabledIndeterminateColor,
        textColor = textColor,
        disabledTextColor = disabledTextColor
    )

    @Composable
    fun sizes(
        toggleSize: Dp = 48.dp,
        textStyle: TextStyle = MaterialTheme.typography.bodyLarge,
        contentPadding: PaddingValues = PaddingValues(
            end = MaterialTheme.spacing.medium
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
    private val textColor: Color,
    private val disabledTextColor: Color
) {
    @Stable
    internal fun textColor(enabled: Boolean): Color =
        if (enabled) textColor else disabledTextColor

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
        if (other == null || other !is CheckboxColors) return false

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