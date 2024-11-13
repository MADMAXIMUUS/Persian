package io.github.madmaximuus.persianSymbols.clock.alarm

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.ClockAlarm: ImageVector
    get() {
        if (clockAlarm != null) {
            return clockAlarm!!
        }
        clockAlarm = Builder(
            name = "clock-alarm-filled",
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
                moveTo(19.743f, 18.329f)
                curveTo(21.154f, 16.605f, 22f, 14.401f, 22f, 12f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 14.401f, 2.846f, 16.605f, 4.257f, 18.329f)
                lineTo(2.293f, 20.293f)
                curveTo(1.902f, 20.683f, 1.902f, 21.317f, 2.293f, 21.707f)
                curveTo(2.683f, 22.098f, 3.317f, 22.098f, 3.707f, 21.707f)
                lineTo(5.671f, 19.743f)
                curveTo(7.395f, 21.154f, 9.599f, 22f, 12f, 22f)
                curveTo(14.401f, 22f, 16.605f, 21.154f, 18.329f, 19.743f)
                lineTo(20.293f, 21.707f)
                curveTo(20.683f, 22.098f, 21.317f, 22.098f, 21.707f, 21.707f)
                curveTo(22.098f, 21.317f, 22.098f, 20.683f, 21.707f, 20.293f)
                lineTo(19.743f, 18.329f)
                close()
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
        }.build()
        return clockAlarm!!
    }

private var clockAlarm: ImageVector? = null