package ru.rabbit.persian.appShowcase.componets

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.text.Text

@Composable
fun SampleRow(
    firstItem: Boolean = false,
    lastItem: Boolean = false,
    text: String,
    content: @Composable RowScope.() -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                top = if (firstItem) PersianTheme.spacing.size12 else PersianTheme.spacing.size8,
                bottom = if (lastItem) PersianTheme.spacing.size12 else PersianTheme.spacing.size8,
                start = PersianTheme.spacing.size12,
                end = PersianTheme.spacing.size12
            ),
    ) {
        Text(
            text = text,
            style = PersianTheme.typography.titleMedium,
            color = PersianTheme.colorScheme.onSurface
        )
        Spacer(modifier = Modifier.height(PersianTheme.spacing.size4))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically,
            content = content
        )
    }
}