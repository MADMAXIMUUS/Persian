package io.github.madmaximuus.persian.formItem

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.Layout
import io.github.madmaximuus.persian.formItem.utils.formMeasurePolicy
import io.github.madmaximuus.persian.foundation.PersianState38
import io.github.madmaximuus.persian.foundation.PersianTheme

/**
 * A form containing input fields, subheads, and captions is useful for collecting
 * and submitting user input, providing a structured and interactive interface for gathering information.
 * It offers a straightforward and effective method for data entry, making it an essential tool for enhancing
 * user experience and data collection.
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
fun FormItem(
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    isError: Boolean = false,
    isValid: Boolean = false,
    colors: FormColors = FormItemDefaults.formColors(),
    sizes: FormSizes = FormItemDefaults.formSizes(),
    subhead: @Composable (FormItemSubheadScope.() -> Unit)? = null,
    content: @Composable FormItemContentScope.() -> Unit,
    caption: @Composable (FormItemCaptionScope.() -> Unit)? = null,
) {
    val padding = PersianTheme.spacing.size16
    val spacer = PersianTheme.spacing.size6
    Layout(
        modifier = modifier
            .graphicsLayer {
                alpha = if (enabled) 1f
                else PersianState38
            },
        measurePolicy = { measurables, constraints ->
            formMeasurePolicy(
                scope = this,
                measurables = measurables,
                constraints = constraints,
                horizontalPadding = padding.roundToPx(),
                spaceHeight = spacer.roundToPx()
            )
        },
        content = {
            subhead?.let { subhead ->
                val subheadScope = remember(colors.subheadColors, enabled, isError) {
                    FormItemSubheadScopeWrapper(
                        colors = colors.subheadColors,
                        textStyle = sizes.subheadTextStyle,
                        enabled = enabled,
                    )
                }
                subheadScope.subhead()
            }
            val contentScope = remember(enabled, isError, isValid) {
                FormItemContentScopeWrapper(
                    enabled = enabled,
                    isError = isError,
                    isValid = isValid
                )
            }
            contentScope.content()
            caption?.let { caption ->
                val captionScope = remember(colors, enabled, isError) {
                    FormItemCaptionScopeWrapper(
                        colors = colors.captionColors,
                        sizes = sizes.captionSizes,
                        enabled = enabled,
                        isError = isError
                    )
                }
                captionScope.caption()
            }
        }
    )
}