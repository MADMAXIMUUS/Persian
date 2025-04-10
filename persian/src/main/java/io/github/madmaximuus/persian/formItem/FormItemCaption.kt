package io.github.madmaximuus.persian.formItem

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.text.Text

/**
 * Interface representing the scope for a form caption.
 *
 * @property colors The colors associated with the form caption.
 * @property colors The sizes associated with the form caption.
 * @property enabled Indicates whether the form caption is enabled.
 * @property isError Indicates whether the form caption is in an error state.
 */
interface FormItemCaptionScope {
    val colors: CaptionColors
    val sizes: CaptionSizes
    val enabled: Boolean
    val isError: Boolean
}

/**
 * Internal wrapper class for [FormItemCaptionScope].
 *
 * @param colors The colors associated with the form caption.
 * @param sizes The colors associated with the form caption.
 * @param enabled Indicates whether the form caption is enabled.
 * @param isError Indicates whether the form caption is in an error state.
 */
internal class FormItemCaptionScopeWrapper(
    override val colors: CaptionColors,
    override val sizes: CaptionSizes,
    override val enabled: Boolean,
    override val isError: Boolean,
) : FormItemCaptionScope

/**
 * Display a caption within a form.
 *
 * @param modifier The modifier to be applied to the caption.
 * @param text The main text to be displayed in the caption.
 * @param errorText The text to be displayed if the caption is in an error state.
 */
@Composable
fun FormItemCaptionScope.Caption(
    modifier: Modifier = Modifier,
    text: String,
    errorText: String? = null,
) {
    Row(
        modifier = modifier.padding(horizontal = PersianTheme.spacing.size16),
        horizontalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size2),
        verticalAlignment = Alignment.Top
    ) {
        Text(
            text = if (this@Caption.isError && errorText != null) errorText else text,
            style = this@Caption.sizes.captionTextStyle,
            color = this@Caption.colors.textColor(
                enabled = this@Caption.enabled,
                isError = this@Caption.isError
            ),
        )
        Spacer(modifier = Modifier.weight(1f))
    }
}

/**
 * Display a caption within a form, including counter.
 *
 * @param modifier The modifier to be applied to the caption.
 * @param text The main text to be displayed in the caption.
 * @param counter The current count to be displayed.
 * @param counterMax The maximum count to be displayed.
 * @param errorText The text to be displayed if the caption is in an error state.
 */
@Composable
fun FormItemCaptionScope.Caption(
    modifier: Modifier = Modifier,
    text: String,
    counter: Int = 0,
    counterMax: Int = 0,
    errorText: String? = null,
) {
    Row(
        modifier = modifier.padding(horizontal = PersianTheme.spacing.size16),
        horizontalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size2),
        verticalAlignment = Alignment.Top
    ) {
        Text(
            text = if (this@Caption.isError && errorText != null) errorText else text,
            style = this@Caption.sizes.captionTextStyle,
            color = this@Caption.colors.textColor(
                enabled = this@Caption.enabled,
                isError = this@Caption.isError
            ),
        )
        Spacer(modifier = Modifier.weight(1f))
        Text(
            text = "$counter / $counterMax",
            style = this@Caption.sizes.counterTextStyle,
            color = this@Caption.colors.counterColor(
                this@Caption.enabled,
                this@Caption.isError
            )
        )
    }
}