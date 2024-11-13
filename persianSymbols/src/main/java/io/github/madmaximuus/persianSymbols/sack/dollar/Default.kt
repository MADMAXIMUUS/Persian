package io.github.madmaximuus.persianSymbols.sack.dollar

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.SackDollar: ImageVector
    get() {
        if (sackDollar != null) {
            return sackDollar!!
        }
        sackDollar = ImageVector.Builder(
            name = "sack-dollar-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.75f, 9.649f)
                curveTo(12.75f, 9.235f, 12.414f, 8.899f, 12f, 8.899f)
                curveTo(11.586f, 8.899f, 11.25f, 9.235f, 11.25f, 9.649f)
                verticalLineTo(9.773f)
                curveTo(10.038f, 10.049f, 9.013f, 10.981f, 9.013f, 12.28f)
                curveTo(9.013f, 13.842f, 10.493f, 14.872f, 12f, 14.872f)
                curveTo(12.964f, 14.872f, 13.487f, 15.491f, 13.487f, 15.965f)
                curveTo(13.487f, 16.437f, 12.965f, 17.055f, 12.004f, 17.057f)
                lineTo(12f, 17.057f)
                lineTo(11.996f, 17.057f)
                curveTo(11.301f, 17.055f, 10.792f, 16.706f, 10.604f, 16.334f)
                curveTo(10.417f, 15.965f, 9.965f, 15.817f, 9.596f, 16.004f)
                curveTo(9.226f, 16.192f, 9.078f, 16.643f, 9.266f, 17.012f)
                curveTo(9.645f, 17.761f, 10.389f, 18.281f, 11.25f, 18.474f)
                verticalLineTo(18.596f)
                curveTo(11.25f, 19.01f, 11.586f, 19.346f, 12f, 19.346f)
                curveTo(12.414f, 19.346f, 12.75f, 19.01f, 12.75f, 18.596f)
                verticalLineTo(18.472f)
                curveTo(13.962f, 18.195f, 14.987f, 17.264f, 14.987f, 15.965f)
                curveTo(14.987f, 14.403f, 13.507f, 13.372f, 12f, 13.372f)
                curveTo(11.036f, 13.372f, 10.513f, 12.754f, 10.513f, 12.28f)
                curveTo(10.513f, 11.808f, 11.033f, 11.191f, 11.993f, 11.188f)
                lineTo(12f, 11.188f)
                lineTo(12.007f, 11.188f)
                curveTo(12.71f, 11.191f, 13.22f, 11.548f, 13.403f, 11.923f)
                curveTo(13.584f, 12.295f, 14.033f, 12.45f, 14.405f, 12.269f)
                curveTo(14.778f, 12.087f, 14.932f, 11.638f, 14.751f, 11.266f)
                curveTo(14.377f, 10.499f, 13.624f, 9.966f, 12.75f, 9.771f)
                verticalLineTo(9.649f)
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

        return sackDollar!!
    }

private var sackDollar: ImageVector? = null
