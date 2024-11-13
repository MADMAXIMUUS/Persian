package io.github.madmaximuus.persianSymbols.plus.circle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.PlusCircle: ImageVector
    get() {
        if (plusCircle != null) {
            return plusCircle!!
        }
        plusCircle = ImageVector.Builder(
            name = "plus-circle-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
                moveTo(12f, 6.75f)
                curveTo(12.414f, 6.75f, 12.75f, 7.086f, 12.75f, 7.5f)
                verticalLineTo(11.25f)
                horizontalLineTo(16.5f)
                curveTo(16.914f, 11.25f, 17.25f, 11.586f, 17.25f, 12f)
                curveTo(17.25f, 12.414f, 16.914f, 12.75f, 16.5f, 12.75f)
                horizontalLineTo(12.75f)
                verticalLineTo(16.5f)
                curveTo(12.75f, 16.914f, 12.414f, 17.25f, 12f, 17.25f)
                curveTo(11.586f, 17.25f, 11.25f, 16.914f, 11.25f, 16.5f)
                verticalLineTo(12.75f)
                horizontalLineTo(7.5f)
                curveTo(7.086f, 12.75f, 6.75f, 12.414f, 6.75f, 12f)
                curveTo(6.75f, 11.586f, 7.086f, 11.25f, 7.5f, 11.25f)
                horizontalLineTo(11.25f)
                verticalLineTo(7.5f)
                curveTo(11.25f, 7.086f, 11.586f, 6.75f, 12f, 6.75f)
                close()
            }
        }.build()
        return plusCircle!!
    }

private var plusCircle: ImageVector? = null