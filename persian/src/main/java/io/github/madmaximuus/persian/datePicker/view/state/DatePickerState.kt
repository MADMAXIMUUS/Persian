package io.github.madmaximuus.persian.datePicker.view.state

import android.icu.util.Calendar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.Saver
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import io.github.madmaximuus.persian.datePicker.view.util.DatePickerConfig
import io.github.madmaximuus.persian.datePicker.view.util.DatePickerDisplayMode
import io.github.madmaximuus.persian.datePicker.view.util.DatePickerSelection
import io.github.madmaximuus.persian.datePicker.view.util.calcMonthData
import io.github.madmaximuus.persian.datePicker.view.util.contain
import io.github.madmaximuus.persian.datePicker.view.util.dateValue
import io.github.madmaximuus.persian.datePicker.view.util.datesValue
import io.github.madmaximuus.persian.datePicker.view.util.endValue
import io.github.madmaximuus.persian.datePicker.view.util.equal
import io.github.madmaximuus.persian.datePicker.view.util.getInitialPageFrom
import io.github.madmaximuus.persian.datePicker.view.util.getPageFromDay
import io.github.madmaximuus.persian.datePicker.view.util.isAfter
import io.github.madmaximuus.persian.datePicker.view.util.rangeValue
import io.github.madmaximuus.persian.datePicker.view.util.startValue
import java.io.Serializable
import java.util.Timer
import kotlin.concurrent.schedule

