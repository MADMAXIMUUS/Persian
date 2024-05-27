package io.github.madmaximuus.persianSymbols.device.computer.windows

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

val PersianSymbols.Filled.DeviceComputerWindows: ImageVector
    get() {
        if (deviceComputerWindows != null) {
            return deviceComputerWindows!!
        }
        deviceComputerWindows = Builder(
            name = "device-computer-windows-filled",
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
                moveTo(2.0f, 6.4f)
                curveTo(2.0f, 3.9699f, 3.9699f, 2.0f, 6.4f, 2.0f)
                horizontalLineTo(17.6f)
                curveTo(20.0301f, 2.0f, 22.0f, 3.9699f, 22.0f, 6.4f)
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
                close()
                moveTo(11.25f, 5.75f)
                curveTo(11.5261f, 5.75f, 11.75f, 5.9739f, 11.75f, 6.25f)
                verticalLineTo(9.25f)
                curveTo(11.75f, 9.5261f, 11.5261f, 9.75f, 11.25f, 9.75f)
                horizontalLineTo(8.25f)
                curveTo(7.9739f, 9.75f, 7.75f, 9.5261f, 7.75f, 9.25f)
                verticalLineTo(6.25f)
                curveTo(7.75f, 5.9739f, 7.9739f, 5.75f, 8.25f, 5.75f)
                horizontalLineTo(11.25f)
                close()
                moveTo(15.75f, 5.75f)
                curveTo(16.0261f, 5.75f, 16.25f, 5.9739f, 16.25f, 6.25f)
                verticalLineTo(9.25f)
                curveTo(16.25f, 9.5261f, 16.0261f, 9.75f, 15.75f, 9.75f)
                horizontalLineTo(12.75f)
                curveTo(12.4739f, 9.75f, 12.25f, 9.5261f, 12.25f, 9.25f)
                verticalLineTo(6.25f)
                curveTo(12.25f, 5.9739f, 12.4739f, 5.75f, 12.75f, 5.75f)
                horizontalLineTo(15.75f)
                close()
                moveTo(8.25f, 10.25f)
                curveTo(7.9739f, 10.25f, 7.75f, 10.4739f, 7.75f, 10.75f)
                verticalLineTo(13.75f)
                curveTo(7.75f, 14.0261f, 7.9739f, 14.25f, 8.25f, 14.25f)
                horizontalLineTo(11.25f)
                curveTo(11.5261f, 14.25f, 11.75f, 14.0261f, 11.75f, 13.75f)
                verticalLineTo(10.75f)
                curveTo(11.75f, 10.4739f, 11.5261f, 10.25f, 11.25f, 10.25f)
                horizontalLineTo(8.25f)
                close()
                moveTo(15.75f, 10.25f)
                curveTo(16.0261f, 10.25f, 16.25f, 10.4739f, 16.25f, 10.75f)
                verticalLineTo(13.75f)
                curveTo(16.25f, 14.0261f, 16.0261f, 14.25f, 15.75f, 14.25f)
                horizontalLineTo(12.75f)
                curveTo(12.4739f, 14.25f, 12.25f, 14.0261f, 12.25f, 13.75f)
                verticalLineTo(10.75f)
                curveTo(12.25f, 10.4739f, 12.4739f, 10.25f, 12.75f, 10.25f)
                horizontalLineTo(15.75f)
                close()
            }
        }.build()
        return deviceComputerWindows!!
    }

private var deviceComputerWindows: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.DeviceComputerWindows,
                contentDescription = ""
            )
        }
    }
}