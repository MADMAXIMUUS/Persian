package io.github.madmaximuus.persianSymbols.dollar

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Dollar: ImageVector
    get() {
        if (dollar != null) {
            return dollar!!
        }
        dollar = ImageVector.Builder(
            name = "dollar-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 2.5f)
                curveTo(12.552f, 2.5f, 13f, 2.948f, 13f, 3.5f)
                verticalLineTo(4.082f)
                curveTo(14.693f, 4.362f, 16.154f, 5.342f, 16.844f, 6.758f)
                curveTo(17.086f, 7.255f, 16.88f, 7.854f, 16.384f, 8.096f)
                curveTo(15.887f, 8.338f, 15.289f, 8.131f, 15.047f, 7.635f)
                curveTo(14.615f, 6.749f, 13.475f, 6f, 12f, 6f)
                curveTo(10.014f, 6f, 8.75f, 7.292f, 8.75f, 8.5f)
                curveTo(8.75f, 9.708f, 10.014f, 11f, 12f, 11f)
                curveTo(14.709f, 11f, 17.25f, 12.842f, 17.25f, 15.5f)
                curveTo(17.25f, 17.827f, 15.303f, 19.528f, 13f, 19.916f)
                verticalLineTo(20.5f)
                curveTo(13f, 21.052f, 12.552f, 21.5f, 12f, 21.5f)
                curveTo(11.448f, 21.5f, 11f, 21.052f, 11f, 20.5f)
                verticalLineTo(19.918f)
                curveTo(9.33f, 19.642f, 7.886f, 18.684f, 7.184f, 17.299f)
                curveTo(6.934f, 16.806f, 7.131f, 16.204f, 7.624f, 15.955f)
                curveTo(8.116f, 15.705f, 8.718f, 15.902f, 8.968f, 16.395f)
                curveTo(9.41f, 17.267f, 10.54f, 17.998f, 11.995f, 18f)
                lineTo(12f, 18f)
                lineTo(12.005f, 18f)
                curveTo(13.987f, 17.998f, 15.25f, 16.707f, 15.25f, 15.5f)
                curveTo(15.25f, 14.292f, 13.985f, 13f, 12f, 13f)
                curveTo(9.291f, 13f, 6.75f, 11.158f, 6.75f, 8.5f)
                curveTo(6.75f, 6.173f, 8.697f, 4.471f, 11f, 4.084f)
                verticalLineTo(3.5f)
                curveTo(11f, 2.948f, 11.448f, 2.5f, 12f, 2.5f)
                close()
            }
        }.build()

        return dollar!!
    }

private var dollar: ImageVector? = null
