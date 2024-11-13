package io.github.madmaximuus.persian.datePicker.view.util

import android.icu.util.Calendar
import androidx.annotation.RestrictTo
import androidx.core.math.MathUtils
import io.github.madmaximuus.persian.datePicker.view.state.DatePickerGridState

/**
 * Calculates the number of months between two dates.
 *
 * @param startDate The starting date.
 * @param endDate The ending date.
 */
internal fun monthBetween(startDate: Calendar, endDate: Calendar): Int {
    val diffYear = endDate.get(Calendar.YEAR) - startDate.get(Calendar.YEAR)
    return endDate.get(Calendar.MONTH) - startDate.get(Calendar.MONTH) + 12 * diffYear
}

/**
 * Calculates the number of months between the start and end dates of a given range.
 *
 * @param boundary The range of dates for which to calculate the number of months.
 */
internal fun monthBetween(boundary: ClosedRange<Calendar>): Int {
    val diffYear = boundary.endInclusive.get(Calendar.YEAR) - boundary.start.get(Calendar.YEAR)
    return boundary.endInclusive.get(Calendar.MONTH) - boundary.start.get(Calendar.MONTH) + 12 * diffYear
}

/**
 * Calculates the page index for a given day within a specified date range.
 *
 * @param boundary The range of dates for which to calculate the page index.
 * @param day The specific day for which to calculate the page index.
 */
internal fun getPageFromDay(boundary: ClosedRange<Calendar>, day: Calendar): Int {
    val diffMonthMax = monthBetween(boundary)
    val diffMonth = monthBetween(boundary.start, day)
    return MathUtils.clamp(diffMonth, 0, diffMonthMax)
}

/**
 * Calculates the initial page index based on the selected date or range and the configuration.
 *
 * @param config The configuration for the date picker.
 */
@RestrictTo(RestrictTo.Scope.LIBRARY_GROUP)
internal fun DatePickerSelection.getInitialPageFrom(config: DatePickerConfig): Int {
    val cameraDateBasedOnMode = when (this) {
        is DatePickerSelection.Date -> selectedDate?.apply {
            firstDayOfWeek = Calendar.MONDAY
        }

        is DatePickerSelection.Dates -> selectedDates?.firstOrNull()?.apply {
            firstDayOfWeek = Calendar.MONDAY
        }

        is DatePickerSelection.Period -> selectedRange?.start?.apply {
            firstDayOfWeek = Calendar.MONDAY
        }
    } ?: Calendar.getInstance().apply {
        firstDayOfWeek = Calendar.MONDAY
    }
    return getPageFromDay(config.boundary, cameraDateBasedOnMode)
}

/**
 * Extension property to get the selected date from a [DatePickerSelection.Date] instance.
 */
internal val DatePickerSelection.dateValue: Calendar?
    @RestrictTo(RestrictTo.Scope.LIBRARY_GROUP)
    get() = if (this is DatePickerSelection.Date) selectedDate else null

/**
 * Extension property to get the selected dates from a [DatePickerSelection.Dates] instance.
 */
internal val DatePickerSelection.datesValue: Array<Calendar>
    @RestrictTo(RestrictTo.Scope.LIBRARY_GROUP)
    get() {
        val value = if (this is DatePickerSelection.Dates) selectedDates
            ?: mutableListOf() else mutableListOf()
        return value.toTypedArray()
    }

/**
 * Extension property to get the selected date range from a [DatePickerSelection.Period] instance.
 */
internal val DatePickerSelection.rangeValue: Array<Calendar?>
    @RestrictTo(RestrictTo.Scope.LIBRARY_GROUP)
    get() {
        val value = if (this is DatePickerSelection.Period) selectedRange else null
        return mutableListOf(value?.start, value?.endInclusive).toTypedArray()
    }

/**
 * Calculates the month data for the date picker based on the provided configuration.
 *
 * @param config The configuration for the date picker.
 */
