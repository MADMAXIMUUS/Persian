package io.github.madmaximuus.persianSymbols.brightness.exclamation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.BrightnessExclamation: ImageVector
    get() {
        if (brightnessExclamation != null) {
            return brightnessExclamation!!
        }
        brightnessExclamation = Builder(
            name = "brightness-exclamation-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.415f, 3.417f)
                curveTo(12.633f, 2.634f, 11.365f, 2.634f, 10.584f, 3.417f)
                lineTo(9.658f, 4.344f)
                curveTo(9.283f, 4.72f, 8.773f, 4.931f, 8.241f, 4.931f)
                lineTo(6.931f, 4.93f)
                curveTo(5.826f, 4.929f, 4.929f, 5.826f, 4.93f, 6.931f)
                lineTo(4.931f, 8.241f)
                curveTo(4.931f, 8.773f, 4.72f, 9.283f, 4.344f, 9.658f)
                lineTo(3.417f, 10.584f)
                curveTo(2.634f, 11.365f, 2.634f, 12.633f, 3.417f, 13.415f)
                lineTo(4.344f, 14.34f)
                curveTo(4.72f, 14.716f, 4.931f, 15.226f, 4.931f, 15.757f)
                lineTo(4.93f, 17.067f)
                curveTo(4.929f, 18.173f, 5.826f, 19.069f, 6.931f, 19.069f)
                lineTo(8.241f, 19.068f)
                curveTo(8.773f, 19.067f, 9.283f, 19.278f, 9.658f, 19.654f)
                lineTo(10.584f, 20.581f)
                curveTo(11.365f, 21.364f, 12.633f, 21.364f, 13.415f, 20.581f)
                lineTo(14.34f, 19.654f)
                curveTo(14.716f, 19.278f, 15.226f, 19.067f, 15.757f, 19.068f)
                lineTo(17.067f, 19.069f)
                curveTo(18.173f, 19.069f, 19.07f, 18.173f, 19.069f, 17.067f)
                lineTo(19.068f, 15.757f)
                curveTo(19.067f, 15.226f, 19.278f, 14.716f, 19.655f, 14.34f)
                lineTo(20.582f, 13.415f)
                curveTo(21.364f, 12.633f, 21.364f, 11.365f, 20.582f, 10.584f)
                lineTo(19.655f, 9.658f)
                curveTo(19.278f, 9.283f, 19.067f, 8.773f, 19.068f, 8.241f)
                lineTo(19.069f, 6.931f)
                curveTo(19.07f, 5.826f, 18.173f, 4.929f, 17.067f, 4.93f)
                lineTo(15.757f, 4.931f)
                curveTo(15.226f, 4.931f, 14.716f, 4.72f, 14.34f, 4.344f)
                lineTo(13.415f, 3.417f)
                close()
                moveTo(12f, 7.205f)
                curveTo(12.414f, 7.205f, 12.75f, 7.541f, 12.75f, 7.955f)
                lineTo(12.75f, 13.429f)
                curveTo(12.75f, 13.843f, 12.414f, 14.179f, 12f, 14.179f)
                curveTo(11.586f, 14.179f, 11.25f, 13.843f, 11.25f, 13.429f)
                lineTo(11.25f, 7.955f)
                curveTo(11.25f, 7.541f, 11.586f, 7.205f, 12f, 7.205f)
                close()
                moveTo(13.002f, 15.795f)
                curveTo(13.002f, 16.347f, 12.554f, 16.795f, 12.002f, 16.795f)
                curveTo(11.45f, 16.795f, 11.002f, 16.347f, 11.002f, 15.795f)
                curveTo(11.002f, 15.243f, 11.45f, 14.795f, 12.002f, 14.795f)
                curveTo(12.554f, 14.795f, 13.002f, 15.243f, 13.002f, 15.795f)
                close()
            }
        }.build()
        return brightnessExclamation!!
    }

private var brightnessExclamation: ImageVector? = null