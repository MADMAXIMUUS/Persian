package io.github.madmaximuus.persian.datePickerDIalog.grid

import android.icu.util.Calendar
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.runtime.Composable
import io.github.madmaximuus.persian.datePickerDIalog.cells.PersianDatePickerDialogDayCell
import io.github.madmaximuus.persian.datePickerDIalog.cells.PersianDatePickerDialogWeekLabelCell
import io.github.madmaximuus.persian.datePickerDIalog.state.DatePickerGridState
import io.github.madmaximuus.persian.datePickerDIalog.util.Constants
import io.github.madmaximuus.persian.datePickerDIalog.util.DatePickerConfig
import io.github.madmaximuus.persian.datePickerDIalog.util.DatePickerDayData
import io.github.madmaximuus.persian.datePickerDIalog.util.DatePickerSelection
import io.github.madmaximuus.persian.datePickerDIalog.util.calcCalendarDateData
import io.github.madmaximuus.persian.datePickerDIalog.util.findDayOffset
import io.github.madmaximuus.persian.datePickerDIalog.util.getDaysInMonth

internal object PersianDatePickerDialogCalendarGrid {

    @OptIn(ExperimentalFoundationApi::class)
    @Composable
    fun Primary(
        pagerState: PagerState,
        config: DatePickerConfig,
        weekLabels: Array<String>,
        data: List<DatePickerGridState>,
        currentPosition: Int,
        selection: DatePickerSelection,
        selectedDate: Calendar?,
        selectedDates: List<Calendar>?,
        selectedRange: Pair<Calendar?, Calendar?>,
        onDateClick: (Calendar) -> Unit
    ) {
        val calendar = data[currentPosition].calendar
        val days = getDaysInMonth(calendar.get(Calendar.MONTH), calendar.get(Calendar.YEAR))
        val offset = findDayOffset(calendar.get(Calendar.DAY_OF_WEEK), Calendar.MONDAY)

        HorizontalPager(
            state = pagerState
        ) {
            LazyVerticalGrid(
                columns = GridCells.Fixed(Constants.CALENDAR_MODE_GRID_COLUMNS),
                userScrollEnabled = false,
                horizontalArrangement = Arrangement.SpaceEvenly,
                content = {
                    items(weekLabels) {
                        PersianDatePickerDialogWeekLabelCell.Primary(
                            label = it
                        )
                    }
                    items(offset) {
                        PersianDatePickerDialogDayCell.Primary(
                            dateData = DatePickerDayData(otherMonth = true)
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

                        PersianDatePickerDialogDayCell.Primary(
                            dateData = dateData,
                            onDateClick = onDateClick
                        )
                    }
                }
            )
        }
    }
}