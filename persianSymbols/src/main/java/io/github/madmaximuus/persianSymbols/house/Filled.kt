package io.github.madmaximuus.persianSymbols.house

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.House: ImageVector
    get() {
        if (house != null) {
            return house!!
        }
        house = ImageVector.Builder(
            name = "home-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.629f, 2.008f)
                lineTo(21.551f, 9.222f)
                curveTo(22.284f, 9.815f, 21.865f, 11f, 20.923f, 11f)
                horizontalLineTo(20f)
                verticalLineTo(17.6f)
                curveTo(20f, 20.03f, 18.03f, 22f, 15.6f, 22f)
                horizontalLineTo(14.5f)
                verticalLineTo(15.5f)
                curveTo(14.5f, 14.672f, 13.828f, 14f, 13f, 14f)
                horizontalLineTo(11f)
                curveTo(10.172f, 14f, 9.5f, 14.672f, 9.5f, 15.5f)
                verticalLineTo(22f)
                horizontalLineTo(8.4f)
                curveTo(5.97f, 22f, 4f, 20.03f, 4f, 17.6f)
                verticalLineTo(11f)
                horizontalLineTo(3.077f)
                curveTo(2.135f, 11f, 1.716f, 9.815f, 2.449f, 9.222f)
                lineTo(11.371f, 2.008f)
                curveTo(11.738f, 1.712f, 12.262f, 1.712f, 12.629f, 2.008f)
                close()
            }
        }.build()
        return house!!
    }

private var house: ImageVector? = null