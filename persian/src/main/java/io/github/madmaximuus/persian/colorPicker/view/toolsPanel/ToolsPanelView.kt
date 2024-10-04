package io.github.madmaximuus.persian.colorPicker.view.toolsPanel

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.colorPicker.view.ColorPickerViewColors
import io.github.madmaximuus.persian.colorPicker.view.util.ColorPickerState
import io.github.madmaximuus.persian.colorPicker.view.util.ColorPreferences
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.text.Text

@Composable
fun ToolsPanelView(
    modifier: Modifier,
    state: ColorPickerState,
    colors: ColorPickerViewColors,
    colorsPreferences: ColorPreferences
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size8)
    ) {
        if (state.isSupportOpacity) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size4)
            ) {
                AlphaSliderView(
                    modifier = Modifier.weight(1f),
                    state = state,
                    colors = colors
                )
                Text(
                    modifier = Modifier.width(40.dp),
                    text = "${(state.alpha * 100).toInt()}%",
                    textAlign = TextAlign.Center,
                    style = PersianTheme.typography.bodyMedium,
                    color = PersianTheme.colorScheme.onSurface
                )
            }
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size8)
        ) {
            Box(
                modifier = Modifier
                    .size(70.dp)
                    .background(
                        state.selectedColor,
                        PersianTheme.shapes.shape10
                    )
            )
            SavedColorView(
                state = state,
                colorPreferences = colorsPreferences
            )
        }
    }
}