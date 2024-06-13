package io.github.madmaximuus.persian.datePicker.view.header

import android.icu.util.Calendar
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.expandIn
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkOut
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.tooling.preview.Preview
import io.github.madmaximuus.persian.buttons.PersianButtonDefaults
import io.github.madmaximuus.persian.buttons.PersianTertiaryButton
import io.github.madmaximuus.persian.datePicker.view.DatePickerHeaderColors
import io.github.madmaximuus.persian.datePicker.view.PersianDatePickerViewDefaults
import io.github.madmaximuus.persian.datePicker.view.util.DatePickerDisplayMode
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.iconButtons.PersianPrimaryIconButton
import io.github.madmaximuus.persian.surface.Surface
import io.github.madmaximuus.persian.text.Text
import io.github.madmaximuus.persianSymbols.chevronDown.base.ChevronDown
import io.github.madmaximuus.persianSymbols.chevronLeft.base.ChevronLeft
import io.github.madmaximuus.persianSymbols.chevronRight.base.ChevronRight
import io.github.madmaximuus.persianSymbols.chevronUp.base.ChevronUp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols
import java.text.SimpleDateFormat
import java.util.Locale

@Composable
internal fun PersianDatePickerDialogHeader(
    modifier: Modifier = Modifier,
    isPrevDisabled: Boolean,
    isNextDisabled: Boolean,
    navigationDisabled: Boolean,
    mode: DatePickerDisplayMode,
    date: Calendar,
    selectable: Boolean,
    onNextClick: () -> Unit,
    onPrevClick: () -> Unit,
    onMonthClick: () -> Unit,
    onYearClick: () -> Unit,
    colors: DatePickerHeaderColors,
) {

    val enterTransition = expandIn(expandFrom = Alignment.Center, clip = false) + fadeIn()
    val exitTransition = shrinkOut(shrinkTowards = Alignment.Center, clip = false) + fadeOut()

    var monthIconDown by remember { mutableStateOf(false) }
    var yearIconDown by remember { mutableStateOf(false) }

    val monthFormat = SimpleDateFormat("LLL", Locale.getDefault())
    val yearFormat = SimpleDateFormat("YYYY", Locale.getDefault())
    val month = monthFormat.format(date.timeInMillis)
    val year = yearFormat.format(date.timeInMillis)

    LaunchedEffect(mode) {
        when (mode) {
            DatePickerDisplayMode.CALENDAR -> {
                monthIconDown = true
                yearIconDown = true
            }

            DatePickerDisplayMode.MONTH -> {
                monthIconDown = false
                yearIconDown = true
            }

            DatePickerDisplayMode.YEAR -> {
                monthIconDown = true
                yearIconDown = false
            }
        }
    }

    Box(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = PersianTheme.spacing.size4),
        contentAlignment = Alignment.Center
    ) {
        AnimatedVisibility(
            modifier = Modifier.align(Alignment.CenterStart),
            visible = !navigationDisabled && !isPrevDisabled,
            enter = enterTransition,
            exit = exitTransition
        )
        {
            PersianPrimaryIconButton(
                icon = rememberVectorPainter(image = PersianSymbols.Default.ChevronLeft),
                colors = colors.prevButtonColor,
                enabled = !navigationDisabled && !isPrevDisabled,
                onClick = onPrevClick
            )
        }
        if (selectable) {
            Row {
                PersianTertiaryButton(
                    text = month,
                    trailingIcon = if (monthIconDown) rememberVectorPainter(image = PersianSymbols.Default.ChevronDown)
                    else rememberVectorPainter(image = PersianSymbols.Default.ChevronUp),
                    colors = colors.selectedMonthColor,
                    sizes = PersianButtonDefaults.smallSizes(),
                    onClick = onMonthClick
                )
                PersianTertiaryButton(
                    text = year,
                    trailingIcon = if (yearIconDown) rememberVectorPainter(image = PersianSymbols.Default.ChevronDown)
                    else rememberVectorPainter(image = PersianSymbols.Default.ChevronUp),
                    colors = colors.selectedYearColor,
                    sizes = PersianButtonDefaults.smallSizes(),
                    onClick = onYearClick
                )
            }
        } else {
            Row(
                horizontalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size8),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = month,
                    color = colors.monthLabelColor,
                    style = PersianTheme.typography.labelLarge
                )
                Text(
                    text = year,
                    color = colors.yearLabelColor,
                    style = PersianTheme.typography.labelLarge
                )
            }
        }
        AnimatedVisibility(
            modifier = Modifier.align(Alignment.CenterEnd),
            visible = !navigationDisabled && !isNextDisabled,
            enter = enterTransition,
            exit = exitTransition
        ) {
            PersianPrimaryIconButton(
                icon = rememberVectorPainter(image = PersianSymbols.Default.ChevronRight),
                colors = colors.nextButtonColor,
                enabled = !navigationDisabled && !isNextDisabled,
                onClick = onNextClick
            )
        }
    }
}

@Preview
@Composable
fun HeaderPreview() {
    PersianTheme {
        Surface {
            PersianDatePickerDialogHeader(
                mode = DatePickerDisplayMode.CALENDAR,
                selectable = true,
                date = Calendar.getInstance().apply {
                    firstDayOfWeek = Calendar.MONDAY
                },
                isNextDisabled = false,
                isPrevDisabled = false,
                navigationDisabled = false,
                onNextClick = {},
                onPrevClick = {},
                onYearClick = {},
                onMonthClick = {},
                colors = PersianDatePickerViewDefaults.headerColors()
            )
        }
    }
}