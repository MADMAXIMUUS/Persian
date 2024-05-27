package io.github.madmaximuus.persianSymbols.camera.video.base

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
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
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(6.5f, 4.0f)
                curveTo(4.0147f, 4.0f, 2.0f, 6.0147f, 2.0f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(2.0f, 17.9853f, 4.0147f, 20.0f, 6.5f, 20.0f)
                horizontalLineTo(14.5f)
                curveTo(16.9853f, 20.0f, 19.0f, 17.9853f, 19.0f, 15.5f)
                verticalLineTo(13.25f)
                lineTo(21.1096f, 15.887f)
                curveTo(21.4048f, 16.256f, 22.0f, 16.0472f, 22.0f, 15.5746f)
                verticalLineTo(8.4254f)
                curveTo(22.0f, 7.9528f, 21.4048f, 7.744f, 21.1096f, 8.113f)
                lineTo(19.0f, 10.75f)
                verticalLineTo(8.5f)
                curveTo(19.0f, 6.0147f, 16.9853f, 4.0f, 14.5f, 4.0f)
                horizontalLineTo(6.5f)
                close()
                moveTo(4.0f, 8.5f)
                curveTo(4.0f, 7.1193f, 5.1193f, 6.0f, 6.5f, 6.0f)
                horizontalLineTo(14.5f)
                curveTo(15.8807f, 6.0f, 17.0f, 7.1193f, 17.0f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(17.0f, 16.8807f, 15.8807f, 18.0f, 14.5f, 18.0f)
                horizontalLineTo(6.5f)
                curveTo(5.1193f, 18.0f, 4.0f, 16.8807f, 4.0f, 15.5f)
                verticalLineTo(8.5f)
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
                imageVector = PersianSymbols.Default.CameraVideo,
                contentDescription = ""
            )
        }
    }
}