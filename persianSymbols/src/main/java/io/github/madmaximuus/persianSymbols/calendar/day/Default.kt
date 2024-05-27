package io.github.madmaximuus.persianSymbols.calendar.day

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

val PersianSymbols.Default.CalendarDay: ImageVector
    get() {
        if (calendarDay != null) {
            return calendarDay!!
        }
        calendarDay = Builder(
            name = "calendar-day-default",
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
                moveTo(8.0f, 14.0f)
                curveTo(9.1046f, 14.0f, 10.0f, 13.1046f, 10.0f, 12.0f)
                curveTo(10.0f, 10.8954f, 9.1046f, 10.0f, 8.0f, 10.0f)
                curveTo(6.8954f, 10.0f, 6.0f, 10.8954f, 6.0f, 12.0f)
                curveTo(6.0f, 13.1046f, 6.8954f, 14.0f, 8.0f, 14.0f)
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
                moveTo(9.0f, 3.0f)
                curveTo(9.0f, 2.4477f, 8.5523f, 2.0f, 8.0f, 2.0f)
                curveTo(7.4477f, 2.0f, 7.0f, 2.4477f, 7.0f, 3.0f)
                verticalLineTo(3.0275f)
                curveTo(4.75f, 3.2762f, 3.0f, 5.1837f, 3.0f, 7.5f)
                verticalLineTo(16.5f)
                curveTo(3.0f, 18.9853f, 5.0147f, 21.0f, 7.5f, 21.0f)
                horizontalLineTo(16.5f)
                curveTo(18.9853f, 21.0f, 21.0f, 18.9853f, 21.0f, 16.5f)
                verticalLineTo(7.5f)
                curveTo(21.0f, 5.1837f, 19.25f, 3.2762f, 17.0f, 3.0275f)
                verticalLineTo(3.0f)
                curveTo(17.0f, 2.4477f, 16.5523f, 2.0f, 16.0f, 2.0f)
                curveTo(15.4477f, 2.0f, 15.0f, 2.4477f, 15.0f, 3.0f)
                horizontalLineTo(9.0f)
                close()
                moveTo(16.5f, 5.0f)
                curveTo(17.7095f, 5.0f, 18.7184f, 5.8589f, 18.95f, 7.0f)
                horizontalLineTo(5.05f)
                curveTo(5.2816f, 5.8589f, 6.2905f, 5.0f, 7.5f, 5.0f)
                horizontalLineTo(16.5f)
                close()
                moveTo(19.0f, 9.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(16.5f)
                curveTo(5.0f, 17.8807f, 6.1193f, 19.0f, 7.5f, 19.0f)
                horizontalLineTo(16.5f)
                curveTo(17.8807f, 19.0f, 19.0f, 17.8807f, 19.0f, 16.5f)
                verticalLineTo(9.0f)
                close()
            }
        }.build()
        return calendarDay!!
    }

private var calendarDay: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.CalendarDay,
                contentDescription = ""
            )
        }
    }
}