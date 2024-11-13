package io.github.madmaximuus.persianSymbols.device.computer.mac

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.DeviceComputerMac: ImageVector
    get() {
        if (deviceComputerMac != null) {
            return deviceComputerMac!!
        }
        deviceComputerMac = Builder(
            name = "device-computer-mac-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.915f, 6.726f)
                curveTo(14.438f, 6.203f, 14.696f, 5.547f, 14.645f, 5.006f)
                curveTo(14.104f, 4.955f, 13.448f, 5.213f, 12.925f, 5.736f)
                curveTo(12.401f, 6.26f, 12.144f, 6.916f, 12.195f, 7.456f)
                curveTo(12.735f, 7.508f, 13.392f, 7.25f, 13.915f, 6.726f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.125f, 14.525f)
                curveTo(11.431f, 14.525f, 11.723f, 14.468f, 11.992f, 14.365f)
                curveTo(12.142f, 14.308f, 12.308f, 14.308f, 12.458f, 14.365f)
                curveTo(12.727f, 14.468f, 13.019f, 14.525f, 13.325f, 14.525f)
                curveTo(13.954f, 14.525f, 14.527f, 13.852f, 14.958f, 13f)
                curveTo(15.09f, 12.739f, 15.209f, 12.46f, 15.312f, 12.179f)
                curveTo(14.631f, 11.906f, 14.15f, 11.24f, 14.15f, 10.461f)
                curveTo(14.15f, 9.683f, 14.63f, 9.017f, 15.311f, 8.744f)
                curveTo(14.872f, 8.12f, 14.146f, 7.711f, 13.325f, 7.711f)
                curveTo(13.019f, 7.711f, 12.727f, 7.768f, 12.458f, 7.871f)
                curveTo(12.308f, 7.928f, 12.142f, 7.928f, 11.992f, 7.871f)
                curveTo(11.723f, 7.768f, 11.431f, 7.711f, 11.125f, 7.711f)
                curveTo(9.786f, 7.711f, 8.7f, 8.797f, 8.7f, 10.136f)
                curveTo(8.7f, 10.847f, 9.005f, 12.038f, 9.492f, 13f)
                curveTo(9.923f, 13.852f, 10.496f, 14.525f, 11.125f, 14.525f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.5f, 2f)
                curveTo(4.015f, 2f, 2f, 4.015f, 2f, 6.5f)
                verticalLineTo(13.5f)
                curveTo(2f, 15.985f, 4.015f, 18f, 6.5f, 18f)
                horizontalLineTo(11f)
                verticalLineTo(20f)
                horizontalLineTo(8f)
                curveTo(7.448f, 20f, 7f, 20.448f, 7f, 21f)
                curveTo(7f, 21.552f, 7.448f, 22f, 8f, 22f)
                horizontalLineTo(16f)
                curveTo(16.552f, 22f, 17f, 21.552f, 17f, 21f)
                curveTo(17f, 20.448f, 16.552f, 20f, 16f, 20f)
                horizontalLineTo(13f)
                verticalLineTo(18f)
                horizontalLineTo(17.5f)
                curveTo(19.985f, 18f, 22f, 15.985f, 22f, 13.5f)
                verticalLineTo(6.5f)
                curveTo(22f, 4.015f, 19.985f, 2f, 17.5f, 2f)
                horizontalLineTo(6.5f)
                close()
                moveTo(4f, 6.5f)
                curveTo(4f, 5.119f, 5.119f, 4f, 6.5f, 4f)
                horizontalLineTo(17.5f)
                curveTo(18.881f, 4f, 20f, 5.119f, 20f, 6.5f)
                verticalLineTo(13.5f)
                curveTo(20f, 14.881f, 18.881f, 16f, 17.5f, 16f)
                horizontalLineTo(6.5f)
                curveTo(5.119f, 16f, 4f, 14.881f, 4f, 13.5f)
                verticalLineTo(6.5f)
                close()
            }
        }.build()
        return deviceComputerMac!!
    }

private var deviceComputerMac: ImageVector? = null