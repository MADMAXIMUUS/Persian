package io.github.madmaximuus.persian.progressIndicator

import androidx.compose.animation.core.CubicBezierEasing
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.VectorConverter
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.animateValue
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.keyframes
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.progressSemantics
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.semantics.ProgressBarRangeInfo
import androidx.compose.ui.semantics.progressBarRangeInfo
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.drawText
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import kotlin.math.PI
import kotlin.math.abs
import kotlin.math.max
import kotlin.math.min

/**
 * Progress indicators express an unspecified wait time or display the duration of a process.
 *
 * @param progress the progress of this progress indicator, where 0.0 represents no progress and 1.0
 *   represents full progress. Values outside of this range are coerced into the range.
 * @param modifier the [Modifier] to be applied to this progress indicator.
 * @param maxValue the max value that progress indicator can be.
 * @param colors the container and content colors of this indicator.
 * @param sizes the container and content sizes of this indicator.
 * @param content the whether the content will be shown.
 */
@Composable
fun CircularProgressIndicator(
    progress: () -> Float,
    modifier: Modifier = Modifier,
    maxValue: () -> Float = { 1f },
    sizes: CircularProgressBarSizes = ProgressIndicatorDefaults.circularMedium(),
    colors: ProgressBarColors = ProgressIndicatorDefaults.colors(),
    content: Boolean = false
) {
    val coercedProgress = { progress().coerceIn(0f, maxValue()) / maxValue() }
    val stroke = with(LocalDensity.current) {
        Stroke(
            width = sizes.strokeWidth.toPx(),
            cap = sizes.strokeCap
        )
    }

    val measurer = rememberTextMeasurer()
    val measurement =
        measurer.measure(progress().getProgressInPercent(), sizes.contentTextStyle)
    val textStyle = sizes.contentTextStyle.copy(color = colors.contentColor)
    Canvas(
        modifier
            .semantics(mergeDescendants = true) {
                progressBarRangeInfo = ProgressBarRangeInfo(coercedProgress(), 0f..1f)
            }
            .size(sizes.diameter)
    ) {
        // Start at 12 o'clock
        val startAngle = 270f
        val sweep = coercedProgress() * 360f
        val adjustedGapSize =
            if (sizes.strokeCap == StrokeCap.Butt || size.height > size.width) {
                sizes.gapSize
            } else {
                sizes.gapSize + sizes.strokeWidth
            }
        val gapSizeSweep =
            (adjustedGapSize.value / (Math.PI * size.width.toDp().value).toFloat()) * 360f

        drawCircularIndicator(
            startAngle + sweep + min(sweep, gapSizeSweep),
            360f - sweep - min(sweep, gapSizeSweep) * 2,
            colors.trackColor,
            stroke
        )
        drawDeterminateCircularIndicator(startAngle, sweep, colors.progressColor, stroke)
        if (content) {
            drawText(
                textMeasurer = measurer,
                text = progress().getProgressInPercent(),
                style = textStyle,
                size = Size(
                    measurement.size.width.toFloat(),
                    measurement.size.height.toFloat()
                ),
                topLeft = Offset(
                    center.x
                            - measurement.size.width / 2,
                    center.y
                            - measurement.size.height / 2
                )
            )
        }
    }
}

/**
 * Progress indicators express an unspecified wait time or display the duration of a process.
 *
 * @param modifier the [Modifier] to be applied to this progress indicator
 * @param colors the container and content colors of this indicator.
 * @param sizes the container and content sizes of this indicator.
 *
 */
