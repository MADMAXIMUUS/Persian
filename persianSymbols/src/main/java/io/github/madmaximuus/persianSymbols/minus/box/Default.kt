package io.github.madmaximuus.persianSymbols.minus.box

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.MinusBox: ImageVector
    get() {
        if (minusBox != null) {
            return minusBox!!
        }
        minusBox = Builder(
            name = "minus-box-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.5f, 11.25f)
                curveTo(8.086f, 11.25f, 7.75f, 11.586f, 7.75f, 12f)
                curveTo(7.75f, 12.414f, 8.086f, 12.75f, 8.5f, 12.75f)
                horizontalLineTo(15.5f)
                curveTo(15.914f, 12.75f, 16.25f, 12.414f, 16.25f, 12f)
                curveTo(16.25f, 11.586f, 15.914f, 11.25f, 15.5f, 11.25f)
                horizontalLineTo(8.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.499f, 3f)
                curveTo(5.014f, 3f, 2.999f, 5.015f, 2.999f, 7.5f)
                verticalLineTo(16.5f)
                curveTo(2.999f, 18.985f, 5.014f, 21f, 7.499f, 21f)
                horizontalLineTo(16.499f)
                curveTo(18.984f, 21f, 20.999f, 18.985f, 20.999f, 16.5f)
                verticalLineTo(7.5f)
                curveTo(20.999f, 5.015f, 18.984f, 3f, 16.499f, 3f)
                horizontalLineTo(7.499f)
                close()
                moveTo(4.999f, 7.5f)
                curveTo(4.999f, 6.119f, 6.118f, 5f, 7.499f, 5f)
                horizontalLineTo(16.499f)
                curveTo(17.88f, 5f, 18.999f, 6.119f, 18.999f, 7.5f)
                verticalLineTo(16.5f)
                curveTo(18.999f, 17.881f, 17.88f, 19f, 16.499f, 19f)
                horizontalLineTo(7.499f)
                curveTo(6.118f, 19f, 4.999f, 17.881f, 4.999f, 16.5f)
                verticalLineTo(7.5f)
                close()
            }
        }.build()
        return minusBox!!
    }

private var minusBox: ImageVector? = null