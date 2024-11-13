package io.github.madmaximuus.persianSymbols.volume.high

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.VolumeHigh: ImageVector
    get() {
        if (volumeHigh != null) {
            return volumeHigh!!
        }
        volumeHigh = Builder(
            name = "volume-high-default",
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
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 15.741f)
                curveTo(16f, 16.1f, 16.367f, 16.339f, 16.672f, 16.149f)
                curveTo(18.071f, 15.279f, 19f, 13.746f, 19f, 12f)
                curveTo(19f, 10.254f, 18.071f, 8.72f, 16.672f, 7.85f)
                curveTo(16.367f, 7.661f, 16f, 7.899f, 16f, 8.258f)
                verticalLineTo(15.741f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.492f, 5.13f)
                curveTo(17.012f, 4.858f, 16.402f, 5.026f, 16.129f, 5.506f)
                curveTo(15.856f, 5.987f, 16.025f, 6.597f, 16.505f, 6.87f)
                curveTo(18.533f, 8.02f, 19.777f, 9.921f, 19.777f, 11.994f)
                curveTo(19.777f, 14.073f, 18.525f, 15.979f, 16.486f, 17.129f)
                curveTo(16.005f, 17.4f, 15.834f, 18.01f, 16.106f, 18.491f)
                curveTo(16.377f, 18.972f, 16.987f, 19.142f, 17.468f, 18.871f)
                curveTo(20.01f, 17.438f, 21.777f, 14.929f, 21.777f, 11.994f)
                curveTo(21.777f, 9.068f, 20.021f, 6.565f, 17.492f, 5.13f)
                close()
            }
        }.build()
        return volumeHigh!!
    }

private var volumeHigh: ImageVector? = null