package io.github.madmaximuus.persianSymbols.shield.exclamation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.ShieldExclamation: ImageVector
    get() {
        if (shieldExclamation != null) {
            return shieldExclamation!!
        }
        shieldExclamation = Builder(
            name = "shield-exclamation-filled",
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
                moveTo(12f, 7.205f)
                curveTo(12.414f, 7.205f, 12.75f, 7.541f, 12.75f, 7.955f)
                lineTo(12.75f, 13.429f)
                curveTo(12.75f, 13.843f, 12.414f, 14.179f, 12f, 14.179f)
                curveTo(11.586f, 14.179f, 11.25f, 13.843f, 11.25f, 13.429f)
                lineTo(11.25f, 7.955f)
                curveTo(11.25f, 7.541f, 11.586f, 7.205f, 12f, 7.205f)
                close()
                moveTo(13.002f, 15.795f)
                curveTo(13.002f, 16.347f, 12.554f, 16.795f, 12.002f, 16.795f)
                curveTo(11.45f, 16.795f, 11.002f, 16.347f, 11.002f, 15.795f)
                curveTo(11.002f, 15.243f, 11.45f, 14.795f, 12.002f, 14.795f)
                curveTo(12.554f, 14.795f, 13.002f, 15.243f, 13.002f, 15.795f)
                close()
            }
        }.build()
        return shieldExclamation!!
    }

private var shieldExclamation: ImageVector? = null