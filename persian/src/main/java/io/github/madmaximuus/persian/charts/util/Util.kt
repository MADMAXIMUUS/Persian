package io.github.madmaximuus.persian.charts.util

import androidx.compose.ui.geometry.Offset
import kotlin.math.atan2
import kotlin.math.pow
import kotlin.math.sqrt

internal fun calculateProportions(
    data: List<ChartData>
): List<ChartData> {
    return data.sortedBy { it.value }.mapIndexed { index, donutChartData ->
        donutChartData.copy(
            percentage = donutChartData.value * 100 / data.totalAmount,
            angle = data.findSweepAngle(index),
        )
    }
}

internal fun List<ChartData>.getTotalAmountWithGapIncluded(
): Float {
    return this.totalAmount.toFloat()
}

internal fun List<ChartData>.findSweepAngle(
    index: Int,
): Float {
    val amount = this[index].value.toFloat()
    val totalWithGap = getTotalAmountWithGapIncluded()
    return (((amount / totalWithGap) * 360f))
}

internal val List<ChartData>.totalAmount: Double
    get() = sumOf { it.value }

internal fun findTouchDistanceFromCenter(center: Offset, touch: Offset) =
    sqrt((touch.x - center.x).pow(2) + (touch.y - center.y).pow(2))

internal fun Offset.findNormalizedPointFromTouch(canvasCenter: Offset) =
    Offset(this.x, canvasCenter.y + (canvasCenter.y - this.y))

internal fun calculateTouchAngleAccordingToCanvas(
    canvasCenter: Offset,
    normalizedPoint: Offset
): Float {
    val angle = calculateTouchAngleInDegrees(canvasCenter, normalizedPoint)
    return adjustAngleToCanvas(angle).toFloat()
}

internal fun calculateTouchAngleInDegrees(canvasCenter: Offset, normalizedPoint: Offset): Double {
    val touchInRadian = atan2(
        normalizedPoint.y - canvasCenter.y,
        normalizedPoint.x - canvasCenter.x
    )
    return touchInRadian.angleToDegree.toDouble()
}

internal fun adjustAngleToCanvas(angle: Double) = (angle + 360f) % 360f

internal val Float.degreeToAngle
    get() = (this * Math.PI / 180f).toFloat()

internal val Float.angleToDegree
    get() = (this * -180f / Math.PI).toFloat()