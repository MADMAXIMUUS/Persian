package io.github.madmaximuus.persianSymbols.folder

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Folder: ImageVector
    get() {
        if (folder != null) {
            return folder!!
        }
        folder = ImageVector.Builder(
            name = "folder-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4f, 3f)
                curveTo(2.895f, 3f, 2f, 3.895f, 2f, 5f)
                verticalLineTo(16.5f)
                curveTo(2f, 18.985f, 4.015f, 21f, 6.5f, 21f)
                horizontalLineTo(17.5f)
                curveTo(19.985f, 21f, 22f, 18.985f, 22f, 16.5f)
                verticalLineTo(8f)
                curveTo(22f, 6.343f, 20.657f, 5f, 19f, 5f)
                horizontalLineTo(11.672f)
                curveTo(11.479f, 5f, 11.29f, 4.944f, 11.128f, 4.839f)
                lineTo(9.042f, 3.484f)
                curveTo(8.555f, 3.168f, 7.988f, 3f, 7.408f, 3f)
                horizontalLineTo(4f)
                close()
                moveTo(4f, 5f)
                horizontalLineTo(7.408f)
                curveTo(7.601f, 5f, 7.79f, 5.056f, 7.952f, 5.161f)
                lineTo(10.038f, 6.516f)
                curveTo(10.525f, 6.832f, 11.092f, 7f, 11.672f, 7f)
                horizontalLineTo(19f)
                curveTo(19.552f, 7f, 20f, 7.448f, 20f, 8f)
                verticalLineTo(9.25f)
                horizontalLineTo(4f)
                verticalLineTo(5f)
                close()
                moveTo(4f, 10.75f)
                verticalLineTo(16.5f)
                curveTo(4f, 17.881f, 5.119f, 19f, 6.5f, 19f)
                horizontalLineTo(17.5f)
                curveTo(18.881f, 19f, 20f, 17.881f, 20f, 16.5f)
                verticalLineTo(10.75f)
                horizontalLineTo(4f)
                close()
            }
        }.build()

        return folder!!
    }

private var folder: ImageVector? = null