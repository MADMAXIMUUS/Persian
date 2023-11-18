package io.github.madmaximuus.persian.checkboxes.toggle

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.state.ToggleableState
import io.github.madmaximuus.persian.checkboxes.NewCheckboxColors
import io.github.madmaximuus.persian.checkboxes.PersianCheckboxDefaults

@Deprecated("Replace with PersianCheckboxToggle()")
object PersianCheckboxToggle {

    @Composable
    fun Primary(
        modifier: Modifier = Modifier,
        checked: Boolean,
        enabled: Boolean = true,
        onCheckedChange: ((Boolean) -> Unit)?,
        colors: CheckboxColors = PersianCheckboxToggleColors.primary(),
    ) {
        Checkbox(
            modifier = modifier,
            checked = checked,
            enabled = enabled,
            onCheckedChange = onCheckedChange,
            colors = colors
        )
    }
}

@Composable
fun PersianCheckboxToggle(
    checked: Boolean,
    onCheckedChange: ((Boolean) -> Unit)?,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    colors: NewCheckboxColors = PersianCheckboxDefaults.colors(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) {
    PersianTriStateCheckboxToggle(
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