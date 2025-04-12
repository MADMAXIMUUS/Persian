package io.github.madmaximuus.persianSymbols.calendar

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Calendar: ImageVector
    get() {
        if (calendar != null) {
            return calendar!!
        }
        calendar = Builder(
            name = "calendar-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.5f, 11.35f)
                curveTo(6.5f, 11.019f, 6.769f, 10.75f, 7.1f, 10.75f)
                horizontalLineTo(7.9f)
                curveTo(8.231f, 10.75f, 8.5f, 11.019f, 8.5f, 11.35f)
                verticalLineTo(12.15f)
                curveTo(8.5f, 12.481f, 8.231f, 12.75f, 7.9f, 12.75f)
                horizontalLineTo(7.1f)
                curveTo(6.769f, 12.75f, 6.5f, 12.481f, 6.5f, 12.15f)
                verticalLineTo(11.35f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.5f, 14.35f)
                curveTo(6.5f, 14.019f, 6.769f, 13.75f, 7.1f, 13.75f)
                horizontalLineTo(7.9f)
                curveTo(8.231f, 13.75f, 8.5f, 14.019f, 8.5f, 14.35f)
                verticalLineTo(15.15f)
                curveTo(8.5f, 15.481f, 8.231f, 15.75f, 7.9f, 15.75f)
                horizontalLineTo(7.1f)
                curveTo(6.769f, 15.75f, 6.5f, 15.481f, 6.5f, 15.15f)
                verticalLineTo(14.35f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.1f, 16.75f)
                curveTo(6.769f, 16.75f, 6.5f, 17.019f, 6.5f, 17.35f)
                verticalLineTo(18.15f)
                curveTo(6.5f, 18.481f, 6.769f, 18.75f, 7.1f, 18.75f)
                horizontalLineTo(7.9f)
                curveTo(8.231f, 18.75f, 8.5f, 18.481f, 8.5f, 18.15f)
                verticalLineTo(17.35f)
                curveTo(8.5f, 17.019f, 8.231f, 16.75f, 7.9f, 16.75f)
                horizontalLineTo(7.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.5f, 11.35f)
                curveTo(9.5f, 11.019f, 9.769f, 10.75f, 10.1f, 10.75f)
                horizontalLineTo(10.9f)
                curveTo(11.231f, 10.75f, 11.5f, 11.019f, 11.5f, 11.35f)
                verticalLineTo(12.15f)
                curveTo(11.5f, 12.481f, 11.231f, 12.75f, 10.9f, 12.75f)
                horizontalLineTo(10.1f)
                curveTo(9.769f, 12.75f, 9.5f, 12.481f, 9.5f, 12.15f)
                verticalLineTo(11.35f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.1f, 13.75f)
                curveTo(9.769f, 13.75f, 9.5f, 14.019f, 9.5f, 14.35f)
                verticalLineTo(15.15f)
                curveTo(9.5f, 15.481f, 9.769f, 15.75f, 10.1f, 15.75f)
                horizontalLineTo(10.9f)
                curveTo(11.231f, 15.75f, 11.5f, 15.481f, 11.5f, 15.15f)
                verticalLineTo(14.35f)
                curveTo(11.5f, 14.019f, 11.231f, 13.75f, 10.9f, 13.75f)
                horizontalLineTo(10.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.5f, 17.35f)
                curveTo(9.5f, 17.019f, 9.769f, 16.75f, 10.1f, 16.75f)
                horizontalLineTo(10.9f)
                curveTo(11.231f, 16.75f, 11.5f, 17.019f, 11.5f, 17.35f)
                verticalLineTo(18.15f)
                curveTo(11.5f, 18.481f, 11.231f, 18.75f, 10.9f, 18.75f)
                horizontalLineTo(10.1f)
                curveTo(9.769f, 18.75f, 9.5f, 18.481f, 9.5f, 18.15f)
                verticalLineTo(17.35f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.1f, 10.75f)
                curveTo(12.769f, 10.75f, 12.5f, 11.019f, 12.5f, 11.35f)
                verticalLineTo(12.15f)
                curveTo(12.5f, 12.481f, 12.769f, 12.75f, 13.1f, 12.75f)
                horizontalLineTo(13.9f)
                curveTo(14.231f, 12.75f, 14.5f, 12.481f, 14.5f, 12.15f)
                verticalLineTo(11.35f)
                curveTo(14.5f, 11.019f, 14.231f, 10.75f, 13.9f, 10.75f)
                horizontalLineTo(13.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.5f, 14.35f)
                curveTo(12.5f, 14.019f, 12.769f, 13.75f, 13.1f, 13.75f)
                horizontalLineTo(13.9f)
                curveTo(14.231f, 13.75f, 14.5f, 14.019f, 14.5f, 14.35f)
                verticalLineTo(15.15f)
                curveTo(14.5f, 15.481f, 14.231f, 15.75f, 13.9f, 15.75f)
                horizontalLineTo(13.1f)
                curveTo(12.769f, 15.75f, 12.5f, 15.481f, 12.5f, 15.15f)
                verticalLineTo(14.35f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.1f, 16.75f)
                curveTo(12.769f, 16.75f, 12.5f, 17.019f, 12.5f, 17.35f)
                verticalLineTo(18.15f)
                curveTo(12.5f, 18.481f, 12.769f, 18.75f, 13.1f, 18.75f)
                horizontalLineTo(13.9f)
                curveTo(14.231f, 18.75f, 14.5f, 18.481f, 14.5f, 18.15f)
                verticalLineTo(17.35f)
                curveTo(14.5f, 17.019f, 14.231f, 16.75f, 13.9f, 16.75f)
                horizontalLineTo(13.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.5f, 11.35f)
                curveTo(15.5f, 11.019f, 15.769f, 10.75f, 16.1f, 10.75f)
                horizontalLineTo(16.9f)
                curveTo(17.231f, 10.75f, 17.5f, 11.019f, 17.5f, 11.35f)
                verticalLineTo(12.15f)
                curveTo(17.5f, 12.481f, 17.231f, 12.75f, 16.9f, 12.75f)
                horizontalLineTo(16.1f)
                curveTo(15.769f, 12.75f, 15.5f, 12.481f, 15.5f, 12.15f)
                verticalLineTo(11.35f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.1f, 13.75f)
                curveTo(15.769f, 13.75f, 15.5f, 14.019f, 15.5f, 14.35f)
                verticalLineTo(15.15f)
                curveTo(15.5f, 15.481f, 15.769f, 15.75f, 16.1f, 15.75f)
                horizontalLineTo(16.9f)
                curveTo(17.231f, 15.75f, 17.5f, 15.481f, 17.5f, 15.15f)
                verticalLineTo(14.35f)
                curveTo(17.5f, 14.019f, 17.231f, 13.75f, 16.9f, 13.75f)
                horizontalLineTo(16.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.5f, 17.35f)
                curveTo(15.5f, 17.019f, 15.769f, 16.75f, 16.1f, 16.75f)
                horizontalLineTo(16.9f)
                curveTo(17.231f, 16.75f, 17.5f, 17.019f, 17.5f, 17.35f)
                verticalLineTo(18.15f)
                curveTo(17.5f, 18.481f, 17.231f, 18.75f, 16.9f, 18.75f)
                horizontalLineTo(16.1f)
                curveTo(15.769f, 18.75f, 15.5f, 18.481f, 15.5f, 18.15f)
                verticalLineTo(17.35f)
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
        return calendar!!
    }

private var calendar: ImageVector? = null