package io.github.madmaximuus.persianSymbols.bars.filter

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.BarsFilter: ImageVector
    get() {
        if (barsFilter != null) {
            return barsFilter!!
        }
        barsFilter = ImageVector.Builder(
            name = "bars-filter-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4f, 8f)
                curveTo(4f, 7.448f, 4.448f, 7f, 5f, 7f)
                horizontalLineTo(19f)
                curveTo(19.552f, 7f, 20f, 7.448f, 20f, 8f)
                curveTo(20f, 8.552f, 19.552f, 9f, 19f, 9f)
                horizontalLineTo(5f)
                curveTo(4.448f, 9f, 4f, 8.552f, 4f, 8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7f, 12f)
                curveTo(7f, 11.448f, 7.448f, 11f, 8f, 11f)
                horizontalLineTo(16f)
                curveTo(16.552f, 11f, 17f, 11.448f, 17f, 12f)
                curveTo(17f, 12.552f, 16.552f, 13f, 16f, 13f)
                horizontalLineTo(8f)
                curveTo(7.448f, 13f, 7f, 12.552f, 7f, 12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11f, 15f)
                curveTo(10.448f, 15f, 10f, 15.448f, 10f, 16f)
                curveTo(10f, 16.552f, 10.448f, 17f, 11f, 17f)
                horizontalLineTo(13f)
                curveTo(13.552f, 17f, 14f, 16.552f, 14f, 16f)
                curveTo(14f, 15.448f, 13.552f, 15f, 13f, 15f)
                horizontalLineTo(11f)
                close()
            }
        }.build()
        return barsFilter!!
    }

private var barsFilter: ImageVector? = null