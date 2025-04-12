package io.github.madmaximuus.persianSymbols.brightness.auto

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.BrightnessAuto: ImageVector
    get() {
        if (brightnessAuto != null) {
            return brightnessAuto!!
        }
        brightnessAuto = Builder(
            name = "brightness-auto-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 9.754f)
                lineTo(12.852f, 12.169f)
                horizontalLineTo(11.148f)
                lineTo(12f, 9.754f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.415f, 3.417f)
                curveTo(12.633f, 2.634f, 11.365f, 2.634f, 10.584f, 3.417f)
                lineTo(9.658f, 4.344f)
                curveTo(9.283f, 4.72f, 8.773f, 4.931f, 8.241f, 4.931f)
                lineTo(6.931f, 4.93f)
                curveTo(5.826f, 4.929f, 4.929f, 5.826f, 4.93f, 6.932f)
                lineTo(4.931f, 8.241f)
                curveTo(4.931f, 8.773f, 4.72f, 9.283f, 4.344f, 9.658f)
                lineTo(3.417f, 10.584f)
                curveTo(2.634f, 11.365f, 2.634f, 12.633f, 3.417f, 13.415f)
                lineTo(4.344f, 14.34f)
                curveTo(4.72f, 14.716f, 4.931f, 15.226f, 4.931f, 15.757f)
                lineTo(4.93f, 17.067f)
                curveTo(4.929f, 18.173f, 5.826f, 19.07f, 6.931f, 19.069f)
                lineTo(8.241f, 19.068f)
                curveTo(8.773f, 19.067f, 9.283f, 19.278f, 9.658f, 19.655f)
                lineTo(10.584f, 20.582f)
                curveTo(11.365f, 21.364f, 12.633f, 21.364f, 13.415f, 20.582f)
                lineTo(14.34f, 19.655f)
                curveTo(14.716f, 19.278f, 15.226f, 19.067f, 15.757f, 19.068f)
                lineTo(17.067f, 19.069f)
                curveTo(18.173f, 19.07f, 19.069f, 18.173f, 19.069f, 17.067f)
                lineTo(19.068f, 15.757f)
                curveTo(19.067f, 15.226f, 19.278f, 14.716f, 19.654f, 14.34f)
                lineTo(20.581f, 13.415f)
                curveTo(21.364f, 12.633f, 21.364f, 11.365f, 20.581f, 10.584f)
                lineTo(19.654f, 9.658f)
                curveTo(19.278f, 9.283f, 19.067f, 8.773f, 19.068f, 8.241f)
                lineTo(19.069f, 6.932f)
                curveTo(19.069f, 5.826f, 18.173f, 4.929f, 17.067f, 4.93f)
                lineTo(15.757f, 4.931f)
                curveTo(15.226f, 4.931f, 14.716f, 4.72f, 14.34f, 4.344f)
                lineTo(13.415f, 3.417f)
                close()
                moveTo(12.707f, 7.251f)
                curveTo(12.601f, 6.951f, 12.318f, 6.75f, 12f, 6.75f)
                curveTo(11.682f, 6.75f, 11.399f, 6.951f, 11.293f, 7.251f)
                lineTo(8.469f, 15.25f)
                curveTo(8.331f, 15.641f, 8.536f, 16.069f, 8.927f, 16.207f)
                curveTo(9.318f, 16.345f, 9.746f, 16.14f, 9.884f, 15.75f)
                lineTo(10.618f, 13.669f)
                horizontalLineTo(13.382f)
                lineTo(14.116f, 15.75f)
                curveTo(14.254f, 16.14f, 14.683f, 16.345f, 15.073f, 16.207f)
                curveTo(15.464f, 16.069f, 15.669f, 15.641f, 15.531f, 15.25f)
                lineTo(12.707f, 7.251f)
                close()
            }
        }.build()
        return brightnessAuto!!
    }

private var brightnessAuto: ImageVector? = null