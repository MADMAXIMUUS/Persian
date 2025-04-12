package io.github.madmaximuus.persianSymbols.pen.slash

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.PenSlash: ImageVector
    get() {
        if (penSlash != null) {
            return penSlash!!
        }
        penSlash = ImageVector.Builder(
            name = "pen-slash-default",
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
                moveTo(4.039f, 16.425f)
                lineTo(8.995f, 11.47f)
                lineTo(10.409f, 12.884f)
                lineTo(5.481f, 17.812f)
                lineTo(4.939f, 19.061f)
                lineTo(6.188f, 18.519f)
                lineTo(11.116f, 13.591f)
                lineTo(12.53f, 15.005f)
                lineTo(7.575f, 19.961f)
                curveTo(7.415f, 20.121f, 7.226f, 20.249f, 7.018f, 20.339f)
                lineTo(3.413f, 21.903f)
                curveTo(3.036f, 22.066f, 2.598f, 21.983f, 2.308f, 21.692f)
                curveTo(2.017f, 21.402f, 1.934f, 20.964f, 2.097f, 20.587f)
                lineTo(3.661f, 16.982f)
                curveTo(3.751f, 16.774f, 3.879f, 16.585f, 4.039f, 16.425f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(18.275f, 6.432f)
                lineTo(13.591f, 11.116f)
                lineTo(15.005f, 12.53f)
                lineTo(21.4f, 6.136f)
                curveTo(22.181f, 5.355f, 22.181f, 4.089f, 21.4f, 3.308f)
                lineTo(20.692f, 2.6f)
                curveTo(19.911f, 1.819f, 18.645f, 1.819f, 17.864f, 2.6f)
                lineTo(11.47f, 8.995f)
                lineTo(12.884f, 10.409f)
                lineTo(17.568f, 5.725f)
                lineTo(18.275f, 6.432f)
                close()
                moveTo(18.629f, 4.664f)
                lineTo(19.278f, 4.015f)
                lineTo(19.985f, 4.722f)
                lineTo(19.336f, 5.371f)
                lineTo(18.629f, 4.664f)
                close()
            }
        }.build()

        return penSlash!!
    }

private var penSlash: ImageVector? = null