package io.github.madmaximuus.persian.actionSheet

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.text.Text

@Composable
internal fun PersianActionSheetHeader(
    modifier: Modifier = Modifier,
    title: String?,
    subtitle: String?,
    colors: ActionSheetColors
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(
                top = PersianTheme.spacing.size24,
                bottom = PersianTheme.spacing.size4
            )
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
                style = PersianTheme.typography.titleLarge,
                color = colors.titleColor
            )
            Spacer(modifier = Modifier.height(PersianTheme.spacing.size4))
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
                style = PersianTheme.typography.bodyLarge,
                color = colors.subtitleColor
            )
        }
    }
}