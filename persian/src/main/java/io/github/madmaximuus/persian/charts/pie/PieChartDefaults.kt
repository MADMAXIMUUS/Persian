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
     * @param titleStyle The title text style of this pie chart.
     * @param titleColor The title color of this pie chart.
     * @param subtitleStyle The subtitle text style of this pie chart.
     * @param subtitleColor The subtitle color of this pie chart.
     * @param labelStyle The label text style of this pie chart.
     * @param labelColor The label color of this pie chart.
     */
    @Composable
    fun style(
        titleStyle: TextStyle = PersianTheme.typography.titleMedium,
        titleColor: Color = PersianTheme.colorScheme.onSurface,
        subtitleStyle: TextStyle = PersianTheme.typography.headlineMedium,
        subtitleColor: Color = PersianTheme.colorScheme.onSurface,
        labelStyle: TextStyle = PersianTheme.typography.titleMedium,
        labelColor: Color = Color.White
    ): ChartStyle =
        ChartStyle(
            titleStyle = titleStyle,
            titleColor = titleColor,
            subtitleStyle = subtitleStyle,
            subtitleColor = subtitleColor,
            labelStyle = labelStyle,
            labelColor = labelColor
        )
}