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
import io.github.madmaximuus.persian.foundation.extendedColorScheme
import io.github.madmaximuus.persian.foundation.spacing

@Composable
internal fun PersianActionSheetHeader(
    modifier: Modifier = Modifier,
    title: String,
    subtitle: String,
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(
                start = MaterialTheme.spacing.extraExtraLarge,
                end = MaterialTheme.spacing.extraExtraLarge,
                top = MaterialTheme.spacing.large,
                bottom = MaterialTheme.spacing.extraSmall
            )
    ) {
        Text(
            text = title,
            style = MaterialTheme.typography.titleMedium,
            color = MaterialTheme.extendedColorScheme.onSurface
        )
        Spacer(modifier = Modifier.height(MaterialTheme.spacing.extraSmall))
        Text(
            text = subtitle,
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.extendedColorScheme.onSurfaceVariant
        )
    }
}