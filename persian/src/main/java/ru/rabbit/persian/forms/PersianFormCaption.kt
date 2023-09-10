package ru.rabbit.persian.forms

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import ru.rabbit.persian.foundation.PersianContentStateDisabled
import ru.rabbit.persian.foundation.PersianTheme
import ru.rabbit.persian.foundation.extendedColorScheme
import ru.rabbit.persian.foundation.spacing

object PersianFormCaption {

    @Composable
    fun Default(
        modifier: Modifier = Modifier,
        text: String,
        isError: Boolean = false,
        errorText: String? = null,
        enabled: Boolean = true,
        colors: CaptionColors = PersianCaptionColors.primary(),
        textStyle: TextStyle = MaterialTheme.typography.bodySmall
    ) {
        Row(
            modifier = modifier,
            horizontalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.extraExtraSmall),
            verticalAlignment = Alignment.Top
        ) {
            if (isError && errorText != null) {
                Text(
                    text = errorText,
                    style = textStyle,
                    color = colors.errorColor,
                )
            } else {
                Text(
                    text = text,
                    style = textStyle,
                    color = if (enabled) colors.textColor
                    else MaterialTheme.extendedColorScheme.onSurface
                        .copy(PersianContentStateDisabled)
                )
            }
            Spacer(modifier = Modifier.weight(1f))
        }
    }

    @Composable
    fun WithCounter(
        modifier: Modifier = Modifier,
        text: String,
        counter: Int,
        counterMax: Int,
        isError: Boolean = false,
        errorText: String? = null,
        enabled: Boolean = true,
        colors: CaptionColors = PersianCaptionColors.primary(),
        textStyle: TextStyle = MaterialTheme.typography.bodySmall
    ) {
        Row(
            modifier = modifier,
            horizontalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.extraExtraSmall)
        ) {
            if (isError && errorText != null) {
                Text(
                    text = errorText,
                    style = textStyle,
                    color = colors.errorColor,
                )
            } else {
                Text(
                    text = text,
                    style = textStyle,
                    color = if (enabled) colors.textColor
                    else MaterialTheme.extendedColorScheme.onSurface
                        .copy(PersianContentStateDisabled)
                )
            }
            Spacer(modifier = Modifier.weight(1f))
            Text(
                text = "$counter / $counterMax",
                style = textStyle,
                color = colors.counterColor
            )
        }
    }

}

@Preview
@Composable
fun CaptionPreview() {
    PersianTheme {
        Surface {
            PersianFormCaption.WithCounter(
                text = "Caption",
                counter = 0,
                isError = true,
                errorText = "asdadssad",
                counterMax = 180
            )
        }
    }
}

@Preview(uiMode = UI_MODE_NIGHT_YES)
@Composable
fun DarkCaptionPreview() {
    PersianTheme {
        Surface {
            PersianFormCaption.WithCounter(
                text = "Caption",
                counter = 0,
                counterMax = 180
            )
        }
    }
}