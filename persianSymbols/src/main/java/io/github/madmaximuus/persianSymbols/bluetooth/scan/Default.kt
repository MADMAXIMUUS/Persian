package io.github.madmaximuus.persianSymbols.bluetooth.scan

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.BluetoothScan: ImageVector
    get() {
        if (bluetoothScan != null) {
            return bluetoothScan!!
        }
        bluetoothScan = Builder(
            name = "bluetooth-scan-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.587f, 3.589f)
                curveTo(10.944f, 3.427f, 11.363f, 3.489f, 11.658f, 3.747f)
                lineTo(15.658f, 7.247f)
                curveTo(15.867f, 7.43f, 15.99f, 7.69f, 15.999f, 7.967f)
                curveTo(16.009f, 8.243f, 15.903f, 8.511f, 15.707f, 8.707f)
                lineTo(12.414f, 12f)
                lineTo(15.707f, 15.293f)
                curveTo(16.098f, 15.683f, 16.098f, 16.317f, 15.707f, 16.707f)
                lineTo(11.707f, 20.707f)
                curveTo(11.421f, 20.993f, 10.991f, 21.079f, 10.617f, 20.924f)
                curveTo(10.244f, 20.769f, 10f, 20.404f, 10f, 20f)
                verticalLineTo(14.414f)
                lineTo(6.707f, 17.707f)
                curveTo(6.317f, 18.098f, 5.683f, 18.098f, 5.293f, 17.707f)
                curveTo(4.902f, 17.317f, 4.902f, 16.683f, 5.293f, 16.293f)
                lineTo(9.586f, 12f)
                lineTo(5.293f, 7.707f)
                curveTo(4.902f, 7.317f, 4.902f, 6.683f, 5.293f, 6.293f)
                curveTo(5.683f, 5.902f, 6.317f, 5.902f, 6.707f, 6.293f)
                lineTo(10f, 9.586f)
                verticalLineTo(4.5f)
                curveTo(10f, 4.108f, 10.229f, 3.752f, 10.587f, 3.589f)
                close()
                moveTo(12f, 14.414f)
                lineTo(13.586f, 16f)
                lineTo(12f, 17.586f)
                verticalLineTo(14.414f)
                close()
                moveTo(12f, 9.586f)
                verticalLineTo(6.704f)
                lineTo(13.537f, 8.049f)
                lineTo(12f, 9.586f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.909f, 13.909f)
                curveTo(16.026f, 14.026f, 16.218f, 14.027f, 16.323f, 13.899f)
                curveTo(16.508f, 13.672f, 16.659f, 13.42f, 16.772f, 13.148f)
                curveTo(16.922f, 12.784f, 17f, 12.394f, 17f, 12f)
                curveTo(17f, 11.606f, 16.922f, 11.216f, 16.772f, 10.852f)
                curveTo(16.659f, 10.581f, 16.508f, 10.328f, 16.323f, 10.101f)
                curveTo(16.218f, 9.973f, 16.026f, 9.974f, 15.909f, 10.091f)
                lineTo(14.212f, 11.788f)
                curveTo(14.095f, 11.905f, 14.095f, 12.095f, 14.212f, 12.212f)
                lineTo(15.909f, 13.909f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.488f, 8.667f)
                curveTo(19.303f, 8.146f, 18.732f, 7.873f, 18.212f, 8.057f)
                curveTo(17.691f, 8.241f, 17.418f, 8.813f, 17.602f, 9.333f)
                curveTo(17.896f, 10.166f, 18.057f, 11.063f, 18.057f, 12f)
                curveTo(18.057f, 12.937f, 17.896f, 13.834f, 17.602f, 14.667f)
                curveTo(17.418f, 15.187f, 17.691f, 15.759f, 18.212f, 15.943f)
                curveTo(18.732f, 16.127f, 19.303f, 15.854f, 19.488f, 15.333f)
                curveTo(19.857f, 14.289f, 20.057f, 13.167f, 20.057f, 12f)
                curveTo(20.057f, 10.833f, 19.857f, 9.711f, 19.488f, 8.667f)
                close()
            }
        }.build()
        return bluetoothScan!!
    }

private var bluetoothScan: ImageVector? = null