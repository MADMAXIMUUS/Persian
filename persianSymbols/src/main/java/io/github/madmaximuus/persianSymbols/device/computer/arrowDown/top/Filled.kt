package io.github.madmaximuus.persianSymbols.device.computer.arrowDown.top

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

val PersianSymbols.Filled.DeviceComputerArrowDownTop: ImageVector
    get() {
        if (deviceComputerArrowDownTop != null) {
            return deviceComputerArrowDownTop!!
        }
        deviceComputerArrowDownTop = Builder(
            name = "device-computer-arrow-down-top-filled",
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
                moveTo(19.5303f, 5.9697f)
                curveTo(19.8232f, 6.2626f, 19.8232f, 6.7374f, 19.5303f, 7.0303f)
                lineTo(18.5303f, 8.0303f)
                curveTo(18.2374f, 8.3232f, 17.7626f, 8.3232f, 17.4697f, 8.0303f)
                lineTo(16.4697f, 7.0303f)
                curveTo(16.1768f, 6.7374f, 16.1768f, 6.2626f, 16.4697f, 5.9697f)
                curveTo(16.6807f, 5.7586f, 16.9862f, 5.6997f, 17.25f, 5.7927f)
                verticalLineTo(4.5f)
                curveTo(17.25f, 4.0858f, 17.5858f, 3.75f, 18.0f, 3.75f)
                curveTo(18.4142f, 3.75f, 18.75f, 4.0858f, 18.75f, 4.5f)
                verticalLineTo(5.7927f)
                curveTo(19.0138f, 5.6997f, 19.3193f, 5.7586f, 19.5303f, 5.9697f)
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
                moveTo(13.25f, 6.0f)
                curveTo(13.25f, 3.3767f, 15.3766f, 1.25f, 18.0f, 1.25f)
                curveTo(20.6234f, 1.25f, 22.75f, 3.3767f, 22.75f, 6.0f)
                curveTo(22.75f, 8.6234f, 20.6234f, 10.75f, 18.0f, 10.75f)
                curveTo(15.3766f, 10.75f, 13.25f, 8.6234f, 13.25f, 6.0f)
                close()
                moveTo(18.0f, 2.75f)
                curveTo(16.2051f, 2.75f, 14.75f, 4.2051f, 14.75f, 6.0f)
                curveTo(14.75f, 7.7949f, 16.2051f, 9.25f, 18.0f, 9.25f)
                curveTo(19.7949f, 9.25f, 21.25f, 7.7949f, 21.25f, 6.0f)
                curveTo(21.25f, 4.2051f, 19.7949f, 2.75f, 18.0f, 2.75f)
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
                moveTo(6.4f, 2.0f)
                horizontalLineTo(13.5278f)
                curveTo(12.5777f, 3.0615f, 12.0f, 4.4633f, 12.0f, 6.0f)
                curveTo(12.0f, 9.3137f, 14.6863f, 12.0f, 18.0f, 12.0f)
                curveTo(19.5367f, 12.0f, 20.9385f, 11.4223f, 22.0f, 10.4722f)
                verticalLineTo(13.6f)
                curveTo(22.0f, 16.0301f, 20.0301f, 18.0f, 17.6f, 18.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(16.0f)
                curveTo(16.5523f, 20.0f, 17.0f, 20.4477f, 17.0f, 21.0f)
                curveTo(17.0f, 21.5523f, 16.5523f, 22.0f, 16.0f, 22.0f)
                horizontalLineTo(8.0f)
                curveTo(7.4477f, 22.0f, 7.0f, 21.5523f, 7.0f, 21.0f)
                curveTo(7.0f, 20.4477f, 7.4477f, 20.0f, 8.0f, 20.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(6.4f)
                curveTo(3.9699f, 18.0f, 2.0f, 16.0301f, 2.0f, 13.6f)
                verticalLineTo(6.4f)
                curveTo(2.0f, 3.9699f, 3.9699f, 2.0f, 6.4f, 2.0f)
                close()
            }
        }.build()
        return deviceComputerArrowDownTop!!
    }

private var deviceComputerArrowDownTop: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.DeviceComputerArrowDownTop,
                contentDescription = ""
            )
        }
    }
}