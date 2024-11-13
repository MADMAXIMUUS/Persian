package io.github.madmaximuus.persianSymbols.flashlight.slash

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.FlashlightSlash: ImageVector
    get() {
        if (flashlightSlash != null) {
            return flashlightSlash!!
        }
        flashlightSlash = Builder(
            name = "flashlight-slash-default",
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
                moveTo(8f, 10.828f)
                curveTo(8f, 10.681f, 7.968f, 10.538f, 7.907f, 10.407f)
                lineTo(10f, 12.5f)
                verticalLineTo(19f)
                curveTo(10f, 19.552f, 10.448f, 20f, 11f, 20f)
                horizontalLineTo(13f)
                curveTo(13.552f, 20f, 14f, 19.552f, 14f, 19f)
                verticalLineTo(16.5f)
                lineTo(16f, 18.5f)
                verticalLineTo(19f)
                curveTo(16f, 20.657f, 14.657f, 22f, 13f, 22f)
                horizontalLineTo(11f)
                curveTo(9.343f, 22f, 8f, 20.657f, 8f, 19f)
                verticalLineTo(10.828f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.051f, 3.551f)
                lineTo(9.25f, 6.75f)
                horizontalLineTo(16f)
                verticalLineTo(7.172f)
                curveTo(16f, 7.437f, 15.895f, 7.691f, 15.707f, 7.879f)
                lineTo(14.879f, 8.707f)
                curveTo(14.316f, 9.27f, 14f, 10.033f, 14f, 10.828f)
                verticalLineTo(11.5f)
                lineTo(16f, 13.5f)
                verticalLineTo(10.828f)
                curveTo(16f, 10.563f, 16.105f, 10.309f, 16.293f, 10.121f)
                lineTo(17.121f, 9.293f)
                curveTo(17.684f, 8.73f, 18f, 7.967f, 18f, 7.172f)
                verticalLineTo(4f)
                curveTo(18f, 2.895f, 17.105f, 2f, 16f, 2f)
                horizontalLineTo(8f)
                curveTo(7.05f, 2f, 6.255f, 2.662f, 6.051f, 3.551f)
                close()
                moveTo(16f, 4f)
                horizontalLineTo(8f)
                verticalLineTo(5.25f)
                horizontalLineTo(16f)
                verticalLineTo(4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.25f, 14f)
                verticalLineTo(13.75f)
                lineTo(12.218f, 14.718f)
                curveTo(12.149f, 14.739f, 12.076f, 14.75f, 12f, 14.75f)
                curveTo(11.586f, 14.75f, 11.25f, 14.414f, 11.25f, 14f)
                close()
            }
        }.build()
        return flashlightSlash!!
    }

private var flashlightSlash: ImageVector? = null