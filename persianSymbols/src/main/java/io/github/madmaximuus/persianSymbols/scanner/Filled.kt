package io.github.madmaximuus.persianSymbols.scanner

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.Scanner: ImageVector
    get() {
        if (scanner != null) {
            return scanner!!
        }
        scanner = ImageVector.Builder(
            name = "scanner-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.721f, 12.42f)
                curveTo(6.509f, 12.598f, 6.482f, 12.913f, 6.659f, 13.125f)
                curveTo(6.837f, 13.336f, 7.152f, 13.364f, 7.364f, 13.186f)
                lineTo(9.279f, 11.579f)
                curveTo(9.49f, 11.402f, 9.518f, 11.087f, 9.34f, 10.875f)
                curveTo(9.163f, 10.663f, 8.847f, 10.636f, 8.636f, 10.813f)
                lineTo(6.721f, 12.42f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.659f, 14.125f)
                curveTo(7.482f, 13.913f, 7.509f, 13.598f, 7.721f, 13.42f)
                lineTo(9.636f, 11.813f)
                curveTo(9.848f, 11.636f, 10.163f, 11.663f, 10.34f, 11.875f)
                curveTo(10.518f, 12.087f, 10.49f, 12.402f, 10.279f, 12.579f)
                lineTo(8.364f, 14.186f)
                curveTo(8.152f, 14.364f, 7.837f, 14.336f, 7.659f, 14.125f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.171f, 2.631f)
                lineTo(4.9f, 9f)
                horizontalLineTo(4.912f)
                lineTo(2.081f, 15.606f)
                curveTo(2.027f, 15.733f, 2f, 15.866f, 2f, 16f)
                verticalLineTo(18.5f)
                curveTo(2f, 20.433f, 3.567f, 22f, 5.5f, 22f)
                horizontalLineTo(18.5f)
                curveTo(20.433f, 22f, 22f, 20.433f, 22f, 18.5f)
                verticalLineTo(16.016f)
                curveTo(22.002f, 15.877f, 21.976f, 15.738f, 21.919f, 15.606f)
                lineTo(19.088f, 9f)
                horizontalLineTo(19.1f)
                lineTo(20.829f, 2.631f)
                curveTo(20.915f, 2.313f, 20.676f, 2f, 20.346f, 2f)
                horizontalLineTo(3.654f)
                curveTo(3.324f, 2f, 3.085f, 2.313f, 3.171f, 2.631f)
                close()
                moveTo(15.75f, 17.75f)
                curveTo(15.336f, 17.75f, 15f, 18.086f, 15f, 18.5f)
                curveTo(15f, 18.914f, 15.336f, 19.25f, 15.75f, 19.25f)
                horizontalLineTo(18.25f)
                curveTo(18.664f, 19.25f, 19f, 18.914f, 19f, 18.5f)
                curveTo(19f, 18.086f, 18.664f, 17.75f, 18.25f, 17.75f)
                horizontalLineTo(15.75f)
                close()
                moveTo(4.517f, 15f)
                lineTo(6.659f, 10f)
                horizontalLineTo(17.341f)
                lineTo(19.483f, 15f)
                horizontalLineTo(4.517f)
                close()
            }
        }.build()

        return scanner!!
    }

private var scanner: ImageVector? = null