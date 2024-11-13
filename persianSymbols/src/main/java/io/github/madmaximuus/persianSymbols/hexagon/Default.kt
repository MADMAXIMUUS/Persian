package io.github.madmaximuus.persianSymbols.hexagon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Hexagon: ImageVector
    get() {
        if (hexagon != null) {
            return hexagon!!
        }
        hexagon = ImageVector.Builder(
            name = "hexagon-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.267f, 4.007f)
                curveTo(6.623f, 3.384f, 7.286f, 3f, 8.003f, 3f)
                horizontalLineTo(15.994f)
                curveTo(16.711f, 3f, 17.374f, 3.384f, 17.73f, 4.007f)
                lineTo(21.733f, 11.007f)
                curveTo(22.085f, 11.622f, 22.085f, 12.378f, 21.733f, 12.993f)
                lineTo(17.73f, 19.993f)
                curveTo(17.374f, 20.616f, 16.711f, 21f, 15.994f, 21f)
                horizontalLineTo(8.003f)
                curveTo(7.286f, 21f, 6.623f, 20.616f, 6.267f, 19.993f)
                lineTo(2.264f, 12.993f)
                curveTo(1.912f, 12.378f, 1.912f, 11.622f, 2.264f, 11.007f)
                lineTo(6.267f, 4.007f)
                close()
                moveTo(16.282f, 5.504f)
                curveTo(16.104f, 5.192f, 15.772f, 5f, 15.414f, 5f)
                lineTo(8.583f, 5f)
                curveTo(8.225f, 5f, 7.893f, 5.192f, 7.715f, 5.504f)
                lineTo(4.284f, 11.503f)
                curveTo(4.108f, 11.811f, 4.108f, 12.189f, 4.284f, 12.497f)
                lineTo(7.715f, 18.497f)
                curveTo(7.893f, 18.808f, 8.225f, 19f, 8.583f, 19f)
                horizontalLineTo(15.414f)
                curveTo(15.772f, 19f, 16.104f, 18.808f, 16.282f, 18.497f)
                lineTo(19.713f, 12.497f)
                curveTo(19.889f, 12.189f, 19.889f, 11.811f, 19.713f, 11.503f)
                lineTo(16.282f, 5.504f)
                close()
            }
        }.build()

        return hexagon!!
    }

private var hexagon: ImageVector? = null
