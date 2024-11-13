package io.github.madmaximuus.persianSymbols.check.box

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.CheckBox: ImageVector
    get() {
        if (checkBox != null) {
            return checkBox!!
        }
        checkBox = ImageVector.Builder(
            name = "check-box-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
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
        }.build()
        return checkBox!!
    }

private var checkBox: ImageVector? = null