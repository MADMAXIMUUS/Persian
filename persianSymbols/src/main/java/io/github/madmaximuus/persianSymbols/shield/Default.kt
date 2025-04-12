package io.github.madmaximuus.persianSymbols.shield

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Shield: ImageVector
    get() {
        if (shield != null) {
            return shield!!
        }
        shield = ImageVector.Builder(
            name = "shield-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.658f, 3.06f)
                curveTo(11.879f, 2.98f, 12.121f, 2.98f, 12.342f, 3.06f)
                lineTo(20.342f, 5.969f)
                curveTo(20.737f, 6.113f, 21f, 6.489f, 21f, 6.909f)
                curveTo(21f, 12.695f, 17.733f, 18.012f, 12.479f, 20.878f)
                curveTo(12.18f, 21.041f, 11.82f, 21.041f, 11.521f, 20.878f)
                curveTo(6.267f, 18.012f, 3f, 12.695f, 3f, 6.909f)
                curveTo(3f, 6.489f, 3.263f, 6.113f, 3.658f, 5.969f)
                lineTo(11.658f, 3.06f)
                close()
                moveTo(5.018f, 7.603f)
                curveTo(5.257f, 12.178f, 7.847f, 16.386f, 12f, 18.85f)
                curveTo(16.153f, 16.386f, 18.743f, 12.178f, 18.982f, 7.603f)
                lineTo(12f, 5.064f)
                lineTo(5.018f, 7.603f)
                close()
            }
        }.build()

        return shield!!
    }

private var shield: ImageVector? = null