package io.github.madmaximuus.persianCharts.pieChart.utils

import androidx.compose.ui.geometry.Offset
import kotlin.math.asin
import kotlin.math.cos
import kotlin.math.sin

internal fun Double.toDegrees() = Math.toDegrees(this).toFloat()
internal fun Float.toRadians() = Math.toRadians(this.toDouble()).toFloat()

internal fun polarToCartesian(center: Offset = Offset.Zero, radius: Float, angle: Float): Offset {
    val radian = Math.toRadians(angle.toDouble())
    return Offset(
        (center.x + cos(radian) * radius).toFloat(),
        (center.y + sin(radian) * radius).toFloat()
    )
}

internal fun coerceCorner(
    arcRadius: Float,
    width: Float,
    sweepAngle: Float,
    cornerRadius: Float,
    weightXAxis: Float,
    weightYAxis: Float
): Pair<Float, Float> {
    val cornerRadiusAdjusted = cornerRadius.coerceAtMost((width / 2) * weightYAxis)
    val cornerTravelAngle = 2 * asin(
        x = (cornerRadiusAdjusted / (2 * arcRadius)).toDouble()
    ).toDegrees()

    val maxSweep = (sweepAngle / 2) * weightXAxis

    return if (cornerTravelAngle > maxSweep) {
        Pair(
            arcRadius * sin(maxSweep.toRadians()),
            maxSweep
        )
    } else {
        Pair(cornerRadiusAdjusted, cornerTravelAngle)
    }
}
