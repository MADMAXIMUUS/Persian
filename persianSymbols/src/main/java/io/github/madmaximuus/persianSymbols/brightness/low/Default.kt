package io.github.madmaximuus.persianSymbols.brightness.low

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.BrightnessLow: ImageVector
    get() {
        if (brightnessLow != null) {
            return brightnessLow!!
        }
        brightnessLow = Builder(
            name = "brightness-low-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f
            ) {
                moveTo(10.939f, 4.063f)
                curveTo(11.524f, 3.476f, 12.476f, 3.476f, 13.061f, 4.063f)
                lineTo(14.195f, 5.198f)
                curveTo(14.476f, 5.481f, 14.859f, 5.639f, 15.257f, 5.639f)
                lineTo(16.861f, 5.637f)
                curveTo(17.691f, 5.637f, 18.363f, 6.309f, 18.363f, 7.138f)
                lineTo(18.361f, 8.742f)
                curveTo(18.361f, 9.141f, 18.52f, 9.524f, 18.802f, 9.805f)
                lineTo(19.937f, 10.939f)
                curveTo(20.524f, 11.524f, 20.524f, 12.476f, 19.937f, 13.061f)
                lineTo(18.802f, 14.195f)
                curveTo(18.52f, 14.476f, 18.361f, 14.859f, 18.361f, 15.257f)
                lineTo(18.363f, 16.861f)
                curveTo(18.363f, 17.691f, 17.691f, 18.363f, 16.861f, 18.363f)
                lineTo(15.257f, 18.361f)
                curveTo(14.859f, 18.361f, 14.476f, 18.52f, 14.195f, 18.802f)
                lineTo(13.061f, 19.937f)
                curveTo(12.476f, 20.524f, 11.524f, 20.524f, 10.939f, 19.937f)
                lineTo(9.805f, 18.802f)
                curveTo(9.524f, 18.52f, 9.141f, 18.361f, 8.742f, 18.361f)
                lineTo(7.138f, 18.363f)
                curveTo(6.309f, 18.363f, 5.637f, 17.691f, 5.637f, 16.861f)
                lineTo(5.639f, 15.257f)
                curveTo(5.639f, 14.859f, 5.481f, 14.476f, 5.198f, 14.195f)
                lineTo(4.063f, 13.061f)
                curveTo(3.476f, 12.476f, 3.476f, 11.524f, 4.063f, 10.939f)
                lineTo(5.198f, 9.805f)
                curveTo(5.481f, 9.524f, 5.639f, 9.141f, 5.639f, 8.742f)
                lineTo(5.637f, 7.138f)
                curveTo(5.637f, 6.309f, 6.309f, 5.637f, 7.138f, 5.637f)
                lineTo(8.742f, 5.639f)
                curveTo(9.141f, 5.639f, 9.524f, 5.481f, 9.805f, 5.198f)
                lineTo(10.939f, 4.063f)
                close()
            }
        }.build()
        return brightnessLow!!
    }

private var brightnessLow: ImageVector? = null