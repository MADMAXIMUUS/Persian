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
fun HsvInput(
    value: Triple<Float, Float, Float>,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.extraExtraSmall)
    ) {
        PersianForm(
            modifier = Modifier.weight(1f),
            subhead = PersianFormSubheadConfig(
                text = "H"
            ),
            content = PersianFormContent.Input(
                value = "%.1f".format(value.first),
                onValueChange = {},
                readOnly = true
            )
        )
        PersianForm(
            modifier = Modifier.weight(1f),
            subhead = PersianFormSubheadConfig(
                text = "S"
            ),
            content = PersianFormContent.Input(
                value = "%.1f".format(value.second * 100),
                onValueChange = {},
                readOnly = true
            )
        )
        PersianForm(
            modifier = Modifier.weight(1f),
            subhead = PersianFormSubheadConfig(
                text = "V"
            ),
            content = PersianFormContent.Input(
                value =  "%.1f".format(value.third * 100),
                onValueChange = {},
                readOnly = true
            )
        )
    }
}