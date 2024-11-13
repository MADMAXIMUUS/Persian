package io.github.madmaximuus.persianSymbols.bluetooth.connected

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.BluetoothConnected: ImageVector
    get() {
        if (bluetoothConnected != null) {
            return bluetoothConnected!!
        }
        bluetoothConnected = Builder(
            name = "bluetooth-connected-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.587f, 3.589f)
                curveTo(11.944f, 3.427f, 12.363f, 3.489f, 12.658f, 3.747f)
                lineTo(16.659f, 7.247f)
                curveTo(16.867f, 7.43f, 16.99f, 7.69f, 16.999f, 7.967f)
                curveTo(17.009f, 8.243f, 16.903f, 8.511f, 16.707f, 8.707f)
                lineTo(13.414f, 12f)
                lineTo(16.707f, 15.293f)
                curveTo(17.098f, 15.683f, 17.098f, 16.317f, 16.707f, 16.707f)
                lineTo(12.707f, 20.707f)
                curveTo(12.421f, 20.993f, 11.991f, 21.079f, 11.617f, 20.924f)
                curveTo(11.244f, 20.769f, 11f, 20.404f, 11f, 20f)
                verticalLineTo(14.414f)
                lineTo(7.707f, 17.707f)
                curveTo(7.317f, 18.098f, 6.683f, 18.098f, 6.293f, 17.707f)
                curveTo(5.902f, 17.317f, 5.902f, 16.683f, 6.293f, 16.293f)
                lineTo(10.586f, 12f)
                lineTo(6.293f, 7.707f)
                curveTo(5.902f, 7.317f, 5.902f, 6.683f, 6.293f, 6.293f)
                curveTo(6.683f, 5.902f, 7.317f, 5.902f, 7.707f, 6.293f)
                lineTo(11f, 9.586f)
                verticalLineTo(4.5f)
                curveTo(11f, 4.108f, 11.229f, 3.752f, 11.587f, 3.589f)
                close()
                moveTo(13f, 14.414f)
                lineTo(14.586f, 16f)
                lineTo(13f, 17.586f)
                verticalLineTo(14.414f)
                close()
                moveTo(13f, 9.586f)
                verticalLineTo(6.704f)
                lineTo(14.537f, 8.049f)
                lineTo(13f, 9.586f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 12f)
                curveTo(18f, 12.552f, 17.552f, 13f, 17f, 13f)
                curveTo(16.448f, 13f, 16f, 12.552f, 16f, 12f)
                curveTo(16f, 11.448f, 16.448f, 11f, 17f, 11f)
                curveTo(17.552f, 11f, 18f, 11.448f, 18f, 12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7f, 11f)
                curveTo(6.448f, 11f, 6f, 11.448f, 6f, 12f)
                curveTo(6f, 12.552f, 6.448f, 13f, 7f, 13f)
                curveTo(7.552f, 13f, 8f, 12.552f, 8f, 12f)
                curveTo(8f, 11.448f, 7.552f, 11f, 7f, 11f)
                close()
            }
        }.build()
        return bluetoothConnected!!
    }

private var bluetoothConnected: ImageVector? = null