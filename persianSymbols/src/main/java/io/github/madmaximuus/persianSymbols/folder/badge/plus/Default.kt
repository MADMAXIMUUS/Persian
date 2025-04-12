package io.github.madmaximuus.persianSymbols.folder.badge.plus

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.FolderBadgePlus: ImageVector
    get() {
        if (folderBadgePlus != null) {
            return folderBadgePlus!!
        }
        folderBadgePlus = ImageVector.Builder(
            name = "folder-badge-plus-default",
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
                horizontalLineTo(13.389f)
                curveTo(13f, 20.403f, 12.724f, 19.727f, 12.591f, 19f)
                horizontalLineTo(6.5f)
                curveTo(5.119f, 19f, 4f, 17.881f, 4f, 16.5f)
                verticalLineTo(10.75f)
                horizontalLineTo(20f)
                verticalLineTo(12.875f)
                curveTo(20.765f, 13.174f, 21.446f, 13.638f, 22f, 14.225f)
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
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 15.5f)
                curveTo(18.414f, 15.5f, 18.75f, 15.836f, 18.75f, 16.25f)
                verticalLineTo(17.25f)
                horizontalLineTo(19.75f)
                curveTo(20.164f, 17.25f, 20.5f, 17.586f, 20.5f, 18f)
                curveTo(20.5f, 18.414f, 20.164f, 18.75f, 19.75f, 18.75f)
                horizontalLineTo(18.75f)
                verticalLineTo(19.75f)
                curveTo(18.75f, 20.164f, 18.414f, 20.5f, 18f, 20.5f)
                curveTo(17.586f, 20.5f, 17.25f, 20.164f, 17.25f, 19.75f)
                verticalLineTo(18.75f)
                horizontalLineTo(16.25f)
                curveTo(15.836f, 18.75f, 15.5f, 18.414f, 15.5f, 18f)
                curveTo(15.5f, 17.586f, 15.836f, 17.25f, 16.25f, 17.25f)
                horizontalLineTo(17.25f)
                verticalLineTo(16.25f)
                curveTo(17.25f, 15.836f, 17.586f, 15.5f, 18f, 15.5f)
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

        return folderBadgePlus!!
    }

private var folderBadgePlus: ImageVector? = null