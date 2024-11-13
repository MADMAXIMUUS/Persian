package io.github.madmaximuus.persianSymbols.sigmal.three

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Signal3: ImageVector
    get() {
        if (signal3 != null) {
            return signal3!!
        }
        signal3 = Builder(
            name = "signal3-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13f, 11f)
                curveTo(13f, 10.448f, 12.552f, 10f, 12f, 10f)
                curveTo(11.448f, 10f, 11f, 10.448f, 11f, 11f)
                verticalLineTo(21f)
                curveTo(11f, 21.552f, 11.448f, 22f, 12f, 22f)
                curveTo(12.552f, 22f, 13f, 21.552f, 13f, 21f)
                verticalLineTo(11f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8f, 14f)
                curveTo(8.552f, 14f, 9f, 14.448f, 9f, 15f)
                verticalLineTo(21f)
                curveTo(9f, 21.552f, 8.552f, 22f, 8f, 22f)
                curveTo(7.448f, 22f, 7f, 21.552f, 7f, 21f)
                verticalLineTo(15f)
                curveTo(7f, 14.448f, 7.448f, 14f, 8f, 14f)
                close()
            }
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
        return signal3!!
    }

private var signal3: ImageVector? = null