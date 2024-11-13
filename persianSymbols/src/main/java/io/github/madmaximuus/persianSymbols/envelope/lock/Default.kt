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
                moveTo(3.114f, 5.536f)
                curveTo(2.42f, 6.328f, 2f, 7.365f, 2f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(2f, 17.985f, 4.015f, 20f, 6.5f, 20f)
                horizontalLineTo(14.2f)
                verticalLineTo(18f)
                horizontalLineTo(6.5f)
                curveTo(5.119f, 18f, 4f, 16.881f, 4f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(4f, 8.117f, 4.086f, 7.754f, 4.24f, 7.43f)
                lineTo(10.2f, 11.9f)
                curveTo(11.267f, 12.7f, 12.733f, 12.7f, 13.8f, 11.9f)
                lineTo(19.76f, 7.43f)
                curveTo(19.914f, 7.754f, 20f, 8.117f, 20f, 8.5f)
                verticalLineTo(12.804f)
                curveTo(21.173f, 13.36f, 21.521f, 14.575f, 21.6f, 15.538f)
                curveTo(21.74f, 15.623f, 21.87f, 15.723f, 21.988f, 15.836f)
                curveTo(21.996f, 15.725f, 22f, 15.613f, 22f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(22f, 7.365f, 21.58f, 6.328f, 20.886f, 5.536f)
                curveTo(20.861f, 5.489f, 20.833f, 5.444f, 20.8f, 5.4f)
                curveTo(20.708f, 5.277f, 20.592f, 5.181f, 20.464f, 5.114f)
                curveTo(19.672f, 4.42f, 18.635f, 4f, 17.5f, 4f)
                horizontalLineTo(6.5f)
                curveTo(5.365f, 4f, 4.328f, 4.42f, 3.536f, 5.114f)
                curveTo(3.408f, 5.181f, 3.293f, 5.277f, 3.2f, 5.4f)
                curveTo(3.167f, 5.444f, 3.139f, 5.489f, 3.114f, 5.536f)
                close()
                moveTo(18.201f, 6.1f)
                curveTo(17.978f, 6.035f, 17.743f, 6f, 17.5f, 6f)
                horizontalLineTo(6.5f)
                curveTo(6.257f, 6f, 6.022f, 6.035f, 5.799f, 6.1f)
                lineTo(11.4f, 10.3f)
                curveTo(11.756f, 10.567f, 12.244f, 10.567f, 12.6f, 10.3f)
                lineTo(18.201f, 6.1f)
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