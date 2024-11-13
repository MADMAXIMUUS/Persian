package io.github.madmaximuus.persianSymbols.calendar.event

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
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
        }.build()
        return calendarEvent!!
    }

private var calendarEvent: ImageVector? = null