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

interface ActionSheetHeaderScope : ColumnScope {
    val colors: ActionSheetColors
    val sizes: ActionSheetSizes
}

internal class ActionSheetHeaderScopeWrapper(
    val scope: ColumnScope,
    override val colors: ActionSheetColors,
    override val sizes: ActionSheetSizes,
) : ActionSheetHeaderScope, ColumnScope by scope

@Composable
fun ActionSheetHeaderScope.ActionSheetHeader(
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
                style = this@ActionSheetHeader.sizes.titleTextStyle,
                color = this@ActionSheetHeader.colors.titleColor
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
                style = this@ActionSheetHeader.sizes.subtitleTextStyle,
                color = this@ActionSheetHeader.colors.subtitleColor
            )
        }
    }
}