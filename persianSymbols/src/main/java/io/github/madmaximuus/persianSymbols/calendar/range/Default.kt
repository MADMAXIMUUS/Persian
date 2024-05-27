package io.github.madmaximuus.persianSymbols.calendar.range

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

val PersianSymbols.Default.CalendarRange: ImageVector
    get() {
        if (calendarRange != null) {
            return calendarRange!!
        }
        calendarRange = Builder(
            name = "calendar-range-default",
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
                moveTo(7.5f, 11.0f)
                curveTo(7.2239f, 11.0f, 7.0f, 11.2239f, 7.0f, 11.5f)
                verticalLineTo(12.5f)
                curveTo(7.0f, 12.7761f, 7.2239f, 13.0f, 7.5f, 13.0f)
                horizontalLineTo(8.5f)
                curveTo(8.7761f, 13.0f, 9.0f, 12.7761f, 9.0f, 12.5f)
                verticalLineTo(11.5f)
                curveTo(9.0f, 11.2239f, 8.7761f, 11.0f, 8.5f, 11.0f)
                horizontalLineTo(7.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(11.0f, 11.5f)
                curveTo(11.0f, 11.2239f, 11.2239f, 11.0f, 11.5f, 11.0f)
                horizontalLineTo(12.5f)
                curveTo(12.7761f, 11.0f, 13.0f, 11.2239f, 13.0f, 11.5f)
                verticalLineTo(12.5f)
                curveTo(13.0f, 12.7761f, 12.7761f, 13.0f, 12.5f, 13.0f)
                horizontalLineTo(11.5f)
                curveTo(11.2239f, 13.0f, 11.0f, 12.7761f, 11.0f, 12.5f)
                verticalLineTo(11.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(15.5f, 11.0f)
                curveTo(15.2239f, 11.0f, 15.0f, 11.2239f, 15.0f, 11.5f)
                verticalLineTo(12.5f)
                curveTo(15.0f, 12.7761f, 15.2239f, 13.0f, 15.5f, 13.0f)
                horizontalLineTo(16.5f)
                curveTo(16.7761f, 13.0f, 17.0f, 12.7761f, 17.0f, 12.5f)
                verticalLineTo(11.5f)
                curveTo(17.0f, 11.2239f, 16.7761f, 11.0f, 16.5f, 11.0f)
                horizontalLineTo(15.5f)
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
        return calendarRange!!
    }

private var calendarRange: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.CalendarRange,
                contentDescription = ""
            )
        }
    }
}