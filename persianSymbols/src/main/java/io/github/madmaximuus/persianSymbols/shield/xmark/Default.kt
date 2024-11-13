package io.github.madmaximuus.persianSymbols.shield.xmark

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.ShieldXMark: ImageVector
    get() {
        if (shieldXMark != null) {
            return shieldXMark!!
        }
        shieldXMark = Builder(
            name = "shield-xmark-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.995f, 8.16f)
                curveTo(9.289f, 7.868f, 9.765f, 7.869f, 10.057f, 8.162f)
                lineTo(12f, 10.105f)
                lineTo(13.943f, 8.162f)
                curveTo(14.235f, 7.869f, 14.711f, 7.868f, 15.005f, 8.16f)
                curveTo(15.299f, 8.452f, 15.3f, 8.926f, 15.007f, 9.219f)
                lineTo(13.061f, 11.165f)
                lineTo(15.007f, 13.112f)
                curveTo(15.3f, 13.405f, 15.299f, 13.879f, 15.005f, 14.17f)
                curveTo(14.711f, 14.462f, 14.235f, 14.461f, 13.942f, 14.168f)
                lineTo(12f, 12.226f)
                lineTo(10.057f, 14.168f)
                curveTo(9.765f, 14.461f, 9.289f, 14.462f, 8.995f, 14.17f)
                curveTo(8.701f, 13.879f, 8.7f, 13.405f, 8.993f, 13.112f)
                lineTo(10.939f, 11.165f)
                lineTo(8.993f, 9.219f)
                curveTo(8.7f, 8.926f, 8.701f, 8.452f, 8.995f, 8.16f)
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
        return shieldXMark!!
    }

private var shieldXMark: ImageVector? = null