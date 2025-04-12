package io.github.madmaximuus.persianSymbols.quote.closing

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.QuoteClosing: ImageVector
    get() {
        if (quoteClosing != null) {
            return quoteClosing!!
        }
        quoteClosing = ImageVector.Builder(
            name = "quote-closing-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5.105f, 17.447f)
                curveTo(4.858f, 16.953f, 5.059f, 16.352f, 5.553f, 16.105f)
                curveTo(6.952f, 15.405f, 7.758f, 14.601f, 8.236f, 13.805f)
                curveTo(7.847f, 13.932f, 7.431f, 14f, 7f, 14f)
                curveTo(4.791f, 14f, 3f, 12.209f, 3f, 10f)
                curveTo(3f, 7.791f, 4.791f, 6f, 7f, 6f)
                curveTo(9.209f, 6f, 11f, 7.791f, 11f, 10f)
                lineTo(11f, 10.031f)
                lineTo(11f, 10.045f)
                curveTo(11f, 11.029f, 11f, 12.441f, 10.428f, 13.871f)
                curveTo(9.83f, 15.367f, 8.647f, 16.794f, 6.447f, 17.894f)
                curveTo(5.953f, 18.141f, 5.352f, 17.941f, 5.105f, 17.447f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.105f, 17.447f)
                curveTo(14.858f, 16.953f, 15.059f, 16.352f, 15.553f, 16.105f)
                curveTo(16.953f, 15.406f, 17.758f, 14.601f, 18.236f, 13.805f)
                curveTo(17.847f, 13.932f, 17.431f, 14f, 17f, 14f)
                curveTo(14.791f, 14f, 13f, 12.209f, 13f, 10f)
                curveTo(13f, 7.791f, 14.791f, 6f, 17f, 6f)
                curveTo(19.209f, 6f, 21f, 7.791f, 21f, 10f)
                lineTo(21f, 10.031f)
                lineTo(21f, 10.045f)
                curveTo(21f, 11.029f, 21f, 12.442f, 20.428f, 13.871f)
                curveTo(19.83f, 15.368f, 18.647f, 16.794f, 16.447f, 17.894f)
                curveTo(15.953f, 18.141f, 15.352f, 17.941f, 15.105f, 17.447f)
                close()
            }
        }.build()

        return quoteClosing!!
    }

private var quoteClosing: ImageVector? = null