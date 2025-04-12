package io.github.madmaximuus.persianSymbols.sack.add

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.SackAdd: ImageVector
    get() {
        if (sackAdd != null) {
            return sackAdd!!
        }
        sackAdd = ImageVector.Builder(
            name = "sack-add-default",
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
                curveTo(18.969f, 10.934f, 19.175f, 11.54f, 19.344f, 12.151f)
                curveTo(18.912f, 12.052f, 18.462f, 12f, 18f, 12f)
                curveTo(17.737f, 12f, 17.478f, 12.017f, 17.224f, 12.05f)
                curveTo(17.122f, 11.741f, 17.008f, 11.439f, 16.882f, 11.147f)
                curveTo(16.051f, 9.223f, 14.816f, 8f, 13f, 8f)
                horizontalLineTo(11f)
                curveTo(9.184f, 8f, 7.949f, 9.223f, 7.118f, 11.147f)
                curveTo(6.289f, 13.066f, 6f, 15.42f, 6f, 17f)
                verticalLineTo(17.5f)
                curveTo(6f, 18.881f, 7.119f, 20f, 8.5f, 20f)
                horizontalLineTo(12.341f)
                curveTo(12.605f, 20.745f, 13.011f, 21.423f, 13.528f, 22f)
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
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 15.5f)
                curveTo(18.414f, 15.5f, 18.75f, 15.836f, 18.75f, 16.25f)
                verticalLineTo(17.25f)
                horizontalLineTo(19.75f)
                curveTo(20.164f, 17.25f, 20.5f, 17.586f, 20.5f, 18f)
                curveTo(20.5f, 18.414f, 20.164f, 18.75f, 19.75f, 18.75f)
                horizontalLineTo(18.75f)
                verticalLineTo(19.75f)
                curveTo(18.75f, 20.164f, 18.414f, 20.5f, 18f, 20.5f)
                curveTo(17.586f, 20.5f, 17.25f, 20.164f, 17.25f, 19.75f)
                verticalLineTo(18.75f)
                horizontalLineTo(16.25f)
                curveTo(15.836f, 18.75f, 15.5f, 18.414f, 15.5f, 18f)
                curveTo(15.5f, 17.586f, 15.836f, 17.25f, 16.25f, 17.25f)
                horizontalLineTo(17.25f)
                verticalLineTo(16.25f)
                curveTo(17.25f, 15.836f, 17.586f, 15.5f, 18f, 15.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.25f, 18f)
                curveTo(13.25f, 15.377f, 15.377f, 13.25f, 18f, 13.25f)
                curveTo(20.623f, 13.25f, 22.75f, 15.377f, 22.75f, 18f)
                curveTo(22.75f, 20.623f, 20.623f, 22.75f, 18f, 22.75f)
                curveTo(15.377f, 22.75f, 13.25f, 20.623f, 13.25f, 18f)
                close()
                moveTo(18f, 14.75f)
                curveTo(16.205f, 14.75f, 14.75f, 16.205f, 14.75f, 18f)
                curveTo(14.75f, 19.795f, 16.205f, 21.25f, 18f, 21.25f)
                curveTo(19.795f, 21.25f, 21.25f, 19.795f, 21.25f, 18f)
                curveTo(21.25f, 16.205f, 19.795f, 14.75f, 18f, 14.75f)
                close()
            }
        }.build()

        return sackAdd!!
    }

private var sackAdd: ImageVector? = null