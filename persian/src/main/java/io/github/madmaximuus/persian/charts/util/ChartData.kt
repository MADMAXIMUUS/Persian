package io.github.madmaximuus.persian.charts.util

import androidx.compose.ui.graphics.Color

class ChartData internal constructor(
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