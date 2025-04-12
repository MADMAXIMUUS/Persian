package io.github.madmaximuus.persianSymbols.clock.badge.check

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.ClockBadgeCheck: ImageVector
    get() {
        if (clockBadgeCheck != null) {
            return clockBadgeCheck!!
        }
        clockBadgeCheck = ImageVector.Builder(
            name = "clock-badge-check-default",
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
                moveTo(19.969f, 16.414f)
                curveTo(20.292f, 16.673f, 20.344f, 17.145f, 20.086f, 17.469f)
                lineTo(18.086f, 19.969f)
                curveTo(17.952f, 20.135f, 17.754f, 20.237f, 17.542f, 20.249f)
                curveTo(17.329f, 20.261f, 17.121f, 20.181f, 16.97f, 20.03f)
                lineTo(15.97f, 19.03f)
                curveTo(15.677f, 18.737f, 15.677f, 18.263f, 15.97f, 17.97f)
                curveTo(16.263f, 17.677f, 16.737f, 17.677f, 17.03f, 17.97f)
                lineTo(17.438f, 18.377f)
                lineTo(18.914f, 16.531f)
                curveTo(19.173f, 16.208f, 19.645f, 16.156f, 19.969f, 16.414f)
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

        return clockBadgeCheck!!
    }

private var clockBadgeCheck: ImageVector? = null