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

@Composable
internal fun rememberDonutChartState(
    data: List<ChartData>,
    config: ChartConfig,
    style: ChartStyle,
): ChartState = rememberSaveable(
    inputs = arrayOf(config),
    saver = ChartState.Saver(data, config, style),
    init = { ChartState(data, config, style) }
)