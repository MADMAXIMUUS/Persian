package io.github.madmaximuus.persianSymbols.scanner

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Scanner: ImageVector
    get() {
        if (scanner != null) {
            return scanner!!
        }
        scanner = ImageVector.Builder(
            name = "scanner-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.659f, 13.125f)
                curveTo(6.482f, 12.913f, 6.509f, 12.598f, 6.721f, 12.42f)
                lineTo(8.636f, 10.813f)
                curveTo(8.847f, 10.636f, 9.163f, 10.663f, 9.34f, 10.875f)
                curveTo(9.518f, 11.087f, 9.49f, 11.402f, 9.279f, 11.579f)
                lineTo(7.364f, 13.186f)
                curveTo(7.152f, 13.364f, 6.837f, 13.336f, 6.659f, 13.125f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.721f, 13.42f)
                curveTo(7.509f, 13.598f, 7.482f, 13.913f, 7.659f, 14.125f)
                curveTo(7.837f, 14.336f, 8.152f, 14.364f, 8.364f, 14.186f)
                lineTo(10.279f, 12.579f)
                curveTo(10.49f, 12.402f, 10.518f, 12.087f, 10.34f, 11.875f)
                curveTo(10.163f, 11.663f, 9.848f, 11.636f, 9.636f, 11.813f)
                lineTo(7.721f, 13.42f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.75f, 17.75f)
                curveTo(15.336f, 17.75f, 15f, 18.086f, 15f, 18.5f)
                curveTo(15f, 18.914f, 15.336f, 19.25f, 15.75f, 19.25f)
                horizontalLineTo(18.25f)
                curveTo(18.664f, 19.25f, 19f, 18.914f, 19f, 18.5f)
                curveTo(19f, 18.086f, 18.664f, 17.75f, 18.25f, 17.75f)
                horizontalLineTo(15.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4f, 2f)
                curveTo(3.679f, 2f, 3.377f, 2.155f, 3.189f, 2.415f)
                curveTo(3.001f, 2.676f, 2.95f, 3.011f, 3.051f, 3.316f)
                lineTo(4.931f, 8.956f)
                lineTo(2.09f, 15.586f)
                curveTo(2.035f, 15.705f, 2.003f, 15.837f, 2f, 15.977f)
                lineTo(2f, 18.4f)
                curveTo(2f, 20.388f, 3.612f, 22f, 5.6f, 22f)
                horizontalLineTo(18.4f)
                curveTo(20.388f, 22f, 22f, 20.388f, 22f, 18.4f)
                verticalLineTo(15.997f)
                curveTo(22f, 15.982f, 22f, 15.967f, 21.999f, 15.951f)
                curveTo(21.993f, 15.821f, 21.962f, 15.698f, 21.91f, 15.586f)
                lineTo(19.069f, 8.956f)
                lineTo(20.949f, 3.316f)
                curveTo(21.05f, 3.011f, 20.999f, 2.676f, 20.811f, 2.415f)
                curveTo(20.623f, 2.155f, 20.321f, 2f, 20f, 2f)
                horizontalLineTo(4f)
                close()
                moveTo(6.659f, 10f)
                horizontalLineTo(17.341f)
                lineTo(19.483f, 15f)
                horizontalLineTo(4.517f)
                lineTo(6.659f, 10f)
                close()
                moveTo(18.613f, 4f)
                lineTo(17.279f, 8f)
                horizontalLineTo(6.721f)
                lineTo(5.387f, 4f)
                horizontalLineTo(18.613f)
                close()
                moveTo(20f, 17f)
                horizontalLineTo(4f)
                verticalLineTo(18.4f)
                curveTo(4f, 19.284f, 4.716f, 20f, 5.6f, 20f)
                horizontalLineTo(18.4f)
                curveTo(19.284f, 20f, 20f, 19.284f, 20f, 18.4f)
                verticalLineTo(17f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15f, 18.5f)
                curveTo(15f, 18.086f, 15.336f, 17.75f, 15.75f, 17.75f)
                horizontalLineTo(18.25f)
                curveTo(18.664f, 17.75f, 19f, 18.086f, 19f, 18.5f)
                curveTo(19f, 18.914f, 18.664f, 19.25f, 18.25f, 19.25f)
                horizontalLineTo(15.75f)
                curveTo(15.336f, 19.25f, 15f, 18.914f, 15f, 18.5f)
                close()
                moveTo(6.659f, 13.125f)
                curveTo(6.482f, 12.913f, 6.509f, 12.598f, 6.721f, 12.42f)
                lineTo(8.636f, 10.813f)
                curveTo(8.847f, 10.636f, 9.163f, 10.663f, 9.34f, 10.875f)
                curveTo(9.518f, 11.087f, 9.49f, 11.402f, 9.279f, 11.579f)
                lineTo(7.364f, 13.186f)
                curveTo(7.152f, 13.364f, 6.837f, 13.336f, 6.659f, 13.125f)
                close()
                moveTo(7.721f, 13.42f)
                curveTo(7.509f, 13.598f, 7.482f, 13.913f, 7.659f, 14.125f)
                curveTo(7.837f, 14.336f, 8.152f, 14.364f, 8.364f, 14.186f)
                lineTo(10.279f, 12.579f)
                curveTo(10.49f, 12.402f, 10.518f, 12.087f, 10.34f, 11.875f)
                curveTo(10.163f, 11.663f, 9.848f, 11.636f, 9.636f, 11.813f)
                lineTo(7.721f, 13.42f)
                close()
            }
        }.build()

        return scanner!!
    }

private var scanner: ImageVector? = null