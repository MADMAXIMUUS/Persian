package io.github.madmaximuus.persianSymbols.envelope.check

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.EnvelopeCheck: ImageVector
    get() {
        if (envelopeCheck != null) {
            return envelopeCheck!!
        }
        envelopeCheck = Builder(
            name = "envelope-check-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(2.325f, 6.738f)
                curveTo(2.115f, 7.251f, 2f, 7.812f, 2f, 8.4f)
                verticalLineTo(15.6f)
                curveTo(2f, 18.03f, 3.97f, 20f, 6.4f, 20f)
                horizontalLineTo(12.341f)
                curveTo(12.12f, 19.374f, 12f, 18.701f, 12f, 18f)
                curveTo(12f, 14.686f, 14.686f, 12f, 18f, 12f)
                curveTo(19.537f, 12f, 20.938f, 12.578f, 22f, 13.528f)
                verticalLineTo(8.4f)
                curveTo(22f, 7.812f, 21.885f, 7.251f, 21.675f, 6.738f)
                curveTo(21.638f, 6.772f, 21.598f, 6.803f, 21.555f, 6.832f)
                lineTo(13.664f, 12.092f)
                curveTo(12.656f, 12.764f, 11.344f, 12.764f, 10.336f, 12.092f)
                lineTo(2.445f, 6.832f)
                curveTo(2.402f, 6.803f, 2.362f, 6.772f, 2.325f, 6.738f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.47f, 5.117f)
                curveTo(3.499f, 5.133f, 3.527f, 5.15f, 3.555f, 5.168f)
                lineTo(11.445f, 10.428f)
                curveTo(11.781f, 10.652f, 12.219f, 10.652f, 12.555f, 10.428f)
                lineTo(20.445f, 5.168f)
                curveTo(20.473f, 5.15f, 20.501f, 5.133f, 20.53f, 5.117f)
                curveTo(19.752f, 4.422f, 18.725f, 4f, 17.6f, 4f)
                horizontalLineTo(6.4f)
                curveTo(5.275f, 4f, 4.248f, 4.422f, 3.47f, 5.117f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.969f, 16.414f)
                curveTo(20.292f, 16.673f, 20.344f, 17.145f, 20.086f, 17.469f)
                lineTo(18.086f, 19.969f)
                curveTo(17.952f, 20.135f, 17.754f, 20.237f, 17.542f, 20.249f)
                curveTo(17.329f, 20.261f, 17.121f, 20.181f, 16.97f, 20.03f)
                lineTo(15.97f, 19.03f)
                curveTo(15.677f, 18.737f, 15.677f, 18.263f, 15.97f, 17.97f)
                curveTo(16.263f, 17.677f, 16.737f, 17.677f, 17.03f, 17.97f)
                lineTo(17.438f, 18.377f)
                lineTo(18.914f, 16.531f)
                curveTo(19.173f, 16.208f, 19.645f, 16.156f, 19.969f, 16.414f)
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
        return envelopeCheck!!
    }

private var envelopeCheck: ImageVector? = null