package io.github.madmaximuus.persianSymbols.caret.down

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.CaretDown: ImageVector
    get() {
        if (caretDown != null) {
            return caretDown!!
        }
        caretDown = ImageVector.Builder(
            name = "caret-down-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14.695f, 9.909f)
                curveTo(14.977f, 9.909f, 15.107f, 10.298f, 14.894f, 10.503f)
                lineTo(12.199f, 13.099f)
                curveTo(12.085f, 13.209f, 11.915f, 13.209f, 11.801f, 13.099f)
                lineTo(9.106f, 10.503f)
                curveTo(8.893f, 10.298f, 9.023f, 9.909f, 9.305f, 9.909f)
                lineTo(14.695f, 9.909f)
                close()
            }
        }.build()
        return caretDown!!
    }

private var caretDown: ImageVector? = null