package io.github.madmaximuus.persian.datePicker.view.cells

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.adaptive.currentWindowAdaptiveInfo
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.window.core.layout.WindowHeightSizeClass
import io.github.madmaximuus.persian.datePicker.view.DatePickerDayOfWeekCellColors
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.text.Text

@Composable
internal fun DatePickerDialogWeekLabelCell(
    label: String,
    modifier: Modifier = Modifier,
    colors: DatePickerDayOfWeekCellColors,
) {
    val windowHeightSizeClass = currentWindowAdaptiveInfo().windowSizeClass.windowHeightSizeClass
    val sizeModifier =
        if (windowHeightSizeClass == WindowHeightSizeClass.COMPACT) modifier.size(34.dp, 24.dp)
        else
            modifier
                .padding(
                    horizontal = PersianTheme.spacing.size4,
                    vertical = PersianTheme.spacing.size2
                )

    Box(
        modifier = sizeModifier,
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = label,
            style = PersianTheme.typography.labelLarge,
            color = colors.dayOfWeekLabelColor
        )
    }
}