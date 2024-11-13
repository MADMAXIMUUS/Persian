package io.github.madmaximuus.persianSymbols.bars

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Bars: ImageVector
    get() {
        if (bars != null) {
            return bars!!
        }
        bars = ImageVector.Builder(
            name = "bars-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4.89f, 6f)
                curveTo(4.399f, 6f, 4.001f, 6.448f, 4.001f, 7f)
                curveTo(4.001f, 7.552f, 4.399f, 8f, 4.89f, 8f)
                horizontalLineTo(19.111f)
                curveTo(19.602f, 8f, 20f, 7.552f, 20f, 7f)
                curveTo(20f, 6.448f, 19.602f, 6f, 19.111f, 6f)
                horizontalLineTo(4.89f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4f, 12f)
                curveTo(4f, 11.448f, 4.398f, 11f, 4.889f, 11f)
                horizontalLineTo(19.11f)
                curveTo(19.601f, 11f, 19.999f, 11.448f, 19.999f, 12f)
                curveTo(19.999f, 12.552f, 19.601f, 13f, 19.11f, 13f)
                horizontalLineTo(4.889f)
                curveTo(4.398f, 13f, 4f, 12.552f, 4f, 12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4.001f, 17f)
                curveTo(4.001f, 16.448f, 4.399f, 16f, 4.89f, 16f)
                horizontalLineTo(19.111f)
                curveTo(19.602f, 16f, 20f, 16.448f, 20f, 17f)
                curveTo(20f, 17.552f, 19.602f, 18f, 19.111f, 18f)
                horizontalLineTo(4.89f)
                curveTo(4.399f, 18f, 4.001f, 17.552f, 4.001f, 17f)
                close()
            }
        }.build()
        return bars!!
    }

private var bars: ImageVector? = null