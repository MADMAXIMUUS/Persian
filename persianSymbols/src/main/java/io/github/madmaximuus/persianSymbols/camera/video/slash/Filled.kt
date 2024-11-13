package io.github.madmaximuus.persianSymbols.camera.video.slash

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.CameraVideoSlash: ImageVector
    get() {
        if (cameraVideoSlash != null) {
            return cameraVideoSlash!!
        }
        cameraVideoSlash = Builder(
            name = "camera-video-slash-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
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
                curveTo(2f, 7.312f, 2.395f, 6.317f, 3.049f, 5.549f)
                lineTo(16.87f, 19.37f)
                curveTo(16.207f, 19.77f, 15.431f, 20f, 14.6f, 20f)
                horizontalLineTo(6.4f)
                curveTo(3.97f, 20f, 2f, 18.03f, 2f, 15.6f)
                verticalLineTo(8.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.5f, 4f)
                lineTo(18.923f, 16.423f)
                curveTo(18.974f, 16.156f, 19f, 15.881f, 19f, 15.6f)
                verticalLineTo(13.25f)
                lineTo(21.11f, 15.887f)
                curveTo(21.405f, 16.256f, 22f, 16.047f, 22f, 15.575f)
                verticalLineTo(8.425f)
                curveTo(22f, 7.953f, 21.405f, 7.744f, 21.11f, 8.113f)
                lineTo(19f, 10.75f)
                verticalLineTo(8.4f)
                curveTo(19f, 5.97f, 17.03f, 4f, 14.6f, 4f)
                horizontalLineTo(6.5f)
                close()
            }
        }.build()
        return cameraVideoSlash!!
    }

private var cameraVideoSlash: ImageVector? = null