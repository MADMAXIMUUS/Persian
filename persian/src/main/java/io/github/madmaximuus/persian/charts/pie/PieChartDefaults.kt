package io.github.madmaximuus.persian.charts.pie

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import io.github.madmaximuus.persian.charts.util.ChartStyle
import io.github.madmaximuus.persian.foundation.PersianTheme

/**
 * Contains the default values used by [PieChart].
 */
object PieChartDefaults {

    /**
     * Creates a [ChartStyle] that represents the default style used in a [PieChart].
     *
     * @param labelStyle The label text style of this pie chart.
     * @param labelColor The label color of this pie chart.
     */
    @Composable
    fun style(
        labelStyle: TextStyle = PersianTheme.typography.labelLarge,
        labelColor: Color = Color.White
    ): ChartStyle =
        ChartStyle(
            titleStyle = PersianTheme.typography.titleMedium,
            titleColor = PersianTheme.colorScheme.onSurface,
            subtitleStyle = PersianTheme.typography.headlineMedium,
            subtitleColor = PersianTheme.colorScheme.onSurface,
            labelStyle = labelStyle,
            labelColor = labelColor
        )
}