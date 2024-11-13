package io.github.madmaximuus.persianSymbols.flashlight.slash

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.FlashlightSlash: ImageVector
    get() {
        if (flashlightSlash != null) {
            return flashlightSlash!!
        }
        flashlightSlash = Builder(
            name = "flashlight-slash-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.707f, 2.293f)
                curveTo(3.317f, 1.902f, 2.683f, 1.902f, 2.293f, 2.293f)
                curveTo(1.902f, 2.683f, 1.902f, 3.317f, 2.293f, 3.707f)
                lineTo(20.293f, 21.707f)
                curveTo(20.683f, 22.098f, 21.317f, 22.098f, 21.707f, 21.707f)
                curveTo(22.098f, 21.317f, 22.098f, 20.683f, 21.707f, 20.293f)
                lineTo(3.707f, 2.293f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6f, 3.5f)
                lineTo(6.75f, 4.25f)
                lineTo(18f, 4.25f)
                verticalLineTo(3f)
                curveTo(18f, 2.448f, 17.552f, 2f, 17f, 2f)
                horizontalLineTo(7f)
                curveTo(6.448f, 2f, 6f, 2.448f, 6f, 3f)
                verticalLineTo(3.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.4f, 20f)
                verticalLineTo(10.9f)
                lineTo(11.25f, 13.75f)
                verticalLineTo(14f)
                curveTo(11.25f, 14.414f, 11.586f, 14.75f, 12f, 14.75f)
                curveTo(12.076f, 14.75f, 12.149f, 14.739f, 12.218f, 14.718f)
                lineTo(15.6f, 18.1f)
                verticalLineTo(20f)
                curveTo(15.6f, 21.105f, 14.705f, 22f, 13.6f, 22f)
                horizontalLineTo(10.4f)
                curveTo(9.295f, 22f, 8.4f, 21.105f, 8.4f, 20f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.25f, 5.75f)
                lineTo(15.6f, 13.1f)
                verticalLineTo(10.652f)
                curveTo(15.6f, 10.094f, 15.832f, 9.563f, 16.241f, 9.184f)
                lineTo(17.359f, 8.149f)
                curveTo(17.768f, 7.771f, 18f, 7.239f, 18f, 6.682f)
                verticalLineTo(5.75f)
                lineTo(8.25f, 5.75f)
                close()
            }
        }.build()
        return flashlightSlash!!
    }

private var flashlightSlash: ImageVector? = null