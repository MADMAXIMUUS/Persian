package io.github.madmaximuus.persianSymbols.nine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Nine: ImageVector
    get() {
        if (nine != null) {
            return nine!!
        }
        nine = ImageVector.Builder(
            name = "nine-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.429f, 9f)
                curveTo(17.429f, 5.962f, 14.967f, 3.5f, 11.929f, 3.5f)
                curveTo(8.892f, 3.5f, 6.429f, 5.962f, 6.429f, 9f)
                curveTo(6.429f, 12.038f, 8.892f, 14.5f, 11.929f, 14.5f)
                curveTo(14.967f, 14.5f, 17.429f, 12.038f, 17.429f, 9f)
                close()
                moveTo(17.429f, 9f)
                curveTo(17.429f, 9f, 18.544f, 20.5f, 11.929f, 20.5f)
                horizontalLineTo(8.929f)
            }
        }.build()

        return nine!!
    }

private var nine: ImageVector? = null
