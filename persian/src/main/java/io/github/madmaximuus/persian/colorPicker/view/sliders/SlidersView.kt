package io.github.madmaximuus.persian.colorPicker.view.sliders

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.colorPicker.view.ColorPickerViewColors
import io.github.madmaximuus.persian.colorPicker.view.util.ColorPickerState
import io.github.madmaximuus.persian.colorPicker.view.util.resolveColor
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.slider.SliderColors
import io.github.madmaximuus.persian.slider.continuous.Slider
import io.github.madmaximuus.persian.text.Text
import java.util.Locale

/**
 * A composable function that represents a view with sliders for adjusting the RGB components of a color.
 *
 * @param state The state of the color picker, which contains information about the selected color and other configurations.
 * @param viewColors The colors used for the view, which includes various UI elements such as background, text, and borders.
 */
@Composable
internal fun SlidersView(
    state: ColorPickerState,
    viewColors: ColorPickerViewColors,
) {
    val rgb = state.getRGBColor()
    Column(
        modifier = Modifier
            .fillMaxWidth(),
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        SliderView(
            text = "Red",
            currentValue = rgb.red(),
            colors = viewColors.slidersColors,
            onValueChange = { newValue ->
                val resolvedColor = resolveColor(Color(newValue / 255, rgb.green(), rgb.blue()))
                state.colorHueState = resolvedColor.first
                state.colorSaturationState = resolvedColor.second
                state.colorValueState = resolvedColor.third
            }
        )
        SliderView(
            text = "Green",
            currentValue = rgb.green(),
            colors = viewColors.slidersColors,
            onValueChange = { newValue ->
                val resolvedColor = resolveColor(Color(rgb.red(), newValue / 255, rgb.blue()))
                state.colorHueState = resolvedColor.first
                state.colorSaturationState = resolvedColor.second
                state.colorValueState = resolvedColor.third
            }
        )
        SliderView(
            text = "Blue",
            currentValue = rgb.blue(),
            colors = viewColors.slidersColors,
            onValueChange = { newValue ->
                val resolvedColor = resolveColor(Color(rgb.red(), rgb.green(), newValue / 255))
                state.colorHueState = resolvedColor.first
                state.colorSaturationState = resolvedColor.second
                state.colorValueState = resolvedColor.third
            }
        )
    }
}

/**
 * A composable function that represents a slider view with a label and a value display.
 *
 * @param text The label text to be displayed above the slider.
 * @param range The range of values for the slider. Defaults to 0f..255f.
 * @param colors The colors used for the slider, which includes various UI elements such as the track and thumb.
 * @param currentValue The current value of the slider, which will be displayed as a formatted integer.
 * @param onValueChange A callback function that is invoked when the slider's value changes.
 */
@Composable
private fun SliderView(
    text: String,
    range: ClosedFloatingPointRange<Float> = 0f..255f,
    colors: SliderColors,
    currentValue: Float,
    onValueChange: (Float) -> Unit
) {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = text,
            style = PersianTheme.typography.bodyMedium,
            color = PersianTheme.colorScheme.onSurfaceVariant
        )
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size4)
        ) {
            Slider(
                modifier = Modifier.weight(1f),
                value = currentValue * 255,
                onValueChange = onValueChange,
                colors = colors,
                valueRange = range
            )
            Text(
                modifier = Modifier.width(35.dp),
                text = String.format(Locale.getDefault(), "%d", (currentValue * 255).toInt()),
                style = PersianTheme.typography.bodyMedium,
                color = PersianTheme.colorScheme.onSurfaceVariant,
                textAlign = TextAlign.Center
            )
        }
    }
}