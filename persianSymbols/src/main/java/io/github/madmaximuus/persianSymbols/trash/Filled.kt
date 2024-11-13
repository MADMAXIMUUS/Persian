package io.github.madmaximuus.persianSymbols.trash

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.Trash: ImageVector
    get() {
        if (trash != null) {
            return trash!!
        }
        trash = ImageVector.Builder(
            name = "trash-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 2.5f)
                curveTo(7.448f, 2.5f, 7f, 2.948f, 7f, 3.5f)
                lineTo(4f, 3.5f)
                curveTo(3.448f, 3.5f, 3f, 3.948f, 3f, 4.5f)
                curveTo(3f, 5.053f, 3.448f, 5.5f, 4f, 5.5f)
                verticalLineTo(17.1f)
                curveTo(4f, 19.53f, 5.97f, 21.5f, 8.4f, 21.5f)
                horizontalLineTo(15.6f)
                curveTo(18.03f, 21.5f, 20f, 19.53f, 20f, 17.1f)
                verticalLineTo(5.5f)
                curveTo(20.552f, 5.5f, 21f, 5.053f, 21f, 4.5f)
                curveTo(21f, 3.948f, 20.552f, 3.5f, 20f, 3.5f)
                horizontalLineTo(17f)
                curveTo(17f, 2.948f, 16.552f, 2.5f, 16f, 2.5f)
                horizontalLineTo(8f)
                close()
                moveTo(9.75f, 8.5f)
                curveTo(9.75f, 8.086f, 9.414f, 7.75f, 9f, 7.75f)
                curveTo(8.586f, 7.75f, 8.25f, 8.086f, 8.25f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(8.25f, 15.914f, 8.586f, 16.25f, 9f, 16.25f)
                curveTo(9.414f, 16.25f, 9.75f, 15.914f, 9.75f, 15.5f)
                verticalLineTo(8.5f)
                close()
                moveTo(12f, 7.75f)
                curveTo(12.414f, 7.75f, 12.75f, 8.086f, 12.75f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(12.75f, 15.914f, 12.414f, 16.25f, 12f, 16.25f)
                curveTo(11.586f, 16.25f, 11.25f, 15.914f, 11.25f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(11.25f, 8.086f, 11.586f, 7.75f, 12f, 7.75f)
                close()
                moveTo(15.75f, 8.5f)
                curveTo(15.75f, 8.086f, 15.414f, 7.75f, 15f, 7.75f)
                curveTo(14.586f, 7.75f, 14.25f, 8.086f, 14.25f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(14.25f, 15.914f, 14.586f, 16.25f, 15f, 16.25f)
                curveTo(15.414f, 16.25f, 15.75f, 15.914f, 15.75f, 15.5f)
                verticalLineTo(8.5f)
                close()
            }
        }.build()
        return trash!!
    }

private var trash: ImageVector? = null