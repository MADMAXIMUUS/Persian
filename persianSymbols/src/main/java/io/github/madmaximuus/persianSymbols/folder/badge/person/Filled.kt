package io.github.madmaximuus.persianSymbols.folder.badge.person

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.FolderBadgePerson: ImageVector
    get() {
        if (folderBadgePerson != null) {
            return folderBadgePerson!!
        }
        folderBadgePerson = ImageVector.Builder(
            name = "folder-badge-person-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 10.75f)
                verticalLineTo(14.225f)
                curveTo(20.997f, 13.163f, 19.576f, 12.5f, 18f, 12.5f)
                curveTo(14.962f, 12.5f, 12.5f, 14.962f, 12.5f, 18f)
                curveTo(12.5f, 19.107f, 12.827f, 20.137f, 13.389f, 21f)
                horizontalLineTo(6.4f)
                curveTo(3.97f, 21f, 2f, 19.03f, 2f, 16.6f)
                verticalLineTo(10.75f)
                horizontalLineTo(22f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 9.25f)
                verticalLineTo(8.25f)
                curveTo(22f, 6.593f, 20.657f, 5.25f, 19f, 5.25f)
                horizontalLineTo(11.876f)
                curveTo(11.29f, 5.25f, 10.717f, 5.079f, 10.227f, 4.757f)
                lineTo(8.306f, 3.493f)
                curveTo(7.817f, 3.171f, 7.244f, 3f, 6.658f, 3f)
                horizontalLineTo(4f)
                curveTo(2.895f, 3f, 2f, 3.895f, 2f, 5f)
                verticalLineTo(9.25f)
                horizontalLineTo(22f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 18.5f)
                curveTo(18.828f, 18.5f, 19.5f, 17.828f, 19.5f, 17f)
                curveTo(19.5f, 16.172f, 18.828f, 15.5f, 18f, 15.5f)
                curveTo(17.172f, 15.5f, 16.5f, 16.172f, 16.5f, 17f)
                curveTo(16.5f, 17.828f, 17.172f, 18.5f, 18f, 18.5f)
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
                curveTo(14.75f, 18.58f, 14.902f, 19.125f, 15.168f, 19.597f)
                curveTo(17.049f, 18.801f, 18.951f, 18.801f, 20.831f, 19.597f)
                curveTo(21.098f, 19.125f, 21.25f, 18.58f, 21.25f, 18f)
                curveTo(21.25f, 16.205f, 19.795f, 14.75f, 18f, 14.75f)
                close()
                moveTo(18f, 21.25f)
                lineTo(17.98f, 21.25f)
                horizontalLineTo(18.02f)
                lineTo(18f, 21.25f)
                close()
            }
        }.build()

        return folderBadgePerson!!
    }

private var folderBadgePerson: ImageVector? = null