package io.github.madmaximuus.persianSymbols.bolt.slash

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.BoltSlash: ImageVector
    get() {
        if (boltSlash != null) {
            return boltSlash!!
        }
        boltSlash = ImageVector.Builder(
            name = "bolt-slash-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.707f, 2.293f)
                curveTo(3.317f, 1.902f, 2.683f, 1.902f, 2.293f, 2.293f)
                curveTo(1.902f, 2.683f, 1.902f, 3.317f, 2.293f, 3.707f)
                lineTo(20.293f, 21.707f)
                curveTo(20.683f, 22.098f, 21.317f, 22.098f, 21.707f, 21.707f)
                curveTo(22.098f, 21.317f, 22.098f, 20.683f, 21.707f, 20.293f)
                lineTo(3.707f, 2.293f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.483f, 13.455f)
                lineTo(8.31f, 10.785f)
                lineTo(13.66f, 16.135f)
                lineTo(10.8f, 20.295f)
                curveTo(10.499f, 20.734f, 9.812f, 20.46f, 9.894f, 19.934f)
                lineTo(10.699f, 14.815f)
                curveTo(10.747f, 14.512f, 10.513f, 14.238f, 10.205f, 14.238f)
                horizontalLineTo(6.896f)
                curveTo(6.494f, 14.238f, 6.256f, 13.787f, 6.483f, 13.455f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.515f, 10.53f)
                lineTo(15.677f, 13.202f)
                lineTo(10.321f, 7.846f)
                lineTo(13.158f, 3.698f)
                curveTo(13.458f, 3.26f, 14.144f, 3.53f, 14.065f, 4.055f)
                lineTo(13.297f, 9.172f)
                curveTo(13.252f, 9.474f, 13.486f, 9.746f, 13.792f, 9.746f)
                horizontalLineTo(17.103f)
                curveTo(17.506f, 9.746f, 17.743f, 10.198f, 17.515f, 10.53f)
                close()
            }
        }.build()

        return boltSlash!!
    }

private var boltSlash: ImageVector? = null
