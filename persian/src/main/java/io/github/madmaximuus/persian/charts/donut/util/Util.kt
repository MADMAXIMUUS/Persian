package io.github.madmaximuus.persian.charts.donut.util

import androidx.compose.ui.geometry.Offset
import io.github.madmaximuus.persian.charts.donut.DonutChartData
import kotlin.math.atan2
import kotlin.math.pow
import kotlin.math.sqrt

internal fun calculateProportions(
    gapPercentage: Float,
    data: List<DonutChartData>
): List<DonutChartData> {
    return data.sortedBy { it.value }.mapIndexed { index, donutChartData ->
        donutChartData.copy(
            percentage = donutChartData.value * 100 / data.totalAmount,
            angle = data.findSweepAngle(index, gapPercentage),
        )
    }
}

internal fun List<DonutChartData>.calculateGap(gapPercentage: Float): Float {
    if (this.isEmpty() || this.size == 1) return 0f

    return (this.totalAmount.toFloat() / this.size) * gapPercentage
}

internal fun List<DonutChartData>.getTotalAmountWithGapIncluded(
    gapPercentage: Float
): Float {
    val gap = this.calculateGap(gapPercentage)
    return this.totalAmount.toFloat() + (this.size * gap)
}

internal fun List<DonutChartData>.calculateGapAngle(
    gapPercentage: Float
): Float {
    val gap = this.calculateGap(gapPercentage)
    val totalAmountWithGap = this.getTotalAmountWithGapIncluded(gapPercentage)

    return (gap / totalAmountWithGap) * 360f
}

internal fun List<DonutChartData>.findSweepAngle(
    index: Int,
    gapPercentage: Float
): Float {
    val amount = this[index].value.toFloat()
    val gap = this.calculateGap(gapPercentage)
    val totalWithGap = getTotalAmountWithGapIncluded(gapPercentage)
    val gapAngle = this.calculateGapAngle(gapPercentage)
    return ((((amount + gap) / totalWithGap) * 360f)) - gapAngle
}

internal val List<DonutChartData>.totalAmount: Double
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