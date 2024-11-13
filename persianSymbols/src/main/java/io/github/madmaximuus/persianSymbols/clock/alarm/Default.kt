package io.github.madmaximuus.persianSymbols.clock.alarm

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.ClockAlarm: ImageVector
    get() {
        if (clockAlarm != null) {
            return clockAlarm!!
        }
        clockAlarm = Builder(
            name = "clock-alarm-default",
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
                verticalLineTo(11.586f)
                curveTo(11.25f, 12.05f, 11.434f, 12.495f, 11.763f, 12.823f)
                lineTo(15.47f, 16.53f)
                curveTo(15.763f, 16.823f, 16.237f, 16.823f, 16.53f, 16.53f)
                curveTo(16.823f, 16.237f, 16.823f, 15.763f, 16.53f, 15.47f)
                lineTo(12.823f, 11.763f)
                curveTo(12.776f, 11.716f, 12.75f, 11.652f, 12.75f, 11.586f)
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
                curveTo(22f, 14.401f, 21.154f, 16.605f, 19.743f, 18.329f)
                lineTo(21.707f, 20.293f)
                curveTo(22.098f, 20.683f, 22.098f, 21.317f, 21.707f, 21.707f)
                curveTo(21.317f, 22.098f, 20.683f, 22.098f, 20.293f, 21.707f)
                lineTo(18.329f, 19.743f)
                curveTo(16.605f, 21.154f, 14.401f, 22f, 12f, 22f)
                curveTo(9.599f, 22f, 7.395f, 21.154f, 5.671f, 19.743f)
                lineTo(3.707f, 21.707f)
                curveTo(3.317f, 22.098f, 2.683f, 22.098f, 2.293f, 21.707f)
                curveTo(1.902f, 21.317f, 1.902f, 20.683f, 2.293f, 20.293f)
                lineTo(4.257f, 18.329f)
                curveTo(2.846f, 16.605f, 2f, 14.401f, 2f, 12f)
                close()
                moveTo(12f, 4f)
                curveTo(7.582f, 4f, 4f, 7.582f, 4f, 12f)
                curveTo(4f, 16.418f, 7.582f, 20f, 12f, 20f)
                curveTo(16.418f, 20f, 20f, 16.418f, 20f, 12f)
                curveTo(20f, 7.582f, 16.418f, 4f, 12f, 4f)
                close()
            }
        }.build()
        return clockAlarm!!
    }

private var clockAlarm: ImageVector? = null