package io.github.madmaximuus.persianSymbols.eraser

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Eraser: ImageVector
    get() {
        if (eraser != null) {
            return eraser!!
        }
        eraser = ImageVector.Builder(
            name = "eraser-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15.535f, 2.807f)
                curveTo(14.754f, 2.026f, 13.488f, 2.026f, 12.707f, 2.807f)
                lineTo(3.515f, 12f)
                curveTo(2.343f, 13.171f, 2.343f, 15.071f, 3.515f, 16.242f)
                lineTo(7.757f, 20.485f)
                curveTo(8.929f, 21.657f, 10.828f, 21.657f, 12f, 20.485f)
                lineTo(21.192f, 11.293f)
                curveTo(21.973f, 10.512f, 21.973f, 9.245f, 21.192f, 8.464f)
                lineTo(15.535f, 2.807f)
                close()
                moveTo(14.121f, 4.221f)
                lineTo(19.778f, 9.878f)
                lineTo(13.237f, 16.419f)
                lineTo(7.58f, 10.762f)
                lineTo(14.121f, 4.221f)
                close()
                moveTo(6.52f, 11.823f)
                lineTo(4.929f, 13.414f)
                curveTo(4.538f, 13.804f, 4.538f, 14.438f, 4.929f, 14.828f)
                lineTo(9.172f, 19.071f)
                curveTo(9.562f, 19.461f, 10.195f, 19.461f, 10.586f, 19.071f)
                lineTo(12.177f, 17.48f)
                lineTo(6.52f, 11.823f)
                close()
            }
        }.build()

        return eraser!!
    }

private var eraser: ImageVector? = null