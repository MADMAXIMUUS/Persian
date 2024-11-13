package io.github.madmaximuus.persianSymbols.location.dot.slash

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.LocationDotSlash: ImageVector
    get() {
        if (locationDotSlash != null) {
            return locationDotSlash!!
        }
        locationDotSlash = Builder(
            name = "location-dot-slash-default",
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
                moveTo(7.81f, 16.342f)
                curveTo(6.871f, 13.758f, 6.122f, 10.678f, 6.013f, 8.513f)
                lineTo(8.337f, 10.837f)
                curveTo(8.637f, 12.36f, 9.116f, 14.08f, 9.69f, 15.658f)
                curveTo(10.178f, 17.001f, 10.713f, 18.18f, 11.225f, 19.004f)
                curveTo(11.482f, 19.419f, 11.709f, 19.704f, 11.891f, 19.873f)
                curveTo(11.936f, 19.914f, 11.972f, 19.943f, 12f, 19.964f)
                curveTo(12.028f, 19.943f, 12.064f, 19.914f, 12.109f, 19.873f)
                curveTo(12.291f, 19.704f, 12.518f, 19.419f, 12.775f, 19.004f)
                curveTo(13.178f, 18.355f, 13.595f, 17.487f, 13.992f, 16.492f)
                lineTo(15.521f, 18.021f)
                curveTo(15.188f, 18.782f, 14.835f, 19.478f, 14.475f, 20.059f)
                curveTo(14.17f, 20.55f, 13.834f, 21f, 13.469f, 21.338f)
                curveTo(13.123f, 21.66f, 12.622f, 22f, 12f, 22f)
                curveTo(11.378f, 22f, 10.877f, 21.66f, 10.531f, 21.338f)
                curveTo(10.166f, 21f, 9.83f, 20.55f, 9.525f, 20.059f)
                curveTo(8.912f, 19.07f, 8.322f, 17.749f, 7.81f, 16.342f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.074f, 4.574f)
                lineTo(8.522f, 6.022f)
                curveTo(9.211f, 4.814f, 10.51f, 4f, 12f, 4f)
                curveTo(14.209f, 4f, 16f, 5.791f, 16f, 8f)
                curveTo(16f, 9.187f, 15.703f, 10.918f, 15.226f, 12.726f)
                lineTo(16.847f, 14.347f)
                curveTo(17.529f, 12.06f, 18f, 9.671f, 18f, 8f)
                curveTo(18f, 4.686f, 15.314f, 2f, 12f, 2f)
                curveTo(9.96f, 2f, 8.158f, 3.018f, 7.074f, 4.574f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.75f, 8f)
                curveTo(14.75f, 9.149f, 14.045f, 10.133f, 13.045f, 10.545f)
                lineTo(11.718f, 9.218f)
                curveTo(11.809f, 9.239f, 11.903f, 9.25f, 12f, 9.25f)
                curveTo(12.69f, 9.25f, 13.25f, 8.69f, 13.25f, 8f)
                curveTo(13.25f, 7.31f, 12.69f, 6.75f, 12f, 6.75f)
                curveTo(11.31f, 6.75f, 10.75f, 7.31f, 10.75f, 8f)
                curveTo(10.75f, 8.097f, 10.761f, 8.191f, 10.782f, 8.282f)
                lineTo(9.455f, 6.955f)
                curveTo(9.867f, 5.955f, 10.851f, 5.25f, 12f, 5.25f)
                curveTo(13.519f, 5.25f, 14.75f, 6.481f, 14.75f, 8f)
                close()
            }
        }.build()
        return locationDotSlash!!
    }

private var locationDotSlash: ImageVector? = null