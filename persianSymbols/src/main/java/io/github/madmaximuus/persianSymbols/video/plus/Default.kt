package io.github.madmaximuus.persianSymbols.video.plus

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.VideoPlus: ImageVector
    get() {
        if (videoPlus != null) {
            return videoPlus!!
        }
        videoPlus = ImageVector.Builder(
            name = "video-plus-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
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
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 8.5f)
                curveTo(2f, 6.015f, 4.015f, 4f, 6.5f, 4f)
                horizontalLineTo(13.5f)
                curveTo(15.674f, 4f, 17.488f, 5.542f, 17.908f, 7.591f)
                lineTo(19.973f, 6.817f)
                curveTo(20.954f, 6.449f, 22f, 7.174f, 22f, 8.222f)
                verticalLineTo(15.778f)
                curveTo(22f, 16.826f, 20.954f, 17.551f, 19.973f, 17.183f)
                lineTo(17.908f, 16.409f)
                curveTo(17.488f, 18.458f, 15.674f, 20f, 13.5f, 20f)
                horizontalLineTo(6.5f)
                curveTo(4.015f, 20f, 2f, 17.985f, 2f, 15.5f)
                verticalLineTo(8.5f)
                close()
                moveTo(18f, 14.307f)
                verticalLineTo(9.693f)
                lineTo(20f, 8.943f)
                verticalLineTo(15.057f)
                lineTo(18f, 14.307f)
                close()
                moveTo(16f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(16f, 16.881f, 14.881f, 18f, 13.5f, 18f)
                horizontalLineTo(6.5f)
                curveTo(5.119f, 18f, 4f, 16.881f, 4f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(4f, 7.119f, 5.119f, 6f, 6.5f, 6f)
                horizontalLineTo(13.5f)
                curveTo(14.881f, 6f, 16f, 7.119f, 16f, 8.5f)
                close()
            }
        }.build()

        return videoPlus!!
    }

private var videoPlus: ImageVector? = null