package io.github.madmaximuus.persian.charts.donut

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableDoubleStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.Saver
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.geometry.Offset
import io.github.madmaximuus.persian.charts.donut.util.DonutChartConfig
import io.github.madmaximuus.persian.charts.donut.util.DonutChartStyle
import io.github.madmaximuus.persian.charts.donut.util.calculateProportions
import io.github.madmaximuus.persian.charts.donut.util.calculateTouchAngleAccordingToCanvas
import io.github.madmaximuus.persian.charts.donut.util.findNormalizedPointFromTouch
import io.github.madmaximuus.persian.charts.donut.util.findTouchDistanceFromCenter
import io.github.madmaximuus.persian.charts.donut.util.totalAmount
import java.io.Serializable

internal class PersianChartState(
    val consData: List<DonutChartData>,
    val config: DonutChartConfig,
    val style: DonutChartStyle,
    stateData: ChartStateData? = null,
) {
    var data by mutableStateOf(stateData?.data ?: emptyArray())
    var totalValue by mutableDoubleStateOf(0.0)

    init {
        data = calculateProportions(consData).toTypedArray()
        totalValue = consData.totalAmount
    }

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
        fun Saver(
            savedData: List<DonutChartData>,
            config: DonutChartConfig,
            style: DonutChartStyle
        ): Saver<PersianChartState, *> = Saver(
            save = { state ->
                ChartStateData(
                    data = state.data
                )
            },
            restore = { data ->
                PersianChartState(savedData, config, style, data)
            }
        )
    }

    data class ChartStateData(
        val data: Array<DonutChartData>
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

@Composable
internal fun rememberDonutChartState(
    data: List<DonutChartData>,
    config: DonutChartConfig,
    style: DonutChartStyle,
): PersianChartState = rememberSaveable(
    inputs = arrayOf(config),
    saver = PersianChartState.Saver(data, config, style),
    init = { PersianChartState(data, config, style) }
)