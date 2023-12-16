package io.github.madmaximuus.persian.checkboxes

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.selection.toggleable
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.tooling.preview.Preview
import io.github.madmaximuus.persian.checkboxes.toggle.PersianCheckboxToggle
import io.github.madmaximuus.persian.foundation.PersianContentStateDisabled
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.extendedColorScheme

@Composable
fun PersianCheckbox(
    modifier: Modifier = Modifier,
    text: String,
    checked: Boolean,
    enabled: Boolean = true,
    onCheckedChange: (Boolean) -> Unit,
    checkboxColors: NewCheckboxColors = PersianCheckboxDefaults.colors(),
    checkboxSizes: CheckboxSizes = PersianCheckboxDefaults.sizes()
) {
    val textColor = if (enabled) checkboxColors.textColor(enabled).value
    else MaterialTheme.extendedColorScheme.onSurface.copy(alpha = PersianContentStateDisabled)
    Row(
        modifier = modifier
            .clip(MaterialTheme.shapes.large)
            .toggleable(
                value = checked,
                enabled = enabled,
                onValueChange = { onCheckedChange(!checked) },
                role = Role.Checkbox
            )
            .padding(checkboxSizes.contentPadding),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start
    ) {
        PersianCheckboxToggle(
            modifier = Modifier
                .size(checkboxSizes.toggleSize),
            checked = checked,
            enabled = enabled,
            onCheckedChange = null,
            colors = checkboxColors
        )
        Text(
            text = text,
            color = textColor,
            style = checkboxSizes.textStyle
        )
    }
}

@Preview
@Composable
fun CheckboxPreview() {
    PersianTheme {
        Surface {
            PersianCheckbox(
                text = "Checkbox",
                checked = true,
                onCheckedChange = {}
            )
        }
    }
}

@Preview(uiMode = UI_MODE_NIGHT_YES)
@Composable
fun CheckboxDarkPreview() {
    PersianTheme {
        Surface {
            PersianCheckbox(
                text = "Checkbox",
                checked = false,
                onCheckedChange = {}
            )
        }
    }
}