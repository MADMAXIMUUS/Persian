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

/**
 * A class that represents the state of a date picker.
 *
 * This class holds the state of the date picker, including the selection mode, configuration, current position,
 * pages, selected dates, and other relevant information. It provides methods to navigate through the date picker,
 * handle selections, and validate the state.
 *
 * @param selection The selection mode for the date picker.
 * @param config The configuration settings for the date picker.
 * @param stateData Optional initial state data for the date picker.
 */
internal class DatePickerState(
    val selection: DatePickerSelection,
    val config: DatePickerConfig,
    stateData: CalendarStateData? = null,
) {
    /**
     * The mode of the date picker display.
     *
     */
    var mode by mutableStateOf(stateData?.mode ?: DatePickerDisplayMode.CALENDAR)

    /**
     * Current page index based on month and year
     */
    var currentPosition by mutableIntStateOf(
        stateData?.currentPosition ?: selection.getInitialPageFrom(config)
    )

    /**
     * The current date representing today.
     */
    val today: Calendar = Calendar.getInstance().apply {
        firstDayOfWeek = Calendar.MONDAY
    }

    /**
     * The pages of the date picker.
     */
    var pages by mutableStateOf(stateData?.pages ?: emptyArray())

    /**
     * The selected date.
     */
    var date = mutableStateOf(stateData?.date ?: selection.dateValue)

    /**
     * The list of selected dates.
     */
    var dates = mutableStateListOf(*(stateData?.dates ?: selection.datesValue))

    /**
     * The range of selected dates.
     */
    var range = mutableStateListOf(*(stateData?.range ?: selection.rangeValue))

    /**
     * Indicates if the range selection is starting.
     */
    var isRangeSelectionStart by mutableStateOf(stateData?.rangeSelectionStart ?: true)

    /**
     * The range of years.
     */
    var yearsRange by mutableStateOf(getInitYearsRange())

    /**
     * Indicates if the current state is valid.
     */
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

    /**
     * Checks if the setup is correct.
     *
     * @throws IllegalStateException if the selection is out of the provided boundary.
     */
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

    /**
     * Gets the initial years range.
     */
    private fun getInitYearsRange(): ClosedRange<Int> =
        config.boundary.start.get(Calendar.YEAR)..config.boundary.endInclusive.get(Calendar.YEAR)

    /**
     * Checks if the current state is valid.
     */
    private fun checkValid() {
        valid = isValid()
    }

    /**
     * Checks if the current state is valid.
     */
    private fun isValid(): Boolean = when (selection) {
        is DatePickerSelection.Date -> date.value != null
        is DatePickerSelection.Dates -> dates.isNotEmpty()
        is DatePickerSelection.Period -> range.startValue != null && range.endValue != null
    }

    /**
     * Indicates if the previous button is disabled.
     */
    val isPrevDisabled: Boolean
        get() = currentPosition == 0

    /**
     * Indicates if the next button is disabled.
     */
    val isNextDisabled: Boolean
        get() = currentPosition == pages.size - 1

    /**
     * Gets the year index.
     */
    val yearIndex: Int
        get() = pages[currentPosition].year - yearsRange.start

    /**
     * Moves to the previous page.
     */
    fun onPrevious() {
        currentPosition--
    }

    /**
     * Moves to the next page.
     */
    fun onNext() {
        currentPosition++
    }

    /**
     * Handles the click event for month selection.
     */
    fun onMonthSelectionClick() {
        mode = when (mode) {
            DatePickerDisplayMode.MONTH -> DatePickerDisplayMode.CALENDAR
            DatePickerDisplayMode.YEAR -> DatePickerDisplayMode.MONTH
            else -> DatePickerDisplayMode.MONTH
        }
    }

    /**
     * Handles the click event for year selection.
     */
    fun onYearSelectionClick() {
        mode = when (mode) {
            DatePickerDisplayMode.YEAR -> DatePickerDisplayMode.CALENDAR
            DatePickerDisplayMode.MONTH -> DatePickerDisplayMode.YEAR
            else -> DatePickerDisplayMode.YEAR
        }
    }

    /**
     * Handles the click event for a specific month.
     *
     * @param month The month that was clicked.
     */
    fun onMonthClick(month: Int) {
        val currentMonth = pages[currentPosition].month
        val diffMonth = currentMonth - month
        currentPosition -= diffMonth
        //Fix state issues
        Timer().schedule(30) {
            mode = DatePickerDisplayMode.CALENDAR
        }
    }

    /**
     * Handles the click event for a specific year.
     *
     * @param year The year that was clicked.
     */
    fun onYearClick(year: Int) {
        val diffYear = yearIndex - year
        val diffMonth = 12 * diffYear
        currentPosition -= diffMonth
        //Fix state issues
        Timer().schedule(80) {
            mode = DatePickerDisplayMode.CALENDAR
        }
    }

    /**
     * Processes the selection of a new date.
     *
     * @param newDate The new date that was selected.
     */
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

    /**
     * Handles the confirm button click event.
     */
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
        /**
         * Creates a Saver for the DatePickerState.
         *
         * @param selection The date picker selection.
         * @param config The date picker configuration.
         * @return A Saver for the DatePickerState.
         */
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

    /**
     * Data class representing the state of the calendar in the date picker.
     *
     * @property mode The display mode of the date picker.
     * @property pages The array of pages representing the date picker grid states.
     * @property currentPosition The current position of the date picker.
     * @property date The selected date.
     * @property dates The array of selected dates.
     * @property range The array representing the range of selected dates.
     * @property rangeSelectionStart Indicates if the range selection is starting.
     */
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

/**
 * Function to remember the state of the date picker.
 *
 * @param selection The selection type for the date picker.
 * @param config The configuration for the date picker.
 */
@Composable
internal fun rememberDatePickerState(
    selection: DatePickerSelection,
    config: DatePickerConfig,
): DatePickerState = rememberSaveable(
    inputs = arrayOf(selection, config),
    saver = DatePickerState.Saver(selection, config),
    init = { DatePickerState(selection, config) }
)