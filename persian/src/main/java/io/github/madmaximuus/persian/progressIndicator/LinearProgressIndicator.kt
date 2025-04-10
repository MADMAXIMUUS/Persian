package io.github.madmaximuus.persian.progressIndicator

import androidx.compose.animation.core.CubicBezierEasing
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.keyframes
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.progressSemantics
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.layout.layout
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.semantics.ProgressBarRangeInfo
import androidx.compose.ui.semantics.progressBarRangeInfo
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.drawText
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.offset
import io.github.madmaximuus.persian.foundation.PersianTheme
import kotlin.math.abs
import kotlin.math.min

/**
 * Progress indicators express an unspecified wait time or display the duration of a process.
 *
 * @param progress the progress of this progress indicator, where 0.0 represents no progress and 1.0
 *   represents full progress. Values outside of this range are coerced into the range.
 * @param modifier the [Modifier] to be applied to this progress indicator
 * @param maxValue the max value that progress indicator can be.
 * @param colors the container and content colors of this indicator.
 * @param sizes the container and content sizes of this indicator.
 * @param content the whether the content will be shown.
 */
@Composable
fun LinearProgressIndicator(
    progress: () -> Float,
    modifier: Modifier = Modifier,
    maxValue: () -> Float = { 1f },
    colors: ProgressBarColors = ProgressIndicatorDefaults.colors(),
    sizes: LinearProgressBarSizes = ProgressIndicatorDefaults.linearMedium(),
    content: Boolean = false
) {
    val coercedProgress = { progress().coerceIn(0f, maxValue()) / maxValue() }
    val measurer = rememberTextMeasurer()
    val measurement =
        measurer.measure(progress().getProgressInPercent(), sizes.contentTextStyle)
    val textStyle = sizes.contentTextStyle.copy(color = colors.contentColor)
    var height: Dp
    with(LocalDensity.current) {
        height = if (content) (measurement.size.height + sizes.strokeSize.toPx() + 5).toDp()
        else (sizes.strokeSize.toPx()).toDp()
    }
    Canvas(
        modifier
            .then(IncreaseSemanticsBounds)
            .semantics(mergeDescendants = true) {
                progressBarRangeInfo = ProgressBarRangeInfo(coercedProgress(), 0f..1f)
            }
            .height(height)
    ) {
        val strokeWidth = sizes.strokeSize.toPx()
        val adjustedGapSize =
            if (sizes.strokeCap == StrokeCap.Butt || size.height > size.width) {
                sizes.gapSize
            } else {
                sizes.gapSize + strokeWidth.toDp()
            }
        val gapSizeFraction = adjustedGapSize / size.width.toDp()
        val currentCoercedProgress = coercedProgress()

        // track
        val trackStartFraction =
            currentCoercedProgress + min(currentCoercedProgress, gapSizeFraction)
        if (trackStartFraction <= 1f) {
            drawLinearIndicator(
                trackStartFraction,
                1f,
                colors.trackColor,
                strokeWidth,
                sizes.strokeCap
            )
        }
        // indicator
        drawLinearIndicator(
            0f,
            currentCoercedProgress,
            colors.progressColor,
            strokeWidth,
            sizes.strokeCap
        )
        // stop
        drawStopIndicator(
            drawScope = this,
            stopSize = sizes.stopSize,
            color = colors.progressColor,
            strokeCap = StrokeCap.Round,
            sizes.strokeSize.toPx()
        )
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
                    x = size.width - measurement.size.width,
                    y = 0f
                )
            )
        }
    }
}


/**
 * Progress indicators express an unspecified wait time or display the duration of a process.
 *
 * @param modifier the [Modifier] to be applied to this progress indicator
 * @param color color of this progress indicator
 * @param trackColor color of the track behind the indicator, visible when the progress has not
 *   reached the area of the overall indicator yet
 */
