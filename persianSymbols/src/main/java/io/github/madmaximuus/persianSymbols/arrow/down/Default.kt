package io.github.madmaximuus.persianSymbols.arrow.down

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.ArrowDown: ImageVector
    get() {
        if (arrowDown != null) {
            return arrowDown!!
        }
        arrowDown = ImageVector.Builder(
            name = "arrow-down-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 4f)
                curveTo(12.552f, 4f, 13f, 4.448f, 13f, 5f)
                lineTo(13f, 16.586f)
                lineTo(17.293f, 12.293f)
                curveTo(17.683f, 11.902f, 18.317f, 11.902f, 18.707f, 12.293f)
                curveTo(19.098f, 12.683f, 19.098f, 13.317f, 18.707f, 13.707f)
                lineTo(12.707f, 19.707f)
                curveTo(12.52f, 19.895f, 12.265f, 20f, 12f, 20f)
                curveTo(11.735f, 20f, 11.48f, 19.895f, 11.293f, 19.707f)
                lineTo(5.293f, 13.707f)
                curveTo(4.902f, 13.317f, 4.902f, 12.683f, 5.293f, 12.293f)
                curveTo(5.683f, 11.902f, 6.317f, 11.902f, 6.707f, 12.293f)
                lineTo(11f, 16.586f)
                lineTo(11f, 5f)
                curveTo(11f, 4.448f, 11.448f, 4f, 12f, 4f)
                close()
            }
        }.build()
        return arrowDown!!
    }

private var arrowDown: ImageVector? = null