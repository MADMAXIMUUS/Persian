package io.github.madmaximuus.persian.datePicker.view

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import io.github.madmaximuus.persian.button.ButtonColors
import io.github.madmaximuus.persian.button.ButtonDefaults
import io.github.madmaximuus.persian.datePicker.DatePicker
import io.github.madmaximuus.persian.datePicker.view.cells.DatePickerDialogDayCell
import io.github.madmaximuus.persian.datePicker.view.cells.DatePickerDialogMonthCell
import io.github.madmaximuus.persian.datePicker.view.cells.DatePickerDialogWeekLabelCell
import io.github.madmaximuus.persian.datePicker.view.cells.DatePickerDialogYearCell
import io.github.madmaximuus.persian.datePicker.view.header.DatePickerDialogHeader
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.state38
import io.github.madmaximuus.persian.iconButton.IconButtonColors
import io.github.madmaximuus.persian.iconButton.IconButtonDefaults

/**
 * Contains the default values used by [DatePickerView].
 */
object PersianDatePickerViewDefaults {

    /**
     * Create a [DatePickerViewColors] that represents the default content used in a [DatePicker].
     *
     * @param headerColors The colors for the header of the date picker.
     * @param datePickerGridColors The colors for the various cells in the date picker grid.
     */
    @Composable
    fun colors(
        headerColors: DatePickerHeaderColors = headerColors(),
        datePickerGridColors: DatePickerGridColors = gridColors(),
    ) = DatePickerViewColors(
        headerColors = headerColors,
        datePickerGridColors = datePickerGridColors,
    )

    /**
     * Create a [DatePickerHeaderColors] that represents the default content used in a [DatePickerDialogHeader].
     *
     * @param prevButtonColor The colors for the previous button in the date picker header.
     * @param nextButtonColor The colors for the next button in the date picker header.
     * @param monthLabelColor The color for the month label in the date picker header.
     * @param yearLabelColor The color for the year label in the date picker header.
     * @param selectedMonthColor The colors for the selected month button in the date picker header.
     * @param selectedYearColor The colors for the selected year button in the date picker header.
     */
    @Composable
    fun headerColors(
        prevButtonColor: IconButtonColors = IconButtonDefaults.primaryIconButtonColors(),
        nextButtonColor: IconButtonColors = IconButtonDefaults.primaryIconButtonColors(),
        monthLabelColor: Color = PersianTheme.colorScheme.primary,
        yearLabelColor: Color = PersianTheme.colorScheme.primary,
        selectedMonthColor: ButtonColors = ButtonDefaults.tertiaryColors(),
        selectedYearColor: ButtonColors = ButtonDefaults.tertiaryColors(),
    ) = DatePickerHeaderColors(
        prevButtonColor = prevButtonColor,
        nextButtonColor = nextButtonColor,
        monthLabelColor = monthLabelColor,
        yearLabelColor = yearLabelColor,
        selectedMonthColor = selectedMonthColor,
        selectedYearColor = selectedYearColor,
    )

    /**
     * Create a [DatePickerGridColors] that represents the default content used in all calendar cells.
     *
     * @param dayOfWeekLabelColors The colors for the day of the week labels in the date picker grid.
     * @param dayPickerDayCellColors The colors for the day cells in the date picker grid.
     * @param dayPickerMonthCellColors The colors for the month cells in the date picker grid.
     * @param dayPickerYearCellColors The colors for the year cells in the date picker grid.
     */
    @Composable
    fun gridColors(
        dayOfWeekLabelColors: DatePickerDayOfWeekCellColors = dayOfWeekLabelColors(),
        dayPickerDayCellColors: DatePickerDayCellColors = dayCellColors(),
        dayPickerMonthCellColors: DatePickerMonthCellColors = monthCellColors(),
        dayPickerYearCellColors: DatePickerYearCellColors = yearCellColors()
    ): DatePickerGridColors =
        DatePickerGridColors(
            dayOfWeekLabelColors = dayOfWeekLabelColors,
            dayPickerDayCellColors = dayPickerDayCellColors,
            dayPickerMonthCellColors = dayPickerMonthCellColors,
            dayPickerYearCellColors = dayPickerYearCellColors
        )

    /**
     * Create a [DatePickerDayOfWeekCellColors] that represents the default content used in [DatePickerDialogWeekLabelCell].
     *
     * @param dayOfWeekLabelColor The color for the day of the week label.
     */
    @Composable
    fun dayOfWeekLabelColors(
        dayOfWeekLabelColor: Color = PersianTheme.colorScheme.onSurfaceVariant
    ) = DatePickerDayOfWeekCellColors(
        dayOfWeekLabelColor = dayOfWeekLabelColor
    )

