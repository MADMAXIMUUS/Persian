package io.github.madmaximuus.persianSymbols.forward

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Forward: ImageVector
    get() {
        if (forward != null) {
            return forward!!
        }
        forward = Builder(
            name = "forward-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.505f, 6.711f)
                curveTo(12.505f, 6.12f, 11.241f, 6.84f, 11.241f, 8.002f)
                verticalLineTo(10.248f)
                lineTo(5.265f, 6.711f)
                curveTo(4.265f, 6.12f, 3.001f, 6.84f, 3.001f, 8.002f)
                verticalLineTo(16f)
                curveTo(3.001f, 17.162f, 4.265f, 17.883f, 5.265f, 17.291f)
                lineTo(11.241f, 13.755f)
                verticalLineTo(16f)
                curveTo(11.241f, 17.162f, 12.505f, 17.883f, 13.505f, 17.291f)
                lineTo(20.263f, 13.292f)
                curveTo(21.244f, 12.711f, 21.244f, 11.291f, 20.263f, 10.71f)
                lineTo(13.505f, 6.711f)
                close()
                moveTo(13.241f, 15.123f)
                verticalLineTo(8.879f)
                lineTo(18.517f, 12.001f)
                lineTo(13.241f, 15.123f)
                close()
                moveTo(5.001f, 15.123f)
                verticalLineTo(8.879f)
                lineTo(10.277f, 12.001f)
                lineTo(5.001f, 15.123f)
                close()
            }
        }.build()
        return forward!!
    }

private var forward: ImageVector? = null