package io.github.madmaximuus.persianSymbols.eraser

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.Eraser: ImageVector
    get() {
        if (eraser != null) {
            return eraser!!
        }
        eraser = ImageVector.Builder(
            name = "eraser-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.535f, 2.808f)
                curveTo(14.754f, 2.027f, 13.488f, 2.027f, 12.707f, 2.808f)
                lineTo(3.515f, 12f)
                curveTo(2.343f, 13.172f, 2.343f, 15.071f, 3.515f, 16.243f)
                lineTo(7.757f, 20.485f)
                curveTo(8.929f, 21.657f, 10.828f, 21.657f, 12f, 20.485f)
                lineTo(13.591f, 18.895f)
                lineTo(5.106f, 10.409f)
                lineTo(6.166f, 9.349f)
                lineTo(14.651f, 17.834f)
                lineTo(21.192f, 11.293f)
                curveTo(21.973f, 10.512f, 21.973f, 9.246f, 21.192f, 8.465f)
                lineTo(15.535f, 2.808f)
                close()
            }
        }.build()

        return eraser!!
    }

private var eraser: ImageVector? = null