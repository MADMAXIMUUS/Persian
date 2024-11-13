package io.github.madmaximuus.persianSymbols.pentagon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.Pentagon: ImageVector
    get() {
        if (pentagon != null) {
            return pentagon!!
        }
        pentagon = ImageVector.Builder(
            name = "pentagon-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.149f, 3.362f)
                curveTo(12.46f, 2.879f, 11.543f, 2.879f, 10.854f, 3.362f)
                lineTo(3.353f, 8.618f)
                curveTo(2.628f, 9.125f, 2.323f, 10.049f, 2.603f, 10.888f)
                lineTo(5.514f, 19.631f)
                curveTo(5.786f, 20.448f, 6.551f, 20.999f, 7.412f, 20.999f)
                horizontalLineTo(16.592f)
                curveTo(17.453f, 20.999f, 18.217f, 20.448f, 18.489f, 19.631f)
                lineTo(21.401f, 10.888f)
                curveTo(21.681f, 10.049f, 21.376f, 9.125f, 20.651f, 8.618f)
                lineTo(13.149f, 3.362f)
                close()
            }
        }.build()

        return pentagon!!
    }

private var pentagon: ImageVector? = null
