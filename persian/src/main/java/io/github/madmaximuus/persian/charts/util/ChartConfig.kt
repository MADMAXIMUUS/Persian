package io.github.madmaximuus.persian.charts.util

/**
 * A configuration class for customizing the behavior and appearance of charts.
 *
 * @property selectable A boolean indicating whether the chart elements are selectable.
 * @property showLabel A boolean indicating whether to display labels on the chart.
 * @property showTotalValueAsSubtitle A boolean indicating whether to display the total value as a subtitle.
 * @param divided A boolean indicating whether to display divider between arc of the chart.
 */
class ChartConfig(
    /*val minimalDisplayedValue: Double = 15.0,*/
    val selectable: Boolean = false,
    val showLabel: Boolean = false,
    val showTotalValueAsSubtitle: Boolean = false,
    val divided: Boolean = false
)