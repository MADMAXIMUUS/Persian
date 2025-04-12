package io.github.madmaximuus.persianSymbols.clock.badge.exclamation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.ClockBadgeExclamation: ImageVector
    get() {
        if (clockBadgeExclamation != null) {
            return clockBadgeExclamation!!
        }
        clockBadgeExclamation = ImageVector.Builder(
            name = "clock-badge-exclamation",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22f)
                curveTo(12.692f, 22f, 13.368f, 21.93f, 14.02f, 21.796f)
                curveTo(13.078f, 20.809f, 12.5f, 19.472f, 12.5f, 18f)
                curveTo(12.5f, 16.752f, 12.916f, 15.6f, 13.617f, 14.677f)
                lineTo(11.763f, 12.823f)
                curveTo(11.434f, 12.495f, 11.25f, 12.05f, 11.25f, 11.586f)
                verticalLineTo(8f)
                curveTo(11.25f, 7.586f, 11.586f, 7.25f, 12f, 7.25f)
                curveTo(12.414f, 7.25f, 12.75f, 7.586f, 12.75f, 8f)
                verticalLineTo(11.586f)
                curveTo(12.75f, 11.652f, 12.776f, 11.716f, 12.823f, 11.763f)
                lineTo(14.677f, 13.617f)
                curveTo(15.6f, 12.916f, 16.752f, 12.5f, 18f, 12.5f)
                curveTo(19.472f, 12.5f, 20.809f, 13.078f, 21.796f, 14.02f)
                curveTo(21.93f, 13.368f, 22f, 12.692f, 22f, 12f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.75f, 16.25f)
                curveTo(18.75f, 15.836f, 18.414f, 15.5f, 18f, 15.5f)
                curveTo(17.586f, 15.5f, 17.25f, 15.836f, 17.25f, 16.25f)
                verticalLineTo(17.75f)
                curveTo(17.25f, 18.164f, 17.586f, 18.5f, 18f, 18.5f)
                curveTo(18.414f, 18.5f, 18.75f, 18.164f, 18.75f, 17.75f)
                verticalLineTo(16.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 20.5f)
                curveTo(18.414f, 20.5f, 18.75f, 20.164f, 18.75f, 19.75f)
                curveTo(18.75f, 19.336f, 18.414f, 19f, 18f, 19f)
                curveTo(17.586f, 19f, 17.25f, 19.336f, 17.25f, 19.75f)
                curveTo(17.25f, 20.164f, 17.586f, 20.5f, 18f, 20.5f)
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

        return clockBadgeExclamation!!
    }

private var clockBadgeExclamation: ImageVector? = null