package io.github.madmaximuus.persianSymbols.shield.xmark

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.ShieldXNark: ImageVector
    get() {
        if (shieldXMark != null) {
            return shieldXMark!!
        }
        shieldXMark = Builder(
            name = "shield-xmark-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.342f, 3.124f)
                curveTo(12.121f, 3.044f, 11.879f, 3.044f, 11.658f, 3.124f)
                lineTo(3.658f, 6.033f)
                curveTo(3.263f, 6.177f, 2.997f, 6.553f, 3.015f, 6.973f)
                curveTo(3.26f, 12.604f, 6.446f, 17.762f, 11.525f, 20.732f)
                curveTo(11.818f, 20.903f, 12.182f, 20.903f, 12.475f, 20.732f)
                curveTo(17.554f, 17.762f, 20.74f, 12.604f, 20.985f, 6.973f)
                curveTo(21.003f, 6.553f, 20.737f, 6.177f, 20.342f, 6.033f)
                lineTo(12.342f, 3.124f)
                close()
                moveTo(8.995f, 8.16f)
                curveTo(9.289f, 7.868f, 9.765f, 7.869f, 10.057f, 8.162f)
                lineTo(12f, 10.105f)
                lineTo(13.943f, 8.162f)
                curveTo(14.235f, 7.869f, 14.711f, 7.868f, 15.005f, 8.16f)
                curveTo(15.299f, 8.452f, 15.3f, 8.926f, 15.007f, 9.219f)
                lineTo(13.061f, 11.165f)
                lineTo(15.007f, 13.112f)
                curveTo(15.3f, 13.405f, 15.299f, 13.879f, 15.005f, 14.17f)
                curveTo(14.711f, 14.462f, 14.235f, 14.461f, 13.942f, 14.168f)
                lineTo(12f, 12.226f)
                lineTo(10.057f, 14.168f)
                curveTo(9.765f, 14.461f, 9.289f, 14.462f, 8.995f, 14.17f)
                curveTo(8.701f, 13.879f, 8.7f, 13.405f, 8.993f, 13.112f)
                lineTo(10.939f, 11.165f)
                lineTo(8.993f, 9.219f)
                curveTo(8.7f, 8.926f, 8.701f, 8.452f, 8.995f, 8.16f)
                close()
            }
        }.build()
        return shieldXMark!!
    }

private var shieldXMark: ImageVector? = null