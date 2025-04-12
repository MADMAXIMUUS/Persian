package io.github.madmaximuus.persianSymbols.pen.slash

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.PenSlash: ImageVector
    get() {
        if (penSlash != null) {
            return penSlash!!
        }
        penSlash = ImageVector.Builder(
            name = "pen-slash-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.707f, 2.293f)
                curveTo(3.317f, 1.902f, 2.683f, 1.902f, 2.293f, 2.293f)
                curveTo(1.902f, 2.683f, 1.902f, 3.317f, 2.293f, 3.707f)
                lineTo(20.293f, 21.707f)
                curveTo(20.683f, 22.098f, 21.317f, 22.098f, 21.707f, 21.707f)
                curveTo(22.098f, 21.317f, 22.098f, 20.683f, 21.707f, 20.293f)
                lineTo(3.707f, 2.293f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4.163f, 16.301f)
                lineTo(8.995f, 11.47f)
                lineTo(12.53f, 15.005f)
                lineTo(7.699f, 19.837f)
                curveTo(7.522f, 20.013f, 7.315f, 20.155f, 7.087f, 20.255f)
                lineTo(3.485f, 21.832f)
                curveTo(2.651f, 22.198f, 1.802f, 21.349f, 2.168f, 20.515f)
                lineTo(3.745f, 16.913f)
                curveTo(3.845f, 16.685f, 3.987f, 16.477f, 4.163f, 16.301f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.961f, 7.575f)
                lineTo(15.005f, 12.53f)
                lineTo(11.47f, 8.995f)
                lineTo(16.425f, 4.039f)
                lineTo(19.961f, 7.575f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.046f, 2.54f)
                lineTo(21.46f, 3.954f)
                curveTo(22.046f, 4.54f, 22.046f, 5.489f, 21.46f, 6.075f)
                lineTo(21.021f, 6.514f)
                lineTo(17.486f, 2.979f)
                lineTo(17.925f, 2.54f)
                curveTo(18.51f, 1.954f, 19.46f, 1.954f, 20.046f, 2.54f)
                close()
            }
        }.build()

        return penSlash!!
    }

private var penSlash: ImageVector? = null