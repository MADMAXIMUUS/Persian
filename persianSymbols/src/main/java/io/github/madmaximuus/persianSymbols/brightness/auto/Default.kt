package io.github.madmaximuus.persianSymbols.brightness.auto

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.BrightnessAuto: ImageVector
    get() {
        if (brightnessAuto != null) {
            return brightnessAuto!!
        }
        brightnessAuto = Builder(
            name = "brightness-auto-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
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
                moveTo(13.766f, 3.354f)
                curveTo(12.79f, 2.376f, 11.204f, 2.376f, 10.228f, 3.354f)
                lineTo(9.094f, 4.489f)
                curveTo(9.001f, 4.583f, 8.873f, 4.636f, 8.74f, 4.636f)
                lineTo(7.136f, 4.634f)
                curveTo(5.754f, 4.633f, 4.633f, 5.754f, 4.634f, 7.136f)
                lineTo(4.636f, 8.74f)
                curveTo(4.636f, 8.873f, 4.583f, 9.001f, 4.489f, 9.095f)
                lineTo(3.354f, 10.228f)
                curveTo(2.375f, 11.205f, 2.375f, 12.79f, 3.354f, 13.766f)
                lineTo(4.489f, 14.899f)
                curveTo(4.583f, 14.993f, 4.636f, 15.121f, 4.636f, 15.254f)
                lineTo(4.634f, 16.858f)
                curveTo(4.633f, 18.24f, 5.754f, 19.361f, 7.136f, 19.36f)
                lineTo(8.74f, 19.358f)
                curveTo(8.873f, 19.358f, 9.001f, 19.411f, 9.094f, 19.505f)
                lineTo(10.228f, 20.64f)
                curveTo(11.204f, 21.619f, 12.79f, 21.619f, 13.766f, 20.64f)
                lineTo(14.899f, 19.505f)
                curveTo(14.993f, 19.411f, 15.121f, 19.358f, 15.254f, 19.358f)
                lineTo(16.858f, 19.36f)
                curveTo(18.24f, 19.361f, 19.361f, 18.24f, 19.36f, 16.858f)
                lineTo(19.358f, 15.254f)
                curveTo(19.358f, 15.121f, 19.411f, 14.993f, 19.505f, 14.899f)
                lineTo(20.64f, 13.766f)
                curveTo(21.618f, 12.79f, 21.618f, 11.205f, 20.64f, 10.228f)
                lineTo(19.505f, 9.095f)
                curveTo(19.411f, 9.001f, 19.358f, 8.873f, 19.358f, 8.74f)
                lineTo(19.36f, 7.136f)
                curveTo(19.361f, 5.754f, 18.24f, 4.633f, 16.858f, 4.634f)
                lineTo(15.254f, 4.636f)
                curveTo(15.121f, 4.636f, 14.993f, 4.583f, 14.899f, 4.489f)
                lineTo(13.766f, 3.354f)
                close()
                moveTo(11.643f, 4.767f)
                curveTo(11.838f, 4.571f, 12.156f, 4.571f, 12.351f, 4.767f)
                lineTo(13.484f, 5.902f)
                curveTo(13.953f, 6.372f, 14.591f, 6.636f, 15.255f, 6.636f)
                lineTo(16.859f, 6.634f)
                curveTo(17.136f, 6.634f, 17.36f, 6.858f, 17.36f, 7.135f)
                lineTo(17.358f, 8.739f)
                curveTo(17.358f, 9.403f, 17.622f, 10.04f, 18.092f, 10.51f)
                lineTo(19.227f, 11.643f)
                curveTo(19.423f, 11.839f, 19.423f, 12.156f, 19.227f, 12.351f)
                lineTo(18.092f, 13.484f)
                curveTo(17.622f, 13.954f, 17.358f, 14.591f, 17.358f, 15.255f)
                lineTo(17.36f, 16.859f)
                curveTo(17.36f, 17.136f, 17.136f, 17.36f, 16.859f, 17.36f)
                lineTo(15.255f, 17.358f)
                curveTo(14.591f, 17.358f, 13.953f, 17.622f, 13.484f, 18.092f)
                lineTo(12.351f, 19.227f)
                curveTo(12.156f, 19.423f, 11.838f, 19.423f, 11.643f, 19.227f)
                lineTo(10.51f, 18.092f)
                curveTo(10.04f, 17.622f, 9.403f, 17.358f, 8.739f, 17.358f)
                lineTo(7.135f, 17.36f)
                curveTo(6.858f, 17.36f, 6.634f, 17.136f, 6.634f, 16.859f)
                lineTo(6.636f, 15.255f)
                curveTo(6.636f, 14.591f, 6.372f, 13.954f, 5.902f, 13.484f)
                lineTo(4.767f, 12.351f)
                curveTo(4.571f, 12.156f, 4.571f, 11.839f, 4.767f, 11.643f)
                lineTo(5.902f, 10.51f)
                curveTo(6.372f, 10.04f, 6.636f, 9.403f, 6.636f, 8.739f)
                lineTo(6.634f, 7.135f)
                curveTo(6.634f, 6.858f, 6.858f, 6.634f, 7.135f, 6.634f)
                lineTo(8.739f, 6.636f)
                curveTo(9.403f, 6.636f, 10.04f, 6.372f, 10.51f, 5.902f)
                lineTo(11.643f, 4.767f)
                close()
            }
        }.build()
        return brightnessAuto!!
    }

private var brightnessAuto: ImageVector? = null