package io.github.madmaximuus.persianSymbols.powerOnOff

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.PowerOnOff: ImageVector
    get() {
        if (powerOnOff != null) {
            return powerOnOff!!
        }
        powerOnOff = Builder(
            name = "power-on-off-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13f, 3f)
                curveTo(13f, 2.448f, 12.552f, 2f, 12f, 2f)
                curveTo(11.448f, 2f, 11f, 2.448f, 11f, 3f)
                verticalLineTo(13f)
                curveTo(11f, 13.552f, 11.448f, 14f, 12f, 14f)
                curveTo(12.552f, 14f, 13f, 13.552f, 13f, 13f)
                verticalLineTo(3f)
                close()
                moveTo(6.33f, 6.356f)
                curveTo(6.72f, 5.965f, 6.718f, 5.332f, 6.327f, 4.942f)
                curveTo(5.935f, 4.553f, 5.302f, 4.554f, 4.913f, 4.945f)
                curveTo(3.114f, 6.753f, 2f, 9.247f, 2f, 12f)
                curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
                curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
                curveTo(22f, 9.247f, 20.886f, 6.753f, 19.087f, 4.945f)
                curveTo(18.698f, 4.554f, 18.065f, 4.553f, 17.673f, 4.942f)
                curveTo(17.282f, 5.332f, 17.28f, 5.965f, 17.67f, 6.356f)
                curveTo(19.111f, 7.804f, 20f, 9.797f, 20f, 12f)
                curveTo(20f, 16.418f, 16.418f, 20f, 12f, 20f)
                curveTo(7.582f, 20f, 4f, 16.418f, 4f, 12f)
                curveTo(4f, 9.797f, 4.889f, 7.804f, 6.33f, 6.356f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13f, 3f)
                curveTo(13f, 2.448f, 12.552f, 2f, 12f, 2f)
                curveTo(11.448f, 2f, 11f, 2.448f, 11f, 3f)
                verticalLineTo(13f)
                curveTo(11f, 13.552f, 11.448f, 14f, 12f, 14f)
                curveTo(12.552f, 14f, 13f, 13.552f, 13f, 13f)
                verticalLineTo(3f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.33f, 6.356f)
                curveTo(6.72f, 5.965f, 6.718f, 5.332f, 6.327f, 4.942f)
                curveTo(5.935f, 4.553f, 5.302f, 4.554f, 4.913f, 4.945f)
                curveTo(3.114f, 6.753f, 2f, 9.247f, 2f, 12f)
                curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
                curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
                curveTo(22f, 9.247f, 20.886f, 6.753f, 19.087f, 4.945f)
                curveTo(18.698f, 4.554f, 18.065f, 4.553f, 17.673f, 4.942f)
                curveTo(17.282f, 5.332f, 17.28f, 5.965f, 17.67f, 6.356f)
                curveTo(19.111f, 7.804f, 20f, 9.797f, 20f, 12f)
                curveTo(20f, 16.418f, 16.418f, 20f, 12f, 20f)
                curveTo(7.582f, 20f, 4f, 16.418f, 4f, 12f)
                curveTo(4f, 9.797f, 4.889f, 7.804f, 6.33f, 6.356f)
                close()
            }
        }.build()
        return powerOnOff!!
    }

private var powerOnOff: ImageVector? = null