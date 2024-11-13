package io.github.madmaximuus.persianSymbols.envelope.dot

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.EnvelopeDot: ImageVector
    get() {
        if (envelopeDot != null) {
            return envelopeDot!!
        }
        envelopeDot = Builder(
            name = "envelope-dot-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19f, 7f)
                curveTo(20.105f, 7f, 21f, 6.105f, 21f, 5f)
                curveTo(21f, 3.895f, 20.105f, 3f, 19f, 3f)
                curveTo(17.895f, 3f, 17f, 3.895f, 17f, 5f)
                curveTo(17f, 6.105f, 17.895f, 7f, 19f, 7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.4f, 4f)
                horizontalLineTo(16.171f)
                curveTo(16.06f, 4.313f, 16f, 4.649f, 16f, 5f)
                curveTo(16f, 5.96f, 16.451f, 6.814f, 17.152f, 7.363f)
                lineTo(12.555f, 10.428f)
                curveTo(12.219f, 10.652f, 11.781f, 10.652f, 11.445f, 10.428f)
                lineTo(3.555f, 5.168f)
                curveTo(3.527f, 5.15f, 3.499f, 5.133f, 3.47f, 5.117f)
                curveTo(4.248f, 4.422f, 5.275f, 4f, 6.4f, 4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.664f, 12.092f)
                lineTo(20.138f, 7.777f)
                curveTo(20.509f, 7.624f, 20.843f, 7.4f, 21.122f, 7.12f)
                lineTo(21.555f, 6.832f)
                curveTo(21.598f, 6.803f, 21.638f, 6.772f, 21.675f, 6.738f)
                curveTo(21.885f, 7.251f, 22f, 7.812f, 22f, 8.4f)
                verticalLineTo(15.6f)
                curveTo(22f, 18.03f, 20.03f, 20f, 17.6f, 20f)
                horizontalLineTo(6.4f)
                curveTo(3.97f, 20f, 2f, 18.03f, 2f, 15.6f)
                verticalLineTo(8.4f)
                curveTo(2f, 7.812f, 2.115f, 7.251f, 2.325f, 6.738f)
                curveTo(2.362f, 6.772f, 2.402f, 6.803f, 2.445f, 6.832f)
                lineTo(10.336f, 12.092f)
                curveTo(11.344f, 12.764f, 12.656f, 12.764f, 13.664f, 12.092f)
                close()
            }
        }.build()
        return envelopeDot!!
    }

private var envelopeDot: ImageVector? = null