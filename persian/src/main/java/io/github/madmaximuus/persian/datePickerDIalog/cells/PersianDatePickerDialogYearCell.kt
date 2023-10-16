package io.github.madmaximuus.persian.datePickerDIalog.cells

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.extendedColorScheme
import io.github.madmaximuus.persian.foundation.spacing

internal object PersianDatePickerDialogYearCell {

    @Composable
    fun Primary(
        year: String,
        index: Int,
        currentYear: Boolean,
        selected: Boolean,
        onYearClick: (Int) -> Unit,
        modifier: Modifier = Modifier,
    ) {

        val textStyle = when {
            selected -> MaterialTheme.typography.bodyMedium.copy(
                color = MaterialTheme.extendedColorScheme.onPrimary
            )

            currentYear -> MaterialTheme.typography.labelLarge.copy(
                color = MaterialTheme.extendedColorScheme.onSurface
            )

            else -> MaterialTheme.typography.bodyMedium.copy(
                color = MaterialTheme.extendedColorScheme.onSurface
            )
        }

        val lineColor = when {
            selected && !currentYear -> Color.Transparent
            selected -> MaterialTheme.extendedColorScheme.onPrimary
            currentYear -> MaterialTheme.extendedColorScheme.primary
            else -> Color.Transparent
        }

        val baseModifier = modifier
            .clip(MaterialTheme.shapes.medium)
            .clickable { onYearClick(index) }
            .padding(
                horizontal = MaterialTheme.spacing.extraSmall,
                vertical = MaterialTheme.spacing.small
            )

        val selectedModifier = modifier
            .background(
                color = MaterialTheme.extendedColorScheme.primary,
                shape = MaterialTheme.shapes.medium
            )
            .clip(MaterialTheme.shapes.medium)
            .clickable { onYearClick(index) }
            .padding(
                horizontal = MaterialTheme.spacing.extraSmall,
                vertical = MaterialTheme.spacing.small
            )

        Column(
            modifier = when {
                selected -> selectedModifier
                else -> baseModifier
            },
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = year,
                style = textStyle,
            )
            Box(
                modifier = Modifier
                    .padding(
                        top = MaterialTheme.spacing.extraExtraSmall,
                        start = MaterialTheme.spacing.medium,
                        end = MaterialTheme.spacing.medium
                    )
                    .fillMaxWidth()
                    .height(2.dp)
                    .background(
                        color = lineColor,
                        shape = MaterialTheme.shapes.extraSmall
                    )
            )
        }
    }
}