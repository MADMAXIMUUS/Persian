package io.github.madmaximuus.persian.datePicker.view.header

import android.content.res.Configuration
import android.icu.util.Calendar
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.expandIn
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkOut
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.adaptive.currentWindowAdaptiveInfo
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
import androidx.window.core.layout.WindowHeightSizeClass
import io.github.madmaximuus.persian.button.ButtonDefaults
import io.github.madmaximuus.persian.button.TertiaryButton
import io.github.madmaximuus.persian.datePicker.view.DatePickerHeaderColors
import io.github.madmaximuus.persian.datePicker.view.PersianDatePickerViewDefaults
import io.github.madmaximuus.persian.datePicker.view.util.DatePickerDisplayMode
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.iconButton.PrimaryIconButton
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
internal fun DatePickerDialogHeader(
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
    val windowHeightSizeClass = currentWindowAdaptiveInfo().windowSizeClass.windowHeightSizeClass
    if (windowHeightSizeClass != WindowHeightSizeClass.COMPACT) {
        DatePickerViewPortraitHeader(
            modifier = modifier,
            isPrevDisabled = isPrevDisabled,
            isNextDisabled = isNextDisabled,
            navigationDisabled = navigationDisabled,
            mode = mode,
            date = date,
            selectable = selectable,
            onNextClick = onNextClick,
            onPrevClick = onPrevClick,
            onMonthClick = onMonthClick,
            onYearClick = onYearClick,
            colors = colors
        )
    } else {
        DatePickerViewLandscapeHeader(
            modifier = modifier,
            isPrevDisabled = isPrevDisabled,
            isNextDisabled = isNextDisabled,
            navigationDisabled = navigationDisabled,
            mode = mode,
            date = date,
            selectable = selectable,
            onNextClick = onNextClick,
            onPrevClick = onPrevClick,
            onMonthClick = onMonthClick,
            onYearClick = onYearClick,
            colors = colors
        )
    }
}

@Composable
internal fun DatePickerViewPortraitHeader(
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
        ) {
            PrimaryIconButton(
                icon = rememberVectorPainter(image = PersianSymbols.Default.ChevronLeft),
                colors = colors.prevButtonColor,
                enabled = !navigationDisabled && !isPrevDisabled,
                onClick = onPrevClick
            )
        }
        if (selectable) {
            Row {
                TertiaryButton(
                    text = month,
                    trailingIcon = if (monthIconDown) rememberVectorPainter(image = PersianSymbols.Default.ChevronDown)
                    else rememberVectorPainter(image = PersianSymbols.Default.ChevronUp),
                    colors = colors.selectedMonthColor,
                    sizes = ButtonDefaults.smallSizes(),
                    onClick = onMonthClick
                )
                TertiaryButton(
                    text = year,
                    trailingIcon = if (yearIconDown) rememberVectorPainter(image = PersianSymbols.Default.ChevronDown)
                    else rememberVectorPainter(image = PersianSymbols.Default.ChevronUp),
                    colors = colors.selectedYearColor,
                    sizes = ButtonDefaults.smallSizes(),
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
            PrimaryIconButton(
                icon = rememberVectorPainter(image = PersianSymbols.Default.ChevronRight),
                colors = colors.nextButtonColor,
                enabled = !navigationDisabled && !isNextDisabled,
                onClick = onNextClick
            )
        }
    }
}

@Composable
internal fun DatePickerViewLandscapeHeader(
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

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(
            if (selectable) PersianTheme.spacing.size4
            else PersianTheme.spacing.size8
        )
    ) {
        if (selectable) {
            Column(
                verticalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size4),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                TertiaryButton(
                    text = month,
                    trailingIcon = if (monthIconDown) rememberVectorPainter(image = PersianSymbols.Default.ChevronDown)
                    else rememberVectorPainter(image = PersianSymbols.Default.ChevronUp),
                    colors = colors.selectedMonthColor,
                    sizes = ButtonDefaults.smallSizes(),
                    onClick = onMonthClick
                )
                TertiaryButton(
                    text = year,
                    trailingIcon = if (yearIconDown) rememberVectorPainter(image = PersianSymbols.Default.ChevronDown)
                    else rememberVectorPainter(image = PersianSymbols.Default.ChevronUp),
                    colors = colors.selectedYearColor,
                    sizes = ButtonDefaults.smallSizes(),
                    onClick = onYearClick
                )
            }
        } else {
            Column(
                verticalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size8),
                horizontalAlignment = Alignment.CenterHorizontally
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
        Row(
            horizontalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size4)
        ) {
            AnimatedVisibility(
                visible = !navigationDisabled && !isPrevDisabled,
                enter = enterTransition,
                exit = exitTransition
            ) {
                PrimaryIconButton(
                    icon = rememberVectorPainter(image = PersianSymbols.Default.ChevronLeft),
                    colors = colors.prevButtonColor,
                    enabled = !navigationDisabled && !isPrevDisabled,
                    onClick = onPrevClick
                )
            }
            AnimatedVisibility(
                visible = !navigationDisabled && !isNextDisabled,
                enter = enterTransition,
                exit = exitTransition
            ) {
                PrimaryIconButton(
                    icon = rememberVectorPainter(image = PersianSymbols.Default.ChevronRight),
                    colors = colors.nextButtonColor,
                    enabled = !navigationDisabled && !isNextDisabled,
                    onClick = onNextClick
                )
            }
        }
    }
}

@Preview
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun HeaderPreview() {
    PersianTheme {
        Surface {
            DatePickerDialogHeader(
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