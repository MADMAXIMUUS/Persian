package io.github.madmaximuus.persianSymbols.toggle.off

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.ToggleOff: ImageVector
    get() {
        if (toggleOff != null) {
            return toggleOff!!
        }
        toggleOff = ImageVector.Builder(
            name = "toggle-off-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8f, 9f)
                curveTo(6.343f, 9f, 5f, 10.343f, 5f, 12f)
                curveTo(5f, 13.657f, 6.343f, 15f, 8f, 15f)
                curveTo(9.657f, 15f, 11f, 13.657f, 11f, 12f)
                curveTo(11f, 10.343f, 9.657f, 9f, 8f, 9f)
                close()
            }
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
                moveTo(4f, 12f)
                curveTo(4f, 9.791f, 5.791f, 8f, 8f, 8f)
                horizontalLineTo(16f)
                curveTo(18.209f, 8f, 20f, 9.791f, 20f, 12f)
                curveTo(20f, 14.209f, 18.209f, 16f, 16f, 16f)
                horizontalLineTo(8f)
                curveTo(5.791f, 16f, 4f, 14.209f, 4f, 12f)
                close()
            }
        }.build()
        return toggleOff!!
    }

private var toggleOff: ImageVector? = null