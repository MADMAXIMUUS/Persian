package io.github.madmaximuus.persian.timePicker.util

import androidx.collection.IntList
import androidx.collection.MutableIntList
import androidx.collection.intListOf
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.timePicker.state.AnalogTimePickerState
import io.github.madmaximuus.persian.timePicker.state.TimePickerState
import io.github.madmaximuus.persian.timePicker.util.LayoutId.InnerCircle
import io.github.madmaximuus.persian.timePicker.util.LayoutId.Selector
import kotlinx.coroutines.delay
import java.text.NumberFormat
import java.util.Locale
import java.util.WeakHashMap
import kotlin.math.PI
import kotlin.math.atan2
import kotlin.math.cos
import kotlin.math.hypot
import kotlin.math.round
import kotlin.math.sin

internal const val FullCircle: Float = (PI * 2).toFloat()
internal const val HalfCircle: Float = FullCircle / 2f
internal const val QuarterCircle = PI / 2
internal const val RadiansPerMinute: Float = FullCircle / 60
internal const val RadiansPerHour: Float = FullCircle / 12f
internal const val SeparatorZIndex = 2f

internal val VerticalOuterCircleSizeRadius = 101.dp
internal val HorizontalOuterCircleSizeRadius = 77.dp
internal val VerticalInnerCircleRadius = 69.dp
internal val HorizontalInnerCircleRadius = 45.dp
internal val DisplaySeparatorWidth = 24.dp

internal val MaxDistance = 74.dp
internal val MinimumInteractiveSize = 48.dp
internal val Minutes = intListOf(0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55)
internal val Hours = intListOf(12, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11)
internal val ExtraHours: IntList =
    MutableIntList(Hours.size).apply { Hours.forEach { add((it % 12 + 12)) } }
internal val PeriodToggleMargin = 12.dp

/**
 * Extension property to get the hour in a display-friendly format.
 *
 * This property adjusts the hour based on the 24-hour format setting and whether it is in the afternoon.
 */
internal val TimePickerState.hourForDisplay: Int
    get() =
        when {
            is24hour -> hour % 24
            hour % 12 == 0 -> 12
            isAfternoon -> hour - 12
            else -> hour
        }

/**
 * Moves the selector based on the given coordinates and maximum distance.
 *
 * This function updates the `isAfternoon` state if the selection mode is `Hour` and the time picker
 * is in 24-hour format. The update is based on the distance between the given coordinates and the
 * center of the picker.
 *
 * @param x The x-coordinate of the touch or gesture event.
 * @param y The y-coordinate of the touch or gesture event.
 * @param maxDist The maximum distance from the center to consider for updating the `isAfternoon` state.
 * @param center The center coordinates of the picker.
 */
internal fun TimePickerState.moveSelector(x: Float, y: Float, maxDist: Float, center: IntOffset) {
    if (selection == TimePickerSelectionMode.Hour && is24hour) {
        isAfternoon = dist(x, y, center.x, center.y) < maxDist
    }
}

/**
 * Handles a tap event on the analog time picker.
 *
 * This function calculates the angle based on the tap coordinates and updates the time picker state
 * accordingly. It also moves the selector and rotates the picker to the calculated angle.
 *
 * @param x The x-coordinate of the tap event.
 * @param y The y-coordinate of the tap event.
 * @param maxDist The maximum distance from the center to consider for updating the `isAfternoon` state.
 * @param center The center coordinates of the picker.
 */
internal suspend fun AnalogTimePickerState.onTap(
    x: Float,
    y: Float,
    maxDist: Float,
    center: IntOffset,
) {
    var angle = atan(y - center.y, x - center.x)
    angle = if (selection == TimePickerSelectionMode.Minute) {
        round(angle / RadiansPerMinute / 5f) * 5f * RadiansPerMinute
    } else {
        round(angle / RadiansPerHour) * RadiansPerHour
    }

    moveSelector(x, y, maxDist, center)
    rotateTo(angle, animate = true)

    if (selection == TimePickerSelectionMode.Hour) {
        delay(100)
    }


    selection = TimePickerSelectionMode.Minute
}

/**
 * Extension property to get the vertical selector position as a [DpOffset].
 *
 * This property calculates the position of the vertical selector based on the current angle,
 * the 24-hour format setting, the afternoon state, and the selection mode.
 */
internal val AnalogTimePickerState.verticalSelectorPos: DpOffset
    get() {
        val handleRadiusPx = 48.dp / 2
        val selectorLength =
            if (is24hour && this.isAfternoon && selection == TimePickerSelectionMode.Hour) {
                VerticalInnerCircleRadius
            } else {
                VerticalOuterCircleSizeRadius
            }
                .minus(handleRadiusPx)

        val length = selectorLength + handleRadiusPx
        val offsetX = length * cos(currentAngle) + 256.0.dp / 2
        val offsetY = length * sin(currentAngle) + 256.0.dp / 2

        return DpOffset(offsetX, offsetY)
    }

/**
 * Extension property to get the horizontal selector position as a [DpOffset].
 *
 * This property calculates the position of the horizontal selector based on the current angle,
 * the 24-hour format setting, the afternoon state, and the selection mode.
 */
