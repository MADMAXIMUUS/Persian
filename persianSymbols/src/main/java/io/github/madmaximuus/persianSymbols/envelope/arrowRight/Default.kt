package io.github.madmaximuus.persianSymbols.envelope.arrowRight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.EnvelopeArrowRight: ImageVector
    get() {
        if (envelopeArrowRight != null) {
            return envelopeArrowRight!!
        }
        envelopeArrowRight = Builder(
            name = "envelope-arrow-right-default",
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
                verticalLineTo(14.225f)
                curveTo(21.446f, 13.638f, 20.765f, 13.174f, 20f, 12.875f)
                verticalLineTo(8.5f)
                curveTo(20f, 8.083f, 19.898f, 7.689f, 19.717f, 7.344f)
                lineTo(15.032f, 12.029f)
                lineTo(15.913f, 12.91f)
                curveTo(15.429f, 13.108f, 14.98f, 13.374f, 14.577f, 13.695f)
                lineTo(13.971f, 13.089f)
                lineTo(13.591f, 13.47f)
                curveTo(12.712f, 14.348f, 11.288f, 14.348f, 10.409f, 13.47f)
                lineTo(10.029f, 13.089f)
                lineTo(5.381f, 17.736f)
                curveTo(5.718f, 17.905f, 6.098f, 18f, 6.5f, 18f)
                horizontalLineTo(12.5f)
                curveTo(12.5f, 18.706f, 12.633f, 19.38f, 12.875f, 20f)
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
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.97f, 16.47f)
                curveTo(18.263f, 16.177f, 18.737f, 16.177f, 19.03f, 16.47f)
                lineTo(20.03f, 17.47f)
                curveTo(20.323f, 17.763f, 20.323f, 18.237f, 20.03f, 18.53f)
                lineTo(19.03f, 19.53f)
                curveTo(18.737f, 19.823f, 18.263f, 19.823f, 17.97f, 19.53f)
                curveTo(17.759f, 19.319f, 17.7f, 19.014f, 17.793f, 18.75f)
                horizontalLineTo(16.5f)
                curveTo(16.086f, 18.75f, 15.75f, 18.414f, 15.75f, 18f)
                curveTo(15.75f, 17.586f, 16.086f, 17.25f, 16.5f, 17.25f)
                horizontalLineTo(17.793f)
                curveTo(17.7f, 16.986f, 17.759f, 16.681f, 17.97f, 16.47f)
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
        return envelopeArrowRight!!
    }

private var envelopeArrowRight: ImageVector? = null