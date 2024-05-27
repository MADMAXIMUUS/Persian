package io.github.madmaximuus.persianSymbols.bluetooth.scan

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

val PersianSymbols.Default.BluetoothScan: ImageVector
    get() {
        if (bluetoothScan != null) {
            return bluetoothScan!!
        }
        bluetoothScan = Builder(
            name = "bluetooth-scan-default",
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
                moveTo(10.5868f, 3.5894f)
                curveTo(10.9441f, 3.4272f, 11.3632f, 3.4891f, 11.6585f, 3.7474f)
                lineTo(15.6585f, 7.2474f)
                curveTo(15.8668f, 7.4297f, 15.9902f, 7.6901f, 15.9994f, 7.9667f)
                curveTo(16.0087f, 8.2434f, 15.9028f, 8.5114f, 15.7071f, 8.7071f)
                lineTo(12.4142f, 12.0f)
                lineTo(15.7071f, 15.2929f)
                curveTo(16.0976f, 15.6834f, 16.0976f, 16.3166f, 15.7071f, 16.7071f)
                lineTo(11.7071f, 20.7071f)
                curveTo(11.4211f, 20.9931f, 10.991f, 21.0787f, 10.6173f, 20.9239f)
                curveTo(10.2436f, 20.7691f, 10.0f, 20.4045f, 10.0f, 20.0f)
                verticalLineTo(14.4142f)
                lineTo(6.7071f, 17.7071f)
                curveTo(6.3166f, 18.0976f, 5.6834f, 18.0976f, 5.2929f, 17.7071f)
                curveTo(4.9024f, 17.3166f, 4.9024f, 16.6834f, 5.2929f, 16.2929f)
                lineTo(9.5858f, 12.0f)
                lineTo(5.2929f, 7.7071f)
                curveTo(4.9024f, 7.3166f, 4.9024f, 6.6834f, 5.2929f, 6.2929f)
                curveTo(5.6834f, 5.9024f, 6.3166f, 5.9024f, 6.7071f, 6.2929f)
                lineTo(10.0f, 9.5858f)
                verticalLineTo(4.5f)
                curveTo(10.0f, 4.1076f, 10.2295f, 3.7515f, 10.5868f, 3.5894f)
                close()
                moveTo(12.0f, 14.4142f)
                lineTo(13.5858f, 16.0f)
                lineTo(12.0f, 17.5858f)
                verticalLineTo(14.4142f)
                close()
                moveTo(12.0f, 9.5858f)
                verticalLineTo(6.7038f)
                lineTo(13.5371f, 8.0487f)
                lineTo(12.0f, 9.5858f)
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
                moveTo(15.9092f, 13.9092f)
                curveTo(16.0263f, 14.0264f, 16.2176f, 14.0272f, 16.3225f, 13.899f)
                curveTo(16.5078f, 13.6724f, 16.6592f, 13.4195f, 16.7716f, 13.1481f)
                curveTo(16.9224f, 12.7841f, 17.0f, 12.394f, 17.0f, 12.0f)
                curveTo(17.0f, 11.6061f, 16.9224f, 11.2159f, 16.7716f, 10.852f)
                curveTo(16.6592f, 10.5806f, 16.5078f, 10.3277f, 16.3225f, 10.1011f)
                curveTo(16.2176f, 9.9728f, 16.0263f, 9.9737f, 15.9092f, 10.0908f)
                lineTo(14.2121f, 11.7879f)
                curveTo(14.095f, 11.905f, 14.095f, 12.095f, 14.2121f, 12.2121f)
                lineTo(15.9092f, 13.9092f)
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
                moveTo(19.4876f, 8.6668f)
                curveTo(19.3035f, 8.1461f, 18.7322f, 7.8731f, 18.2115f, 8.0572f)
                curveTo(17.6908f, 8.2412f, 17.4178f, 8.8126f, 17.6019f, 9.3333f)
                curveTo(17.8962f, 10.166f, 18.0568f, 11.0632f, 18.0568f, 12.0f)
                curveTo(18.0568f, 12.9367f, 17.8962f, 13.8339f, 17.6019f, 14.6666f)
                curveTo(17.4178f, 15.1874f, 17.6908f, 15.7587f, 18.2115f, 15.9427f)
                curveTo(18.7322f, 16.1268f, 19.3035f, 15.8538f, 19.4876f, 15.3331f)
                curveTo(19.8565f, 14.2893f, 20.0568f, 13.1669f, 20.0568f, 12.0f)
                curveTo(20.0568f, 10.833f, 19.8565f, 9.7107f, 19.4876f, 8.6668f)
                close()
            }
        }.build()
        return bluetoothScan!!
    }

private var bluetoothScan: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.BluetoothScan,
                contentDescription = ""
            )
        }
    }
}