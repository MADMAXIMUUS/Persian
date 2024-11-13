package io.github.madmaximuus.persianSymbols.e

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.E: ImageVector
    get() {
        if (e != null) {
            return e!!
        }
        e = ImageVector.Builder(
            name = "e-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.226f, 3.5f)
                curveTo(7.226f, 2.948f, 7.673f, 2.5f, 8.226f, 2.5f)
                horizontalLineTo(15.774f)
                curveTo(16.327f, 2.5f, 16.774f, 2.948f, 16.774f, 3.5f)
                curveTo(16.774f, 4.052f, 16.327f, 4.5f, 15.774f, 4.5f)
                horizontalLineTo(9.226f)
                verticalLineTo(11f)
                horizontalLineTo(14.725f)
                curveTo(15.278f, 11f, 15.725f, 11.448f, 15.725f, 12f)
                curveTo(15.725f, 12.552f, 15.278f, 13f, 14.725f, 13f)
                horizontalLineTo(9.226f)
                verticalLineTo(19.5f)
                horizontalLineTo(15.774f)
                curveTo(16.327f, 19.5f, 16.774f, 19.948f, 16.774f, 20.5f)
                curveTo(16.774f, 21.052f, 16.327f, 21.5f, 15.774f, 21.5f)
                horizontalLineTo(8.226f)
                curveTo(7.673f, 21.5f, 7.226f, 21.052f, 7.226f, 20.5f)
                verticalLineTo(3.5f)
                close()
            }
        }.build()

        return e!!
    }
private var e: ImageVector? = null
