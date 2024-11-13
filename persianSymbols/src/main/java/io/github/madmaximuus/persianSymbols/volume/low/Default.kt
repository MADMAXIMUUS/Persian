package io.github.madmaximuus.persianSymbols.volume.low

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.VolumeLow: ImageVector
    get() {
        if (volumeLow != null) {
            return volumeLow!!
        }
        volumeLow = Builder(
            name = "volume-low-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15f, 6.414f)
                curveTo(15f, 4.632f, 12.846f, 3.74f, 11.586f, 5f)
                lineTo(8.586f, 8f)
                horizontalLineTo(4.5f)
                curveTo(3.119f, 8f, 2f, 9.119f, 2f, 10.5f)
                verticalLineTo(13.5f)
                curveTo(2f, 14.881f, 3.119f, 16f, 4.5f, 16f)
                horizontalLineTo(8.586f)
                lineTo(11.586f, 19f)
                curveTo(12.846f, 20.26f, 15f, 19.368f, 15f, 17.586f)
                verticalLineTo(6.414f)
                close()
                moveTo(10f, 9.414f)
                lineTo(13f, 6.414f)
                lineTo(13f, 17.586f)
                lineTo(10f, 14.586f)
                curveTo(9.625f, 14.211f, 9.116f, 14f, 8.586f, 14f)
                horizontalLineTo(4.5f)
                curveTo(4.224f, 14f, 4f, 13.776f, 4f, 13.5f)
                verticalLineTo(10.5f)
                curveTo(4f, 10.224f, 4.224f, 10f, 4.5f, 10f)
                horizontalLineTo(8.586f)
                curveTo(9.116f, 10f, 9.625f, 9.789f, 10f, 9.414f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.672f, 16.149f)
                curveTo(16.367f, 16.339f, 16f, 16.1f, 16f, 15.741f)
                verticalLineTo(8.258f)
                curveTo(16f, 7.899f, 16.367f, 7.661f, 16.672f, 7.85f)
                curveTo(18.071f, 8.72f, 19f, 10.254f, 19f, 12f)
                curveTo(19f, 13.746f, 18.071f, 15.279f, 16.672f, 16.149f)
                close()
            }
        }.build()
        return volumeLow!!
    }

private var volumeLow: ImageVector? = null