@Composable
fun CircularProgressIndicator(
    modifier: Modifier = Modifier,
    sizes: CircularProgressBarSizes = ProgressIndicatorDefaults.circularMedium(),
    colors: ProgressBarColors = ProgressIndicatorDefaults.colors()
) {
    val stroke = with(LocalDensity.current) {
        Stroke(
            width = sizes.strokeWidth.toPx(),
            cap = sizes.strokeCap
        )
    }

    val transition = rememberInfiniteTransition(label = "")
    // The current rotation around the circle, so we know where to start the rotation from
    val currentRotation =
        transition.animateValue(
            0,
            RotationsPerCycle,
            Int.VectorConverter,
            infiniteRepeatable(
                animation =
                    tween(
                        durationMillis = RotationDuration * RotationsPerCycle,
                        easing = LinearEasing
                    )
            ), label = ""
        )
    // How far forward (degrees) the base point should be from the start point
    val baseRotation =
        transition.animateFloat(
            0f,
            BaseRotationAngle,
            infiniteRepeatable(
                animation = tween(durationMillis = RotationDuration, easing = LinearEasing)
            ), label = ""
        )
    // How far forward (degrees) both the head and tail should be from the base point
    val endAngle =
        transition.animateFloat(
            0f,
            JumpRotationAngle,
            infiniteRepeatable(
                animation =
                    keyframes {
                        durationMillis = HeadAndTailAnimationDuration + HeadAndTailDelayDuration
                        0f at 0 using CircularEasing
                        JumpRotationAngle at HeadAndTailAnimationDuration
                    }
            ), label = ""
        )
    val startAngle =
        transition.animateFloat(
            0f,
            JumpRotationAngle,
            infiniteRepeatable(
                animation =
                    keyframes {
                        durationMillis = HeadAndTailAnimationDuration + HeadAndTailDelayDuration
                        0f at HeadAndTailDelayDuration using CircularEasing
                        JumpRotationAngle at durationMillis
                    }
            ), label = ""
        )
    Canvas(
        modifier
            .progressSemantics()
            .size(sizes.diameter)
    ) {
        drawCircularIndicatorTrack(colors.trackColor, stroke)

        val currentRotationAngleOffset = (currentRotation.value * RotationAngleOffset) % 360f

        // How long a line to draw using the start angle as a reference point
        val sweep = abs(endAngle.value - startAngle.value)

        // Offset by the constant offset and the per rotation offset
        val offset = StartAngleOffset + currentRotationAngleOffset + baseRotation.value
        drawIndeterminateCircularIndicator(
            startAngle.value + offset,
            sizes.strokeWidth,
            sweep,
            colors.progressColor,
            stroke
        )
    }
}

/**
 * Draws a circular indicator on the [DrawScope].
 *
 * This function draws an arc with the specified [startAngle], [sweep], [color], and [stroke].
 * The arc is centered within the [DrawScope]'s size, with the diameter adjusted to account for the stroke width.
 *
 * @param startAngle The starting angle of the arc in degrees.
 * @param sweep The sweep angle of the arc in degrees.
 * @param color The color of the arc.
 * @param stroke The stroke style of the arc.
 */
private fun DrawScope.drawCircularIndicator(
    startAngle: Float,
    sweep: Float,
    color: Color,
    stroke: Stroke
) {
    // To draw this circle we need a rect with edges that line up with the midpoint of the stroke.
    // To do this we need to remove half the stroke width from the total diameter for both sides.
    val diameterOffset = stroke.width / 2
    val arcDimen = size.width - 2 * diameterOffset
    drawArc(
        color = color,
        startAngle = startAngle,
        sweepAngle = sweep,
        useCenter = false,
        topLeft = Offset(diameterOffset, diameterOffset),
        size = Size(arcDimen, arcDimen),
        style = stroke
    )
}

/**
 * Draws a full circular track on the [DrawScope].
 *
 * This function draws a complete circle (360 degrees) with the specified [color] and [stroke].
 * It utilizes the [drawCircularIndicator] function to achieve this.
 *
 * @param color The color of the circular track.
 * @param stroke The stroke style of the circular track.
 */
private fun DrawScope.drawCircularIndicatorTrack(color: Color, stroke: Stroke) =
    drawCircularIndicator(0f, 360f, color, stroke)

