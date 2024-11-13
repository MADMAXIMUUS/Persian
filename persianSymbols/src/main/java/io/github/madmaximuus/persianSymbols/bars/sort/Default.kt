package io.github.madmaximuus.persianSymbols.bars.sort

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.BarsSort: ImageVector
    get() {
        if (barsSort != null) {
            return barsSort!!
        }
        barsSort = Builder(
            name = "bars-sort-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5f, 7f)
                curveTo(4.448f, 7f, 4f, 7.448f, 4f, 8f)
                curveTo(4f, 8.552f, 4.448f, 9f, 5f, 9f)
                horizontalLineTo(19f)
                curveTo(19.552f, 9f, 20f, 8.552f, 20f, 8f)
                curveTo(20f, 7.448f, 19.552f, 7f, 19f, 7f)
                horizontalLineTo(5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4f, 12f)
                curveTo(4f, 11.448f, 4.448f, 11f, 5f, 11f)
                horizontalLineTo(13f)
                curveTo(13.552f, 11f, 14f, 11.448f, 14f, 12f)
                curveTo(14f, 12.552f, 13.552f, 13f, 13f, 13f)
                horizontalLineTo(5f)
                curveTo(4.448f, 13f, 4f, 12.552f, 4f, 12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4f, 16f)
                curveTo(4f, 15.448f, 4.448f, 15f, 5f, 15f)
                horizontalLineTo(7f)
                curveTo(7.552f, 15f, 8f, 15.448f, 8f, 16f)
                curveTo(8f, 16.552f, 7.552f, 17f, 7f, 17f)
                horizontalLineTo(5f)
                curveTo(4.448f, 17f, 4f, 16.552f, 4f, 16f)
                close()
            }
        }.build()
        return barsSort!!
    }

private var barsSort: ImageVector? = null