package io.github.madmaximuus.persianSymbols.camera.video.base

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
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
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(5.5f, 4.0f)
                curveTo(3.567f, 4.0f, 2.0f, 5.567f, 2.0f, 7.5f)
                verticalLineTo(16.5f)
                curveTo(2.0f, 18.433f, 3.567f, 20.0f, 5.5f, 20.0f)
                horizontalLineTo(15.5f)
                curveTo(17.433f, 20.0f, 19.0f, 18.433f, 19.0f, 16.5f)
                verticalLineTo(13.25f)
                lineTo(21.1096f, 15.887f)
                curveTo(21.4048f, 16.256f, 22.0f, 16.0472f, 22.0f, 15.5746f)
                verticalLineTo(8.4254f)
                curveTo(22.0f, 7.9528f, 21.4048f, 7.744f, 21.1096f, 8.113f)
                lineTo(19.0f, 10.75f)
                verticalLineTo(7.5f)
                curveTo(19.0f, 5.567f, 17.433f, 4.0f, 15.5f, 4.0f)
                horizontalLineTo(5.5f)
                close()
            }
        }.build()
        return cameraVideo!!
    }

private var cameraVideo: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.CameraVideo,
                contentDescription = ""
            )
        }
    }
}