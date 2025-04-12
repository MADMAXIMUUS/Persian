package io.github.madmaximuus.persianSymbols.folder.badge.minus

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.FolderBadgeMinus: ImageVector
    get() {
        if (folderBadgeMinus != null) {
            return folderBadgeMinus!!
        }
        folderBadgeMinus = ImageVector.Builder(
            name = "folder-badge-minus-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 5f)
                curveTo(2f, 3.895f, 2.895f, 3f, 4f, 3f)
                horizontalLineTo(7.408f)
                curveTo(7.988f, 3f, 8.555f, 3.168f, 9.042f, 3.484f)
                lineTo(11.128f, 4.839f)
                curveTo(11.29f, 4.944f, 11.479f, 5f, 11.672f, 5f)
                horizontalLineTo(19f)
                curveTo(20.657f, 5f, 22f, 6.343f, 22f, 8f)
                verticalLineTo(14.225f)
                curveTo(21.446f, 13.638f, 20.765f, 13.174f, 20f, 12.875f)
                verticalLineTo(10.75f)
                horizontalLineTo(4f)
                verticalLineTo(16.5f)
                curveTo(4f, 17.881f, 5.119f, 19f, 6.5f, 19f)
                horizontalLineTo(12.591f)
                curveTo(12.724f, 19.727f, 13f, 20.403f, 13.389f, 21f)
                horizontalLineTo(6.5f)
                curveTo(4.015f, 21f, 2f, 18.985f, 2f, 16.5f)
                verticalLineTo(5f)
                close()
                moveTo(7.408f, 5f)
                horizontalLineTo(4f)
                verticalLineTo(9.25f)
                horizontalLineTo(20f)
                verticalLineTo(8f)
                curveTo(20f, 7.448f, 19.552f, 7f, 19f, 7f)
                horizontalLineTo(11.672f)
                curveTo(11.092f, 7f, 10.525f, 6.832f, 10.038f, 6.516f)
                lineTo(7.952f, 5.161f)
                curveTo(7.79f, 5.056f, 7.601f, 5f, 7.408f, 5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.5f, 17.25f)
                curveTo(16.086f, 17.25f, 15.75f, 17.586f, 15.75f, 18f)
                curveTo(15.75f, 18.414f, 16.086f, 18.75f, 16.5f, 18.75f)
                horizontalLineTo(19.5f)
                curveTo(19.914f, 18.75f, 20.25f, 18.414f, 20.25f, 18f)
                curveTo(20.25f, 17.586f, 19.914f, 17.25f, 19.5f, 17.25f)
                horizontalLineTo(16.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.25f, 18f)
                curveTo(13.25f, 15.377f, 15.377f, 13.25f, 18f, 13.25f)
                curveTo(20.623f, 13.25f, 22.75f, 15.377f, 22.75f, 18f)
                curveTo(22.75f, 20.623f, 20.623f, 22.75f, 18f, 22.75f)
                curveTo(15.377f, 22.75f, 13.25f, 20.623f, 13.25f, 18f)
                close()
                moveTo(18f, 14.75f)
                curveTo(16.205f, 14.75f, 14.75f, 16.205f, 14.75f, 18f)
                curveTo(14.75f, 19.795f, 16.205f, 21.25f, 18f, 21.25f)
                curveTo(19.795f, 21.25f, 21.25f, 19.795f, 21.25f, 18f)
                curveTo(21.25f, 16.205f, 19.795f, 14.75f, 18f, 14.75f)
                close()
            }
        }.build()

        return folderBadgeMinus!!
    }

@Suppress("ObjectPropertyName")
private var folderBadgeMinus: ImageVector? = null
