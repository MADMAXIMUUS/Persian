package io.github.madmaximuus.persianSymbols.clock.timer

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.ClockTimer: ImageVector
    get() {
        if (clockTimer != null) {
            return clockTimer!!
        }
        clockTimer = Builder(
            name = "clock-timer-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.293f, 5.707f)
                lineTo(18.293f, 2.707f)
                curveTo(17.902f, 2.317f, 17.902f, 1.683f, 18.293f, 1.293f)
                curveTo(18.683f, 0.902f, 19.317f, 0.902f, 19.707f, 1.293f)
                lineTo(22.707f, 4.293f)
                curveTo(23.098f, 4.683f, 23.098f, 5.317f, 22.707f, 5.707f)
                curveTo(22.317f, 6.098f, 21.683f, 6.098f, 21.293f, 5.707f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(2.707f, 5.707f)
                lineTo(5.707f, 2.707f)
                curveTo(6.098f, 2.317f, 6.098f, 1.683f, 5.707f, 1.293f)
                curveTo(5.317f, 0.902f, 4.683f, 0.902f, 4.293f, 1.293f)
                lineTo(1.293f, 4.293f)
                curveTo(0.902f, 4.683f, 0.902f, 5.317f, 1.293f, 5.707f)
                curveTo(1.683f, 6.098f, 2.317f, 6.098f, 2.707f, 5.707f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 22f)
                curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
                close()
                moveTo(12.75f, 8f)
                curveTo(12.75f, 7.586f, 12.414f, 7.25f, 12f, 7.25f)
                curveTo(11.586f, 7.25f, 11.25f, 7.586f, 11.25f, 8f)
                verticalLineTo(12f)
                curveTo(11.25f, 12.414f, 11.586f, 12.75f, 12f, 12.75f)
                curveTo(12.414f, 12.75f, 12.75f, 12.414f, 12.75f, 12f)
                verticalLineTo(8f)
                close()
            }
        }.build()
        return clockTimer!!
    }

private var clockTimer: ImageVector? = null