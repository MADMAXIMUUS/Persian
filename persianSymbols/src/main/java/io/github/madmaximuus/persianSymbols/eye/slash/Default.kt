package io.github.madmaximuus.persianSymbols.eye.slash

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.EyeSlash: ImageVector
    get() {
        if (eyeSlash != null) {
            return eyeSlash!!
        }
        eyeSlash = Builder(
            name = "eye-slash-default",
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
                moveTo(3.673f, 8.635f)
                curveTo(4.023f, 8.209f, 4.43f, 7.79f, 4.897f, 7.397f)
                lineTo(6.317f, 8.817f)
                curveTo(5.888f, 9.163f, 5.524f, 9.533f, 5.22f, 9.904f)
                curveTo(4.275f, 11.055f, 4.342f, 12.775f, 5.379f, 13.995f)
                curveTo(6.636f, 15.473f, 8.726f, 17f, 12f, 17f)
                curveTo(12.818f, 17f, 13.563f, 16.905f, 14.238f, 16.739f)
                lineTo(15.837f, 18.337f)
                curveTo(14.733f, 18.747f, 13.458f, 19f, 12f, 19f)
                curveTo(8.008f, 19f, 5.398f, 17.105f, 3.856f, 15.291f)
                curveTo(2.266f, 13.421f, 2.046f, 10.62f, 3.673f, 8.635f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.105f, 5.605f)
                lineTo(9.73f, 7.23f)
                curveTo(10.413f, 7.083f, 11.167f, 7f, 12f, 7f)
                curveTo(15.467f, 7f, 17.582f, 8.443f, 18.78f, 9.904f)
                curveTo(19.725f, 11.055f, 19.658f, 12.775f, 18.621f, 13.995f)
                curveTo(18.316f, 14.353f, 17.963f, 14.714f, 17.556f, 15.056f)
                lineTo(18.974f, 16.474f)
                curveTo(19.417f, 16.09f, 19.806f, 15.688f, 20.144f, 15.291f)
                curveTo(21.734f, 13.421f, 21.954f, 10.62f, 20.327f, 8.635f)
                curveTo(18.773f, 6.741f, 16.103f, 5f, 12f, 5f)
                curveTo(10.52f, 5f, 9.227f, 5.226f, 8.105f, 5.605f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.25f, 12f)
                curveTo(8.25f, 11.621f, 8.306f, 11.255f, 8.411f, 10.911f)
                lineTo(9.765f, 12.266f)
                curveTo(9.887f, 13.296f, 10.704f, 14.113f, 11.734f, 14.234f)
                lineTo(13.089f, 15.589f)
                curveTo(12.745f, 15.694f, 12.379f, 15.75f, 12f, 15.75f)
                curveTo(9.929f, 15.75f, 8.25f, 14.071f, 8.25f, 12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.911f, 8.411f)
                lineTo(12.266f, 9.766f)
                curveTo(13.296f, 9.887f, 14.113f, 10.704f, 14.234f, 11.734f)
                lineTo(15.589f, 13.089f)
                curveTo(15.694f, 12.745f, 15.75f, 12.379f, 15.75f, 12f)
                curveTo(15.75f, 9.929f, 14.071f, 8.25f, 12f, 8.25f)
                curveTo(11.621f, 8.25f, 11.255f, 8.306f, 10.911f, 8.411f)
                close()
            }
        }.build()
        return eyeSlash!!
    }

private var eyeSlash: ImageVector? = null