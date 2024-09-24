package io.github.madmaximuus.persian.forms

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.text.Text

interface FormSubheadScope {
    val textStyle: TextStyle
    val colors: SubheadColors
    val enabled: Boolean
}

internal class FormSubheadScopeWrapper(
    scope: ColumnScope,
    override val colors: SubheadColors,
    override val textStyle: TextStyle,
    override val enabled: Boolean,
) : FormSubheadScope, ColumnScope by scope

@Composable
fun FormSubheadScope.Subhead(
    modifier: Modifier = Modifier,
    text: String,
    required: Boolean = false,
) {
    val resolvedColors = this@Subhead.colors
    val resolvedTextStyle = this@Subhead.textStyle
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size2)
    ) {
        Text(
            text = text,
            style = resolvedTextStyle,
            color = resolvedColors.textColor(enabled = this@Subhead.enabled).value
        )
        if (required) {
            Text(
                text = "*",
                style = resolvedTextStyle,
                color = resolvedColors.requiredColor(enabled = this@Subhead.enabled).value
            )
        }
        Spacer(modifier = Modifier.weight(1f))
    }
}