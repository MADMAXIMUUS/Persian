package io.github.madmaximuus.persianSymbols.folder.badge.minus

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.FolderBadgeMinus: ImageVector
    get() {
        if (folderBadgeMinus != null) {
            return folderBadgeMinus!!
        }
        folderBadgeMinus = ImageVector.Builder(
            name = "folder-badge-minus-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 14.225f)
                verticalLineTo(10.75f)
                horizontalLineTo(2f)
                verticalLineTo(16.6f)
                curveTo(2f, 19.03f, 3.97f, 21f, 6.4f, 21f)
                horizontalLineTo(13.389f)
                curveTo(12.827f, 20.137f, 12.5f, 19.107f, 12.5f, 18f)
                curveTo(12.5f, 14.962f, 14.962f, 12.5f, 18f, 12.5f)
                curveTo(19.576f, 12.5f, 20.997f, 13.163f, 22f, 14.225f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 8.25f)
                verticalLineTo(9.25f)
                horizontalLineTo(2f)
                verticalLineTo(5f)
                curveTo(2f, 3.895f, 2.895f, 3f, 4f, 3f)
                horizontalLineTo(6.658f)
                curveTo(7.244f, 3f, 7.817f, 3.171f, 8.306f, 3.493f)
                lineTo(10.227f, 4.757f)
                curveTo(10.717f, 5.079f, 11.29f, 5.25f, 11.876f, 5.25f)
                horizontalLineTo(19f)
                curveTo(20.657f, 5.25f, 22f, 6.593f, 22f, 8.25f)
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

private var folderBadgeMinus: ImageVector? = null