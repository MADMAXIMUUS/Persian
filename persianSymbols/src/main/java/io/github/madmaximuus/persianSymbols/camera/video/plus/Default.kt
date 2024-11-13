package io.github.madmaximuus.persianSymbols.camera.video.plus

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.CameraVideoPlus: ImageVector
    get() {
        if (cameraVideoPlus != null) {
            return cameraVideoPlus!!
        }
        cameraVideoPlus = Builder(
            name = "camera-video-plus-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.269f, 8.5f)
                curveTo(11.269f, 8.086f, 10.933f, 7.75f, 10.519f, 7.75f)
                curveTo(10.104f, 7.75f, 9.769f, 8.086f, 9.769f, 8.5f)
                verticalLineTo(11.306f)
                horizontalLineTo(7f)
                curveTo(6.586f, 11.306f, 6.25f, 11.642f, 6.25f, 12.056f)
                curveTo(6.25f, 12.47f, 6.586f, 12.806f, 7f, 12.806f)
                horizontalLineTo(9.769f)
                verticalLineTo(15.5f)
                curveTo(9.769f, 15.914f, 10.104f, 16.25f, 10.519f, 16.25f)
                curveTo(10.933f, 16.25f, 11.269f, 15.914f, 11.269f, 15.5f)
                verticalLineTo(12.806f)
                horizontalLineTo(14f)
                curveTo(14.414f, 12.806f, 14.75f, 12.47f, 14.75f, 12.056f)
                curveTo(14.75f, 11.642f, 14.414f, 11.306f, 14f, 11.306f)
                horizontalLineTo(11.269f)
                verticalLineTo(8.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 8.5f)
                curveTo(2f, 6.015f, 4.015f, 4f, 6.5f, 4f)
                horizontalLineTo(14.5f)
                curveTo(16.985f, 4f, 19f, 6.015f, 19f, 8.5f)
                verticalLineTo(10.75f)
                lineTo(21.11f, 8.113f)
                curveTo(21.405f, 7.744f, 22f, 7.953f, 22f, 8.425f)
                verticalLineTo(15.575f)
                curveTo(22f, 16.047f, 21.405f, 16.256f, 21.11f, 15.887f)
                lineTo(19f, 13.25f)
                verticalLineTo(15.5f)
                curveTo(19f, 17.985f, 16.985f, 20f, 14.5f, 20f)
                horizontalLineTo(6.5f)
                curveTo(4.015f, 20f, 2f, 17.985f, 2f, 15.5f)
                verticalLineTo(8.5f)
                close()
                moveTo(6.5f, 6f)
                curveTo(5.119f, 6f, 4f, 7.119f, 4f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(4f, 16.881f, 5.119f, 18f, 6.5f, 18f)
                horizontalLineTo(14.5f)
                curveTo(15.881f, 18f, 17f, 16.881f, 17f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(17f, 7.119f, 15.881f, 6f, 14.5f, 6f)
                horizontalLineTo(6.5f)
                close()
            }
        }.build()
        return cameraVideoPlus!!
    }

private var cameraVideoPlus: ImageVector? = null