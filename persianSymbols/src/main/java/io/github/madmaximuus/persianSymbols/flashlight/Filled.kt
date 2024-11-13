package io.github.madmaximuus.persianSymbols.flashlight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.Flashlight: ImageVector
    get() {
        if (flashlight != null) {
            return flashlight!!
        }
        flashlight = Builder(
            name = "flashlight-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 2f)
                horizontalLineTo(7f)
                curveTo(6.448f, 2f, 6f, 2.448f, 6f, 3f)
                verticalLineTo(4.25f)
                lineTo(18f, 4.25f)
                verticalLineTo(3f)
                curveTo(18f, 2.448f, 17.552f, 2f, 17f, 2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6f, 6.682f)
                verticalLineTo(5.75f)
                lineTo(18f, 5.75f)
                verticalLineTo(6.682f)
                curveTo(18f, 7.239f, 17.768f, 7.771f, 17.359f, 8.149f)
                lineTo(16.241f, 9.184f)
                curveTo(15.832f, 9.563f, 15.6f, 10.094f, 15.6f, 10.652f)
                verticalLineTo(20f)
                curveTo(15.6f, 21.105f, 14.705f, 22f, 13.6f, 22f)
                horizontalLineTo(10.4f)
                curveTo(9.295f, 22f, 8.4f, 21.105f, 8.4f, 20f)
                verticalLineTo(10.652f)
                curveTo(8.4f, 10.094f, 8.168f, 9.563f, 7.759f, 9.184f)
                lineTo(6.641f, 8.149f)
                curveTo(6.232f, 7.771f, 6f, 7.239f, 6f, 6.682f)
                close()
                moveTo(12.75f, 12f)
                curveTo(12.75f, 11.586f, 12.414f, 11.25f, 12f, 11.25f)
                curveTo(11.586f, 11.25f, 11.25f, 11.586f, 11.25f, 12f)
                verticalLineTo(14f)
                curveTo(11.25f, 14.414f, 11.586f, 14.75f, 12f, 14.75f)
                curveTo(12.414f, 14.75f, 12.75f, 14.414f, 12.75f, 14f)
                verticalLineTo(12f)
                close()
            }
        }.build()
        return flashlight!!
    }

private var flashlight: ImageVector? = null