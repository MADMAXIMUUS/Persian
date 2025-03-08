package io.github.madmaximuus.persian.foundation.shape

import android.util.Log
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp

class SquircleShape(
    topStart: CornerSize,
    topEnd: CornerSize,
    bottomEnd: CornerSize,
    bottomStart: CornerSize,
    private val smoothing: SquircleSmoothing = SquircleSmoothing.NONE
) : CornerBasedShape(topStart, topEnd, bottomEnd, bottomStart) {

    override fun createOutline(
        size: Size,
        topStart: Float,
        topEnd: Float,
        bottomEnd: Float,
        bottomStart: Float,
        layoutDirection: LayoutDirection
    ): Outline {
        Log.d("SquircleShape", "Resolved corners: TS=$topStart, TE=$topEnd, BE=$bottomEnd, BS=$bottomStart, Size=$size")

        if (topStart + topEnd + bottomEnd + bottomStart == 0.0f) {
            return Outline.Rectangle(Rect(0f, 0f, size.width, size.height))
        }

        val path = Path()

        val resolvedTopStart = if (layoutDirection == LayoutDirection.Ltr) topStart else topEnd
        val resolvedTopEnd = if (layoutDirection == LayoutDirection.Ltr) topEnd else topStart
        val resolvedBottomEnd = if (layoutDirection == LayoutDirection.Ltr) bottomEnd else bottomStart
        val resolvedBottomStart = if (layoutDirection == LayoutDirection.Ltr) bottomStart else bottomEnd

        path.moveTo(resolvedTopStart, 0f)

        // Верхний правый угол
        path.lineTo(size.width - resolvedTopEnd, 0f)
        if (resolvedTopEnd > 0f) {
            path.arcTo(
                Rect(
                    size.width - 2 * resolvedTopEnd, 0f,
                    size.width, 2 * resolvedTopEnd
                ),
                -90f, 90f, false
            )
        }

        // Нижний правый угол
        path.lineTo(size.width, size.height - resolvedBottomEnd)
        if (resolvedBottomEnd > 0f) {
            path.arcTo(
                Rect(
                    size.width - 2 * resolvedBottomEnd, size.height - 2 * resolvedBottomEnd,
                    size.width, size.height
                ),
                0f, 90f, false
            )
        }

        // Нижний левый угол
        path.lineTo(resolvedBottomStart, size.height)
        if (resolvedBottomStart > 0f) {
            path.arcTo(
                Rect(
                    0f, size.height - 2 * resolvedBottomStart,
                    2 * resolvedBottomStart, size.height
                ),
                90f, 90f, false
            )
        }

        // Верхний левый угол
        path.lineTo(0f, resolvedTopStart)
        if (resolvedTopStart > 0f) {
            path.arcTo(
                Rect(
                    0f, 0f,
                    2 * resolvedTopStart, 2 * resolvedTopStart
                ),
                180f, 90f, false
            )
        }

        path.close()
        return Outline.Generic(path)
    }


    override fun copy(
        topStart: CornerSize,
        topEnd: CornerSize,
        bottomEnd: CornerSize,
        bottomStart: CornerSize
    ): CornerBasedShape = SquircleShape(topStart, topEnd, bottomEnd, bottomStart, smoothing)

    override fun toString(): String {
        return "SquircleShape(topStart = $topStart, topEnd = $topEnd, bottomEnd = $bottomEnd, bottomStart = $bottomStart, smoothing = $smoothing)"
    }
}

fun SquircleShape(corner: CornerSize, smoothing: SquircleSmoothing = SquircleSmoothing.NONE) =
    SquircleShape(
        topStart = corner,
        topEnd = corner,
        bottomEnd = corner,
        bottomStart = corner,
        smoothing = smoothing
    )

fun SquircleShape(corner: Dp, smoothing: SquircleSmoothing = SquircleSmoothing.NONE) =
    SquircleShape(
        topStart = CornerSize(corner),
        topEnd = CornerSize(corner),
        bottomEnd = CornerSize(corner),
        bottomStart = CornerSize(corner),
        smoothing = smoothing
    )

fun SquircleShape(corner: Float, smoothing: SquircleSmoothing = SquircleSmoothing.NONE) =
    SquircleShape(
        topStart = CornerSize(corner),
        topEnd = CornerSize(corner),
        bottomEnd = CornerSize(corner),
        bottomStart = CornerSize(corner),
        smoothing = smoothing
    )

fun SquircleShape(percent: Int, smoothing: SquircleSmoothing = SquircleSmoothing.NONE) =
    SquircleShape(
        topStart = CornerSize(percent),
        topEnd = CornerSize(percent),
        bottomEnd = CornerSize(percent),
        bottomStart = CornerSize(percent),
        smoothing = smoothing
    )

fun SquircleShape(
    topStart: Dp = 0.dp,
    topEnd: Dp = 0.dp,
    bottomEnd: Dp = 0.dp,
    bottomStart: Dp = 0.dp,
    smoothing: SquircleSmoothing = SquircleSmoothing.NONE
) = SquircleShape(
    topStart = CornerSize(topStart),
    topEnd = CornerSize(topEnd),
    bottomEnd = CornerSize(bottomEnd),
    bottomStart = CornerSize(bottomStart),
    smoothing = smoothing
)

fun SquircleShape(
    topStart: Float = 0f,
    topEnd: Float = 0f,
    bottomEnd: Float = 0f,
    bottomStart: Float = 0f,
    smoothing: SquircleSmoothing = SquircleSmoothing.NONE
) = SquircleShape(
    topStart = CornerSize(topStart),
    topEnd = CornerSize(topEnd),
    bottomEnd = CornerSize(bottomEnd),
    bottomStart = CornerSize(bottomStart),
    smoothing = smoothing
)

fun SquircleShape(
    topStartPercent: Int = 0,
    topEndPercent: Int = 0,
    bottomEndPercent: Int = 0,
    bottomStartPercent: Int = 0,
    smoothing: SquircleSmoothing = SquircleSmoothing.NONE
) = SquircleShape(
    topStart = CornerSize(topStartPercent),
    topEnd = CornerSize(topEndPercent),
    bottomEnd = CornerSize(bottomEndPercent),
    bottomStart = CornerSize(bottomStartPercent),
    smoothing = smoothing
)