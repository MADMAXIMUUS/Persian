package io.github.madmaximuus.persianSymbols.exclamation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Exclamation: ImageVector
    get() {
        if (exclamation != null) {
            return exclamation!!
        }
        exclamation = Builder(
            name = "exclamation-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13f, 3.5f)
                curveTo(13f, 2.948f, 12.552f, 2.5f, 12f, 2.5f)
                curveTo(11.448f, 2.5f, 11f, 2.948f, 11f, 3.5f)
                lineTo(11f, 16.5f)
                curveTo(11f, 17.052f, 11.448f, 17.5f, 12f, 17.5f)
                curveTo(12.552f, 17.5f, 13f, 17.052f, 13f, 16.5f)
                lineTo(13f, 3.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 21.5f)
                curveTo(12.69f, 21.5f, 13.25f, 20.94f, 13.25f, 20.25f)
                curveTo(13.25f, 19.56f, 12.69f, 19f, 12f, 19f)
                curveTo(11.31f, 19f, 10.75f, 19.56f, 10.75f, 20.25f)
                curveTo(10.75f, 20.94f, 11.31f, 21.5f, 12f, 21.5f)
                close()
            }
        }.build()
        return exclamation!!
    }

private var exclamation: ImageVector? = null