package io.github.madmaximuus.persianSymbols.volume.off

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.VolumeOff: ImageVector
    get() {
        if (volumeOff != null) {
            return volumeOff!!
        }
        volumeOff = Builder(
            name = "volume-off-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.586f, 5f)
                curveTo(12.846f, 3.74f, 15f, 4.632f, 15f, 6.414f)
                verticalLineTo(17.586f)
                curveTo(15f, 19.368f, 12.846f, 20.26f, 11.586f, 19f)
                lineTo(8.586f, 16f)
                horizontalLineTo(4.5f)
                curveTo(3.119f, 16f, 2f, 14.881f, 2f, 13.5f)
                verticalLineTo(10.5f)
                curveTo(2f, 9.119f, 3.119f, 8f, 4.5f, 8f)
                horizontalLineTo(8.586f)
                lineTo(11.586f, 5f)
                close()
                moveTo(13f, 6.414f)
                lineTo(10f, 9.414f)
                curveTo(9.625f, 9.789f, 9.116f, 10f, 8.586f, 10f)
                horizontalLineTo(4.5f)
                curveTo(4.224f, 10f, 4f, 10.224f, 4f, 10.5f)
                verticalLineTo(13.5f)
                curveTo(4f, 13.776f, 4.224f, 14f, 4.5f, 14f)
                horizontalLineTo(8.586f)
                curveTo(9.116f, 14f, 9.625f, 14.211f, 10f, 14.586f)
                lineTo(13f, 17.586f)
                lineTo(13f, 6.414f)
                close()
            }
        }.build()
        return volumeOff!!
    }

private var volumeOff: ImageVector? = null