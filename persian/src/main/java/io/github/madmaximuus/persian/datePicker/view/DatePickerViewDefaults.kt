package io.github.madmaximuus.persian.datePicker.view

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.State
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.Color
import io.github.madmaximuus.persian.button.ButtonColors
import io.github.madmaximuus.persian.button.ButtonDefaults
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.state38
import io.github.madmaximuus.persian.iconButton.IconButtonColors
import io.github.madmaximuus.persian.iconButton.IconButtonDefaults

/**
 * Contains all default values used by date picker view.
 */
object PersianDatePickerViewDefaults {

    /**
     * Returns the default colors for the date picker view.
     *
     * @param headerColors The colors for the header of the date picker.
     * @param datePickerGridColors The colors for the various cells in the date picker grid.
     * @param containerColor The color of the container for the date picker view.
     * @param elevatedContainerColor The color of the container for the date picker view when it is elevated.
     * @return The default colors for the date picker view.
     */
    @Composable
    fun colors(
        headerColors: DatePickerHeaderColors = headerColors(),
        datePickerGridColors: DatePickerGridColors = gridColors(),
        containerColor: Color = Color.Transparent,
        elevatedContainerColor: Color = PersianTheme.colorScheme.surfaceContainer,
    ): DatePickerViewColors = DatePickerViewColors(
        headerColors = headerColors,
        datePickerGridColors = datePickerGridColors,
        containerColor = containerColor,
        elevatedContainerColor = elevatedContainerColor
    )

    /**
     * Returns the default colors for the header of the date picker.
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
    ): DatePickerHeaderColors = DatePickerHeaderColors(
        prevButtonColor = prevButtonColor,
        nextButtonColor = nextButtonColor,
        monthLabelColor = monthLabelColor,
        yearLabelColor = yearLabelColor,
        selectedMonthColor = selectedMonthColor,
        selectedYearColor = selectedYearColor,
    )

    /**
     * Returns the default colors for the various cells in the date picker grid.
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
    ): DatePickerGridColors = DatePickerGridColors(
        dayOfWeekLabelColors = dayOfWeekLabelColors,
        dayPickerDayCellColors = dayPickerDayCellColors,
        dayPickerMonthCellColors = dayPickerMonthCellColors,
        dayPickerYearCellColors = dayPickerYearCellColors
    )

    /**
     * Returns the default colors for the day of the week labels in the date picker grid.
     *
     * @param label The color for the day of the week label.
     */
    @Composable
    fun dayOfWeekLabelColors(
        label: Color = PersianTheme.colorScheme.onSurfaceVariant
    ): DatePickerDayOfWeekCellColors = DatePickerDayOfWeekCellColors(label)

