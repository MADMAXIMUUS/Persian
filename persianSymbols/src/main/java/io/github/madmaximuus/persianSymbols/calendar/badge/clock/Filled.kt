package io.github.madmaximuus.persianSymbols.calendar.badge.clock

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.CalendarBadgeClock: ImageVector
    get() {
        if (calendarBadgeClock != null) {
            return calendarBadgeClock!!
        }
        calendarBadgeClock = ImageVector.Builder(
            name = "calendar-badge-clock-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
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
                lineTo(17f, 4.018f)
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
                moveTo(3f, 8.75f)
                horizontalLineTo(21f)
                verticalLineTo(13.389f)
                curveTo(20.137f, 12.827f, 19.107f, 12.5f, 18f, 12.5f)
                curveTo(17.783f, 12.5f, 17.569f, 12.512f, 17.359f, 12.537f)
                curveTo(17.447f, 12.432f, 17.5f, 12.297f, 17.5f, 12.15f)
                verticalLineTo(11.35f)
                curveTo(17.5f, 11.019f, 17.231f, 10.75f, 16.9f, 10.75f)
                horizontalLineTo(16.1f)
                curveTo(15.769f, 10.75f, 15.5f, 11.019f, 15.5f, 11.35f)
                verticalLineTo(12.15f)
                curveTo(15.5f, 12.481f, 15.769f, 12.75f, 16.1f, 12.75f)
                horizontalLineTo(16.355f)
                curveTo(15.59f, 12.99f, 14.896f, 13.392f, 14.315f, 13.917f)
                curveTo(14.207f, 13.813f, 14.061f, 13.75f, 13.9f, 13.75f)
                horizontalLineTo(13.1f)
                curveTo(12.769f, 13.75f, 12.5f, 14.019f, 12.5f, 14.35f)
                verticalLineTo(15.15f)
                curveTo(12.5f, 15.442f, 12.708f, 15.685f, 12.985f, 15.739f)
                curveTo(12.799f, 16.15f, 12.662f, 16.589f, 12.582f, 17.046f)
                curveTo(12.53f, 17.135f, 12.5f, 17.239f, 12.5f, 17.35f)
                verticalLineTo(18.15f)
                curveTo(12.5f, 18.175f, 12.502f, 18.199f, 12.505f, 18.224f)
                curveTo(12.564f, 19.71f, 13.214f, 21.045f, 14.225f, 22f)
                horizontalLineTo(7.4f)
                curveTo(4.97f, 22f, 3f, 20.03f, 3f, 17.6f)
                verticalLineTo(8.75f)
                close()
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
                moveTo(18f, 15.75f)
                curveTo(18.414f, 15.75f, 18.75f, 16.086f, 18.75f, 16.5f)
                verticalLineTo(17.689f)
                lineTo(19.53f, 18.47f)
                curveTo(19.823f, 18.763f, 19.823f, 19.237f, 19.53f, 19.53f)
                curveTo(19.237f, 19.823f, 18.763f, 19.823f, 18.47f, 19.53f)
                lineTo(17.47f, 18.53f)
                curveTo(17.329f, 18.39f, 17.25f, 18.199f, 17.25f, 18f)
                verticalLineTo(16.5f)
                curveTo(17.25f, 16.086f, 17.586f, 15.75f, 18f, 15.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.25f, 18f)
                curveTo(13.25f, 15.377f, 15.377f, 13.25f, 18f, 13.25f)
                curveTo(20.623f, 13.25f, 22.75f, 15.377f, 22.75f, 18f)
                curveTo(22.75f, 20.623f, 20.623f, 22.75f, 18f, 22.75f)
                curveTo(15.377f, 22.75f, 13.25f, 20.623f, 13.25f, 18f)
                close()
                moveTo(18f, 14.75f)
                curveTo(16.205f, 14.75f, 14.75f, 16.205f, 14.75f, 18f)
                curveTo(14.75f, 19.795f, 16.205f, 21.25f, 18f, 21.25f)
                curveTo(19.795f, 21.25f, 21.25f, 19.795f, 21.25f, 18f)
                curveTo(21.25f, 16.205f, 19.795f, 14.75f, 18f, 14.75f)
                close()
            }
        }.build()

        return calendarBadgeClock!!
    }

private var calendarBadgeClock: ImageVector? = null
