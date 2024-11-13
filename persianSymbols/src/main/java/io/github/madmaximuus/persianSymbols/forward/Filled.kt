package io.github.madmaximuus.persianSymbols.forward

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.Forward: ImageVector
    get() {
        if (forward != null) {
            return forward!!
        }
        forward = Builder(
            name = "forward-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.069f, 17.354f)
                lineTo(20.517f, 12.856f)
                curveTo(21.161f, 12.467f, 21.161f, 11.533f, 20.517f, 11.144f)
                lineTo(13.069f, 6.646f)
                curveTo(12.403f, 6.243f, 11.552f, 6.723f, 11.552f, 7.502f)
                verticalLineTo(10.896f)
                lineTo(4.514f, 6.646f)
                curveTo(3.848f, 6.243f, 2.997f, 6.723f, 2.997f, 7.502f)
                lineTo(2.997f, 16.498f)
                curveTo(2.997f, 17.277f, 3.848f, 17.757f, 4.514f, 17.354f)
                lineTo(11.552f, 13.104f)
                verticalLineTo(16.498f)
                curveTo(11.552f, 17.277f, 12.403f, 17.757f, 13.069f, 17.354f)
                close()
            }
        }.build()
        return forward!!
    }

private var forward: ImageVector? = null