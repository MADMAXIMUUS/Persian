package io.github.madmaximuus.persianSymbols.caret.right

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.CaretRight: ImageVector
    get() {
        if (caretRight != null) {
            return caretRight!!
        }
        caretRight = Builder(
            name = "caret-right-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.909f, 8.305f)
                curveTo(10.909f, 8.023f, 11.298f, 7.893f, 11.503f, 8.106f)
                lineTo(14.099f, 10.801f)
                curveTo(14.209f, 10.915f, 14.209f, 11.085f, 14.099f, 11.199f)
                lineTo(11.503f, 13.894f)
                curveTo(11.298f, 14.107f, 10.909f, 13.977f, 10.909f, 13.695f)
                lineTo(10.909f, 8.305f)
                close()
            }
        }.build()
        return caretRight!!
    }

private var caretRight: ImageVector? = null