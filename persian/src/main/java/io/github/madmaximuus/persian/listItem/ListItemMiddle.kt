package io.github.madmaximuus.persian.listItem

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import io.github.madmaximuus.persian.foundation.PersianTheme

data class ListCellMiddle(
    val title: String,
    val body: String? = null,
    val subhead: String? = null,
    val multiline: Boolean = false,
    val newLabel: Boolean = false,
)

@Composable
internal fun PersianListCellMiddle(
    modifier: Modifier = Modifier,
    title: String,
    subhead: String?,
    body: String?,
    multiline: Boolean,
    newLabel: Boolean,
) {
    Column(
        modifier = modifier
            .padding(vertical = PersianTheme.spacing.size8),
        verticalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size2)
    ) {
        subhead?.let {
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = it,
                style = MaterialTheme.typography.labelMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                maxLines = if (multiline) 2 else 1,
                overflow = TextOverflow.Ellipsis
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size4)
        ) {
            Text(
                modifier = if (multiline) Modifier.weight(1f) else Modifier,
                text = title,
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.onSurface,
                maxLines = if (multiline) 2 else 1,
                overflow = TextOverflow.Ellipsis
            )
            if (newLabel) {
                Text(
                    modifier = Modifier
                        .background(
                            color = PersianTheme.colorScheme.valid,
                            shape = PersianTheme.shapes.shape4
                        )
                        .padding(
                            horizontal = PersianTheme.spacing.size4,
                            vertical = PersianTheme.spacing.size2
                        ),
                    text = "New",
                    style = PersianTheme.typography.labelSmall,
                    color = PersianTheme.colorScheme.onValid
                )
            }
        }
        body?.let {
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = it,
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                maxLines = if (multiline) 2 else 1,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}

@Preview
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun MiddlePreview() {
    PersianTheme {
        Surface(
            color = MaterialTheme.colorScheme.surface
        ) {
            PersianListCellMiddle(
                title = "Title",
                subhead = null,
                body = null,
                multiline = false,
                newLabel = false
            )
        }
    }
}