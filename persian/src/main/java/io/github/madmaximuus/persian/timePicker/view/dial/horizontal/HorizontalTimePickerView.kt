package io.github.madmaximuus.persian.timePicker.view.dial.horizontal

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.MeasurePolicy
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.fastFilter
import androidx.compose.ui.util.fastFirst
import androidx.compose.ui.util.fastMap
import io.github.madmaximuus.persian.timePicker.state.AnalogTimePickerState
import io.github.madmaximuus.persian.timePicker.state.TimePickerState
import io.github.madmaximuus.persian.timePicker.util.PeriodToggleMargin
import io.github.madmaximuus.persian.timePicker.util.end
import io.github.madmaximuus.persian.timePicker.util.start
import io.github.madmaximuus.persian.timePicker.view.dial.ClockDisplayNumbers
import io.github.madmaximuus.persian.timePicker.view.dial.ClockFace
import io.github.madmaximuus.persian.timePicker.view.dial.DialTimePickerViewColors
import io.github.madmaximuus.persian.timePicker.view.dial.DialTimePickerViewSizes
import io.github.madmaximuus.persian.timePicker.view.dial.PeriodToggleImpl

/**
 * Composable function to display a horizontal time picker view.
 *
 * This function arranges the horizontal clock display and the clock face in a row, with some spacing
 * between them. It uses the provided state, colors, and sizes to customize the appearance of the time picker.
 *
 * @param state The state of the analog time picker.
 * @param modifier The modifier to apply to the row.
 * @param colors The colors to use for the time picker components.
 * @param sizes The sizes to use for the time picker components.
 */
@Composable
internal fun HorizontalTimePickerView(
    state: AnalogTimePickerState,
    modifier: Modifier = Modifier,
    colors: DialTimePickerViewColors,
    sizes: DialTimePickerViewSizes,
) {
    Row(
        modifier = modifier.padding(bottom = 24.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        HorizontalClockDisplay(state, colors, sizes)
        Spacer(modifier = Modifier.width(18.dp))
        ClockFace(state, colors, sizes)
    }
}

/**
 * Composable function to display the horizontal clock display.
 *
 * This function arranges the clock display numbers and the period toggle (if applicable) in a column.
 * The period toggle is only displayed if the time picker is not in 24-hour format.
 *
 * @param state The state of the time picker.
 * @param colors The colors to use for the clock display.
 * @param sizes The sizes to use for the clock display.
 */
@Composable
private fun HorizontalClockDisplay(
    state: TimePickerState,
    colors: DialTimePickerViewColors,
    sizes: DialTimePickerViewSizes
) {
    Column(verticalArrangement = Arrangement.Center) {
        ClockDisplayNumbers(state, colors, sizes)
        if (!state.is24hour) {
            Box(modifier = Modifier.padding(top = PeriodToggleMargin)) {
                HorizontalPeriodToggle(
                    modifier = Modifier.size(216.dp, 38.dp),
                    state = state,
                    colors = colors,
                    sizes = sizes
                )
            }
        }
    }
}

/**
 * Composable function to implement the period toggle.
 *
 * This function should be implemented to render the period toggle (AM/PM) based on the provided
 * state, colors, sizes, measure policy, and shapes.
 *
 * @param modifier The modifier to apply to the period toggle.
 * @param state The state of the time picker.
 * @param colors The colors to use for the period toggle.
 * @param sizes The sizes to use for the period toggle.
 */
@Composable
private fun HorizontalPeriodToggle(
    modifier: Modifier,
    state: TimePickerState,
    colors: DialTimePickerViewColors,
    sizes: DialTimePickerViewSizes,
) {
    val measurePolicy = remember {
        MeasurePolicy { measurables, constraints ->
            val spacer = measurables.fastFirst { it.layoutId == "Spacer" }
            val spacerPlaceable =
                spacer.measure(
                    constraints.copy(
                        minWidth = 0,
                        maxWidth = 1.dp.roundToPx(),
                    )
                )

            val items = measurables
                .fastFilter { it.layoutId != "Spacer" }
                .fastMap { item ->
                    item.measure(
                        constraints.copy(minWidth = 0, maxWidth = constraints.maxWidth / 2)
                    )
                }

            layout(constraints.maxWidth, constraints.maxHeight) {
                items[0].place(0, 0)
                items[1].place(items[0].width, 0)
                spacerPlaceable.place(items[0].width - spacerPlaceable.width / 2, 0)
            }
        }
    }

    val shape = sizes.periodSelectorShape as CornerBasedShape

    PeriodToggleImpl(
        modifier = modifier,
        state = state,
        colors = colors,
        sizes = sizes,
        measurePolicy = measurePolicy,
        startShape = shape.start(),
        endShape = shape.end()
    )
}