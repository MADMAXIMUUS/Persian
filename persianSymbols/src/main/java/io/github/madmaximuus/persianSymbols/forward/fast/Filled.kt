package io.github.madmaximuus.persianSymbols.forward.fast

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.ForwardFast: ImageVector
    get() {
        if (backwardFast != null) {
            return backwardFast!!
        }
        backwardFast = ImageVector.Builder(
            name = "forward-fast-filled",
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
                verticalLineTo(10.228f)
                lineTo(13.069f, 6.646f)
                curveTo(12.403f, 6.243f, 11.552f, 6.723f, 11.552f, 7.502f)
                lineTo(11.552f, 10.896f)
                lineTo(4.514f, 6.646f)
                curveTo(3.848f, 6.243f, 2.997f, 6.723f, 2.997f, 7.502f)
                verticalLineTo(16.498f)
                curveTo(2.997f, 17.277f, 3.848f, 17.757f, 4.514f, 17.354f)
                lineTo(11.552f, 13.104f)
                verticalLineTo(16.498f)
                curveTo(11.552f, 17.277f, 12.403f, 17.757f, 13.069f, 17.354f)
                lineTo(19f, 13.772f)
                verticalLineTo(17f)
                curveTo(19f, 17.552f, 19.448f, 18f, 20f, 18f)
                curveTo(20.552f, 18f, 21f, 17.552f, 21f, 17f)
                verticalLineTo(12.001f)
                curveTo(21f, 12f, 21f, 12f, 21f, 11.999f)
                verticalLineTo(7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.001f, 7f)
                curveTo(21.001f, 6.448f, 20.554f, 6f, 20.001f, 6f)
                curveTo(19.449f, 6f, 19.001f, 6.448f, 19.001f, 7f)
                verticalLineTo(10.228f)
                lineTo(13.07f, 6.646f)
                curveTo(12.404f, 6.243f, 11.553f, 6.723f, 11.553f, 7.502f)
                verticalLineTo(10.896f)
                lineTo(4.516f, 6.646f)
                curveTo(3.849f, 6.243f, 2.999f, 6.723f, 2.999f, 7.502f)
                verticalLineTo(16.498f)
                curveTo(2.999f, 17.277f, 3.849f, 17.757f, 4.516f, 17.354f)
                lineTo(11.553f, 13.104f)
                verticalLineTo(16.498f)
                curveTo(11.553f, 17.277f, 12.404f, 17.757f, 13.07f, 17.354f)
                lineTo(19.001f, 13.772f)
                verticalLineTo(17f)
                curveTo(19.001f, 17.552f, 19.449f, 18f, 20.001f, 18f)
                curveTo(20.554f, 18f, 21.001f, 17.552f, 21.001f, 17f)
                verticalLineTo(7f)
                close()
            }
        }.build()
        return backwardFast!!
    }

private var backwardFast: ImageVector? = null