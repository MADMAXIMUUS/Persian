package io.github.madmaximuus.persianSymbols.sigmal.one

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Signal1: ImageVector
    get() {
        if (signal1 != null) {
            return signal1!!
        }
        signal1 = Builder(
            name = "signal-1-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4f, 18f)
                curveTo(4.552f, 18f, 5f, 18.448f, 5f, 19f)
                verticalLineTo(21f)
                curveTo(5f, 21.552f, 4.552f, 22f, 4f, 22f)
                curveTo(3.448f, 22f, 3f, 21.552f, 3f, 21f)
                verticalLineTo(19f)
                curveTo(3f, 18.448f, 3.448f, 18f, 4f, 18f)
                close()
            }
        }.build()
        return signal1!!
    }

private var signal1: ImageVector? = null