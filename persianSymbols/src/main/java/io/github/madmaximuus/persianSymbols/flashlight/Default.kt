package io.github.madmaximuus.persianSymbols.flashlight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Flashlight: ImageVector
    get() {
        if (flashlight != null) {
            return flashlight!!
        }
        flashlight = Builder(
            name = "flashlight-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.75f, 12f)
                curveTo(12.75f, 11.586f, 12.414f, 11.25f, 12f, 11.25f)
                curveTo(11.586f, 11.25f, 11.25f, 11.586f, 11.25f, 12f)
                verticalLineTo(14f)
                curveTo(11.25f, 14.414f, 11.586f, 14.75f, 12f, 14.75f)
                curveTo(12.414f, 14.75f, 12.75f, 14.414f, 12.75f, 14f)
                verticalLineTo(12f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6f, 4f)
                curveTo(6f, 2.895f, 6.895f, 2f, 8f, 2f)
                horizontalLineTo(16f)
                curveTo(17.105f, 2f, 18f, 2.895f, 18f, 4f)
                verticalLineTo(7.172f)
                curveTo(18f, 7.967f, 17.684f, 8.73f, 17.121f, 9.293f)
                lineTo(16.293f, 10.121f)
                curveTo(16.105f, 10.309f, 16f, 10.563f, 16f, 10.828f)
                verticalLineTo(19f)
                curveTo(16f, 20.657f, 14.657f, 22f, 13f, 22f)
                horizontalLineTo(11f)
                curveTo(9.343f, 22f, 8f, 20.657f, 8f, 19f)
                verticalLineTo(10.828f)
                curveTo(8f, 10.563f, 7.895f, 10.309f, 7.707f, 10.121f)
                lineTo(6.879f, 9.293f)
                curveTo(6.316f, 8.73f, 6f, 7.967f, 6f, 7.172f)
                verticalLineTo(4f)
                close()
                moveTo(16f, 4f)
                horizontalLineTo(8f)
                verticalLineTo(5.25f)
                horizontalLineTo(16f)
                verticalLineTo(4f)
                close()
                moveTo(8f, 7.172f)
                verticalLineTo(6.75f)
                horizontalLineTo(16f)
                verticalLineTo(7.172f)
                curveTo(16f, 7.437f, 15.895f, 7.691f, 15.707f, 7.879f)
                lineTo(14.879f, 8.707f)
                curveTo(14.316f, 9.27f, 14f, 10.033f, 14f, 10.828f)
                verticalLineTo(19f)
                curveTo(14f, 19.552f, 13.552f, 20f, 13f, 20f)
                horizontalLineTo(11f)
                curveTo(10.448f, 20f, 10f, 19.552f, 10f, 19f)
                verticalLineTo(10.828f)
                curveTo(10f, 10.033f, 9.684f, 9.27f, 9.121f, 8.707f)
                lineTo(8.293f, 7.879f)
                curveTo(8.105f, 7.691f, 8f, 7.437f, 8f, 7.172f)
                close()
            }
        }.build()
        return flashlight!!
    }

private var flashlight: ImageVector? = null