internal val AnalogTimePickerState.horizontalSelectorPos: DpOffset
    get() {
        val handleRadiusPx = 36.dp / 2
        val selectorLength =
            if (is24hour && this.isAfternoon && selection == TimePickerSelectionMode.Hour) {
                HorizontalInnerCircleRadius
            } else {
                HorizontalOuterCircleSizeRadius
            }
                .minus(handleRadiusPx)

        val length = selectorLength + handleRadiusPx
        val offsetX = length * cos(currentAngle) + 200.dp / 2
        val offsetY = length * sin(currentAngle) + 200.dp / 2

        return DpOffset(offsetX, offsetY)
    }

/**
 * Calculates the Euclidean distance between two points.
 *
 * This function computes the distance between two points given their coordinates.
 *
 * @param x1 The x-coordinate of the first point.
 * @param y1 The y-coordinate of the first point.
 * @param x2 The x-coordinate of the second point.
 * @param y2 The y-coordinate of the second point.
 */
internal fun dist(x1: Float, y1: Float, x2: Int, y2: Int): Float {
    val x = x2 - x1
    val y = y2 - y1
    return hypot(x.toDouble(), y.toDouble()).toFloat()
}

/**
 * Calculates the arctangent of the given coordinates, adjusted to a specific range.
 *
 * This function computes the arctangent of the given y and x coordinates and adjusts the result
 * to a range that is offset by a quarter circle. If the result is negative, it adds a full circle
 * to ensure the angle is within the desired range.
 *
 * @param y The y-coordinate.
 * @param x The x-coordinate.
 */
internal fun atan(y: Float, x: Float): Float {
    val ret = atan2(y, x) - QuarterCircle.toFloat()
    return if (ret < 0) ret + FullCircle else ret
}

/**
 * Converts an integer to a localized string representation.
 *
 * This function formats the integer according to the specified number of digits and whether grouping
 * (e.g., thousands separators) should be used.
 *
 * @param minDigits The minimum number of digits to display. Default is 1.
 * @param maxDigits The maximum number of digits to display. Default is 2.
 * @param isGroupingUsed Whether grouping (e.g., thousands separators) should be used. Default is true.
 */
internal fun Int.toLocalString(
    minDigits: Int = 1,
    maxDigits: Int = 2,
    isGroupingUsed: Boolean = true
): String {
    return getCachedDateTimeFormatter(
        minDigits = minDigits,
        maxDigits = maxDigits,
        isGroupingUsed = isGroupingUsed
    )
        .format(this)
}

private val cachedFormatters = WeakHashMap<String, NumberFormat>()

/**
 * Retrieves a cached date-time formatter with the specified settings.
 *
 * This function uses a cache to store and retrieve formatters based on the specified settings
 * and the current locale. The cache key is constructed using the minimum digits, maximum digits,
 * grouping setting, and the language tag of the default locale.
 *
 * @param minDigits The minimum number of digits to display.
 * @param maxDigits The maximum number of digits to display.
 * @param isGroupingUsed Whether grouping (e.g., thousands separators) should be used.
 */
private fun getCachedDateTimeFormatter(
    minDigits: Int,
    maxDigits: Int,
    isGroupingUsed: Boolean
): NumberFormat {
    // Note: Using Locale.getDefault() as a best effort to obtain a unique key and keeping this
    // function non-composable.
    val key = "$minDigits.$maxDigits.$isGroupingUsed.${Locale.getDefault().toLanguageTag()}"
    return cachedFormatters.getOrPut(key) {
        NumberFormat.getIntegerInstance().apply {
            this.isGroupingUsed = isGroupingUsed
            this.minimumIntegerDigits = minDigits
            this.maximumIntegerDigits = maxDigits
        }
    }
}

/**
 * Enum class representing the layout IDs for different components of the time picker.
 *
 * @property Selector The layout ID for the selector component.
 * @property InnerCircle The layout ID for the inner circle component.
 */
internal enum class LayoutId {
    Selector,
    InnerCircle,
}

/** Helper function for component shape tokens. Used to grab the top values of a shape parameter. */
internal fun CornerBasedShape.top(): CornerBasedShape {
    return copy(bottomStart = CornerSize(0.0.dp), bottomEnd = CornerSize(0.0.dp))
}

/**
 * Helper function for component shape tokens. Used to grab the bottom values of a shape parameter.
 */
internal fun CornerBasedShape.bottom(): CornerBasedShape {
    return copy(topStart = CornerSize(0.0.dp), topEnd = CornerSize(0.0.dp))
}

/**
 * Helper function for component shape tokens. Used to grab the start values of a shape parameter.
 */
internal fun CornerBasedShape.start(): CornerBasedShape {
    return copy(topEnd = CornerSize(0.0.dp), bottomEnd = CornerSize(0.0.dp))
}

/** Helper function for component shape tokens. Used to grab the end values of a shape parameter. */
internal fun CornerBasedShape.end(): CornerBasedShape {
    return copy(topStart = CornerSize(0.0.dp), bottomStart = CornerSize(0.0.dp))
}