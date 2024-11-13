package io.github.madmaximuus.persianSymbols.camera.video

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.CameraVideo: ImageVector
    get() {
        if (cameraVideo != null) {
            return cameraVideo!!
        }
        cameraVideo = Builder(
            name = "camera-video-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5.5f, 4f)
                curveTo(3.567f, 4f, 2f, 5.567f, 2f, 7.5f)
                verticalLineTo(16.5f)
                curveTo(2f, 18.433f, 3.567f, 20f, 5.5f, 20f)
                horizontalLineTo(15.5f)
                curveTo(17.433f, 20f, 19f, 18.433f, 19f, 16.5f)
                verticalLineTo(13.25f)
                lineTo(21.11f, 15.887f)
                curveTo(21.405f, 16.256f, 22f, 16.047f, 22f, 15.575f)
                verticalLineTo(8.425f)
                curveTo(22f, 7.953f, 21.405f, 7.744f, 21.11f, 8.113f)
                lineTo(19f, 10.75f)
                verticalLineTo(7.5f)
                curveTo(19f, 5.567f, 17.433f, 4f, 15.5f, 4f)
                horizontalLineTo(5.5f)
                close()
            }
        }.build()
        return cameraVideo!!
    }

private var cameraVideo: ImageVector? = null