@RestrictTo(RestrictTo.Scope.LIBRARY_GROUP)
internal fun calcMonthData(
    config: DatePickerConfig
): List<DatePickerGridState> {
    val range = config.boundary

    val list = mutableListOf<DatePickerGridState>()

    val months = monthBetween(range)

    val cameraDate = Calendar.getInstance().apply {
        firstDayOfWeek = Calendar.MONDAY
        set(Calendar.YEAR, config.boundary.start.get(Calendar.YEAR))
        set(Calendar.MONTH, config.boundary.start.get(Calendar.MONTH))
        set(Calendar.DAY_OF_MONTH, config.boundary.start.get(Calendar.DAY_OF_MONTH))
    }

    for (year in 0 until months) {
        list.add(
            DatePickerGridState(
                month = cameraDate.get(Calendar.MONTH),
                year = cameraDate.get(Calendar.YEAR),
                calendar = Calendar.getInstance().apply {
                    firstDayOfWeek = Calendar.MONDAY
                    set(Calendar.YEAR, cameraDate.get(Calendar.YEAR))
                    set(Calendar.MONTH, cameraDate.get(Calendar.MONTH))
                    set(Calendar.DAY_OF_MONTH, cameraDate.get(Calendar.DAY_OF_MONTH))
                }
            )
        )
        cameraDate.add(Calendar.MONTH, 1)
    }
    return list
}

/**
 * Extension property to get the first element of a list of [Calendar] objects.
 */
internal val List<Calendar?>.startValue: Calendar?
    @RestrictTo(RestrictTo.Scope.LIBRARY_GROUP)
    get() = this.getOrNull(0)

/**
 * Extension property to get the second element of a list of [Calendar] objects.
 */
internal val List<Calendar?>.endValue: Calendar?
    @RestrictTo(RestrictTo.Scope.LIBRARY_GROUP)
    get() = this.getOrNull(1)

/**
 * Returns the number of days in a given month and year.
 *
 * @param month The month for which to calculate the number of days.
 * @param year The year for which to calculate the number of days.
 */
fun getDaysInMonth(month: Int, year: Int) =
    when (month) {
        Calendar.JANUARY, Calendar.MARCH, Calendar.MAY,
        Calendar.JULY, Calendar.AUGUST, Calendar.OCTOBER, Calendar.DECEMBER -> 31

        Calendar.APRIL, Calendar.JUNE, Calendar.SEPTEMBER, Calendar.NOVEMBER -> 30
        Calendar.FEBRUARY ->
            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) 29 else 28

        else -> 30
    }

/**
 * Calculates the offset of a given day of the week from the start of the week.
 *
 * @param dayOffWeekStart The day of the week for which to calculate the offset.
 * @param weekStart The starting day of the week.
 */
fun findDayOffset(dayOffWeekStart: Int, weekStart: Int): Int {
    val offset = dayOffWeekStart - weekStart
    if (dayOffWeekStart < weekStart) {
        return offset + 7
    }
    return offset
}

/**
 * Calculates the date data for a specific day in the date picker.
 *
 * @param date The calendar date for which to calculate the data.
 * @param calendarViewData The state of the date picker grid.
 * @param selection The type of date picker selection.
 * @param config The configuration for the date picker.
 * @param selectedDate The selected date for single date selection.
 * @param selectedDates The list of selected dates for multiple date selection.
 * @param selectedRange The range of selected dates for period selection.
 */
@RestrictTo(RestrictTo.Scope.LIBRARY_GROUP)
internal fun calcCalendarDateData(
    date: Calendar,
    calendarViewData: DatePickerGridState,
    selection: DatePickerSelection,
    config: DatePickerConfig,
    selectedDate: Calendar?,
    selectedDates: List<Calendar>?,
    selectedRange: Pair<Calendar?, Calendar?>
): DatePickerDayData? {

    if (date.get(Calendar.MONTH) != calendarViewData.month) return null

    var selectedStartInit = false
    var selectedEnd = false
    var selectedBetween = false
    val selected = when (selection) {
        is DatePickerSelection.Date -> selectedDate?.equal(date) ?: false
        is DatePickerSelection.Dates -> {
            selectedDates?.contain(date) ?: false
        }

        is DatePickerSelection.Period -> {
            val selectedStart = selectedRange.first.equal(date)
            selectedStartInit = selectedStart && selectedRange.second != null
            selectedEnd = selectedRange.second.equal(date)
            selectedBetween = (selectedRange.first?.let { date.isAfter(it) } ?: false)
                    && selectedRange.second?.let { date.isBefore(it) } ?: false
            selectedBetween || selectedStart || selectedEnd
        }
    }
    val outOfBoundary = config.boundary.contain(date)

    return DatePickerDayData(
        date = date,
        disabledPassively = outOfBoundary,
        selected = selected,
        selectedBetween = selectedBetween,
        selectedStart = selectedStartInit,
        selectedEnd = selectedEnd,
    )
}

