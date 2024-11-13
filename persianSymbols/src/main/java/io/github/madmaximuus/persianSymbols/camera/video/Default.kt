package io.github.madmaximuus.persianSymbols.camera.video

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.CameraVideo: ImageVector
    get() {
        if (cameraVideo != null) {
            return cameraVideo!!
        }
        cameraVideo = Builder(
            name = "camera-video-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.5f, 4f)
                curveTo(4.015f, 4f, 2f, 6.015f, 2f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(2f, 17.985f, 4.015f, 20f, 6.5f, 20f)
                horizontalLineTo(14.5f)
                curveTo(16.985f, 20f, 19f, 17.985f, 19f, 15.5f)
                verticalLineTo(13.25f)
                lineTo(21.11f, 15.887f)
                curveTo(21.405f, 16.256f, 22f, 16.047f, 22f, 15.575f)
                verticalLineTo(8.425f)
                curveTo(22f, 7.953f, 21.405f, 7.744f, 21.11f, 8.113f)
                lineTo(19f, 10.75f)
                verticalLineTo(8.5f)
                curveTo(19f, 6.015f, 16.985f, 4f, 14.5f, 4f)
                horizontalLineTo(6.5f)
                close()
                moveTo(4f, 8.5f)
                curveTo(4f, 7.119f, 5.119f, 6f, 6.5f, 6f)
                horizontalLineTo(14.5f)
                curveTo(15.881f, 6f, 17f, 7.119f, 17f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(17f, 16.881f, 15.881f, 18f, 14.5f, 18f)
                horizontalLineTo(6.5f)
                curveTo(5.119f, 18f, 4f, 16.881f, 4f, 15.5f)
                verticalLineTo(8.5f)
                close()
            }
        }.build()
        return cameraVideo!!
    }

private var cameraVideo: ImageVector? = null