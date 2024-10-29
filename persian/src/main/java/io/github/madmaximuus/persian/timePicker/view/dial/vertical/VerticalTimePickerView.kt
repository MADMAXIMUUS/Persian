package io.github.madmaximuus.persian.timePicker.view.dial.vertical

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.MeasurePolicy
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.semantics.isTraversalGroup
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.fastFilter
import androidx.compose.ui.util.fastFirst
import androidx.compose.ui.util.fastMap
import io.github.madmaximuus.persian.timePicker.state.AnalogTimePickerState
import io.github.madmaximuus.persian.timePicker.state.TimePickerState
import io.github.madmaximuus.persian.timePicker.util.PeriodToggleMargin
import io.github.madmaximuus.persian.timePicker.util.bottom
import io.github.madmaximuus.persian.timePicker.util.top
import io.github.madmaximuus.persian.timePicker.view.dial.ClockDisplayNumbers
import io.github.madmaximuus.persian.timePicker.view.dial.ClockFace
import io.github.madmaximuus.persian.timePicker.view.dial.DialTimePickerViewColors
import io.github.madmaximuus.persian.timePicker.view.dial.DialTimePickerViewSizes
import io.github.madmaximuus.persian.timePicker.view.dial.PeriodToggleImpl

/**
 * Composable function to display a vertical time picker view.
 *
 * This function arranges the vertical clock display, clock face, and spacers in a column, with
 * horizontal centering. It uses the provided state, colors, and sizes to customize the appearance
 * of the time picker.
 *
 * @param state The state of the analog time picker.
 * @param modifier The modifier to apply to the column.
 * @param colors The colors to use for the time picker components.
 * @param sizes The sizes to use for the time picker components.
 */
@Composable
internal fun VerticalTimePickerView(
    state: AnalogTimePickerState,
    modifier: Modifier = Modifier,
    colors: DialTimePickerViewColors,
    sizes: DialTimePickerViewSizes,
) {
    Column(
        modifier = modifier.semantics { isTraversalGroup = true },
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        VerticalClockDisplay(state, colors, sizes)
        Spacer(modifier = Modifier.height(36.dp))
        ClockFace(state, colors, sizes)
        Spacer(modifier = Modifier.height(24.dp))
    }
}

/**
 * Composable function to display the vertical clock display.
 *
 * This function arranges the clock display numbers and the period toggle (if applicable) in a row,
 * with horizontal centering. The period toggle is only displayed if the time picker is not in 24-hour format.
 *
 * @param state The state of the time picker.
 * @param colors The colors to use for the clock display.
 * @param sizes The sizes to use for the clock display.
 */
@Composable
private fun VerticalClockDisplay(
    state: TimePickerState,
    colors: DialTimePickerViewColors,
    sizes: DialTimePickerViewSizes
) {
    Row(horizontalArrangement = Arrangement.Center) {
        ClockDisplayNumbers(state, colors, sizes)
        if (!state.is24hour) {
            Box(modifier = Modifier.padding(start = PeriodToggleMargin)) {
                VerticalPeriodToggle(
                    modifier = Modifier.size(52.dp, 80.dp),
                    state = state,
                    colors = colors,
                    sizes = sizes
                )
            }
        }
    }
}

/**
 * Composable function to display the vertical period toggle.
 *
 * This function arranges the period toggle (AM/PM) in a vertical layout, with a spacer between
 * the two options. The layout is customized using a measure policy to ensure proper placement
 * of the items.
 *
 * @param modifier The modifier to apply to the period toggle.
 * @param state The state of the time picker.
 * @param colors The colors to use for the period toggle.
 * @param sizes The sizes to use for the period toggle.
 */
@Composable
private fun VerticalPeriodToggle(
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
                        minHeight = 0,
                        maxHeight = 1.dp.roundToPx()
                    )
                )

            val items =
                measurables
                    .fastFilter { it.layoutId != "Spacer" }
                    .fastMap { item ->
                        item.measure(
                            constraints.copy(minHeight = 0, maxHeight = constraints.maxHeight / 2)
                        )
                    }

            layout(constraints.maxWidth, constraints.maxHeight) {
                items[0].place(0, 0)
                items[1].place(0, items[0].height)
                spacerPlaceable.place(0, items[0].height - spacerPlaceable.height / 2)
            }
        }
    }

    val shape = sizes.clockDisplayShape as CornerBasedShape

    PeriodToggleImpl(
        modifier = modifier,
        state = state,
        colors = colors,
        sizes = sizes,
        measurePolicy = measurePolicy,
        startShape = shape.top(),
        endShape = shape.bottom()
    )
}