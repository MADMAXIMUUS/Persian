package io.github.madmaximuus.persian.formItem

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.text.TextStyle
import io.github.madmaximuus.persian.formItem.utils.LayoutId
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.text.Text

/**
 * Interface representing the scope for a form subhead.
 *
 * This interface provides properties specific to form subheads, such as text style, colors, and enabled state.
 *
 * @property textStyle The text style to be applied to the form subhead.
 * @property colors The colors associated with the form subhead.
 * @property enabled Indicates whether the form subhead is enabled.
 */
interface FormItemSubheadScope {
    val textStyle: TextStyle
    val colors: SubheadColors
    val enabled: Boolean
}

/**
 * Internal wrapper class for [FormItemSubheadScope].
 *
 * This class implements [FormItemSubheadScope] and delegates [ColumnScope] functionality to the provided scope.
 * It encapsulates the properties required for a form subhead, such as colors, text style, and enabled state.
 *
 * @param colors The colors associated with the form subhead.
 * @param textStyle The text style to be applied to the form subhead.
 * @param enabled Indicates whether the form subhead is enabled.
 */
internal class FormItemSubheadScopeWrapper(
    override val colors: SubheadColors,
    override val textStyle: TextStyle,
    override val enabled: Boolean,
) : FormItemSubheadScope

/**
 * Composable function to display a subhead within a form.
 *
 * This function uses the properties from the [FormItemSubheadScope] to determine the appearance and behavior
 * of the subhead. It provides customization options such as text, required indicator, and modifier.
 *
 * @param modifier The modifier to be applied to the subhead.
 * @param text The text to be displayed in the subhead.
 * @param required Indicates whether the subhead should display a required indicator.
 */
@Composable
fun FormItemSubheadScope.Subhead(
    modifier: Modifier = Modifier,
    text: String,
    required: Boolean = false,
) {
    val resolvedColors = this@Subhead.colors
    val resolvedTextStyle = this@Subhead.textStyle
    Row(
        modifier = modifier.layoutId(LayoutId.SUBHEAD),
        horizontalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size2)
    ) {
        Text(
            text = text,
            style = resolvedTextStyle,
            color = resolvedColors.textColor
        )
        if (required) {
            Text(
                text = "*",
                style = resolvedTextStyle,
                color = resolvedColors.requiredColor
            )
        }
        Spacer(modifier = Modifier.weight(1f))
    }
}