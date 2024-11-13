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
                moveTo(2.325f, 6.738f)
                curveTo(2.115f, 7.251f, 2f, 7.812f, 2f, 8.4f)
                verticalLineTo(15.6f)
                curveTo(2f, 18.03f, 3.97f, 20f, 6.4f, 20f)
                horizontalLineTo(11.677f)
                lineTo(12.115f, 17.809f)
                curveTo(12.222f, 17.277f, 12.483f, 16.788f, 12.867f, 16.404f)
                lineTo(16.896f, 12.375f)
                curveTo(17.97f, 11.301f, 19.711f, 11.301f, 20.785f, 12.375f)
                lineTo(22f, 13.591f)
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
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(17.603f, 13.083f)
                curveTo(18.286f, 12.399f, 19.394f, 12.399f, 20.078f, 13.083f)
                lineTo(21.492f, 14.497f)
                curveTo(22.175f, 15.18f, 22.175f, 16.288f, 21.492f, 16.972f)
                lineTo(17.463f, 21f)
                curveTo(17.219f, 21.244f, 16.908f, 21.411f, 16.569f, 21.479f)
                lineTo(14.066f, 21.979f)
                curveTo(13.191f, 22.154f, 12.42f, 21.383f, 12.595f, 20.508f)
                lineTo(13.096f, 18.005f)
                curveTo(13.163f, 17.667f, 13.33f, 17.355f, 13.574f, 17.111f)
                lineTo(17.603f, 13.083f)
                close()
                moveTo(14.635f, 18.172f)
                lineTo(17.194f, 15.613f)
                lineTo(18.962f, 17.381f)
                lineTo(16.403f, 19.94f)
                curveTo(16.368f, 19.974f, 16.323f, 19.998f, 16.275f, 20.008f)
                lineTo(14.139f, 20.435f)
                lineTo(14.566f, 18.299f)
                curveTo(14.576f, 18.251f, 14.6f, 18.207f, 14.635f, 18.172f)
                close()
            }
        }.build()
        return envelopePen!!
    }

private var envelopePen: ImageVector? = null