package io.github.madmaximuus.persianSymbols.file.lock

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.FileLock: ImageVector
    get() {
        if (fileLock != null) {
            return fileLock!!
        }
        fileLock = ImageVector.Builder(
            name = "file-lock-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.788f, 12.656f)
                curveTo(10.732f, 12.917f, 10.71f, 13.185f, 10.705f, 13.425f)
                horizontalLineTo(13.262f)
                curveTo(13.249f, 13.189f, 13.219f, 12.925f, 13.16f, 12.669f)
                curveTo(13.073f, 12.296f, 12.939f, 11.996f, 12.762f, 11.799f)
                curveTo(12.608f, 11.628f, 12.392f, 11.5f, 12.017f, 11.5f)
                curveTo(11.574f, 11.5f, 11.332f, 11.643f, 11.175f, 11.811f)
                curveTo(10.995f, 12.001f, 10.865f, 12.291f, 10.788f, 12.656f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 17.175f)
                curveTo(12.414f, 17.175f, 12.75f, 16.839f, 12.75f, 16.425f)
                curveTo(12.75f, 16.011f, 12.414f, 15.675f, 12f, 15.675f)
                curveTo(11.586f, 15.675f, 11.25f, 16.011f, 11.25f, 16.425f)
                curveTo(11.25f, 16.839f, 11.586f, 17.175f, 12f, 17.175f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.5f, 2f)
                horizontalLineTo(12f)
                verticalLineTo(7f)
                curveTo(12f, 8.519f, 13.231f, 9.75f, 14.75f, 9.75f)
                horizontalLineTo(20f)
                verticalLineTo(18.5f)
                curveTo(20f, 20.433f, 18.433f, 22f, 16.5f, 22f)
                horizontalLineTo(7.5f)
                curveTo(5.567f, 22f, 4f, 20.433f, 4f, 18.5f)
                verticalLineTo(5.5f)
                curveTo(4f, 3.567f, 5.567f, 2f, 7.5f, 2f)
                close()
                moveTo(8f, 14.925f)
                curveTo(8f, 14.198f, 8.518f, 13.591f, 9.205f, 13.454f)
                curveTo(9.208f, 13.13f, 9.236f, 12.741f, 9.321f, 12.344f)
                curveTo(9.429f, 11.834f, 9.644f, 11.249f, 10.082f, 10.783f)
                curveTo(10.541f, 10.295f, 11.188f, 10f, 12.017f, 10f)
                curveTo(12.818f, 10f, 13.438f, 10.309f, 13.875f, 10.794f)
                curveTo(14.29f, 11.254f, 14.505f, 11.829f, 14.621f, 12.331f)
                curveTo(14.713f, 12.732f, 14.752f, 13.124f, 14.765f, 13.448f)
                curveTo(15.467f, 13.573f, 16f, 14.187f, 16f, 14.925f)
                verticalLineTo(17.925f)
                curveTo(16f, 18.753f, 15.328f, 19.425f, 14.5f, 19.425f)
                horizontalLineTo(9.5f)
                curveTo(8.672f, 19.425f, 8f, 18.753f, 8f, 17.925f)
                verticalLineTo(14.925f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.394f, 6.967f)
                curveTo(19.745f, 7.308f, 19.958f, 7.765f, 19.994f, 8.25f)
                horizontalLineTo(14.75f)
                curveTo(14.06f, 8.25f, 13.5f, 7.69f, 13.5f, 7f)
                verticalLineTo(2f)
                curveTo(14.011f, 2.007f, 14.501f, 2.209f, 14.868f, 2.566f)
                lineTo(19.394f, 6.967f)
                close()
            }
        }.build()

        return fileLock!!
    }

private var fileLock: ImageVector? = null