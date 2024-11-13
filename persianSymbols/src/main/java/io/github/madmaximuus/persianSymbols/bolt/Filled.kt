package io.github.madmaximuus.persianSymbols.bolt

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.Bolt: ImageVector
    get() {
        if (bolt != null) {
            return bolt!!
        }
        bolt = Builder(
            name = "bolt-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 14f)
                lineTo(13.972f, 3.012f)
                lineTo(13f, 10f)
                horizontalLineTo(17f)
                lineTo(9.977f, 21.012f)
                lineTo(11f, 14f)
                horizontalLineTo(7f)
                close()
            }
        }.build()
        return bolt!!
    }

private var bolt: ImageVector? = null