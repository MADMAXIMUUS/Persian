package io.github.madmaximuus.persianSymbols.camera.base

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

val PersianSymbols.Filled.Camera: ImageVector
    get() {
        if (camera != null) {
            return camera!!
        }
        camera = Builder(
            name = "camera-filled",
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
                moveTo(9.0f, 12.0f)
                curveTo(9.0f, 10.3431f, 10.3431f, 9.0f, 12.0f, 9.0f)
                curveTo(13.6569f, 9.0f, 15.0f, 10.3431f, 15.0f, 12.0f)
                curveTo(15.0f, 13.6569f, 13.6569f, 15.0f, 12.0f, 15.0f)
                curveTo(10.3431f, 15.0f, 9.0f, 13.6569f, 9.0f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(6.1696f, 4.25f)
                curveTo(3.8668f, 4.25f, 2.0f, 6.1168f, 2.0f, 8.4196f)
                verticalLineTo(15.6f)
                curveTo(2.0f, 18.0301f, 3.9699f, 20.0f, 6.4f, 20.0f)
                horizontalLineTo(17.6f)
                curveTo(20.0301f, 20.0f, 22.0f, 18.0301f, 22.0f, 15.6f)
                verticalLineTo(8.4196f)
                curveTo(22.0f, 6.1168f, 20.1332f, 4.25f, 17.8304f, 4.25f)
                curveTo(16.9436f, 4.25f, 16.0937f, 3.8949f, 15.4706f, 3.2639f)
                lineTo(14.8095f, 2.5946f)
                curveTo(14.4337f, 2.2141f, 13.9212f, 2.0f, 13.3865f, 2.0f)
                horizontalLineTo(10.6135f)
                curveTo(10.0788f, 2.0f, 9.5663f, 2.2141f, 9.1905f, 2.5946f)
                lineTo(8.5295f, 3.2639f)
                curveTo(7.9063f, 3.8949f, 7.0564f, 4.25f, 6.1696f, 4.25f)
                close()
                moveTo(12.0f, 7.0f)
                curveTo(9.2386f, 7.0f, 7.0f, 9.2386f, 7.0f, 12.0f)
                curveTo(7.0f, 14.7614f, 9.2386f, 17.0f, 12.0f, 17.0f)
                curveTo(14.7614f, 17.0f, 17.0f, 14.7614f, 17.0f, 12.0f)
                curveTo(17.0f, 9.2386f, 14.7614f, 7.0f, 12.0f, 7.0f)
                close()
            }
        }.build()
        return camera!!
    }

private var camera: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.Camera,
                contentDescription = ""
            )
        }
    }
}