/**
 * Extension function to check if two [Calendar] instances represent the same date.
 *
 * @param other The other [Calendar] instance to compare with.
 */
@RestrictTo(RestrictTo.Scope.LIBRARY_GROUP)
internal fun Calendar?.equal(other: Calendar): Boolean {
    if (this == null) return false
    if (this.get(Calendar.YEAR) != other.get(Calendar.YEAR)) return false
    if (this.get(Calendar.MONTH) != other.get(Calendar.MONTH)) return false
    return this.get(Calendar.DAY_OF_MONTH) == other.get(Calendar.DAY_OF_MONTH)
}

/**
 * Extension function to check if a list of [Calendar] days instances contains a specific day.
 *
 * @param cal The [Calendar] instance to check for in the list.
 * @return `true` if the list contains the specified [Calendar] instance, `false` otherwise.
 */
@RestrictTo(RestrictTo.Scope.LIBRARY_GROUP)
internal fun List<Calendar>?.contain(cal: Calendar): Boolean {
    if (this == null) return false
    var contain = false
    this.forEach {
        if (it.equal(cal)) {
            contain = true
            return@forEach
        }
    }
    return contain
}

/**
 * Extension function to check if a closed range of [Calendar] days instances contains a specific day.
 *
 * @param cal The [Calendar] instance to check for in the range.
 */
@RestrictTo(RestrictTo.Scope.LIBRARY_GROUP)
internal fun ClosedRange<Calendar>?.contain(cal: Calendar): Boolean {
    if (this == null) return false
    if (this.start.get(Calendar.YEAR) > cal.get(Calendar.YEAR)) return false
    if (this.start.get(Calendar.MONTH) > cal.get(Calendar.MONTH)) return false
    if (this.start.get(Calendar.DAY_OF_MONTH) > cal.get(Calendar.DAY_OF_MONTH)) return false
    if (this.endInclusive.get(Calendar.YEAR) < cal.get(Calendar.YEAR)) return false
    if (this.endInclusive.get(Calendar.MONTH) < cal.get(Calendar.MONTH)) return false
    return this.endInclusive.get(Calendar.DAY_OF_MONTH) >= cal.get(Calendar.DAY_OF_MONTH)
}

/**
 * Extension function to check if this day is after another day.
 *
 * @param other The other [Calendar] instance to compare with.
 */
@RestrictTo(RestrictTo.Scope.LIBRARY_GROUP)
internal fun Calendar.isAfter(other: Calendar): Boolean {
    if (this.get(Calendar.YEAR) > other.get(Calendar.YEAR)) return true
    if (this.get(Calendar.YEAR) == other.get(Calendar.YEAR)
        && this.get(Calendar.MONTH) > other.get(Calendar.MONTH)
    ) return true
    return (this.get(Calendar.YEAR) == other.get(Calendar.YEAR)
            && this.get(Calendar.MONTH) == other.get(Calendar.MONTH)
            && this.get(Calendar.DAY_OF_MONTH) > other.get(Calendar.DAY_OF_MONTH))
}

/**
 * Extension function to check if this day is before another day.
 *
 * @param other The other [Calendar] instance to compare with.
 */
@RestrictTo(RestrictTo.Scope.LIBRARY_GROUP)
internal fun Calendar.isBefore(other: Calendar): Boolean {
    if (this.get(Calendar.YEAR) < other.get(Calendar.YEAR)) return true
    if (this.get(Calendar.YEAR) == other.get(Calendar.YEAR)
        && this.get(Calendar.MONTH) < other.get(Calendar.MONTH)
    ) return true
    return (this.get(Calendar.YEAR) == other.get(Calendar.YEAR)
            && this.get(Calendar.MONTH) == other.get(Calendar.MONTH)
            && this.get(Calendar.DAY_OF_MONTH) < other.get(Calendar.DAY_OF_MONTH))
}