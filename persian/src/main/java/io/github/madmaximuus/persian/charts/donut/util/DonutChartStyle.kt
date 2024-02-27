package io.github.madmaximuus.persian.charts.donut.util

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle

@Immutable
class DonutChartStyle internal constructor(
    val titleStyle: TextStyle,
    val titleColor: Color,
    val subtitleStyle: TextStyle,
    val subtitleColor: Color,
    val labelStyle: TextStyle,
    val labelColor: Color
)