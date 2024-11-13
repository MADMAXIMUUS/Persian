package io.github.madmaximuus.persianSymbols.camera.video.slash

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.CameraVideoSlash: ImageVector
    get() {
        if (cameraVideoSlash != null) {
            return cameraVideoSlash!!
        }
        cameraVideoSlash = Builder(
            name = "camera-video-slash-default",
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
                moveTo(2f, 8.5f)
                curveTo(2f, 7.385f, 2.406f, 6.364f, 3.078f, 5.578f)
                lineTo(4.5f, 7f)
                curveTo(4.186f, 7.418f, 4f, 7.937f, 4f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(4f, 16.881f, 5.119f, 18f, 6.5f, 18f)
                horizontalLineTo(14.5f)
                curveTo(14.799f, 18f, 15.086f, 17.948f, 15.351f, 17.851f)
                lineTo(16.843f, 19.343f)
                curveTo(16.16f, 19.76f, 15.358f, 20f, 14.5f, 20f)
                horizontalLineTo(6.5f)
                curveTo(4.015f, 20f, 2f, 17.985f, 2f, 15.5f)
                verticalLineTo(8.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.5f, 4f)
                lineTo(8.5f, 6f)
                horizontalLineTo(14.5f)
                curveTo(15.881f, 6f, 17f, 7.119f, 17f, 8.5f)
                verticalLineTo(14.5f)
                lineTo(18.908f, 16.408f)
                curveTo(18.968f, 16.115f, 19f, 15.811f, 19f, 15.5f)
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
            }
        }.build()
        return cameraVideoSlash!!
    }

private var cameraVideoSlash: ImageVector? = null