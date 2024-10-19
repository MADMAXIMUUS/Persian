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
import io.github.madmaximuus.persian.datePicker.view.DatePickerYearCellColors
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.text.Text

/**
 * A composable function that represents a year cell in a Persian date picker dialog.
 *
 * @param year The year to be displayed.
 * @param index The index of the year in the list of years.
 * @param currentYear A boolean indicating whether the year cell represents the current year.
 * @param selected A boolean indicating whether the year cell is selected.
 * @param colors The colors to be used for the year cell, including container, content, and indicator colors.
 * @param onYearClick A callback function that is invoked when the year cell is clicked.
 * @param modifier The modifier to be applied to the composable.
 */
@Composable
internal fun DatePickerDialogYearCell(
    year: String,
    index: Int,
    currentYear: Boolean,
    selected: Boolean,
    colors: DatePickerYearCellColors,
    onYearClick: (Int) -> Unit,
    modifier: Modifier = Modifier,
) {

    val textStyle = when {
        selected -> PersianTheme.typography.bodyMedium

        currentYear -> PersianTheme.typography.labelLarge

        else -> PersianTheme.typography.bodyMedium
    }

    Column(
        modifier = modifier
            .background(
                color = colors.containerColor(selected = selected).value,
                shape = PersianTheme.shapes.shape12
            )
            .clip(PersianTheme.shapes.shape12)
            .clickable { onYearClick(index) }
            .padding(
                horizontal = PersianTheme.spacing.size4,
                vertical = PersianTheme.spacing.size8
            ),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = year,
            style = textStyle,
            color = colors.contentColor(selected = selected).value
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
                    color = colors.indicatorColor(selected = selected, currentYear).value,
                    shape = PersianTheme.shapes.shape4
                )
        )
    }
}