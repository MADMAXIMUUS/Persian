package io.github.madmaximuus.persianSymbols.sack.xMark

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.SackXMark: ImageVector
    get() {
        if (sackXMark != null) {
            return sackXMark!!
        }
        sackXMark = ImageVector.Builder(
            name = "sack-xmark-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.03f, 10.97f)
                curveTo(8.737f, 10.677f, 8.263f, 10.677f, 7.97f, 10.97f)
                curveTo(7.677f, 11.263f, 7.677f, 11.737f, 7.97f, 12.03f)
                lineTo(10.939f, 15f)
                lineTo(7.97f, 17.97f)
                curveTo(7.677f, 18.263f, 7.677f, 18.737f, 7.97f, 19.03f)
                curveTo(8.263f, 19.323f, 8.737f, 19.323f, 9.03f, 19.03f)
                lineTo(12f, 16.061f)
                lineTo(14.97f, 19.03f)
                curveTo(15.263f, 19.323f, 15.737f, 19.323f, 16.03f, 19.03f)
                curveTo(16.323f, 18.737f, 16.323f, 18.263f, 16.03f, 17.97f)
                lineTo(13.061f, 15f)
                lineTo(16.03f, 12.03f)
                curveTo(16.323f, 11.737f, 16.323f, 11.263f, 16.03f, 10.97f)
                curveTo(15.737f, 10.677f, 15.263f, 10.677f, 14.97f, 10.97f)
                lineTo(12f, 13.939f)
                lineTo(9.03f, 10.97f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.54f, 4.316f)
                lineTo(8.639f, 6.513f)
                curveTo(7.032f, 7.274f, 5.961f, 8.781f, 5.282f, 10.353f)
                curveTo(4.311f, 12.601f, 4f, 15.247f, 4f, 17f)
                verticalLineTo(17.5f)
                curveTo(4f, 19.985f, 6.015f, 22f, 8.5f, 22f)
                horizontalLineTo(15.5f)
                curveTo(17.985f, 22f, 20f, 19.985f, 20f, 17.5f)
                verticalLineTo(17f)
                curveTo(20f, 15.247f, 19.689f, 12.601f, 18.718f, 10.353f)
                curveTo(18.039f, 8.781f, 16.968f, 7.274f, 15.361f, 6.513f)
                lineTo(16.46f, 4.316f)
                curveTo(16.992f, 3.252f, 16.219f, 2f, 15.029f, 2f)
                horizontalLineTo(8.971f)
                curveTo(7.781f, 2f, 7.008f, 3.252f, 7.54f, 4.316f)
                close()
                moveTo(9.618f, 4f)
                lineTo(10.618f, 6f)
                horizontalLineTo(13.382f)
                lineTo(14.382f, 4f)
                horizontalLineTo(9.618f)
                close()
                moveTo(7.118f, 11.147f)
                curveTo(7.949f, 9.223f, 9.184f, 8f, 11f, 8f)
                horizontalLineTo(13f)
                curveTo(14.816f, 8f, 16.051f, 9.223f, 16.882f, 11.147f)
                curveTo(17.711f, 13.066f, 18f, 15.42f, 18f, 17f)
                verticalLineTo(17.5f)
                curveTo(18f, 18.881f, 16.881f, 20f, 15.5f, 20f)
                horizontalLineTo(8.5f)
                curveTo(7.119f, 20f, 6f, 18.881f, 6f, 17.5f)
                verticalLineTo(17f)
                curveTo(6f, 15.42f, 6.289f, 13.066f, 7.118f, 11.147f)
                close()
            }
        }.build()

        return sackXMark!!
    }

private var sackXMark: ImageVector? = null
