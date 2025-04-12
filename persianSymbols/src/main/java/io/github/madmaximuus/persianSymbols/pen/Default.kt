package io.github.madmaximuus.persianSymbols.pen

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Pen: ImageVector
    get() {
        if (pen != null) {
            return pen!!
        }
        pen = Builder(
            name = "pen-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(20.692f, 2.6f)
                curveTo(19.911f, 1.819f, 18.645f, 1.819f, 17.864f, 2.6f)
                lineTo(4.039f, 16.425f)
                curveTo(3.879f, 16.585f, 3.751f, 16.774f, 3.661f, 16.982f)
                lineTo(2.097f, 20.587f)
                curveTo(1.934f, 20.964f, 2.017f, 21.402f, 2.308f, 21.692f)
                curveTo(2.598f, 21.983f, 3.036f, 22.066f, 3.413f, 21.903f)
                lineTo(7.018f, 20.339f)
                curveTo(7.226f, 20.249f, 7.415f, 20.121f, 7.575f, 19.961f)
                lineTo(21.4f, 6.136f)
                curveTo(22.181f, 5.355f, 22.181f, 4.089f, 21.4f, 3.308f)
                lineTo(20.692f, 2.6f)
                close()
                moveTo(18.629f, 4.664f)
                lineTo(19.278f, 4.015f)
                lineTo(19.985f, 4.722f)
                lineTo(19.336f, 5.371f)
                lineTo(18.629f, 4.664f)
                close()
                moveTo(17.568f, 5.725f)
                lineTo(5.481f, 17.812f)
                lineTo(4.939f, 19.061f)
                lineTo(6.188f, 18.519f)
                lineTo(18.275f, 6.432f)
                lineTo(17.568f, 5.725f)
                close()
            }
        }.build()
        return pen!!
    }

private var pen: ImageVector? = null