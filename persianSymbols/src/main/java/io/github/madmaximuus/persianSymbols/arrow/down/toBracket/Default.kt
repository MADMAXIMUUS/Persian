package io.github.madmaximuus.persianSymbols.arrow.down.toBracket

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.ArrowDownToBracket: ImageVector
    get() {
        if (arrowDownToBracket != null) {
            return arrowDownToBracket!!
        }
        arrowDownToBracket = ImageVector.Builder(
            name = "arrow-down-to-bracket-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.708f, 10.293f)
                curveTo(8.317f, 9.902f, 7.684f, 9.902f, 7.294f, 10.293f)
                curveTo(6.903f, 10.683f, 6.903f, 11.317f, 7.294f, 11.707f)
                lineTo(11.294f, 15.707f)
                curveTo(11.684f, 16.098f, 12.318f, 16.098f, 12.708f, 15.707f)
                lineTo(16.708f, 11.707f)
                curveTo(17.098f, 11.317f, 17.098f, 10.683f, 16.708f, 10.293f)
                curveTo(16.317f, 9.902f, 15.684f, 9.902f, 15.294f, 10.293f)
                lineTo(13.001f, 12.586f)
                verticalLineTo(5f)
                curveTo(13.001f, 4.448f, 12.553f, 4f, 12.001f, 4f)
                curveTo(11.449f, 4f, 11.001f, 4.448f, 11.001f, 5f)
                verticalLineTo(12.586f)
                lineTo(8.708f, 10.293f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4f, 15f)
                curveTo(4f, 14.448f, 3.552f, 14f, 3f, 14f)
                curveTo(2.448f, 14f, 2f, 14.448f, 2f, 15f)
                verticalLineTo(15.6f)
                curveTo(2f, 18.03f, 3.97f, 20f, 6.4f, 20f)
                horizontalLineTo(17.6f)
                curveTo(20.03f, 20f, 22f, 18.03f, 22f, 15.6f)
                verticalLineTo(15f)
                curveTo(22f, 14.448f, 21.552f, 14f, 21f, 14f)
                curveTo(20.448f, 14f, 20f, 14.448f, 20f, 15f)
                verticalLineTo(15.6f)
                curveTo(20f, 16.926f, 18.925f, 18f, 17.6f, 18f)
                horizontalLineTo(6.4f)
                curveTo(5.074f, 18f, 4f, 16.926f, 4f, 15.6f)
                verticalLineTo(15f)
                close()
            }
        }.build()
        return arrowDownToBracket!!
    }

private var arrowDownToBracket: ImageVector? = null