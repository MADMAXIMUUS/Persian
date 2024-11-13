package io.github.madmaximuus.persianSymbols.equalizer

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Equalizer: ImageVector
    get() {
        if (equalizer != null) {
            return equalizer!!
        }
        equalizer = Builder(
            name = "equalizer-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 3f)
                curveTo(16.552f, 3f, 17f, 3.448f, 17f, 4f)
                verticalLineTo(21f)
                curveTo(17f, 21.552f, 16.552f, 22f, 16f, 22f)
                curveTo(15.448f, 22f, 15f, 21.552f, 15f, 21f)
                verticalLineTo(4f)
                curveTo(15f, 3.448f, 15.448f, 3f, 16f, 3f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8f, 8f)
                curveTo(8.552f, 8f, 9f, 8.448f, 9f, 9f)
                verticalLineTo(21f)
                curveTo(9f, 21.552f, 8.552f, 22f, 8f, 22f)
                curveTo(7.448f, 22f, 7f, 21.552f, 7f, 21f)
                verticalLineTo(9f)
                curveTo(7f, 8.448f, 7.448f, 8f, 8f, 8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4f, 14f)
                curveTo(4.552f, 14f, 5f, 14.448f, 5f, 15f)
                verticalLineTo(21f)
                curveTo(5f, 21.552f, 4.552f, 22f, 4f, 22f)
                curveTo(3.448f, 22f, 3f, 21.552f, 3f, 21f)
                verticalLineTo(15f)
                curveTo(3f, 14.448f, 3.448f, 14f, 4f, 14f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13f, 12f)
                curveTo(13f, 11.448f, 12.552f, 11f, 12f, 11f)
                curveTo(11.448f, 11f, 11f, 11.448f, 11f, 12f)
                verticalLineTo(21f)
                curveTo(11f, 21.552f, 11.448f, 22f, 12f, 22f)
                curveTo(12.552f, 22f, 13f, 21.552f, 13f, 21f)
                verticalLineTo(12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21f, 18f)
                curveTo(21f, 17.448f, 20.552f, 17f, 20f, 17f)
                curveTo(19.448f, 17f, 19f, 17.448f, 19f, 18f)
                verticalLineTo(21f)
                curveTo(19f, 21.552f, 19.448f, 22f, 20f, 22f)
                curveTo(20.552f, 22f, 21f, 21.552f, 21f, 21f)
                verticalLineTo(18f)
                close()
            }
        }.build()
        return equalizer!!
    }

private var equalizer: ImageVector? = null