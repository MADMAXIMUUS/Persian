package io.github.madmaximuus.persianSymbols.bolt.badge.cross

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.BoltBadgeCross: ImageVector
    get() {
        if (boltBadgeCross != null) {
            return boltBadgeCross!!
        }
        boltBadgeCross = ImageVector.Builder(
            name = "bolt-badge-cross-filled",
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

        return boltBadgeCross!!
    }

private var boltBadgeCross: ImageVector? = null
