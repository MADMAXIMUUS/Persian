package io.github.madmaximuus.persianSymbols.device.laptop.unknown

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

val PersianSymbols.Filled.DeviceLaptopUnknown: ImageVector
    get() {
        if (deviceLaptopUnknown != null) {
            return deviceLaptopUnknown!!
        }
        deviceLaptopUnknown = Builder(
            name = "device-laptop-unknown-filled",
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
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 21.0f, 22.0f, 20.5523f, 22.0f, 20.0f)
                verticalLineTo(19.4f)
                curveTo(22.0f, 19.1791f, 21.8209f, 19.0f, 21.6f, 19.0f)
                horizontalLineTo(20.393f)
                curveTo(21.3742f, 18.193f, 22.0f, 16.9696f, 22.0f, 15.6f)
                verticalLineTo(8.4f)
                curveTo(22.0f, 5.97f, 20.0301f, 4.0f, 17.6f, 4.0f)
                horizontalLineTo(6.4f)
                close()
            }
        }.build()
        return deviceLaptopUnknown!!
    }

private var deviceLaptopUnknown: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.DeviceLaptopUnknown,
                contentDescription = ""
            )
        }
    }
}