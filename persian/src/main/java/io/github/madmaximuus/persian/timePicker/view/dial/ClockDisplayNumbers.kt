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

/**
 * Composable function to display the clock display numbers.
 *
 * This function arranges the hour and minute selectors along with a separator in a row.
 * It uses the provided state, colors, and sizes to customize the appearance of the clock display numbers.
 *
 * @param state The state of the time picker.
 * @param colors The colors to use for the clock display numbers.
 * @param sizes The sizes to use for the clock display numbers.
 */
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

/**
 * Composable function to display a time selector.
 *
 * This function renders a time selector based on the provided value, state, selection mode, colors,
 * and sizes. The selector is highlighted if it is the currently selected item.
 *
 * @param modifier The modifier to apply to the time selector.
 * @param value The value to display in the time selector.
 * @param state The state of the time picker.
 * @param selection The current selection mode of the time picker.
 * @param colors The colors to use for the time selector.
 * @param sizes The sizes to use for the time selector.
 */
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


/**
 * Composable function to display the separator between the hour and minute selectors.
 *
 * This function renders a colon (:) as the separator, centered within the provided modifier.
 * The separator uses the specified sizes and colors from the theme.
 *
 * @param modifier The modifier to apply to the separator.
 * @param sizes The sizes to use for the separator.
 */
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