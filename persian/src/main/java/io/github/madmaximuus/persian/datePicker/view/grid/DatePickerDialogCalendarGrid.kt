package io.github.madmaximuus.persian.datePicker.view.grid

import android.icu.util.Calendar
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.material3.adaptive.currentWindowAdaptiveInfo
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.window.core.layout.WindowHeightSizeClass
import io.github.madmaximuus.persian.datePicker.view.DatePickerDayCellColors
import io.github.madmaximuus.persian.datePicker.view.DatePickerDayOfWeekCellColors
import io.github.madmaximuus.persian.datePicker.view.cells.DatePickerDialogDayCell
import io.github.madmaximuus.persian.datePicker.view.cells.DatePickerDialogWeekLabelCell
import io.github.madmaximuus.persian.datePicker.view.state.DatePickerGridState
import io.github.madmaximuus.persian.datePicker.view.util.Constants
import io.github.madmaximuus.persian.datePicker.view.util.DatePickerConfig
import io.github.madmaximuus.persian.datePicker.view.util.DatePickerDayData
import io.github.madmaximuus.persian.datePicker.view.util.DatePickerSelection
import io.github.madmaximuus.persian.datePicker.view.util.calcCalendarDateData
import io.github.madmaximuus.persian.datePicker.view.util.findDayOffset
import io.github.madmaximuus.persian.datePicker.view.util.getDaysInMonth

@Composable
internal fun DatePickerDialogCalendarGrid(
    pagerState: PagerState,
    config: DatePickerConfig,
    weekLabels: Array<String>,
    data: List<DatePickerGridState>,
    currentPosition: Int,
    selection: DatePickerSelection,
    selectedDate: Calendar?,
    selectedDates: List<Calendar>?,
    selectedRange: Pair<Calendar?, Calendar?>,
    dayCellColors: DatePickerDayCellColors,
    dayOfWeekCellColors: DatePickerDayOfWeekCellColors,
    onDateClick: (Calendar) -> Unit
) {
    val calendar = data[currentPosition].calendar.apply {
        set(Calendar.DAY_OF_MONTH, 1)
    }
    val days = getDaysInMonth(calendar.get(Calendar.MONTH), calendar.get(Calendar.YEAR))
    val offset = findDayOffset(calendar.get(Calendar.DAY_OF_WEEK), Calendar.MONDAY)

    val windowHeightSizeClass = currentWindowAdaptiveInfo().windowSizeClass.windowHeightSizeClass
    val arrangement =
        if (windowHeightSizeClass == WindowHeightSizeClass.COMPACT) Arrangement.spacedBy(0.dp)
        else Arrangement.SpaceEvenly

    HorizontalPager(
        state = pagerState
    ) {
        LazyVerticalGrid(
            columns = GridCells.Fixed(Constants.CALENDAR_MODE_GRID_COLUMNS),
            userScrollEnabled = false,
            horizontalArrangement = arrangement,
            content = {
                items(weekLabels) {
                    DatePickerDialogWeekLabelCell(
                        label = it,
                        colors = dayOfWeekCellColors
                    )
                }
                items(offset) {
                    DatePickerDialogDayCell(
                        dateData = DatePickerDayData(otherMonth = true),
                        colors = dayCellColors
                    )
                }
                items(days) {
                    val date = Calendar.getInstance().apply {
                        firstDayOfWeek = Calendar.MONDAY
                        set(Calendar.DAY_OF_MONTH, it.plus(1))
                        set(Calendar.MONTH, data[currentPosition].month)
                        set(Calendar.YEAR, data[currentPosition].year)
                    }

                    val dateData = calcCalendarDateData(
                        date = date,
                        calendarViewData = data[currentPosition],
                        selection = selection,
                        config = config,
                        selectedDate = selectedDate,
                        selectedDates = selectedDates,
                        selectedRange = selectedRange
                    ) ?: return@items

                    DatePickerDialogDayCell(
                        dateData = dateData,
                        onDateClick = onDateClick,
                        colors = dayCellColors
                    )
                }
            }
        )
    }
}