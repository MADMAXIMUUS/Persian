package io.github.madmaximuus.persian.charts.pie

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.BoxWithConstraints
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
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.charts.util.ChartConfig
import io.github.madmaximuus.persian.charts.util.ChartData
import io.github.madmaximuus.persian.charts.util.ChartStyle
import io.github.madmaximuus.persian.charts.util.degreeToAngle
import io.github.madmaximuus.persian.charts.util.rememberDonutChartState
import io.github.madmaximuus.persian.foundation.PersianTheme
import java.lang.Integer.min
import kotlin.math.cos
import kotlin.math.sin

@Composable
fun PersianPieChart(
    data: List<ChartData>,
    config: ChartConfig,
    modifier: Modifier = Modifier,
    style: ChartStyle = PersianPieChartsDefaults.style(),
    size: Dp = 320.dp,
) {
    val state = rememberDonutChartState(data, config, style)

    val borderWidth = 6.dp
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
                                    innerRadius = 0f,
                                    outerRadius = ((size / 2 + 0.dp) * 1.3f).toPx()
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
                    val text = "${String.format("%.1f", data.value)}%"
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
                                        + (35.dp.toPx()
                                        + ((size / 2 - 35.dp) / 2).toPx())
                                        * cos(angleInRadians) * scale,
                                center.y
                                        - measurement.size.height / 2
                                        + (35.dp.toPx()
                                        + ((size / 2 - 35.dp) / 2).toPx())
                                        * sin(angleInRadians) * scale
                            )
                        )
                    }
                    startAngle += data.angle
                }
            }
        )
    }
}