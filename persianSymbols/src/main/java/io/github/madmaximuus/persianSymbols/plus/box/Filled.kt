package io.github.madmaximuus.persianSymbols.plus.box

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.PlusBox: ImageVector
    get() {
        if (plusBox != null) {
            return plusBox!!
        }
        plusBox = ImageVector.Builder(
            name = "plus-box-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.4f, 3f)
                curveTo(4.97f, 3f, 3f, 4.97f, 3f, 7.4f)
                verticalLineTo(16.6f)
                curveTo(3f, 19.03f, 4.97f, 21f, 7.4f, 21f)
                horizontalLineTo(16.6f)
                curveTo(19.03f, 21f, 21f, 19.03f, 21f, 16.6f)
                verticalLineTo(7.4f)
                curveTo(21f, 4.97f, 19.03f, 3f, 16.6f, 3f)
                horizontalLineTo(7.4f)
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
        return plusBox!!
    }

private var plusBox: ImageVector? = null