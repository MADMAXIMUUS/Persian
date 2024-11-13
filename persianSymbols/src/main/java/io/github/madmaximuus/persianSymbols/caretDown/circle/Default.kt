package io.github.madmaximuus.persianSymbols.caretDown.circle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.CaretDownCircle: ImageVector
    get() {
        if (caretDownCircle != null) {
            return caretDownCircle!!
        }
        caretDownCircle = Builder(
            name = "caret-down-circle-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.894f, 11.594f)
                curveTo(15.107f, 11.389f, 14.977f, 11f, 14.695f, 11f)
                horizontalLineTo(9.305f)
                curveTo(9.023f, 11f, 8.893f, 11.389f, 9.106f, 11.594f)
                lineTo(11.801f, 14.19f)
                curveTo(11.915f, 14.3f, 12.085f, 14.3f, 12.199f, 14.19f)
                lineTo(14.894f, 11.594f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
                curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                close()
                moveTo(4f, 12f)
                curveTo(4f, 7.582f, 7.582f, 4f, 12f, 4f)
                curveTo(16.418f, 4f, 20f, 7.582f, 20f, 12f)
                curveTo(20f, 16.418f, 16.418f, 20f, 12f, 20f)
                curveTo(7.582f, 20f, 4f, 16.418f, 4f, 12f)
                close()
            }
        }.build()
        return caretDownCircle!!
    }

private var caretDownCircle: ImageVector? = null