package io.github.madmaximuus.persianSymbols.sigmal.two

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Signal2: ImageVector
    get() {
        if (signal2 != null) {
            return signal2!!
        }
        signal2 = Builder(
            name = "signal-2-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9f, 15f)
                curveTo(9f, 14.448f, 8.552f, 14f, 8f, 14f)
                curveTo(7.448f, 14f, 7f, 14.448f, 7f, 15f)
                verticalLineTo(21f)
                curveTo(7f, 21.552f, 7.448f, 22f, 8f, 22f)
                curveTo(8.552f, 22f, 9f, 21.552f, 9f, 21f)
                verticalLineTo(15f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5f, 19f)
                curveTo(5f, 18.448f, 4.552f, 18f, 4f, 18f)
                curveTo(3.448f, 18f, 3f, 18.448f, 3f, 19f)
                verticalLineTo(21f)
                curveTo(3f, 21.552f, 3.448f, 22f, 4f, 22f)
                curveTo(4.552f, 22f, 5f, 21.552f, 5f, 21f)
                verticalLineTo(19f)
                close()
            }
        }.build()
        return signal2!!
    }

private var signal2: ImageVector? = null