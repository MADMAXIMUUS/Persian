package io.github.madmaximuus.persianSymbols.file.text

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.FileText: ImageVector
    get() {
        if (fileText != null) {
            return fileText!!
        }
        fileText = ImageVector.Builder(
            name = "file-text-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 2f)
                horizontalLineTo(7.5f)
                curveTo(5.567f, 2f, 4f, 3.567f, 4f, 5.5f)
                verticalLineTo(18.5f)
                curveTo(4f, 20.433f, 5.567f, 22f, 7.5f, 22f)
                horizontalLineTo(16.5f)
                curveTo(18.433f, 22f, 20f, 20.433f, 20f, 18.5f)
                verticalLineTo(9.75f)
                horizontalLineTo(14.75f)
                curveTo(13.231f, 9.75f, 12f, 8.519f, 12f, 7f)
                verticalLineTo(2f)
                close()
                moveTo(7.25f, 17.5f)
                curveTo(7.25f, 17.086f, 7.586f, 16.75f, 8f, 16.75f)
                horizontalLineTo(16f)
                curveTo(16.414f, 16.75f, 16.75f, 17.086f, 16.75f, 17.5f)
                curveTo(16.75f, 17.914f, 16.414f, 18.25f, 16f, 18.25f)
                horizontalLineTo(8f)
                curveTo(7.586f, 18.25f, 7.25f, 17.914f, 7.25f, 17.5f)
                close()
                moveTo(8f, 13.75f)
                curveTo(7.586f, 13.75f, 7.25f, 14.086f, 7.25f, 14.5f)
                curveTo(7.25f, 14.914f, 7.586f, 15.25f, 8f, 15.25f)
                horizontalLineTo(16f)
                curveTo(16.414f, 15.25f, 16.75f, 14.914f, 16.75f, 14.5f)
                curveTo(16.75f, 14.086f, 16.414f, 13.75f, 16f, 13.75f)
                horizontalLineTo(8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.994f, 8.25f)
                curveTo(19.958f, 7.765f, 19.745f, 7.308f, 19.394f, 6.967f)
                lineTo(14.868f, 2.566f)
                curveTo(14.501f, 2.209f, 14.011f, 2.007f, 13.5f, 2f)
                verticalLineTo(7f)
                curveTo(13.5f, 7.69f, 14.06f, 8.25f, 14.75f, 8.25f)
                horizontalLineTo(19.994f)
                close()
            }
        }.build()

        return fileText!!
    }

private var fileText: ImageVector? = null