package io.github.madmaximuus.persian.charts.donut

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.scale
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.drawText
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.charts.util.ChartConfig
import io.github.madmaximuus.persian.charts.util.ChartData
import io.github.madmaximuus.persian.charts.util.ChartStyle
import io.github.madmaximuus.persian.charts.util.degreeToAngle
import io.github.madmaximuus.persian.charts.util.rememberChartState
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.text.Text
import java.lang.Integer.min
import kotlin.math.cos
import kotlin.math.sin

/**
 * A donut chart is useful for visualizing proportions or shares of a whole,
 * with the added benefit of a central space for displaying additional information
 * or key metrics. It enhances readability and aesthetic appeal, making it an effective tool
 * for presenting data in a compact and engaging manner.
 *
 * @param data A list of [ChartData] objects representing the data points to be displayed in the chart.
 * @param config A [ChartConfig] object containing the configuration settings for the chart.
 * @param modifier A [Modifier] to apply to this composable.
 * @param style A [ChartStyle] object to customize the appearance of the chart.
 * @param title An optional title for the chart.
 * @param subtitle An optional subtitle for the chart.
 * @param size The size of the chart in [Dp].
 */
@Composable
fun DonutChart(
    data: List<ChartData>,
    config: ChartConfig,
    modifier: Modifier = Modifier,
    style: ChartStyle = DonutChartDefaults.style(),
    title: String? = null,
    subtitle: String? = null,
    size: Dp = 320.dp,
) {
    val state = rememberChartState(data, config, style)

    val strokeCoeff = if (config.showLabel) 0.45f else 0.2f
    val borderWidth = if (config.showLabel) 8.dp else 6.dp
    val innerRadius: Dp = (size - (size * strokeCoeff)) / 2
    val measurer = rememberTextMeasurer()
    val textStyle = style.labelStyle.copy(color = style.labelColor)
    var center by remember { mutableStateOf(Offset.Zero) }
    var scale by remember { mutableFloatStateOf(1f) }

    var startAngle = 0f

    BoxWithConstraints(
        modifier = modifier
            .size(size),
        contentAlignment = Alignment.Center
    ) {
        val canvasSize = min(constraints.maxWidth, constraints.maxHeight)
        val canvasSizeDp = with(LocalDensity.current) { canvasSize.toDp() }
        val borderColor = PersianTheme.colorScheme.surface
        val backgroundColor = PersianTheme.colorScheme.surface
        Canvas(
            modifier = modifier
                .size(canvasSizeDp)
                .pointerInput(Unit) {
                    detectTapGestures(
                        onTap = { tapOffset ->
                            if (config.selectable) {
                                state.handleTap(
                                    center = center,
                                    tapOffset = tapOffset,
                                    innerRadius = innerRadius.toPx(),
                                    outerRadius = ((size / 2 + innerRadius) * 1.3f).toPx()
                                )
                            }
                        }
                    )
                },
            onDraw = {
                center = this.center
                state.data.forEach { data ->
                    scale = if (data.isSelected) 1.1f else 1f
                    val angleInRadians = (startAngle + data.angle / 2).degreeToAngle
                    val text = "%.1f".format(data.value)
                        .trimEnd { it == '0' }
                        .trimEnd { it == '.' } + "%"
                    val measurement = measurer.measure(text, textStyle)
                    scale(scale) {
                        drawArc(
                            color = data.color,
                            startAngle = startAngle,
                            sweepAngle = data.angle,
                            useCenter = true,
                            size = this.size,
                            style = Fill
                        )
                        if (config.divided) {
                            drawArc(
                                color = borderColor,
                                startAngle = startAngle,
                                sweepAngle = data.angle,
                                useCenter = true,
                                style = Stroke(width = borderWidth.toPx())
                            )
                        }
                    }
                    if (config.showLabel) {
                        drawText(
                            textMeasurer = measurer,
                            text = text,
                            style = textStyle,
                            size = Size(
                                measurement.size.width.toFloat(),
                                measurement.size.height.toFloat()
                            ),
                            topLeft = Offset(
                                center.x
                                        - measurement.size.width / 2
                                        + (innerRadius.toPx()
                                        + ((size / 2 - innerRadius) / 2).toPx())
                                        * cos(angleInRadians) * scale,
                                center.y
                                        - measurement.size.height / 2
                                        + (innerRadius.toPx()
                                        + ((size / 2 - innerRadius) / 2).toPx())
                                        * sin(angleInRadians) * scale
                            )
                        )
                    }
                    startAngle += data.angle
                }
                drawCircle(
                    color = backgroundColor,
                    center = center,
                    radius = innerRadius.toPx()
                )
            }
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            title?.let {
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = it,
                    style = style.titleStyle,
                    color = style.titleColor,
                    textAlign = TextAlign.Center,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
            }
            if (subtitle != null || config.showTotalValueAsSubtitle) {
                val text = if (config.showTotalValueAsSubtitle)
                    state.totalValue.toString().trimEnd { it == '0' }.trimEnd { it == '.' }
                else subtitle.toString()
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = text,
                    style = style.subtitleStyle,
                    color = style.subtitleColor,
                    textAlign = TextAlign.Center,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
    }
}