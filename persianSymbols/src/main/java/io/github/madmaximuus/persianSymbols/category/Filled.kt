package io.github.madmaximuus.persianSymbols.category

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.Category: ImageVector
    get() {
        if (category != null) {
            return category!!
        }
        category = Builder(
            name = "category-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.083f, 11f)
                horizontalLineTo(15.917f)
                curveTo(16.389f, 11f, 16.676f, 10.482f, 16.426f, 10.082f)
                lineTo(12.509f, 3.814f)
                curveTo(12.274f, 3.438f, 11.726f, 3.438f, 11.491f, 3.814f)
                lineTo(7.574f, 10.082f)
                curveTo(7.324f, 10.482f, 7.611f, 11f, 8.083f, 11f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.5f, 14.8f)
                curveTo(3.5f, 13.254f, 4.754f, 12f, 6.3f, 12f)
                horizontalLineTo(8.7f)
                curveTo(10.246f, 12f, 11.5f, 13.254f, 11.5f, 14.8f)
                verticalLineTo(17.2f)
                curveTo(11.5f, 18.746f, 10.246f, 20f, 8.7f, 20f)
                horizontalLineTo(6.3f)
                curveTo(4.754f, 20f, 3.5f, 18.746f, 3.5f, 17.2f)
                verticalLineTo(14.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.5f, 16f)
                curveTo(20.5f, 18.209f, 18.709f, 20f, 16.5f, 20f)
                curveTo(14.291f, 20f, 12.5f, 18.209f, 12.5f, 16f)
                curveTo(12.5f, 13.791f, 14.291f, 12f, 16.5f, 12f)
                curveTo(18.709f, 12f, 20.5f, 13.791f, 20.5f, 16f)
                close()
            }
        }.build()
        return category!!
    }

private var category: ImageVector? = null