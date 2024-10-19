package io.github.madmaximuus.persian.forms

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import io.github.madmaximuus.persian.foundation.PersianTheme

/**
 * Composable function to display a form with optional subhead, content, and caption.
 *
 * @param modifier The modifier to be applied to the form.
 * @param enabled Indicates whether the form is enabled.
 * @param isError Indicates whether the form is in an error state.
 * @param isValid Indicates whether the form is valid.
 * @param subhead The composable content to be displayed as the subhead of the form.
 * @param content The composable content to be displayed as the main content of the form.
 * @param caption The composable content to be displayed as the caption of the form.
 */
@Composable
fun Form(
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    isError: Boolean = false,
    isValid: Boolean = false,
    subhead: @Composable (FormSubheadScope.() -> Unit)? = null,
    content: @Composable FormContentScope.() -> Unit,
    caption: @Composable (FormCaptionScope.() -> Unit)? = null,
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size2)
    ) {
        val subheadColors = FormDefaults.subheadColors()
        val subheadTextStyle = PersianTheme.typography.labelMedium
        subhead?.let { subhead ->
            val subheadScope = remember(subheadColors, enabled, isError) {
                FormSubheadScopeWrapper(
                    scope = this,
                    colors = subheadColors,
                    textStyle = subheadTextStyle,
                    enabled = enabled,
                )
            }
            subheadScope.subhead()
        }
        val contentScope = remember(enabled, isError, isValid) {
            FormContentScopeWrapper(
                scope = this,
                enabled = enabled,
                isError = isError,
                isValid = isValid
            )
        }
        contentScope.content()
        val colors = FormDefaults.captionColors()
        caption?.let { caption ->
            val captionScope = remember(colors, enabled, isError) {
                FormCaptionScopeWrapper(
                    scope = this,
                    colors = colors,
                    enabled = enabled,
                    isError = isError
                )
            }
            captionScope.caption()
        }
    }
}