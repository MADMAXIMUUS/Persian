package io.github.madmaximuus.persian.charts.pie

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import io.github.madmaximuus.persian.charts.util.ChartStyle
import io.github.madmaximuus.persian.foundation.extendedColorScheme

object PersianPieChartsDefaults {

    @Composable
    fun style(
        titleStyle: TextStyle = MaterialTheme.typography.titleLarge,
        titleColor: Color = MaterialTheme.extendedColorScheme.onSurface,
        subtitleStyle: TextStyle = MaterialTheme.typography.headlineLarge,
        subtitleColor: Color = MaterialTheme.extendedColorScheme.onSurface,
        labelStyle: TextStyle = MaterialTheme.typography.titleLarge,
        labelColor: Color = Color.White
    ): ChartStyle = ChartStyle(
        titleStyle = titleStyle,
        titleColor = titleColor,
        subtitleStyle = subtitleStyle,
        subtitleColor = subtitleColor,
        labelStyle = labelStyle,
        labelColor = labelColor
    )
}