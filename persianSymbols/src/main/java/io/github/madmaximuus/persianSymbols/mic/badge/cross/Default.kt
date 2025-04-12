package io.github.madmaximuus.persianSymbols.mic.badge.cross

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.MicBadgeCross: ImageVector
    get() {
        if (micBadgeCross != null) {
            return micBadgeCross!!
        }
        micBadgeCross = ImageVector.Builder(
            name = "mic-badge-cross-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 5f)
                curveTo(8f, 3.343f, 9.343f, 2f, 11f, 2f)
                horizontalLineTo(13f)
                curveTo(14.657f, 2f, 16f, 3.343f, 16f, 5f)
                verticalLineTo(11f)
                curveTo(16f, 12.657f, 14.657f, 14f, 13f, 14f)
                horizontalLineTo(11f)
                curveTo(9.343f, 14f, 8f, 12.657f, 8f, 11f)
                verticalLineTo(5f)
                close()
                moveTo(11f, 4f)
                curveTo(10.448f, 4f, 10f, 4.448f, 10f, 5f)
                verticalLineTo(11f)
                curveTo(10f, 11.552f, 10.448f, 12f, 11f, 12f)
                horizontalLineTo(13f)
                curveTo(13.552f, 12f, 14f, 11.552f, 14f, 11f)
                verticalLineTo(5f)
                curveTo(14f, 4.448f, 13.552f, 4f, 13f, 4f)
                horizontalLineTo(11f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6f, 11f)
                curveTo(6.552f, 11f, 7f, 11.448f, 7f, 12f)
                curveTo(7f, 13.657f, 8.343f, 15f, 10f, 15f)
                horizontalLineTo(13.389f)
                curveTo(12.827f, 15.863f, 12.5f, 16.893f, 12.5f, 18f)
                curveTo(12.5f, 19.576f, 13.163f, 20.997f, 14.225f, 22f)
                horizontalLineTo(8f)
                curveTo(7.448f, 22f, 7f, 21.552f, 7f, 21f)
                curveTo(7f, 20.448f, 7.448f, 20f, 8f, 20f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                horizontalLineTo(10f)
                curveTo(7.239f, 17f, 5f, 14.762f, 5f, 12f)
                curveTo(5f, 11.448f, 5.448f, 11f, 6f, 11f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 12.5f)
                curveTo(17.637f, 12.5f, 17.283f, 12.535f, 16.94f, 12.602f)
                curveTo(16.979f, 12.408f, 17f, 12.206f, 17f, 12f)
                curveTo(17f, 11.448f, 17.448f, 11f, 18f, 11f)
                curveTo(18.552f, 11f, 19f, 11.448f, 19f, 12f)
                curveTo(19f, 12.198f, 18.989f, 12.393f, 18.966f, 12.585f)
                curveTo(18.653f, 12.529f, 18.33f, 12.5f, 18f, 12.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.47f, 16.409f)
                curveTo(17.177f, 16.116f, 16.702f, 16.116f, 16.409f, 16.409f)
                curveTo(16.116f, 16.702f, 16.116f, 17.177f, 16.409f, 17.47f)
                lineTo(16.939f, 18f)
                lineTo(16.409f, 18.531f)
                curveTo(16.116f, 18.823f, 16.116f, 19.298f, 16.409f, 19.591f)
                curveTo(16.702f, 19.884f, 17.177f, 19.884f, 17.47f, 19.591f)
                lineTo(18f, 19.061f)
                lineTo(18.53f, 19.591f)
                curveTo(18.823f, 19.884f, 19.298f, 19.884f, 19.591f, 19.591f)
                curveTo(19.884f, 19.298f, 19.884f, 18.823f, 19.591f, 18.53f)
                lineTo(19.061f, 18f)
                lineTo(19.591f, 17.47f)
                curveTo(19.884f, 17.177f, 19.884f, 16.702f, 19.591f, 16.409f)
                curveTo(19.298f, 16.116f, 18.823f, 16.116f, 18.53f, 16.409f)
                lineTo(18f, 16.94f)
                lineTo(17.47f, 16.409f)
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

        return micBadgeCross!!
    }

private var micBadgeCross: ImageVector? = null