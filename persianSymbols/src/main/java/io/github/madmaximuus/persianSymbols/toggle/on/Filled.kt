package io.github.madmaximuus.persianSymbols.toggle.on

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.ToggleOn: ImageVector
    get() {
        if (toggleOn != null) {
            return toggleOn!!
        }
        toggleOn = ImageVector.Builder(
            name = "toggle-on-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 6f)
                curveTo(4.686f, 6f, 2f, 8.686f, 2f, 12f)
                curveTo(2f, 15.314f, 4.686f, 18f, 8f, 18f)
                horizontalLineTo(16f)
                curveTo(19.314f, 18f, 22f, 15.314f, 22f, 12f)
                curveTo(22f, 8.686f, 19.314f, 6f, 16f, 6f)
                horizontalLineTo(8f)
                close()
                moveTo(16f, 9f)
                curveTo(14.343f, 9f, 13f, 10.343f, 13f, 12f)
                curveTo(13f, 13.657f, 14.343f, 15f, 16f, 15f)
                curveTo(17.657f, 15f, 19f, 13.657f, 19f, 12f)
                curveTo(19f, 10.343f, 17.657f, 9f, 16f, 9f)
                close()
            }
        }.build()
        return toggleOn!!
    }

private var toggleOn: ImageVector? = null