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
    checkboxColors: CheckboxColors = PersianCheckboxDefaults.colors(),
    checkboxSizes: CheckboxSizes = PersianCheckboxDefaults.sizes()
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
                    color = checkboxColors.textColor(enabled)
                )
            )
            .padding(checkboxSizes.contentPadding),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start
    ) {
        CheckboxToggle(
            modifier = Modifier
                .size(checkboxSizes.toggleSize),
            checked = checked,
            enabled = enabled,
            onCheckedChange = null,
            colors = checkboxColors
        )
        Text(
            text = text,
            color = checkboxColors.textColor(enabled),
            style = checkboxSizes.textStyle
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
    checkboxColors: CheckboxColors = PersianCheckboxDefaults.colors(),
    checkboxSizes: CheckboxSizes = PersianCheckboxDefaults.sizes()
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
                    color = checkboxColors.boxColor(enabled = enabled, state = state).value,
                )
            )
            .padding(checkboxSizes.contentPadding),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start
    ) {
        TriStateCheckboxToggle(
            modifier = Modifier
                .size(checkboxSizes.toggleSize),
            state = state,
            enabled = enabled,
            onClick = null,
            colors = checkboxColors
        )
        Text(
            text = text,
            color = checkboxColors.textColor(enabled),
            style = checkboxSizes.textStyle
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