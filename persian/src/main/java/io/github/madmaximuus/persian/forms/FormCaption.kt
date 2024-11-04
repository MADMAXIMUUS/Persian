package io.github.madmaximuus.persian.forms

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.layoutId
import io.github.madmaximuus.persian.forms.utils.LayoutId
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.text.Text

/**
 * Interface representing the scope for a form caption.
 *
 * This interface extends [ColumnScope] and provides additional properties
 * specific to form captions, such as colors, enabled state, and error status.
 *
 * @property colors The colors associated with the form caption.
 * @property enabled Indicates whether the form caption is enabled.
 * @property isError Indicates whether the form caption is in an error state.
 */
interface FormCaptionScope {
    val colors: CaptionColors
    val sizes: CaptionSizes
    val enabled: Boolean
    val isError: Boolean
}

/**
 * Internal wrapper class for [FormCaptionScope].
 *
 * This class implements [FormCaptionScope] and delegates [ColumnScope] functionality to the provided scope.
 * It encapsulates the properties required for a form caption, such as colors, enabled state, and error status.
 *
 * @param colors The colors associated with the form caption.
 * @param enabled Indicates whether the form caption is enabled.
 * @param isError Indicates whether the form caption is in an error state.
 */
internal class FormCaptionScopeWrapper(
    override val colors: CaptionColors,
    override val sizes: CaptionSizes,
    override val enabled: Boolean,
    override val isError: Boolean,
) : FormCaptionScope

/**
 * Composable function to display a caption within a form.
 *
 * This function uses the properties from the [FormCaptionScope] to determine the appearance and behavior
 * of the caption text. It displays the provided [text] or [errorText] if the caption is in an error state.
 *
 * @param modifier The modifier to be applied to the caption.
 * @param text The main text to be displayed in the caption.
 * @param errorText The text to be displayed if the caption is in an error state.
 */
@Composable
fun FormCaptionScope.Caption(
    modifier: Modifier = Modifier,
    text: String,
    errorText: String? = null,
) {
    Row(
        modifier = modifier.layoutId(LayoutId.CAPTION),
        horizontalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size2),
        verticalAlignment = Alignment.Top
    ) {
        Text(
            text = if (this@Caption.isError && errorText != null) errorText else text,
            style = this@Caption.sizes.captionTextStyle,
            color = this@Caption.colors.textColor(
                enabled = this@Caption.enabled,
                isError = this@Caption.isError
            ).value,
        )
        Spacer(modifier = Modifier.weight(1f))
    }
}

/**
 * Composable function to display a caption within a form, including an optional counter.
 *
 * This function uses the properties from the [FormCaptionScope] to determine the appearance and behavior
 * of the caption text and counter. It displays the provided [text] or [errorText] if the caption is in an error state.
 * Additionally, it can display a counter showing the current count and maximum count.
 *
 * @param modifier The modifier to be applied to the caption.
 * @param text The main text to be displayed in the caption.
 * @param counter The current count to be displayed. Default is 0.
 * @param counterMax The maximum count to be displayed. Default is 0.
 * @param errorText The text to be displayed if the caption is in an error state.
 */
@Composable
fun FormCaptionScope.Caption(
    modifier: Modifier = Modifier,
    text: String,
    counter: Int = 0,
    counterMax: Int = 0,
    errorText: String? = null,
) {
    Row(
        modifier = modifier.layoutId(LayoutId.CAPTION),
        horizontalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size2),
        verticalAlignment = Alignment.Top
    ) {
        Text(
            text = if (this@Caption.isError && errorText != null) errorText else text,
            style = this@Caption.sizes.captionTextStyle,
            color = this@Caption.colors.textColor(
                enabled = this@Caption.enabled,
                isError = this@Caption.isError
            ).value,
        )
        Spacer(modifier = Modifier.weight(1f))
        Text(
            text = "$counter / $counterMax",
            style = this@Caption.sizes.counterTextStyle,
            color = this@Caption.colors.counterColor(
                this@Caption.enabled,
                this@Caption.isError
            ).value
        )
    }
}