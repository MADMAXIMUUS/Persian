package io.github.madmaximuus.persianSymbols.dollar.badge

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.DollarBadge: ImageVector
    get() {
        if (dollarBadge != null) {
            return dollarBadge!!
        }
        dollarBadge = ImageVector.Builder(
            name = "dollar-badge-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.391f, 3.345f)
                curveTo(12.615f, 2.595f, 11.385f, 2.595f, 10.609f, 3.345f)
                lineTo(10.231f, 3.712f)
                curveTo(9.787f, 4.141f, 9.171f, 4.341f, 8.56f, 4.255f)
                lineTo(8.038f, 4.181f)
                curveTo(6.97f, 4.03f, 5.974f, 4.753f, 5.788f, 5.816f)
                lineTo(5.697f, 6.335f)
                curveTo(5.59f, 6.942f, 5.209f, 7.467f, 4.664f, 7.756f)
                lineTo(4.199f, 8.003f)
                curveTo(3.246f, 8.509f, 2.865f, 9.679f, 3.339f, 10.648f)
                lineTo(3.571f, 11.122f)
                curveTo(3.842f, 11.676f, 3.842f, 12.324f, 3.571f, 12.878f)
                lineTo(3.339f, 13.352f)
                curveTo(2.865f, 14.321f, 3.246f, 15.491f, 4.199f, 15.997f)
                lineTo(4.664f, 16.244f)
                curveTo(5.209f, 16.533f, 5.59f, 17.058f, 5.697f, 17.665f)
                lineTo(5.788f, 18.184f)
                curveTo(5.974f, 19.247f, 6.97f, 19.97f, 8.038f, 19.819f)
                lineTo(8.56f, 19.745f)
                curveTo(9.171f, 19.659f, 9.787f, 19.859f, 10.231f, 20.288f)
                lineTo(10.609f, 20.655f)
                curveTo(11.385f, 21.405f, 12.615f, 21.405f, 13.391f, 20.655f)
                lineTo(13.769f, 20.288f)
                curveTo(14.213f, 19.859f, 14.829f, 19.659f, 15.44f, 19.745f)
                lineTo(15.962f, 19.819f)
                curveTo(17.03f, 19.97f, 18.026f, 19.247f, 18.212f, 18.184f)
                lineTo(18.303f, 17.665f)
                curveTo(18.41f, 17.058f, 18.791f, 16.533f, 19.336f, 16.244f)
                lineTo(19.801f, 15.997f)
                curveTo(20.754f, 15.491f, 21.135f, 14.321f, 20.661f, 13.352f)
                lineTo(20.429f, 12.878f)
                curveTo(20.158f, 12.324f, 20.158f, 11.676f, 20.429f, 11.122f)
                lineTo(20.661f, 10.648f)
                curveTo(21.135f, 9.679f, 20.754f, 8.509f, 19.801f, 8.003f)
                lineTo(19.336f, 7.756f)
                curveTo(18.791f, 7.467f, 18.41f, 6.942f, 18.303f, 6.335f)
                lineTo(18.212f, 5.816f)
                curveTo(18.026f, 4.753f, 17.03f, 4.03f, 15.962f, 4.181f)
                lineTo(15.44f, 4.255f)
                curveTo(14.829f, 4.341f, 14.213f, 4.141f, 13.769f, 3.712f)
                lineTo(13.391f, 3.345f)
                close()
                moveTo(12.75f, 7.526f)
                curveTo(12.75f, 7.112f, 12.414f, 6.776f, 12f, 6.776f)
                curveTo(11.586f, 6.776f, 11.25f, 7.112f, 11.25f, 7.526f)
                verticalLineTo(7.65f)
                curveTo(10.038f, 7.926f, 9.013f, 8.858f, 9.013f, 10.157f)
                curveTo(9.013f, 11.719f, 10.493f, 12.75f, 12f, 12.75f)
                curveTo(12.964f, 12.75f, 13.487f, 13.368f, 13.487f, 13.842f)
                curveTo(13.487f, 14.314f, 12.965f, 14.932f, 12.004f, 14.934f)
                lineTo(12f, 14.934f)
                lineTo(11.996f, 14.934f)
                curveTo(11.301f, 14.932f, 10.792f, 14.583f, 10.604f, 14.212f)
                curveTo(10.417f, 13.842f, 9.965f, 13.694f, 9.596f, 13.881f)
                curveTo(9.226f, 14.069f, 9.078f, 14.52f, 9.266f, 14.889f)
                curveTo(9.645f, 15.638f, 10.389f, 16.159f, 11.25f, 16.351f)
                verticalLineTo(16.473f)
                curveTo(11.25f, 16.887f, 11.586f, 17.223f, 12f, 17.223f)
                curveTo(12.414f, 17.223f, 12.75f, 16.887f, 12.75f, 16.473f)
                verticalLineTo(16.349f)
                curveTo(13.962f, 16.073f, 14.987f, 15.141f, 14.987f, 13.842f)
                curveTo(14.987f, 12.281f, 13.507f, 11.25f, 12f, 11.25f)
                curveTo(11.036f, 11.25f, 10.513f, 10.631f, 10.513f, 10.157f)
                curveTo(10.513f, 9.685f, 11.033f, 9.068f, 11.993f, 9.065f)
                lineTo(12f, 9.065f)
                lineTo(12.007f, 9.065f)
                curveTo(12.71f, 9.068f, 13.22f, 9.425f, 13.403f, 9.8f)
                curveTo(13.584f, 10.172f, 14.033f, 10.327f, 14.405f, 10.146f)
                curveTo(14.778f, 9.964f, 14.932f, 9.515f, 14.751f, 9.143f)
                curveTo(14.377f, 8.377f, 13.624f, 7.843f, 12.75f, 7.648f)
                verticalLineTo(7.526f)
                close()
            }
        }.build()

        return dollarBadge!!
    }

private var dollarBadge: ImageVector? = null
