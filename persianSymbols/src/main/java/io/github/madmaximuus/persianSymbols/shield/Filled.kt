package io.github.madmaximuus.persianSymbols.shield

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.Shield: ImageVector
    get() {
        if (shield != null) {
            return shield!!
        }
        shield = ImageVector.Builder(
            name = "shield-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.658f, 3.124f)
                curveTo(11.879f, 3.044f, 12.121f, 3.044f, 12.342f, 3.124f)
                lineTo(20.342f, 6.033f)
                curveTo(20.737f, 6.177f, 21.003f, 6.553f, 20.985f, 6.973f)
                curveTo(20.74f, 12.604f, 17.554f, 17.762f, 12.475f, 20.732f)
                curveTo(12.182f, 20.903f, 11.818f, 20.903f, 11.525f, 20.732f)
                curveTo(6.446f, 17.762f, 3.26f, 12.604f, 3.015f, 6.973f)
                curveTo(2.997f, 6.553f, 3.263f, 6.177f, 3.658f, 6.033f)
                lineTo(11.658f, 3.124f)
                close()
            }
        }.build()

        return shield!!
    }

private var shield: ImageVector? = null