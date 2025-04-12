package io.github.madmaximuus.persianSymbols.camera.badge.plus

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.CameraBadgePlus: ImageVector
    get() {
        if (cameraBadgePlus != null) {
            return cameraBadgePlus!!
        }
        cameraBadgePlus = ImageVector.Builder(
            name = "camera-badge-plus-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.414f, 2f)
                curveTo(9.884f, 2f, 9.375f, 2.211f, 9f, 2.586f)
                lineTo(8.318f, 3.268f)
                curveTo(7.849f, 3.737f, 7.213f, 4f, 6.55f, 4f)
                horizontalLineTo(6.5f)
                curveTo(4.015f, 4f, 2f, 6.015f, 2f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(2f, 17.985f, 4.015f, 20f, 6.5f, 20f)
                horizontalLineTo(12.341f)
                curveTo(12.12f, 19.374f, 12f, 18.701f, 12f, 18f)
                horizontalLineTo(6.5f)
                curveTo(5.119f, 18f, 4f, 16.881f, 4f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(4f, 7.119f, 5.119f, 6f, 6.5f, 6f)
                horizontalLineTo(6.55f)
                curveTo(7.744f, 6f, 8.888f, 5.526f, 9.732f, 4.682f)
                lineTo(10.414f, 4f)
                lineTo(13.586f, 4f)
                lineTo(14.268f, 4.682f)
                curveTo(15.112f, 5.526f, 16.256f, 6f, 17.45f, 6f)
                horizontalLineTo(17.5f)
                curveTo(18.881f, 6f, 20f, 7.119f, 20f, 8.5f)
                verticalLineTo(12.341f)
                curveTo(20.745f, 12.605f, 21.423f, 13.011f, 22f, 13.528f)
                verticalLineTo(8.5f)
                curveTo(22f, 6.015f, 19.985f, 4f, 17.5f, 4f)
                horizontalLineTo(17.45f)
                curveTo(16.787f, 4f, 16.151f, 3.737f, 15.682f, 3.268f)
                lineTo(15f, 2.586f)
                curveTo(14.625f, 2.211f, 14.116f, 2f, 13.586f, 2f)
                horizontalLineTo(10.414f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.75f, 12f)
                curveTo(16.75f, 12.044f, 16.749f, 12.087f, 16.748f, 12.131f)
                curveTo(16.191f, 12.249f, 15.662f, 12.445f, 15.173f, 12.706f)
                curveTo(15.223f, 12.479f, 15.25f, 12.243f, 15.25f, 12f)
                curveTo(15.25f, 10.205f, 13.795f, 8.75f, 12f, 8.75f)
                curveTo(10.205f, 8.75f, 8.75f, 10.205f, 8.75f, 12f)
                curveTo(8.75f, 13.795f, 10.205f, 15.25f, 12f, 15.25f)
                curveTo(12.243f, 15.25f, 12.479f, 15.223f, 12.706f, 15.173f)
                curveTo(12.445f, 15.662f, 12.249f, 16.191f, 12.131f, 16.748f)
                curveTo(12.087f, 16.749f, 12.044f, 16.75f, 12f, 16.75f)
                curveTo(9.377f, 16.75f, 7.25f, 14.623f, 7.25f, 12f)
                curveTo(7.25f, 9.377f, 9.377f, 7.25f, 12f, 7.25f)
                curveTo(14.623f, 7.25f, 16.75f, 9.377f, 16.75f, 12f)
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

        return cameraBadgePlus!!
    }

private var cameraBadgePlus: ImageVector? = null
