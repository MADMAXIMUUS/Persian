package io.github.madmaximuus.persianSymbols.forward.fast

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.ForwardFast: ImageVector
    get() {
        if (forwardFast != null) {
            return forwardFast!!
        }
        forwardFast = ImageVector.Builder(
            name = "forward-fast-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(21f, 7f)
                curveTo(21f, 6.448f, 20.552f, 6f, 20f, 6f)
                curveTo(19.448f, 6f, 19f, 6.448f, 19f, 7f)
                verticalLineTo(9.964f)
                lineTo(13.504f, 6.711f)
                curveTo(12.504f, 6.12f, 11.24f, 6.84f, 11.24f, 8.002f)
                verticalLineTo(10.248f)
                lineTo(5.264f, 6.711f)
                curveTo(4.264f, 6.12f, 3f, 6.84f, 3f, 8.002f)
                verticalLineTo(16f)
                curveTo(3f, 17.162f, 4.264f, 17.883f, 5.264f, 17.291f)
                lineTo(11.24f, 13.755f)
                verticalLineTo(16f)
                curveTo(11.24f, 17.162f, 12.504f, 17.883f, 13.504f, 17.291f)
                lineTo(19f, 14.039f)
                verticalLineTo(17f)
                curveTo(19f, 17.552f, 19.448f, 18f, 20f, 18f)
                curveTo(20.552f, 18f, 21f, 17.552f, 21f, 17f)
                verticalLineTo(7f)
                close()
                moveTo(13.24f, 15.123f)
                lineTo(18.516f, 12.001f)
                lineTo(13.24f, 8.879f)
                verticalLineTo(15.123f)
                close()
                moveTo(5f, 15.123f)
                lineTo(10.276f, 12.001f)
                lineTo(5f, 8.879f)
                verticalLineTo(15.123f)
                close()
            }
        }.build()
        return forwardFast!!
    }

private var forwardFast: ImageVector? = null