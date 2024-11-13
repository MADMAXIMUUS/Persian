package io.github.madmaximuus.persianSymbols.calendar.check

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.CalendarCheck: ImageVector
    get() {
        if (calendarCheck != null) {
            return calendarCheck!!
        }
        calendarCheck = Builder(
            name = "calendar-check-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.027f, 11.467f)
                curveTo(17.322f, 11.759f, 17.322f, 12.232f, 17.027f, 12.523f)
                lineTo(11.111f, 18.386f)
                curveTo(10.95f, 18.546f, 10.733f, 18.618f, 10.521f, 18.603f)
                curveTo(10.31f, 18.619f, 10.092f, 18.547f, 9.93f, 18.386f)
                lineTo(6.972f, 15.455f)
                curveTo(6.678f, 15.163f, 6.678f, 14.691f, 6.972f, 14.399f)
                curveTo(7.266f, 14.107f, 7.743f, 14.107f, 8.037f, 14.399f)
                lineTo(10.521f, 16.86f)
                lineTo(15.962f, 11.467f)
                curveTo(16.256f, 11.176f, 16.733f, 11.176f, 17.027f, 11.467f)
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
        return calendarCheck!!
    }

private var calendarCheck: ImageVector? = null