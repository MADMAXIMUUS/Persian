package io.github.madmaximuus.persianSymbols.trash.check

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.TrashCheckFilled: ImageVector
    get() {
        if (trashCheck != null) {
            return trashCheck!!
        }
        trashCheck = ImageVector.Builder(
            name = "trash-check-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 2.5f)
                curveTo(7.448f, 2.5f, 7f, 2.948f, 7f, 3.5f)
                lineTo(4f, 3.5f)
                curveTo(3.448f, 3.5f, 3f, 3.948f, 3f, 4.5f)
                curveTo(3f, 5.053f, 3.448f, 5.5f, 4f, 5.5f)
                verticalLineTo(17.1f)
                curveTo(4f, 19.53f, 5.97f, 21.5f, 8.4f, 21.5f)
                horizontalLineTo(15.6f)
                curveTo(18.03f, 21.5f, 20f, 19.53f, 20f, 17.1f)
                verticalLineTo(5.5f)
                curveTo(20.552f, 5.5f, 21f, 5.053f, 21f, 4.5f)
                curveTo(21f, 3.948f, 20.552f, 3.5f, 20f, 3.5f)
                horizontalLineTo(17f)
                curveTo(17f, 2.948f, 16.552f, 2.5f, 16f, 2.5f)
                horizontalLineTo(8f)
                close()
                moveTo(17.027f, 8.468f)
                curveTo(17.322f, 8.759f, 17.322f, 9.232f, 17.027f, 9.523f)
                lineTo(11.111f, 15.386f)
                curveTo(10.95f, 15.546f, 10.733f, 15.618f, 10.521f, 15.602f)
                curveTo(10.31f, 15.619f, 10.092f, 15.547f, 9.93f, 15.386f)
                lineTo(6.972f, 12.455f)
                curveTo(6.678f, 12.163f, 6.678f, 11.691f, 6.972f, 11.399f)
                curveTo(7.266f, 11.107f, 7.743f, 11.107f, 8.037f, 11.399f)
                lineTo(10.521f, 13.86f)
                lineTo(15.962f, 8.468f)
                curveTo(16.256f, 8.176f, 16.733f, 8.176f, 17.027f, 8.468f)
                close()
            }
        }.build()

        return trashCheck!!
    }

private var trashCheck: ImageVector? = null