    /**
     * Returns the default colors for the day cells in the date picker grid.
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
    ): DatePickerDayCellColors = DatePickerDayCellColors(
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
     * Returns the default colors for the month cells in the date picker grid.
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
    ): DatePickerMonthCellColors = DatePickerMonthCellColors(
        cellTextColor = cellTextColor,
        cellTextDisabledColor = cellTextDisabledColor,
        cellTextSelectedColor = cellTextSelectedColor,

        currentDateIndicator = currentDateIndicator,
        currentDateIndicatorSelectedColor = currentDateIndicatorSelectedColor,

        containerColor = backgroundColor,
        selectedContainerColor = selectedBackgroundColor,
    )

    /**
     * Returns the default colors for the year cells in the date picker grid.
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
    ): DatePickerYearCellColors = DatePickerYearCellColors(
        cellTextColor = cellTextColor,
        cellTextSelectedColor = cellTextSelectedColor,

        currentDateIndicator = currentDateIndicator,
        currentDateIndicatorSelectedColor = currentDateIndicatorSelectedColor,

        containerColor = containerColor,
        selectedContainerColor = selectedContainerColor,
    )
}

/**
 * Immutable class representing the colors used for the date picker view.
 *
 * @property headerColors The colors used for the header of the date picker.
 * @property datePickerGridColors The colors used for the various cells in the date picker grid.
 * @property containerColor The color of the container for the date picker view.
 * @property elevatedContainerColor The color of the container for the date picker view when it is elevated.
 */
@Immutable
class DatePickerViewColors internal constructor(
    internal val headerColors: DatePickerHeaderColors,
    internal val datePickerGridColors: DatePickerGridColors,
    private val containerColor: Color,
    private val elevatedContainerColor: Color
) {

    /**
     * Returns the container color for the date picker view based on whether it is elevated.
     *
     * @param elevated Indicates whether the container is elevated.
     */
    @Composable
    internal fun containerColor(
        elevated: Boolean
    ): State<Color> {
        val targetValue = when (elevated) {
            true -> elevatedContainerColor
            false -> containerColor
        }
        return rememberUpdatedState(targetValue)
    }
}

/**
 * Immutable class representing the colors used for the header of the date picker.
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
 * Immutable class representing the colors used for the various cells in the date picker grid.
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
 * Immutable class representing the colors used for the day of the week cells in the date picker.
 *
 * @property dayOfWeekLabelColor The color of the label for the day of the week cell.
 */
@Immutable
class DatePickerDayOfWeekCellColors internal constructor(
    internal val dayOfWeekLabelColor: Color
)

/**
 * Immutable class representing the colors used for the day cells in the date picker.
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
    ): State<Color> {
        val targetValue = when {
            selected && !between -> cellTextSelectedColor
            between -> cellTextBetweenSelectionColor
            !enabled -> cellTextDisabledColor

            else -> cellTextColor
        }

        return rememberUpdatedState(targetValue)
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
    ): State<Color> {
        val targetValue = when {
            selected && !between -> selectedContainerColor
            between -> betweenSelectionContainerColor
            else -> containerColor
        }

        return rememberUpdatedState(targetValue)
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
    ): State<Color> {
        val targetValue = when {
            between && today -> currentDateBetweenSelectionIndicatorColor
            selected && today -> currentDateIndicatorSelectedColor
            today -> currentDateIndicator
            else -> Color.Transparent
        }

        return rememberUpdatedState(targetValue)
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
 * Immutable class representing the colors used for the month cells in the date picker.
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
    ): State<Color> {
        val targetValue = when {
            selected -> cellTextSelectedColor
            !enabled -> cellTextDisabledColor

            else -> cellTextColor
        }

        return rememberUpdatedState(targetValue)
    }

    /**
     * Returns the container color for the month cell based on whether it is selected.
     *
     * @param selected Indicates whether the month cell is selected.
     */
    @Composable
    internal fun containerColor(
        selected: Boolean,
    ): State<Color> {
        val targetValue = when {
            selected -> selectedContainerColor
            else -> containerColor
        }

        return rememberUpdatedState(targetValue)
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
    ): State<Color> {
        val targetValue = when {
            selected && !currentMonth -> Color.Transparent
            selected -> currentDateIndicatorSelectedColor
            currentMonth -> currentDateIndicator
            else -> Color.Transparent
        }

        return rememberUpdatedState(targetValue)
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
 * Immutable class representing the colors used for the year cells in the date picker.
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
    ): State<Color> {
        val targetValue = when {
            selected -> cellTextSelectedColor

            else -> cellTextColor
        }

        return rememberUpdatedState(targetValue)
    }

    /**
     * Returns the container color for the year cell based on whether it is selected.
     *
     * @param selected Indicates whether the year cell is selected.
     */
    @Composable
    internal fun containerColor(
        selected: Boolean,
    ): State<Color> {
        val targetValue = when {
            selected -> selectedContainerColor
            else -> containerColor
        }

        return rememberUpdatedState(targetValue)
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
    ): State<Color> {
        val targetValue = when {
            selected && !currentYear -> Color.Transparent
            selected -> currentDateIndicatorSelectedColor
            currentYear -> currentDateIndicator
            else -> Color.Transparent
        }

        return rememberUpdatedState(targetValue)
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