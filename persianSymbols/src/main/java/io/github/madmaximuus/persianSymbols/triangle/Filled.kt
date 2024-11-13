package io.github.madmaximuus.persianSymbols.triangle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.Triangle: ImageVector
    get() {
        if (triangle != null) {
            return triangle!!
        }
        triangle = ImageVector.Builder(
            name = "triangle-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.997f, 20.504f)
                horizontalLineTo(4.002f)
                curveTo(2.851f, 20.504f, 2.129f, 19.26f, 2.7f, 18.26f)
                lineTo(10.697f, 4.256f)
                curveTo(11.273f, 3.248f, 12.727f, 3.248f, 13.302f, 4.256f)
                lineTo(21.3f, 18.26f)
                curveTo(21.871f, 19.26f, 21.149f, 20.504f, 19.997f, 20.504f)
                close()
            }
        }.build()

        return triangle!!
    }

private var triangle: ImageVector? = null