    /**
     * Create a [DatePickerDayCellColors] that represents the default content used in [DatePickerDialogDayCell].
     *
     * @param cellTextColor The color of the text in the day cell.
     * @param cellTextDisabledColor The color of the text in the day cell when it is disabled.
     * @param cellTextBetweenSelectionColor The color of the text in the day cell when it is between a selection.
     * @param cellTextSelectedColor The color of the text in the day cell when it is selected.
     * @param currentDateIndicator The color of the indicator for the current date.
     * @param currentDateBetweenSelectionIndicatorColor The color of the indicator for the current date when it is between a selection.
     * @param currentDateIndicatorSelectedColor The color of the indicator for the current date when it is selected.
     * @param containerColor The color of the container for the day cell.
     * @param betweenSelectionContainerColor The color of the container for the day cell when it is between a selection.
     * @param selectedContainerColor The color of the container for the day cell when it is selected.
     */
    @Composable
    fun dayCellColors(
        cellTextColor: Color = PersianTheme.colorScheme.onSurface,
        cellTextDisabledColor: Color = PersianTheme.colorScheme.onSurface.state38,
        cellTextBetweenSelectionColor: Color = PersianTheme.colorScheme.onPrimaryContainer,
        cellTextSelectedColor: Color = PersianTheme.colorScheme.onPrimary,

        currentDateIndicator: Color = PersianTheme.colorScheme.primary,
        currentDateBetweenSelectionIndicatorColor: Color = PersianTheme.colorScheme.primary,
        currentDateIndicatorSelectedColor: Color = PersianTheme.colorScheme.onPrimary,

        containerColor: Color = Color.Transparent,
        betweenSelectionContainerColor: Color = PersianTheme.colorScheme.primaryContainer,
        selectedContainerColor: Color = PersianTheme.colorScheme.primary,
    ) = DatePickerDayCellColors(
        cellTextColor = cellTextColor,
        cellTextDisabledColor = cellTextDisabledColor,
        cellTextBetweenSelectionColor = cellTextBetweenSelectionColor,
        cellTextSelectedColor = cellTextSelectedColor,

        currentDateIndicator = currentDateIndicator,
        currentDateBetweenSelectionIndicatorColor = currentDateBetweenSelectionIndicatorColor,
        currentDateIndicatorSelectedColor = currentDateIndicatorSelectedColor,

        containerColor = containerColor,
        betweenSelectionContainerColor = betweenSelectionContainerColor,
        selectedContainerColor = selectedContainerColor,
    )

    /**
     * Create a [DatePickerMonthCellColors] that represents the default content used in [DatePickerDialogMonthCell].
     *
     * @param cellTextColor The color of the text in the month cell.
     * @param cellTextDisabledColor The color of the text in the month cell when it is disabled.
     * @param cellTextSelectedColor The color of the text in the month cell when it is selected.
     * @param currentDateIndicator The color of the indicator for the current date.
     * @param currentDateIndicatorSelectedColor The color of the indicator for the current date when it is selected.
     * @param backgroundColor The color of the background for the month cell.
     * @param selectedBackgroundColor The color of the background for the month cell when it is selected.
     */
    @Composable
    fun monthCellColors(
        cellTextColor: Color = PersianTheme.colorScheme.onSurface,
        cellTextDisabledColor: Color = PersianTheme.colorScheme.onSurface.state38,
        cellTextSelectedColor: Color = PersianTheme.colorScheme.onPrimary,

        currentDateIndicator: Color = PersianTheme.colorScheme.primary,
        currentDateIndicatorSelectedColor: Color = PersianTheme.colorScheme.onPrimary,

        backgroundColor: Color = Color.Transparent,
        selectedBackgroundColor: Color = PersianTheme.colorScheme.primary,
    ) = DatePickerMonthCellColors(
        cellTextColor = cellTextColor,
        cellTextDisabledColor = cellTextDisabledColor,
        cellTextSelectedColor = cellTextSelectedColor,

        currentDateIndicator = currentDateIndicator,
        currentDateIndicatorSelectedColor = currentDateIndicatorSelectedColor,

        containerColor = backgroundColor,
        selectedContainerColor = selectedBackgroundColor,
    )

