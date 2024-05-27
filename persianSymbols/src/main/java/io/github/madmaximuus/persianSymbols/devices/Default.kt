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

val PersianSymbols.Default.Devices: ImageVector
    get() {
        if (devices != null) {
            return devices!!
        }
        devices = Builder(
            name = "devices-default",
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
                moveTo(6.5f, 4.0f)
                curveTo(4.0147f, 4.0f, 2.0f, 6.0147f, 2.0f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(2.0f, 16.9136f, 2.6518f, 18.175f, 3.6713f, 19.0f)
                horizontalLineTo(2.4f)
                curveTo(2.1791f, 19.0f, 2.0f, 19.1791f, 2.0f, 19.4f)
                verticalLineTo(20.0f)
                curveTo(2.0f, 20.5523f, 2.4477f, 21.0f, 3.0f, 21.0f)
                horizontalLineTo(13.1478f)
                curveTo(13.052f, 20.7175f, 13.0f, 20.4148f, 13.0f, 20.1f)
                verticalLineTo(18.0f)
                horizontalLineTo(6.5f)
                curveTo(5.1193f, 18.0f, 4.0f, 16.8807f, 4.0f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(4.0f, 7.1193f, 5.1193f, 6.0f, 6.5f, 6.0f)
                horizontalLineTo(17.5f)
                curveTo(18.6739f, 6.0f, 19.6588f, 6.8091f, 19.9275f, 7.9f)
                horizontalLineTo(20.2f)
                curveTo(20.8854f, 7.9f, 21.5133f, 8.1463f, 22.0f, 8.5552f)
                verticalLineTo(8.5f)
                curveTo(22.0f, 6.0147f, 19.9853f, 4.0f, 17.5f, 4.0f)
                horizontalLineTo(6.5f)
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
                imageVector = PersianSymbols.Default.Devices,
                contentDescription = ""
            )
        }
    }
}