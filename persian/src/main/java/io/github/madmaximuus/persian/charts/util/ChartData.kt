package io.github.madmaximuus.persian.charts.util

import androidx.compose.ui.graphics.Color

/**
 * A data class representing a single data point in a chart.
 *
 * This class encapsulates the properties of a chart data point, including its percentage, value, angle, color,
 * and selection state. It also provides a secondary constructor and a copy method for convenience.
 *
 * @property percentage The percentage value of the data point.
 * @property value The actual value of the data point.
 * @property angle The angle of the data point in the chart.
 * @property color The color of the data point.
 * @property isSelected A boolean indicating whether the data point is selected.
 *
 * @constructor Creates a new [ChartData] instance with the specified properties.
 * @param percentage The percentage value of the data point.
 * @param value The actual value of the data point.
 * @param angle The angle of the data point in the chart.
 * @param color The color of the data point.
 * @param isSelected A boolean indicating whether the data point is selected.
 *
 * @constructor Creates a new [ChartData] instance with the specified value and color, initializing other properties to default values.
 *
 * @constructor Creates a new [ChartData] instance by copying the properties of an existing instance, optionally overriding specific properties.
 */
class ChartData internal constructor(
    internal val percentage: Double,
    internal val value: Double,
    internal val angle: Float,
    internal val color: Color,
    internal val isSelected: Boolean
) {
    /**
     * Creates a new [ChartData] instance with the specified value and color, initializing other properties to default values.
     *
     * @param value The actual value of the data point.
     * @param color The color of the data point.
     */
    constructor(value: Double, color: Color) : this(0.0, value, 0f, color, false)

    /**
     * Creates a new [ChartData] instance by copying the properties of an existing instance, optionally overriding specific properties.
     *
     * @param percentage The percentage value of the data point. Defaults to the current value.
     * @param value The actual value of the data point. Defaults to the current value.
     * @param angle The angle of the data point in the chart. Defaults to the current value.
     * @param color The color of the data point. Defaults to the current value.
     * @param isSelected A boolean indicating whether the data point is selected. Defaults to the current value.
     * @return A new [ChartData] instance with the specified properties.
     */
    internal fun copy(
        percentage: Double = this.percentage,
        value: Double = this.value,
        angle: Float = this.angle,
        color: Color = this.color,
        isSelected: Boolean = this.isSelected
    ): ChartData {
        return ChartData(
            percentage = percentage,
            value = value,
            angle = angle,
            color = color,
            isSelected = isSelected
        )
    }
}