package io.github.madmaximuus.persianSymbols.calendar.event

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.CalendarEvent: ImageVector
    get() {
        if (calendarEvent != null) {
            return calendarEvent!!
        }
        calendarEvent = Builder(
            name = "calendar-event-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.0f, 2.0f)
                curveTo(8.5523f, 2.0f, 9.0f, 2.4477f, 9.0f, 3.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(3.0f)
                curveTo(15.0f, 2.4477f, 15.4477f, 2.0f, 16.0f, 2.0f)
                curveTo(16.5523f, 2.0f, 17.0f, 2.4477f, 17.0f, 3.0f)
                verticalLineTo(4.0f)
                curveTo(17.0f, 4.006f, 16.9999f, 4.012f, 16.9998f, 4.0179f)
                curveTo(18.7643f, 4.1769f, 20.2284f, 5.3774f, 20.7726f, 7.0f)
                horizontalLineTo(3.2274f)
                curveTo(3.7716f, 5.3774f, 5.2357f, 4.1769f, 7.0002f, 4.0179f)
                lineTo(7.0f, 4.0f)
                verticalLineTo(3.0f)
                curveTo(7.0f, 2.4477f, 7.4477f, 2.0f, 8.0f, 2.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(21.0f, 9.0f)
                verticalLineTo(17.6f)
                curveTo(21.0f, 20.0301f, 19.0301f, 22.0f, 16.6f, 22.0f)
                horizontalLineTo(7.4f)
                curveTo(4.97f, 22.0f, 3.0f, 20.0301f, 3.0f, 17.6f)
                verticalLineTo(9.0f)
                horizontalLineTo(21.0f)
                close()
                moveTo(16.0f, 18.0f)
                curveTo(17.1046f, 18.0f, 18.0f, 17.1046f, 18.0f, 16.0f)
                curveTo(18.0f, 14.8954f, 17.1046f, 14.0f, 16.0f, 14.0f)
                curveTo(14.8954f, 14.0f, 14.0f, 14.8954f, 14.0f, 16.0f)
                curveTo(14.0f, 17.1046f, 14.8954f, 18.0f, 16.0f, 18.0f)
                close()
            }
        }.build()
        return calendarEvent!!
    }

private var calendarEvent: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.CalendarEvent,
                contentDescription = ""
            )
        }
    }
}