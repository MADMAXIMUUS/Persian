package io.github.madmaximuus.persianSymbols.envelope.pen

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.EnvelopePen: ImageVector
    get() {
        if (envelopePen != null) {
            return envelopePen!!
        }
        envelopePen = Builder(
            name = "envelope-pen-default",
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
                verticalLineTo(13.649f)
                lineTo(21.186f, 12.836f)
                curveTo(20.854f, 12.503f, 20.434f, 12.312f, 20f, 12.263f)
                verticalLineTo(8.5f)
                curveTo(20f, 8.083f, 19.898f, 7.689f, 19.717f, 7.344f)
                lineTo(15.032f, 12.029f)
                lineTo(17.099f, 14.095f)
                lineTo(16.038f, 15.156f)
                lineTo(13.971f, 13.089f)
                lineTo(13.591f, 13.47f)
                curveTo(12.712f, 14.348f, 11.288f, 14.348f, 10.409f, 13.47f)
                lineTo(10.029f, 13.089f)
                lineTo(5.381f, 17.736f)
                curveTo(5.718f, 17.905f, 6.098f, 18f, 6.5f, 18f)
                horizontalLineTo(13.406f)
                curveTo(13.39f, 18.035f, 13.374f, 18.071f, 13.359f, 18.107f)
                lineTo(12.58f, 20f)
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
                moveTo(19.384f, 19.588f)
                lineTo(21.588f, 17.384f)
                curveTo(21.139f, 18.355f, 20.355f, 19.139f, 19.384f, 19.588f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(18.888f, 13.366f)
                curveTo(19.376f, 12.878f, 20.168f, 12.878f, 20.656f, 13.366f)
                lineTo(21.717f, 14.427f)
                curveTo(22.205f, 14.915f, 22.205f, 15.706f, 21.717f, 16.194f)
                lineTo(17.262f, 20.649f)
                curveTo(17.098f, 20.813f, 16.904f, 20.942f, 16.691f, 21.03f)
                lineTo(14.314f, 22.009f)
                curveTo(13.533f, 22.33f, 12.753f, 21.549f, 13.074f, 20.768f)
                lineTo(14.053f, 18.392f)
                curveTo(14.141f, 18.178f, 14.27f, 17.984f, 14.434f, 17.821f)
                lineTo(18.888f, 13.366f)
                close()
                moveTo(19.772f, 14.604f)
                lineTo(19.255f, 15.12f)
                lineTo(19.962f, 15.827f)
                lineTo(20.479f, 15.311f)
                lineTo(19.772f, 14.604f)
                close()
                moveTo(15.494f, 18.882f)
                lineTo(18.485f, 15.891f)
                lineTo(19.192f, 16.598f)
                lineTo(16.201f, 19.589f)
                curveTo(16.178f, 19.612f, 16.15f, 19.631f, 16.12f, 19.643f)
                lineTo(14.964f, 20.119f)
                lineTo(15.44f, 18.963f)
                curveTo(15.452f, 18.933f, 15.471f, 18.905f, 15.494f, 18.882f)
                close()
            }
        }.build()
        return envelopePen!!
    }

private var envelopePen: ImageVector? = null