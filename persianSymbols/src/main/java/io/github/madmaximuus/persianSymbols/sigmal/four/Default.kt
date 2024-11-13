package io.github.madmaximuus.persianSymbols.sigmal.four

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Signal4: ImageVector
    get() {
        if (signal4 != null) {
            return signal4!!
        }
        signal4 = Builder(
            name = "signal-4-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 7f)
                curveTo(17f, 6.448f, 16.552f, 6f, 16f, 6f)
                curveTo(15.448f, 6f, 15f, 6.448f, 15f, 7f)
                verticalLineTo(21f)
                curveTo(15f, 21.552f, 15.448f, 22f, 16f, 22f)
                curveTo(16.552f, 22f, 17f, 21.552f, 17f, 21f)
                verticalLineTo(7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 10f)
                curveTo(12.552f, 10f, 13f, 10.448f, 13f, 11f)
                verticalLineTo(21f)
                curveTo(13f, 21.552f, 12.552f, 22f, 12f, 22f)
                curveTo(11.448f, 22f, 11f, 21.552f, 11f, 21f)
                verticalLineTo(11f)
                curveTo(11f, 10.448f, 11.448f, 10f, 12f, 10f)
                close()
            }
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
        return signal4!!
    }

private var signal4: ImageVector? = null