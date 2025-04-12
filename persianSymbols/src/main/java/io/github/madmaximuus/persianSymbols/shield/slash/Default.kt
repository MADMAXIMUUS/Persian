package io.github.madmaximuus.persianSymbols.shield.slash

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.ShieldSlash: ImageVector
    get() {
        if (shieldSlash != null) {
            return shieldSlash!!
        }
        shieldSlash = ImageVector.Builder(
            name = "shield-slash-default",
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
                moveTo(3f, 6.909f)
                curveTo(3f, 6.53f, 3.213f, 6.188f, 3.544f, 6.019f)
                lineTo(5.099f, 7.574f)
                lineTo(5.018f, 7.603f)
                curveTo(5.257f, 12.178f, 7.847f, 16.386f, 12f, 18.85f)
                curveTo(12.915f, 18.307f, 13.753f, 17.68f, 14.508f, 16.983f)
                lineTo(15.923f, 18.398f)
                curveTo(14.903f, 19.349f, 13.749f, 20.185f, 12.479f, 20.878f)
                curveTo(12.18f, 21.041f, 11.82f, 21.041f, 11.521f, 20.878f)
                curveTo(6.267f, 18.012f, 3f, 12.695f, 3f, 6.909f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.982f, 7.603f)
                curveTo(18.857f, 10.003f, 18.084f, 12.303f, 16.778f, 14.302f)
                lineTo(18.219f, 15.743f)
                curveTo(20.001f, 13.166f, 21f, 10.109f, 21f, 6.909f)
                curveTo(21f, 6.489f, 20.737f, 6.113f, 20.342f, 5.969f)
                lineTo(12.342f, 3.06f)
                curveTo(12.121f, 2.98f, 11.879f, 2.98f, 11.658f, 3.06f)
                lineTo(7.168f, 4.693f)
                lineTo(8.729f, 6.254f)
                lineTo(12f, 5.064f)
                lineTo(18.982f, 7.603f)
                close()
            }
        }.build()

        return shieldSlash!!
    }

private var shieldSlash: ImageVector? = null