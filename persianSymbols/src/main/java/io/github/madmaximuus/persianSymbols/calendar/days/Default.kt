package io.github.madmaximuus.persianSymbols.calendar.days

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.CalendarDays: ImageVector
    get() {
        if (calendarDays != null) {
            return calendarDays!!
        }
        calendarDays = Builder(
            name = "calendar-days-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.75f, 11.998f)
                curveTo(6.75f, 11.722f, 6.974f, 11.498f, 7.25f, 11.498f)
                horizontalLineTo(8.75f)
                curveTo(9.026f, 11.498f, 9.25f, 11.722f, 9.25f, 11.998f)
                verticalLineTo(13.498f)
                curveTo(9.25f, 13.774f, 9.026f, 13.998f, 8.75f, 13.998f)
                horizontalLineTo(7.25f)
                curveTo(6.974f, 13.998f, 6.75f, 13.774f, 6.75f, 13.498f)
                verticalLineTo(11.998f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.25f, 11.498f)
                curveTo(10.974f, 11.498f, 10.75f, 11.722f, 10.75f, 11.998f)
                verticalLineTo(13.498f)
                curveTo(10.75f, 13.774f, 10.974f, 13.998f, 11.25f, 13.998f)
                horizontalLineTo(12.75f)
                curveTo(13.026f, 13.998f, 13.25f, 13.774f, 13.25f, 13.498f)
                verticalLineTo(11.998f)
                curveTo(13.25f, 11.722f, 13.026f, 11.498f, 12.75f, 11.498f)
                horizontalLineTo(11.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.75f, 11.998f)
                curveTo(14.75f, 11.722f, 14.974f, 11.498f, 15.25f, 11.498f)
                horizontalLineTo(16.75f)
                curveTo(17.026f, 11.498f, 17.25f, 11.722f, 17.25f, 11.998f)
                verticalLineTo(13.498f)
                curveTo(17.25f, 13.774f, 17.026f, 13.998f, 16.75f, 13.998f)
                horizontalLineTo(15.25f)
                curveTo(14.974f, 13.998f, 14.75f, 13.774f, 14.75f, 13.498f)
                verticalLineTo(11.998f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.25f, 15.498f)
                curveTo(6.974f, 15.498f, 6.75f, 15.722f, 6.75f, 15.998f)
                verticalLineTo(17.498f)
                curveTo(6.75f, 17.774f, 6.974f, 17.998f, 7.25f, 17.998f)
                horizontalLineTo(8.75f)
                curveTo(9.026f, 17.998f, 9.25f, 17.774f, 9.25f, 17.498f)
                verticalLineTo(15.998f)
                curveTo(9.25f, 15.722f, 9.026f, 15.498f, 8.75f, 15.498f)
                horizontalLineTo(7.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.75f, 15.998f)
                curveTo(10.75f, 15.722f, 10.974f, 15.498f, 11.25f, 15.498f)
                horizontalLineTo(12.75f)
                curveTo(13.026f, 15.498f, 13.25f, 15.722f, 13.25f, 15.998f)
                verticalLineTo(17.498f)
                curveTo(13.25f, 17.774f, 13.026f, 17.998f, 12.75f, 17.998f)
                horizontalLineTo(11.25f)
                curveTo(10.974f, 17.998f, 10.75f, 17.774f, 10.75f, 17.498f)
                verticalLineTo(15.998f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.25f, 15.498f)
                curveTo(14.974f, 15.498f, 14.75f, 15.722f, 14.75f, 15.998f)
                verticalLineTo(17.498f)
                curveTo(14.75f, 17.774f, 14.974f, 17.998f, 15.25f, 17.998f)
                horizontalLineTo(16.75f)
                curveTo(17.026f, 17.998f, 17.25f, 17.774f, 17.25f, 17.498f)
                verticalLineTo(15.998f)
                curveTo(17.25f, 15.722f, 17.026f, 15.498f, 16.75f, 15.498f)
                horizontalLineTo(15.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 2f)
                curveTo(8.552f, 2f, 9f, 2.448f, 9f, 3f)
                verticalLineTo(4f)
                horizontalLineTo(15f)
                verticalLineTo(3f)
                curveTo(15f, 2.448f, 15.448f, 2f, 16f, 2f)
                curveTo(16.552f, 2f, 17f, 2.448f, 17f, 3f)
                verticalLineTo(4f)
                curveTo(17f, 4.009f, 17f, 4.018f, 17f, 4.027f)
                curveTo(19.25f, 4.276f, 21f, 6.184f, 21f, 8.5f)
                verticalLineTo(17.5f)
                curveTo(21f, 19.985f, 18.985f, 22f, 16.5f, 22f)
                horizontalLineTo(7.5f)
                curveTo(5.015f, 22f, 3f, 19.985f, 3f, 17.5f)
                verticalLineTo(8.5f)
                curveTo(3f, 6.184f, 4.75f, 4.276f, 7f, 4.027f)
                curveTo(7f, 4.018f, 7f, 4.009f, 7f, 4f)
                verticalLineTo(3f)
                curveTo(7f, 2.448f, 7.448f, 2f, 8f, 2f)
                close()
                moveTo(5.012f, 8.25f)
                curveTo(5.138f, 6.987f, 6.204f, 6f, 7.5f, 6f)
                horizontalLineTo(16.5f)
                curveTo(17.796f, 6f, 18.862f, 6.987f, 18.988f, 8.25f)
                horizontalLineTo(5.012f)
                close()
                moveTo(5f, 9.75f)
                verticalLineTo(17.5f)
                curveTo(5f, 18.881f, 6.119f, 20f, 7.5f, 20f)
                horizontalLineTo(16.5f)
                curveTo(17.881f, 20f, 19f, 18.881f, 19f, 17.5f)
                verticalLineTo(9.75f)
                horizontalLineTo(5f)
                close()
            }
        }.build()
        return calendarDays!!
    }

private var calendarDays: ImageVector? = null