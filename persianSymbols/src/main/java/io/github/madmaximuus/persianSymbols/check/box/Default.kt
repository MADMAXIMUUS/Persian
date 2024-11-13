package io.github.madmaximuus.persianSymbols.check.box

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.CheckBox: ImageVector
    get() {
        if (checkBox != null) {
            return checkBox!!
        }
        checkBox = ImageVector.Builder(
            name = "check-box-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.027f, 8.468f)
                curveTo(17.322f, 8.759f, 17.322f, 9.232f, 17.027f, 9.523f)
                lineTo(11.111f, 15.386f)
                curveTo(10.95f, 15.546f, 10.733f, 15.618f, 10.521f, 15.603f)
                curveTo(10.31f, 15.619f, 10.092f, 15.547f, 9.93f, 15.386f)
                lineTo(6.972f, 12.455f)
                curveTo(6.678f, 12.163f, 6.678f, 11.691f, 6.972f, 11.399f)
                curveTo(7.266f, 11.108f, 7.743f, 11.108f, 8.037f, 11.399f)
                lineTo(10.521f, 13.86f)
                lineTo(15.962f, 8.468f)
                curveTo(16.256f, 8.176f, 16.733f, 8.176f, 17.027f, 8.468f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.5f, 3f)
                curveTo(5.015f, 3f, 3f, 5.015f, 3f, 7.5f)
                verticalLineTo(16.5f)
                curveTo(3f, 18.985f, 5.015f, 21f, 7.5f, 21f)
                horizontalLineTo(16.5f)
                curveTo(18.985f, 21f, 21f, 18.985f, 21f, 16.5f)
                verticalLineTo(7.5f)
                curveTo(21f, 5.015f, 18.985f, 3f, 16.5f, 3f)
                horizontalLineTo(7.5f)
                close()
                moveTo(5f, 7.5f)
                curveTo(5f, 6.119f, 6.119f, 5f, 7.5f, 5f)
                horizontalLineTo(16.5f)
                curveTo(17.881f, 5f, 19f, 6.119f, 19f, 7.5f)
                verticalLineTo(16.5f)
                curveTo(19f, 17.881f, 17.881f, 19f, 16.5f, 19f)
                horizontalLineTo(7.5f)
                curveTo(6.119f, 19f, 5f, 17.881f, 5f, 16.5f)
                verticalLineTo(7.5f)
                close()
            }
        }.build()
        return checkBox!!
    }

private var checkBox: ImageVector? = null