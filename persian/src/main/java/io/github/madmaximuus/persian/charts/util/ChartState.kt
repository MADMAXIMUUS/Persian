package io.github.madmaximuus.persian.charts.util

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableDoubleStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.Saver
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.geometry.Offset
import java.io.Serializable

/**
 * Class representing the state of a chart which remembered over recomposition.
 *
 * @property consData A list of [ChartData] objects representing the data points of the chart.
 * @property config A [ChartConfig] object containing the configuration settings for the chart.
 * @property style A [ChartStyle] object to customize the appearance of the chart.
 * @param stateData Optional state data for the chart.
 */
internal class ChartState(
    val consData: List<ChartData>,
    val config: ChartConfig,
    val style: ChartStyle,
    stateData: ChartStateData? = null,
) {
    var data by mutableStateOf(stateData?.data ?: emptyArray())
    var totalValue by mutableDoubleStateOf(0.0)

    init {
        data = calculateProportions(consData).toTypedArray()
        totalValue = consData.totalAmount
    }

    /**
     * Handles a tap event on the chart.
     *
     * This method calculates the touch angle and distance from the center of the chart and updates the selection state of the data points accordingly.
     *
     * @param center The center point of the chart.
     * @param tapOffset The offset of the tap event.
     * @param innerRadius The inner radius of the chart.
     * @param outerRadius The outer radius of the chart.
     */
    fun handleTap(
        center: Offset,
        tapOffset: Offset,
        innerRadius: Float,
        outerRadius: Float
    ) {
        val normalized = tapOffset.findNormalizedPointFromTouch(center)
        val touchAngle =
            calculateTouchAngleAccordingToCanvas(center, normalized)
        val distance = findTouchDistanceFromCenter(center, normalized)

        if (distance < innerRadius || distance > outerRadius) {
            data.map {
                it.copy(
                    isSelected = false
                )
            }
            return
        }

        var angel = 0f
        var prevAngel = 0f
        data = data.map { data ->
            angel += data.angle
            val temp = if (angel > touchAngle && prevAngel < touchAngle) {
                data.copy(isSelected = !data.isSelected)
            } else {
                data.copy(isSelected = false)
            }
            prevAngel = angel
            temp
        }.toTypedArray()
    }

    companion object {

        /**
         * Creates a Saver for the [ChartState] class.
         *
         * @param savedData A list of [ChartData] objects representing the saved data points of the chart.
         * @param config A [ChartConfig] object containing the configuration settings for the chart.
         * @param style A [ChartStyle] object to customize the appearance of the chart.
         */
        fun Saver(
            savedData: List<ChartData>,
            config: ChartConfig,
            style: ChartStyle
        ): Saver<ChartState, *> = Saver(
            save = { state ->
                ChartStateData(
                    data = state.data
                )
            },
            restore = { data ->
                ChartState(savedData, config, style, data)
            }
        )
    }

    /**
     * A data class representing the state data of the chart.
     */
    data class ChartStateData(
        val data: Array<ChartData>
    ) : Serializable {

        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (javaClass != other?.javaClass) return false

            other as ChartStateData

            return !data.contentEquals(other.data)
        }

        override fun hashCode(): Int {
            return data.contentHashCode()
        }
    }
}

/**
 * A composable function to remember the state of a Chart.
 *
 * @param data A list of [ChartData] objects representing the data points of the chart.
 * @param config A [ChartConfig] object containing the configuration settings for the chart.
 * @param style A [ChartStyle] object to customize the appearance of the chart.
 */
@Composable
internal fun rememberChartState(
    data: List<ChartData>,
    config: ChartConfig,
    style: ChartStyle,
): ChartState = rememberSaveable(
    inputs = arrayOf(config),
    saver = ChartState.Saver(data, config, style),
    init = { ChartState(data, config, style) }
)