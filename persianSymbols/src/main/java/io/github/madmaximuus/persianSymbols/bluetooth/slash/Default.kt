package io.github.madmaximuus.persianSymbols.bluetooth.slash

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.BluetoothSlash: ImageVector
    get() {
        if (bluetoothSlash != null) {
            return bluetoothSlash!!
        }
        bluetoothSlash = Builder(
            name = "bluetooth-slash-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.707f, 2.293f)
                curveTo(3.317f, 1.902f, 2.683f, 1.902f, 2.293f, 2.293f)
                curveTo(1.902f, 2.683f, 1.902f, 3.317f, 2.293f, 3.707f)
                lineTo(20.293f, 21.707f)
                curveTo(20.683f, 22.098f, 21.317f, 22.098f, 21.707f, 21.707f)
                curveTo(22.098f, 21.317f, 22.098f, 20.683f, 21.707f, 20.293f)
                lineTo(3.707f, 2.293f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.293f, 16.293f)
                lineTo(10.056f, 12.53f)
                lineTo(13f, 15.475f)
                verticalLineTo(17.586f)
                lineTo(14.056f, 16.53f)
                lineTo(15.47f, 17.945f)
                lineTo(12.707f, 20.707f)
                curveTo(12.421f, 20.993f, 11.991f, 21.079f, 11.617f, 20.924f)
                curveTo(11.244f, 20.769f, 11f, 20.404f, 11f, 20f)
                verticalLineTo(14.414f)
                lineTo(7.707f, 17.707f)
                curveTo(7.317f, 18.098f, 6.683f, 18.098f, 6.293f, 17.707f)
                curveTo(5.902f, 17.317f, 5.902f, 16.683f, 6.293f, 16.293f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16.707f, 8.707f)
                lineTo(13.945f, 11.47f)
                lineTo(11f, 8.525f)
                verticalLineTo(4.5f)
                curveTo(11f, 4.108f, 11.229f, 3.752f, 11.587f, 3.589f)
                curveTo(11.944f, 3.427f, 12.363f, 3.489f, 12.658f, 3.747f)
                lineTo(16.659f, 7.247f)
                curveTo(16.867f, 7.43f, 16.99f, 7.69f, 16.999f, 7.967f)
                curveTo(17.009f, 8.243f, 16.903f, 8.511f, 16.707f, 8.707f)
                close()
                moveTo(13f, 9.586f)
                verticalLineTo(6.704f)
                lineTo(14.537f, 8.049f)
                lineTo(13f, 9.586f)
                close()
            }
        }.build()
        return bluetoothSlash!!
    }

private var bluetoothSlash: ImageVector? = null