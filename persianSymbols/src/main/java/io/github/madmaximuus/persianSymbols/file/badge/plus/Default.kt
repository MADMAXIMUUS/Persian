package io.github.madmaximuus.persianSymbols.file.badge.plus

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.FileBadgePlus: ImageVector
    get() {
        if (fileBadgePlus != null) {
            return fileBadgePlus!!
        }
        fileBadgePlus = ImageVector.Builder(
            name = "file-badge-plus-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.5f, 2f)
                curveTo(6.015f, 2f, 4f, 4.015f, 4f, 6.5f)
                verticalLineTo(17.5f)
                curveTo(4f, 19.985f, 6.015f, 22f, 8.5f, 22f)
                horizontalLineTo(14.225f)
                curveTo(13.639f, 21.446f, 13.174f, 20.765f, 12.875f, 20f)
                horizontalLineTo(8.5f)
                curveTo(7.119f, 20f, 6f, 18.881f, 6f, 17.5f)
                verticalLineTo(6.5f)
                curveTo(6f, 5.119f, 7.119f, 4f, 8.5f, 4f)
                horizontalLineTo(11.75f)
                verticalLineTo(7.5f)
                curveTo(11.75f, 9.019f, 12.981f, 10.25f, 14.5f, 10.25f)
                horizontalLineTo(18f)
                verticalLineTo(12.5f)
                curveTo(18.706f, 12.5f, 19.38f, 12.633f, 20f, 12.875f)
                verticalLineTo(8.828f)
                curveTo(20f, 8.033f, 19.684f, 7.27f, 19.121f, 6.707f)
                lineTo(15.293f, 2.879f)
                curveTo(14.73f, 2.316f, 13.967f, 2f, 13.172f, 2f)
                horizontalLineTo(8.5f)
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

        return fileBadgePlus!!
    }

private var fileBadgePlus: ImageVector? = null