package io.github.madmaximuus.persian.charts.util

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle

/**
 * An immutable class representing the style of a chart.
 *
 * @constructor Creates a new [ChartStyle] instance with the specified styling properties.
 * @param titleStyle The [TextStyle] for the chart title.
 * @param titleColor The [Color] for the chart title.
 * @param subtitleStyle The [TextStyle] for the chart subtitle.
 * @param subtitleColor The [Color] for the chart subtitle.
 * @param labelStyle The [TextStyle] for the chart labels.
 * @param labelColor The [Color] for the chart labels.
 */
@Immutable
class ChartStyle internal constructor(
    val titleStyle: TextStyle,
    val titleColor: Color,
    val subtitleStyle: TextStyle,
    val subtitleColor: Color,
    val labelStyle: TextStyle,
    val labelColor: Color
)