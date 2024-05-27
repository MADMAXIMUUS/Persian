package io.github.madmaximuus.persianSymbols.devices

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

val PersianSymbols.Filled.Devices: ImageVector
    get() {
        if (devices != null) {
            return devices!!
        }
        devices = Builder(
            name = "devices-filled",
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
                moveTo(6.4f, 4.0f)
                curveTo(3.9699f, 4.0f, 2.0f, 5.97f, 2.0f, 8.4f)
                verticalLineTo(15.6f)
                curveTo(2.0f, 16.9696f, 2.6258f, 18.193f, 3.607f, 19.0f)
                horizontalLineTo(2.4f)
                curveTo(2.1791f, 19.0f, 2.0f, 19.1791f, 2.0f, 19.4f)
                verticalLineTo(20.0f)
                curveTo(2.0f, 20.5523f, 2.4477f, 21.0f, 3.0f, 21.0f)
                horizontalLineTo(13.1478f)
                curveTo(13.052f, 20.7176f, 13.0f, 20.4149f, 13.0f, 20.1f)
                verticalLineTo(10.7f)
                curveTo(13.0f, 9.1536f, 14.2536f, 7.9f, 15.8f, 7.9f)
                horizontalLineTo(20.2f)
                curveTo(20.8854f, 7.9f, 21.5133f, 8.1463f, 22.0f, 8.5552f)
                verticalLineTo(8.4f)
                curveTo(22.0f, 5.97f, 20.0301f, 4.0f, 17.6f, 4.0f)
                horizontalLineTo(6.4f)
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
                moveTo(14.0f, 10.85f)
                curveTo(14.0f, 9.7179f, 14.9178f, 8.8f, 16.05f, 8.8f)
                horizontalLineTo(19.95f)
                curveTo(21.0822f, 8.8f, 22.0f, 9.7179f, 22.0f, 10.85f)
                verticalLineTo(19.9501f)
                curveTo(22.0f, 21.0822f, 21.0822f, 22.0f, 19.95f, 22.0f)
                horizontalLineTo(16.05f)
                curveTo(14.9178f, 22.0f, 14.0f, 21.0822f, 14.0f, 19.95f)
                verticalLineTo(10.85f)
                close()
                moveTo(20.5f, 10.85f)
                verticalLineTo(11.3f)
                horizontalLineTo(15.5f)
                verticalLineTo(10.85f)
                curveTo(15.5f, 10.5463f, 15.7462f, 10.3f, 16.05f, 10.3f)
                horizontalLineTo(19.95f)
                curveTo(20.2538f, 10.3f, 20.5f, 10.5463f, 20.5f, 10.85f)
                close()
                moveTo(15.5f, 19.95f)
                verticalLineTo(12.8f)
                horizontalLineTo(20.5f)
                verticalLineTo(19.9501f)
                curveTo(20.5f, 20.2538f, 20.2538f, 20.5f, 19.95f, 20.5f)
                horizontalLineTo(16.05f)
                curveTo(15.7462f, 20.5f, 15.5f, 20.2538f, 15.5f, 19.95f)
                close()
            }
        }.build()
        return devices!!
    }

private var devices: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.Devices,
                contentDescription = ""
            )
        }
    }
}