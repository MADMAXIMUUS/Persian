package io.github.madmaximuus.persianSymbols.eye.slash

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.EyeSlash: ImageVector
    get() {
        if (eyeSlash != null) {
            return eyeSlash!!
        }
        eyeSlash = Builder(
            name = "eye-slash-filled",
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
                moveTo(3.237f, 9.321f)
                curveTo(3.678f, 8.675f, 4.237f, 8.024f, 4.929f, 7.429f)
                lineTo(8.411f, 10.911f)
                curveTo(8.306f, 11.255f, 8.25f, 11.621f, 8.25f, 12f)
                curveTo(8.25f, 14.071f, 9.929f, 15.75f, 12f, 15.75f)
                curveTo(12.379f, 15.75f, 12.745f, 15.694f, 13.089f, 15.589f)
                lineTo(15.821f, 18.321f)
                curveTo(14.721f, 18.742f, 13.453f, 19f, 12f, 19f)
                curveTo(7.618f, 19f, 4.916f, 16.648f, 3.421f, 14.594f)
                curveTo(2.282f, 13.028f, 2.147f, 10.92f, 3.237f, 9.321f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.114f, 5.614f)
                lineTo(10.911f, 8.411f)
                curveTo(11.255f, 8.306f, 11.621f, 8.25f, 12f, 8.25f)
                curveTo(14.071f, 8.25f, 15.75f, 9.929f, 15.75f, 12f)
                curveTo(15.75f, 12.379f, 15.694f, 12.745f, 15.589f, 13.089f)
                lineTo(18.925f, 16.425f)
                curveTo(19.59f, 15.834f, 20.137f, 15.201f, 20.579f, 14.594f)
                curveTo(21.718f, 13.028f, 21.853f, 10.92f, 20.763f, 9.321f)
                curveTo(19.31f, 7.191f, 16.568f, 5f, 12f, 5f)
                curveTo(10.519f, 5f, 9.23f, 5.23f, 8.114f, 5.614f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.734f, 14.234f)
                curveTo(10.704f, 14.113f, 9.887f, 13.296f, 9.766f, 12.266f)
                lineTo(11.734f, 14.234f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.234f, 11.734f)
                lineTo(12.266f, 9.766f)
                curveTo(13.296f, 9.887f, 14.113f, 10.704f, 14.234f, 11.734f)
                close()
            }
        }.build()
        return eyeSlash!!
    }

private var eyeSlash: ImageVector? = null