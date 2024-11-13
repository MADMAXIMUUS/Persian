package io.github.madmaximuus.persian.slider.impl

import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.RoundRect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.geometry.lerp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * Extension function to draw the track of a slider within a [DrawScope].
 *
 * This function draws the inactive and active tracks of the slider, including ticks and stop indicators.
 * It handles different slider types (range slider, centered slider) and customizes the appearance based on the provided parameters.
 *
 * @param tickFractions An array of fractions representing the positions of the ticks along the track.
 * @param activeRangeStart The start value of the active range as a fraction of the track length.
 * @param activeRangeEnd The end value of the active range as a fraction of the track length.
 * @param inactiveTrackColor The color of the inactive track.
 * @param activeTrackColor The color of the active track.
 * @param inactiveTickColor The color of the ticks in the inactive track.
 * @param activeTickColor The color of the ticks in the active track.
 * @param height The height of the track.
 * @param startThumbWidth The width of the start thumb.
 * @param endThumbWidth The width of the end thumb.
 * @param thumbTrackGapSize The gap size between the thumb and the track.
 * @param trackInsideCornerSize The size of the inside corners of the track.
 * @param drawStopIndicator A function to draw the stop indicator at a given position and color.
 * @param drawTick A function to draw a tick at a given position and color.
 * @param isRangeSlider Whether the slider is a range slider.
 * @param isCenteredSlider Whether the slider is a centered slider.
 */
internal fun DrawScope.drawTrack(
    tickFractions: FloatArray,
    activeRangeStart: Float,
    activeRangeEnd: Float,
    inactiveTrackColor: Color,
    activeTrackColor: Color,
    inactiveTickColor: Color,
    activeTickColor: Color,
    height: Dp,
    startThumbWidth: Dp,
    endThumbWidth: Dp,
    thumbTrackGapSize: Dp,
    trackInsideCornerSize: Dp,
    drawStopIndicator: (DrawScope.(Offset, Color) -> Unit)?,
    drawTick: DrawScope.(Offset, Color) -> Unit,
    isRangeSlider: Boolean,
    isCenteredSlider: Boolean
) {
    val sliderStart = Offset(0f, center.y)
    val sliderEnd = Offset(size.width, center.y)
    val trackStrokeWidth = height.toPx()

    val sliderValueEnd =
        Offset(sliderStart.x + (sliderEnd.x - sliderStart.x) * activeRangeEnd, center.y)

    val sliderValueStart =
        Offset(sliderStart.x + (sliderEnd.x - sliderStart.x) * activeRangeStart, center.y)

    val cornerSize = trackStrokeWidth / 2
    val insideCornerSize = trackInsideCornerSize.toPx()
    var startGap = 0f
    var endGap = 0f
    if (thumbTrackGapSize > 0.dp) {
        startGap = startThumbWidth.toPx() / 2 + thumbTrackGapSize.toPx()
        endGap = endThumbWidth.toPx() / 2 + thumbTrackGapSize.toPx()
    }

    // inactive track (range slider)
    if (isRangeSlider && sliderValueStart.x > sliderStart.x + startGap + cornerSize) {
        val start = sliderStart.x
        val end = sliderValueStart.x - startGap
        drawTrackPath(
            Offset.Zero,
            Size(end - start, trackStrokeWidth),
            inactiveTrackColor,
            cornerSize,
            insideCornerSize
        )
        drawStopIndicator?.invoke(this, Offset(start + cornerSize, center.y), inactiveTickColor)
    }
    // inactive track (centered slider)
    if (isCenteredSlider && sliderValueEnd.x > sliderStart.x + startGap + cornerSize) {
        val start = sliderStart.x
        val end = sliderValueEnd.x - startGap
        drawTrackPath(
            Offset.Zero,
            Size(end - start, trackStrokeWidth),
            inactiveTrackColor,
            cornerSize,
            insideCornerSize
        )
        drawStopIndicator?.invoke(this, Offset(start + cornerSize, center.y), inactiveTickColor)
    }
    // inactive track
    if (sliderValueEnd.x < sliderEnd.x - endGap - cornerSize) {
        val start = sliderValueEnd.x + endGap
        val end = sliderEnd.x
        drawTrackPath(
            Offset(start, 0f),
            Size(end - start, trackStrokeWidth),
            inactiveTrackColor,
            insideCornerSize,
            cornerSize
        )
        drawStopIndicator?.invoke(this, Offset(end - cornerSize, center.y), inactiveTickColor)
    }
    if (isCenteredSlider
        && (sliderValueEnd.x - startGap > (sliderEnd.x - sliderStart.x) / 2f
                || sliderValueEnd.x + endGap < (sliderEnd.x - sliderStart.x) / 2f)
    ) {
        drawTick(
            this,
            center, // offset
            inactiveTickColor // color
        )
    }
    // active track
    val activeTrackStart = if (isRangeSlider) sliderValueStart.x + startGap else 0f
    val activeTrackEnd = sliderValueEnd.x - endGap
    val startCornerRadius = if (isRangeSlider) insideCornerSize else cornerSize
    if (!isCenteredSlider && activeTrackEnd - activeTrackStart > startCornerRadius) {
        val start = sliderStart.x
        drawTrackPath(
            Offset(activeTrackStart, 0f),
            Size(activeTrackEnd - activeTrackStart, trackStrokeWidth),
            activeTrackColor,
            startCornerRadius,
            insideCornerSize
        )
        if (!isRangeSlider)
            drawStopIndicator?.invoke(this, Offset(start + cornerSize, center.y), activeTickColor)
    }

    val start = Offset(sliderStart.x + cornerSize, sliderStart.y)
    val end = Offset(sliderEnd.x - cornerSize, sliderEnd.y)
    val tickStartGap = sliderValueStart.x - startGap..sliderValueStart.x + startGap
    val tickEndGap = sliderValueEnd.x - endGap..sliderValueEnd.x + endGap
    tickFractions.forEachIndexed { index, tick ->
        // skip ticks that fall on the stop indicator
        if (drawStopIndicator != null) {
            if ((isRangeSlider && index == 0) || index == tickFractions.size - 1) {
                return@forEachIndexed
            }
        }

        val outsideFraction = tick > activeRangeEnd || tick < activeRangeStart
        val center = Offset(lerp(start, end, tick).x, center.y)
        // skip ticks that fall on a gap
        if ((isRangeSlider && center.x in tickStartGap) || center.x in tickEndGap) {
            return@forEachIndexed
        }
        drawTick(
            this,
            center, // offset
            if (outsideFraction) inactiveTickColor else activeTickColor // color
        )
    }
}

