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
                moveTo(2f, 8.4f)
                curveTo(2f, 7.456f, 2.297f, 6.581f, 2.804f, 5.864f)
                lineTo(8.968f, 12.029f)
                lineTo(2.827f, 18.169f)
                curveTo(2.307f, 17.446f, 2f, 16.559f, 2f, 15.6f)
                verticalLineTo(8.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.898f, 19.22f)
                curveTo(4.608f, 19.712f, 5.471f, 20f, 6.4f, 20f)
                horizontalLineTo(14.2f)
                verticalLineTo(17.5f)
                curveTo(14.2f, 16.639f, 14.673f, 15.889f, 15.373f, 15.494f)
                curveTo(15.398f, 15.222f, 15.444f, 14.932f, 15.524f, 14.642f)
                lineTo(13.971f, 13.089f)
                lineTo(13.591f, 13.47f)
                curveTo(12.712f, 14.348f, 11.288f, 14.348f, 10.409f, 13.47f)
                lineTo(10.029f, 13.089f)
                lineTo(3.898f, 19.22f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 15.6f)
                curveTo(22f, 15.681f, 21.998f, 15.762f, 21.993f, 15.841f)
                curveTo(21.874f, 15.727f, 21.742f, 15.625f, 21.6f, 15.538f)
                curveTo(21.494f, 14.245f, 20.904f, 12.5f, 18.485f, 12.5f)
                curveTo(17.454f, 12.5f, 16.755f, 12.817f, 16.284f, 13.281f)
                lineTo(15.032f, 12.029f)
                lineTo(21.196f, 5.864f)
                curveTo(21.703f, 6.581f, 22f, 7.456f, 22f, 8.4f)
                verticalLineTo(15.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.864f, 4.804f)
                curveTo(4.581f, 4.297f, 5.456f, 4f, 6.4f, 4f)
                horizontalLineTo(17.6f)
                curveTo(18.544f, 4f, 19.419f, 4.297f, 20.136f, 4.804f)
                lineTo(12.53f, 12.409f)
                curveTo(12.237f, 12.702f, 11.762f, 12.702f, 11.47f, 12.409f)
                lineTo(3.864f, 4.804f)
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