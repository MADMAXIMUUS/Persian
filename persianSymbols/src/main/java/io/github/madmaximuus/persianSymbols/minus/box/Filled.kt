package io.github.madmaximuus.persianSymbols.minus.box

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.MinusBox: ImageVector
    get() {
        if (minusBox != null) {
            return minusBox!!
        }
        minusBox = Builder(
            name = "minus-box-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.4f, 3f)
                curveTo(4.97f, 3f, 3f, 4.97f, 3f, 7.4f)
                verticalLineTo(16.6f)
                curveTo(3f, 19.03f, 4.97f, 21f, 7.4f, 21f)
                horizontalLineTo(16.6f)
                curveTo(19.03f, 21f, 21f, 19.03f, 21f, 16.6f)
                verticalLineTo(7.4f)
                curveTo(21f, 4.97f, 19.03f, 3f, 16.6f, 3f)
                horizontalLineTo(7.4f)
                close()
                moveTo(8.5f, 11.25f)
                curveTo(8.086f, 11.25f, 7.75f, 11.586f, 7.75f, 12f)
                curveTo(7.75f, 12.414f, 8.086f, 12.75f, 8.5f, 12.75f)
                horizontalLineTo(15.5f)
                curveTo(15.914f, 12.75f, 16.25f, 12.414f, 16.25f, 12f)
                curveTo(16.25f, 11.586f, 15.914f, 11.25f, 15.5f, 11.25f)
                horizontalLineTo(8.5f)
                close()
            }
        }.build()
        return minusBox!!
    }

private var minusBox: ImageVector? = null