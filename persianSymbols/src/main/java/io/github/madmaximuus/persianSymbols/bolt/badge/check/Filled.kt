package io.github.madmaximuus.persianSymbols.bolt.badge.check

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.BoltBadgeCheck: ImageVector
    get() {
        if (boltBadgeCheck != null) {
            return boltBadgeCheck!!
        }
        boltBadgeCheck = ImageVector.Builder(
            name = "bolt-badge-check-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.896f, 14.238f)
                curveTo(6.494f, 14.238f, 6.256f, 13.787f, 6.483f, 13.455f)
                lineTo(13.158f, 3.698f)
                curveTo(13.458f, 3.26f, 14.144f, 3.53f, 14.065f, 4.055f)
                lineTo(13.297f, 9.172f)
                curveTo(13.252f, 9.474f, 13.486f, 9.746f, 13.792f, 9.746f)
                horizontalLineTo(17.103f)
                curveTo(17.506f, 9.746f, 17.743f, 10.198f, 17.515f, 10.53f)
                lineTo(15.864f, 12.93f)
                curveTo(13.94f, 13.741f, 12.574f, 15.617f, 12.503f, 17.819f)
                lineTo(10.8f, 20.295f)
                curveTo(10.499f, 20.734f, 9.812f, 20.46f, 9.894f, 19.934f)
                lineTo(10.699f, 14.815f)
                curveTo(10.747f, 14.512f, 10.513f, 14.238f, 10.205f, 14.238f)
                horizontalLineTo(6.896f)
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

        return boltBadgeCheck!!
    }

private var boltBadgeCheck: ImageVector? = null
