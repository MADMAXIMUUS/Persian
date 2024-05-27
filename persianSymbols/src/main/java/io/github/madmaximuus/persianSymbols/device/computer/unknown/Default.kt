package io.github.madmaximuus.persianSymbols.device.computer.unknown

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

val PersianSymbols.Default.DeviceComputerUnknown: ImageVector
    get() {
        if (deviceComputerMonitor != null) {
            return deviceComputerMonitor!!
        }
        deviceComputerMonitor = Builder(
            name = "device-computer-unknown-default",
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
                moveTo(2.0f, 6.5f)
                curveTo(2.0f, 4.0147f, 4.0147f, 2.0f, 6.5f, 2.0f)
                horizontalLineTo(17.5f)
                curveTo(19.9853f, 2.0f, 22.0f, 4.0147f, 22.0f, 6.5f)
                verticalLineTo(13.5f)
                curveTo(22.0f, 15.9853f, 19.9853f, 18.0f, 17.5f, 18.0f)
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
                horizontalLineTo(6.5f)
                curveTo(4.0147f, 18.0f, 2.0f, 15.9853f, 2.0f, 13.5f)
                verticalLineTo(6.5f)
                close()
                moveTo(6.5f, 4.0f)
                curveTo(5.1193f, 4.0f, 4.0f, 5.1193f, 4.0f, 6.5f)
                verticalLineTo(13.5f)
                curveTo(4.0f, 14.8807f, 5.1193f, 16.0f, 6.5f, 16.0f)
                horizontalLineTo(17.5f)
                curveTo(18.8807f, 16.0f, 20.0f, 14.8807f, 20.0f, 13.5f)
                verticalLineTo(6.5f)
                curveTo(20.0f, 5.1193f, 18.8807f, 4.0f, 17.5f, 4.0f)
                horizontalLineTo(6.5f)
                close()
            }
        }.build()
        return deviceComputerMonitor!!
    }

private var deviceComputerMonitor: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.DeviceComputerUnknown,
                contentDescription = ""
            )
        }
    }
}