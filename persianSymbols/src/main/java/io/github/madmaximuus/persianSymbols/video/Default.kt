package io.github.madmaximuus.persianSymbols.video

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Video: ImageVector
    get() {
        if (video != null) {
            return video!!
        }
        video = ImageVector.Builder(
            name = "video-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.5f, 4f)
                curveTo(4.015f, 4f, 2f, 6.015f, 2f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(2f, 17.985f, 4.015f, 20f, 6.5f, 20f)
                horizontalLineTo(13.5f)
                curveTo(15.674f, 20f, 17.488f, 18.458f, 17.908f, 16.409f)
                lineTo(19.973f, 17.183f)
                curveTo(20.954f, 17.551f, 22f, 16.826f, 22f, 15.778f)
                verticalLineTo(8.222f)
                curveTo(22f, 7.174f, 20.954f, 6.449f, 19.973f, 6.817f)
                lineTo(17.908f, 7.591f)
                curveTo(17.488f, 5.542f, 15.674f, 4f, 13.5f, 4f)
                horizontalLineTo(6.5f)
                close()
                moveTo(18f, 9.693f)
                verticalLineTo(14.307f)
                lineTo(20f, 15.057f)
                verticalLineTo(8.943f)
                lineTo(18f, 9.693f)
                close()
                moveTo(16f, 8.5f)
                curveTo(16f, 7.119f, 14.881f, 6f, 13.5f, 6f)
                horizontalLineTo(6.5f)
                curveTo(5.119f, 6f, 4f, 7.119f, 4f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(4f, 16.881f, 5.119f, 18f, 6.5f, 18f)
                horizontalLineTo(13.5f)
                curveTo(14.881f, 18f, 16f, 16.881f, 16f, 15.5f)
                verticalLineTo(8.5f)
                close()
            }
        }.build()

        return video!!
    }

private var video: ImageVector? = null