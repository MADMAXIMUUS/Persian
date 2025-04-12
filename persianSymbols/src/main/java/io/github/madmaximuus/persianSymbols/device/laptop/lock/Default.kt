package io.github.madmaximuus.persianSymbols.device.laptop.lock

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.DeviceLaptopLock: ImageVector
    get() {
        if (deviceLaptopLock != null) {
            return deviceLaptopLock!!
        }
        deviceLaptopLock = ImageVector.Builder(
            name = "device-laptop-lock-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 11.725f)
                curveTo(8f, 10.998f, 8.518f, 10.391f, 9.205f, 10.254f)
                curveTo(9.208f, 9.93f, 9.236f, 9.541f, 9.321f, 9.144f)
                curveTo(9.429f, 8.634f, 9.644f, 8.049f, 10.082f, 7.583f)
                curveTo(10.541f, 7.095f, 11.188f, 6.8f, 12.017f, 6.8f)
                curveTo(12.818f, 6.8f, 13.438f, 7.109f, 13.875f, 7.594f)
                curveTo(14.29f, 8.054f, 14.505f, 8.629f, 14.621f, 9.131f)
                curveTo(14.713f, 9.532f, 14.752f, 9.924f, 14.765f, 10.248f)
                curveTo(15.467f, 10.373f, 16f, 10.987f, 16f, 11.725f)
                verticalLineTo(14.725f)
                curveTo(16f, 15.554f, 15.328f, 16.225f, 14.5f, 16.225f)
                horizontalLineTo(9.5f)
                curveTo(8.672f, 16.225f, 8f, 15.554f, 8f, 14.725f)
                verticalLineTo(11.725f)
                close()
                moveTo(10.788f, 9.456f)
                curveTo(10.732f, 9.717f, 10.71f, 9.985f, 10.705f, 10.225f)
                horizontalLineTo(13.262f)
                curveTo(13.249f, 9.989f, 13.219f, 9.725f, 13.16f, 9.469f)
                curveTo(13.073f, 9.096f, 12.939f, 8.796f, 12.762f, 8.599f)
                curveTo(12.608f, 8.428f, 12.392f, 8.3f, 12.017f, 8.3f)
                curveTo(11.574f, 8.3f, 11.332f, 8.443f, 11.175f, 8.611f)
                curveTo(10.995f, 8.801f, 10.865f, 9.091f, 10.788f, 9.456f)
                close()
                moveTo(12f, 13.975f)
                curveTo(12.414f, 13.975f, 12.75f, 13.639f, 12.75f, 13.225f)
                curveTo(12.75f, 12.811f, 12.414f, 12.475f, 12f, 12.475f)
                curveTo(11.586f, 12.475f, 11.25f, 12.811f, 11.25f, 13.225f)
                curveTo(11.25f, 13.639f, 11.586f, 13.975f, 12f, 13.975f)
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

        return deviceLaptopLock!!
    }

private var deviceLaptopLock: ImageVector? = null