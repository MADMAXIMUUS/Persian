package io.github.madmaximuus.persianSymbols.triangle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Triangle: ImageVector
    get() {
        if (triangle != null) {
            return triangle!!
        }
        triangle = ImageVector.Builder(
            name = "triangle-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.698f, 4.256f)
                curveTo(11.274f, 3.248f, 12.727f, 3.248f, 13.303f, 4.256f)
                lineTo(21.302f, 18.255f)
                curveTo(21.873f, 19.256f, 21.151f, 20.5f, 20f, 20.5f)
                horizontalLineTo(4.002f)
                curveTo(2.85f, 20.5f, 2.128f, 19.256f, 2.7f, 18.255f)
                lineTo(10.698f, 4.256f)
                close()
                moveTo(12.435f, 6.768f)
                curveTo(12.243f, 6.432f, 11.759f, 6.432f, 11.567f, 6.768f)
                lineTo(5.291f, 17.751f)
                curveTo(5.101f, 18.085f, 5.342f, 18.5f, 5.725f, 18.5f)
                horizontalLineTo(18.276f)
                curveTo(18.66f, 18.5f, 18.901f, 18.085f, 18.71f, 17.751f)
                lineTo(12.435f, 6.768f)
                close()
            }
        }.build()

        return triangle!!
    }

private var triangle: ImageVector? = null
