package io.github.madmaximuus.persianSymbols.diamond

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.Diamond: ImageVector
    get() {
        if (diamond != null) {
            return diamond!!
        }
        diamond = ImageVector.Builder(
            name = "diamond-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.293f, 2.707f)
                curveTo(11.683f, 2.317f, 12.317f, 2.317f, 12.707f, 2.707f)
                lineTo(21.293f, 11.293f)
                curveTo(21.683f, 11.683f, 21.683f, 12.317f, 21.293f, 12.707f)
                lineTo(12.707f, 21.293f)
                curveTo(12.317f, 21.683f, 11.683f, 21.683f, 11.293f, 21.293f)
                lineTo(2.707f, 12.707f)
                curveTo(2.317f, 12.317f, 2.317f, 11.683f, 2.707f, 11.293f)
                lineTo(11.293f, 2.707f)
                close()
            }
        }.build()

        return diamond!!
    }

private var diamond: ImageVector? = null
