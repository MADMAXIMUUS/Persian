package io.github.madmaximuus.persianCharts.pieChart

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.coerceAtLeast
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianCharts.foundation.LegendPosition
import io.github.madmaximuus.persianCharts.pieChart.component.drawSector
import io.github.madmaximuus.persianCharts.pieChart.model.SectorData
import kotlin.math.min

@Composable
fun PieChart(
    data: List<SectorData>,
    modifier: Modifier = Modifier,
    outerRadius: Dp = Dp.Infinity,
    innerRadius: Dp = 0.dp,
    angularInset: Dp = 0.dp,
    legend: Boolean = false,
    legendPosition: LegendPosition = LegendPosition.BOTTOM,
    labels: Boolean = false,
    cornerRadius: Dp = 0.dp
) {
    require(data.isNotEmpty()) {
        throw IllegalStateException("Data must not be empty")
    }

    var outerRadiusPx = with(LocalDensity.current) { outerRadius.coerceAtLeast(0.dp).toPx() }
    val innerRadiusPx = with(LocalDensity.current) { innerRadius.coerceAtLeast(0.dp).toPx() }
    val angularInsetPx = with(LocalDensity.current) { angularInset.coerceAtLeast(0.dp).toPx() }
    val cornerRadiusPx = with(LocalDensity.current) { cornerRadius.coerceIn(0.dp..10.dp).toPx() }

    Canvas(modifier = modifier) {
        outerRadiusPx = min(size.minDimension / 2f, outerRadiusPx)

        require(innerRadiusPx < outerRadiusPx) {
            throw IllegalStateException("Inner radius must be smaller than outer")
        }

        if (data.size == 1) {
            drawCircle(
                color = data[0].color,
                radius = outerRadiusPx,
                center = center
            )
        } else {
            val totalSum = data.sumOf { it.data }.toFloat()
            val insetAngle = (angularInsetPx / outerRadiusPx) * 180f / Math.PI.toFloat()

            val pieValueWithRatio = data.map { part ->
                360f / totalSum * part.data.toFloat() - insetAngle
            }

            var startAngle = insetAngle / 2f

            pieValueWithRatio.forEachIndexed { index, value ->
                drawSector(
                    color = data[index].color,
                    startAngle = startAngle,
                    sweepAngle = value,
                    angularInset = angularInsetPx,
                    innerRadius = innerRadiusPx,
                    outerRadius = outerRadiusPx,
                    cornerRadius = cornerRadiusPx,
                    alpha = 1f,
                )
                startAngle += value + insetAngle
            }
        }
    }
}

@Preview
@Composable
private fun PieChartPreview() {
    PieChart(
        modifier = Modifier
            .background(Color.White)
            .padding(10.dp)
            .fillMaxSize(),
        innerRadius = 0.dp,
        cornerRadius = 10.dp,
        angularInset = 10.dp,
        data = listOf(
            SectorData(
                data = 10.0,
                color = Color.Blue,
                partName = "1"
            ),
            SectorData(
                data = 10.0,
                color = Color.Black,
                partName = "2"
            ),
            /*SectorData(
                data = 10.0,
                color = Color.Red,
                partName = "3"
            ),
            SectorData(
                data = 10.0,
                color = Color.Green,
                partName = "3"
            ),
            SectorData(
                data = 10.0,
                color = Color.Cyan,
                partName = "3"
            ),
            SectorData(
                data = 10.0,
                color = Color.DarkGray,
                partName = "3"
            ),
            SectorData(
                data = 10.0,
                color = Color.Magenta,
                partName = "3"
            ),
            SectorData(
                data = 10.0,
                color = Color.LightGray,
                partName = "3"
            ),*/
        )
    )
}