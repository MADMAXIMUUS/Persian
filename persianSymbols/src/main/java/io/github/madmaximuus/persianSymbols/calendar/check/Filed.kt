package io.github.madmaximuus.persianSymbols.calendar.check

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.CalendarCheck: ImageVector
    get() {
        if (calendarCheck != null) {
            return calendarCheck!!
        }
        calendarCheck = Builder(
            name = "calendar-check-filled",
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
        }.build()
        return calendarCheck!!
    }

private var calendarCheck: ImageVector? = null