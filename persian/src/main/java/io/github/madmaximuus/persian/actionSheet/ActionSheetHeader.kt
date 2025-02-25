package io.github.madmaximuus.persian.actionSheet

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.text.Text

/**
 * The scope of header in this [ActionSheet].
 *
 * @property colors the colors used for title and subtitle.
 * @property sizes the sizes used for title and subtitle.
 */
interface ActionSheetHeaderScope : ColumnScope {
    val colors: ActionSheetColors
    val sizes: ActionSheetSizes
}

/**
 * The wrapper class for scope of header in this [ActionSheet].
 *
 * @param scope the column scope used in header.
 * @param colors the colors used for title and subtitle.
 * @param sizes the sizes used for title and subtitle.
 */
internal class ActionSheetHeaderScopeWrapper(
    val scope: ColumnScope,
    override val colors: ActionSheetColors,
    override val sizes: ActionSheetSizes,
) : ActionSheetHeaderScope, ColumnScope by scope

/**
 * The extension function for [ActionSheetHeaderScope] that represent header in this [ActionSheet].
 *
 * @param modifier the [Modifier] to be applied to this action sheet.
 * @param title text that will be displayed in the title.
 * @param message text that will be displayed in the subtitle.
 */
@Composable
fun ActionSheetHeaderScope.Header(
    modifier: Modifier = Modifier,
    title: String?,
    message: String?
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = PersianTheme.spacing.size24)
            .padding(
                top = PersianTheme.spacing.size24,
                bottom = PersianTheme.spacing.size12
            ),
        verticalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size4)
    ) {
        title?.let {
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = it,
                textAlign = TextAlign.Center,
                style = this@Header.sizes.titleTextStyle,
                color = this@Header.colors.titleColor
            )
        }
        message?.let {
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = it,
                textAlign = TextAlign.Center,
                style = this@Header.sizes.messageTextStyle,
                color = this@Header.colors.subtitleColor
            )
        }
    }
}