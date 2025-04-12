package io.github.madmaximuus.persianSymbols.video.badge.ellipsis

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.VideoBadgeEllipsis: ImageVector
    get() {
        if (videoBadgeEllipsis != null) {
            return videoBadgeEllipsis!!
        }
        videoBadgeEllipsis = ImageVector.Builder(
            name = "video-badge-ellipsis-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.5f, 4f)
                curveTo(4.015f, 4f, 2f, 6.015f, 2f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(2f, 17.985f, 4.015f, 20f, 6.5f, 20f)
                horizontalLineTo(12.875f)
                curveTo(12.633f, 19.38f, 12.5f, 18.706f, 12.5f, 18f)
                horizontalLineTo(6.5f)
                curveTo(5.119f, 18f, 4f, 16.881f, 4f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(4f, 7.119f, 5.119f, 6f, 6.5f, 6f)
                horizontalLineTo(13.5f)
                curveTo(14.881f, 6f, 16f, 7.119f, 16f, 8.5f)
                verticalLineTo(12.875f)
                curveTo(16.62f, 12.633f, 17.294f, 12.5f, 18f, 12.5f)
                verticalLineTo(9.693f)
                lineTo(20f, 8.943f)
                verticalLineTo(12.875f)
                curveTo(20.765f, 13.174f, 21.446f, 13.638f, 22f, 14.225f)
                verticalLineTo(8.222f)
                curveTo(22f, 7.174f, 20.954f, 6.449f, 19.973f, 6.817f)
                lineTo(17.908f, 7.591f)
                curveTo(17.488f, 5.542f, 15.674f, 4f, 13.5f, 4f)
                horizontalLineTo(6.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.882f, 18f)
                curveTo(16.882f, 18.414f, 16.546f, 18.75f, 16.132f, 18.75f)
                curveTo(15.718f, 18.75f, 15.382f, 18.414f, 15.382f, 18f)
                curveTo(15.382f, 17.586f, 15.718f, 17.25f, 16.132f, 17.25f)
                curveTo(16.546f, 17.25f, 16.882f, 17.586f, 16.882f, 18f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 18.75f)
                curveTo(18.414f, 18.75f, 18.75f, 18.414f, 18.75f, 18f)
                curveTo(18.75f, 17.586f, 18.414f, 17.25f, 18f, 17.25f)
                curveTo(17.586f, 17.25f, 17.25f, 17.586f, 17.25f, 18f)
                curveTo(17.25f, 18.414f, 17.586f, 18.75f, 18f, 18.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.618f, 18f)
                curveTo(20.618f, 18.414f, 20.282f, 18.75f, 19.868f, 18.75f)
                curveTo(19.454f, 18.75f, 19.118f, 18.414f, 19.118f, 18f)
                curveTo(19.118f, 17.586f, 19.454f, 17.25f, 19.868f, 17.25f)
                curveTo(20.282f, 17.25f, 20.618f, 17.586f, 20.618f, 18f)
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

        return videoBadgeEllipsis!!
    }

private var videoBadgeEllipsis: ImageVector? = null