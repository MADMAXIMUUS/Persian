package io.github.madmaximuus.persianSymbols.three

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Three: ImageVector
    get() {
        if (three != null) {
            return three!!
        }
        three = ImageVector.Builder(
            name = "three-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.846f, 7.266f)
                curveTo(8.526f, 5.64f, 10.131f, 4.5f, 12f, 4.5f)
                curveTo(14.024f, 4.5f, 15.771f, 5.63f, 16.101f, 7.099f)
                curveTo(16.284f, 7.916f, 16.166f, 8.514f, 15.937f, 8.97f)
                curveTo(15.698f, 9.444f, 15.301f, 9.837f, 14.826f, 10.156f)
                curveTo(14.353f, 10.476f, 13.842f, 10.695f, 13.439f, 10.835f)
                lineTo(12.802f, 11.02f)
                curveTo(12.336f, 11.114f, 12f, 11.524f, 12f, 12f)
                curveTo(12f, 12.476f, 12.336f, 12.886f, 12.803f, 12.98f)
                lineTo(13.442f, 13.165f)
                curveTo(13.847f, 13.304f, 14.36f, 13.522f, 14.837f, 13.838f)
                curveTo(15.316f, 14.155f, 15.716f, 14.542f, 15.958f, 15.006f)
                curveTo(16.189f, 15.449f, 16.31f, 16.026f, 16.137f, 16.813f)
                curveTo(15.797f, 18.332f, 14.036f, 19.5f, 12f, 19.5f)
                curveTo(10.103f, 19.5f, 8.477f, 18.326f, 7.816f, 16.66f)
                curveTo(7.612f, 16.147f, 7.031f, 15.896f, 6.517f, 16.1f)
                curveTo(6.004f, 16.304f, 5.753f, 16.885f, 5.957f, 17.399f)
                curveTo(6.911f, 19.8f, 9.256f, 21.5f, 12f, 21.5f)
                curveTo(14.605f, 21.5f, 17.476f, 19.998f, 18.089f, 17.247f)
                lineTo(18.09f, 17.244f)
                curveTo(18.36f, 16.017f, 18.188f, 14.959f, 17.732f, 14.082f)
                curveTo(17.285f, 13.225f, 16.601f, 12.607f, 15.941f, 12.17f)
                curveTo(15.848f, 12.108f, 15.755f, 12.05f, 15.663f, 11.995f)
                curveTo(15.757f, 11.938f, 15.851f, 11.878f, 15.944f, 11.815f)
                curveTo(16.604f, 11.37f, 17.284f, 10.741f, 17.723f, 9.869f)
                curveTo(18.172f, 8.978f, 18.331f, 7.905f, 18.052f, 6.661f)
                curveTo(17.439f, 3.931f, 14.549f, 2.5f, 12f, 2.5f)
                curveTo(9.296f, 2.5f, 6.981f, 4.15f, 6.001f, 6.494f)
                curveTo(5.788f, 7.004f, 6.028f, 7.59f, 6.538f, 7.803f)
                curveTo(7.047f, 8.016f, 7.633f, 7.775f, 7.846f, 7.266f)
                close()
            }
        }.build()

        return three!!
    }

private var three: ImageVector? = null
