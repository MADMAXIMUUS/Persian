package io.github.madmaximuus.persianSymbols.device.computer.unlock

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.DeviceComputerUnlock: ImageVector
    get() {
        if (deviceComputerUnlock != null) {
            return deviceComputerUnlock!!
        }
        deviceComputerUnlock = ImageVector.Builder(
            name = "device-computer-unlock-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 12.625f)
                curveTo(12.414f, 12.625f, 12.75f, 12.289f, 12.75f, 11.875f)
                curveTo(12.75f, 11.461f, 12.414f, 11.125f, 12f, 11.125f)
                curveTo(11.586f, 11.125f, 11.25f, 11.461f, 11.25f, 11.875f)
                curveTo(11.25f, 12.289f, 11.586f, 12.625f, 12f, 12.625f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 6.4f)
                curveTo(2f, 3.97f, 3.97f, 2f, 6.4f, 2f)
                horizontalLineTo(17.6f)
                curveTo(20.03f, 2f, 22f, 3.97f, 22f, 6.4f)
                verticalLineTo(13.6f)
                curveTo(22f, 16.03f, 20.03f, 18f, 17.6f, 18f)
                horizontalLineTo(13f)
                verticalLineTo(20f)
                horizontalLineTo(16f)
                curveTo(16.552f, 20f, 17f, 20.448f, 17f, 21f)
                curveTo(17f, 21.552f, 16.552f, 22f, 16f, 22f)
                horizontalLineTo(8f)
                curveTo(7.448f, 22f, 7f, 21.552f, 7f, 21f)
                curveTo(7f, 20.448f, 7.448f, 20f, 8f, 20f)
                horizontalLineTo(11f)
                verticalLineTo(18f)
                horizontalLineTo(6.4f)
                curveTo(3.97f, 18f, 2f, 16.03f, 2f, 13.6f)
                verticalLineTo(6.4f)
                close()
                moveTo(12.017f, 6.88f)
                curveTo(11.762f, 6.88f, 11.58f, 6.928f, 11.448f, 6.991f)
                curveTo(11.074f, 7.168f, 10.626f, 7.008f, 10.449f, 6.634f)
                curveTo(10.272f, 6.26f, 10.431f, 5.812f, 10.806f, 5.635f)
                curveTo(11.162f, 5.466f, 11.567f, 5.38f, 12.017f, 5.38f)
                curveTo(12.818f, 5.38f, 13.438f, 5.689f, 13.876f, 6.174f)
                curveTo(14.29f, 6.634f, 14.505f, 7.209f, 14.621f, 7.711f)
                curveTo(14.72f, 8.141f, 14.757f, 8.561f, 14.767f, 8.899f)
                curveTo(15.468f, 9.025f, 16f, 9.638f, 16f, 10.375f)
                verticalLineTo(13.375f)
                curveTo(16f, 14.203f, 15.328f, 14.875f, 14.5f, 14.875f)
                horizontalLineTo(9.5f)
                curveTo(8.672f, 14.875f, 8f, 14.203f, 8f, 13.375f)
                verticalLineTo(10.375f)
                curveTo(8f, 9.547f, 8.672f, 8.875f, 9.5f, 8.875f)
                horizontalLineTo(13.266f)
                curveTo(13.254f, 8.621f, 13.225f, 8.331f, 13.16f, 8.049f)
                curveTo(13.073f, 7.676f, 12.939f, 7.376f, 12.762f, 7.179f)
                curveTo(12.608f, 7.008f, 12.392f, 6.88f, 12.017f, 6.88f)
                close()
            }
        }.build()

        return deviceComputerUnlock!!
    }

private var deviceComputerUnlock: ImageVector? = null