package io.github.madmaximuus.persianSymbols.video.slash

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.VideoSlash: ImageVector
    get() {
        if (videoSlash != null) {
            return videoSlash!!
        }
        videoSlash = ImageVector.Builder(
            name = "video-slash-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
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
                moveTo(2f, 8.5f)
                curveTo(2f, 7.378f, 2.41f, 6.352f, 3.089f, 5.564f)
                lineTo(4.511f, 6.986f)
                curveTo(4.19f, 7.406f, 4f, 7.931f, 4f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(4f, 16.881f, 5.119f, 18f, 6.5f, 18f)
                horizontalLineTo(13.5f)
                curveTo(14.069f, 18f, 14.594f, 17.81f, 15.014f, 17.489f)
                lineTo(16.436f, 18.911f)
                curveTo(15.648f, 19.59f, 14.622f, 20f, 13.5f, 20f)
                horizontalLineTo(6.5f)
                curveTo(4.015f, 20f, 2f, 17.985f, 2f, 15.5f)
                verticalLineTo(8.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16f, 13.525f)
                lineTo(19.469f, 16.994f)
                lineTo(19.973f, 17.183f)
                curveTo(20.954f, 17.551f, 22f, 16.826f, 22f, 15.778f)
                verticalLineTo(8.222f)
                curveTo(22f, 7.174f, 20.954f, 6.449f, 19.973f, 6.817f)
                lineTo(17.908f, 7.591f)
                curveTo(17.488f, 5.542f, 15.674f, 4f, 13.5f, 4f)
                horizontalLineTo(6.5f)
                lineTo(6.475f, 4f)
                lineTo(8.475f, 6f)
                horizontalLineTo(13.5f)
                curveTo(14.881f, 6f, 16f, 7.119f, 16f, 8.5f)
                verticalLineTo(13.525f)
                close()
                moveTo(18f, 9.693f)
                verticalLineTo(14.307f)
                lineTo(20f, 15.057f)
                verticalLineTo(8.943f)
                lineTo(18f, 9.693f)
                close()
            }
        }.build()

        return videoSlash!!
    }

private var videoSlash: ImageVector? = null