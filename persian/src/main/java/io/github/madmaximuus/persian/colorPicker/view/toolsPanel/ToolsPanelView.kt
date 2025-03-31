package io.github.madmaximuus.persian.colorPicker.view.toolsPanel

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.colorPicker.view.ColorPickerViewColors
import io.github.madmaximuus.persian.colorPicker.view.util.ColorPickerState
import io.github.madmaximuus.persian.colorPicker.view.util.ColorPreferences
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.text.Text

/**
 * A composable function that represents a tools panel view for a color picker.
 *
 * This function displays a panel with various tools for interacting with the color picker, based on the provided [state], [colors], and [colorsPreferences].
 * The panel includes an alpha slider for adjusting the opacity of the selected color (if supported), a preview box displaying the selected color, and a view for saved colors.
 *
 * @param modifier The modifier to be applied to the layout.
 * @param state The state of the color picker.
 * @param colors The colors used for the view, which includes various UI elements such as the background, text, and borders.
 * @param colorsPreferences The preferences for saving colors, which handles the persistence of saved colors.
 */
@Composable
fun ToolsPanelView(
    modifier: Modifier,
    state: ColorPickerState,
    colors: ColorPickerViewColors,
    colorsPreferences: ColorPreferences
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size16)
    ) {
        if (state.isSupportOpacity) {
            Row(
                modifier = Modifier
                    .height(40.dp)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size6)
            ) {
                AlphaSliderView(
                    modifier = Modifier.weight(1f),
                    state = state,
                    colors = colors
                )
                Box(
                    modifier = Modifier
                        .fillMaxHeight()
                        .background(
                            PersianTheme.colorScheme.surfaceContainerHighest,
                            PersianTheme.shapes.shape14
                        )
                        .padding(horizontal = PersianTheme.spacing.size14),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        modifier = Modifier.width(43.dp),
                        text = "${(state.alpha * 100).toInt()}%",
                        textAlign = TextAlign.Center,
                        style = PersianTheme.typography.titleMedium.copy(baselineShift = BaselineShift.None),
                        color = PersianTheme.colorScheme.onSurface
                    )
                }
            }
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size12)
        ) {
            Box(
                modifier = Modifier
                    .size(88.dp)
                    .background(
                        color = state.selectedColor,
                        shape = PersianTheme.shapes.shape14
                    )
            )
            SavedColorView(
                state = state,
                colorPreferences = colorsPreferences
            )
        }
    }
}