package io.github.madmaximuus.persianSymbols.camera.badge.clock

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.CameraBadgeClock: ImageVector
    get() {
        if (cameraBadgeClock != null) {
            return cameraBadgeClock!!
        }
        cameraBadgeClock = ImageVector.Builder(
            name = "camera-badge-clock-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9f, 3.586f)
                curveTo(9.375f, 3.211f, 9.884f, 3f, 10.414f, 3f)
                horizontalLineTo(13.586f)
                curveTo(14.116f, 3f, 14.625f, 3.211f, 15f, 3.586f)
                lineTo(15.682f, 4.268f)
                curveTo(16.151f, 4.737f, 16.787f, 5f, 17.45f, 5f)
                horizontalLineTo(17.5f)
                curveTo(19.985f, 5f, 22f, 7.015f, 22f, 9.5f)
                verticalLineTo(14.225f)
                curveTo(21.446f, 13.638f, 20.765f, 13.174f, 20f, 12.875f)
                verticalLineTo(9.5f)
                curveTo(20f, 8.119f, 18.881f, 7f, 17.5f, 7f)
                horizontalLineTo(17.45f)
                curveTo(16.256f, 7f, 15.112f, 6.526f, 14.268f, 5.682f)
                lineTo(13.586f, 5f)
                lineTo(10.414f, 5f)
                lineTo(9.732f, 5.682f)
                curveTo(8.888f, 6.526f, 7.744f, 7f, 6.55f, 7f)
                horizontalLineTo(6.5f)
                curveTo(5.119f, 7f, 4f, 8.119f, 4f, 9.5f)
                verticalLineTo(16.5f)
                curveTo(4f, 17.881f, 5.119f, 19f, 6.5f, 19f)
                horizontalLineTo(12.591f)
                curveTo(12.724f, 19.727f, 13f, 20.403f, 13.389f, 21f)
                horizontalLineTo(6.5f)
                curveTo(4.015f, 21f, 2f, 18.985f, 2f, 16.5f)
                verticalLineTo(9.5f)
                curveTo(2f, 7.015f, 4.015f, 5f, 6.5f, 5f)
                horizontalLineTo(6.55f)
                curveTo(7.213f, 5f, 7.849f, 4.737f, 8.318f, 4.268f)
                lineTo(9f, 3.586f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 8.25f)
                curveTo(14.504f, 8.25f, 16.556f, 10.188f, 16.737f, 12.646f)
                curveTo(16.204f, 12.771f, 15.702f, 12.973f, 15.241f, 13.241f)
                curveTo(15.247f, 13.161f, 15.25f, 13.081f, 15.25f, 13f)
                curveTo(15.25f, 11.205f, 13.795f, 9.75f, 12f, 9.75f)
                curveTo(10.205f, 9.75f, 8.75f, 11.205f, 8.75f, 13f)
                curveTo(8.75f, 14.795f, 10.205f, 16.25f, 12f, 16.25f)
                curveTo(12.283f, 16.25f, 12.558f, 16.214f, 12.821f, 16.146f)
                curveTo(12.643f, 16.642f, 12.534f, 17.172f, 12.507f, 17.723f)
                curveTo(12.34f, 17.741f, 12.171f, 17.75f, 12f, 17.75f)
                curveTo(9.377f, 17.75f, 7.25f, 15.623f, 7.25f, 13f)
                curveTo(7.25f, 10.377f, 9.377f, 8.25f, 12f, 8.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.75f, 9.5f)
                curveTo(18.164f, 9.5f, 18.5f, 9.164f, 18.5f, 8.75f)
                curveTo(18.5f, 8.336f, 18.164f, 8f, 17.75f, 8f)
                curveTo(17.336f, 8f, 17f, 8.336f, 17f, 8.75f)
                curveTo(17f, 9.164f, 17.336f, 9.5f, 17.75f, 9.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 15.75f)
                curveTo(18.414f, 15.75f, 18.75f, 16.086f, 18.75f, 16.5f)
                verticalLineTo(17.689f)
                lineTo(19.53f, 18.47f)
                curveTo(19.823f, 18.763f, 19.823f, 19.237f, 19.53f, 19.53f)
                curveTo(19.237f, 19.823f, 18.763f, 19.823f, 18.47f, 19.53f)
                lineTo(17.47f, 18.53f)
                curveTo(17.329f, 18.39f, 17.25f, 18.199f, 17.25f, 18f)
                verticalLineTo(16.5f)
                curveTo(17.25f, 16.086f, 17.586f, 15.75f, 18f, 15.75f)
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

        return cameraBadgeClock!!
    }

private var cameraBadgeClock: ImageVector? = null