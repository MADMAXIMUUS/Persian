package io.github.madmaximuus.persianSymbols.compress

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Compress: ImageVector
    get() {
        if (compress != null) {
            return compress!!
        }
        compress = Builder(
            name = "compress-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9f, 4f)
                curveTo(9f, 3.448f, 8.552f, 3f, 8f, 3f)
                curveTo(7.448f, 3f, 7f, 3.448f, 7f, 4f)
                verticalLineTo(7f)
                horizontalLineTo(4f)
                curveTo(3.448f, 7f, 3f, 7.448f, 3f, 8f)
                curveTo(3f, 8.552f, 3.448f, 9f, 4f, 9f)
                horizontalLineTo(7f)
                curveTo(8.105f, 9f, 9f, 8.105f, 9f, 7f)
                verticalLineTo(4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.999f, 9f)
                curveTo(20.551f, 9f, 20.999f, 8.552f, 20.999f, 8f)
                curveTo(20.999f, 7.448f, 20.551f, 7f, 19.999f, 7f)
                horizontalLineTo(16.999f)
                verticalLineTo(4f)
                curveTo(16.999f, 3.448f, 16.551f, 3f, 15.999f, 3f)
                curveTo(15.447f, 3f, 14.999f, 3.448f, 14.999f, 4f)
                verticalLineTo(7f)
                curveTo(14.999f, 8.105f, 15.894f, 9f, 16.999f, 9f)
                horizontalLineTo(19.999f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 21f)
                curveTo(15.448f, 21f, 15f, 20.552f, 15f, 20f)
                verticalLineTo(17f)
                curveTo(15f, 15.895f, 15.895f, 15f, 17f, 15f)
                horizontalLineTo(20f)
                curveTo(20.552f, 15f, 21f, 15.448f, 21f, 16f)
                curveTo(21f, 16.552f, 20.552f, 17f, 20f, 17f)
                horizontalLineTo(17f)
                verticalLineTo(20f)
                curveTo(17f, 20.552f, 16.552f, 21f, 16f, 21f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.999f, 15f)
                curveTo(3.447f, 15f, 2.999f, 15.448f, 2.999f, 16f)
                curveTo(2.999f, 16.552f, 3.447f, 17f, 3.999f, 17f)
                horizontalLineTo(6.999f)
                verticalLineTo(20f)
                curveTo(6.999f, 20.552f, 7.447f, 21f, 7.999f, 21f)
                curveTo(8.551f, 21f, 8.999f, 20.552f, 8.999f, 20f)
                verticalLineTo(17f)
                curveTo(8.999f, 15.895f, 8.104f, 15f, 6.999f, 15f)
                horizontalLineTo(3.999f)
                close()
            }
        }.build()
        return compress!!
    }

private var compress: ImageVector? = null