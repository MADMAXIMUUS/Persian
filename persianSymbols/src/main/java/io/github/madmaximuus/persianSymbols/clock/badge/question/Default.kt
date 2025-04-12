package io.github.madmaximuus.persianSymbols.clock.badge.question

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.ClockBadgeQuestion: ImageVector
    get() {
        if (clockBadgeQuestion != null) {
            return clockBadgeQuestion!!
        }
        clockBadgeQuestion = ImageVector.Builder(
            name = "clock-badge-question-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4f, 12f)
                curveTo(4f, 7.582f, 7.582f, 4f, 12f, 4f)
                curveTo(16.418f, 4f, 20f, 7.582f, 20f, 12f)
                curveTo(20f, 12.29f, 19.985f, 12.576f, 19.955f, 12.857f)
                curveTo(20.646f, 13.12f, 21.271f, 13.519f, 21.796f, 14.02f)
                curveTo(21.93f, 13.368f, 22f, 12.692f, 22f, 12f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
                curveTo(12.692f, 22f, 13.368f, 21.93f, 14.02f, 21.796f)
                curveTo(13.519f, 21.271f, 13.12f, 20.646f, 12.857f, 19.955f)
                curveTo(12.576f, 19.985f, 12.29f, 20f, 12f, 20f)
                curveTo(7.582f, 20f, 4f, 16.418f, 4f, 12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.823f, 11.763f)
                lineTo(14.677f, 13.617f)
                curveTo(14.277f, 13.92f, 13.92f, 14.277f, 13.617f, 14.677f)
                lineTo(11.763f, 12.823f)
                curveTo(11.434f, 12.495f, 11.25f, 12.05f, 11.25f, 11.586f)
                verticalLineTo(8f)
                curveTo(11.25f, 7.586f, 11.586f, 7.25f, 12f, 7.25f)
                curveTo(12.414f, 7.25f, 12.75f, 7.586f, 12.75f, 8f)
                verticalLineTo(11.586f)
                curveTo(12.75f, 11.652f, 12.776f, 11.716f, 12.823f, 11.763f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.012f, 20.5f)
                curveTo(18.288f, 20.5f, 18.512f, 20.276f, 18.512f, 20f)
                curveTo(18.512f, 19.724f, 18.288f, 19.5f, 18.012f, 19.5f)
                curveTo(17.736f, 19.5f, 17.512f, 19.724f, 17.512f, 20f)
                curveTo(17.512f, 20.276f, 17.736f, 20.5f, 18.012f, 20.5f)
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
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 16.25f)
                curveTo(17.574f, 16.25f, 17.25f, 16.584f, 17.25f, 16.97f)
                curveTo(17.25f, 17.246f, 17.026f, 17.47f, 16.75f, 17.47f)
                curveTo(16.474f, 17.47f, 16.25f, 17.246f, 16.25f, 16.97f)
                curveTo(16.25f, 16.008f, 17.045f, 15.25f, 18f, 15.25f)
                curveTo(18.955f, 15.25f, 19.75f, 16.008f, 19.75f, 16.97f)
                curveTo(19.75f, 17.663f, 19.22f, 18.072f, 18.872f, 18.269f)
                curveTo(18.741f, 18.344f, 18.612f, 18.402f, 18.5f, 18.447f)
                verticalLineTo(18.75f)
                curveTo(18.5f, 19.026f, 18.276f, 19.25f, 18f, 19.25f)
                curveTo(17.724f, 19.25f, 17.5f, 19.026f, 17.5f, 18.75f)
                verticalLineTo(18.088f)
                curveTo(17.5f, 17.857f, 17.657f, 17.657f, 17.881f, 17.602f)
                lineTo(18.03f, 17.556f)
                curveTo(18.129f, 17.521f, 18.256f, 17.469f, 18.378f, 17.4f)
                curveTo(18.655f, 17.242f, 18.75f, 17.092f, 18.75f, 16.97f)
                curveTo(18.75f, 16.584f, 18.426f, 16.25f, 18f, 16.25f)
                close()
            }
        }.build()

        return clockBadgeQuestion!!
    }

private var clockBadgeQuestion: ImageVector? = null