package io.github.madmaximuus.persianSymbols.seven

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Seven: ImageVector
    get() {
        if (seven != null) {
            return seven!!
        }
        seven = ImageVector.Builder(
            name = "seven-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.5f, 3.5f)
                curveTo(5.5f, 2.948f, 5.948f, 2.5f, 6.5f, 2.5f)
                horizontalLineTo(17.5f)
                curveTo(17.851f, 2.5f, 18.176f, 2.684f, 18.357f, 2.984f)
                curveTo(18.538f, 3.285f, 18.548f, 3.658f, 18.384f, 3.968f)
                lineTo(9.384f, 20.968f)
                curveTo(9.125f, 21.456f, 8.52f, 21.642f, 8.032f, 21.384f)
                curveTo(7.544f, 21.125f, 7.358f, 20.52f, 7.616f, 20.032f)
                lineTo(15.839f, 4.5f)
                horizontalLineTo(6.5f)
                curveTo(5.948f, 4.5f, 5.5f, 4.052f, 5.5f, 3.5f)
                close()
            }
        }.build()

        return seven!!
    }

private var seven: ImageVector? = null
