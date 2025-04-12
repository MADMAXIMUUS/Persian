package io.github.madmaximuus.persianSymbols.device.laptop.unlock

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.DeviceLaptopUnlock: ImageVector
    get() {
        if (deviceLaptopUnlock != null) {
            return deviceLaptopUnlock!!
        }
        deviceLaptopUnlock = ImageVector.Builder(
            name = "device-laptop-unlock-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 14.045f)
                curveTo(12.414f, 14.045f, 12.75f, 13.709f, 12.75f, 13.295f)
                curveTo(12.75f, 12.881f, 12.414f, 12.545f, 12f, 12.545f)
                curveTo(11.586f, 12.545f, 11.25f, 12.881f, 11.25f, 13.295f)
                curveTo(11.25f, 13.709f, 11.586f, 14.045f, 12f, 14.045f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 7.9f)
                curveTo(2f, 5.47f, 3.97f, 3.5f, 6.4f, 3.5f)
                horizontalLineTo(17.6f)
                curveTo(20.03f, 3.5f, 22f, 5.47f, 22f, 7.9f)
                verticalLineTo(15.1f)
                curveTo(22f, 16.47f, 21.374f, 17.693f, 20.393f, 18.5f)
                horizontalLineTo(21.6f)
                curveTo(21.821f, 18.5f, 22f, 18.679f, 22f, 18.9f)
                verticalLineTo(19.5f)
                curveTo(22f, 20.052f, 21.552f, 20.5f, 21f, 20.5f)
                horizontalLineTo(3f)
                curveTo(2.448f, 20.5f, 2f, 20.052f, 2f, 19.5f)
                verticalLineTo(18.9f)
                curveTo(2f, 18.679f, 2.179f, 18.5f, 2.4f, 18.5f)
                horizontalLineTo(3.607f)
                curveTo(2.626f, 17.693f, 2f, 16.47f, 2f, 15.1f)
                verticalLineTo(7.9f)
                close()
                moveTo(12.017f, 8.3f)
                curveTo(11.762f, 8.3f, 11.58f, 8.348f, 11.448f, 8.411f)
                curveTo(11.074f, 8.588f, 10.626f, 8.428f, 10.449f, 8.054f)
                curveTo(10.272f, 7.68f, 10.431f, 7.232f, 10.806f, 7.055f)
                curveTo(11.162f, 6.886f, 11.567f, 6.8f, 12.017f, 6.8f)
                curveTo(12.818f, 6.8f, 13.438f, 7.109f, 13.876f, 7.594f)
                curveTo(14.29f, 8.054f, 14.505f, 8.629f, 14.621f, 9.131f)
                curveTo(14.72f, 9.561f, 14.757f, 9.981f, 14.767f, 10.319f)
                curveTo(15.468f, 10.445f, 16f, 11.058f, 16f, 11.795f)
                verticalLineTo(14.795f)
                curveTo(16f, 15.623f, 15.328f, 16.295f, 14.5f, 16.295f)
                horizontalLineTo(9.5f)
                curveTo(8.672f, 16.295f, 8f, 15.623f, 8f, 14.795f)
                verticalLineTo(11.795f)
                curveTo(8f, 10.967f, 8.672f, 10.295f, 9.5f, 10.295f)
                horizontalLineTo(13.266f)
                curveTo(13.254f, 10.041f, 13.225f, 9.751f, 13.16f, 9.469f)
                curveTo(13.073f, 9.096f, 12.939f, 8.796f, 12.762f, 8.599f)
                curveTo(12.608f, 8.428f, 12.392f, 8.3f, 12.017f, 8.3f)
                close()
            }
        }.build()

        return deviceLaptopUnlock!!
    }

private var deviceLaptopUnlock: ImageVector? = null