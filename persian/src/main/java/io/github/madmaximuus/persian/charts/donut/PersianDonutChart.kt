package io.github.madmaximuus.persian.charts.donut

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
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
import androidx.compose.ui.graphics.Color
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
import io.github.madmaximuus.persian.charts.donut.util.DonutChartConfig
import io.github.madmaximuus.persian.charts.donut.util.DonutChartStyle
import io.github.madmaximuus.persian.charts.donut.util.degreeToAngle
import io.github.madmaximuus.persian.foundation.extendedColorScheme
import java.lang.Integer.min
import kotlin.math.cos
import kotlin.math.sin

class DonutChartData internal constructor(
    internal val percentage: Double,
    internal val value: Double,
    internal val angle: Float,
    internal val color: Color,
    internal val isSelected: Boolean
) {
    constructor(value: Double, color: Color) : this(0.0, value, 0f, color, false)

    internal fun copy(
        percentage: Double = this.percentage,
        value: Double = this.value,
        angle: Float = this.angle,
        color: Color = this.color,
        isSelected: Boolean = this.isSelected
    ): DonutChartData {
        return DonutChartData(
            percentage = percentage,
            value = value,
            angle = angle,
            color = color,
            isSelected = isSelected
        )
    }
}

@Composable
fun PersianDonutChart(
    data: List<DonutChartData>,
    config: DonutChartConfig,
    modifier: Modifier = Modifier,
    style: DonutChartStyle = PersianDonutChartsDefaults.style(),
    title: String? = null,
    subtitle: String? = null,
    size: Dp = 320.dp,
) {
    val state = rememberDonutChartState(data, config, style)

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
        val borderColor = MaterialTheme.extendedColorScheme.surface
        val backgroundColor = MaterialTheme.extendedColorScheme.surface
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
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = if (config.showTotalValueAsSubtitle) state.totalValue.toString() else subtitle.toString(),
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