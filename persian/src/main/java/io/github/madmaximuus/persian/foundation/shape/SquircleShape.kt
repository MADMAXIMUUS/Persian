package io.github.madmaximuus.persian.foundation.shape

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp

class SquircleShape(
    topStart: CornerSize,
    topEnd: CornerSize,
    bottomEnd: CornerSize,
    bottomStart: CornerSize,
    val cornerSmoothing: Float = SquircleSmoothing.MEDIUM
) : CornerBasedShape(topStart, topEnd, bottomEnd, bottomStart) {

    override fun createOutline(
        size: Size,
        topStart: Float,
        topEnd: Float,
        bottomEnd: Float,
        bottomStart: Float,
        layoutDirection: LayoutDirection
    ) = createSquircleShapeOutline(
        size = size,
        topStart = topStart,
        topEnd = topEnd,
        bottomEnd = bottomEnd,
        bottomStart = bottomStart,
        cornerSmoothing = cornerSmoothing,
        layoutDirection = layoutDirection
    )

    override fun copy(
        topStart: CornerSize,
        topEnd: CornerSize,
        bottomEnd: CornerSize,
        bottomStart: CornerSize
    ): CornerBasedShape = SquircleShape(
        topStart = topStart,
        topEnd = topEnd,
        bottomEnd = bottomEnd,
        bottomStart = bottomStart,
        cornerSmoothing = cornerSmoothing
    )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SquircleShape) return false
        if (topStart != other.topStart) return false
        if (topEnd != other.topEnd) return false
        if (bottomStart != other.bottomStart) return false
        if (bottomEnd != other.bottomEnd) return false
        if (cornerSmoothing != other.cornerSmoothing) return false
        return true
    }

    override fun hashCode(): Int {
        var result = topStart.hashCode()
        result = 31 * result + topEnd.hashCode()
        result = 31 * result + bottomStart.hashCode()
        result = 31 * result + bottomEnd.hashCode()
        result = 31 * result + cornerSmoothing.hashCode()
        return result
    }

    override fun toString(): String {
        return "SquircleShape(topStart = $topStart, topEnd = $topEnd, bottomEnd = $bottomEnd, bottomStart = $bottomStart, smoothing = $cornerSmoothing)"
    }
}

fun SquircleShape(
    corner: CornerSize,
    smoothing: Float = SquircleSmoothing.MEDIUM
) = SquircleShape(
    topStart = corner,
    topEnd = corner,
    bottomEnd = corner,
    bottomStart = corner,
    cornerSmoothing = smoothing
)

fun SquircleShape(
    corner: Dp,
    smoothing: Float = SquircleSmoothing.MEDIUM
) = SquircleShape(
    topStart = CornerSize(corner),
    topEnd = CornerSize(corner),
    bottomEnd = CornerSize(corner),
    bottomStart = CornerSize(corner),
    cornerSmoothing = smoothing
)

fun SquircleShape(
    corner: Float,
    smoothing: Float = SquircleSmoothing.MEDIUM
) = SquircleShape(
    topStart = CornerSize(corner),
    topEnd = CornerSize(corner),
    bottomEnd = CornerSize(corner),
    bottomStart = CornerSize(corner),
    cornerSmoothing = smoothing
)

fun SquircleShape(
    percent: Int,
    smoothing: Float = SquircleSmoothing.MEDIUM
) = SquircleShape(
    topStart = CornerSize(percent),
    topEnd = CornerSize(percent),
    bottomEnd = CornerSize(percent),
    bottomStart = CornerSize(percent),
    cornerSmoothing = smoothing
)

fun SquircleShape(
    topStart: Dp = 0.dp,
    topEnd: Dp = 0.dp,
    bottomEnd: Dp = 0.dp,
    bottomStart: Dp = 0.dp,
    smoothing: Float = SquircleSmoothing.MEDIUM
) = SquircleShape(
    topStart = CornerSize(topStart),
    topEnd = CornerSize(topEnd),
    bottomEnd = CornerSize(bottomEnd),
    bottomStart = CornerSize(bottomStart),
    cornerSmoothing = smoothing
)

fun SquircleShape(
    topStart: Float = 0f,
    topEnd: Float = 0f,
    bottomEnd: Float = 0f,
    bottomStart: Float = 0f,
    smoothing: Float = SquircleSmoothing.MEDIUM
) = SquircleShape(
    topStart = CornerSize(topStart),
    topEnd = CornerSize(topEnd),
    bottomEnd = CornerSize(bottomEnd),
    bottomStart = CornerSize(bottomStart),
    cornerSmoothing = smoothing
)

fun SquircleShape(
    topStartPercent: Int = 0,
    topEndPercent: Int = 0,
    bottomEndPercent: Int = 0,
    bottomStartPercent: Int = 0,
    smoothing: Float = SquircleSmoothing.MEDIUM
) = SquircleShape(
    topStart = CornerSize(topStartPercent),
    topEnd = CornerSize(topEndPercent),
    bottomEnd = CornerSize(bottomEndPercent),
    bottomStart = CornerSize(bottomStartPercent),
    cornerSmoothing = smoothing
)