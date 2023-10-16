package io.github.madmaximuus.persian.datePickerDIalog.header

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
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import io.github.madmaximuus.persian.buttons.PersianButton
import io.github.madmaximuus.persian.buttons.PersianButtonSizes
import io.github.madmaximuus.persian.datePickerDIalog.util.DatePickerDisplayMode
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.icons
import io.github.madmaximuus.persian.foundation.spacing
import io.github.madmaximuus.persian.iconButtons.PersianIconButton
import java.text.SimpleDateFormat
import java.util.Locale

internal object PersianDatePickerDialogHeader {

    @Composable
    fun Primary(
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
        colors: DatePickerDialogHeaderColors = PersianDatePickerDialogHeaderColors.primary(),
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
                .padding(horizontal = MaterialTheme.spacing.extraSmall),
            contentAlignment = Alignment.Center
        ) {
            AnimatedVisibility(
                modifier = Modifier.align(Alignment.CenterStart),
                visible = !navigationDisabled && !isPrevDisabled,
                enter = enterTransition,
                exit = exitTransition
            )
            {
                PersianIconButton.Primary(
                    icon = MaterialTheme.icons.chevronLeft,
                    colors = colors.prevButtonColor,
                    enabled = !navigationDisabled && !isPrevDisabled,
                    onClick = onPrevClick
                )
            }
            if (selectable) {
                Row {
                    PersianButton.Tertiary(
                        text = month,
                        trailingIcon = if (monthIconDown) MaterialTheme.icons.expandCircleDown
                        else MaterialTheme.icons.expandCircleUp,
                        colors = colors.selectMonthColor,
                        sizes = PersianButtonSizes.small(),
                        onClick = onMonthClick
                    )
                    PersianButton.Tertiary(
                        text = year,
                        trailingIcon = if (yearIconDown) MaterialTheme.icons.expandCircleDown
                        else MaterialTheme.icons.expandCircleUp,
                        colors = colors.selectYearColor,
                        sizes = PersianButtonSizes.small(),
                        onClick = onYearClick
                    )
                }
            } else {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.small),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = month,
                        color = colors.monthLabelColor,
                        style = MaterialTheme.typography.labelLarge
                    )
                    Text(
                        text = year,
                        color = colors.yearLabelColor,
                        style = MaterialTheme.typography.labelLarge
                    )
                }
            }
            AnimatedVisibility(
                modifier = Modifier.align(Alignment.CenterEnd),
                visible = !navigationDisabled && !isNextDisabled,
                enter = enterTransition,
                exit = exitTransition
            ) {
                PersianIconButton.Primary(
                    icon = MaterialTheme.icons.chevronRight,
                    colors = colors.nextButtonColor,
                    enabled = !navigationDisabled && !isNextDisabled,
                    onClick = onNextClick
                )
            }
        }
    }

}

@Preview
@Composable
fun HeaderPreview() {
    PersianTheme {
        Surface {
            PersianDatePickerDialogHeader.Primary(
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
                onMonthClick = {}
            )
        }
    }
}