internal class DatePickerState(
    val selection: DatePickerSelection,
    val config: DatePickerConfig,
    stateData: CalendarStateData? = null,
) {
    var mode by mutableStateOf(stateData?.mode ?: DatePickerDisplayMode.CALENDAR)
    var currentPosition by mutableIntStateOf(
        stateData?.currentPosition ?: selection.getInitialPageFrom(config)
    )
    val today: Calendar = Calendar.getInstance().apply {
        firstDayOfWeek = Calendar.MONDAY
    }
    var pages by mutableStateOf(stateData?.pages ?: emptyArray())
    var date = mutableStateOf(stateData?.date ?: selection.dateValue)
    var dates = mutableStateListOf(*(stateData?.dates ?: selection.datesValue))
    var range = mutableStateListOf(*(stateData?.range ?: selection.rangeValue))
    var isRangeSelectionStart by mutableStateOf(stateData?.rangeSelectionStart ?: true)
    var yearsRange by mutableStateOf(getInitYearsRange())
    private var valid by mutableStateOf(isValid())

    init {
        checkSetup()
        currentPosition = getPageFromDay(
            config.boundary,
            when (selection) {
                is DatePickerSelection.Date -> selection.dateValue ?: Calendar.getInstance().apply {
                    firstDayOfWeek = Calendar.MONDAY
                }

                is DatePickerSelection.Dates -> {
                    if (selection.datesValue.isEmpty())
                        Calendar.getInstance().apply { firstDayOfWeek = Calendar.MONDAY }
                    else selection.datesValue.first()
                }

                is DatePickerSelection.Period -> {
                    if (selection.rangeValue.isEmpty())
                        Calendar.getInstance().apply { firstDayOfWeek = Calendar.MONDAY }
                    else selection.rangeValue.first() ?: Calendar.getInstance()
                        .apply { firstDayOfWeek = Calendar.MONDAY }
                }
            }

        )
        pages = calcMonthData(config).toTypedArray()
    }

    private fun checkSetup() {
        val selection = mutableListOf<Calendar>()
        when (this.selection) {
            is DatePickerSelection.Date -> date.value?.let { selection.add(it) }
            is DatePickerSelection.Dates -> selection.addAll(dates)
            is DatePickerSelection.Period -> {
                range.startValue?.let { selection.add(it) }
                range.endValue?.let { selection.add(it) }
            }
        }

        if (selection.any { it !in config.boundary }) {
            throw IllegalStateException("Please correct your setup. Your selection is out of the provided boundary.")
        }
    }

    private fun getInitYearsRange(): ClosedRange<Int> =
        config.boundary.start.get(Calendar.YEAR)..config.boundary.endInclusive.get(Calendar.YEAR)

    private fun checkValid() {
        valid = isValid()
    }

    private fun isValid(): Boolean = when (selection) {
        is DatePickerSelection.Date -> date.value != null
        is DatePickerSelection.Dates -> dates.isNotEmpty()
        is DatePickerSelection.Period -> range.startValue != null && range.endValue != null
    }

    val isPrevDisabled: Boolean
        get() = currentPosition == 0

    val isNextDisabled: Boolean
        get() = currentPosition == pages.size - 1

    val yearIndex: Int
        get() = pages[currentPosition].year - yearsRange.start

    fun onPrevious() {
        currentPosition--
    }

    fun onNext() {
        currentPosition++
    }

    fun onMonthSelectionClick() {
        mode = when (mode) {
            DatePickerDisplayMode.MONTH -> DatePickerDisplayMode.CALENDAR
            DatePickerDisplayMode.YEAR -> DatePickerDisplayMode.MONTH
            else -> DatePickerDisplayMode.MONTH
        }
    }

    fun onYearSelectionClick() {
        mode = when (mode) {
            DatePickerDisplayMode.YEAR -> DatePickerDisplayMode.CALENDAR
            DatePickerDisplayMode.MONTH -> DatePickerDisplayMode.YEAR
            else -> DatePickerDisplayMode.YEAR
        }
    }

    fun onMonthClick(month: Int) {
        val currentMonth = pages[currentPosition].month
        val diffMonth = currentMonth - month
        currentPosition -= diffMonth
        //Fix state issues
        Timer().schedule(30) {
            mode = DatePickerDisplayMode.CALENDAR
        }
    }

    fun onYearClick(year: Int) {
        val diffYear = yearIndex - year
        val diffMonth = 12 * diffYear
        currentPosition -= diffMonth
        //Fix state issues
        Timer().schedule(80) {
            mode = DatePickerDisplayMode.CALENDAR
        }
    }

    fun processSelection(newDate: Calendar) {
        when (selection) {
            is DatePickerSelection.Date -> {
                date.value = newDate
            }

            is DatePickerSelection.Dates -> {
                if (dates.contain(newDate)) {
                    dates.removeAll { it.equal(newDate) }
                } else {
                    dates.add(newDate)
                }
            }

            is DatePickerSelection.Period -> {
                val beforeStart =
                    range.startValue?.let { newDate.before(it) } ?: false
                val containsDisabledDate = range.endValue?.let { startDate ->
                    config.boundary.start.isAfter(startDate)
                            && config.boundary.endInclusive.isAfter(newDate)
                } ?: false
                if (isRangeSelectionStart || beforeStart || containsDisabledDate) {
                    range[0] = newDate
                    range[1] = null
                    isRangeSelectionStart = false
                } else {
                    range[1] = newDate
                    isRangeSelectionStart = true
                }
            }
        }
        checkValid()
    }

    fun onFinish() {
        when (selection) {
            is DatePickerSelection.Date -> selection.onDateSelected(date.value ?: today)
            is DatePickerSelection.Dates -> selection.onDatesSelected(dates.sorted())
            is DatePickerSelection.Period -> selection.onRangeSelected(
                range.startValue ?: Calendar.getInstance().apply {
                    firstDayOfWeek = Calendar.MONDAY
                },
                range.endValue ?: Calendar.getInstance().apply {
                    firstDayOfWeek = Calendar.MONDAY
                }
            )
        }
    }

    companion object {
        fun Saver(
            selection: DatePickerSelection,
            config: DatePickerConfig
        ): Saver<DatePickerState, *> = Saver(
            save = { state ->
                CalendarStateData(
                    mode = state.mode,
                    pages = state.pages,
                    currentPosition = state.currentPosition,
                    date = state.date.value,
                    dates = state.dates.toTypedArray(),
                    range = state.range.toTypedArray(),
                    rangeSelectionStart = state.isRangeSelectionStart
                )
            },
            restore = { data ->
                DatePickerState(selection, config, data)
            }
        )
    }

    internal data class CalendarStateData(
        val mode: DatePickerDisplayMode,
        val pages: Array<DatePickerGridState>,
        val currentPosition: Int,
        val date: Calendar?,
        val dates: Array<Calendar>,
        val range: Array<Calendar?>,
        val rangeSelectionStart: Boolean
    ) : Serializable {

        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (javaClass != other?.javaClass) return false

            other as CalendarStateData

            if (mode != other.mode) return false
            if (pages.contentEquals(other.pages)) return false
            if (currentPosition != other.currentPosition) return false
            if (date != other.date) return false
            if (!dates.contentEquals(other.dates)) return false
            if (!range.contentEquals(other.range)) return false
            return rangeSelectionStart == other.rangeSelectionStart
        }

        override fun hashCode(): Int {
            var result = mode.hashCode()
            result = 31 * result + pages.contentHashCode()
            result = 31 * result + currentPosition.hashCode()
            result = 31 * result + (date?.hashCode() ?: 0)
            result = 31 * result + dates.contentHashCode()
            result = 31 * result + range.contentHashCode()
            result = 31 * result + rangeSelectionStart.hashCode()
            return result
        }
    }
}

@Composable
internal fun rememberDatePickerState(
    selection: DatePickerSelection,
    config: DatePickerConfig,
): DatePickerState = rememberSaveable(
    inputs = arrayOf(selection, config),
    saver = DatePickerState.Saver(selection, config),
    init = { DatePickerState(selection, config) }
)