package io.github.madmaximuus.persianSymbols.arrow.left

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.ArrowLeft: ImageVector
    get() {
        if (arrowLeft != null) {
            return arrowLeft!!
        }
        arrowLeft = ImageVector.Builder(
            name = "arrow-left-defaults",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.707f, 5.293f)
                curveTo(12.098f, 5.683f, 12.098f, 6.317f, 11.707f, 6.707f)
                lineTo(7.414f, 11f)
                horizontalLineTo(19f)
                curveTo(19.552f, 11f, 20f, 11.448f, 20f, 12f)
                curveTo(20f, 12.552f, 19.552f, 13f, 19f, 13f)
                horizontalLineTo(7.414f)
                lineTo(11.707f, 17.293f)
                curveTo(12.098f, 17.683f, 12.098f, 18.317f, 11.707f, 18.707f)
                curveTo(11.317f, 19.098f, 10.683f, 19.098f, 10.293f, 18.707f)
                lineTo(4.293f, 12.707f)
                curveTo(4.105f, 12.52f, 4f, 12.265f, 4f, 12f)
                curveTo(4f, 11.735f, 4.105f, 11.48f, 4.293f, 11.293f)
                lineTo(10.293f, 5.293f)
                curveTo(10.683f, 4.902f, 11.317f, 4.902f, 11.707f, 5.293f)
                close()
            }
        }.build()
        return arrowLeft!!
    }

private var arrowLeft: ImageVector? = null