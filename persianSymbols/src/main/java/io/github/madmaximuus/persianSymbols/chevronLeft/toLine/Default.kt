package io.github.madmaximuus.persianSymbols.chevronLeft.toLine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.ChevronLeftToLine: ImageVector
    get() {
        if (chevronLeftToLine != null) {
            return chevronLeftToLine!!
        }
        chevronLeftToLine = Builder(
            name = "chevron-left-to-line-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9f, 7f)
                curveTo(9f, 6.448f, 8.552f, 6f, 8f, 6f)
                curveTo(7.448f, 6f, 7f, 6.448f, 7f, 7f)
                verticalLineTo(17f)
                curveTo(7f, 17.552f, 7.448f, 18f, 8f, 18f)
                curveTo(8.552f, 18f, 9f, 17.552f, 9f, 17f)
                verticalLineTo(7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.828f, 16.95f)
                curveTo(15.434f, 17.336f, 14.797f, 17.333f, 14.407f, 16.942f)
                lineTo(10.164f, 12.699f)
                curveTo(9.774f, 12.309f, 9.777f, 11.679f, 10.172f, 11.293f)
                lineTo(10.176f, 11.289f)
                lineTo(14.407f, 7.058f)
                curveTo(14.797f, 6.667f, 15.434f, 6.664f, 15.828f, 7.05f)
                curveTo(16.223f, 7.436f, 16.226f, 8.066f, 15.836f, 8.457f)
                lineTo(12.293f, 12f)
                lineTo(15.836f, 15.543f)
                curveTo(16.226f, 15.934f, 16.223f, 16.563f, 15.828f, 16.95f)
                close()
            }
        }.build()
        return chevronLeftToLine!!
    }

private var chevronLeftToLine: ImageVector? = null