    /**
     * Create a [DatePickerYearCellColors] that represents the default content used in [DatePickerDialogYearCell].
     *
     * @param cellTextColor The color of the text in the year cell.
     * @param cellTextSelectedColor The color of the text in the year cell when it is selected.
     * @param currentDateIndicator The color of the indicator for the current date.
     * @param currentDateIndicatorSelectedColor The color of the indicator for the current date when it is selected.
     * @param containerColor The color of the container for the year cell.
     * @param selectedContainerColor The color of the container for the year cell when it is selected.
     */
    @Composable
    fun yearCellColors(
        cellTextColor: Color = PersianTheme.colorScheme.onSurface,
        cellTextSelectedColor: Color = PersianTheme.colorScheme.onPrimary,

        currentDateIndicator: Color = PersianTheme.colorScheme.primary,
        currentDateIndicatorSelectedColor: Color = PersianTheme.colorScheme.onPrimary,

        containerColor: Color = Color.Transparent,
        selectedContainerColor: Color = PersianTheme.colorScheme.primary,
    ) = DatePickerYearCellColors(
        cellTextColor = cellTextColor,
        cellTextSelectedColor = cellTextSelectedColor,

        currentDateIndicator = currentDateIndicator,
        currentDateIndicatorSelectedColor = currentDateIndicatorSelectedColor,

        containerColor = containerColor,
        selectedContainerColor = selectedContainerColor,
    )
}

/**
 * Represents the container and content colors used in a [DatePickerView] in different states.
 *
 * @property headerColors The colors used for the header of the date picker.
 * @property datePickerGridColors The colors used for the various cells in the date picker grid.
 */
@Immutable
class DatePickerViewColors internal constructor(
    internal val headerColors: DatePickerHeaderColors,
    internal val datePickerGridColors: DatePickerGridColors,
)

/**
 * Represents the container and content colors used in a [DatePickerDialogHeader] in different states.
 *
 * @property prevButtonColor The colors used for the previous button in the date picker header.
 * @property nextButtonColor The colors used for the next button in the date picker header.
 * @property monthLabelColor The color used for the month label in the date picker header.
 * @property yearLabelColor The color used for the year label in the date picker header.
 * @property selectedMonthColor The colors used for the selected month button in the date picker header.
 * @property selectedYearColor The colors used for the selected year button in the date picker header.
 */
@Immutable
class DatePickerHeaderColors internal constructor(
    internal val prevButtonColor: IconButtonColors,
    internal val nextButtonColor: IconButtonColors,

    internal val monthLabelColor: Color,
    internal val yearLabelColor: Color,
    internal val selectedMonthColor: ButtonColors,
    internal val selectedYearColor: ButtonColors
)

/**
 * Represents the container and content colors used in all cells in different states.
 *
 * @property dayOfWeekLabelColors The colors used for the day of the week labels in the date picker grid.
 * @property dayPickerDayCellColors The colors used for the day cells in the date picker grid.
 * @property dayPickerMonthCellColors The colors used for the month cells in the date picker grid.
 * @property dayPickerYearCellColors The colors used for the year cells in the date picker grid.
 */
@Immutable
class DatePickerGridColors internal constructor(
    internal val dayOfWeekLabelColors: DatePickerDayOfWeekCellColors,
    internal val dayPickerDayCellColors: DatePickerDayCellColors,
    internal val dayPickerMonthCellColors: DatePickerMonthCellColors,
    internal val dayPickerYearCellColors: DatePickerYearCellColors
)

/**
 * Represents the container and content colors used in a [DatePickerDialogWeekLabelCell] in different states.
 *
 * @property dayOfWeekLabelColor The color of the label for the day of the week cell.
 */
@Immutable
class DatePickerDayOfWeekCellColors internal constructor(
    internal val dayOfWeekLabelColor: Color
)

/**
 * Represents the container and content colors used in a [DatePickerDialogDayCell] in different states.
 *
 * @property cellTextColor The color of the text in the day cell.
 * @property cellTextDisabledColor The color of the text in the day cell when it is disabled.
 * @property cellTextBetweenSelectionColor The color of the text in the day cell when it is between a selection.
 * @property cellTextSelectedColor The color of the text in the day cell when it is selected.
 * @property currentDateIndicator The color of the indicator for the current date.
 * @property currentDateBetweenSelectionIndicatorColor The color of the indicator for the current date when it is between a selection.
 * @property currentDateIndicatorSelectedColor The color of the indicator for the current date when it is selected.
 * @property containerColor The color of the container for the day cell.
 * @property betweenSelectionContainerColor The color of the container for the day cell when it is between a selection.
 * @property selectedContainerColor The color of the container for the day cell when it is selected.
 */
