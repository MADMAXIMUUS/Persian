package io.github.madmaximuus.persianSymbols.pen

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.Pen: ImageVector
    get() {
        if (pen != null) {
            return pen!!
        }
        pen = Builder(
            name = "pen-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.061f, 3.061f)
                lineTo(21.182f, 5.182f)
                curveTo(21.768f, 5.768f, 21.768f, 6.718f, 21.182f, 7.303f)
                lineTo(20.066f, 8.419f)
                lineTo(15.824f, 4.176f)
                lineTo(16.939f, 3.061f)
                curveTo(17.525f, 2.475f, 18.475f, 2.475f, 19.061f, 3.061f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.763f, 5.237f)
                lineTo(3.334f, 16.666f)
                curveTo(3.177f, 16.823f, 3.077f, 17.028f, 3.049f, 17.248f)
                lineTo(2.64f, 20.485f)
                curveTo(2.559f, 21.133f, 3.11f, 21.684f, 3.758f, 21.602f)
                lineTo(6.995f, 21.194f)
                curveTo(7.215f, 21.166f, 7.42f, 21.066f, 7.577f, 20.909f)
                lineTo(19.006f, 9.48f)
                lineTo(14.763f, 5.237f)
                close()
            }
        }.build()
        return pen!!
    }

private var pen: ImageVector? = null