package io.github.madmaximuus.persian.checkboxes

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.selection.toggleable
import androidx.compose.foundation.selection.triStateToggleable
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.tooling.preview.Preview
import io.github.madmaximuus.persian.checkboxes.toggle.CheckboxToggle
import io.github.madmaximuus.persian.checkboxes.toggle.TriStateCheckboxToggle
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.ripple.ripple
import io.github.madmaximuus.persian.surface.Surface
import io.github.madmaximuus.persian.text.Text

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
            .clip(PersianTheme.shapes.shape16)
            .toggleable(
                value = checked,
                enabled = enabled,
                onValueChange = { onCheckedChange(!checked) },
                role = Role.Checkbox,
                interactionSource = remember { MutableInteractionSource() },
                indication = ripple(
                    color = colors.textColor(enabled)
                )
            )
            .padding(sizes.contentPadding),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start
    ) {
        CheckboxToggle(
            modifier = Modifier
                .size(sizes.toggleSize),
            checked = checked,
            enabled = enabled,
            onCheckedChange = null,
            colors = colors.toggleColors
        )
        Text(
            text = text,
            color = colors.textColor(enabled),
            style = sizes.textStyle
        )
    }
}

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
            .padding(sizes.contentPadding),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start
    ) {
        TriStateCheckboxToggle(
            modifier = Modifier
                .size(sizes.toggleSize),
            state = state,
            enabled = enabled,
            onClick = null,
            colors = colors.toggleColors
        )
        Text(
            text = text,
            color = colors.textColor(enabled),
            style = sizes.textStyle
        )
    }
}

@Preview
@Preview(uiMode = UI_MODE_NIGHT_YES)
@Composable
private fun CheckboxPreview() {
    PersianTheme {
        Surface {
            Checkbox(
                text = "Checkbox",
                checked = true,
                onCheckedChange = {}
            )
        }
    }
}

@Preview
@Preview(uiMode = UI_MODE_NIGHT_YES)
@Composable
private fun TriStateCheckboxPreview() {
    PersianTheme {
        Surface {
            TriStateCheckbox(
                text = "Checkbox",
                state = ToggleableState.Indeterminate,
                onClick = {}
            )
        }
    }
}