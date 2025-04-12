package io.github.madmaximuus.persianSymbols.arrow.up

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.ArrowUp: ImageVector
    get() {
        if (arrowUp != null) {
            return arrowUp!!
        }
        arrowUp = ImageVector.Builder(
            name = "arrow-up-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = EvenOdd
            ) {
                moveTo(12f, 4f)
                curveTo(12.265f, 4f, 12.52f, 4.105f, 12.707f, 4.293f)
                lineTo(18.707f, 10.293f)
                curveTo(19.098f, 10.683f, 19.098f, 11.317f, 18.707f, 11.707f)
                curveTo(18.317f, 12.098f, 17.683f, 12.098f, 17.293f, 11.707f)
                lineTo(13f, 7.414f)
                lineTo(13f, 19f)
                curveTo(13f, 19.552f, 12.552f, 20f, 12f, 20f)
                curveTo(11.448f, 20f, 11f, 19.552f, 11f, 19f)
                lineTo(11f, 7.414f)
                lineTo(6.707f, 11.707f)
                curveTo(6.317f, 12.098f, 5.683f, 12.098f, 5.293f, 11.707f)
                curveTo(4.902f, 11.317f, 4.902f, 10.683f, 5.293f, 10.293f)
                lineTo(11.293f, 4.293f)
                curveTo(11.48f, 4.105f, 11.735f, 4f, 12f, 4f)
                close()
            }
        }.build()
        return arrowUp!!
    }

private var arrowUp: ImageVector? = null