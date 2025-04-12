package io.github.madmaximuus.persianSymbols.house.slash

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.HouseSlash: ImageVector
    get() {
        if (houseSlash != null) {
            return houseSlash!!
        }
        houseSlash = ImageVector.Builder(
            name = "house-slash-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(2.449f, 9.223f)
                lineTo(4.826f, 7.301f)
                lineTo(11.525f, 14f)
                horizontalLineTo(11f)
                curveTo(10.172f, 14f, 9.5f, 14.672f, 9.5f, 15.5f)
                verticalLineTo(22f)
                horizontalLineTo(8.4f)
                curveTo(5.97f, 22f, 4f, 20.03f, 4f, 17.6f)
                verticalLineTo(11f)
                horizontalLineTo(3.077f)
                curveTo(2.135f, 11f, 1.716f, 9.815f, 2.449f, 9.223f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.5f, 22f)
                verticalLineTo(16.975f)
                lineTo(18.465f, 20.94f)
                curveTo(17.695f, 21.601f, 16.694f, 22f, 15.6f, 22f)
                horizontalLineTo(14.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20f, 11f)
                verticalLineTo(17.525f)
                lineTo(7.563f, 5.088f)
                lineTo(11.371f, 2.009f)
                curveTo(11.738f, 1.712f, 12.262f, 1.712f, 12.629f, 2.009f)
                lineTo(21.551f, 9.223f)
                curveTo(22.285f, 9.815f, 21.865f, 11f, 20.923f, 11f)
                horizontalLineTo(20f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.707f, 2.293f)
                curveTo(3.317f, 1.902f, 2.683f, 1.902f, 2.293f, 2.293f)
                curveTo(1.902f, 2.683f, 1.902f, 3.317f, 2.293f, 3.707f)
                lineTo(20.293f, 21.707f)
                curveTo(20.683f, 22.098f, 21.317f, 22.098f, 21.707f, 21.707f)
                curveTo(22.098f, 21.317f, 22.098f, 20.683f, 21.707f, 20.293f)
                lineTo(3.707f, 2.293f)
                close()
            }
        }.build()

        return houseSlash!!
    }

private var houseSlash: ImageVector? = null