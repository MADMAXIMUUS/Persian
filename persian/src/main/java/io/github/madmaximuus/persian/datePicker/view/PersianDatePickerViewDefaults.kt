package io.github.madmaximuus.persian.datePicker.view

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.State
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.Color
import io.github.madmaximuus.persian.buttons.ButtonColors
import io.github.madmaximuus.persian.buttons.PersianButtonDefaults
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.state38
import io.github.madmaximuus.persian.iconButtons.IconButtonColors
import io.github.madmaximuus.persian.iconButtons.PersianIconButtonDefaults

object PersianDatePickerViewDefaults {

    @Composable
    fun colors(
        headerColors: DatePickerHeaderColors = headerColors(),
        datePickerGridColors: DatePickerGridColors = gridColors(),
        containerColor: Color = Color.Transparent,
        elevatedContainerColor: Color = PersianTheme.colorScheme.surface1,
    ) = remember(
        headerColors,
        datePickerGridColors,
        containerColor,
        elevatedContainerColor
    ) {
        DatePickerViewColors(
            headerColors = headerColors,
            datePickerGridColors = datePickerGridColors,
            containerColor = containerColor,
            elevatedContainerColor = elevatedContainerColor
        )
    }

    @Composable
    fun headerColors(
        prevButtonColor: IconButtonColors = PersianIconButtonDefaults.primaryIconButtonColors(),
        nextButtonColor: IconButtonColors = PersianIconButtonDefaults.primaryIconButtonColors(),
        monthLabelColor: Color = PersianTheme.colorScheme.primary,
        yearLabelColor: Color = PersianTheme.colorScheme.primary,
        selectedMonthColor: ButtonColors = PersianButtonDefaults.tertiaryColors(),
        selectedYearColor: ButtonColors = PersianButtonDefaults.tertiaryColors(),
    ) = remember(
        prevButtonColor,
        nextButtonColor,
        monthLabelColor,
        yearLabelColor,
        selectedMonthColor,
        selectedYearColor,
    ) {
        DatePickerHeaderColors(
            prevButtonColor = prevButtonColor,
            nextButtonColor = nextButtonColor,
            monthLabelColor = monthLabelColor,
            yearLabelColor = yearLabelColor,
            selectedMonthColor = selectedMonthColor,
            selectedYearColor = selectedYearColor,
        )
    }

    @Composable
    fun gridColors(
        dayOfWeekLabelColors: DatePickerDayOfWeekCellColors = dayOfWeekLabelColors(),
        dayPickerDayCellColors: DatePickerDayCellColors = dayCellColors(),
        dayPickerMonthCellColors: DatePickerMonthCellColors = monthCellColors(),
        dayPickerYearCellColors: DatePickerYearCellColors = yearCellColors()
    ) = remember(
        dayOfWeekLabelColors,
        dayPickerDayCellColors,
        dayPickerMonthCellColors,
        dayPickerYearCellColors
    ) {
        DatePickerGridColors(
            dayOfWeekLabelColors = dayOfWeekLabelColors,
            dayPickerDayCellColors = dayPickerDayCellColors,
            dayPickerMonthCellColors = dayPickerMonthCellColors,
            dayPickerYearCellColors = dayPickerYearCellColors
        )
    }

    @Composable
    fun dayOfWeekLabelColors(
        label: Color = PersianTheme.colorScheme.onSurfaceVariant
    ) = remember(
        label
    ) {
        DatePickerDayOfWeekCellColors(label)
    }

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
    ) = remember(
        cellTextColor,
        cellTextDisabledColor,
        cellTextBetweenSelectionColor,
        cellTextSelectedColor,

        currentDateIndicator,
        currentDateBetweenSelectionIndicatorColor,
        currentDateIndicatorSelectedColor,

        containerColor,
        betweenSelectionContainerColor,
        selectedContainerColor,
    ) {
        DatePickerDayCellColors(
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
    }

    @Composable
    fun monthCellColors(
        cellTextColor: Color = PersianTheme.colorScheme.onSurface,
        cellTextDisabledColor: Color = PersianTheme.colorScheme.onSurface.state38,
        cellTextSelectedColor: Color = PersianTheme.colorScheme.onPrimary,

        currentDateIndicator: Color = PersianTheme.colorScheme.primary,
        currentDateIndicatorSelectedColor: Color = PersianTheme.colorScheme.onPrimary,

        backgroundColor: Color = Color.Transparent,
        selectedBackgroundColor: Color = PersianTheme.colorScheme.primary,
    ) = remember(
        cellTextColor,
        cellTextDisabledColor,
        cellTextSelectedColor,

        currentDateIndicator,
        currentDateIndicatorSelectedColor,

        backgroundColor,
        selectedBackgroundColor,
    ) {
        DatePickerMonthCellColors(
            cellTextColor = cellTextColor,
            cellTextDisabledColor = cellTextDisabledColor,
            cellTextSelectedColor = cellTextSelectedColor,

            currentDateIndicator = currentDateIndicator,
            currentDateIndicatorSelectedColor = currentDateIndicatorSelectedColor,

            containerColor = backgroundColor,
            selectedContainerColor = selectedBackgroundColor,
        )
    }

    @Composable
    fun yearCellColors(
        cellTextColor: Color = PersianTheme.colorScheme.onSurface,
        cellTextSelectedColor: Color = PersianTheme.colorScheme.onPrimary,

        currentDateIndicator: Color = PersianTheme.colorScheme.primary,
        currentDateIndicatorSelectedColor: Color = PersianTheme.colorScheme.onPrimary,

        containerColor: Color = Color.Transparent,
        selectedContainerColor: Color = PersianTheme.colorScheme.primary,
    ) = remember(
        cellTextColor,
        cellTextSelectedColor,

        currentDateIndicator,
        currentDateIndicatorSelectedColor,

        containerColor,
        selectedContainerColor,
    ) {
        DatePickerYearCellColors(
            cellTextColor = cellTextColor,
            cellTextSelectedColor = cellTextSelectedColor,

            currentDateIndicator = currentDateIndicator,
            currentDateIndicatorSelectedColor = currentDateIndicatorSelectedColor,

            containerColor = containerColor,
            selectedContainerColor = selectedContainerColor,
        )
    }


}

@Immutable
class DatePickerViewColors internal constructor(
    internal val headerColors: DatePickerHeaderColors,
    internal val datePickerGridColors: DatePickerGridColors,
    private val containerColor: Color,
    private val elevatedContainerColor: Color
) {
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

@Immutable
class DatePickerHeaderColors internal constructor(
    internal val prevButtonColor: IconButtonColors,
    internal val nextButtonColor: IconButtonColors,

    internal val monthLabelColor: Color,
    internal val yearLabelColor: Color,
    internal val selectedMonthColor: ButtonColors,
    internal val selectedYearColor: ButtonColors
)

@Immutable
class DatePickerGridColors internal constructor(
    internal val dayOfWeekLabelColors: DatePickerDayOfWeekCellColors,
    internal val dayPickerDayCellColors: DatePickerDayCellColors,
    internal val dayPickerMonthCellColors: DatePickerMonthCellColors,
    internal val dayPickerYearCellColors: DatePickerYearCellColors
)

@Immutable
class DatePickerDayOfWeekCellColors internal constructor(
    internal val dayOfWeekLabelColor: Color
)

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

@Immutable
class DatePickerYearCellColors internal constructor(
    private val cellTextColor: Color,
    private val cellTextSelectedColor: Color,

    private val currentDateIndicator: Color,
    private val currentDateIndicatorSelectedColor: Color,

    private val containerColor: Color,
    private val selectedContainerColor: Color,
) {
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