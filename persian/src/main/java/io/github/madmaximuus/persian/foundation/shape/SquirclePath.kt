package io.github.madmaximuus.persian.foundation.shape

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.DrawStyle
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.translate

fun squircleShapePath(
    size: Size,
    topLeftCorner: Float,
    topRightCorner: Float,
    bottomLeftCorner: Float,
    bottomRightCorner: Float,
    cornerSmoothing: Float = SquircleSmoothing.MEDIUM
): Path {
    return Path().apply {
        val width = size.width
        val height = size.height
        val smoothing = cornerSmoothing * 0.5f
        moveTo(x = topLeftCorner + topLeftCorner * smoothing, y = 0f)
        lineTo(x = width - topRightCorner - topRightCorner * smoothing, y = 0f)
        cubicTo(
            x1 = width - topRightCorner * smoothing, y1 = 0f,
            x2 = width, y2 = topRightCorner * smoothing,
            x3 = width, y3 = topRightCorner + topRightCorner * smoothing
        )
        lineTo(x = width, y = height - bottomRightCorner - bottomRightCorner * smoothing)
        cubicTo(
            x1 = width, y1 = height - bottomRightCorner * smoothing,
            x2 = width - bottomRightCorner * smoothing, y2 = height,
            x3 = width - bottomRightCorner - bottomRightCorner * smoothing, y3 = height
        )
        lineTo(x = bottomLeftCorner + bottomLeftCorner * smoothing, y = height)
        cubicTo(
            x1 = bottomLeftCorner * smoothing, y1 = height,
            x2 = 0f, y2 = height - bottomLeftCorner * smoothing,
            x3 = 0f, y3 = height - bottomLeftCorner - bottomLeftCorner * smoothing
        )
        lineTo(x = 0f, y = topLeftCorner + topLeftCorner * smoothing)
        cubicTo(
            x1 = 0f, y1 = topLeftCorner * smoothing,
            x2 = topLeftCorner * smoothing, y2 = 0f,
            x3 = topLeftCorner + topLeftCorner * smoothing, y3 = 0f
        )
        close()
    }
}

fun DrawScope.drawSquircle(
    color: Color,
    topLeft: Offset = Offset.Zero,
    size: Size,
    topLeftCorner: Float,
    topRightCorner: Float,
    bottomLeftCorner: Float,
    bottomRightCorner: Float,
    cornerSmoothing: Float = 0.72f,
    style: DrawStyle = Fill,
    alpha: Float = 1.0f,
    colorFilter: ColorFilter? = null,
    blendMode: BlendMode = DrawScope.DefaultBlendMode
) {

    val squircleShapePath = squircleShapePath(
        size = size,
        topLeftCorner = clampedCornerRadius(topLeftCorner, size),
        topRightCorner = clampedCornerRadius(topRightCorner, size),
        bottomLeftCorner = clampedCornerRadius(bottomLeftCorner, size),
        bottomRightCorner = clampedCornerRadius(bottomRightCorner, size),
        cornerSmoothing = cornerSmoothing
    )

    translate(
        left = topLeft.x,
        top = topLeft.y
    ) {

        drawPath(
            path = squircleShapePath,
            color = color,
            alpha = alpha,
            style = style,
            colorFilter = colorFilter,
            blendMode = blendMode
        )

    }

}

fun DrawScope.drawSquircle(
    brush: Brush,
    topLeft: Offset = Offset.Zero,
    size: Size,
    topLeftCorner: Float,
    topRightCorner: Float,
    bottomLeftCorner: Float,
    bottomRightCorner: Float,
    cornerSmoothing: Float = 0.67f,
    style: DrawStyle = Fill,
    alpha: Float = 1.0f,
    colorFilter: ColorFilter? = null,
    blendMode: BlendMode = DrawScope.DefaultBlendMode
) {
    val squircleShapePath = squircleShapePath(
        size = size,
        topLeftCorner = clampedCornerRadius(topLeftCorner, size),
        topRightCorner = clampedCornerRadius(topRightCorner, size),
        bottomLeftCorner = clampedCornerRadius(bottomLeftCorner, size),
        bottomRightCorner = clampedCornerRadius(bottomRightCorner, size),
        cornerSmoothing = cornerSmoothing
    )
    translate(
        left = topLeft.x,
        top = topLeft.y
    ) {
        drawPath(
            path = squircleShapePath,
            brush = brush,
            alpha = alpha,
            style = style,
            colorFilter = colorFilter,
            blendMode = blendMode
        )
    }
}