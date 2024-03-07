package io.github.madmaximuus.persian.colorPicker.view.inputs

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import io.github.madmaximuus.persian.forms.PersianForm
import io.github.madmaximuus.persian.forms.PersianFormContent
import io.github.madmaximuus.persian.forms.PersianFormSubheadConfig

@Composable
fun HexInput(
    value: String,
    modifier: Modifier = Modifier
) {
    PersianForm(
        modifier = modifier,
        subhead = PersianFormSubheadConfig(
            text = "HEX"
        ),
        content = PersianFormContent.Input(
            value = value,
            onValueChange = {},
            readOnly = true
        )
    )
}