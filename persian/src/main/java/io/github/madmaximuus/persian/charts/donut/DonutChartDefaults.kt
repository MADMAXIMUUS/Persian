package io.github.madmaximuus.persian.charts.donut

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import io.github.madmaximuus.persian.charts.util.ChartStyle
import io.github.madmaximuus.persian.foundation.PersianTheme

/**
 * Contains the default values used by [DonutChart].
 */
object DonutChartDefaults {

    /**
     * Creates a [ChartStyle] that represents the default style used in a [DonutChart].
     *
     * @param titleStyle The title text style of this donut chart.
     * @param titleColor The title color of this donut chart.
     * @param subtitleStyle The subtitle text style of this donut chart.
     * @param subtitleColor The subtitle color of this donut chart.
     * @param labelStyle The label text style of this donut chart.
     * @param labelColor The label color of this donut chart.
     */
    @Composable
    fun style(
        titleStyle: TextStyle = PersianTheme.typography.titleLarge,
        titleColor: Color = PersianTheme.colorScheme.onSurface,
        subtitleStyle: TextStyle = PersianTheme.typography.headlineLarge,
        subtitleColor: Color = PersianTheme.colorScheme.onSurface,
        labelStyle: TextStyle = PersianTheme.typography.titleLarge,
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