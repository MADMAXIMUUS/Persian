package io.github.madmaximuus.persianSymbols.bolt.badge.clock

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.BoltBadgeClock: ImageVector
    get() {
        if (boltBadgeClock != null) {
            return boltBadgeClock!!
        }
        boltBadgeClock = ImageVector.Builder(
            name = "bolt-badge-clock-filled",
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

        return boltBadgeClock!!
    }

private var boltBadgeClock: ImageVector? = null
