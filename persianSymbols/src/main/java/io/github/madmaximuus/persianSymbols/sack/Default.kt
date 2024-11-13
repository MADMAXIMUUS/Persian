package io.github.madmaximuus.persianSymbols.sack

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Sack: ImageVector
    get() {
        if (sack != null) {
            return sack!!
        }
        sack = ImageVector.Builder(
            name = "sack-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.639f, 6.513f)
                lineTo(7.54f, 4.316f)
                curveTo(7.008f, 3.252f, 7.781f, 2f, 8.971f, 2f)
                horizontalLineTo(15.029f)
                curveTo(16.219f, 2f, 16.992f, 3.252f, 16.46f, 4.316f)
                lineTo(15.361f, 6.513f)
                curveTo(16.968f, 7.274f, 18.039f, 8.781f, 18.718f, 10.353f)
                curveTo(19.689f, 12.601f, 20f, 15.247f, 20f, 17f)
                verticalLineTo(17.5f)
                curveTo(20f, 19.985f, 17.985f, 22f, 15.5f, 22f)
                horizontalLineTo(8.5f)
                curveTo(6.015f, 22f, 4f, 19.985f, 4f, 17.5f)
                verticalLineTo(17f)
                curveTo(4f, 15.247f, 4.311f, 12.601f, 5.282f, 10.353f)
                curveTo(5.961f, 8.781f, 7.032f, 7.274f, 8.639f, 6.513f)
                close()
                moveTo(10.618f, 6f)
                lineTo(9.618f, 4f)
                horizontalLineTo(14.382f)
                lineTo(13.382f, 6f)
                horizontalLineTo(10.618f)
                close()
                moveTo(11f, 8f)
                curveTo(9.184f, 8f, 7.949f, 9.223f, 7.118f, 11.147f)
                curveTo(6.289f, 13.066f, 6f, 15.42f, 6f, 17f)
                verticalLineTo(17.5f)
                curveTo(6f, 18.881f, 7.119f, 20f, 8.5f, 20f)
                horizontalLineTo(15.5f)
                curveTo(16.881f, 20f, 18f, 18.881f, 18f, 17.5f)
                verticalLineTo(17f)
                curveTo(18f, 15.42f, 17.711f, 13.066f, 16.882f, 11.147f)
                curveTo(16.051f, 9.223f, 14.816f, 8f, 13f, 8f)
                horizontalLineTo(11f)
                close()
            }
        }.build()

        return sack!!
    }

private var sack: ImageVector? = null
