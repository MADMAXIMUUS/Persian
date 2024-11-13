package io.github.madmaximuus.persianSymbols.calendar.event

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.CalendarEvent: ImageVector
    get() {
        if (calendarEvent != null) {
            return calendarEvent!!
        }
        calendarEvent = Builder(
            name = "calendar-event-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
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
                moveTo(9f, 3f)
                curveTo(9f, 2.448f, 8.552f, 2f, 8f, 2f)
                curveTo(7.448f, 2f, 7f, 2.448f, 7f, 3f)
                verticalLineTo(4f)
                curveTo(7f, 4.009f, 7f, 4.018f, 7f, 4.027f)
                curveTo(4.75f, 4.276f, 3f, 6.184f, 3f, 8.5f)
                verticalLineTo(17.5f)
                curveTo(3f, 19.985f, 5.015f, 22f, 7.5f, 22f)
                horizontalLineTo(16.5f)
                curveTo(18.985f, 22f, 21f, 19.985f, 21f, 17.5f)
                verticalLineTo(8.5f)
                curveTo(21f, 6.184f, 19.25f, 4.276f, 17f, 4.027f)
                curveTo(17f, 4.018f, 17f, 4.009f, 17f, 4f)
                verticalLineTo(3f)
                curveTo(17f, 2.448f, 16.552f, 2f, 16f, 2f)
                curveTo(15.448f, 2f, 15f, 2.448f, 15f, 3f)
                verticalLineTo(4f)
                horizontalLineTo(9f)
                verticalLineTo(3f)
                close()
                moveTo(7.5f, 6f)
                curveTo(6.204f, 6f, 5.138f, 6.987f, 5.012f, 8.25f)
                horizontalLineTo(18.988f)
                curveTo(18.862f, 6.987f, 17.796f, 6f, 16.5f, 6f)
                horizontalLineTo(7.5f)
                close()
                moveTo(5f, 17.5f)
                verticalLineTo(9.75f)
                horizontalLineTo(19f)
                verticalLineTo(17.5f)
                curveTo(19f, 18.881f, 17.881f, 20f, 16.5f, 20f)
                horizontalLineTo(7.5f)
                curveTo(6.119f, 20f, 5f, 18.881f, 5f, 17.5f)
                close()
            }
        }.build()
        return calendarEvent!!
    }

private var calendarEvent: ImageVector? = null