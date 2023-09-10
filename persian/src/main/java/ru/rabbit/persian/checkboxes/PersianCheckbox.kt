package ru.rabbit.persian.checkboxes

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
import ru.rabbit.persian.checkboxes.toggle.PersianCheckboxToggle
import ru.rabbit.persian.foundation.PersianContentStateDisabled
import ru.rabbit.persian.foundation.PersianTheme
import ru.rabbit.persian.foundation.extendedColorScheme

object PersianCheckbox {

    @Composable
    fun Primary(
        modifier: Modifier = Modifier,
        text: String,
        checked: Boolean,
        enabled: Boolean = true,
        onCheckedChange: (Boolean) -> Unit,
        checkboxColors: CheckboxColors = PersianCheckboxColors.primary(),
        checkboxSizes: CheckboxSizes = PersianCheckboxSizes.small()
    ) {
        val textColor = if (enabled) checkboxColors.textColor
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
            PersianCheckboxToggle.Primary(
                modifier = Modifier
                    .size(checkboxSizes.toggleSize),
                checked = checked,
                enabled = enabled,
                onCheckedChange = null,
                colors = checkboxColors.toggleColor
            )
            Text(
                text = text,
                color = textColor,
                style = checkboxSizes.textStyle
            )
        }
    }
}

@Preview
@Composable
fun CheckboxPreview() {
    PersianTheme {
        Surface {
            PersianCheckbox.Primary(
                text = "Checkbox",
                checked = false,
                onCheckedChange = {}
            )
        }
    }
}