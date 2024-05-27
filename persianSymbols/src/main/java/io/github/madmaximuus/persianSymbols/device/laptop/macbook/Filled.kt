package io.github.madmaximuus.persianSymbols.device.laptop.macbook

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

val PersianSymbols.Filled.DeviceLaptopMacbook: ImageVector
    get() {
        if (deviceLaptopMacbook != null) {
            return deviceLaptopMacbook!!
        }
        deviceLaptopMacbook = Builder(
            name = "device-laptop-macbook-filled",
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
                horizontalLineTo(17.6f)
                curveTo(20.0301f, 4.0f, 22.0f, 5.97f, 22.0f, 8.4f)
                verticalLineTo(15.6f)
                curveTo(22.0f, 16.9696f, 21.3742f, 18.193f, 20.393f, 19.0f)
                horizontalLineTo(21.6f)
                curveTo(21.8209f, 19.0f, 22.0f, 19.1791f, 22.0f, 19.4f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 20.5523f, 21.5523f, 21.0f, 21.0f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 21.0f, 2.0f, 20.5523f, 2.0f, 20.0f)
                verticalLineTo(19.4f)
                curveTo(2.0f, 19.1791f, 2.1791f, 19.0f, 2.4f, 19.0f)
                horizontalLineTo(3.607f)
                curveTo(2.6258f, 18.193f, 2.0f, 16.9696f, 2.0f, 15.6f)
                verticalLineTo(8.4f)
                close()
                moveTo(14.645f, 7.0064f)
                curveTo(14.6963f, 7.5468f, 14.4384f, 8.203f, 13.9149f, 8.7264f)
                curveTo(13.3915f, 9.2499f, 12.7353f, 9.5078f, 12.1949f, 9.4565f)
                curveTo(12.1436f, 8.916f, 12.4015f, 8.2599f, 12.925f, 7.7365f)
                curveTo(13.4484f, 7.213f, 14.1045f, 6.955f, 14.645f, 7.0064f)
                close()
                moveTo(11.125f, 16.5247f)
                curveTo(9.7857f, 16.5247f, 8.7f, 13.4757f, 8.7f, 12.1364f)
                curveTo(8.7f, 10.7972f, 9.7857f, 9.7114f, 11.125f, 9.7114f)
                curveTo(11.4305f, 9.7114f, 11.7229f, 9.768f, 11.9922f, 9.8711f)
                curveTo(12.1417f, 9.9284f, 12.3082f, 9.9284f, 12.4578f, 9.8711f)
                curveTo(12.727f, 9.768f, 13.0194f, 9.7114f, 13.325f, 9.7114f)
                curveTo(14.1461f, 9.7114f, 14.872f, 10.1196f, 15.3107f, 10.7441f)
                curveTo(14.6303f, 11.0175f, 14.15f, 11.6834f, 14.15f, 12.4614f)
                curveTo(14.15f, 13.24f, 14.6309f, 13.9063f, 15.312f, 14.1793f)
                curveTo(14.8734f, 15.3762f, 14.1469f, 16.5247f, 13.325f, 16.5247f)
                curveTo(13.0194f, 16.5247f, 12.727f, 16.4682f, 12.4578f, 16.365f)
                curveTo(12.3082f, 16.3078f, 12.1417f, 16.3078f, 11.9922f, 16.365f)
                curveTo(11.7229f, 16.4682f, 11.4305f, 16.5247f, 11.125f, 16.5247f)
                close()
            }
        }.build()
        return deviceLaptopMacbook!!
    }

private var deviceLaptopMacbook: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.DeviceLaptopMacbook,
                contentDescription = ""
            )
        }
    }
}