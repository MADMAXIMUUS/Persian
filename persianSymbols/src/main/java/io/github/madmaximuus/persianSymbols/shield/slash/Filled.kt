package io.github.madmaximuus.persianSymbols.shield.slash

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.ShieldSlash: ImageVector
    get() {
        if (shieldSlash != null) {
            return shieldSlash!!
        }
        shieldSlash = ImageVector.Builder(
            name = "shield-slash-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.707f, 2.293f)
                curveTo(3.317f, 1.902f, 2.683f, 1.902f, 2.293f, 2.293f)
                curveTo(1.902f, 2.683f, 1.902f, 3.317f, 2.293f, 3.707f)
                lineTo(20.293f, 21.707f)
                curveTo(20.683f, 22.098f, 21.317f, 22.098f, 21.707f, 21.707f)
                curveTo(22.098f, 21.317f, 22.098f, 20.683f, 21.707f, 20.293f)
                lineTo(3.707f, 2.293f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.015f, 6.973f)
                curveTo(2.998f, 6.579f, 3.232f, 6.223f, 3.588f, 6.062f)
                lineTo(15.777f, 18.251f)
                curveTo(14.794f, 19.188f, 13.689f, 20.022f, 12.475f, 20.732f)
                curveTo(12.182f, 20.903f, 11.818f, 20.903f, 11.525f, 20.732f)
                curveTo(6.446f, 17.762f, 3.26f, 12.604f, 3.015f, 6.973f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.985f, 6.973f)
                curveTo(20.849f, 10.085f, 19.816f, 13.052f, 18.061f, 15.586f)
                lineTo(7.215f, 4.74f)
                lineTo(11.658f, 3.124f)
                curveTo(11.879f, 3.044f, 12.121f, 3.044f, 12.342f, 3.124f)
                lineTo(20.342f, 6.033f)
                curveTo(20.737f, 6.177f, 21.003f, 6.553f, 20.985f, 6.973f)
                close()
            }
        }.build()

        return shieldSlash!!
    }

private var shieldSlash: ImageVector? = null