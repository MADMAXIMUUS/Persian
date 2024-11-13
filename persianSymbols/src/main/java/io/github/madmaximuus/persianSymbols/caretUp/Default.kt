package io.github.madmaximuus.persianSymbols.caretUp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.CaretUp: ImageVector
    get() {
        if (caretUp != null) {
            return caretUp!!
        }
        caretUp = Builder(
            name = "caret-up-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.305f, 13.091f)
                curveTo(9.023f, 13.091f, 8.893f, 12.702f, 9.106f, 12.497f)
                lineTo(11.801f, 9.901f)
                curveTo(11.915f, 9.791f, 12.085f, 9.791f, 12.199f, 9.901f)
                lineTo(14.894f, 12.497f)
                curveTo(15.107f, 12.702f, 14.977f, 13.091f, 14.695f, 13.091f)
                lineTo(9.305f, 13.091f)
                close()
            }
        }.build()
        return caretUp!!
    }

private var caretUp: ImageVector? = null