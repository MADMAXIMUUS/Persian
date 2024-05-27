package io.github.madmaximuus.persianSymbols.battery.question

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

val PersianSymbols.Filled.BatteryQuestion: ImageVector
    get() {
        if (batteryQuestion != null) {
            return batteryQuestion!!
        }
        batteryQuestion = Builder(
            name = "battery-question-filled",
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
                moveTo(9.9999f, 3.0001f)
                curveTo(9.9999f, 2.4478f, 10.4476f, 2.0001f, 10.9999f, 2.0001f)
                horizontalLineTo(12.9999f)
                curveTo(13.5522f, 2.0001f, 13.9999f, 2.4478f, 13.9999f, 3.0001f)
                verticalLineTo(4.0001f)
                horizontalLineTo(14.9999f)
                curveTo(16.6567f, 4.0001f, 17.9999f, 5.3432f, 17.9999f, 7.0001f)
                verticalLineTo(19.0001f)
                curveTo(17.9999f, 20.6569f, 16.6567f, 22.0001f, 14.9999f, 22.0001f)
                horizontalLineTo(8.9999f)
                curveTo(7.343f, 22.0001f, 5.9999f, 20.6569f, 5.9999f, 19.0001f)
                verticalLineTo(7.0001f)
                curveTo(5.9999f, 5.3432f, 7.343f, 4.0001f, 8.9999f, 4.0001f)
                horizontalLineTo(9.9999f)
                verticalLineTo(3.0001f)
                close()
                moveTo(11.8733f, 14.1494f)
                curveTo(12.193f, 14.1494f, 12.4419f, 13.8887f, 12.5146f, 13.5774f)
                curveTo(12.5277f, 13.5213f, 12.5428f, 13.467f, 12.5599f, 13.4145f)
                curveTo(12.6297f, 13.1968f, 12.7622f, 12.9954f, 12.9576f, 12.8103f)
                curveTo(13.1843f, 12.5889f, 13.3953f, 12.3675f, 13.5907f, 12.1462f)
                curveTo(13.786f, 11.9212f, 13.9448f, 11.6798f, 14.0669f, 11.4222f)
                curveTo(14.189f, 11.1609f, 14.25f, 10.8706f, 14.25f, 10.5512f)
                curveTo(14.25f, 10.1085f, 14.161f, 9.7311f, 13.9831f, 9.419f)
                curveTo(13.8087f, 9.1032f, 13.5558f, 8.8637f, 13.2244f, 8.7004f)
                curveTo(12.893f, 8.5335f, 12.4936f, 8.45f, 12.0262f, 8.45f)
                curveTo(11.6041f, 8.45f, 11.2221f, 8.528f, 10.8802f, 8.6841f)
                curveTo(10.5384f, 8.8401f, 10.2663f, 9.0742f, 10.064f, 9.3863f)
                curveTo(9.9638f, 9.5408f, 9.8876f, 9.7131f, 9.8353f, 9.9032f)
                curveTo(9.7413f, 10.2449f, 10.0466f, 10.5403f, 10.401f, 10.5403f)
                curveTo(10.7374f, 10.5403f, 10.9797f, 10.2455f, 11.1628f, 9.9633f)
                curveTo(11.257f, 9.8145f, 11.3808f, 9.7057f, 11.5343f, 9.6367f)
                curveTo(11.6878f, 9.5641f, 11.8517f, 9.5278f, 12.0262f, 9.5278f)
                curveTo(12.2355f, 9.5278f, 12.4099f, 9.5696f, 12.5494f, 9.653f)
                curveTo(12.6924f, 9.7365f, 12.8006f, 9.8581f, 12.8738f, 10.0178f)
                curveTo(12.9471f, 10.1774f, 12.9837f, 10.3716f, 12.9837f, 10.6002f)
                curveTo(12.9837f, 10.8107f, 12.9453f, 10.9976f, 12.8686f, 11.1609f)
                curveTo(12.7919f, 11.3206f, 12.689f, 11.473f, 12.5599f, 11.6182f)
                curveTo(12.4308f, 11.7597f, 12.286f, 11.9103f, 12.1256f, 12.07f)
                curveTo(11.9198f, 12.2805f, 11.7541f, 12.48f, 11.6285f, 12.6688f)
                curveTo(11.5064f, 12.8575f, 11.4192f, 13.068f, 11.3669f, 13.3002f)
                curveTo(11.3485f, 13.3804f, 11.3332f, 13.4672f, 11.3208f, 13.5608f)
                curveTo(11.2783f, 13.8829f, 11.5483f, 14.1494f, 11.8733f, 14.1494f)
                close()
                moveTo(11.3721f, 15.3524f)
                curveTo(11.243f, 15.4867f, 11.1785f, 15.6518f, 11.1785f, 15.8478f)
                curveTo(11.1785f, 16.0438f, 11.243f, 16.2107f, 11.3721f, 16.3486f)
                curveTo(11.5012f, 16.4829f, 11.6773f, 16.55f, 11.9006f, 16.55f)
                curveTo(12.1238f, 16.55f, 12.3f, 16.4829f, 12.4291f, 16.3486f)
                curveTo(12.5581f, 16.2107f, 12.6227f, 16.0438f, 12.6227f, 15.8478f)
                curveTo(12.6227f, 15.6518f, 12.5581f, 15.4867f, 12.4291f, 15.3524f)
                curveTo(12.3f, 15.2145f, 12.1238f, 15.1456f, 11.9006f, 15.1456f)
                curveTo(11.6773f, 15.1456f, 11.5012f, 15.2145f, 11.3721f, 15.3524f)
                close()
            }
        }.build()
        return batteryQuestion!!
    }

private var batteryQuestion: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.BatteryQuestion,
                contentDescription = ""
            )
        }
    }
}