@Composable
fun LinearProgressIndicator(
    modifier: Modifier = Modifier,
    color: Color = PersianTheme.colorScheme.primary,
    trackColor: Color = PersianTheme.colorScheme.secondaryContainer,
    sizes: LinearProgressBarSizes = ProgressIndicatorDefaults.linearMedium(),
) {
    val infiniteTransition = rememberInfiniteTransition(label = "")
    // Fractional position of the 'head' and 'tail' of the two lines drawn, i.e. if the head is 0.8
    // and the tail is 0.2, there is a line drawn from between 20% along to 80% along the total
    // width.
    val firstLineHead =
        infiniteTransition.animateFloat(
            0f,
            1f,
            infiniteRepeatable(
                animation = keyframes {
                    durationMillis = LinearAnimationDuration
                    0f at FirstLineHeadDelay using FirstLineHeadEasing
                    1f at FirstLineHeadDuration + FirstLineHeadDelay
                }
            ), label = ""
        )
    val firstLineTail =
        infiniteTransition.animateFloat(
            0f,
            1f,
            infiniteRepeatable(
                animation =
                    keyframes {
                        durationMillis = LinearAnimationDuration
                        0f at FirstLineTailDelay using FirstLineTailEasing
                        1f at FirstLineTailDuration + FirstLineTailDelay
                    }
            ), label = ""
        )
    val secondLineHead =
        infiniteTransition.animateFloat(
            0f,
            1f,
            infiniteRepeatable(
                animation = keyframes {
                    durationMillis = LinearAnimationDuration
                    0f at SecondLineHeadDelay using SecondLineHeadEasing
                    1f at SecondLineHeadDuration + SecondLineHeadDelay

                }
            ), label = ""
        )
    val secondLineTail =
        infiniteTransition.animateFloat(
            0f,
            1f,
            infiniteRepeatable(
                animation =
                    keyframes {
                        durationMillis = LinearAnimationDuration
                        0f at SecondLineTailDelay using SecondLineTailEasing
                        1f at SecondLineTailDuration + SecondLineTailDelay
                    }
            ), label = ""
        )
    Canvas(
        modifier
            .then(IncreaseSemanticsBounds)
            .progressSemantics()
            .height(sizes.strokeSize)
    ) {
        val strokeWidth = size.height
        val adjustedGapSize =
            if (sizes.strokeCap == StrokeCap.Butt || size.height > size.width) {
                sizes.gapSize
            } else {
                sizes.gapSize + strokeWidth.toDp()
            }
        val gapSizeFraction = adjustedGapSize / size.width.toDp()

        // Track before line 1
        if (firstLineHead.value < 1f - gapSizeFraction) {
            val start = if (firstLineHead.value > 0) firstLineHead.value + gapSizeFraction else 0f
            drawLinearIndicator(start, 1f, trackColor, strokeWidth, sizes.strokeCap)
        }

        // Line 1
        if (firstLineHead.value - firstLineTail.value > 0) {
            drawLinearIndicator(
                firstLineHead.value,
                firstLineTail.value,
                color,
                strokeWidth,
                sizes.strokeCap,
            )
        }

        // Track between line 1 and line 2
        if (firstLineTail.value > gapSizeFraction) {
            val start = if (secondLineHead.value > 0) secondLineHead.value + gapSizeFraction else 0f
            val end = if (firstLineTail.value < 1f) firstLineTail.value - gapSizeFraction else 1f
            drawLinearIndicator(start, end, trackColor, strokeWidth, sizes.strokeCap)
        }

        // Line 2
        if (secondLineHead.value - secondLineTail.value > 0) {
            drawLinearIndicator(
                secondLineHead.value,
                secondLineTail.value,
                color,
                strokeWidth,
                sizes.strokeCap,
            )
        }

        // Track after line 2
        if (secondLineTail.value > gapSizeFraction) {
            val end = if (secondLineTail.value < 1) secondLineTail.value - gapSizeFraction else 1f
            drawLinearIndicator(0f, end, trackColor, strokeWidth, sizes.strokeCap)
        }
    }
}

/**
 * Draws a linear indicator on the [DrawScope].
 *
 * This function draws a horizontal line representing a linear indicator with the specified [startFraction], [endFraction],
 * [color], [strokeWidth], and [strokeCap]. The line is centered vertically within the [DrawScope]'s height.
 *
 * @param startFraction The starting fraction of the indicator, ranging from 0 to 1.
 * @param endFraction The ending fraction of the indicator, ranging from 0 to 1.
 * @param color The color of the indicator.
 * @param strokeWidth The width of the stroke for the indicator.
 * @param strokeCap The stroke cap style for the indicator.
 */
