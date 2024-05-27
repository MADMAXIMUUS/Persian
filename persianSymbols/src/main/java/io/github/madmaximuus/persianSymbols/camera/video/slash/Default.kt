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
                moveTo(2.0f, 8.5f)
                curveTo(2.0f, 7.3846f, 2.4058f, 6.364f, 3.0778f, 5.5778f)
                lineTo(4.4999f, 6.9999f)
                curveTo(4.186f, 7.4177f, 4.0f, 7.9372f, 4.0f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(4.0f, 16.8807f, 5.1193f, 18.0f, 6.5f, 18.0f)
                horizontalLineTo(14.5f)
                curveTo(14.7989f, 18.0f, 15.0856f, 17.9475f, 15.3513f, 17.8513f)
                lineTo(16.8428f, 19.3428f)
                curveTo(16.1604f, 19.7597f, 15.3582f, 20.0f, 14.5f, 20.0f)
                horizontalLineTo(6.5f)
                curveTo(4.0147f, 20.0f, 2.0f, 17.9853f, 2.0f, 15.5f)
                verticalLineTo(8.5f)
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
                lineTo(8.5f, 6.0f)
                horizontalLineTo(14.5f)
                curveTo(15.8807f, 6.0f, 17.0f, 7.1193f, 17.0f, 8.5f)
                verticalLineTo(14.5f)
                lineTo(18.9083f, 16.4083f)
                curveTo(18.9684f, 16.1149f, 19.0f, 15.8111f, 19.0f, 15.5f)
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
                imageVector = PersianSymbols.Default.CameraVideoSlash,
                contentDescription = ""
            )
        }
    }
}