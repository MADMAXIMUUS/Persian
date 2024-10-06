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
 * @param subtitle text that will be displayed in the subtitle.
 */
@Composable
fun ActionSheetHeaderScope.Header(
    modifier: Modifier = Modifier,
    title: String?,
    subtitle: String?
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(
                top = PersianTheme.spacing.size24,
                bottom = PersianTheme.spacing.size12
            ),
        verticalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size2)
    ) {
        title?.let {
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        start = PersianTheme.spacing.size20,
                        end = PersianTheme.spacing.size20
                    ),
                text = it,
                textAlign = TextAlign.Center,
                style = this@Header.sizes.titleTextStyle,
                color = this@Header.colors.titleColor
            )
        }
        subtitle?.let {
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        start = PersianTheme.spacing.size20,
                        end = PersianTheme.spacing.size20
                    ),
                text = it,
                textAlign = TextAlign.Justify,
                style = this@Header.sizes.subtitleTextStyle,
                color = this@Header.colors.subtitleColor
            )
        }
    }
}