package io.github.madmaximuus.persianSymbols.camera

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Camera: ImageVector
    get() {
        if (camera != null) {
            return camera!!
        }
        camera = Builder(
            name = "camera-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.25f, 13f)
                curveTo(7.25f, 10.377f, 9.377f, 8.25f, 12f, 8.25f)
                curveTo(14.623f, 8.25f, 16.75f, 10.377f, 16.75f, 13f)
                curveTo(16.75f, 15.623f, 14.623f, 17.75f, 12f, 17.75f)
                curveTo(9.377f, 17.75f, 7.25f, 15.623f, 7.25f, 13f)
                close()
                moveTo(12f, 9.75f)
                curveTo(10.205f, 9.75f, 8.75f, 11.205f, 8.75f, 13f)
                curveTo(8.75f, 14.795f, 10.205f, 16.25f, 12f, 16.25f)
                curveTo(13.795f, 16.25f, 15.25f, 14.795f, 15.25f, 13f)
                curveTo(15.25f, 11.205f, 13.795f, 9.75f, 12f, 9.75f)
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
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9f, 3.586f)
                curveTo(9.375f, 3.211f, 9.884f, 3f, 10.414f, 3f)
                horizontalLineTo(13.586f)
                curveTo(14.116f, 3f, 14.625f, 3.211f, 15f, 3.586f)
                lineTo(15.682f, 4.268f)
                curveTo(16.151f, 4.737f, 16.787f, 5f, 17.45f, 5f)
                horizontalLineTo(17.5f)
                curveTo(19.985f, 5f, 22f, 7.015f, 22f, 9.5f)
                verticalLineTo(16.5f)
                curveTo(22f, 18.985f, 19.985f, 21f, 17.5f, 21f)
                horizontalLineTo(6.5f)
                curveTo(4.015f, 21f, 2f, 18.985f, 2f, 16.5f)
                verticalLineTo(9.5f)
                curveTo(2f, 7.015f, 4.015f, 5f, 6.5f, 5f)
                horizontalLineTo(6.55f)
                curveTo(7.213f, 5f, 7.849f, 4.737f, 8.318f, 4.268f)
                lineTo(9f, 3.586f)
                close()
                moveTo(13.586f, 5f)
                lineTo(10.414f, 5f)
                lineTo(9.732f, 5.682f)
                curveTo(8.888f, 6.526f, 7.744f, 7f, 6.55f, 7f)
                horizontalLineTo(6.5f)
                curveTo(5.119f, 7f, 4f, 8.119f, 4f, 9.5f)
                verticalLineTo(16.5f)
                curveTo(4f, 17.881f, 5.119f, 19f, 6.5f, 19f)
                horizontalLineTo(17.5f)
                curveTo(18.881f, 19f, 20f, 17.881f, 20f, 16.5f)
                verticalLineTo(9.5f)
                curveTo(20f, 8.119f, 18.881f, 7f, 17.5f, 7f)
                horizontalLineTo(17.45f)
                curveTo(16.256f, 7f, 15.112f, 6.526f, 14.268f, 5.682f)
                lineTo(13.586f, 5f)
                close()
            }
        }.build()
        return camera!!
    }

private var camera: ImageVector? = null