@Immutable
class DatePickerDayCellColors internal constructor(
    private val cellTextColor: Color,
    private val cellTextDisabledColor: Color,
    private val cellTextBetweenSelectionColor: Color,
    private val cellTextSelectedColor: Color,

    private val currentDateIndicator: Color,
    private val currentDateBetweenSelectionIndicatorColor: Color,
    private val currentDateIndicatorSelectedColor: Color,

    private val containerColor: Color,
    private val betweenSelectionContainerColor: Color,
    private val selectedContainerColor: Color,
) {

    /**
     * Returns the content color for the day cell based on whether it is selected, between a selection, and whether it is enabled.
     *
     * @param selected Indicates whether the day cell is selected.
     * @param between Indicates whether the day cell is between a selection.
     * @param enabled Indicates whether the day cell is enabled.
     */
    @Composable
    internal fun contentColor(
        selected: Boolean,
        between: Boolean,
        enabled: Boolean
    ) = when {
        selected && !between -> cellTextSelectedColor
        between -> cellTextBetweenSelectionColor
        !enabled -> cellTextDisabledColor

        else -> cellTextColor
    }

    /**
     * Returns the container color for the day cell based on whether it is selected and whether it is between a selection.
     *
     * @param selected Indicates whether the day cell is selected.
     * @param between Indicates whether the day cell is between a selection.
     */
    @Composable
    internal fun containerColor(
        selected: Boolean,
        between: Boolean,
    ) = when {
        selected && !between -> selectedContainerColor
        between -> betweenSelectionContainerColor
        else -> containerColor
    }

    /**
     * Returns the indicator color for the day cell based on whether it is selected, between a selection, and whether it is the current day.
     *
     * @param selected Indicates whether the day cell is selected.
     * @param between Indicates whether the day cell is between a selection.
     * @param today Indicates whether the day cell represents the current day.
     */
    @Composable
    internal fun indicatorColor(
        selected: Boolean,
        between: Boolean,
        today: Boolean
    ) = when {
        between && today -> currentDateBetweenSelectionIndicatorColor
        selected && today -> currentDateIndicatorSelectedColor
        today -> currentDateIndicator
        else -> Color.Transparent
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is DatePickerDayCellColors) return false

        if (cellTextColor != other.cellTextColor) return false
        if (cellTextDisabledColor != other.cellTextDisabledColor) return false
        if (cellTextBetweenSelectionColor != other.cellTextBetweenSelectionColor) return false
        if (cellTextSelectedColor != other.cellTextSelectedColor) return false
        if (currentDateIndicator != other.currentDateIndicator) return false
        if (currentDateBetweenSelectionIndicatorColor != other.currentDateBetweenSelectionIndicatorColor) return false
        if (currentDateIndicatorSelectedColor != other.currentDateIndicatorSelectedColor) return false
        if (containerColor != other.containerColor) return false
        if (betweenSelectionContainerColor != other.betweenSelectionContainerColor) return false
        return selectedContainerColor == other.selectedContainerColor
    }

    override fun hashCode(): Int {
        var result = cellTextColor.hashCode()
        result = 31 * result + cellTextDisabledColor.hashCode()
        result = 31 * result + cellTextBetweenSelectionColor.hashCode()
        result = 31 * result + currentDateIndicator.hashCode()
        result = 31 * result + currentDateBetweenSelectionIndicatorColor.hashCode()
        result = 31 * result + currentDateIndicatorSelectedColor.hashCode()
        result = 31 * result + containerColor.hashCode()
        result = 31 * result + betweenSelectionContainerColor.hashCode()
        result = 31 * result + selectedContainerColor.hashCode()
        return result
    }
}

/**
 * Represents the container and content colors used in a [DatePickerDialogMonthCell] in different states.
 *
 * @property cellTextColor The color of the text in the month cell.
 * @property cellTextDisabledColor The color of the text in the month cell when it is disabled.
 * @property cellTextSelectedColor The color of the text in the month cell when it is selected.
 * @property currentDateIndicator The color of the indicator for the current date.
 * @property currentDateIndicatorSelectedColor The color of the indicator for the current date when it is selected.
 * @property containerColor The color of the container for the month cell.
 * @property selectedContainerColor The color of the container for the month cell when it is selected.
 */
