package io.github.madmaximuus.persianSymbols.check.small

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.CheckSmall: ImageVector
    get() {
        if (checkSmallDefault != null) {
            return checkSmallDefault!!
        }
        checkSmallDefault = ImageVector.Builder(
            name = "check-small-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.205f, 9.699f)
                curveTo(17.597f, 9.311f, 17.597f, 8.68f, 17.205f, 8.292f)
                curveTo(16.813f, 7.903f, 16.177f, 7.903f, 15.784f, 8.292f)
                lineTo(10.521f, 13.508f)
                lineTo(8.215f, 11.223f)
                curveTo(7.823f, 10.834f, 7.187f, 10.834f, 6.794f, 11.223f)
                curveTo(6.402f, 11.612f, 6.402f, 12.242f, 6.794f, 12.631f)
                lineTo(9.752f, 15.562f)
                curveTo(9.964f, 15.771f, 10.245f, 15.868f, 10.522f, 15.852f)
                curveTo(10.797f, 15.867f, 11.078f, 15.771f, 11.289f, 15.562f)
                lineTo(17.205f, 9.699f)
                close()
            }
        }.build()

        return checkSmallDefault!!
    }

private var checkSmallDefault: ImageVector? = null
