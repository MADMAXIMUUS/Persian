package io.github.madmaximuus.persianSymbols.mic.badge.minus

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.MicBadgeMinus: ImageVector
    get() {
        if (micBadgeMinus != null) {
            return micBadgeMinus!!
        }
        micBadgeMinus = ImageVector.Builder(
            name = "mic-badge-minus-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11f, 2f)
                curveTo(9.343f, 2f, 8f, 3.343f, 8f, 5f)
                verticalLineTo(11f)
                curveTo(8f, 12.657f, 9.343f, 14f, 11f, 14f)
                horizontalLineTo(13f)
                curveTo(14.657f, 14f, 16f, 12.657f, 16f, 11f)
                verticalLineTo(5f)
                curveTo(16f, 3.343f, 14.657f, 2f, 13f, 2f)
                horizontalLineTo(11f)
                close()
                moveTo(10f, 5f)
                curveTo(10f, 4.448f, 10.448f, 4f, 11f, 4f)
                horizontalLineTo(13f)
                curveTo(13.552f, 4f, 14f, 4.448f, 14f, 5f)
                verticalLineTo(11f)
                curveTo(14f, 11.552f, 13.552f, 12f, 13f, 12f)
                horizontalLineTo(11f)
                curveTo(10.448f, 12f, 10f, 11.552f, 10f, 11f)
                verticalLineTo(5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7f, 12f)
                curveTo(7f, 11.448f, 6.552f, 11f, 6f, 11f)
                curveTo(5.448f, 11f, 5f, 11.448f, 5f, 12f)
                curveTo(5f, 14.762f, 7.239f, 17f, 10f, 17f)
                horizontalLineTo(11f)
                verticalLineTo(20f)
                horizontalLineTo(8f)
                curveTo(7.448f, 20f, 7f, 20.448f, 7f, 21f)
                curveTo(7f, 21.552f, 7.448f, 22f, 8f, 22f)
                horizontalLineTo(14.225f)
                curveTo(13.163f, 20.997f, 12.5f, 19.576f, 12.5f, 18f)
                curveTo(12.5f, 16.893f, 12.827f, 15.863f, 13.389f, 15f)
                horizontalLineTo(10f)
                curveTo(8.343f, 15f, 7f, 13.657f, 7f, 12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.94f, 12.602f)
                curveTo(17.283f, 12.535f, 17.637f, 12.5f, 18f, 12.5f)
                curveTo(18.33f, 12.5f, 18.653f, 12.529f, 18.966f, 12.585f)
                curveTo(18.989f, 12.393f, 19f, 12.198f, 19f, 12f)
                curveTo(19f, 11.448f, 18.552f, 11f, 18f, 11f)
                curveTo(17.448f, 11f, 17f, 11.448f, 17f, 12f)
                curveTo(17f, 12.206f, 16.979f, 12.408f, 16.94f, 12.602f)
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

        return micBadgeMinus!!
    }

private var micBadgeMinus: ImageVector? = null