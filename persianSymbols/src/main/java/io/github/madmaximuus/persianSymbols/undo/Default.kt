package io.github.madmaximuus.persianSymbols.undo

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Undo: ImageVector
    get() {
        if (undo != null) {
            return undo!!
        }
        undo = Builder(
            name = "undo-default",
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
                moveTo(7.5f, 18.5f)
                horizontalLineTo(17f)
                curveTo(18.933f, 18.5f, 20.5f, 16.933f, 20.5f, 15f)
                verticalLineTo(12f)
                curveTo(20.5f, 10.067f, 18.933f, 8.5f, 17f, 8.5f)
                horizontalLineTo(3.5f)
                moveTo(7.5f, 5.5f)
                lineTo(3.5f, 8.486f)
                lineTo(7.5f, 11.5f)
            }
        }.build()
        return undo!!
    }

private var undo: ImageVector? = null