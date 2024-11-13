package io.github.madmaximuus.persianSymbols.code

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Code: ImageVector
    get() {
        if (code != null) {
            return code!!
        }
        code = Builder(
            name = "code-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.2f, 5.769f)
                curveTo(15.349f, 5.383f, 15.156f, 4.949f, 14.769f, 4.8f)
                curveTo(14.383f, 4.651f, 13.949f, 4.844f, 13.8f, 5.231f)
                lineTo(8.8f, 18.231f)
                curveTo(8.651f, 18.617f, 8.844f, 19.051f, 9.231f, 19.2f)
                curveTo(9.617f, 19.349f, 10.051f, 19.156f, 10.2f, 18.769f)
                lineTo(15.2f, 5.769f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.907f, 16.942f)
                curveTo(7.297f, 17.333f, 7.934f, 17.336f, 8.328f, 16.95f)
                curveTo(8.723f, 16.563f, 8.726f, 15.934f, 8.336f, 15.543f)
                lineTo(4.793f, 12f)
                lineTo(8.336f, 8.457f)
                curveTo(8.726f, 8.066f, 8.723f, 7.437f, 8.328f, 7.05f)
                curveTo(7.934f, 6.664f, 7.297f, 6.667f, 6.907f, 7.058f)
                lineTo(2.676f, 11.289f)
                lineTo(2.672f, 11.293f)
                curveTo(2.277f, 11.679f, 2.274f, 12.309f, 2.664f, 12.7f)
                lineTo(6.907f, 16.942f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.093f, 7.058f)
                curveTo(16.703f, 6.667f, 16.066f, 6.664f, 15.672f, 7.05f)
                curveTo(15.277f, 7.437f, 15.274f, 8.066f, 15.664f, 8.457f)
                lineTo(19.207f, 12f)
                lineTo(15.664f, 15.543f)
                curveTo(15.274f, 15.934f, 15.277f, 16.563f, 15.672f, 16.95f)
                curveTo(16.066f, 17.336f, 16.703f, 17.333f, 17.093f, 16.942f)
                lineTo(21.324f, 12.711f)
                lineTo(21.328f, 12.707f)
                curveTo(21.723f, 12.321f, 21.726f, 11.691f, 21.336f, 11.3f)
                lineTo(17.093f, 7.058f)
                close()
            }
        }.build()
        return code!!
    }

private var code: ImageVector? = null