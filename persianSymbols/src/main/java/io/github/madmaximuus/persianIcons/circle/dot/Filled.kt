package io.github.madmaximuus.persianIcons.circle.dot

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianIcons.foundation.PersianSymbols

val PersianSymbols.Filled.CircleDot: ImageVector
    get() {
        if (circleDot != null) {
            return circleDot!!
        }
        circleDot = ImageVector.Builder(
            name = "circle-dot-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 22f)
                curveTo(17.5228f, 22f, 22f, 17.5228f, 22f, 12f)
                curveTo(22f, 6.4771f, 17.5228f, 2f, 12f, 2f)
                curveTo(6.4771f, 2f, 2f, 6.4771f, 2f, 12f)
                curveTo(2f, 17.5228f, 6.4771f, 22f, 12f, 22f)
                close()
                moveTo(11.9999f, 17f)
                curveTo(14.7613f, 17f, 16.9999f, 14.7614f, 16.9999f, 12f)
                curveTo(16.9999f, 9.2386f, 14.7613f, 7f, 11.9999f, 7f)
                curveTo(9.2385f, 7f, 6.9999f, 9.2386f, 6.9999f, 12f)
                curveTo(6.9999f, 14.7614f, 9.2385f, 17f, 11.9999f, 17f)
                close()
            }
        }.build()
        return circleDot!!
    }

private var circleDot: ImageVector? = null
