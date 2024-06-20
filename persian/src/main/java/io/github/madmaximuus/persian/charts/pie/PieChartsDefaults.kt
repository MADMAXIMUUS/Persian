package io.github.madmaximuus.persian.charts.pie

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import io.github.madmaximuus.persian.charts.util.ChartStyle
import io.github.madmaximuus.persian.foundation.PersianTheme

object PieChartsDefaults {

    @Composable
    fun style(
        titleStyle: TextStyle = PersianTheme.typography.titleLarge,
        titleColor: Color = PersianTheme.colorScheme.onSurface,
        subtitleStyle: TextStyle = PersianTheme.typography.headlineLarge,
        subtitleColor: Color = PersianTheme.colorScheme.onSurface,
        labelStyle: TextStyle = PersianTheme.typography.titleLarge,
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