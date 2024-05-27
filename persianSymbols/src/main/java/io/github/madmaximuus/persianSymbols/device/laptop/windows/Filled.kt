package io.github.madmaximuus.persianSymbols.device.laptop.windows

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

val PersianSymbols.Filled.DeviceLaptopWindows: ImageVector
    get() {
        if (deviceLaptopWindows != null) {
            return deviceLaptopWindows!!
        }
        deviceLaptopWindows = Builder(
            name = "device-laptop-windows-filled",
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
                moveTo(11.25f, 7.75f)
                curveTo(11.5261f, 7.75f, 11.75f, 7.9739f, 11.75f, 8.25f)
                verticalLineTo(11.25f)
                curveTo(11.75f, 11.5261f, 11.5261f, 11.75f, 11.25f, 11.75f)
                horizontalLineTo(8.25f)
                curveTo(7.9739f, 11.75f, 7.75f, 11.5261f, 7.75f, 11.25f)
                verticalLineTo(8.25f)
                curveTo(7.75f, 7.9739f, 7.9739f, 7.75f, 8.25f, 7.75f)
                horizontalLineTo(11.25f)
                close()
                moveTo(15.75f, 7.75f)
                curveTo(16.0261f, 7.75f, 16.25f, 7.9739f, 16.25f, 8.25f)
                verticalLineTo(11.25f)
                curveTo(16.25f, 11.5261f, 16.0261f, 11.75f, 15.75f, 11.75f)
                horizontalLineTo(12.75f)
                curveTo(12.4739f, 11.75f, 12.25f, 11.5261f, 12.25f, 11.25f)
                verticalLineTo(8.25f)
                curveTo(12.25f, 7.9739f, 12.4739f, 7.75f, 12.75f, 7.75f)
                horizontalLineTo(15.75f)
                close()
                moveTo(8.25f, 12.25f)
                curveTo(7.9739f, 12.25f, 7.75f, 12.4739f, 7.75f, 12.75f)
                verticalLineTo(15.75f)
                curveTo(7.75f, 16.0261f, 7.9739f, 16.25f, 8.25f, 16.25f)
                horizontalLineTo(11.25f)
                curveTo(11.5261f, 16.25f, 11.75f, 16.0261f, 11.75f, 15.75f)
                verticalLineTo(12.75f)
                curveTo(11.75f, 12.4739f, 11.5261f, 12.25f, 11.25f, 12.25f)
                horizontalLineTo(8.25f)
                close()
                moveTo(15.75f, 12.25f)
                curveTo(16.0261f, 12.25f, 16.25f, 12.4739f, 16.25f, 12.75f)
                verticalLineTo(15.75f)
                curveTo(16.25f, 16.0261f, 16.0261f, 16.25f, 15.75f, 16.25f)
                horizontalLineTo(12.75f)
                curveTo(12.4739f, 16.25f, 12.25f, 16.0261f, 12.25f, 15.75f)
                verticalLineTo(12.75f)
                curveTo(12.25f, 12.4739f, 12.4739f, 12.25f, 12.75f, 12.25f)
                horizontalLineTo(15.75f)
                close()
            }
        }.build()
        return deviceLaptopWindows!!
    }

private var deviceLaptopWindows: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.DeviceLaptopWindows,
                contentDescription = ""
            )
        }
    }
}