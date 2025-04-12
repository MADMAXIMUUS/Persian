package io.github.madmaximuus.persianSymbols.quote.opening

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.QuoteOpening: ImageVector
    get() {
        if (quoteOpening != null) {
            return quoteOpening!!
        }
        quoteOpening = ImageVector.Builder(
            name = "quote-opening-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.895f, 6.553f)
                curveTo(9.142f, 7.047f, 8.941f, 7.648f, 8.447f, 7.895f)
                curveTo(7.048f, 8.594f, 6.242f, 9.399f, 5.764f, 10.194f)
                curveTo(6.153f, 10.068f, 6.569f, 10f, 7f, 10f)
                curveTo(9.209f, 10f, 11f, 11.791f, 11f, 14f)
                curveTo(11f, 16.209f, 9.209f, 18f, 7f, 18f)
                curveTo(4.791f, 18f, 3f, 16.209f, 3f, 14f)
                lineTo(3f, 13.969f)
                lineTo(3f, 13.955f)
                curveTo(3f, 12.971f, 3f, 11.558f, 3.572f, 10.129f)
                curveTo(4.17f, 8.632f, 5.353f, 7.206f, 7.553f, 6.106f)
                curveTo(8.047f, 5.859f, 8.648f, 6.059f, 8.895f, 6.553f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.895f, 6.553f)
                curveTo(19.142f, 7.047f, 18.941f, 7.648f, 18.447f, 7.895f)
                curveTo(17.047f, 8.594f, 16.242f, 9.399f, 15.764f, 10.195f)
                curveTo(16.153f, 10.068f, 16.569f, 10f, 17f, 10f)
                curveTo(19.209f, 10f, 21f, 11.791f, 21f, 14f)
                curveTo(21f, 16.209f, 19.209f, 18f, 17f, 18f)
                curveTo(14.791f, 18f, 13f, 16.209f, 13f, 14f)
                lineTo(13f, 13.969f)
                lineTo(13f, 13.955f)
                curveTo(13f, 12.971f, 13f, 11.558f, 13.572f, 10.129f)
                curveTo(14.17f, 8.632f, 15.353f, 7.206f, 17.553f, 6.106f)
                curveTo(18.047f, 5.859f, 18.648f, 6.059f, 18.895f, 6.553f)
                close()
            }
        }.build()

        return quoteOpening!!
    }

private var quoteOpening: ImageVector? = null