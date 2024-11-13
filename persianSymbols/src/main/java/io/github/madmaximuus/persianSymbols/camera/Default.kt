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
                moveTo(12f, 8f)
                curveTo(9.239f, 8f, 7f, 10.239f, 7f, 13f)
                curveTo(7f, 15.761f, 9.239f, 18f, 12f, 18f)
                curveTo(14.761f, 18f, 17f, 15.761f, 17f, 13f)
                curveTo(17f, 10.239f, 14.761f, 8f, 12f, 8f)
                close()
                moveTo(9f, 13f)
                curveTo(9f, 11.343f, 10.343f, 10f, 12f, 10f)
                curveTo(13.657f, 10f, 15f, 11.343f, 15f, 13f)
                curveTo(15f, 14.657f, 13.657f, 16f, 12f, 16f)
                curveTo(10.343f, 16f, 9f, 14.657f, 9f, 13f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.414f, 3f)
                curveTo(9.884f, 3f, 9.375f, 3.211f, 9f, 3.586f)
                lineTo(8.318f, 4.268f)
                curveTo(7.849f, 4.737f, 7.213f, 5f, 6.55f, 5f)
                horizontalLineTo(6.5f)
                curveTo(4.015f, 5f, 2f, 7.015f, 2f, 9.5f)
                verticalLineTo(16.5f)
                curveTo(2f, 18.985f, 4.015f, 21f, 6.5f, 21f)
                horizontalLineTo(17.5f)
                curveTo(19.985f, 21f, 22f, 18.985f, 22f, 16.5f)
                verticalLineTo(9.5f)
                curveTo(22f, 7.015f, 19.985f, 5f, 17.5f, 5f)
                horizontalLineTo(17.45f)
                curveTo(16.787f, 5f, 16.151f, 4.737f, 15.682f, 4.268f)
                lineTo(15f, 3.586f)
                curveTo(14.625f, 3.211f, 14.116f, 3f, 13.586f, 3f)
                horizontalLineTo(10.414f)
                close()
                moveTo(10.414f, 5f)
                lineTo(13.586f, 5f)
                lineTo(14.268f, 5.682f)
                curveTo(15.112f, 6.526f, 16.256f, 7f, 17.45f, 7f)
                horizontalLineTo(17.5f)
                curveTo(18.881f, 7f, 20f, 8.119f, 20f, 9.5f)
                verticalLineTo(16.5f)
                curveTo(20f, 17.881f, 18.881f, 19f, 17.5f, 19f)
                horizontalLineTo(6.5f)
                curveTo(5.119f, 19f, 4f, 17.881f, 4f, 16.5f)
                verticalLineTo(9.5f)
                curveTo(4f, 8.119f, 5.119f, 7f, 6.5f, 7f)
                horizontalLineTo(6.55f)
                curveTo(7.744f, 7f, 8.888f, 6.526f, 9.732f, 5.682f)
                lineTo(10.414f, 5f)
                close()
            }
        }.build()
        return camera!!
    }

private var camera: ImageVector? = null