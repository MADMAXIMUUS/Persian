package io.github.madmaximuus.persianSymbols.clock.timer

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.ClockTimer: ImageVector
    get() {
        if (clockTimer != null) {
            return clockTimer!!
        }
        clockTimer = Builder(
            name = "clock-timer-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.043f, 5.707f)
                curveTo(21.433f, 6.098f, 22.067f, 6.098f, 22.457f, 5.707f)
                curveTo(22.848f, 5.317f, 22.848f, 4.683f, 22.457f, 4.293f)
                lineTo(19.457f, 1.293f)
                curveTo(19.067f, 0.902f, 18.433f, 0.902f, 18.043f, 1.293f)
                curveTo(17.652f, 1.683f, 17.652f, 2.317f, 18.043f, 2.707f)
                lineTo(21.043f, 5.707f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5.957f, 2.707f)
                lineTo(2.957f, 5.707f)
                curveTo(2.567f, 6.098f, 1.933f, 6.098f, 1.543f, 5.707f)
                curveTo(1.152f, 5.317f, 1.152f, 4.683f, 1.543f, 4.293f)
                lineTo(4.543f, 1.293f)
                curveTo(4.933f, 0.902f, 5.567f, 0.902f, 5.957f, 1.293f)
                curveTo(6.348f, 1.683f, 6.348f, 2.317f, 5.957f, 2.707f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.75f, 8f)
                curveTo(12.75f, 7.586f, 12.414f, 7.25f, 12f, 7.25f)
                curveTo(11.586f, 7.25f, 11.25f, 7.586f, 11.25f, 8f)
                verticalLineTo(12f)
                curveTo(11.25f, 12.414f, 11.586f, 12.75f, 12f, 12.75f)
                curveTo(12.414f, 12.75f, 12.75f, 12.414f, 12.75f, 12f)
                verticalLineTo(8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 12f)
                curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
                curveTo(17.523f, 2f, 22f, 6.477f, 22f, 12f)
                curveTo(22f, 17.523f, 17.523f, 22f, 12f, 22f)
                curveTo(6.477f, 22f, 2f, 17.523f, 2f, 12f)
                close()
                moveTo(12f, 4f)
                curveTo(7.582f, 4f, 4f, 7.582f, 4f, 12f)
                curveTo(4f, 16.418f, 7.582f, 20f, 12f, 20f)
                curveTo(16.418f, 20f, 20f, 16.418f, 20f, 12f)
                curveTo(20f, 7.582f, 16.418f, 4f, 12f, 4f)
                close()
            }
        }.build()
        return clockTimer!!
    }

private var clockTimer: ImageVector? = null