/**
 * Extension function to draw a rounded rectangle track path within a [DrawScope].
 *
 * This function creates a path for a rounded rectangle and draws it with the specified color.
 * The corners of the rectangle can be customized with different radii for the start and end corners.
 *
 * @param offset The offset position of the track.
 * @param size The size of the track.
 * @param color The color of the track.
 * @param startCornerRadius The radius of the start corners of the track.
 * @param endCornerRadius The radius of the end corners of the track.
 */
internal fun DrawScope.drawTrackPath(
    offset: Offset,
    size: Size,
    color: Color,
    startCornerRadius: Float,
    endCornerRadius: Float
) {
    val startCorner = CornerRadius(startCornerRadius, startCornerRadius)
    val endCorner = CornerRadius(endCornerRadius, endCornerRadius)
    val trackPath = Path()
    val track =
        RoundRect(
            rect = Rect(Offset(offset.x, 0f), size = Size(size.width, size.height)),
            topLeft = startCorner,
            topRight = endCorner,
            bottomRight = endCorner,
            bottomLeft = startCorner
        )
    trackPath.addRoundRect(track)
    drawPath(trackPath, color)
    trackPath.rewind()
}

/**
 * Function to draw a stop indicator within a [DrawScope].
 *
 * This function draws a circle at the specified offset with the given size and color.
 * The circle represents a stop indicator, commonly used in sliders to indicate the end points.
 *
 * @param drawScope The [DrawScope] in which to draw the stop indicator.
 * @param offset The offset position of the stop indicator.
 * @param size The diameter of the stop indicator.
 * @param color The color of the stop indicator.
 */
internal fun drawStopIndicator(drawScope: DrawScope, offset: Offset, size: Dp, color: Color) {
    with(drawScope) { drawCircle(color = color, center = offset, radius = size.toPx() / 2f) }
}