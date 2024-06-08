package io.github.madmaximuus.persian.datePicker.view

import android.icu.util.Calendar
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringArrayResource
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.R
import io.github.madmaximuus.persian.datePicker.view.grid.PersianDatePickerDialogCalendarGrid
import io.github.madmaximuus.persian.datePicker.view.grid.PersianDatePickerDialogMonthGrid
import io.github.madmaximuus.persian.datePicker.view.grid.PersianDatePickerDialogRootGrid
import io.github.madmaximuus.persian.datePicker.view.grid.PersianDatePickerDialogYearGrid
import io.github.madmaximuus.persian.datePicker.view.header.PersianDatePickerDialogHeader
import io.github.madmaximuus.persian.datePicker.view.state.DatePickerState
import io.github.madmaximuus.persian.datePicker.view.util.DatePickerConfig
import io.github.madmaximuus.persian.datePicker.view.util.DatePickerDisplayMode
import io.github.madmaximuus.persian.datePicker.view.util.endValue
import io.github.madmaximuus.persian.datePicker.view.util.monthBetween
import io.github.madmaximuus.persian.datePicker.view.util.startValue
import io.github.madmaximuus.persian.foundation.spacing

@OptIn(ExperimentalFoundationApi::class)
@Composable
internal fun PersianDatePickerView(
    state: DatePickerState,
    modifier: Modifier = Modifier,
    colors: DatePickerViewColors = PersianDatePickerViewDefaults.colors(),
    config: DatePickerConfig = DatePickerConfig(),
    onSelection: (Calendar) -> Unit
) {

    val weekLabels = stringArrayResource(id = R.array.week_day_labels)
    val monthLabels = stringArrayResource(id = R.array.months)

    val monthCount = monthBetween(config.boundary)

    val initPage = state.currentPosition

    val pagerState = rememberPagerState(
        initialPage = initPage
    ) {
        monthCount
    }

    val yearListState = rememberLazyGridState()

    LaunchedEffect(state.mode, state.currentPosition) {
        if (state.mode == DatePickerDisplayMode.YEAR) {
            yearListState.scrollToItem(state.yearIndex)
        }
        pagerState.scrollToPage(state.currentPosition)
    }

    val cameraDate = state.pages[state.currentPosition].calendar
    val baseModifier = modifier
        .widthIn(max = 480.dp)
        .heightIn(max = 400.dp)
        .fillMaxWidth()
        .wrapContentHeight()
        .animateContentSize()
        .padding(MaterialTheme.spacing.size12)

    Column(
        modifier = baseModifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.size4)
    ) {
        PersianDatePickerDialogHeader(
            selectable = config.selectable,
            isPrevDisabled = state.isPrevDisabled,
            navigationDisabled = state.mode != DatePickerDisplayMode.CALENDAR,
            isNextDisabled = state.isNextDisabled,
            mode = state.mode,
            date = cameraDate,
            onNextClick = state::onNext,
            onPrevClick = state::onPrevious,
            onMonthClick = state::onMonthSelectionClick,
            onYearClick = state::onYearSelectionClick,
            colors = colors.headerColors
        )
        PersianDatePickerDialogRootGrid(
            mode = state.mode,
            calendarGrid = {
                PersianDatePickerDialogCalendarGrid(
                    weekLabels = weekLabels,
                    config = config,
                    pagerState = pagerState,
                    data = state.pages.toList(),
                    selection = state.selection,
                    currentPosition = state.currentPosition,
                    selectedDate = state.date.value,
                    selectedDates = state.dates,
                    selectedRange = Pair(
                        state.range.startValue,
                        state.range.endValue
                    ),
                    onDateClick = onSelection,
                    dayCellColors = colors.datePickerGridColors.dayPickerDayCellColors,
                    dayOfWeekCellColors = colors.datePickerGridColors.dayOfWeekLabelColors
                )
            },
            monthGrid = {
                PersianDatePickerDialogMonthGrid(
                    monthLabels = monthLabels,
                    currentMonth = state.today.get(Calendar.MONTH),
                    selectedMonth = state.pages[state.currentPosition].month,
                    onMonthClick = state::onMonthClick,
                    colors = colors.datePickerGridColors.dayPickerMonthCellColors
                )
            },
            yearGrid = {
                PersianDatePickerDialogYearGrid(
                    yearsRange = state.yearsRange,
                    yearListState = yearListState,
                    selectedYear = state.pages[state.currentPosition].year,
                    currentYear = state.today.get(Calendar.YEAR),
                    onYearClick = state::onYearClick,
                    colors = colors.datePickerGridColors.dayPickerYearCellColors
                )
            }
        )
    }
}