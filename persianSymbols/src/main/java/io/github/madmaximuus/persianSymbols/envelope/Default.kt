package io.github.madmaximuus.persianSymbols.envelope

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Envelope: ImageVector
    get() {
        if (envelope != null) {
            return envelope!!
        }
        envelope = Builder(
            name = "envelope-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 8.5f)
                curveTo(2f, 6.015f, 4.015f, 4f, 6.5f, 4f)
                horizontalLineTo(17.5f)
                curveTo(19.985f, 4f, 22f, 6.015f, 22f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(22f, 17.985f, 19.985f, 20f, 17.5f, 20f)
                horizontalLineTo(6.5f)
                curveTo(4.015f, 20f, 2f, 17.985f, 2f, 15.5f)
                verticalLineTo(8.5f)
                close()
                moveTo(6.5f, 6f)
                curveTo(6.083f, 6f, 5.689f, 6.102f, 5.344f, 6.283f)
                lineTo(11.47f, 12.409f)
                curveTo(11.763f, 12.702f, 12.237f, 12.702f, 12.53f, 12.409f)
                lineTo(18.656f, 6.283f)
                curveTo(18.311f, 6.102f, 17.917f, 6f, 17.5f, 6f)
                horizontalLineTo(6.5f)
                close()
                moveTo(4f, 8.5f)
                curveTo(4f, 8.083f, 4.102f, 7.689f, 4.283f, 7.344f)
                lineTo(8.968f, 12.029f)
                lineTo(4.303f, 16.694f)
                curveTo(4.11f, 16.339f, 4f, 15.932f, 4f, 15.5f)
                verticalLineTo(8.5f)
                close()
                moveTo(5.381f, 17.736f)
                curveTo(5.718f, 17.905f, 6.098f, 18f, 6.5f, 18f)
                horizontalLineTo(17.5f)
                curveTo(17.902f, 18f, 18.282f, 17.905f, 18.618f, 17.736f)
                lineTo(13.971f, 13.089f)
                lineTo(13.591f, 13.47f)
                curveTo(12.712f, 14.348f, 11.288f, 14.348f, 10.409f, 13.47f)
                lineTo(10.029f, 13.089f)
                lineTo(5.381f, 17.736f)
                close()
                moveTo(15.032f, 12.029f)
                lineTo(19.697f, 16.694f)
                curveTo(19.89f, 16.339f, 20f, 15.932f, 20f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(20f, 8.083f, 19.898f, 7.689f, 19.717f, 7.344f)
                lineTo(15.032f, 12.029f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 8.5f)
                curveTo(2f, 6.015f, 4.015f, 4f, 6.5f, 4f)
                horizontalLineTo(17.5f)
                curveTo(19.985f, 4f, 22f, 6.015f, 22f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(22f, 17.985f, 19.985f, 20f, 17.5f, 20f)
                horizontalLineTo(6.5f)
                curveTo(4.015f, 20f, 2f, 17.985f, 2f, 15.5f)
                verticalLineTo(8.5f)
                close()
                moveTo(6.5f, 6f)
                curveTo(6.083f, 6f, 5.689f, 6.102f, 5.344f, 6.283f)
                lineTo(11.47f, 12.409f)
                curveTo(11.763f, 12.702f, 12.237f, 12.702f, 12.53f, 12.409f)
                lineTo(18.656f, 6.283f)
                curveTo(18.311f, 6.102f, 17.917f, 6f, 17.5f, 6f)
                horizontalLineTo(6.5f)
                close()
                moveTo(4f, 8.5f)
                curveTo(4f, 8.083f, 4.102f, 7.689f, 4.283f, 7.344f)
                lineTo(8.968f, 12.029f)
                lineTo(4.303f, 16.694f)
                curveTo(4.11f, 16.339f, 4f, 15.932f, 4f, 15.5f)
                verticalLineTo(8.5f)
                close()
                moveTo(5.381f, 17.736f)
                curveTo(5.718f, 17.905f, 6.098f, 18f, 6.5f, 18f)
                horizontalLineTo(17.5f)
                curveTo(17.902f, 18f, 18.282f, 17.905f, 18.618f, 17.736f)
                lineTo(13.971f, 13.089f)
                lineTo(13.591f, 13.47f)
                curveTo(12.712f, 14.348f, 11.288f, 14.348f, 10.409f, 13.47f)
                lineTo(10.029f, 13.089f)
                lineTo(5.381f, 17.736f)
                close()
                moveTo(15.032f, 12.029f)
                lineTo(19.697f, 16.694f)
                curveTo(19.89f, 16.339f, 20f, 15.932f, 20f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(20f, 8.083f, 19.898f, 7.689f, 19.717f, 7.344f)
                lineTo(15.032f, 12.029f)
                close()
            }
        }.build()
        return envelope!!
    }

private var envelope: ImageVector? = null