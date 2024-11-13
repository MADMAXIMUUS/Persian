package io.github.madmaximuus.persianSymbols.hexagon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.Hexagon: ImageVector
    get() {
        if (hexagon != null) {
            return hexagon!!
        }
        hexagon = ImageVector.Builder(
            name = "hexagon-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.272f, 4.006f)
                lineTo(2.264f, 11.006f)
                curveTo(1.912f, 11.622f, 1.912f, 12.378f, 2.264f, 12.994f)
                lineTo(6.272f, 19.994f)
                curveTo(6.628f, 20.616f, 7.29f, 21f, 8.007f, 21f)
                horizontalLineTo(15.992f)
                curveTo(16.71f, 21f, 17.372f, 20.616f, 17.728f, 19.994f)
                lineTo(21.735f, 12.994f)
                curveTo(22.088f, 12.378f, 22.088f, 11.622f, 21.735f, 11.006f)
                lineTo(17.728f, 4.006f)
                curveTo(17.372f, 3.384f, 16.71f, 3f, 15.992f, 3f)
                horizontalLineTo(8.007f)
                curveTo(7.29f, 3f, 6.628f, 3.384f, 6.272f, 4.006f)
                close()
            }
        }.build()

        return hexagon!!
    }

private var hexagon: ImageVector? = null
