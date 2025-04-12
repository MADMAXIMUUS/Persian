package io.github.madmaximuus.persianSymbols.trash

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Trash: ImageVector
    get() {
        if (trash != null) {
            return trash!!
        }
        trash = ImageVector.Builder(
            name = "trash-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.75f, 8.5f)
                curveTo(9.75f, 8.086f, 9.414f, 7.75f, 9f, 7.75f)
                curveTo(8.586f, 7.75f, 8.25f, 8.086f, 8.25f, 8.5f)
                verticalLineTo(17.5f)
                curveTo(8.25f, 17.914f, 8.586f, 18.25f, 9f, 18.25f)
                curveTo(9.414f, 18.25f, 9.75f, 17.914f, 9.75f, 17.5f)
                verticalLineTo(8.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.75f, 8.5f)
                curveTo(12.75f, 8.086f, 12.414f, 7.75f, 12f, 7.75f)
                curveTo(11.586f, 7.75f, 11.25f, 8.086f, 11.25f, 8.5f)
                verticalLineTo(17.5f)
                curveTo(11.25f, 17.914f, 11.586f, 18.25f, 12f, 18.25f)
                curveTo(12.414f, 18.25f, 12.75f, 17.914f, 12.75f, 17.5f)
                verticalLineTo(8.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 7.75f)
                curveTo(15.414f, 7.75f, 15.75f, 8.086f, 15.75f, 8.5f)
                verticalLineTo(17.5f)
                curveTo(15.75f, 17.914f, 15.414f, 18.25f, 15f, 18.25f)
                curveTo(14.586f, 18.25f, 14.25f, 17.914f, 14.25f, 17.5f)
                verticalLineTo(8.5f)
                curveTo(14.25f, 8.086f, 14.586f, 7.75f, 15f, 7.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10f, 2f)
                curveTo(9.31f, 2f, 8.75f, 2.56f, 8.75f, 3.25f)
                lineTo(8.75f, 4f)
                horizontalLineTo(4f)
                curveTo(3.448f, 4f, 3f, 4.448f, 3f, 5f)
                curveTo(3f, 5.552f, 3.448f, 6f, 4f, 6f)
                verticalLineTo(17.5f)
                curveTo(4f, 19.985f, 6.015f, 22f, 8.5f, 22f)
                horizontalLineTo(15.5f)
                curveTo(17.985f, 22f, 20f, 19.985f, 20f, 17.5f)
                verticalLineTo(6f)
                curveTo(20.552f, 6f, 21f, 5.553f, 21f, 5f)
                curveTo(21f, 4.448f, 20.552f, 4f, 20f, 4f)
                horizontalLineTo(15.25f)
                lineTo(15.25f, 3.25f)
                curveTo(15.25f, 2.56f, 14.69f, 2f, 14f, 2f)
                horizontalLineTo(10f)
                close()
                moveTo(6f, 17.5f)
                verticalLineTo(6f)
                horizontalLineTo(18f)
                verticalLineTo(17.5f)
                curveTo(18f, 18.881f, 16.881f, 20f, 15.5f, 20f)
                horizontalLineTo(8.5f)
                curveTo(7.119f, 20f, 6f, 18.881f, 6f, 17.5f)
                close()
                moveTo(13.75f, 4f)
                lineTo(13.75f, 3.5f)
                horizontalLineTo(10.25f)
                lineTo(10.25f, 4f)
                horizontalLineTo(13.75f)
                close()
            }
        }.build()
        return trash!!
    }

private var trash: ImageVector? = null