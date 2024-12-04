package io.github.madmaximuus.persian.datePicker.view.cells

import android.icu.util.Calendar
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.adaptive.currentWindowAdaptiveInfo
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.window.core.layout.WindowHeightSizeClass
import io.github.madmaximuus.persian.datePicker.view.DatePickerDayCellColors
import io.github.madmaximuus.persian.datePicker.view.util.DatePickerDayData
import io.github.madmaximuus.persian.datePicker.view.util.equal
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.text.Text
import java.text.SimpleDateFormat
import java.util.Locale

/**
 * A composable function that represents a day cell in a date picker dialog.
 *
 * @param dateData The data representing the day, including date, selection status, and other properties.
 * @param modifier The modifier to be applied to the composable.
 * @param colors The colors to be used for the day cell, including container, content, and indicator colors.
 * @param onDateClick A callback function that is invoked when the day cell is clicked.
 */
@Composable
internal fun DatePickerDialogDayCell(
    dateData: DatePickerDayData,
    modifier: Modifier = Modifier,
    colors: DatePickerDayCellColors,
    onDateClick: (Calendar) -> Unit = {}
) {

    val today = dateData.date.equal(
        Calendar.getInstance().apply {
            firstDayOfWeek = Calendar.MONDAY
        }
    )

    val defaultShape = PersianTheme.shapes.shape12

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

    val textStyle = when {
        dateData.selected && !dateData.selectedBetween -> PersianTheme.typography.bodyMedium

        today -> PersianTheme.typography.labelLarge

        else -> PersianTheme.typography.bodyMedium
    }

    val dayFormat = SimpleDateFormat("d", Locale.getDefault())
    val day = if (dateData.otherMonth) ""
    else dateData.date?.timeInMillis?.let { dayFormat.format(it) } ?: ""

    val windowHeightSizeClass = currentWindowAdaptiveInfo().windowSizeClass.windowHeightSizeClass
    val sizeModifier =
        if (windowHeightSizeClass == WindowHeightSizeClass.COMPACT) modifier.size(34.dp)
        else modifier

    val baseModifier = sizeModifier
        .aspectRatio(1f, true)
        .background(
            color = colors.containerColor(
                selected = dateData.selected || dateData.selectedStart || dateData.selectedEnd,
                between = dateData.selectedBetween
            ).value, shape = shape
        )
        .clip(shape)
        .clickable(enabled = !dateData.otherMonth && !dateData.disabledPassively) {
            dateData.date?.let {
                onDateClick(it)
            }
        }

    Column(
        modifier = baseModifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = day,
            style = textStyle,
            color = colors.contentColor(
                selected = dateData.selected || dateData.selectedStart || dateData.selectedEnd,
                between = dateData.selectedBetween,
                enabled = !dateData.disabledPassively
            ).value
        )
        Box(
            modifier = Modifier
                .padding(
                    top = PersianTheme.spacing.size2,
                    start = PersianTheme.spacing.size8,
                    end = PersianTheme.spacing.size8
                )
                .fillMaxWidth()
                .height(2.dp)
                .background(
                    color = colors.indicatorColor(
                        selected = dateData.selected || dateData.selectedStart || dateData.selectedEnd,
                        between = dateData.selectedBetween,
                        today = today
                    ).value,
                    shape = PersianTheme.shapes.shape4
                )
        )
    }
}