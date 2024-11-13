package io.github.madmaximuus.persianSymbols.bars.filter.slash

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.BarsFilterSlash: ImageVector
    get() {
        if (barsFilterSlash != null) {
            return barsFilterSlash!!
        }
        barsFilterSlash = Builder(
            name = "bars-filter-slash-default",
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
                moveTo(4f, 8f)
                curveTo(4f, 7.594f, 4.241f, 7.245f, 4.588f, 7.088f)
                lineTo(6.5f, 9f)
                horizontalLineTo(5f)
                curveTo(4.448f, 9f, 4f, 8.552f, 4f, 8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.5f, 7f)
                lineTo(11.5f, 9f)
                horizontalLineTo(19f)
                curveTo(19.552f, 9f, 20f, 8.552f, 20f, 8f)
                curveTo(20f, 7.448f, 19.552f, 7f, 19f, 7f)
                horizontalLineTo(9.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8f, 11f)
                horizontalLineTo(8.5f)
                lineTo(10.5f, 13f)
                horizontalLineTo(8f)
                curveTo(7.448f, 13f, 7f, 12.552f, 7f, 12f)
                curveTo(7f, 11.448f, 7.448f, 11f, 8f, 11f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.5f, 11f)
                lineTo(15.5f, 13f)
                horizontalLineTo(16f)
                curveTo(16.552f, 13f, 17f, 12.552f, 17f, 12f)
                curveTo(17f, 11.448f, 16.552f, 11f, 16f, 11f)
                horizontalLineTo(13.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.911f, 16.412f)
                lineTo(12.5f, 15f)
                horizontalLineTo(11f)
                curveTo(10.448f, 15f, 10f, 15.448f, 10f, 16f)
                curveTo(10f, 16.552f, 10.448f, 17f, 11f, 17f)
                horizontalLineTo(13f)
                curveTo(13.406f, 17f, 13.755f, 16.758f, 13.911f, 16.412f)
                close()
            }
        }.build()
        return barsFilterSlash!!
    }

private var barsFilterSlash: ImageVector? = null