private fun DrawScope.drawLinearIndicator(
    startFraction: Float,
    endFraction: Float,
    color: Color,
    strokeWidth: Float,
    strokeCap: StrokeCap
) {
    val width = size.width
    val height = size.height
    // Start drawing from the vertical center of the stroke
    val yOffset = height - strokeWidth / 2

    val isLtr = layoutDirection == LayoutDirection.Ltr
    val barStart = (if (isLtr) startFraction else 1f - endFraction) * width
    val barEnd = (if (isLtr) endFraction else 1f - startFraction) * width

    // if there isn't enough space to draw the stroke caps, fall back to StrokeCap.Butt
    if (strokeCap == StrokeCap.Butt || height > width) {
        // Progress line
        drawLine(color, Offset(barStart, yOffset), Offset(barEnd, yOffset), strokeWidth)
    } else {
        // need to adjust barStart and barEnd for the stroke caps
        val strokeCapOffset = strokeWidth / 2
        val coerceRange = strokeCapOffset..(width - strokeCapOffset)
        val adjustedBarStart = barStart.coerceIn(coerceRange)
        val adjustedBarEnd = barEnd.coerceIn(coerceRange)

        if (abs(endFraction - startFraction) > 0) {
            // Progress line
            drawLine(
                color,
                Offset(adjustedBarStart, yOffset),
                Offset(adjustedBarEnd, yOffset),
                strokeWidth,
                strokeCap,
            )
        }
    }
}


/**
 * Draws the stop indicator at the end of the track.
 *
 * @param drawScope the [DrawScope]
 * @param stopSize size of this stop indicator, it cannot be bigger than the track's height
 * @param color color of this stop indicator
 * @param strokeCap stroke cap to use for the ends of this stop indicator
 */
fun drawStopIndicator(
    drawScope: DrawScope,
    stopSize: Dp,
    color: Color,
    strokeCap: StrokeCap,
    strokeSize: Float
) {
    with(drawScope) {
        val adjustedStopSize =
            min(stopSize.toPx(), strokeSize) // Stop can't be bigger than track
        val stopOffset = (strokeSize - adjustedStopSize) / 2 // Offset from end
        if (strokeCap == StrokeCap.Round) {
            drawCircle(
                color = color,
                radius = adjustedStopSize / 2f,
                center =
                    Offset(
                        x = size.width - (adjustedStopSize / 2f) - stopOffset,
                        y = size.height - strokeSize / 2f
                    )
            )
        } else {
            drawRect(
                color = color,
                topLeft =
                    Offset(
                        x = size.width - adjustedStopSize - stopOffset,
                        y = (size.height - adjustedStopSize) - strokeSize / 2f
                    ),
                size = Size(width = adjustedStopSize, height = adjustedStopSize)
            )
        }
    }
}

private val SemanticsBoundsPadding: Dp = 10.dp
private val IncreaseSemanticsBounds: Modifier =
    Modifier
        .layout { measurable, constraints ->
            val paddingPx = SemanticsBoundsPadding.roundToPx()
            // We need to add vertical padding to the semantics bounds in order to meet
            // screenreader green box minimum size, but we also want to
            // preserve a visual appearance and layout size below that minimum
            // in order to maintain backwards compatibility. This custom
            // layout effectively implements "negative padding".
            val newConstraint = constraints.offset(0, paddingPx * 2)
            val placeable = measurable.measure(newConstraint)

            // But when actually placing the placeable, create the layout without additional
            // space. Place the placeable where it would've been without any extra padding.
            val height = placeable.height - paddingPx * 2
            val width = placeable.width
            layout(width, height) { placeable.place(0, -paddingPx) }
        }
        .semantics(mergeDescendants = true) {}
        .padding(vertical = SemanticsBoundsPadding)

// CircularProgressIndicator Material specs
// Diameter of the indicator circle
/*@VisibleForTesting*/


// Indeterminate linear indicator transition specs

// Total duration for one cycle
private const val LinearAnimationDuration = 1800

// Duration of the head and tail animations for both lines
private const val FirstLineHeadDuration = 750
private const val FirstLineTailDuration = 850
private const val SecondLineHeadDuration = 567
private const val SecondLineTailDuration = 533

// Delay before the start of the head and tail animations for both lines
private const val FirstLineHeadDelay = 0
private const val FirstLineTailDelay = 333
private const val SecondLineHeadDelay = 1000
private const val SecondLineTailDelay = 1267

private val FirstLineHeadEasing = CubicBezierEasing(0.2f, 0f, 0.8f, 1f)
private val FirstLineTailEasing = CubicBezierEasing(0.4f, 0f, 1f, 1f)
private val SecondLineHeadEasing = CubicBezierEasing(0f, 0f, 0.65f, 1f)
private val SecondLineTailEasing = CubicBezierEasing(0.1f, 0f, 0.45f, 1f)