package io.github.madmaximuus.persian.datePicker.view.cells

import android.content.res.Configuration
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.datePicker.view.DatePickerYearCellColors
import io.github.madmaximuus.persian.datePicker.view.PersianDatePickerViewDefaults
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.surface.Surface
import io.github.madmaximuus.persian.text.Text

@Composable
internal fun PersianDatePickerDialogYearCell(
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

@Preview
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun DayCellPreview() {
    PersianTheme {
        Surface {
            PersianDatePickerDialogYearCell(
                year = "2024",
                index = 0,
                selected = true,
                currentYear = false,
                colors = PersianDatePickerViewDefaults.yearCellColors(),
                onYearClick = {}
            )
        }
    }
}