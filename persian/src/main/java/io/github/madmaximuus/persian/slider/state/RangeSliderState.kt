package io.github.madmaximuus.persian.slider.state

import androidx.annotation.IntRange
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import io.github.madmaximuus.persian.slider.range.RangeSlider
import kotlin.math.floor
import kotlin.math.max
import kotlin.math.min

/**
 * Class that holds information about [RangeSlider]'s active range.
 *
 * @param activeRangeStart [Float] that indicates the initial start of the active range of the
 *   slider. If outside of [valueRange] provided, value will be coerced to this range.
 * @param activeRangeEnd [Float] that indicates the initial end of the active range of the slider.
 *   If outside of [valueRange] provided, value will be coerced to this range.
 * @param steps if positive, specifies the amount of discrete allowable values (in addition to the
 *   endpoints of the value range). Step values are evenly distributed across the range. If 0, the
 *   range slider will behave continuously and allow any value from the range. Must not be negative.
 * @param onValueChangeFinished lambda to be invoked when value change has ended. This callback
 *   shouldn't be used to update the range slider values (use [onValueChange] for that), but rather
 *   to know when the user has completed selecting a new value by ending a drag or a click.
 * @param valueRange range of values that Range Slider values can take. [activeRangeStart] and
 *   [activeRangeEnd] will be coerced to this range.
 */
class RangeSliderState(
    activeRangeStart: Float = 0f,
    activeRangeEnd: Float = 1f,
    @IntRange(from = 0) val steps: Int = 0,
    var onValueChangeFinished: (() -> Unit)? = null,
    val valueRange: ClosedFloatingPointRange<Float> = 0f..1f
) {
    private var activeRangeStartState by mutableFloatStateOf(activeRangeStart)
    private var activeRangeEndState by mutableFloatStateOf(activeRangeEnd)

    /** [Float] that indicates the start of the current active range for the [RangeSlider]. */
    var activeRangeStart: Float
        set(newVal) {
            val coercedValue = newVal.coerceIn(valueRange.start, activeRangeEnd)
            val snappedValue = snapValueToTick(
                coercedValue,
                tickFractions,
                valueRange.start,
                valueRange.endInclusive
            )
            activeRangeStartState = snappedValue
        }
        get() = activeRangeStartState

    /** [Float] that indicates the end of the current active range for the [RangeSlider]. */
    var activeRangeEnd: Float
        set(newVal) {
            val coercedValue = newVal.coerceIn(activeRangeStart, valueRange.endInclusive)
            val snappedValue =
                snapValueToTick(
                    coercedValue,
                    tickFractions,
                    valueRange.start,
                    valueRange.endInclusive
                )
            activeRangeEndState = snappedValue
        }
        get() = activeRangeEndState

    internal var onValueChange: ((SliderRange) -> Unit)? = null

    internal val tickFractions = stepsToTickFractions(steps)

    internal var trackHeight by mutableFloatStateOf(0f)
    internal var startThumbWidth by mutableFloatStateOf(0f)
    internal var endThumbWidth by mutableFloatStateOf(0f)
    internal var totalWidth by mutableIntStateOf(0)
    internal var rawOffsetStart by mutableFloatStateOf(0f)
    internal var rawOffsetEnd by mutableFloatStateOf(0f)

    internal var isRtl by mutableStateOf(false)

    internal val gestureEndAction: (Boolean) -> Unit = { onValueChangeFinished?.invoke() }

    private var maxPx by mutableFloatStateOf(0f)
    private var minPx by mutableFloatStateOf(0f)

    internal fun onDrag(isStart: Boolean, offset: Float) {
        val offsetRange =
            if (isStart) {
                rawOffsetStart = (rawOffsetStart + offset)
                rawOffsetEnd = scaleToOffset(minPx, maxPx, activeRangeEnd)
                val offsetEnd = rawOffsetEnd
                var offsetStart = rawOffsetStart.coerceIn(minPx, offsetEnd)
                offsetStart = snapValueToTick(
                    offsetStart,
                    tickFractions,
                    minPx,
                    maxPx
                )
                SliderRange(offsetStart, offsetEnd)
            } else {
                rawOffsetEnd = (rawOffsetEnd + offset)
                rawOffsetStart = scaleToOffset(minPx, maxPx, activeRangeStart)
                val offsetStart = rawOffsetStart
                var offsetEnd = rawOffsetEnd.coerceIn(offsetStart, maxPx)
                offsetEnd = snapValueToTick(
                    offsetEnd,
                    tickFractions,
                    minPx,
                    maxPx
                )
                SliderRange(offsetStart, offsetEnd)
            }
        val scaledUserValue = scaleToUserValue(minPx, maxPx, offsetRange)
        if (scaledUserValue != SliderRange(
                activeRangeStart,
                activeRangeEnd
            )
        ) {
            if (onValueChange != null) {
                onValueChange?.let { it(scaledUserValue) }
            } else {
                this.activeRangeStart = scaledUserValue.start
                this.activeRangeEnd = scaledUserValue.endInclusive
            }
        }
    }

    internal val coercedActiveRangeStartAsFraction
        get() = calcFraction(
            valueRange.start,
            valueRange.endInclusive,
            activeRangeStart
        )

    internal val coercedActiveRangeEndAsFraction
        get() = calcFraction(
            valueRange.start,
            valueRange.endInclusive,
            activeRangeEnd
        )

    internal val startSteps
        get() = floor(steps * coercedActiveRangeEndAsFraction).toInt()

    internal val endSteps
        get() = floor(steps * (1f - coercedActiveRangeStartAsFraction)).toInt()

    // scales range offset from within minPx..maxPx to within valueRange.start..valueRange.end
    private fun scaleToUserValue(minPx: Float, maxPx: Float, offset: SliderRange) =
        scale(
            minPx,
            maxPx,
            offset,
            valueRange.start,
            valueRange.endInclusive
        )

    // scales float userValue within valueRange.start..valueRange.end to within minPx..maxPx
    private fun scaleToOffset(minPx: Float, maxPx: Float, userValue: Float) =
        scale(
            valueRange.start,
            valueRange.endInclusive,
            userValue,
            minPx,
            maxPx
        )

    internal fun updateMinMaxPx() {
        val newMaxPx = max(totalWidth - endThumbWidth / 2, 0f)
        val newMinPx = min(startThumbWidth / 2, newMaxPx)
        if (minPx != newMinPx || maxPx != newMaxPx) {
            minPx = newMinPx
            maxPx = newMaxPx
            rawOffsetStart = scaleToOffset(minPx, maxPx, activeRangeStart)
            rawOffsetEnd = scaleToOffset(minPx, maxPx, activeRangeEnd)
        }
    }
}