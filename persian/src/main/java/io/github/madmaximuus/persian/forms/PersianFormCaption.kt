package io.github.madmaximuus.persian.forms

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import io.github.madmaximuus.persian.foundation.spacing

data class PersianFormCaptionConfig(
    val text: String,
    val errorText: String? = null,
    val colors: CaptionColors? = null,
    val counter: Int? = null,
    val counterMax: Int? = null,
    val textStyle: TextStyle? = null,
    val counterTextStyle: TextStyle? = null
)

@Composable
internal fun PersianFormCaption(
    modifier: Modifier = Modifier,
    text: String,
    isError: Boolean,
    errorText: String?,
    enabled: Boolean,
    colors: CaptionColors?,
    textStyle: TextStyle?
) {
    val resolvedColors = colors ?: PersianFormDefaults.captionColors()
    val resolvedTextStyle = textStyle ?: MaterialTheme.typography.bodySmall
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.size2),
        verticalAlignment = Alignment.Top
    ) {
        Text(
            text = if (isError && errorText != null) errorText else text,
            style = resolvedTextStyle,
            color = resolvedColors.textColor(enabled = enabled, isError = isError).value,
        )
        Spacer(modifier = Modifier.weight(1f))
    }
}

@Composable
internal fun PersianFormCaption(
    modifier: Modifier = Modifier,
    text: String,
    counter: Int,
    counterMax: Int,
    isError: Boolean,
    errorText: String?,
    enabled: Boolean,
    colors: CaptionColors?,
    textStyle: TextStyle?,
    counterTextStyle: TextStyle?
) {
    val resolvedColors = colors ?: PersianFormDefaults.captionColors()
    val resolvedTextStyle = textStyle ?: MaterialTheme.typography.bodySmall
    val resolvedCounterTextStyle = counterTextStyle ?: MaterialTheme.typography.bodySmall
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.size2),
        verticalAlignment = Alignment.Top
    ) {
        Text(
            text = if (isError && errorText != null) errorText else text,
            style = resolvedTextStyle,
            color = resolvedColors.textColor(enabled = enabled, isError = isError).value,
        )
        Spacer(modifier = Modifier.weight(1f))
        Text(
            text = "$counter / $counterMax",
            style = resolvedCounterTextStyle,
            color = resolvedColors.counterColor(enabled, isError).value
        )
    }
}