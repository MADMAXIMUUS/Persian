package io.github.madmaximuus.persianSymbols.pentagon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Pentagon: ImageVector
    get() {
        if (pentagon != null) {
            return pentagon!!
        }
        pentagon = ImageVector.Builder(
            name = "pentagon-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.854f, 3.362f)
                curveTo(11.543f, 2.879f, 12.46f, 2.879f, 13.148f, 3.362f)
                lineTo(20.649f, 8.614f)
                curveTo(21.374f, 9.122f, 21.679f, 10.045f, 21.4f, 10.885f)
                lineTo(18.486f, 19.629f)
                curveTo(18.213f, 20.446f, 17.449f, 20.997f, 16.588f, 20.997f)
                horizontalLineTo(7.414f)
                curveTo(6.553f, 20.997f, 5.789f, 20.446f, 5.517f, 19.629f)
                lineTo(2.603f, 10.885f)
                curveTo(2.323f, 10.045f, 2.628f, 9.122f, 3.353f, 8.614f)
                lineTo(10.854f, 3.362f)
                close()
                moveTo(12.575f, 5.402f)
                curveTo(12.23f, 5.16f, 11.772f, 5.16f, 11.428f, 5.402f)
                lineTo(5.111f, 9.825f)
                curveTo(4.749f, 10.078f, 4.596f, 10.54f, 4.736f, 10.96f)
                lineTo(7.186f, 18.313f)
                curveTo(7.322f, 18.722f, 7.705f, 18.997f, 8.135f, 18.997f)
                horizontalLineTo(15.867f)
                curveTo(16.298f, 18.997f, 16.68f, 18.722f, 16.816f, 18.313f)
                lineTo(19.267f, 10.96f)
                curveTo(19.406f, 10.54f, 19.254f, 10.078f, 18.891f, 9.825f)
                lineTo(12.575f, 5.402f)
                close()
            }
        }.build()

        return pentagon!!
    }

private var pentagon: ImageVector? = null
