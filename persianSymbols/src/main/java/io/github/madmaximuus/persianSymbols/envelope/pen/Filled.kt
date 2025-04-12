package io.github.madmaximuus.persianSymbols.envelope.pen

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.EnvelopePen: ImageVector
    get() {
        if (envelopePen != null) {
            return envelopePen!!
        }
        envelopePen = Builder(
            name = "envelope-pen-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(2f, 8.4f)
                curveTo(2f, 7.456f, 2.297f, 6.581f, 2.804f, 5.864f)
                lineTo(8.968f, 12.029f)
                lineTo(2.827f, 18.169f)
                curveTo(2.307f, 17.446f, 2f, 16.559f, 2f, 15.6f)
                verticalLineTo(8.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.898f, 19.22f)
                curveTo(4.608f, 19.712f, 5.471f, 20f, 6.4f, 20f)
                horizontalLineTo(12.58f)
                lineTo(13.359f, 18.107f)
                curveTo(13.485f, 17.801f, 13.67f, 17.524f, 13.903f, 17.291f)
                lineTo(16.038f, 15.156f)
                lineTo(13.971f, 13.089f)
                lineTo(13.591f, 13.47f)
                curveTo(12.712f, 14.348f, 11.288f, 14.348f, 10.409f, 13.47f)
                lineTo(10.029f, 13.089f)
                lineTo(3.898f, 19.22f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.102f, 19.22f)
                curveTo(19.858f, 19.389f, 19.597f, 19.533f, 19.321f, 19.651f)
                lineTo(19.927f, 19.045f)
                lineTo(20.102f, 19.22f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.988f, 17.984f)
                lineTo(21.651f, 17.321f)
                curveTo(21.522f, 17.623f, 21.361f, 17.907f, 21.173f, 18.169f)
                lineTo(20.988f, 17.984f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 8.4f)
                verticalLineTo(13.649f)
                lineTo(21.186f, 12.836f)
                curveTo(20.405f, 12.055f, 19.139f, 12.055f, 18.358f, 12.836f)
                lineTo(17.099f, 14.095f)
                lineTo(15.032f, 12.029f)
                lineTo(21.196f, 5.864f)
                curveTo(21.703f, 6.581f, 22f, 7.456f, 22f, 8.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.864f, 4.804f)
                curveTo(4.581f, 4.297f, 5.456f, 4f, 6.4f, 4f)
                horizontalLineTo(17.6f)
                curveTo(18.544f, 4f, 19.419f, 4.297f, 20.136f, 4.804f)
                lineTo(12.53f, 12.409f)
                curveTo(12.237f, 12.702f, 11.762f, 12.702f, 11.47f, 12.409f)
                lineTo(3.864f, 4.804f)
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