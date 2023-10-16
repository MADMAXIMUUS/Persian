package io.github.madmaximuus.persian.datePickerDIalog

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.icu.util.Calendar
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringArrayResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import io.github.madmaximuus.persian.R
import io.github.madmaximuus.persian.buttons.PersianButton
import io.github.madmaximuus.persian.datePickerDIalog.grid.PersianDatePickerDialogCalendarGrid
import io.github.madmaximuus.persian.datePickerDIalog.grid.PersianDatePickerDialogMonthGrid
import io.github.madmaximuus.persian.datePickerDIalog.grid.PersianDatePickerDialogRootGrid
import io.github.madmaximuus.persian.datePickerDIalog.grid.PersianDatePickerDialogYearGrid
import io.github.madmaximuus.persian.datePickerDIalog.header.PersianDatePickerDialogHeader
import io.github.madmaximuus.persian.datePickerDIalog.state.rememberDatePickerState
import io.github.madmaximuus.persian.datePickerDIalog.util.DatePickerConfig
import io.github.madmaximuus.persian.datePickerDIalog.util.DatePickerDisplayMode
import io.github.madmaximuus.persian.datePickerDIalog.util.DatePickerSelection
import io.github.madmaximuus.persian.datePickerDIalog.util.endValue
import io.github.madmaximuus.persian.datePickerDIalog.util.getPageFromDay
import io.github.madmaximuus.persian.datePickerDIalog.util.monthBetween
import io.github.madmaximuus.persian.datePickerDIalog.util.startValue
import io.github.madmaximuus.persian.dividers.PersianHorizontalDividers
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.elevation
import io.github.madmaximuus.persian.foundation.extendedColorScheme
import io.github.madmaximuus.persian.foundation.spacing

object PersianDatePickerDialog {

    @OptIn(ExperimentalFoundationApi::class)
    @Composable
    fun Primary(
        selection: DatePickerSelection,
        modifier: Modifier = Modifier,
        config: DatePickerConfig = DatePickerConfig(),
        onDismissRequest: () -> Unit,
    ) {

        val datePickerState = rememberDatePickerState(selection, config)
        val onSelection: (Calendar) -> Unit = {
            datePickerState.processSelection(it)
        }

        val weekLabels = stringArrayResource(id = R.array.week_day_labels)
        val monthLabels = stringArrayResource(id = R.array.months)

        val monthCount = monthBetween(config.boundary)

        val initPage = getPageFromDay(config.boundary, Calendar.getInstance().apply {
            firstDayOfWeek = Calendar.MONDAY
        })

        val pagerState = rememberPagerState(
            initialPage = initPage
        ) {
            monthCount
        }

        val yearListState = rememberLazyGridState()

        LaunchedEffect(datePickerState.mode, datePickerState.currentPosition) {
            if (datePickerState.mode == DatePickerDisplayMode.YEAR) {
                yearListState.scrollToItem(datePickerState.yearIndex)
            }
            pagerState.scrollToPage(datePickerState.currentPosition)
        }

        val cameraDate = datePickerState.pages[datePickerState.currentPosition].calendar

        Dialog(
            properties = DialogProperties(
                usePlatformDefaultWidth = false,
                decorFitsSystemWindows = false
            ),
            onDismissRequest = onDismissRequest
        ) {
            Surface(
                modifier = modifier
                    .widthIn(max = 480.dp)
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(MaterialTheme.spacing.extraExtraLarge),
                shape = MaterialTheme.shapes.extraLarge,
                color = MaterialTheme.extendedColorScheme.surface,
                tonalElevation = MaterialTheme.elevation.small,
                shadowElevation = 0.dp,
                content = {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentHeight()
                            .animateContentSize(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .wrapContentHeight()
                                .heightIn(max = 400.dp)
                                .padding(MaterialTheme.spacing.medium),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.extraSmall)
                        ) {
                            PersianDatePickerDialogHeader.Primary(
                                selectable = config.selectable,
                                isPrevDisabled = datePickerState.isPrevDisabled,
                                navigationDisabled = datePickerState.mode != DatePickerDisplayMode.CALENDAR,
                                isNextDisabled = datePickerState.isNextDisabled,
                                mode = datePickerState.mode,
                                date = cameraDate,
                                onNextClick = datePickerState::onNext,
                                onPrevClick = datePickerState::onPrevious,
                                onMonthClick = datePickerState::onMonthSelectionClick,
                                onYearClick = datePickerState::onYearSelectionClick
                            )
                            PersianDatePickerDialogRootGrid.Primary(
                                mode = datePickerState.mode,
                                calendarGrid = {
                                    PersianDatePickerDialogCalendarGrid.Primary(
                                        weekLabels = weekLabels,
                                        config = config,
                                        pagerState = pagerState,
                                        data = datePickerState.pages.toList(),
                                        selection = selection,
                                        currentPosition = datePickerState.currentPosition,
                                        selectedDate = datePickerState.date.value,
                                        selectedDates = datePickerState.dates,
                                        selectedRange = Pair(
                                            datePickerState.range.startValue,
                                            datePickerState.range.endValue
                                        ),
                                        onDateClick = onSelection
                                    )
                                },
                                monthGrid = {
                                    PersianDatePickerDialogMonthGrid.Primary(
                                        monthLabels = monthLabels,
                                        currentMonth = datePickerState.today.get(Calendar.MONTH),
                                        selectedMonth = datePickerState.pages[datePickerState.currentPosition].month,
                                        onMonthClick = datePickerState::onMonthClick
                                    )
                                },
                                yearGrid = {
                                    PersianDatePickerDialogYearGrid.Primary(
                                        yearsRange = datePickerState.yearsRange,
                                        yearListState = yearListState,
                                        selectedYear = datePickerState.pages[datePickerState.currentPosition].year,
                                        currentYear = datePickerState.today.get(Calendar.YEAR),
                                        onYearClick = datePickerState::onYearClick
                                    )
                                }
                            )
                        }
                        AnimatedVisibility(
                            visible = datePickerState.mode == DatePickerDisplayMode.CALENDAR
                        ) {
                            PersianHorizontalDividers.Inset()
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(MaterialTheme.spacing.large),
                                horizontalArrangement = Arrangement.spacedBy(
                                    MaterialTheme.spacing.small,
                                    Alignment.End

                                )
                            ) {
                                PersianButton.Tertiary(
                                    text = "Cancel"
                                ) {
                                    onDismissRequest()
                                }
                                PersianButton.Tertiary(
                                    text = "OK"
                                ) {
                                    datePickerState.onFinish()
                                    onDismissRequest()
                                }
                            }
                        }
                    }
                }
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DatePickerPreview() {
    PersianTheme {
        Surface {
            PersianDatePickerDialog.Primary(
                selection = DatePickerSelection.Date(
                    onDateSelected = {

                    }
                ),
                onDismissRequest = {}
            )
        }
    }
}

@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_YES, showSystemUi = true)
@Composable
fun DatePickerDarkPreview() {
    PersianTheme {
        Surface {
            PersianDatePickerDialog.Primary(
                selection = DatePickerSelection.Date(
                    onDateSelected = {

                    }
                ),
                onDismissRequest = {}
            )
        }
    }
}