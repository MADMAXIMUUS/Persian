package io.github.madmaximuus.persian.slider.impl

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.text.style.TextAlign
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.slider.SliderColors
import io.github.madmaximuus.persian.slider.SliderDefaults

@Composable
internal fun Label(
    modifier: Modifier = Modifier,
    value: Float,
    colors: SliderColors = SliderDefaults.colors()
) {
    Box(
        modifier = modifier
            .background(color = colors.labelBackgroundColor, PersianTheme.shapes.full),
        contentAlignment = Alignment.Center
    ) {
        Text(
            textAlign = TextAlign.Center,
            text = String.format("%.1f", value),
            color = colors.labelTextColor,
            style = PersianTheme.typography.labelLarge.copy(baselineShift = BaselineShift.None)
        )
    }
}