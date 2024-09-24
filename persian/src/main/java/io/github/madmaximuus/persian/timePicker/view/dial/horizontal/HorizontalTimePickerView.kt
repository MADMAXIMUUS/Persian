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
import io.github.madmaximuus.persian.segmentedButton.util.end
import io.github.madmaximuus.persian.segmentedButton.util.start
import io.github.madmaximuus.persian.timePicker.state.AnalogTimePickerState
import io.github.madmaximuus.persian.timePicker.state.TimePickerState
import io.github.madmaximuus.persian.timePicker.util.PeriodToggleMargin
import io.github.madmaximuus.persian.timePicker.view.dial.ClockDisplayNumbers
import io.github.madmaximuus.persian.timePicker.view.dial.ClockFace
import io.github.madmaximuus.persian.timePicker.view.dial.DialTimePickerViewColors
import io.github.madmaximuus.persian.timePicker.view.dial.DialTimePickerViewSizes
import io.github.madmaximuus.persian.timePicker.view.dial.PeriodToggleImpl

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