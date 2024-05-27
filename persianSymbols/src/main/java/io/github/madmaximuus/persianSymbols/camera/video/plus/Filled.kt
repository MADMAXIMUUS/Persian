package io.github.madmaximuus.persianSymbols.camera.video.plus

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

val PersianSymbols.Filled.CameraVideoPlus: ImageVector
    get() {
        if (cameraVideoPlus != null) {
            return cameraVideoPlus!!
        }
        cameraVideoPlus = Builder(
            name = "camera-video-plus-filled",
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
                moveTo(2.0f, 8.4f)
                curveTo(2.0f, 5.97f, 3.9699f, 4.0f, 6.4f, 4.0f)
                horizontalLineTo(14.6f)
                curveTo(17.0301f, 4.0f, 19.0f, 5.97f, 19.0f, 8.4f)
                verticalLineTo(10.75f)
                lineTo(21.1096f, 8.113f)
                curveTo(21.4048f, 7.744f, 22.0f, 7.9528f, 22.0f, 8.4254f)
                verticalLineTo(15.5746f)
                curveTo(22.0f, 16.0472f, 21.4048f, 16.256f, 21.1096f, 15.887f)
                lineTo(19.0f, 13.25f)
                verticalLineTo(15.6f)
                curveTo(19.0f, 18.0301f, 17.0301f, 20.0f, 14.6f, 20.0f)
                horizontalLineTo(6.4f)
                curveTo(3.9699f, 20.0f, 2.0f, 18.0301f, 2.0f, 15.6f)
                verticalLineTo(8.4f)
                close()
                moveTo(11.5212f, 8.0f)
                curveTo(11.5212f, 7.4477f, 11.0735f, 7.0f, 10.5212f, 7.0f)
                curveTo(9.9689f, 7.0f, 9.5212f, 7.4477f, 9.5212f, 8.0f)
                verticalLineTo(11.0642f)
                horizontalLineTo(6.5f)
                curveTo(5.9477f, 11.0642f, 5.5f, 11.5119f, 5.5f, 12.0642f)
                curveTo(5.5f, 12.6165f, 5.9477f, 13.0642f, 6.5f, 13.0642f)
                horizontalLineTo(9.5212f)
                verticalLineTo(16.0f)
                curveTo(9.5212f, 16.5523f, 9.9689f, 17.0f, 10.5212f, 17.0f)
                curveTo(11.0735f, 17.0f, 11.5212f, 16.5523f, 11.5212f, 16.0f)
                verticalLineTo(13.0642f)
                horizontalLineTo(14.5f)
                curveTo(15.0523f, 13.0642f, 15.5f, 12.6165f, 15.5f, 12.0642f)
                curveTo(15.5f, 11.5119f, 15.0523f, 11.0642f, 14.5f, 11.0642f)
                horizontalLineTo(11.5212f)
                verticalLineTo(8.0f)
                close()
            }
        }.build()
        return cameraVideoPlus!!
    }

private var cameraVideoPlus: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.CameraVideoPlus,
                contentDescription = ""
            )
        }
    }
}