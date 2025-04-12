package io.github.madmaximuus.persianSymbols.video.slash

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.VideoSlash: ImageVector
    get() {
        if (videoSlash != null) {
            return videoSlash!!
        }
        videoSlash = ImageVector.Builder(
            name = "video-slash-filled",
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
                moveTo(2f, 8.4f)
                curveTo(2f, 7.306f, 2.399f, 6.305f, 3.06f, 5.535f)
                lineTo(16.465f, 18.94f)
                curveTo(15.695f, 19.601f, 14.694f, 20f, 13.6f, 20f)
                horizontalLineTo(6.4f)
                curveTo(3.97f, 20f, 2f, 18.03f, 2f, 15.6f)
                verticalLineTo(8.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.292f, 17.203f)
                lineTo(19.14f, 16.666f)
                lineTo(6.475f, 4f)
                horizontalLineTo(13.6f)
                curveTo(15.854f, 4f, 17.713f, 5.695f, 17.97f, 7.881f)
                lineTo(20.292f, 6.797f)
                curveTo(21.088f, 6.426f, 22f, 7.006f, 22f, 7.884f)
                verticalLineTo(16.116f)
                curveTo(22f, 16.994f, 21.088f, 17.574f, 20.292f, 17.203f)
                close()
            }
        }.build()

        return videoSlash!!
    }

private var videoSlash: ImageVector? = null