package io.github.madmaximuus.persianSymbols.bluetooth.connected

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

val PersianSymbols.Default.BluetoothConnected: ImageVector
    get() {
        if (bluetoothConnected != null) {
            return bluetoothConnected!!
        }
        bluetoothConnected = Builder(
            name = "bluetooth-connected-default",
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
                moveTo(11.5868f, 3.5894f)
                curveTo(11.9441f, 3.4272f, 12.3632f, 3.4891f, 12.6585f, 3.7474f)
                lineTo(16.6585f, 7.2474f)
                curveTo(16.8668f, 7.4297f, 16.9902f, 7.6901f, 16.9994f, 7.9667f)
                curveTo(17.0087f, 8.2434f, 16.9028f, 8.5114f, 16.7071f, 8.7071f)
                lineTo(13.4142f, 12.0f)
                lineTo(16.7071f, 15.2929f)
                curveTo(17.0976f, 15.6834f, 17.0976f, 16.3166f, 16.7071f, 16.7071f)
                lineTo(12.7071f, 20.7071f)
                curveTo(12.4211f, 20.9931f, 11.991f, 21.0787f, 11.6173f, 20.9239f)
                curveTo(11.2436f, 20.7691f, 11.0f, 20.4045f, 11.0f, 20.0f)
                verticalLineTo(14.4142f)
                lineTo(7.7071f, 17.7071f)
                curveTo(7.3166f, 18.0976f, 6.6834f, 18.0976f, 6.2929f, 17.7071f)
                curveTo(5.9024f, 17.3166f, 5.9024f, 16.6834f, 6.2929f, 16.2929f)
                lineTo(10.5858f, 12.0f)
                lineTo(6.2929f, 7.7071f)
                curveTo(5.9024f, 7.3166f, 5.9024f, 6.6834f, 6.2929f, 6.2929f)
                curveTo(6.6834f, 5.9024f, 7.3166f, 5.9024f, 7.7071f, 6.2929f)
                lineTo(11.0f, 9.5858f)
                verticalLineTo(4.5f)
                curveTo(11.0f, 4.1076f, 11.2295f, 3.7515f, 11.5868f, 3.5894f)
                close()
                moveTo(13.0f, 14.4142f)
                lineTo(14.5858f, 16.0f)
                lineTo(13.0f, 17.5858f)
                verticalLineTo(14.4142f)
                close()
                moveTo(13.0f, 9.5858f)
                verticalLineTo(6.7038f)
                lineTo(14.5371f, 8.0487f)
                lineTo(13.0f, 9.5858f)
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
                moveTo(18.0f, 12.0f)
                curveTo(18.0f, 12.5523f, 17.5523f, 13.0f, 17.0f, 13.0f)
                curveTo(16.4477f, 13.0f, 16.0f, 12.5523f, 16.0f, 12.0f)
                curveTo(16.0f, 11.4477f, 16.4477f, 11.0f, 17.0f, 11.0f)
                curveTo(17.5523f, 11.0f, 18.0f, 11.4477f, 18.0f, 12.0f)
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
                moveTo(7.0f, 11.0f)
                curveTo(6.4477f, 11.0f, 6.0f, 11.4477f, 6.0f, 12.0f)
                curveTo(6.0f, 12.5523f, 6.4477f, 13.0f, 7.0f, 13.0f)
                curveTo(7.5523f, 13.0f, 8.0f, 12.5523f, 8.0f, 12.0f)
                curveTo(8.0f, 11.4477f, 7.5523f, 11.0f, 7.0f, 11.0f)
                close()
            }
        }.build()
        return bluetoothConnected!!
    }

private var bluetoothConnected: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.BluetoothConnected,
                contentDescription = ""
            )
        }
    }
}