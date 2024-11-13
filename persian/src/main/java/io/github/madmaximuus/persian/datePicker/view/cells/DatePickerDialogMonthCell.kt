package io.github.madmaximuus.persian.datePicker.view.cells

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.datePicker.view.DatePickerMonthCellColors
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.text.Text

/**
 * A composable function that represents a month cell in a date picker dialog.
 *
 * @param month The name of the month to be displayed.
 * @param index The index of the month in the list of months.
 * @param enabled A boolean indicating whether the month cell is enabled.
 * @param selected A boolean indicating whether the month cell is selected.
 * @param currentMonth A boolean indicating whether the month cell represents the current month.
 * @param colors The colors to be used for the month cell, including container, content, and indicator colors.
 * @param onMonthClick A callback function that is invoked when the month cell is clicked.
 * @param modifier The modifier to be applied to the composable.
 */
@Composable
internal fun DatePickerDialogMonthCell(
    month: String,
    index: Int,
    enabled: Boolean,
    selected: Boolean,
    currentMonth: Boolean,
    colors: DatePickerMonthCellColors,
    onMonthClick: (Int) -> Unit,
    modifier: Modifier = Modifier
) {

    val textStyle = when {
        selected -> PersianTheme.typography.bodyMedium

        currentMonth -> PersianTheme.typography.labelLarge

        else -> PersianTheme.typography.bodyMedium
    }

    Column(
        modifier = modifier
            .background(
                color = colors.containerColor(selected = selected).value,
                shape = PersianTheme.shapes.shape12
            )
            .clip(PersianTheme.shapes.shape12)
            .clickable(enabled = enabled) { onMonthClick(index) }
            .padding(
                horizontal = PersianTheme.spacing.size4,
                vertical = PersianTheme.spacing.size8
            ),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = month,
            style = textStyle,
            color = colors.contentColor(selected = selected, enabled = enabled).value
        )
        Box(
            modifier = Modifier
                .padding(
                    top = PersianTheme.spacing.size2,
                    start = PersianTheme.spacing.size12,
                    end = PersianTheme.spacing.size12
                )
                .fillMaxWidth()
                .height(2.dp)
                .background(
                    color = colors.indicatorColor(selected = selected, currentMonth).value,
                    shape = PersianTheme.shapes.shape4
                )
        )
    }
}