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
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.datePicker.view.DatePickerYearCellColors
import io.github.madmaximuus.persian.datePicker.view.PersianDatePickerViewDefaults
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.shape
import io.github.madmaximuus.persian.foundation.spacing

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
        selected -> MaterialTheme.typography.bodyMedium

        currentYear -> MaterialTheme.typography.labelLarge

        else -> MaterialTheme.typography.bodyMedium
    }

    Column(
        modifier = modifier
            .background(
                color = colors.containerColor(selected = selected).value,
                shape = MaterialTheme.shape.shape12
            )
            .clip(MaterialTheme.shape.shape12)
            .clickable { onYearClick(index) }
            .padding(
                horizontal = MaterialTheme.spacing.extraSmall,
                vertical = MaterialTheme.spacing.small
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
                    top = MaterialTheme.spacing.extraExtraSmall,
                    start = MaterialTheme.spacing.medium,
                    end = MaterialTheme.spacing.medium
                )
                .fillMaxWidth()
                .height(2.dp)
                .background(
                    color = colors.indicatorColor(selected = selected, currentYear).value,
                    shape = MaterialTheme.shape.shape4
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