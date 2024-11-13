package io.github.madmaximuus.persianSymbols.diamond

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Diamond: ImageVector
    get() {
        if (diamond != null) {
            return diamond!!
        }
        diamond = ImageVector.Builder(
            name = "diamond-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.586f, 3f)
                curveTo(11.367f, 2.219f, 12.633f, 2.219f, 13.414f, 3f)
                lineTo(21f, 10.586f)
                curveTo(21.781f, 11.367f, 21.781f, 12.633f, 21f, 13.414f)
                lineTo(13.414f, 21f)
                curveTo(12.633f, 21.781f, 11.367f, 21.781f, 10.586f, 21f)
                lineTo(3f, 13.414f)
                curveTo(2.219f, 12.633f, 2.219f, 11.367f, 3f, 10.586f)
                lineTo(10.586f, 3f)
                close()
                moveTo(12f, 4.414f)
                lineTo(4.414f, 12f)
                lineTo(12f, 19.586f)
                lineTo(19.586f, 12f)
                lineTo(12f, 4.414f)
                close()
            }
        }.build()

        return diamond!!
    }

private var diamond: ImageVector? = null
