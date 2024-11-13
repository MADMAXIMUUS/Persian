package io.github.madmaximuus.persianSymbols.shield.check

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.ShieldCheck: ImageVector
    get() {
        if (shieldCheck != null) {
            return shieldCheck!!
        }
        shieldCheck = Builder(
            name = "shield-check-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.342f, 3.124f)
                curveTo(12.121f, 3.044f, 11.879f, 3.044f, 11.658f, 3.124f)
                lineTo(3.658f, 6.034f)
                curveTo(3.263f, 6.177f, 2.997f, 6.553f, 3.015f, 6.973f)
                curveTo(3.26f, 12.604f, 6.446f, 17.762f, 11.525f, 20.732f)
                curveTo(11.818f, 20.903f, 12.182f, 20.903f, 12.475f, 20.732f)
                curveTo(17.554f, 17.762f, 20.74f, 12.604f, 20.985f, 6.973f)
                curveTo(21.003f, 6.553f, 20.737f, 6.177f, 20.342f, 6.034f)
                lineTo(12.342f, 3.124f)
                close()
                moveTo(15.905f, 10.243f)
                curveTo(16.198f, 9.95f, 16.198f, 9.475f, 15.905f, 9.182f)
                curveTo(15.613f, 8.889f, 15.138f, 8.889f, 14.845f, 9.182f)
                lineTo(10.904f, 13.123f)
                lineTo(9.183f, 11.211f)
                curveTo(8.905f, 10.903f, 8.431f, 10.878f, 8.123f, 11.155f)
                curveTo(7.815f, 11.432f, 7.791f, 11.906f, 8.068f, 12.214f)
                lineTo(10.318f, 14.714f)
                curveTo(10.455f, 14.867f, 10.65f, 14.957f, 10.855f, 14.962f)
                curveTo(11.061f, 14.967f, 11.26f, 14.888f, 11.405f, 14.743f)
                lineTo(15.905f, 10.243f)
                close()
            }
        }.build()
        return shieldCheck!!
    }

private var shieldCheck: ImageVector? = null