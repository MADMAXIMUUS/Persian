package io.github.madmaximuus.persianSymbols.folder.badge.question

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.FolderBadgeQuestion: ImageVector
    get() {
        if (folderBadgeQuestion != null) {
            return folderBadgeQuestion!!
        }
        folderBadgeQuestion = ImageVector.Builder(
            name = "folder-badge-question-filled",
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
                moveTo(18.012f, 20.5f)
                curveTo(18.288f, 20.5f, 18.512f, 20.276f, 18.512f, 20f)
                curveTo(18.512f, 19.724f, 18.288f, 19.5f, 18.012f, 19.5f)
                curveTo(17.736f, 19.5f, 17.512f, 19.724f, 17.512f, 20f)
                curveTo(17.512f, 20.276f, 17.736f, 20.5f, 18.012f, 20.5f)
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
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 16.25f)
                curveTo(17.574f, 16.25f, 17.25f, 16.584f, 17.25f, 16.97f)
                curveTo(17.25f, 17.246f, 17.026f, 17.47f, 16.75f, 17.47f)
                curveTo(16.474f, 17.47f, 16.25f, 17.246f, 16.25f, 16.97f)
                curveTo(16.25f, 16.008f, 17.045f, 15.25f, 18f, 15.25f)
                curveTo(18.955f, 15.25f, 19.75f, 16.008f, 19.75f, 16.97f)
                curveTo(19.75f, 17.663f, 19.22f, 18.072f, 18.872f, 18.269f)
                curveTo(18.741f, 18.344f, 18.612f, 18.402f, 18.5f, 18.447f)
                verticalLineTo(18.75f)
                curveTo(18.5f, 19.026f, 18.276f, 19.25f, 18f, 19.25f)
                curveTo(17.724f, 19.25f, 17.5f, 19.026f, 17.5f, 18.75f)
                verticalLineTo(18.088f)
                curveTo(17.5f, 17.857f, 17.657f, 17.657f, 17.881f, 17.602f)
                lineTo(18.03f, 17.556f)
                curveTo(18.129f, 17.521f, 18.256f, 17.469f, 18.378f, 17.4f)
                curveTo(18.676f, 17.266f, 18.75f, 17.092f, 18.75f, 16.97f)
                curveTo(18.75f, 16.584f, 18.426f, 16.25f, 18f, 16.25f)
                close()
            }
        }.build()

        return folderBadgeQuestion!!
    }

private var folderBadgeQuestion: ImageVector? = null