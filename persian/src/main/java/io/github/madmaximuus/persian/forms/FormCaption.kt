package io.github.madmaximuus.persian.forms

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.text.Text

interface FormCaptionScope : ColumnScope {
    val colors: CaptionColors
    val enabled: Boolean
    val isError: Boolean
}

internal class FormCaptionScopeWrapper(
    scope: ColumnScope,
    override val colors: CaptionColors,
    override val enabled: Boolean,
    override val isError: Boolean
) : FormCaptionScope, ColumnScope by scope


@Composable
fun FormCaptionScope.Caption(
    modifier: Modifier = Modifier,
    text: String,
    errorText: String? = null,
) {
    val resolvedColors = this@Caption.colors
    val resolvedTextStyle = PersianTheme.typography.bodySmall
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size2),
        verticalAlignment = Alignment.Top
    ) {
        Text(
            text = if (this@Caption.isError && errorText != null) errorText else text,
            style = resolvedTextStyle,
            color = resolvedColors.textColor(
                enabled = this@Caption.enabled,
                isError = this@Caption.isError
            ).value,
        )
        Spacer(modifier = Modifier.weight(1f))
    }
}

@Composable
fun FormCaptionScope.Caption(
    modifier: Modifier = Modifier,
    text: String,
    counter: Int = 0,
    counterMax: Int = 0,
    errorText: String? = null,
) {
    val resolvedColors = this@Caption.colors
    val resolvedTextStyle = PersianTheme.typography.bodySmall
    val resolvedCounterTextStyle = PersianTheme.typography.bodySmall
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size2),
        verticalAlignment = Alignment.Top
    ) {
        Text(
            text = if (this@Caption.isError && errorText != null) errorText else text,
            style = resolvedTextStyle,
            color = resolvedColors.textColor(
                enabled = this@Caption.enabled,
                isError = this@Caption.isError
            ).value,
        )
        Spacer(modifier = Modifier.weight(1f))
        Text(
            text = "$counter / $counterMax",
            style = resolvedCounterTextStyle,
            color = resolvedColors.counterColor(
                this@Caption.enabled,
                this@Caption.isError
            ).value
        )
    }
}