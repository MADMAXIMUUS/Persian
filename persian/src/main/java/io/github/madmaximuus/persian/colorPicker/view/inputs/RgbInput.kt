package io.github.madmaximuus.persian.colorPicker.view.inputs

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import io.github.madmaximuus.persian.forms.PersianForm
import io.github.madmaximuus.persian.forms.PersianFormContent
import io.github.madmaximuus.persian.forms.PersianFormSubheadConfig
import io.github.madmaximuus.persian.foundation.spacing

@Composable
fun RgbInput(
    value: Triple<Int, Int, Int>,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.extraExtraSmall)
    ) {
        PersianForm(
            modifier = Modifier.weight(1f),
            subhead = PersianFormSubheadConfig(
                text = "R"
            ),
            content = PersianFormContent.Input(
                value = value.first.toString(),
                onValueChange = {},
                readOnly = true
            )
        )
        PersianForm(
            modifier = Modifier.weight(1f),
            subhead = PersianFormSubheadConfig(
                text = "G"
            ),
            content = PersianFormContent.Input(
                value = value.second.toString(),
                onValueChange = {},
                readOnly = true
            )
        )
        PersianForm(
            modifier = Modifier.weight(1f),
            subhead = PersianFormSubheadConfig(
                text = "B"
            ),
            content = PersianFormContent.Input(
                value = value.third.toString(),
                onValueChange = {},
                readOnly = true
            )
        )
    }
}