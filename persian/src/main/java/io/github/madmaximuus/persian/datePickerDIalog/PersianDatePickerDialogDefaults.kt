package io.github.madmaximuus.persian.datePickerDIalog

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import io.github.madmaximuus.persian.buttons.ButtonColors
import io.github.madmaximuus.persian.buttons.PersianButtonDefaults
import io.github.madmaximuus.persian.foundation.extendedColorScheme
import io.github.madmaximuus.persian.iconButtons.IconButtonColors
import io.github.madmaximuus.persian.iconButtons.PersianIconButtonDefaults

object PersianDatePickerDialogDefaults {

    @Composable
    fun headerColors(
        prevButtonColor: IconButtonColors = PersianIconButtonDefaults.primaryIconButtonColors(),
        nextButtonColor: IconButtonColors = PersianIconButtonDefaults.primaryIconButtonColors(),
        monthLabelColor: Color = MaterialTheme.extendedColorScheme.primary,
        yearLabelColor: Color = MaterialTheme.extendedColorScheme.primary,
        selectMonthColor: ButtonColors = PersianButtonDefaults.tertiaryColors(),
        selectYearColor: ButtonColors = PersianButtonDefaults.tertiaryColors(),
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

@Immutable
class DatePickerDialogHeaderColors(
    val prevButtonColor: IconButtonColors,
    val nextButtonColor: IconButtonColors,
    val monthLabelColor: Color,
    val yearLabelColor: Color,
    val selectMonthColor: ButtonColors,
    val selectYearColor: ButtonColors
)
