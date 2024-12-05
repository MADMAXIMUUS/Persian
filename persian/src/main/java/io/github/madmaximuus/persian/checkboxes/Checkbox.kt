package io.github.madmaximuus.persian.checkboxes

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.selection.toggleable
import androidx.compose.foundation.selection.triStateToggleable
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.checkboxes.toggle.CheckboxToggle
import io.github.madmaximuus.persian.checkboxes.toggle.TriStateCheckboxToggle
import io.github.madmaximuus.persian.foundation.PersianState38
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.ripple.ripple
import io.github.madmaximuus.persian.text.Text

/**
 * Checkboxes allow users to select one or more items from a set. Checkboxes can turn an option on
 * or off.
 *
 * @param modifier The [Modifier] to be applied to the checkbox.
 * @param text The text label to be displayed next to the checkbox.
 * @param checked The current checked state of the checkbox.
 * @param enabled Whether the checkbox is enabled and can be interacted with. Defaults to true.
 * @param onCheckedChange A callback to be invoked when the checked state changes.
 * @param colors The colors to be used for the checkbox.
 * @param sizes The sizes to be used for the checkbox.
 */
@Composable
fun Checkbox(
    modifier: Modifier = Modifier,
    text: String,
    checked: Boolean,
    enabled: Boolean = true,
    onCheckedChange: (Boolean) -> Unit,
    colors: CheckboxColors = CheckboxDefaults.colors(),
    sizes: CheckboxSizes = CheckboxDefaults.sizes()
) {
    Row(
        modifier = modifier
            .height(48.dp)
            .clip(sizes.shape)
            .toggleable(
                value = checked,
                enabled = enabled,
                onValueChange = { onCheckedChange(!checked) },
                role = Role.Checkbox,
                interactionSource = remember { MutableInteractionSource() },
                indication = ripple(
                    color = colors.textColor
                )
            )
            .padding(sizes.contentPadding)
            .graphicsLayer {
                alpha = if (enabled)
                    1f
                else
                    PersianState38
            },
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size12)
    ) {
        CheckboxToggle(
            modifier = Modifier
                .size(sizes.toggleSize),
            checked = checked,
            onCheckedChange = null,
            colors = colors.toggleColors
        )
        Text(
            text = text,
            color = colors.textColor,
            style = sizes.textStyle
        )
    }
}

/**
 * Checkboxes can have a parent-child relationship with other checkboxes. When the parent checkbox
 * is checked, all child checkboxes are checked. If a parent checkbox is unchecked, all child
 * checkboxes are unchecked. If some, but not all, child checkboxes are checked, the parent checkbox
 * becomes an indeterminate checkbox.
 *
 * @param text The text label to be displayed next to the checkbox.
 * @param state The current state of the checkbox, which can be checked, unchecked, or indeterminate.
 * @param onClick A callback to be invoked when the checkbox is clicked.
 * @param modifier The [Modifier] to be applied to the checkbox.
 * @param enabled Whether the checkbox is enabled and can be interacted with.
 * @param colors The colors to be used for the checkbox.
 * @param sizes The sizes to be used for the checkbox.
 */
@Composable
fun TriStateCheckbox(
    modifier: Modifier = Modifier,
    text: String,
    state: ToggleableState,
    enabled: Boolean = true,
    onClick: () -> Unit,
    colors: CheckboxColors = CheckboxDefaults.colors(),
    sizes: CheckboxSizes = CheckboxDefaults.sizes()
) {
    Row(
        modifier = modifier
            .height(48.dp)
            .clip(PersianTheme.shapes.shape16)
            .triStateToggleable(
                state = state,
                enabled = enabled,
                onClick = onClick,
                role = Role.Checkbox,
                interactionSource = remember { MutableInteractionSource() },
                indication = ripple(
                    color = colors.toggleColors.boxColor(enabled = enabled, state = state).value,
                )
            )
            .padding(sizes.contentPadding)
            .graphicsLayer {
                alpha = if (enabled)
                    1f
                else
                    PersianState38
            },
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size12)
    ) {
        TriStateCheckboxToggle(
            modifier = Modifier
                .size(sizes.toggleSize),
            state = state,
            onClick = null,
            colors = colors.toggleColors
        )
        Text(
            text = text,
            color = colors.textColor,
            style = sizes.textStyle
        )
    }
}