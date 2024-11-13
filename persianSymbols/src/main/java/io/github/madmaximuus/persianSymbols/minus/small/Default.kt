package io.github.madmaximuus.persianSymbols.minus.small

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.MinusSmall: ImageVector
    get() {
        if (minusSmall != null) {
            return minusSmall!!
        }
        minusSmall = ImageVector.Builder(
            name = "minus-small-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.5f, 12f)
                curveTo(6.5f, 11.448f, 6.956f, 11f, 7.518f, 11f)
                horizontalLineTo(16.482f)
                curveTo(17.044f, 11f, 17.5f, 11.448f, 17.5f, 12f)
                curveTo(17.5f, 12.552f, 17.044f, 13f, 16.482f, 13f)
                horizontalLineTo(7.518f)
                curveTo(6.956f, 13f, 6.5f, 12.552f, 6.5f, 12f)
                close()
            }
        }.build()

        return minusSmall!!
    }

private var minusSmall: ImageVector? = null
