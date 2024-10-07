package io.github.madmaximuus.persian.charts.util

/**
 * A configuration class for customizing the behavior and appearance of charts.
 *
 * This class provides various options to control how the chart is displayed and interacted with.
 *
 * @property selectable A boolean indicating whether the chart elements are selectable. Defaults to `false`.
 * @property showLabel A boolean indicating whether to display labels on the chart. Defaults to `false`.
 * @property showTotalValueAsSubtitle A boolean indicating whether to display the total value as a subtitle. Defaults to `false`.
 * @property divided A boolean indicating whether the chart should be divided into sections. Defaults to `false`.
 */
class ChartConfig(
    /*val minimalDisplayedValue: Double = 15.0,*/
    val selectable: Boolean = false,
    val showLabel: Boolean = false,
    val showTotalValueAsSubtitle: Boolean = false,
    val divided: Boolean = false
)