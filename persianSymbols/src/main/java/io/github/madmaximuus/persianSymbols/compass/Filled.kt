package io.github.madmaximuus.persianSymbols.compass

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.Compass: ImageVector
    get() {
        if (compass != null) {
            return compass!!
        }
        compass = ImageVector.Builder(
            name = "compass-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.5f, 12f)
                curveTo(13.5f, 12.828f, 12.828f, 13.5f, 12f, 13.5f)
                curveTo(11.172f, 13.5f, 10.5f, 12.828f, 10.5f, 12f)
                curveTo(10.5f, 11.172f, 11.172f, 10.5f, 12f, 10.5f)
                curveTo(12.828f, 10.5f, 13.5f, 11.172f, 13.5f, 12f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 22f)
                curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
                close()
                moveTo(9.421f, 9.737f)
                lineTo(7.316f, 16.051f)
                curveTo(7.186f, 16.442f, 7.558f, 16.814f, 7.949f, 16.684f)
                lineTo(14.263f, 14.579f)
                curveTo(14.412f, 14.529f, 14.529f, 14.412f, 14.579f, 14.263f)
                lineTo(16.684f, 7.949f)
                curveTo(16.814f, 7.558f, 16.442f, 7.186f, 16.051f, 7.316f)
                lineTo(9.737f, 9.421f)
                curveTo(9.588f, 9.471f, 9.471f, 9.588f, 9.421f, 9.737f)
                close()
            }
        }.build()

        return compass!!
    }

private var compass: ImageVector? = null
