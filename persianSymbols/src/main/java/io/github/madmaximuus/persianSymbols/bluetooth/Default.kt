package io.github.madmaximuus.persianSymbols.bluetooth

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Bluetooth: ImageVector
    get() {
        if (bluetooth != null) {
            return bluetooth!!
        }
        bluetooth = Builder(
            name = "bluetooth-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 7f)
                lineTo(16f, 16f)
                lineTo(12f, 20f)
                verticalLineTo(4.5f)
                lineTo(16f, 8f)
                lineTo(7f, 17f)
            }
        }.build()
        return bluetooth!!
    }

private var bluetooth: ImageVector? = null