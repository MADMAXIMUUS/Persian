package io.github.madmaximuus.persianSymbols.star

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.Star: ImageVector
    get() {
        if (star != null) {
            return star!!
        }
        star = ImageVector.Builder(
            name = "star-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.049f, 2.707f)
                curveTo(11.338f, 1.764f, 12.662f, 1.764f, 12.951f, 2.707f)
                lineTo(14.82f, 8.806f)
                horizontalLineTo(21.003f)
                curveTo(21.955f, 8.806f, 22.364f, 10.025f, 21.607f, 10.608f)
                lineTo(16.563f, 14.493f)
                lineTo(18.463f, 20.695f)
                curveTo(18.749f, 21.629f, 17.678f, 22.383f, 16.908f, 21.789f)
                lineTo(12f, 18.008f)
                lineTo(7.092f, 21.789f)
                curveTo(6.322f, 22.383f, 5.251f, 21.629f, 5.537f, 20.695f)
                lineTo(7.437f, 14.493f)
                lineTo(2.393f, 10.608f)
                curveTo(1.636f, 10.025f, 2.045f, 8.806f, 2.997f, 8.806f)
                horizontalLineTo(9.18f)
                lineTo(11.049f, 2.707f)
                close()
            }
        }.build()
        return star!!
    }

private var star: ImageVector? = null