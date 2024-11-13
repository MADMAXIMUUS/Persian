package io.github.madmaximuus.persianSymbols.shield.check

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.ShieldCheck: ImageVector
    get() {
        if (shieldCheck != null) {
            return shieldCheck!!
        }
        shieldCheck = Builder(
            name = "shield-check-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.905f, 10.28f)
                curveTo(16.198f, 9.987f, 16.198f, 9.513f, 15.905f, 9.22f)
                curveTo(15.612f, 8.927f, 15.138f, 8.927f, 14.845f, 9.22f)
                lineTo(10.904f, 13.161f)
                lineTo(9.182f, 11.248f)
                curveTo(8.905f, 10.94f, 8.431f, 10.915f, 8.123f, 11.193f)
                curveTo(7.815f, 11.47f, 7.79f, 11.944f, 8.068f, 12.252f)
                lineTo(10.318f, 14.752f)
                curveTo(10.455f, 14.905f, 10.65f, 14.994f, 10.855f, 15f)
                curveTo(11.061f, 15.005f, 11.26f, 14.926f, 11.405f, 14.78f)
                lineTo(15.905f, 10.28f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.342f, 3.06f)
                curveTo(12.121f, 2.98f, 11.879f, 2.98f, 11.658f, 3.06f)
                lineTo(3.658f, 5.969f)
                curveTo(3.263f, 6.113f, 3f, 6.489f, 3f, 6.909f)
                curveTo(3f, 12.695f, 6.267f, 18.012f, 11.521f, 20.878f)
                curveTo(11.82f, 21.041f, 12.18f, 21.041f, 12.479f, 20.878f)
                curveTo(17.733f, 18.012f, 21f, 12.695f, 21f, 6.909f)
                curveTo(21f, 6.489f, 20.737f, 6.113f, 20.342f, 5.969f)
                lineTo(12.342f, 3.06f)
                close()
                moveTo(12f, 18.85f)
                curveTo(7.847f, 16.386f, 5.257f, 12.178f, 5.018f, 7.603f)
                lineTo(12f, 5.064f)
                lineTo(18.982f, 7.603f)
                curveTo(18.743f, 12.178f, 16.153f, 16.386f, 12f, 18.85f)
                close()
            }
        }.build()
        return shieldCheck!!
    }

private var shieldCheck: ImageVector? = null