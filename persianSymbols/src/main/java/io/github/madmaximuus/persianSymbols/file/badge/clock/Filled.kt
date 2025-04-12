package io.github.madmaximuus.persianSymbols.file.badge.clock

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.FileBadgeClock: ImageVector
    get() {
        if (fileBadgeClock != null) {
            return fileBadgeClock!!
        }
        fileBadgeClock = ImageVector.Builder(
            name = "file-badge-clock-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 2f)
                horizontalLineTo(7.5f)
                curveTo(5.567f, 2f, 4f, 3.567f, 4f, 5.5f)
                verticalLineTo(18.5f)
                curveTo(4f, 20.433f, 5.567f, 22f, 7.5f, 22f)
                horizontalLineTo(14.225f)
                curveTo(13.163f, 20.997f, 12.5f, 19.576f, 12.5f, 18f)
                curveTo(12.5f, 14.962f, 14.962f, 12.5f, 18f, 12.5f)
                curveTo(18.706f, 12.5f, 19.38f, 12.633f, 20f, 12.875f)
                verticalLineTo(9.75f)
                horizontalLineTo(14.75f)
                curveTo(13.231f, 9.75f, 12f, 8.519f, 12f, 7f)
                verticalLineTo(2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.994f, 8.25f)
                curveTo(19.958f, 7.765f, 19.745f, 7.308f, 19.394f, 6.967f)
                lineTo(14.868f, 2.566f)
                curveTo(14.501f, 2.209f, 14.011f, 2.007f, 13.5f, 2f)
                verticalLineTo(7f)
                curveTo(13.5f, 7.69f, 14.06f, 8.25f, 14.75f, 8.25f)
                horizontalLineTo(19.994f)
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

        return fileBadgeClock!!
    }

private var fileBadgeClock: ImageVector? = null