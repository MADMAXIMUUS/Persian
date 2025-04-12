package io.github.madmaximuus.persianSymbols.video

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.Video: ImageVector
    get() {
        if (video != null) {
            return video!!
        }
        video = ImageVector.Builder(
            name = "video-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.4f, 4f)
                curveTo(3.97f, 4f, 2f, 5.97f, 2f, 8.4f)
                verticalLineTo(15.6f)
                curveTo(2f, 18.03f, 3.97f, 20f, 6.4f, 20f)
                horizontalLineTo(13.6f)
                curveTo(15.854f, 20f, 17.713f, 18.305f, 17.97f, 16.119f)
                lineTo(20.292f, 17.203f)
                curveTo(21.088f, 17.574f, 22f, 16.994f, 22f, 16.116f)
                verticalLineTo(7.884f)
                curveTo(22f, 7.006f, 21.088f, 6.426f, 20.292f, 6.797f)
                lineTo(17.97f, 7.881f)
                curveTo(17.713f, 5.695f, 15.854f, 4f, 13.6f, 4f)
                horizontalLineTo(6.4f)
                close()
            }
        }.build()

        return video!!
    }

private var video: ImageVector? = null