package io.github.madmaximuus.persian.forms

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.spacing


data class PersianFormSubheadConfig(
    val text: String,
    val required: Boolean = false,
    val textStyle: TextStyle? = null,
    val colors: SubheadColors? = null
)

@Composable
internal fun PersianFormSubhead(
    modifier: Modifier = Modifier,
    required: Boolean = false,
    enabled: Boolean = true,
    text: String,
    colors: SubheadColors? = null,
    textStyle: TextStyle? = null
) {
    val resolvedColors = colors ?: PersianFormDefaults.subheadColors()
    val resolvedTextStyle = textStyle ?: MaterialTheme.typography.bodySmall
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.extraExtraSmall)
    ) {
        Text(
            text = text,
            style = resolvedTextStyle,
            color = resolvedColors.textColor(enabled = enabled).value
        )
        if (required) {
            Text(
                text = "*",
                style = resolvedTextStyle,
                color = resolvedColors.requiredColor(enabled = enabled).value
            )
        }
        Spacer(modifier = Modifier.weight(1f))
    }
}

@Preview
@Composable
fun SubheadPreview() {
    PersianTheme {
        Surface {
            PersianFormSubhead(
                text = "Subhead",
                required = true
            )
        }
    }
}