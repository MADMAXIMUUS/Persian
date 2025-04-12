package io.github.madmaximuus.persianSymbols.arrow.right.toBracket

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.ArrowRightToBracket: ImageVector
    get() {
        if (arrowRightToBracket != null) {
            return arrowRightToBracket!!
        }
        arrowRightToBracket = ImageVector.Builder(
            name = "arrow-right-to-bracket-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 17.5f)
                curveTo(18f, 18.881f, 16.881f, 20f, 15.5f, 20f)
                horizontalLineTo(13.486f)
                curveTo(12.933f, 20f, 12.486f, 20.448f, 12.486f, 21f)
                curveTo(12.486f, 21.552f, 12.933f, 22f, 13.486f, 22f)
                horizontalLineTo(15.5f)
                curveTo(17.985f, 22f, 20f, 19.985f, 20f, 17.5f)
                lineTo(20f, 6.5f)
                curveTo(20f, 4.015f, 17.985f, 2f, 15.5f, 2f)
                horizontalLineTo(13.486f)
                curveTo(12.933f, 2f, 12.486f, 2.448f, 12.486f, 3f)
                curveTo(12.486f, 3.552f, 12.933f, 4f, 13.486f, 4f)
                lineTo(15.5f, 4f)
                curveTo(16.881f, 4f, 18f, 5.119f, 18f, 6.5f)
                lineTo(18f, 17.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.293f, 15.293f)
                curveTo(9.902f, 15.684f, 9.902f, 16.317f, 10.293f, 16.707f)
                curveTo(10.683f, 17.098f, 11.317f, 17.098f, 11.707f, 16.707f)
                lineTo(15.707f, 12.707f)
                curveTo(16.098f, 12.317f, 16.098f, 11.684f, 15.707f, 11.293f)
                lineTo(11.707f, 7.293f)
                curveTo(11.317f, 6.902f, 10.683f, 6.902f, 10.293f, 7.293f)
                curveTo(9.902f, 7.684f, 9.902f, 8.317f, 10.293f, 8.707f)
                lineTo(12.586f, 11f)
                horizontalLineTo(5f)
                curveTo(4.448f, 11f, 4f, 11.448f, 4f, 12f)
                curveTo(4f, 12.552f, 4.448f, 13f, 5f, 13f)
                horizontalLineTo(12.586f)
                lineTo(10.293f, 15.293f)
                close()
            }
        }.build()
        return arrowRightToBracket!!
    }

private var arrowRightToBracket: ImageVector? = null