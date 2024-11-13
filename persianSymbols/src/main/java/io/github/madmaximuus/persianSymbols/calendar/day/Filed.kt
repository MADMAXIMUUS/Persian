package io.github.madmaximuus.persianSymbols.calendar.day

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.CalendarDay: ImageVector
    get() {
        if (calendarDay != null) {
            return calendarDay!!
        }
        calendarDay = Builder(
            name = "calendar-day-filed",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8f, 2f)
                curveTo(8.552f, 2f, 9f, 2.448f, 9f, 3f)
                verticalLineTo(4f)
                horizontalLineTo(15f)
                verticalLineTo(3f)
                curveTo(15f, 2.448f, 15.448f, 2f, 16f, 2f)
                curveTo(16.552f, 2f, 17f, 2.448f, 17f, 3f)
                verticalLineTo(4f)
                curveTo(17f, 4.006f, 17f, 4.012f, 17f, 4.018f)
                curveTo(18.854f, 4.185f, 20.376f, 5.502f, 20.848f, 7.25f)
                horizontalLineTo(3.152f)
                curveTo(3.624f, 5.502f, 5.146f, 4.185f, 7f, 4.018f)
                lineTo(7f, 4f)
                verticalLineTo(3f)
                curveTo(7f, 2.448f, 7.448f, 2f, 8f, 2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(21f, 8.75f)
                verticalLineTo(17.6f)
                curveTo(21f, 20.03f, 19.03f, 22f, 16.6f, 22f)
                horizontalLineTo(7.4f)
                curveTo(4.97f, 22f, 3f, 20.03f, 3f, 17.6f)
                verticalLineTo(8.75f)
                horizontalLineTo(21f)
                close()
                moveTo(7.25f, 11.498f)
                curveTo(6.974f, 11.498f, 6.75f, 11.722f, 6.75f, 11.998f)
                verticalLineTo(13.498f)
                curveTo(6.75f, 13.774f, 6.974f, 13.998f, 7.25f, 13.998f)
                horizontalLineTo(8.75f)
                curveTo(9.026f, 13.998f, 9.25f, 13.774f, 9.25f, 13.498f)
                verticalLineTo(11.998f)
                curveTo(9.25f, 11.722f, 9.026f, 11.498f, 8.75f, 11.498f)
                horizontalLineTo(7.25f)
                close()
            }
        }.build()
        return calendarDay!!
    }

private var calendarDay: ImageVector? = null