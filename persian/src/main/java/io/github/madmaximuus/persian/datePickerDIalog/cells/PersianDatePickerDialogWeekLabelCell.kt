package io.github.madmaximuus.persian.datePickerDIalog.cells

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import io.github.madmaximuus.persian.foundation.extendedColorScheme
import io.github.madmaximuus.persian.foundation.spacing

internal object PersianDatePickerDialogWeekLabelCell {

    @Composable
    fun Primary(
        label: String,
        modifier: Modifier = Modifier,
    ) {
        Box(
            modifier = modifier
                .padding(
                    horizontal = MaterialTheme.spacing.extraSmall,
                    vertical = MaterialTheme.spacing.extraExtraSmall
                ),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = label,
                style = MaterialTheme.typography.labelLarge,
                color = MaterialTheme.extendedColorScheme.onSurfaceVariant
            )
        }
    }
}