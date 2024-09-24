package io.github.madmaximuus.persian.timePicker.view.dial

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.MeasurePolicy
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.isTraversalGroup
import androidx.compose.ui.semantics.selected
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import io.github.madmaximuus.persian.foundation.LocalContentColor
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.surface.Surface
import io.github.madmaximuus.persian.text.Text
import io.github.madmaximuus.persian.timePicker.state.TimePickerState
import io.github.madmaximuus.persian.timePicker.util.SeparatorZIndex

@Composable
internal fun PeriodToggleImpl(
    modifier: Modifier,
    state: TimePickerState,
    colors: DialTimePickerViewColors,
    sizes: DialTimePickerViewSizes,
    measurePolicy: MeasurePolicy,
    startShape: Shape,
    endShape: Shape,
) {
    val borderStroke = BorderStroke(1.dp, PersianTheme.colorScheme.primary)
    Layout(
        modifier =
        modifier
            .semantics {
                isTraversalGroup = true
                this.contentDescription = contentDescription
            }
            .selectableGroup()
            .border(border = borderStroke, shape = sizes.periodSelectorShape),
        measurePolicy = measurePolicy,
        content = {
            ToggleItem(
                checked = !state.isAfternoon,
                shape = startShape,
                onClick = { state.isAfternoon = false },
                colors = colors,
            ) {
                Text(
                    text = "AM",
                    color = LocalContentColor.current,
                    style = sizes.periodSelectorTextStyle
                )
            }
            Spacer(
                Modifier
                    .layoutId("Spacer")
                    .zIndex(SeparatorZIndex)
                    .fillMaxSize()
                    .background(color = PersianTheme.colorScheme.primary)
            )
            ToggleItem(
                checked = state.isAfternoon,
                shape = endShape,
                onClick = { state.isAfternoon = true },
                colors = colors,
            ) {
                Text(
                    text = "PM",
                    color = LocalContentColor.current,
                    style = sizes.periodSelectorTextStyle
                )
            }
        }
    )
}

@Composable
private fun ToggleItem(
    checked: Boolean,
    shape: Shape,
    onClick: () -> Unit,
    colors: DialTimePickerViewColors,
    content: @Composable () -> Unit,
) {
    val contentColor = colors.periodSelectorContentColor(checked)
    val containerColor = colors.periodSelectorContainerColor(checked)

    Surface(
        modifier = Modifier
            .zIndex(if (checked) 0f else 1f)
            .fillMaxSize()
            .semantics { selected = checked },
        shape = shape,
        onClick = onClick,
        color = containerColor,
        contentColor = contentColor
    ) {
        Box(contentAlignment = Alignment.Center) {
            content()
        }
    }
}