@Immutable
class DatePickerMonthCellColors internal constructor(
    private val cellTextColor: Color,
    private val cellTextDisabledColor: Color,
    private val cellTextSelectedColor: Color,

    private val currentDateIndicator: Color,
    private val currentDateIndicatorSelectedColor: Color,

    private val containerColor: Color,
    private val selectedContainerColor: Color,
) {
    /**
     * Returns the content color for the month cell based on whether it is selected and whether it is enabled.
     *
     * @param selected Indicates whether the month cell is selected.
     * @param enabled Indicates whether the month cell is enabled.
     */
    @Composable
    internal fun contentColor(
        selected: Boolean,
        enabled: Boolean
    ) = when {
        selected -> cellTextSelectedColor
        !enabled -> cellTextDisabledColor

        else -> cellTextColor
    }

    /**
     * Returns the container color for the month cell based on whether it is selected.
     *
     * @param selected Indicates whether the month cell is selected.
     */
    @Composable
    internal fun containerColor(
        selected: Boolean,
    ) = when {
        selected -> selectedContainerColor
        else -> containerColor
    }

    /**
     * Returns the indicator color for the month cell based on whether it is selected and whether it is the current month.
     *
     * @param selected Indicates whether the month cell is selected.
     * @param currentMonth Indicates whether the month cell represents the current month.
     */
    @Composable
    internal fun indicatorColor(
        selected: Boolean,
        currentMonth: Boolean
    ) = when {
        selected && !currentMonth -> Color.Transparent
        selected -> currentDateIndicatorSelectedColor
        currentMonth -> currentDateIndicator
        else -> Color.Transparent
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is DatePickerMonthCellColors) return false

        if (cellTextColor != other.cellTextColor) return false
        if (cellTextDisabledColor != other.cellTextDisabledColor) return false
        if (cellTextSelectedColor != other.cellTextSelectedColor) return false
        if (currentDateIndicator != other.currentDateIndicator) return false
        if (currentDateIndicatorSelectedColor != other.currentDateIndicatorSelectedColor) return false
        if (containerColor != other.containerColor) return false
        return selectedContainerColor == other.selectedContainerColor
    }

    override fun hashCode(): Int {
        var result = cellTextColor.hashCode()
        result = 31 * result + cellTextDisabledColor.hashCode()
        result = 31 * result + currentDateIndicator.hashCode()
        result = 31 * result + currentDateIndicatorSelectedColor.hashCode()
        result = 31 * result + containerColor.hashCode()
        result = 31 * result + selectedContainerColor.hashCode()
        return result
    }
}

/**
 * Represents the container and content colors used in a [DatePickerDialogYearCell] in different states.
 *
 * @property cellTextColor The color of the text in the year cell.
 * @property cellTextSelectedColor The color of the text in the year cell when it is selected.
 * @property currentDateIndicator The color of the indicator for the current date.
 * @property currentDateIndicatorSelectedColor The color of the indicator for the current date when it is selected.
 * @property containerColor The color of the container for the year cell.
 * @property selectedContainerColor The color of the container for the year cell when it is selected.
 */
@Immutable
class DatePickerYearCellColors internal constructor(
    private val cellTextColor: Color,
    private val cellTextSelectedColor: Color,

    private val currentDateIndicator: Color,
    private val currentDateIndicatorSelectedColor: Color,

    private val containerColor: Color,
    private val selectedContainerColor: Color,
) {
    /**
     * Returns the content color for the year cell based on whether it is selected.
     *
     * @param selected Indicates whether the year cell is selected.
     */
    @Composable
    internal fun contentColor(
        selected: Boolean,
    ) = when {
        selected -> cellTextSelectedColor

        else -> cellTextColor
    }

    /**
     * Returns the container color for the year cell based on whether it is selected.
     *
     * @param selected Indicates whether the year cell is selected.
     */
    @Composable
    internal fun containerColor(
        selected: Boolean,
    ) = when {
        selected -> selectedContainerColor
        else -> containerColor
    }

    /**
     * Returns the indicator color for the year cell based on whether it is selected and whether it is the current year.
     *
     * @param selected Indicates whether the year cell is selected.
     * @param currentYear Indicates whether the year cell represents the current year.
     */
    @Composable
    internal fun indicatorColor(
        selected: Boolean,
        currentYear: Boolean
    ) = when {
        selected && !currentYear -> Color.Transparent
        selected -> currentDateIndicatorSelectedColor
        currentYear -> currentDateIndicator
        else -> Color.Transparent
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is DatePickerYearCellColors) return false

        if (cellTextColor != other.cellTextColor) return false
        if (cellTextSelectedColor != other.cellTextSelectedColor) return false
        if (currentDateIndicator != other.currentDateIndicator) return false
        if (currentDateIndicatorSelectedColor != other.currentDateIndicatorSelectedColor) return false
        if (containerColor != other.containerColor) return false
        return selectedContainerColor == other.selectedContainerColor
    }

    override fun hashCode(): Int {
        var result = cellTextColor.hashCode()
        result = 31 * result + currentDateIndicator.hashCode()
        result = 31 * result + currentDateIndicatorSelectedColor.hashCode()
        result = 31 * result + containerColor.hashCode()
        result = 31 * result + selectedContainerColor.hashCode()
        return result
    }
}