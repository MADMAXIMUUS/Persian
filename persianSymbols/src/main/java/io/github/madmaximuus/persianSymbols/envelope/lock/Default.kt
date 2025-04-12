package io.github.madmaximuus.persianSymbols.envelope.lock

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.EnvelopeLock: ImageVector
    get() {
        if (envelopeLock != null) {
            return envelopeLock!!
        }
        envelopeLock = Builder(
            name = "envelope-lock-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 8.5f)
                curveTo(2f, 6.015f, 4.015f, 4f, 6.5f, 4f)
                horizontalLineTo(17.5f)
                curveTo(19.985f, 4f, 22f, 6.015f, 22f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(22f, 15.613f, 21.996f, 15.725f, 21.988f, 15.836f)
                curveTo(21.87f, 15.723f, 21.74f, 15.623f, 21.6f, 15.538f)
                curveTo(21.521f, 14.575f, 21.173f, 13.36f, 20f, 12.804f)
                verticalLineTo(8.5f)
                curveTo(20f, 8.083f, 19.898f, 7.689f, 19.717f, 7.344f)
                lineTo(15.032f, 12.029f)
                lineTo(16.284f, 13.281f)
                curveTo(15.894f, 13.666f, 15.66f, 14.152f, 15.524f, 14.642f)
                lineTo(13.971f, 13.089f)
                lineTo(13.591f, 13.47f)
                curveTo(12.712f, 14.348f, 11.288f, 14.348f, 10.409f, 13.47f)
                lineTo(10.029f, 13.089f)
                lineTo(5.381f, 17.736f)
                curveTo(5.718f, 17.905f, 6.098f, 18f, 6.5f, 18f)
                horizontalLineTo(14.2f)
                verticalLineTo(20f)
                horizontalLineTo(6.5f)
                curveTo(4.015f, 20f, 2f, 17.985f, 2f, 15.5f)
                verticalLineTo(8.5f)
                close()
                moveTo(6.5f, 6f)
                curveTo(6.083f, 6f, 5.689f, 6.102f, 5.344f, 6.283f)
                lineTo(11.47f, 12.409f)
                curveTo(11.763f, 12.702f, 12.237f, 12.702f, 12.53f, 12.409f)
                lineTo(18.656f, 6.283f)
                curveTo(18.311f, 6.102f, 17.917f, 6f, 17.5f, 6f)
                horizontalLineTo(6.5f)
                close()
                moveTo(4f, 8.5f)
                curveTo(4f, 8.083f, 4.102f, 7.689f, 4.283f, 7.344f)
                lineTo(8.968f, 12.029f)
                lineTo(4.303f, 16.694f)
                curveTo(4.11f, 16.339f, 4f, 15.932f, 4f, 15.5f)
                verticalLineTo(8.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(17.183f, 13.594f)
                curveTo(17.546f, 13.366f, 17.984f, 13.25f, 18.485f, 13.25f)
                curveTo(18.986f, 13.25f, 19.424f, 13.366f, 19.787f, 13.594f)
                curveTo(20.15f, 13.821f, 20.394f, 14.13f, 20.554f, 14.445f)
                curveTo(20.826f, 14.982f, 20.873f, 15.571f, 20.87f, 15.957f)
                curveTo(21.543f, 16.32f, 22f, 17.032f, 22f, 17.85f)
                verticalLineTo(19.85f)
                curveTo(22f, 21.038f, 21.037f, 22f, 19.85f, 22f)
                horizontalLineTo(17.05f)
                curveTo(15.863f, 22f, 14.9f, 21.038f, 14.9f, 19.85f)
                verticalLineTo(17.85f)
                curveTo(14.9f, 17.004f, 15.389f, 16.272f, 16.1f, 15.921f)
                curveTo(16.1f, 15.535f, 16.152f, 14.966f, 16.416f, 14.445f)
                curveTo(16.576f, 14.13f, 16.82f, 13.821f, 17.183f, 13.594f)
                close()
                moveTo(17.754f, 15.123f)
                curveTo(17.676f, 15.276f, 17.634f, 15.463f, 17.614f, 15.65f)
                horizontalLineTo(19.356f)
                curveTo(19.336f, 15.463f, 19.294f, 15.276f, 19.216f, 15.123f)
                curveTo(19.156f, 15.005f, 19.083f, 14.922f, 18.992f, 14.865f)
                curveTo(18.902f, 14.809f, 18.75f, 14.75f, 18.485f, 14.75f)
                curveTo(18.22f, 14.75f, 18.068f, 14.809f, 17.978f, 14.865f)
                curveTo(17.887f, 14.922f, 17.814f, 15.005f, 17.754f, 15.123f)
                close()
                moveTo(17.05f, 17.2f)
                curveTo(16.691f, 17.2f, 16.4f, 17.491f, 16.4f, 17.85f)
                verticalLineTo(19.85f)
                curveTo(16.4f, 20.209f, 16.691f, 20.5f, 17.05f, 20.5f)
                horizontalLineTo(19.85f)
                curveTo(20.209f, 20.5f, 20.5f, 20.209f, 20.5f, 19.85f)
                verticalLineTo(17.85f)
                curveTo(20.5f, 17.491f, 20.209f, 17.2f, 19.85f, 17.2f)
                horizontalLineTo(17.05f)
                close()
            }
        }.build()
        return envelopeLock!!
    }

private var envelopeLock: ImageVector? = null