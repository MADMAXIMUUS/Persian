package io.github.madmaximuus.persianSymbols.camera.video.slash

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
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(3.7071f, 2.2929f)
                curveTo(3.3166f, 1.9024f, 2.6834f, 1.9024f, 2.2929f, 2.2929f)
                curveTo(1.9024f, 2.6834f, 1.9024f, 3.3166f, 2.2929f, 3.7071f)
                lineTo(20.2929f, 21.7071f)
                curveTo(20.6834f, 22.0976f, 21.3166f, 22.0976f, 21.7071f, 21.7071f)
                curveTo(22.0976f, 21.3166f, 22.0976f, 20.6834f, 21.7071f, 20.2929f)
                lineTo(3.7071f, 2.2929f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.0f, 8.4f)
                curveTo(2.0f, 7.3123f, 2.3947f, 6.3167f, 3.0487f, 5.5487f)
                lineTo(16.87f, 19.37f)
                curveTo(16.2073f, 19.7699f, 15.4305f, 20.0f, 14.6f, 20.0f)
                horizontalLineTo(6.4f)
                curveTo(3.9699f, 20.0f, 2.0f, 18.0301f, 2.0f, 15.6f)
                verticalLineTo(8.4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(6.5f, 4.0f)
                lineTo(18.9231f, 16.4231f)
                curveTo(18.9736f, 16.1565f, 19.0f, 15.8813f, 19.0f, 15.6f)
                verticalLineTo(13.25f)
                lineTo(21.1096f, 15.887f)
                curveTo(21.4048f, 16.256f, 22.0f, 16.0472f, 22.0f, 15.5746f)
                verticalLineTo(8.4254f)
                curveTo(22.0f, 7.9528f, 21.4048f, 7.744f, 21.1096f, 8.113f)
                lineTo(19.0f, 10.75f)
                verticalLineTo(8.4f)
                curveTo(19.0f, 5.97f, 17.0301f, 4.0f, 14.6f, 4.0f)
                horizontalLineTo(6.5f)
                close()
            }
        }.build()
        return cameraVideoSlash!!
    }

private var cameraVideoSlash: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.CameraVideoSlash,
                contentDescription = ""
            )
        }
    }
}