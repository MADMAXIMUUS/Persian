package io.github.madmaximuus.persianSymbols.volume.slash

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.VolumeSlash: ImageVector
    get() {
        if (volumeSlash != null) {
            return volumeSlash!!
        }
        volumeSlash = Builder(
            name = "volume-slash-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.707f, 2.293f)
                curveTo(3.317f, 1.902f, 2.683f, 1.902f, 2.293f, 2.293f)
                curveTo(1.902f, 2.683f, 1.902f, 3.317f, 2.293f, 3.707f)
                lineTo(20.293f, 21.707f)
                curveTo(20.683f, 22.098f, 21.317f, 22.098f, 21.707f, 21.707f)
                curveTo(22.098f, 21.317f, 22.098f, 20.683f, 21.707f, 20.293f)
                lineTo(3.707f, 2.293f)
                close()
                moveTo(4.5f, 8f)
                horizontalLineTo(5.5f)
                lineTo(7.5f, 10f)
                horizontalLineTo(4.5f)
                curveTo(4.224f, 10f, 4f, 10.224f, 4f, 10.5f)
                verticalLineTo(13.5f)
                curveTo(4f, 13.776f, 4.224f, 14f, 4.5f, 14f)
                horizontalLineTo(8.586f)
                curveTo(9.116f, 14f, 9.625f, 14.211f, 10f, 14.586f)
                lineTo(13f, 17.586f)
                verticalLineTo(15.5f)
                lineTo(15f, 17.5f)
                verticalLineTo(17.586f)
                curveTo(15f, 19.368f, 12.846f, 20.26f, 11.586f, 19f)
                lineTo(8.586f, 16f)
                horizontalLineTo(4.5f)
                curveTo(3.119f, 16f, 2f, 14.881f, 2f, 13.5f)
                verticalLineTo(10.5f)
                curveTo(2f, 9.119f, 3.119f, 8f, 4.5f, 8f)
                close()
                moveTo(9.543f, 7.043f)
                lineTo(10.957f, 8.457f)
                lineTo(13f, 6.414f)
                lineTo(13f, 10.5f)
                lineTo(15f, 12.5f)
                verticalLineTo(6.414f)
                curveTo(15f, 4.632f, 12.846f, 3.74f, 11.586f, 5f)
                lineTo(9.543f, 7.043f)
                close()
                moveTo(16f, 13.5f)
                lineTo(17.748f, 15.248f)
                curveTo(18.527f, 14.383f, 19f, 13.246f, 19f, 12f)
                curveTo(19f, 10.254f, 18.071f, 8.72f, 16.672f, 7.85f)
                curveTo(16.367f, 7.661f, 16f, 7.899f, 16f, 8.258f)
                verticalLineTo(13.5f)
                close()
                moveTo(18.247f, 15.747f)
                lineTo(19.661f, 17.161f)
                curveTo(20.969f, 15.767f, 21.777f, 13.977f, 21.777f, 11.994f)
                curveTo(21.777f, 9.068f, 20.021f, 6.565f, 17.492f, 5.13f)
                curveTo(17.012f, 4.858f, 16.402f, 5.026f, 16.129f, 5.506f)
                curveTo(15.856f, 5.987f, 16.025f, 6.597f, 16.505f, 6.87f)
                curveTo(18.533f, 8.02f, 19.777f, 9.921f, 19.777f, 11.994f)
                curveTo(19.777f, 13.379f, 19.221f, 14.688f, 18.247f, 15.747f)
                close()
            }
        }.build()
        return volumeSlash!!
    }

private var volumeSlash: ImageVector? = null