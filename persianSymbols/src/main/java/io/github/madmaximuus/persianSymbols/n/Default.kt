package io.github.madmaximuus.persianSymbols.n

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.N: ImageVector
    get() {
        if (n != null) {
            return n!!
        }
        n = ImageVector.Builder(
            name = "n-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.241f, 2.53f)
                curveTo(7.687f, 2.419f, 8.151f, 2.625f, 8.366f, 3.031f)
                lineTo(15.517f, 16.487f)
                verticalLineTo(3.5f)
                curveTo(15.517f, 2.948f, 15.965f, 2.5f, 16.517f, 2.5f)
                curveTo(17.069f, 2.5f, 17.517f, 2.948f, 17.517f, 3.5f)
                verticalLineTo(20.5f)
                curveTo(17.517f, 20.959f, 17.204f, 21.359f, 16.759f, 21.47f)
                curveTo(16.313f, 21.581f, 15.849f, 21.375f, 15.634f, 20.969f)
                lineTo(8.483f, 7.513f)
                verticalLineTo(20.5f)
                curveTo(8.483f, 21.052f, 8.035f, 21.5f, 7.483f, 21.5f)
                curveTo(6.931f, 21.5f, 6.483f, 21.052f, 6.483f, 20.5f)
                verticalLineTo(3.5f)
                curveTo(6.483f, 3.041f, 6.796f, 2.641f, 7.241f, 2.53f)
                close()
            }
        }.build()

        return n!!
    }

private var n: ImageVector? = null
