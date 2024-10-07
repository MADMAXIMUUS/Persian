package io.github.madmaximuus.persian.checkboxes.toggle

import androidx.compose.foundation.interaction.Interaction
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.state.ToggleableState
import io.github.madmaximuus.persian.checkboxes.CheckboxDefaults
import io.github.madmaximuus.persian.checkboxes.CheckboxToggleColors

/**
 * Checkboxes allow users to select one or more items from a set. Checkboxes can turn an option on
 * or off.
 *
 * @param checked The current checked state of the checkbox.
 * @param onCheckedChange A callback to be invoked when the checked state changes.
 * @param modifier The [Modifier] to be applied to the checkbox.
 * @param enabled Whether the checkbox is enabled and can be interacted with.
 * @param colors The colors to be used for the checkbox.
 * @param interactionSource an optional hoisted [MutableInteractionSource] for observing and
 *   emitting [Interaction]s for this button. You can use this to change the checkbox toggle's appearance or
 *   preview the button in different states. Note that if `null` is provided, interactions will
 *   still happen internally.
 */
@Composable
fun CheckboxToggle(
    checked: Boolean,
    onCheckedChange: ((Boolean) -> Unit)?,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    colors: CheckboxToggleColors = CheckboxDefaults.toggleColors(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) {
    TriStateCheckboxToggle(
        state = ToggleableState(checked),
        onClick = if (onCheckedChange != null) {
            { onCheckedChange(!checked) }
        } else {
            null
        },
        modifier = modifier,
        enabled = enabled,
        colors = colors,
        interactionSource = interactionSource
    )
}