package io.github.madmaximuus.persianSymbols.expend

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Expend: ImageVector
    get() {
        if (expend != null) {
            return expend!!
        }
        expend = Builder(
            name = "expend-default",
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
                moveTo(8f, 4f)
                horizontalLineTo(4.999f)
                curveTo(4.447f, 4f, 3.999f, 4.448f, 3.999f, 5f)
                verticalLineTo(8f)
                moveTo(16f, 4f)
                horizontalLineTo(18.999f)
                curveTo(19.551f, 4f, 19.999f, 4.448f, 19.999f, 5f)
                verticalLineTo(8f)
                moveTo(3.999f, 16f)
                verticalLineTo(19f)
                curveTo(3.999f, 19.552f, 4.447f, 20f, 4.999f, 20f)
                horizontalLineTo(8f)
                moveTo(16f, 20f)
                horizontalLineTo(18.999f)
                curveTo(19.551f, 20f, 19.999f, 19.552f, 19.999f, 19f)
                verticalLineTo(16f)
            }
        }.build()
        return expend!!
    }

private var expend: ImageVector? = null