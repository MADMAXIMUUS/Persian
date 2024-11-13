package io.github.madmaximuus.persianSymbols.envelope.lock

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.EnvelopeLock: ImageVector
    get() {
        if (envelopeLock != null) {
            return envelopeLock!!
        }
        envelopeLock = Builder(
            name = "envelope-lock-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(2.325f, 6.738f)
                curveTo(2.115f, 7.251f, 2f, 7.812f, 2f, 8.4f)
                verticalLineTo(15.6f)
                curveTo(2f, 18.03f, 3.97f, 20f, 6.4f, 20f)
                horizontalLineTo(14.2f)
                verticalLineTo(17.5f)
                curveTo(14.2f, 16.639f, 14.673f, 15.889f, 15.373f, 15.494f)
                curveTo(15.489f, 14.207f, 16.093f, 12.5f, 18.485f, 12.5f)
                curveTo(20.904f, 12.5f, 21.494f, 14.245f, 21.6f, 15.538f)
                curveTo(21.742f, 15.625f, 21.874f, 15.727f, 21.993f, 15.841f)
                curveTo(21.998f, 15.762f, 22f, 15.681f, 22f, 15.6f)
                verticalLineTo(8.4f)
                curveTo(22f, 7.812f, 21.885f, 7.251f, 21.675f, 6.738f)
                curveTo(21.638f, 6.772f, 21.598f, 6.803f, 21.555f, 6.832f)
                lineTo(13.664f, 12.092f)
                curveTo(12.656f, 12.764f, 11.344f, 12.764f, 10.336f, 12.092f)
                lineTo(2.445f, 6.832f)
                curveTo(2.402f, 6.803f, 2.362f, 6.772f, 2.325f, 6.738f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.47f, 5.117f)
                curveTo(3.499f, 5.133f, 3.527f, 5.15f, 3.555f, 5.168f)
                lineTo(11.445f, 10.428f)
                curveTo(11.781f, 10.652f, 12.219f, 10.652f, 12.555f, 10.428f)
                lineTo(20.445f, 5.168f)
                curveTo(20.473f, 5.15f, 20.501f, 5.133f, 20.53f, 5.117f)
                curveTo(19.752f, 4.422f, 18.725f, 4f, 17.6f, 4f)
                horizontalLineTo(6.4f)
                curveTo(5.275f, 4f, 4.248f, 4.422f, 3.47f, 5.117f)
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