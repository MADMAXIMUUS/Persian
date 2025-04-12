package io.github.madmaximuus.persianSymbols.device.laptop.apple

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.DeviceLaptopApple: ImageVector
    get() {
        if (deviceLaptopApple != null) {
            return deviceLaptopApple!!
        }
        deviceLaptopApple = Builder(
            name = "device-laptop-apple-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.645f, 6.706f)
                curveTo(14.696f, 7.247f, 14.438f, 7.903f, 13.915f, 8.426f)
                curveTo(13.392f, 8.95f, 12.735f, 9.208f, 12.195f, 9.156f)
                curveTo(12.144f, 8.616f, 12.401f, 7.96f, 12.925f, 7.436f)
                curveTo(13.448f, 6.913f, 14.104f, 6.655f, 14.645f, 6.706f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.125f, 16.225f)
                curveTo(9.786f, 16.225f, 8.7f, 13.176f, 8.7f, 11.836f)
                curveTo(8.7f, 10.497f, 9.786f, 9.411f, 11.125f, 9.411f)
                curveTo(11.431f, 9.411f, 11.723f, 9.468f, 11.992f, 9.571f)
                curveTo(12.142f, 9.628f, 12.308f, 9.628f, 12.458f, 9.571f)
                curveTo(12.727f, 9.468f, 13.019f, 9.411f, 13.325f, 9.411f)
                curveTo(14.146f, 9.411f, 14.872f, 9.82f, 15.311f, 10.444f)
                curveTo(14.63f, 10.717f, 14.15f, 11.383f, 14.15f, 12.161f)
                curveTo(14.15f, 12.94f, 14.631f, 13.606f, 15.312f, 13.879f)
                curveTo(14.873f, 15.076f, 14.147f, 16.225f, 13.325f, 16.225f)
                curveTo(13.019f, 16.225f, 12.727f, 16.168f, 12.458f, 16.065f)
                curveTo(12.308f, 16.008f, 12.142f, 16.008f, 11.992f, 16.065f)
                curveTo(11.723f, 16.168f, 11.431f, 16.225f, 11.125f, 16.225f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 8f)
                curveTo(2f, 5.515f, 4.015f, 3.5f, 6.5f, 3.5f)
                horizontalLineTo(17.5f)
                curveTo(19.985f, 3.5f, 22f, 5.515f, 22f, 8f)
                verticalLineTo(15f)
                curveTo(22f, 16.414f, 21.348f, 17.675f, 20.329f, 18.5f)
                horizontalLineTo(21.6f)
                curveTo(21.821f, 18.5f, 22f, 18.679f, 22f, 18.9f)
                verticalLineTo(19.5f)
                curveTo(22f, 20.052f, 21.552f, 20.5f, 21f, 20.5f)
                horizontalLineTo(3f)
                curveTo(2.448f, 20.5f, 2f, 20.052f, 2f, 19.5f)
                verticalLineTo(18.9f)
                curveTo(2f, 18.679f, 2.179f, 18.5f, 2.4f, 18.5f)
                horizontalLineTo(3.671f)
                curveTo(2.652f, 17.675f, 2f, 16.414f, 2f, 15f)
                verticalLineTo(8f)
                close()
                moveTo(6.5f, 5.5f)
                curveTo(5.119f, 5.5f, 4f, 6.619f, 4f, 8f)
                verticalLineTo(15f)
                curveTo(4f, 16.381f, 5.119f, 17.5f, 6.5f, 17.5f)
                horizontalLineTo(17.5f)
                curveTo(18.881f, 17.5f, 20f, 16.381f, 20f, 15f)
                verticalLineTo(8f)
                curveTo(20f, 6.619f, 18.881f, 5.5f, 17.5f, 5.5f)
                horizontalLineTo(6.5f)
                close()
            }
        }.build()
        return deviceLaptopApple!!
    }

private var deviceLaptopApple: ImageVector? = null