package io.github.madmaximuus.persianSymbols.arrow.right

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.ArrowRight: ImageVector
    get() {
        if (arrowRight != null) {
            return arrowRight!!
        }
        arrowRight = ImageVector.Builder(
            name = "arrow-right-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.293f, 5.293f)
                curveTo(12.683f, 4.902f, 13.317f, 4.902f, 13.707f, 5.293f)
                lineTo(19.707f, 11.293f)
                curveTo(20.098f, 11.683f, 20.098f, 12.317f, 19.707f, 12.707f)
                lineTo(13.707f, 18.707f)
                curveTo(13.317f, 19.098f, 12.683f, 19.098f, 12.293f, 18.707f)
                curveTo(11.902f, 18.317f, 11.902f, 17.683f, 12.293f, 17.293f)
                lineTo(16.586f, 13f)
                lineTo(5f, 13f)
                curveTo(4.448f, 13f, 4f, 12.552f, 4f, 12f)
                curveTo(4f, 11.448f, 4.448f, 11f, 5f, 11f)
                lineTo(16.586f, 11f)
                lineTo(12.293f, 6.707f)
                curveTo(11.902f, 6.317f, 11.902f, 5.683f, 12.293f, 5.293f)
                close()
            }
        }.build()
        return arrowRight!!
    }

private var arrowRight: ImageVector? = null