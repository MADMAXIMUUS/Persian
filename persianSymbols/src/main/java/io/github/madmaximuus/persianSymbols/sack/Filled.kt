package io.github.madmaximuus.persianSymbols.sack

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.Sack: ImageVector
    get() {
        if (sack != null) {
            return sack!!
        }
        sack = ImageVector.Builder(
            name = "sack-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.557f, 6.524f)
                lineTo(7.464f, 4.121f)
                curveTo(7.013f, 3.128f, 7.739f, 2f, 8.83f, 2f)
                horizontalLineTo(15.17f)
                curveTo(16.261f, 2f, 16.987f, 3.128f, 16.536f, 4.121f)
                lineTo(15.443f, 6.524f)
                curveTo(19.027f, 8.31f, 20f, 14.22f, 20f, 17.429f)
                verticalLineTo(17.6f)
                curveTo(20f, 20.03f, 18.03f, 22f, 15.6f, 22f)
                horizontalLineTo(8.4f)
                curveTo(5.97f, 22f, 4f, 20.03f, 4f, 17.6f)
                verticalLineTo(17.429f)
                curveTo(4f, 14.22f, 4.973f, 8.31f, 8.557f, 6.524f)
                close()
            }
        }.build()

        return sack!!
    }

private var sack: ImageVector? = null
