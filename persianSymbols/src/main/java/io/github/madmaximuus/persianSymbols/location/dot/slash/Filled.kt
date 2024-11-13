package io.github.madmaximuus.persianSymbols.location.dot.slash

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.LocationDotSlash: ImageVector
    get() {
        if (locationDotSlash != null) {
            return locationDotSlash!!
        }
        locationDotSlash = Builder(
            name = "location-dot-slash-filled",
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
                moveTo(12f, 22f)
                curveTo(10.325f, 22f, 6.573f, 13.343f, 6.059f, 8.559f)
                lineTo(15.148f, 17.648f)
                curveTo(14.006f, 20.13f, 12.778f, 22f, 12f, 22f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 7.556f)
                curveTo(18f, 9.222f, 17.41f, 11.669f, 16.577f, 14.077f)
                lineTo(12.449f, 9.949f)
                curveTo(13.338f, 9.745f, 14f, 8.95f, 14f, 8f)
                curveTo(14f, 6.895f, 13.105f, 6f, 12f, 6f)
                curveTo(11.05f, 6f, 10.255f, 6.662f, 10.051f, 7.551f)
                lineTo(6.993f, 4.493f)
                curveTo(8.067f, 2.991f, 9.909f, 2f, 12f, 2f)
                curveTo(15.314f, 2f, 18f, 4.487f, 18f, 7.556f)
                close()
            }
        }.build()
        return locationDotSlash!!
    }

private var locationDotSlash: ImageVector? = null