package io.github.madmaximuus.persianSymbols.arrow.right.fromBracket

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.ArrowRightFromBracket: ImageVector
    get() {
        if (arrowRightFromBracket != null) {
            return arrowRightFromBracket!!
        }
        arrowRightFromBracket = ImageVector.Builder(
            name = "arrow-right-from-bracket",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6f, 6.5f)
                curveTo(6f, 5.119f, 7.119f, 4f, 8.5f, 4f)
                horizontalLineTo(12f)
                curveTo(12.552f, 4f, 13f, 3.552f, 13f, 3f)
                curveTo(13f, 2.448f, 12.552f, 2f, 12f, 2f)
                horizontalLineTo(8.5f)
                curveTo(6.015f, 2f, 4f, 4.015f, 4f, 6.5f)
                verticalLineTo(17.5f)
                curveTo(4f, 19.985f, 6.015f, 22f, 8.5f, 22f)
                horizontalLineTo(12f)
                curveTo(12.552f, 22f, 13f, 21.552f, 13f, 21f)
                curveTo(13f, 20.448f, 12.552f, 20f, 12f, 20f)
                horizontalLineTo(8.5f)
                curveTo(7.119f, 20f, 6f, 18.881f, 6f, 17.5f)
                verticalLineTo(6.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.293f, 15.293f)
                curveTo(13.902f, 15.683f, 13.902f, 16.317f, 14.293f, 16.707f)
                curveTo(14.683f, 17.098f, 15.316f, 17.098f, 15.707f, 16.707f)
                lineTo(19.707f, 12.707f)
                curveTo(20.097f, 12.317f, 20.097f, 11.683f, 19.707f, 11.293f)
                lineTo(15.707f, 7.293f)
                curveTo(15.316f, 6.902f, 14.683f, 6.902f, 14.293f, 7.293f)
                curveTo(13.902f, 7.683f, 13.902f, 8.317f, 14.293f, 8.707f)
                lineTo(16.586f, 11f)
                horizontalLineTo(9f)
                curveTo(8.448f, 11f, 8f, 11.448f, 8f, 12f)
                curveTo(8f, 12.552f, 8.448f, 13f, 9f, 13f)
                horizontalLineTo(16.586f)
                lineTo(14.293f, 15.293f)
                close()
            }
        }.build()
        return arrowRightFromBracket!!
    }

private var arrowRightFromBracket: ImageVector? = null