package io.github.madmaximuus.persianSymbols.category

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Category: ImageVector
    get() {
        if (category != null) {
            return category!!
        }
        category = Builder(
            name = "category-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.832f, 3.445f)
                curveTo(12.647f, 3.167f, 12.334f, 3f, 12f, 3f)
                curveTo(11.666f, 3f, 11.353f, 3.167f, 11.168f, 3.445f)
                lineTo(7.168f, 9.445f)
                curveTo(6.963f, 9.752f, 6.944f, 10.147f, 7.118f, 10.472f)
                curveTo(7.292f, 10.797f, 7.631f, 11f, 8f, 11f)
                horizontalLineTo(16f)
                curveTo(16.369f, 11f, 16.708f, 10.797f, 16.882f, 10.472f)
                curveTo(17.056f, 10.147f, 17.037f, 9.752f, 16.832f, 9.445f)
                lineTo(12.832f, 3.445f)
                close()
                moveTo(12f, 5.803f)
                lineTo(14.132f, 9f)
                horizontalLineTo(9.869f)
                lineTo(12f, 5.803f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.5f, 15.1f)
                curveTo(3.5f, 13.388f, 4.888f, 12f, 6.6f, 12f)
                horizontalLineTo(8.4f)
                curveTo(10.112f, 12f, 11.5f, 13.388f, 11.5f, 15.1f)
                verticalLineTo(16.9f)
                curveTo(11.5f, 18.612f, 10.112f, 20f, 8.4f, 20f)
                horizontalLineTo(6.6f)
                curveTo(4.888f, 20f, 3.5f, 18.612f, 3.5f, 16.9f)
                verticalLineTo(15.1f)
                close()
                moveTo(6.6f, 14f)
                curveTo(5.992f, 14f, 5.5f, 14.493f, 5.5f, 15.1f)
                verticalLineTo(16.9f)
                curveTo(5.5f, 17.507f, 5.992f, 18f, 6.6f, 18f)
                horizontalLineTo(8.4f)
                curveTo(9.008f, 18f, 9.5f, 17.507f, 9.5f, 16.9f)
                verticalLineTo(15.1f)
                curveTo(9.5f, 14.493f, 9.008f, 14f, 8.4f, 14f)
                horizontalLineTo(6.6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.5f, 16f)
                curveTo(12.5f, 13.791f, 14.291f, 12f, 16.5f, 12f)
                curveTo(18.709f, 12f, 20.5f, 13.791f, 20.5f, 16f)
                curveTo(20.5f, 18.209f, 18.709f, 20f, 16.5f, 20f)
                curveTo(14.291f, 20f, 12.5f, 18.209f, 12.5f, 16f)
                close()
                moveTo(16.5f, 14f)
                curveTo(15.395f, 14f, 14.5f, 14.895f, 14.5f, 16f)
                curveTo(14.5f, 17.105f, 15.395f, 18f, 16.5f, 18f)
                curveTo(17.605f, 18f, 18.5f, 17.105f, 18.5f, 16f)
                curveTo(18.5f, 14.895f, 17.605f, 14f, 16.5f, 14f)
                close()
            }
        }.build()
        return category!!
    }

private var category: ImageVector? = null