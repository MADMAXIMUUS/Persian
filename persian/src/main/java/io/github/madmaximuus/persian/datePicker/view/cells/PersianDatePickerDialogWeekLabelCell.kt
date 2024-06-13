package io.github.madmaximuus.persian.datePicker.view.cells

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import io.github.madmaximuus.persian.datePicker.view.DatePickerDayOfWeekCellColors
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.text.Text

@Composable
internal fun PersianDatePickerDialogWeekLabelCell(
    label: String,
    modifier: Modifier = Modifier,
    colors: DatePickerDayOfWeekCellColors,
) {
    Box(
        modifier = modifier
            .padding(
                horizontal = PersianTheme.spacing.size4,
                vertical = PersianTheme.spacing.size2
            ),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = label,
            style = PersianTheme.typography.labelLarge,
            color = colors.dayOfWeekLabelColor
        )
    }
}