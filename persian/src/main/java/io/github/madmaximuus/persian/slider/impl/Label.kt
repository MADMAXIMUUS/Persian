package io.github.madmaximuus.persian.slider.impl

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.text.style.TextAlign
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.slider.SliderColors
import io.github.madmaximuus.persian.slider.SliderDefaults
import io.github.madmaximuus.persian.text.Text
import java.util.Locale

/**
 * Composable function to create a label displaying the value of a slider.
 *
 * This function creates a label with a specified value, background color, and text style.
 * The label is centered within a box and displays the value formatted to one decimal place.
 *
 * @param modifier The modifier to be applied to the label.
 * @param value The value to be displayed in the label.
 * @param colors The colors to be used for the label, including the container color and text color.
 */
@Composable
internal fun Label(
    modifier: Modifier = Modifier,
    value: Float,
    colors: SliderColors = SliderDefaults.colors()
) {
    Box(
        modifier = modifier
            .background(color = colors.labelContainerColor, PersianTheme.shapes.full),
        contentAlignment = Alignment.Center
    ) {
        Text(
            textAlign = TextAlign.Center,
            text = String.format(Locale.getDefault(), "%.1f", value),
            color = colors.labelTextColor,
            style = PersianTheme.typography.labelLarge.copy(baselineShift = BaselineShift.None)
        )
    }
}