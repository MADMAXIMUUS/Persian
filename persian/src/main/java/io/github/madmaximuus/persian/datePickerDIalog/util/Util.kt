package io.github.madmaximuus.persian.datePickerDIalog.util

import android.icu.util.Calendar
import androidx.annotation.RestrictTo
import androidx.core.math.MathUtils
import io.github.madmaximuus.persian.datePickerDIalog.state.DatePickerGridState

internal fun monthBetween(startDate: Calendar, endDate: Calendar): Int {
    val diffYear = endDate.get(Calendar.YEAR) - startDate.get(Calendar.YEAR)
    return endDate.get(Calendar.MONTH) - startDate.get(Calendar.MONTH) + 12 * diffYear
}

internal fun monthBetween(boundary: ClosedRange<Calendar>): Int {
    val diffYear = boundary.endInclusive.get(Calendar.YEAR) - boundary.start.get(Calendar.YEAR)
    return boundary.endInclusive.get(Calendar.MONTH) - boundary.start.get(Calendar.MONTH) + 12 * diffYear
}

internal fun getPageFromDay(startDate: Calendar, endDate: Calendar, day: Calendar): Int {
    val diffMonthMax = monthBetween(startDate, endDate)
    val diffMonth = monthBetween(startDate, day)
    return MathUtils.clamp(diffMonth, 0, diffMonthMax)
}

internal fun getPageFromDay(boundary: ClosedRange<Calendar>, day: Calendar): Int {
    val diffMonthMax = monthBetween(boundary)
    val diffMonth = monthBetween(boundary.start, day)
    return MathUtils.clamp(diffMonth, 0, diffMonthMax)
}

@RestrictTo(RestrictTo.Scope.LIBRARY_GROUP)
internal fun DatePickerSelection.getInitialPageFrom(config: DatePickerConfig): Int {
    val cameraDateBasedOnMode = when (this) {
        is DatePickerSelection.Date -> selectedDate
        is DatePickerSelection.Dates -> selectedDates?.firstOrNull()
        is DatePickerSelection.Period -> selectedRange?.lower
    } ?: Calendar.getInstance().apply {
        firstDayOfWeek = Calendar.MONDAY
    }
    return getPageFromDay(config.boundary, cameraDateBasedOnMode)
}

internal val DatePickerSelection.dateValue: Calendar?
    @RestrictTo(RestrictTo.Scope.LIBRARY_GROUP)
    get() = if (this is DatePickerSelection.Date) selectedDate else null

internal val DatePickerSelection.datesValue: Array<Calendar>
    @RestrictTo(RestrictTo.Scope.LIBRARY_GROUP)
    get() {
        val value = if (this is DatePickerSelection.Dates) selectedDates
            ?: mutableListOf() else mutableListOf()
        return value.toTypedArray()
    }

internal val DatePickerSelection.rangeValue: Array<Calendar?>
    @RestrictTo(RestrictTo.Scope.LIBRARY_GROUP)
    get() {
        val value = if (this is DatePickerSelection.Period) selectedRange else null
        return mutableListOf(value?.lower, value?.upper).toTypedArray()
    }

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

internal val List<Calendar?>.startValue: Calendar?
    @RestrictTo(RestrictTo.Scope.LIBRARY_GROUP)
    get() = this.getOrNull(0)

internal val List<Calendar?>.endValue: Calendar?
    @RestrictTo(RestrictTo.Scope.LIBRARY_GROUP)
    get() = this.getOrNull(1)

@RestrictTo(RestrictTo.Scope.LIBRARY_GROUP)
fun convertDayOfWeek(day: Int): Int {
    return when (day) {
        Calendar.MONDAY -> 0
        Calendar.TUESDAY -> 1
        Calendar.WEDNESDAY -> 2
        Calendar.THURSDAY -> 3
        Calendar.FRIDAY -> 4
        Calendar.SATURDAY -> 5
        Calendar.SUNDAY -> 6
        else -> 0
    }
}

fun getDaysInMonth(month: Int, year: Int) =
    when (month) {
        Calendar.JANUARY, Calendar.MARCH, Calendar.MAY,
        Calendar.JULY, Calendar.AUGUST, Calendar.OCTOBER, Calendar.DECEMBER -> 31

        Calendar.APRIL, Calendar.JUNE, Calendar.SEPTEMBER, Calendar.NOVEMBER -> 30
        Calendar.FEBRUARY ->
            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) 29 else 28

        else -> 30
    }

fun findDayOffset(dayOffWeekStart: Int, weekStart: Int): Int {
    val offset = dayOffWeekStart - weekStart
    if (dayOffWeekStart < weekStart) {
        return offset + 7
    }
    return offset
}

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

@RestrictTo(RestrictTo.Scope.LIBRARY_GROUP)
internal fun Calendar?.equal(other: Calendar): Boolean {
    if (this == null) return false
    if (this.get(Calendar.YEAR) != other.get(Calendar.YEAR)) return false
    if (this.get(Calendar.MONTH) != other.get(Calendar.MONTH)) return false
    if (this.get(Calendar.DAY_OF_MONTH) != other.get(Calendar.DAY_OF_MONTH)) return false
    return true
}

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

@RestrictTo(RestrictTo.Scope.LIBRARY_GROUP)
internal fun ClosedRange<Calendar>?.contain(cal: Calendar): Boolean {
    if (this == null) return false
    if (this.start.get(Calendar.YEAR) > cal.get(Calendar.YEAR)) return false
    if (this.start.get(Calendar.MONTH) > cal.get(Calendar.MONTH)) return false
    if (this.start.get(Calendar.DAY_OF_MONTH) > cal.get(Calendar.DAY_OF_MONTH)) return false
    if (this.endInclusive.get(Calendar.YEAR) < cal.get(Calendar.YEAR)) return false
    if (this.endInclusive.get(Calendar.MONTH) < cal.get(Calendar.MONTH)) return false
    if (this.endInclusive.get(Calendar.DAY_OF_MONTH) < cal.get(Calendar.DAY_OF_MONTH)) return false
    return true
}

@RestrictTo(RestrictTo.Scope.LIBRARY_GROUP)
internal fun Calendar.isAfter(other: Calendar): Boolean {
    if (this.get(Calendar.YEAR) > other.get(Calendar.YEAR)) return true
    if (this.get(Calendar.YEAR) == other.get(Calendar.YEAR)
        && this.get(Calendar.MONTH) > other.get(Calendar.MONTH)
    ) return true
    if (this.get(Calendar.YEAR) == other.get(Calendar.YEAR)
        && this.get(Calendar.MONTH) == other.get(Calendar.MONTH)
        && this.get(Calendar.DAY_OF_MONTH) > other.get(Calendar.DAY_OF_MONTH)
    ) return true
    return false
}

@RestrictTo(RestrictTo.Scope.LIBRARY_GROUP)
internal fun Calendar.isBefore(other: Calendar): Boolean {
    if (this.get(Calendar.YEAR) < other.get(Calendar.YEAR)) return true
    if (this.get(Calendar.YEAR) == other.get(Calendar.YEAR)
        && this.get(Calendar.MONTH) < other.get(Calendar.MONTH)
    ) return true
    if (this.get(Calendar.YEAR) == other.get(Calendar.YEAR)
        && this.get(Calendar.MONTH) == other.get(Calendar.MONTH)
        && this.get(Calendar.DAY_OF_MONTH) < other.get(Calendar.DAY_OF_MONTH)
    ) return true
    return false
}