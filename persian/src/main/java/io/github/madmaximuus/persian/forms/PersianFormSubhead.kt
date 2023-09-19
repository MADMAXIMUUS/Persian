package io.github.madmaximuus.persian.forms

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.extendedColorScheme
import io.github.madmaximuus.persian.foundation.spacing

object PersianFormSubhead {

    @Composable
    fun Default(
        modifier: Modifier = Modifier,
        required: Boolean = false,
        text: String,
        textColor: Color = MaterialTheme.extendedColorScheme.onSurfaceVariant,
        textStyle: TextStyle = MaterialTheme.typography.labelMedium
    ) {
        Row(
            modifier = modifier,
            horizontalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.extraExtraSmall)
        ) {
            Text(
                text = text,
                style = textStyle,
                color = textColor
            )
            if (required) {
                Text(
                    text = "*",
                    style = textStyle,
                    color = MaterialTheme.extendedColorScheme.error
                )
            }
            Spacer(modifier = Modifier.weight(1f))
        }
    }
}

@Preview
@Composable
fun SubheadPreview() {
    PersianTheme {
        Surface {
            PersianFormSubhead.Default(
                text = "Subhead",
                required = true
            )
        }
    }
}