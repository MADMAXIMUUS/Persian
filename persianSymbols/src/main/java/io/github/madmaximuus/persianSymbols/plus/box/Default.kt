package io.github.madmaximuus.persianSymbols.plus.box

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.PlusBox: ImageVector
    get() {
        if (plusBox != null) {
            return plusBox!!
        }
        plusBox = ImageVector.Builder(
            name = "plus-box-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
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
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.5f, 3f)
                curveTo(5.015f, 3f, 3f, 5.015f, 3f, 7.5f)
                verticalLineTo(16.5f)
                curveTo(3f, 18.985f, 5.015f, 21f, 7.5f, 21f)
                horizontalLineTo(16.5f)
                curveTo(18.985f, 21f, 21f, 18.985f, 21f, 16.5f)
                verticalLineTo(7.5f)
                curveTo(21f, 5.015f, 18.985f, 3f, 16.5f, 3f)
                horizontalLineTo(7.5f)
                close()
                moveTo(5f, 7.5f)
                curveTo(5f, 6.119f, 6.119f, 5f, 7.5f, 5f)
                horizontalLineTo(16.5f)
                curveTo(17.881f, 5f, 19f, 6.119f, 19f, 7.5f)
                verticalLineTo(16.5f)
                curveTo(19f, 17.881f, 17.881f, 19f, 16.5f, 19f)
                horizontalLineTo(7.5f)
                curveTo(6.119f, 19f, 5f, 17.881f, 5f, 16.5f)
                verticalLineTo(7.5f)
                close()
            }
        }.build()
        return plusBox!!
    }

private var plusBox: ImageVector? = null