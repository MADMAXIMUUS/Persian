package io.github.madmaximuus.persian.charts.util

import androidx.compose.ui.geometry.Offset
import kotlin.math.atan2
import kotlin.math.pow
import kotlin.math.sqrt

/**
 * Calculates the proportions and angles for a list of [ChartData] objects.
 *
 * This function sorts the data by value, calculates the percentage of each data point relative to the total amount,
 * and determines the sweep angle for each data point in the chart.
 *
 * @param data A list of [ChartData] objects representing the data points of the chart.
 * @return A new list of [ChartData] objects with updated percentage and angle values.
 */
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

/**
 * Calculates the total amount of the chart data, including any gaps, and returns it as a [Float].
 *
 * This extension function is used to obtain the total amount of the data points in the chart, converted to a float.
 *
 * @return The total amount of the chart data as a [Float].
 */
internal fun List<ChartData>.getTotalAmountWithGapIncluded(): Float = this.totalAmount.toFloat()

/**
 * Calculates the sweep angle for a specific data point in the chart.
 *
 * This extension function determines the angle that a specific data point should occupy in the chart,
 * based on its value relative to the total amount of the chart data (including any gaps).
 *
 * @param index The index of the data point in the list for which to calculate the sweep angle.
 * @return The sweep angle for the specified data point as a [Float].
 */
internal fun List<ChartData>.findSweepAngle(
    index: Int,
): Float {
    val amount = this[index].value.toFloat()
    val totalWithGap = getTotalAmountWithGapIncluded()
    return (((amount / totalWithGap) * 360f))
}

/**
 * Calculates the total amount of the values in a list of [ChartData] objects.
 *
 * @return The total amount of the values in the list as a [Double].
 */
internal val List<ChartData>.totalAmount: Double
    get() = sumOf { it.value }

/**
 * Calculates the distance between a touch point and the center of the chart.
 *
 * This function uses the Euclidean distance formula to determine the distance between the given touch point
 * and the center point of the chart.
 *
 * @param center The center point of the chart as an [Offset].
 * @param touch The touch point as an [Offset].
 * @return The distance between the touch point and the center point as a [Float].
 */
internal fun findTouchDistanceFromCenter(center: Offset, touch: Offset) =
    sqrt((touch.x - center.x).pow(2) + (touch.y - center.y).pow(2))

/**
 * Calculates the normalized point from a touch point relative to the center of the canvas.
 *
 * This extension function adjusts the y-coordinate of the touch point to be symmetrically opposite relative to the center
 * of the canvas, effectively normalizing the touch point.
 *
 * @param canvasCenter The center point of the canvas as an [Offset].
 * @return A new [Offset] representing the normalized touch point.
 */
internal fun Offset.findNormalizedPointFromTouch(canvasCenter: Offset) =
    Offset(this.x, canvasCenter.y + (canvasCenter.y - this.y))

/**
 * Calculates the touch angle relative to the center of the canvas.
 *
 * This function first calculates the touch angle in degrees between the center of the canvas and the normalized touch point.
 * Then, it adjusts the angle to fit the canvas coordinate system and returns it as a [Float].
 *
 * @param canvasCenter The center point of the canvas as an [Offset].
 * @param normalizedPoint The normalized touch point as an [Offset].
 * @return The adjusted touch angle as a [Float].
 */
internal fun calculateTouchAngleAccordingToCanvas(
    canvasCenter: Offset,
    normalizedPoint: Offset
): Float {
    val angle = calculateTouchAngleInDegrees(canvasCenter, normalizedPoint)
    return adjustAngleToCanvas(angle).toFloat()
}

/**
 * Calculates the touch angle in degrees between the center of the canvas and a normalized touch point.
 *
 * This function first calculates the angle in radians using the `atan2` function, which computes the arctangent
 * of the quotient of its arguments. Then, it converts the angle from radians to degrees.
 *
 * @param canvasCenter The center point of the canvas as an [Offset].
 * @param normalizedPoint The normalized touch point as an [Offset].
 * @return The touch angle in degrees as a [Double].
 */
internal fun calculateTouchAngleInDegrees(canvasCenter: Offset, normalizedPoint: Offset): Double {
    val touchInRadian = atan2(
        normalizedPoint.y - canvasCenter.y,
        normalizedPoint.x - canvasCenter.x
    )
    return touchInRadian.angleToDegree.toDouble()
}

/**
 * Adjusts the given angle to fit within the range of 0 to 360 degrees.
 *
 * This function ensures that the angle is normalized to the standard range used in canvas coordinate systems.
 *
 * @param angle The angle in degrees to be adjusted.
 * @return The adjusted angle as a [Float], within the range of 0 to 360 degrees.
 */
internal fun adjustAngleToCanvas(angle: Double) = (angle + 360f) % 360f

/**
 * Converts an angle from degrees to radians.
 *
 * This extension property converts a given angle in degrees to its equivalent in radians.
 *
 * @return The angle in radians as a [Float].
 */
internal val Float.degreeToAngle
    get() = (this * Math.PI / 180f).toFloat()

/**
 * Converts an angle from radians to degrees.
 *
 * This extension property converts a given angle in radians to its equivalent in degrees.
 *
 * @return The angle in degrees as a [Float].
 */
internal val Float.angleToDegree
    get() = (this * -180f / Math.PI).toFloat()