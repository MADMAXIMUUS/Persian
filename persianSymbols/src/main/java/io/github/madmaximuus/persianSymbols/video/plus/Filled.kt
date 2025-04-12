package io.github.madmaximuus.persianSymbols.video.plus

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.VideoPlus: ImageVector
    get() {
        if (videoPlus != null) {
            return videoPlus!!
        }
        videoPlus = ImageVector.Builder(
            name = "video-plus-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 8.4f)
                curveTo(2f, 5.97f, 3.97f, 4f, 6.4f, 4f)
                horizontalLineTo(13.6f)
                curveTo(15.854f, 4f, 17.713f, 5.695f, 17.97f, 7.881f)
                lineTo(20.292f, 6.797f)
                curveTo(21.088f, 6.426f, 22f, 7.006f, 22f, 7.884f)
                verticalLineTo(16.116f)
                curveTo(22f, 16.994f, 21.088f, 17.574f, 20.292f, 17.203f)
                lineTo(17.97f, 16.119f)
                curveTo(17.713f, 18.305f, 15.854f, 20f, 13.6f, 20f)
                horizontalLineTo(6.4f)
                curveTo(3.97f, 20f, 2f, 18.03f, 2f, 15.6f)
                verticalLineTo(8.4f)
                close()
                moveTo(10.769f, 8.5f)
                curveTo(10.769f, 8.086f, 10.433f, 7.75f, 10.019f, 7.75f)
                curveTo(9.604f, 7.75f, 9.269f, 8.086f, 9.269f, 8.5f)
                verticalLineTo(11.306f)
                horizontalLineTo(6.5f)
                curveTo(6.086f, 11.306f, 5.75f, 11.642f, 5.75f, 12.056f)
                curveTo(5.75f, 12.47f, 6.086f, 12.806f, 6.5f, 12.806f)
                horizontalLineTo(9.269f)
                verticalLineTo(15.5f)
                curveTo(9.269f, 15.914f, 9.604f, 16.25f, 10.019f, 16.25f)
                curveTo(10.433f, 16.25f, 10.769f, 15.914f, 10.769f, 15.5f)
                verticalLineTo(12.806f)
                horizontalLineTo(13.5f)
                curveTo(13.914f, 12.806f, 14.25f, 12.47f, 14.25f, 12.056f)
                curveTo(14.25f, 11.642f, 13.914f, 11.306f, 13.5f, 11.306f)
                horizontalLineTo(10.769f)
                verticalLineTo(8.5f)
                close()
            }
        }.build()

        return videoPlus!!
    }

private var videoPlus: ImageVector? = null