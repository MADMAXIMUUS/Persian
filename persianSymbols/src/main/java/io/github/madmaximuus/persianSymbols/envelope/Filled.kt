package io.github.madmaximuus.persianSymbols.envelope

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.Envelope: ImageVector
    get() {
        if (envelope != null) {
            return envelope!!
        }
        envelope = Builder(
            name = "envelope-filled",
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
                horizontalLineTo(17.6f)
                curveTo(20.03f, 20f, 22f, 18.03f, 22f, 15.6f)
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
        }.build()
        return envelope!!
    }

private var envelope: ImageVector? = null