package io.github.madmaximuus.persianSymbols.sigmal

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Signal: ImageVector
    get() {
        if (signal != null) {
            return signal!!
        }
        signal = ImageVector.Builder(
            name = "signal-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21f, 3f)
                curveTo(21f, 2.448f, 20.552f, 2f, 20f, 2f)
                curveTo(19.448f, 2f, 19f, 2.448f, 19f, 3f)
                verticalLineTo(21f)
                curveTo(19f, 21.552f, 19.448f, 22f, 20f, 22f)
                curveTo(20.552f, 22f, 21f, 21.552f, 21f, 21f)
                verticalLineTo(3f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 6f)
                curveTo(16.552f, 6f, 17f, 6.448f, 17f, 7f)
                verticalLineTo(21f)
                curveTo(17f, 21.552f, 16.552f, 22f, 16f, 22f)
                curveTo(15.448f, 22f, 15f, 21.552f, 15f, 21f)
                verticalLineTo(7f)
                curveTo(15f, 6.448f, 15.448f, 6f, 16f, 6f)
                close()
            }
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
        return signal!!
    }

private var signal: ImageVector? = null