package io.github.madmaximuus.persianSymbols.moon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Moon: ImageVector
    get() {
        if (moon != null) {
            return moon!!
        }
        moon = Builder(
            name = "moon-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20.823f, 13.783f)
                curveTo(19.465f, 15.152f, 17.581f, 16f, 15.5f, 16f)
                curveTo(11.358f, 16f, 8f, 12.642f, 8f, 8.5f)
                curveTo(8f, 6.419f, 8.848f, 4.535f, 10.217f, 3.177f)
                curveTo(6.1f, 4.004f, 3f, 7.64f, 3f, 12f)
                curveTo(3f, 16.97f, 7.029f, 21f, 12f, 21f)
                curveTo(16.36f, 21f, 19.996f, 17.899f, 20.823f, 13.783f)
                close()
            }
        }.build()
        return moon!!
    }

private var moon: ImageVector? = null
