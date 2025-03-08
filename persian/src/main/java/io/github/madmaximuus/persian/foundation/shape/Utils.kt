package io.github.madmaximuus.persian.foundation.shape

import androidx.compose.runtime.Stable
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.geometry.toRect
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.unit.LayoutDirection

@Stable
internal fun createSquircleShapeOutline(
    size: Size,
    topStart: Float,
    topEnd: Float,
    bottomEnd: Float,
    bottomStart: Float,
    cornerSmoothing: Float,
    layoutDirection: LayoutDirection
): Outline = if (topStart + topEnd + bottomEnd + bottomStart == 0.0f) {
    Outline.Rectangle(size.toRect())
} else {
    val isLtr = layoutDirection == LayoutDirection.Ltr
    val topLeftCorner = clampedCornerRadius(if (isLtr) topStart else topEnd, size)
    val topRightCorner = clampedCornerRadius(if (isLtr) topEnd else topStart, size)
    val bottomLeftCorner = clampedCornerRadius(if (isLtr) bottomStart else bottomEnd, size)
    val bottomRightCorner = clampedCornerRadius(if (isLtr) bottomEnd else bottomStart, size)

    Outline.Generic(
        path = squircleShapePath(
            size = size,
            topLeftCorner = topLeftCorner,
            topRightCorner = topRightCorner,
            bottomLeftCorner = bottomLeftCorner,
            bottomRightCorner = bottomRightCorner,
            cornerSmoothing = clampedCornerSmoothing(cornerSmoothing)
        )
    )

}

@Stable
internal fun clampedCornerRadius(
    cornerSize: Float,
    size: Size
): Float {
    val smallestAxis = size.minDimension / 2
    return cornerSize.coerceIn(0.0f, smallestAxis)
}

@Stable
internal fun clampedCornerSmoothing(cornerSmoothing: Float) = cornerSmoothing.coerceIn(0.55f, 1f)