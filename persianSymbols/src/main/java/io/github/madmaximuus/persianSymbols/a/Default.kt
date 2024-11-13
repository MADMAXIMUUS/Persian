package io.github.madmaximuus.persianSymbols.a

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.A: ImageVector
    get() {
        if (a != null) {
            return a!!
        }
        a = Builder(
            name = "a-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 2.5f)
                curveTo(12.424f, 2.5f, 12.802f, 2.767f, 12.943f, 3.167f)
                lineTo(18.943f, 20.167f)
                curveTo(19.127f, 20.688f, 18.854f, 21.259f, 18.333f, 21.443f)
                curveTo(17.812f, 21.627f, 17.241f, 21.354f, 17.057f, 20.833f)
                lineTo(15.356f, 16.015f)
                horizontalLineTo(8.644f)
                lineTo(6.943f, 20.833f)
                curveTo(6.759f, 21.354f, 6.188f, 21.627f, 5.667f, 21.443f)
                curveTo(5.146f, 21.259f, 4.873f, 20.688f, 5.057f, 20.167f)
                lineTo(11.057f, 3.167f)
                curveTo(11.198f, 2.767f, 11.576f, 2.5f, 12f, 2.5f)
                close()
                moveTo(9.349f, 14.015f)
                horizontalLineTo(14.651f)
                lineTo(12f, 6.505f)
                lineTo(9.349f, 14.015f)
                close()
            }
        }.build()
        return a!!
    }

private var a: ImageVector? = null
