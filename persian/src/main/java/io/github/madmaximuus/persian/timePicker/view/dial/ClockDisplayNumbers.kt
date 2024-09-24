package io.github.madmaximuus.persian.timePicker.view.dial

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.clearAndSetSemantics
import androidx.compose.ui.semantics.role
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.surface.Surface
import io.github.madmaximuus.persian.text.Text
import io.github.madmaximuus.persian.timePicker.state.TimePickerState
import io.github.madmaximuus.persian.timePicker.util.DisplaySeparatorWidth
import io.github.madmaximuus.persian.timePicker.util.TimePickerSelectionMode
import io.github.madmaximuus.persian.timePicker.util.hourForDisplay
import io.github.madmaximuus.persian.timePicker.util.toLocalString

@Composable
internal fun ClockDisplayNumbers(
    state: TimePickerState,
    colors: DialTimePickerViewColors,
    sizes: DialTimePickerViewSizes
) {
    CompositionLocalProvider(
        LocalLayoutDirection provides LayoutDirection.Ltr
    ) {
        Row {
            TimeSelector(
                modifier = Modifier.size(96.dp, 80.dp),
                value = state.hourForDisplay,
                state = state,
                selection = TimePickerSelectionMode.Hour,
                colors = colors,
                sizes = sizes
            )
            DisplaySeparator(
                modifier = Modifier.size(DisplaySeparatorWidth, 80.dp),
                sizes = sizes
            )
            TimeSelector(
                modifier = Modifier.size(96.dp, 80.dp),
                value = state.minute,
                state = state,
                selection = TimePickerSelectionMode.Minute,
                colors = colors,
                sizes = sizes
            )
        }
    }
}

@Composable
private fun TimeSelector(
    modifier: Modifier,
    value: Int,
    state: TimePickerState,
    selection: TimePickerSelectionMode,
    colors: DialTimePickerViewColors,
    sizes: DialTimePickerViewSizes
) {
    val selected = state.selection == selection

    val containerColor = colors.timeSelectorContainerColor(selected)
    val contentColor = colors.timeSelectorContentColor(selected)
    Surface(
        modifier = modifier.semantics(mergeDescendants = true) {
            role = Role.RadioButton
        },
        onClick = {
            if (selection != state.selection) {
                state.selection = selection
            }
        },
        selected = selected,
        shape = PersianTheme.shapes.shape12,
        color = containerColor,
    ) {
        Box(contentAlignment = Alignment.Center) {
            Text(
                text = value.toLocalString(minDigits = 2, isGroupingUsed = false, maxDigits = 2),
                color = contentColor,
                style = sizes.clockDisplayTextStyle
            )
        }
    }
}

@Composable
private fun DisplaySeparator(
    modifier: Modifier,
    sizes: DialTimePickerViewSizes
) {
    val style = sizes.clockDisplayTextStyle.copy(
        textAlign = TextAlign.Center,
        lineHeightStyle = LineHeightStyle(
            alignment = LineHeightStyle.Alignment.Center,
            trim = LineHeightStyle.Trim.Both
        )
    )
    Box(modifier = modifier.clearAndSetSemantics {}, contentAlignment = Alignment.Center) {
        Text(
            text = ":",
            color = PersianTheme.colorScheme.onSurface,
            style = style
        )
    }
}