package io.github.madmaximuus.persianSymbols.device.computer.lock

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.DeviceComputerLock: ImageVector
    get() {
        if (deviceComputerLock != null) {
            return deviceComputerLock!!
        }
        deviceComputerLock = ImageVector.Builder(
            name = "device-computer-lock-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 10.375f)
                curveTo(8f, 9.648f, 8.518f, 9.041f, 9.205f, 8.904f)
                curveTo(9.208f, 8.58f, 9.236f, 8.191f, 9.321f, 7.794f)
                curveTo(9.429f, 7.284f, 9.644f, 6.699f, 10.082f, 6.233f)
                curveTo(10.541f, 5.744f, 11.188f, 5.45f, 12.017f, 5.45f)
                curveTo(12.818f, 5.45f, 13.438f, 5.759f, 13.875f, 6.244f)
                curveTo(14.29f, 6.704f, 14.505f, 7.279f, 14.621f, 7.781f)
                curveTo(14.713f, 8.182f, 14.752f, 8.574f, 14.765f, 8.898f)
                curveTo(15.467f, 9.023f, 16f, 9.637f, 16f, 10.375f)
                verticalLineTo(13.375f)
                curveTo(16f, 14.203f, 15.328f, 14.875f, 14.5f, 14.875f)
                horizontalLineTo(9.5f)
                curveTo(8.672f, 14.875f, 8f, 14.203f, 8f, 13.375f)
                verticalLineTo(10.375f)
                close()
                moveTo(10.788f, 8.106f)
                curveTo(10.732f, 8.367f, 10.71f, 8.635f, 10.705f, 8.875f)
                horizontalLineTo(13.262f)
                curveTo(13.249f, 8.639f, 13.219f, 8.375f, 13.16f, 8.119f)
                curveTo(13.073f, 7.746f, 12.939f, 7.446f, 12.762f, 7.249f)
                curveTo(12.608f, 7.078f, 12.392f, 6.95f, 12.017f, 6.95f)
                curveTo(11.574f, 6.95f, 11.332f, 7.093f, 11.175f, 7.26f)
                curveTo(10.995f, 7.451f, 10.865f, 7.741f, 10.788f, 8.106f)
                close()
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

        return deviceComputerLock!!
    }

private var deviceComputerLock: ImageVector? = null