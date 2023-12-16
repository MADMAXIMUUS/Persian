package io.github.madmaximuus.persian.datePickerDIalog.cells

import android.icu.util.Calendar
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.datePickerDIalog.util.DatePickerDayData
import io.github.madmaximuus.persian.datePickerDIalog.util.equal
import io.github.madmaximuus.persian.foundation.PersianStatesDisabled
import io.github.madmaximuus.persian.foundation.extendedColorScheme
import io.github.madmaximuus.persian.foundation.spacing
import java.text.SimpleDateFormat
import java.util.Locale

@Composable
internal fun PersianDatePickerDialogDayCell(
    dateData: DatePickerDayData,
    modifier: Modifier = Modifier,
    onDateClick: (Calendar) -> Unit = {}
) {

    val today = dateData.date.equal(
        Calendar.getInstance().apply {
            firstDayOfWeek = Calendar.MONDAY
        }
    )

    val defaultShape = MaterialTheme.shapes.medium

    val shape = when {

        dateData.selectedStart -> defaultShape.copy(
            topEnd = CornerSize(0.dp),
            bottomEnd = CornerSize(0.dp)
        )

        dateData.selectedEnd -> defaultShape.copy(
            topStart = CornerSize(0.dp),
            bottomStart = CornerSize(0.dp)
        )

        dateData.selectedBetween -> RoundedCornerShape(0)
        else -> defaultShape
    }

    val backgroundColor = when {
        dateData.selectedBetween -> MaterialTheme.extendedColorScheme.primary.copy(
            PersianStatesDisabled
        )

        else -> MaterialTheme.extendedColorScheme.primary
    }

    val textStyle = when {
        dateData.selected && !dateData.selectedBetween -> MaterialTheme.typography.bodyMedium.copy(
            color = MaterialTheme.extendedColorScheme.onPrimary
        )

        today -> MaterialTheme.typography.labelLarge.copy(
            color = MaterialTheme.extendedColorScheme.onSurface
        )

        else -> MaterialTheme.typography.bodyMedium.copy(
            color = MaterialTheme.extendedColorScheme.onSurface
        )
    }

    val lineColor = when {
        dateData.selectedBetween && today -> MaterialTheme.extendedColorScheme.primary
        (dateData.selected || dateData.selectedStart || dateData.selectedEnd) && today -> MaterialTheme.extendedColorScheme.onPrimary
        today -> MaterialTheme.extendedColorScheme.primary
        else -> Color.Transparent
    }

    val baseModifier = modifier
        .clip(shape)
        .clickable(enabled = !dateData.otherMonth && !dateData.disabledPassively) {
            dateData.date?.let {
                onDateClick(it)
            }
        }
        .padding(
            horizontal = MaterialTheme.spacing.extraSmall,
            vertical = MaterialTheme.spacing.small
        )

    val selectedModifier = modifier
        .background(color = backgroundColor, shape = shape)
        .clip(shape)
        .clickable(enabled = !dateData.otherMonth && !dateData.disabledPassively) {
            dateData.date?.let {
                onDateClick(it)
            }
        }
        .padding(
            horizontal = MaterialTheme.spacing.extraSmall,
            vertical = MaterialTheme.spacing.small
        )

    val dayFormat = SimpleDateFormat("d", Locale.getDefault())
    val day = if (dateData.otherMonth) ""
    else dateData.date?.timeInMillis?.let { dayFormat.format(it) } ?: ""

    Column(
        modifier = when {
            (dateData.selected || dateData.selectedStart || dateData.selectedEnd || dateData.selectedBetween) -> selectedModifier
            else -> baseModifier
        },
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = day,
            style = textStyle,
        )
        Box(
            modifier = Modifier
                .padding(
                    top = MaterialTheme.spacing.extraExtraSmall,
                    start = MaterialTheme.spacing.small,
                    end = MaterialTheme.spacing.small
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