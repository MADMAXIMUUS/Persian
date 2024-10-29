package io.github.madmaximuus.persian.timePicker.view.dial

import androidx.compose.material3.adaptive.currentWindowAdaptiveInfo
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.window.core.layout.WindowHeightSizeClass
import io.github.madmaximuus.persian.timePicker.state.AnalogTimePickerState
import io.github.madmaximuus.persian.timePicker.view.dial.horizontal.HorizontalTimePickerView
import io.github.madmaximuus.persian.timePicker.view.dial.vertical.VerticalTimePickerView

/**
 * Composable function to display the dial time picker view.
 *
 * This function determines whether to display the horizontal or vertical time picker view based on
 * the window height size class. It uses the provided state, modifier, colors, and sizes to customize
 * the appearance of the time picker.
 *
 * @param analogState The state of the analog time picker.
 * @param modifier The modifier to apply to the time picker view.
 * @param colors The colors to use for the time picker components.
 * @param sizes The sizes to use for the time picker components.
 */
@Composable
internal fun DialTimePickerView(
    analogState: AnalogTimePickerState,
    modifier: Modifier = Modifier,
    colors: DialTimePickerViewColors = DialTimePickerViewDefaults.colors(),
    sizes: DialTimePickerViewSizes,
) {
    val windowHeightSizeClass = currentWindowAdaptiveInfo().windowSizeClass.windowHeightSizeClass
    if (windowHeightSizeClass == WindowHeightSizeClass.COMPACT) {
        HorizontalTimePickerView(
            state = analogState,
            modifier = modifier,
            colors = colors,
            sizes = sizes
        )
    } else {
        VerticalTimePickerView(
            state = analogState,
            modifier = modifier,
            colors = colors,
            sizes = sizes
        )
    }
}