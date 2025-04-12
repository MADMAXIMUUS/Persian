package io.github.madmaximuus.persianSymbols.clock.badge.cross

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.ClockBadgeCross: ImageVector
    get() {
        if (clockBadgeCross != null) {
            return clockBadgeCross!!
        }
        clockBadgeCross = ImageVector.Builder(
            name = "clock-badge-cross-default",
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
                moveTo(17.47f, 16.409f)
                curveTo(17.177f, 16.116f, 16.702f, 16.116f, 16.409f, 16.409f)
                curveTo(16.116f, 16.702f, 16.116f, 17.177f, 16.409f, 17.47f)
                lineTo(16.939f, 18f)
                lineTo(16.409f, 18.531f)
                curveTo(16.116f, 18.823f, 16.116f, 19.298f, 16.409f, 19.591f)
                curveTo(16.702f, 19.884f, 17.177f, 19.884f, 17.47f, 19.591f)
                lineTo(18f, 19.061f)
                lineTo(18.53f, 19.591f)
                curveTo(18.823f, 19.884f, 19.298f, 19.884f, 19.591f, 19.591f)
                curveTo(19.884f, 19.298f, 19.884f, 18.823f, 19.591f, 18.53f)
                lineTo(19.061f, 18f)
                lineTo(19.591f, 17.47f)
                curveTo(19.884f, 17.177f, 19.884f, 16.702f, 19.591f, 16.409f)
                curveTo(19.298f, 16.116f, 18.823f, 16.116f, 18.53f, 16.409f)
                lineTo(18f, 16.94f)
                lineTo(17.47f, 16.409f)
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

        return clockBadgeCross!!
    }

private var clockBadgeCross: ImageVector? = null