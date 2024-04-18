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
import io.github.madmaximuus.persian.datePicker.view.DatePickerMonthCellColors
import io.github.madmaximuus.persian.datePicker.view.PersianDatePickerViewDefaults
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.shape
import io.github.madmaximuus.persian.foundation.spacing

@Composable
internal fun PersianDatePickerDialogMonthCell(
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
        selected -> MaterialTheme.typography.bodyMedium

        currentMonth -> MaterialTheme.typography.labelLarge

        else -> MaterialTheme.typography.bodyMedium
    }

    Column(
        modifier = modifier
            .background(
                color = colors.containerColor(selected = selected).value,
                shape = MaterialTheme.shape.shape12
            )
            .clip(MaterialTheme.shape.shape12)
            .clickable(enabled = enabled) { onMonthClick(index) }
            .padding(
                horizontal = MaterialTheme.spacing.extraSmall,
                vertical = MaterialTheme.spacing.small
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
                    top = MaterialTheme.spacing.extraExtraSmall,
                    start = MaterialTheme.spacing.medium,
                    end = MaterialTheme.spacing.medium
                )
                .fillMaxWidth()
                .height(2.dp)
                .background(
                    color = colors.indicatorColor(selected = selected, currentMonth).value,
                    shape = MaterialTheme.shapes.extraSmall
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
            PersianDatePickerDialogMonthCell(
                month = "January",
                index = 0,
                enabled = true,
                selected = false,
                currentMonth = true,
                colors = PersianDatePickerViewDefaults.monthCellColors(),
                onMonthClick = {}
            )
        }
    }
}