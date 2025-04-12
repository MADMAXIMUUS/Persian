package io.github.madmaximuus.persianSymbols.file.text

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.FileText: ImageVector
    get() {
        if (fileText != null) {
            return fileText!!
        }
        fileText = ImageVector.Builder(
            name = "file-text-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.25f, 17.5f)
                curveTo(7.25f, 17.086f, 7.586f, 16.75f, 8f, 16.75f)
                horizontalLineTo(16f)
                curveTo(16.414f, 16.75f, 16.75f, 17.086f, 16.75f, 17.5f)
                curveTo(16.75f, 17.914f, 16.414f, 18.25f, 16f, 18.25f)
                horizontalLineTo(8f)
                curveTo(7.586f, 18.25f, 7.25f, 17.914f, 7.25f, 17.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8f, 13.75f)
                curveTo(7.586f, 13.75f, 7.25f, 14.086f, 7.25f, 14.5f)
                curveTo(7.25f, 14.914f, 7.586f, 15.25f, 8f, 15.25f)
                horizontalLineTo(16f)
                curveTo(16.414f, 15.25f, 16.75f, 14.914f, 16.75f, 14.5f)
                curveTo(16.75f, 14.086f, 16.414f, 13.75f, 16f, 13.75f)
                horizontalLineTo(8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.5f, 2f)
                curveTo(6.015f, 2f, 4f, 4.015f, 4f, 6.5f)
                verticalLineTo(17.5f)
                curveTo(4f, 19.985f, 6.015f, 22f, 8.5f, 22f)
                horizontalLineTo(15.5f)
                curveTo(17.985f, 22f, 20f, 19.985f, 20f, 17.5f)
                verticalLineTo(8.828f)
                curveTo(20f, 8.033f, 19.684f, 7.27f, 19.121f, 6.707f)
                lineTo(15.293f, 2.879f)
                curveTo(14.73f, 2.316f, 13.967f, 2f, 13.172f, 2f)
                horizontalLineTo(8.5f)
                close()
                moveTo(6f, 6.5f)
                curveTo(6f, 5.119f, 7.119f, 4f, 8.5f, 4f)
                horizontalLineTo(11.75f)
                verticalLineTo(7.5f)
                curveTo(11.75f, 9.019f, 12.981f, 10.25f, 14.5f, 10.25f)
                horizontalLineTo(18f)
                verticalLineTo(17.5f)
                curveTo(18f, 18.881f, 16.881f, 20f, 15.5f, 20f)
                horizontalLineTo(8.5f)
                curveTo(7.119f, 20f, 6f, 18.881f, 6f, 17.5f)
                verticalLineTo(6.5f)
                close()
                moveTo(17.997f, 8.75f)
                curveTo(17.978f, 8.514f, 17.876f, 8.29f, 17.707f, 8.121f)
                lineTo(13.879f, 4.293f)
                curveTo(13.71f, 4.124f, 13.486f, 4.022f, 13.25f, 4.003f)
                verticalLineTo(7.5f)
                curveTo(13.25f, 8.19f, 13.81f, 8.75f, 14.5f, 8.75f)
                horizontalLineTo(17.997f)
                close()
            }
        }.build()

        return fileText!!
    }

private var fileText: ImageVector? = null