/**
 * Draws a determinate circular indicator on the [DrawScope].
 *
 * This function draws an arc with the specified [startAngle], [sweep], [color], and [stroke].
 * It utilizes the [drawCircularIndicator] function to achieve this.
 *
 * @param startAngle The starting angle of the arc in degrees.
 * @param sweep The sweep angle of the arc in degrees.
 * @param color The color of the arc.
 * @param stroke The stroke style of the arc.
 */
private fun DrawScope.drawDeterminateCircularIndicator(
    startAngle: Float,
    sweep: Float,
    color: Color,
    stroke: Stroke
) = drawCircularIndicator(startAngle, sweep, color, stroke)

/**
 * Draws an indeterminate circular indicator on the [DrawScope].
 *
 * This function draws an arc with the specified [startAngle], [strokeWidth], [sweep], [color], and [stroke].
 * It adjusts the starting angle and sweep to account for the stroke cap, ensuring the arc visually appears in the correct place.
 *
 * @param startAngle The starting angle of the arc in degrees.
 * @param strokeWidth The width of the stroke in Dp.
 * @param sweep The sweep angle of the arc in degrees.
 * @param color The color of the arc.
 * @param stroke The stroke style of the arc.
 */
private fun DrawScope.drawIndeterminateCircularIndicator(
    startAngle: Float,
    strokeWidth: Dp,
    sweep: Float,
    color: Color,
    stroke: Stroke
) {
    val strokeCapOffset =
        if (stroke.cap == StrokeCap.Butt) {
            0f
        } else {
            // Length of arc is angle * radius
            // Angle (radians) is length / radius
            // The length should be the same as the stroke width for calculating the min angle
            (180.0 / PI).toFloat() * (strokeWidth / (CircularIndicatorDiameter / 2)) / 2f
        }

    // Adding a stroke cap draws half the stroke width behind the start point, so we want to
    // move it forward by that amount so the arc visually appears in the correct place
    val adjustedStartAngle = startAngle + strokeCapOffset

    // When the start and end angles are in the same place, we still want to draw a small sweep, so
    // the stroke caps get added on both ends and we draw the correct minimum length arc
    val adjustedSweep = max(sweep, 0.1f)

    drawCircularIndicator(adjustedStartAngle, adjustedSweep, color, stroke)
}

internal val CircularIndicatorDiameter =
    48.0.dp - 4.0.dp * 2

// When the rotation is at its beginning (0 or 360 degrees) we want it to be drawn at 12 o clock,
// which means 270 degrees when drawing.
private const val StartAngleOffset = -90f

// How far the base point moves around the circle
private const val BaseRotationAngle = 286f

// How far the head and tail should jump forward during one rotation past the base point
private const val JumpRotationAngle = 290f

// Each rotation is 1 and 1/3 seconds, but 1332ms divides more evenly
private const val RotationDuration = 1332

// Each rotation we want to offset the start position by this much, so we continue where
// the previous rotation ended. This is the maximum angle covered during one rotation.
private const val RotationAngleOffset = (BaseRotationAngle + JumpRotationAngle) % 360f

// The head animates for the first half of a rotation, then is static for the second half
// The tail is static for the first half and then animates for the second half
private const val HeadAndTailAnimationDuration = (RotationDuration * 0.5).toInt()
private const val HeadAndTailDelayDuration = HeadAndTailAnimationDuration

// The easing for the head and tail jump
private val CircularEasing = CubicBezierEasing(0.4f, 0f, 0.2f, 1f)

// The animation comprises of 5 rotations around the circle forming a 5 pointed star.
// After the 5th rotation, we are back at the beginning of the circle.
private const val RotationsPerCycle = 5

/**
 * Converts a float value to a formatted string representing a percentage.
 *
 * This function formats the float value to one decimal place and trims any trailing zeros and decimal points.
 *
 * @return A formatted string representing the percentage.
 */
@SuppressWarnings("MagicNumber")
internal fun Float.getProgressInPercent(): String = "%.1f".format(this)
    .trimEnd { it == '0' }
    .trimEnd { it == '.' }