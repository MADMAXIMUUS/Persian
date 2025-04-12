package io.github.madmaximuus.persianSymbols.trash.slash

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.TrashSlash: ImageVector
    get() {
        if (trashSlash != null) {
            return trashSlash!!
        }
        trashSlash = ImageVector.Builder(
            name = "trash-slash-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4f, 17.5f)
                verticalLineTo(6.475f)
                lineTo(6f, 8.475f)
                verticalLineTo(17.5f)
                curveTo(6f, 18.881f, 7.119f, 20f, 8.5f, 20f)
                horizontalLineTo(15.5f)
                curveTo(16.069f, 20f, 16.594f, 19.81f, 17.014f, 19.489f)
                lineTo(18.436f, 20.911f)
                curveTo(17.648f, 21.59f, 16.622f, 22f, 15.5f, 22f)
                horizontalLineTo(8.5f)
                curveTo(6.015f, 22f, 4f, 19.985f, 4f, 17.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.75f, 12.225f)
                lineTo(8.25f, 10.725f)
                verticalLineTo(17.5f)
                curveTo(8.25f, 17.914f, 8.586f, 18.25f, 9f, 18.25f)
                curveTo(9.414f, 18.25f, 9.75f, 17.914f, 9.75f, 17.5f)
                verticalLineTo(12.225f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.75f, 17.5f)
                verticalLineTo(15.225f)
                lineTo(11.25f, 13.725f)
                verticalLineTo(17.5f)
                curveTo(11.25f, 17.914f, 11.586f, 18.25f, 12f, 18.25f)
                curveTo(12.414f, 18.25f, 12.75f, 17.914f, 12.75f, 17.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.25f, 8.5f)
                verticalLineTo(8.775f)
                lineTo(12.75f, 10.275f)
                verticalLineTo(8.5f)
                curveTo(12.75f, 8.086f, 12.414f, 7.75f, 12f, 7.75f)
                curveTo(11.586f, 7.75f, 11.25f, 8.086f, 11.25f, 8.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.25f, 17.5f)
                verticalLineTo(16.725f)
                lineTo(15.543f, 18.018f)
                curveTo(15.406f, 18.161f, 15.214f, 18.25f, 15f, 18.25f)
                curveTo(14.586f, 18.25f, 14.25f, 17.914f, 14.25f, 17.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.25f, 8.5f)
                verticalLineTo(11.775f)
                lineTo(15.75f, 13.275f)
                verticalLineTo(8.5f)
                curveTo(15.75f, 8.086f, 15.414f, 7.75f, 15f, 7.75f)
                curveTo(14.586f, 7.75f, 14.25f, 8.086f, 14.25f, 8.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(18f, 6f)
                verticalLineTo(15.525f)
                lineTo(20f, 17.525f)
                lineTo(20f, 17.5f)
                verticalLineTo(6f)
                curveTo(20.552f, 6f, 21f, 5.553f, 21f, 5f)
                curveTo(21f, 4.448f, 20.552f, 4f, 20f, 4f)
                horizontalLineTo(15.25f)
                lineTo(15.25f, 3.25f)
                curveTo(15.25f, 2.56f, 14.69f, 2f, 14f, 2f)
                horizontalLineTo(10f)
                curveTo(9.31f, 2f, 8.75f, 2.56f, 8.75f, 3.25f)
                lineTo(8.75f, 4f)
                horizontalLineTo(6.475f)
                lineTo(8.475f, 6f)
                horizontalLineTo(18f)
                close()
                moveTo(13.75f, 4f)
                lineTo(13.75f, 3.5f)
                horizontalLineTo(10.25f)
                lineTo(10.25f, 4f)
                horizontalLineTo(13.75f)
                close()
            }
        }.build()

        return trashSlash!!
    }

private var trashSlash: ImageVector? = null