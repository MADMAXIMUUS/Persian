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

internal fun drawStopIndicator(drawScope: DrawScope, offset: Offset, size: Dp, color: Color) {
    with(drawScope) { drawCircle(color = color, center = offset, radius = size.toPx() / 2f) }
}