package io.github.madmaximuus.persianSymbols.shield.exclamation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.ShieldExclamation: ImageVector
    get() {
        if (shieldExclamation != null) {
            return shieldExclamation!!
        }
        shieldExclamation = Builder(
            name = "shield-exclamation-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 7.205f)
                curveTo(12.414f, 7.205f, 12.75f, 7.541f, 12.75f, 7.955f)
                lineTo(12.75f, 13.429f)
                curveTo(12.75f, 13.843f, 12.414f, 14.179f, 12f, 14.179f)
                curveTo(11.586f, 14.179f, 11.25f, 13.843f, 11.25f, 13.429f)
                lineTo(11.25f, 7.955f)
                curveTo(11.25f, 7.541f, 11.586f, 7.205f, 12f, 7.205f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.002f, 15.795f)
                curveTo(13.002f, 16.347f, 12.554f, 16.795f, 12.002f, 16.795f)
                curveTo(11.45f, 16.795f, 11.002f, 16.347f, 11.002f, 15.795f)
                curveTo(11.002f, 15.243f, 11.45f, 14.795f, 12.002f, 14.795f)
                curveTo(12.554f, 14.795f, 13.002f, 15.243f, 13.002f, 15.795f)
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
        return shieldExclamation!!
    }

private var shieldExclamation: ImageVector? = null