package io.github.madmaximuus.persian.colorPicker.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.adaptive.currentWindowAdaptiveInfo
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.window.core.layout.WindowHeightSizeClass
import io.github.madmaximuus.persian.colorPicker.view.root.ColorPickersView
import io.github.madmaximuus.persian.colorPicker.view.root.HorizontalColorView
import io.github.madmaximuus.persian.colorPicker.view.root.VerticalColorView
import io.github.madmaximuus.persian.colorPicker.view.toolsPanel.ToolsPanelView
import io.github.madmaximuus.persian.colorPicker.view.util.ColorPickerDisplayMode
import io.github.madmaximuus.persian.colorPicker.view.util.ColorPickerState
import io.github.madmaximuus.persian.colorPicker.view.util.ColorPreferences
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.segmentedControls.tabs.Segment
import io.github.madmaximuus.persian.segmentedControls.tabs.SegmentedTabsDefaults
import io.github.madmaximuus.persian.segmentedControls.tabs.SegmentedTabsRow
import kotlinx.coroutines.launch

/**
 * A composable function that represents the main view of a color picker.
 *
 * This function displays the color picker interface, including a segmented button row for selecting the display mode,
 * and either a horizontal or vertical layout for the color picker and tools panel, depending on the window height size class.
 * The color picker state and colors are managed by the provided [state] and [colors] parameters.
 *
 * @param modifier The [Modifier] of this composable.
 * @param state The state of the color picker, which contains information about the selected color, display mode, and other configurations.
 * @param colors The colors used for the view, which includes various UI elements such as the background, text, and borders.
 */
@Composable
internal fun ColorPickerView(
    modifier: Modifier = Modifier,
    state: ColorPickerState,
    colors: ColorPickerViewColors
) {
    val windowHeightSizeClass = currentWindowAdaptiveInfo().windowSizeClass.windowHeightSizeClass
    val context = LocalContext.current
    val colorsPreferences = remember { ColorPreferences(context) }
    val scope = rememberCoroutineScope()
    LaunchedEffect(Unit) {
        scope.launch {
            val newList = colorsPreferences.loadColors()
            state.savedColors = newList.ifEmpty {
                listOf(
                    Color.Red,
                    Color.Cyan,
                    Color.Yellow,
                    Color.Blue,
                    Color.Magenta,
                    Color.Green,
                )
            }.toMutableList().apply {
                add(Color.Unspecified)
            }
        }
    }
    Column(
        modifier = modifier
            .padding(horizontal = PersianTheme.spacing.size12)
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        SegmentedTabsRow(
            modifier = Modifier.fillMaxWidth(),
            colors = colors.segmentedTabsColors,
            sizes = SegmentedTabsDefaults.smallSizes(),
            selectedIndex = when (state.mode) {
                ColorPickerDisplayMode.GRID -> 0
                ColorPickerDisplayMode.SPECTRUM -> 1
                ColorPickerDisplayMode.SLIDERS -> 2
            }
        ) {
            Segment(
                selected = state.mode == ColorPickerDisplayMode.GRID,
                label = "Grid",
                onClick = state::moveToGrid
            )
            Segment(
                selected = state.mode == ColorPickerDisplayMode.SPECTRUM,
                label = "Spectrum",
                onClick = state::moveToSpectrum
            )
            Segment(
                selected = state.mode == ColorPickerDisplayMode.SLIDERS,
                label = "Sliders",
                onClick = state::moveToSliders
            )
        }
        Spacer(modifier = Modifier.height(PersianTheme.spacing.size14))
        if (windowHeightSizeClass == WindowHeightSizeClass.COMPACT) {
            HorizontalColorView(
                leftColumn = {
                    ColorPickersView(
                        modifier = Modifier.weight(1f),
                        state = state,
                        colors = colors
                    )
                },
                rightColumn = {
                    ToolsPanelView(
                        modifier = Modifier.weight(1.2f),
                        state = state,
                        colors = colors,
                        colorsPreferences = colorsPreferences
                    )
                }
            )
        } else {
            VerticalColorView(
                topRow = {
                    ColorPickersView(
                        modifier = Modifier,
                        state = state,
                        colors = colors
                    )
                },
                bottomRow = {
                    ToolsPanelView(
                        modifier = Modifier,
                        state = state,
                        colors = colors,
                        colorsPreferences = colorsPreferences
                    )
                }
            )
        }
    }
}