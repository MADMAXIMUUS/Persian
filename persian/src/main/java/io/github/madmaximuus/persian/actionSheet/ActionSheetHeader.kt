package io.github.madmaximuus.persian.actionSheet

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.text.Text

@Stable
object ActionSheetHeaderScope {

    @Composable
    fun ActionSheetHeader(
        modifier: Modifier = Modifier,
        title: String?,
        subtitle: String?,
        colors: ActionSheetColors = ActionSheetDefaults.colors()
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
                    style = PersianTheme.typography.headlineSmall,
                    color = colors.titleColor
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
                    style = PersianTheme.typography.bodyMedium,
                    color = colors.subtitleColor
                )
            }
        }
    }
}