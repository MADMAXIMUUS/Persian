package io.github.madmaximuus.persianSymbols.device.laptop.unknown

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

val PersianSymbols.Default.DeviceLaptopUnknown: ImageVector
    get() {
        if (deviceLaptopUnknown != null) {
            return deviceLaptopUnknown!!
        }
        deviceLaptopUnknown = Builder(
            name = "device-laptop-unknown-default",
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
                curveTo(2.0f, 16.6525f, 2.4333f, 17.7039f, 3.1458f, 18.5f)
                horizontalLineTo(2.4f)
                curveTo(2.1791f, 18.5f, 2.0f, 18.6791f, 2.0f, 18.9f)
                verticalLineTo(19.5f)
                curveTo(2.0f, 20.0523f, 2.4477f, 20.5f, 3.0f, 20.5f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 20.5f, 22.0f, 20.0523f, 22.0f, 19.5f)
                verticalLineTo(18.9f)
                curveTo(22.0f, 18.6791f, 21.8209f, 18.5f, 21.6f, 18.5f)
                horizontalLineTo(20.8542f)
                curveTo(21.5667f, 17.7039f, 22.0f, 16.6525f, 22.0f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(22.0f, 6.0147f, 19.9853f, 4.0f, 17.5f, 4.0f)
                horizontalLineTo(6.5f)
                close()
                moveTo(4.0f, 8.5f)
                curveTo(4.0f, 7.1193f, 5.1193f, 6.0f, 6.5f, 6.0f)
                horizontalLineTo(17.5f)
                curveTo(18.8807f, 6.0f, 20.0f, 7.1193f, 20.0f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(20.0f, 16.8807f, 18.8807f, 18.0f, 17.5f, 18.0f)
                horizontalLineTo(6.5f)
                curveTo(5.1193f, 18.0f, 4.0f, 16.8807f, 4.0f, 15.5f)
                verticalLineTo(8.5f)
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
                imageVector = PersianSymbols.Default.DeviceLaptopUnknown,
                contentDescription = ""
            )
        }
    }
}