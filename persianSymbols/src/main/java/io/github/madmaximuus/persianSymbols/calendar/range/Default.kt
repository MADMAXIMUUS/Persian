package io.github.madmaximuus.persianSymbols.calendar.range

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
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
                moveTo(7.25f, 11.5f)
                curveTo(6.974f, 11.5f, 6.75f, 11.724f, 6.75f, 12f)
                verticalLineTo(13.5f)
                curveTo(6.75f, 13.776f, 6.974f, 14f, 7.25f, 14f)
                horizontalLineTo(8.75f)
                curveTo(9.026f, 14f, 9.25f, 13.776f, 9.25f, 13.5f)
                verticalLineTo(12f)
                curveTo(9.25f, 11.724f, 9.026f, 11.5f, 8.75f, 11.5f)
                horizontalLineTo(7.25f)
                close()
                moveTo(10.75f, 12f)
                curveTo(10.75f, 11.724f, 10.974f, 11.5f, 11.25f, 11.5f)
                horizontalLineTo(12.75f)
                curveTo(13.026f, 11.5f, 13.25f, 11.724f, 13.25f, 12f)
                verticalLineTo(13.5f)
                curveTo(13.25f, 13.776f, 13.026f, 14f, 12.75f, 14f)
                horizontalLineTo(11.25f)
                curveTo(10.974f, 14f, 10.75f, 13.776f, 10.75f, 13.5f)
                verticalLineTo(12f)
                close()
                moveTo(15.25f, 11.5f)
                curveTo(14.974f, 11.5f, 14.75f, 11.724f, 14.75f, 12f)
                verticalLineTo(13.5f)
                curveTo(14.75f, 13.776f, 14.974f, 14f, 15.25f, 14f)
                horizontalLineTo(16.75f)
                curveTo(17.026f, 14f, 17.25f, 13.776f, 17.25f, 13.5f)
                verticalLineTo(12f)
                curveTo(17.25f, 11.724f, 17.026f, 11.5f, 16.75f, 11.5f)
                horizontalLineTo(15.25f)
                close()
            }
        }.build()
        return calendarRange!!
    }

private var calendarRange: ImageVector? = null