package io.github.madmaximuus.persianSymbols.bluetooth.slash

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

val PersianSymbols.Default.BluetoothSlash: ImageVector
    get() {
        if (bluetoothSlash != null) {
            return bluetoothSlash!!
        }
        bluetoothSlash = Builder(
            name = "bluetooth-slash-default",
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
                moveTo(3.7071f, 2.2929f)
                curveTo(3.3166f, 1.9024f, 2.6834f, 1.9024f, 2.2929f, 2.2929f)
                curveTo(1.9024f, 2.6834f, 1.9024f, 3.3166f, 2.2929f, 3.7071f)
                lineTo(20.2929f, 21.7071f)
                curveTo(20.6834f, 22.0976f, 21.3166f, 22.0976f, 21.7071f, 21.7071f)
                curveTo(22.0976f, 21.3166f, 22.0976f, 20.6834f, 21.7071f, 20.2929f)
                lineTo(3.7071f, 2.2929f)
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
                moveTo(6.2929f, 16.2929f)
                lineTo(10.0429f, 12.5429f)
                lineTo(13.0f, 15.5f)
                verticalLineTo(17.5858f)
                lineTo(14.0429f, 16.5429f)
                lineTo(15.4571f, 17.9571f)
                lineTo(12.7071f, 20.7071f)
                curveTo(12.4211f, 20.9931f, 11.991f, 21.0787f, 11.6173f, 20.9239f)
                curveTo(11.2436f, 20.7691f, 11.0f, 20.4045f, 11.0f, 20.0f)
                verticalLineTo(14.4142f)
                lineTo(7.7071f, 17.7071f)
                curveTo(7.3166f, 18.0976f, 6.6834f, 18.0976f, 6.2929f, 17.7071f)
                curveTo(5.9024f, 17.3166f, 5.9024f, 16.6834f, 6.2929f, 16.2929f)
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
                moveTo(11.0f, 8.5f)
                lineTo(13.9571f, 11.4571f)
                lineTo(16.7071f, 8.7071f)
                curveTo(16.9028f, 8.5114f, 17.0087f, 8.2434f, 16.9994f, 7.9667f)
                curveTo(16.9902f, 7.6901f, 16.8668f, 7.4297f, 16.6585f, 7.2474f)
                lineTo(12.6585f, 3.7474f)
                curveTo(12.3632f, 3.4891f, 11.9441f, 3.4272f, 11.5868f, 3.5894f)
                curveTo(11.2295f, 3.7515f, 11.0f, 4.1076f, 11.0f, 4.5f)
                verticalLineTo(8.5f)
                close()
                moveTo(13.0f, 9.5858f)
                verticalLineTo(6.7038f)
                lineTo(14.5371f, 8.0487f)
                lineTo(13.0f, 9.5858f)
                close()
            }
        }.build()
        return bluetoothSlash!!
    }

private var bluetoothSlash: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.BluetoothSlash,
                contentDescription = ""
            )
        }
    }
}