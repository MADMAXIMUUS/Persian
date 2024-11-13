package io.github.madmaximuus.persianSymbols.check.badge

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.CheckBadge: ImageVector
    get() {
        if (checkBadge != null) {
            return checkBadge!!
        }
        checkBadge = Builder(
            name = "check-badge-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
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
                curveTo(6.97f, 4.03f, 5.974f, 4.753f, 5.788f, 5.815f)
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
                lineTo(18.212f, 5.815f)
                curveTo(18.026f, 4.753f, 17.03f, 4.03f, 15.962f, 4.181f)
                lineTo(15.44f, 4.255f)
                curveTo(14.829f, 4.341f, 14.213f, 4.141f, 13.769f, 3.712f)
                lineTo(13.391f, 3.345f)
                close()
                moveTo(15.78f, 10.28f)
                curveTo(16.073f, 9.987f, 16.073f, 9.512f, 15.78f, 9.22f)
                curveTo(15.487f, 8.927f, 15.013f, 8.927f, 14.72f, 9.22f)
                lineTo(10.75f, 13.189f)
                lineTo(9.28f, 11.72f)
                curveTo(8.987f, 11.427f, 8.513f, 11.427f, 8.22f, 11.72f)
                curveTo(7.927f, 12.012f, 7.927f, 12.487f, 8.22f, 12.78f)
                lineTo(10.22f, 14.78f)
                curveTo(10.513f, 15.073f, 10.987f, 15.073f, 11.28f, 14.78f)
                lineTo(15.78f, 10.28f)
                close()
            }
        }.build()
        return checkBadge!!
    }

private var checkBadge: ImageVector? = null