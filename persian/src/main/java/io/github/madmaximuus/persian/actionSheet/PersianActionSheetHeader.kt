package io.github.madmaximuus.persian.actionSheet

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import io.github.madmaximuus.persian.foundation.extendedColorScheme
import io.github.madmaximuus.persian.foundation.spacing

@Composable
internal fun PersianActionSheetHeader(
    modifier: Modifier = Modifier,
    title: String?,
    subtitle: String?,
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(
                top = MaterialTheme.spacing.extraExtraLarge,
                bottom = MaterialTheme.spacing.extraSmall
            )
    ) {
        title?.let {
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        start = MaterialTheme.spacing.extraLarge,
                        end = MaterialTheme.spacing.extraLarge
                    ),
                text = it,
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.titleLarge,
                color = MaterialTheme.extendedColorScheme.onSurface
            )
            Spacer(modifier = Modifier.height(MaterialTheme.spacing.extraSmall))
        }
        subtitle?.let {
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        start = MaterialTheme.spacing.extraLarge,
                        end = MaterialTheme.spacing.extraLarge
                    ),
                text = it,
                textAlign = TextAlign.Justify,
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.extendedColorScheme.onSurfaceVariant
            )
        }
    }
}