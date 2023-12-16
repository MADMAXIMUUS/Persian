package io.github.madmaximuus.persian.charts.donut

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import io.github.madmaximuus.persian.charts.donut.util.DonutChartStyle
import io.github.madmaximuus.persian.foundation.extendedColorScheme

object PersianDonutChartsDefaults {

    @Composable
    fun style(
        titleStyle: TextStyle = MaterialTheme.typography.titleLarge,
        titleColor: Color = MaterialTheme.extendedColorScheme.onSurface,
        subtitleStyle: TextStyle = MaterialTheme.typography.headlineLarge,
        subtitleColor: Color = MaterialTheme.extendedColorScheme.onSurface,
        labelStyle: TextStyle = MaterialTheme.typography.titleLarge,
        labelColor: Color = MaterialTheme.extendedColorScheme.surface,
        gapPercent: Float = 0f,
    ): DonutChartStyle = DonutChartStyle(
        titleStyle = titleStyle,
        titleColor = titleColor,
        subtitleStyle = subtitleStyle,
        subtitleColor = subtitleColor,
        labelStyle = labelStyle,
        labelColor = labelColor,
        gapPercent = gapPercent
    )

}