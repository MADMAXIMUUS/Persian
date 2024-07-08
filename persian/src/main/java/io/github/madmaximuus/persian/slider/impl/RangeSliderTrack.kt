package io.github.madmaximuus.persian.slider.impl

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.SliderDefaults.TickSize
import androidx.compose.material3.SliderDefaults.TrackStopIndicatorSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.slider.SliderColors
import io.github.madmaximuus.persian.slider.SliderDefaults
import io.github.madmaximuus.persian.slider.state.RangeSliderState


/**
 * The Default track for [RangeSlider]
 *
 * @param rangeSliderState [RangeSliderState] which is used to obtain the current active track.
 * @param modifier the [Modifier] to be applied to the track.
 * @param enabled controls the enabled state of this slider. When `false`, this component will
 *   not respond to user input, and it will appear visually disabled and disabled to
 *   accessibility services.
 * @param colors [SliderColors] that will be used to resolve the colors used for this track in
 *   different states. See [SliderDefaults.colors].
 * @param drawStopIndicator lambda that will be called to draw the stop indicator at the
 *   start/end of the track.
 * @param drawTick lambda that will be called to draw the ticks if steps are greater than 0.
 * @param thumbTrackGapSize size of the gap between the thumbs and the track.
 * @param trackInsideCornerSize size of the corners towards the thumbs when a gap is set.
 */
@Composable
fun RangeSliderTrack(
    rangeSliderState: RangeSliderState,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    colors: SliderColors = SliderDefaults.colors(),
    drawStopIndicator: (DrawScope.(Offset, Color) -> Unit)? = { offset, color ->
        drawStopIndicator(
            drawScope = this,
            offset = offset,
            color = color,
            size = TrackStopIndicatorSize
        )
    },
    drawTick: DrawScope.(Offset, Color) -> Unit = { offset, color ->
        drawStopIndicator(
            drawScope = this,
            offset = offset,
            color = color,
            size = TickSize
        )
    },
    thumbTrackGapSize: Dp = ThumbTrackGapSize,
    trackInsideCornerSize: Dp = TrackInsideCornerSize
) {
    val inactiveTrackColor = colors.trackColor(enabled, active = false)
    val activeTrackColor = colors.trackColor(enabled, active = true)
    val inactiveTickColor = colors.tickColor(enabled, active = false)
    val activeTickColor = colors.tickColor(enabled, active = true)
    Canvas(
        modifier
            .fillMaxWidth()
            .height(TrackHeight)
            .rotate(if (LocalLayoutDirection.current == LayoutDirection.Rtl) 180f else 0f)
    ) {
        drawTrack(
            rangeSliderState.tickFractions,
            rangeSliderState.coercedActiveRangeStartAsFraction,
            rangeSliderState.coercedActiveRangeEndAsFraction,
            inactiveTrackColor,
            activeTrackColor,
            inactiveTickColor,
            activeTickColor,
            rangeSliderState.trackHeight.toDp(),
            rangeSliderState.startThumbWidth.toDp(),
            rangeSliderState.endThumbWidth.toDp(),
            thumbTrackGapSize,
            trackInsideCornerSize,
            drawStopIndicator,
            drawTick,
            isRangeSlider = true,
            isCenteredSlider = false
        )
    }
}

private val ThumbTrackGapSize: Dp = 6.dp
private val TrackInsideCornerSize: Dp = 2.dp