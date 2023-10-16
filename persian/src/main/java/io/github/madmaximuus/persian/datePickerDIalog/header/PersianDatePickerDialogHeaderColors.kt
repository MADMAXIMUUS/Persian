package io.github.madmaximuus.persian.datePickerDIalog.header

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import io.github.madmaximuus.persian.buttons.ButtonColors
import io.github.madmaximuus.persian.buttons.PersianButtonColors
import io.github.madmaximuus.persian.foundation.PersianComponentStyle
import io.github.madmaximuus.persian.foundation.extendedColorScheme
import io.github.madmaximuus.persian.iconButtons.IconButtonColors
import io.github.madmaximuus.persian.iconButtons.PersianIconButtonColors

@Immutable
class DatePickerDialogHeaderColors(
    val prevButtonColor: IconButtonColors,
    val nextButtonColor: IconButtonColors,
    val monthLabelColor: Color,
    val yearLabelColor: Color,
    val selectMonthColor: ButtonColors,
    val selectYearColor: ButtonColors
)

object PersianDatePickerDialogHeaderColors {

    @Composable
    fun primary(
        prevButtonColor: IconButtonColors = PersianIconButtonColors.primary(style = PersianComponentStyle.FILL),
        nextButtonColor: IconButtonColors = PersianIconButtonColors.primary(style = PersianComponentStyle.FILL),
        monthLabelColor: Color = MaterialTheme.extendedColorScheme.primary,
        yearLabelColor: Color = MaterialTheme.extendedColorScheme.primary,
        selectMonthColor: ButtonColors = PersianButtonColors.tertiary(),
        selectYearColor: ButtonColors = PersianButtonColors.tertiary(),
    ) = remember(
        prevButtonColor,
        nextButtonColor,
        monthLabelColor,
        yearLabelColor,
        selectMonthColor,
        selectYearColor,
    ) {
        DatePickerDialogHeaderColors(
            prevButtonColor = prevButtonColor,
            nextButtonColor = nextButtonColor,
            monthLabelColor = monthLabelColor,
            yearLabelColor = yearLabelColor,
            selectMonthColor = selectMonthColor,
            selectYearColor = selectYearColor,
        )
    }
}