package io.github.madmaximuus.persian.radioButton

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.selection.selectable
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.surface.Surface
import io.github.madmaximuus.persian.text.Text

@Composable
fun RadioButton(
    modifier: Modifier = Modifier,
    text: String,
    checked: Boolean,
    enabled: Boolean = true,
    onCheckedChange: (Boolean) -> Unit,
    radioButtonColors: RadioButtonColors = RadioButtonDefaults.colors(),
    radioButtonSizes: RadioButtonSizes = RadioButtonDefaults.sizes()
) {
    Row(
        modifier = modifier
            .clip(PersianTheme.shapes.shape16)
            .selectable(
                enabled = enabled,
                selected = checked,
                onClick = { onCheckedChange(!checked) },
                role = Role.RadioButton
            )
            .padding(radioButtonSizes.contentPadding)
            .height(48.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size8)
    ) {
        RadioButtonToggle(
            modifier = Modifier
                .size(radioButtonSizes.toggleSize),
            selected = checked,
            enabled = enabled,
            onClick = null,
            colors = radioButtonColors.toggleColor
        )
        Text(
            modifier = Modifier,
            text = text,
            color = radioButtonColors.textColor(enabled),
            style = radioButtonSizes.textStyle
        )
    }
}

@Preview
@Preview(uiMode = UI_MODE_NIGHT_YES)
@Composable
private fun RadioButtonPreview() {
    PersianTheme {
        Surface {
            RadioButton(
                modifier = Modifier.fillMaxWidth(),
                text = "Radio Button",
                checked = true,
                onCheckedChange = {}
            )
        }
    }
}