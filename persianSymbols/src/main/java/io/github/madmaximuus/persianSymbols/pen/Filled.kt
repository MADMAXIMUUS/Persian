package io.github.madmaximuus.persianSymbols.pen

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.Pen: ImageVector
    get() {
        if (pen != null) {
            return pen!!
        }
        pen = Builder(
            name = "pen-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
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
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.425f, 4.039f)
                lineTo(4.163f, 16.301f)
                curveTo(3.987f, 16.477f, 3.845f, 16.685f, 3.745f, 16.913f)
                lineTo(2.168f, 20.515f)
                curveTo(1.802f, 21.349f, 2.651f, 22.198f, 3.485f, 21.832f)
                lineTo(7.087f, 20.255f)
                curveTo(7.315f, 20.155f, 7.522f, 20.013f, 7.699f, 19.837f)
                lineTo(19.961f, 7.575f)
                lineTo(16.425f, 4.039f)
                close()
            }
        }.build()
        return pen!!
    }

private var pen: ImageVector? = null