package io.github.madmaximuus.persianSymbols.play

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.Play: ImageVector
    get() {
        if (play != null) {
            return play!!
        }
        play = Builder(
            name = "play-filled",
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
                moveTo(17.752f, 11.168f)
                lineTo(8.555f, 5.036f)
                curveTo(7.89f, 4.593f, 7f, 5.07f, 7f, 5.869f)
                verticalLineTo(18.132f)
                curveTo(7f, 18.93f, 7.89f, 19.407f, 8.555f, 18.963f)
                lineTo(17.752f, 12.832f)
                curveTo(18.346f, 12.436f, 18.346f, 11.564f, 17.752f, 11.168f)
                close()
            }
        }.build()
        return play!!
    }

private var play: ImageVector? = null