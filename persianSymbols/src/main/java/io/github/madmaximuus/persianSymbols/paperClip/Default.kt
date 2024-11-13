package io.github.madmaximuus.persianSymbols.paperClip

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.PaperClip: ImageVector
    get() {
        if (paperClip != null) {
            return paperClip!!
        }
        paperClip = Builder(
            name = "paper-clip-default",
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
                moveTo(16f, 7f)
                curveTo(16f, 7f, 16f, 15f, 16f, 16f)
                curveTo(16f, 17f, 16f, 21f, 11.5f, 21f)
                curveTo(7f, 21f, 7f, 17.5f, 7f, 16f)
                curveTo(7f, 13f, 7f, 8.4f, 7f, 6f)
                curveTo(7f, 3.6f, 9f, 3f, 10f, 3f)
                curveTo(11.05f, 3f, 13f, 3.6f, 13f, 6f)
                curveTo(13f, 8.4f, 13f, 13.833f, 13f, 16f)
                curveTo(13f, 16.5f, 13.167f, 18f, 11.5f, 18f)
                curveTo(10f, 18f, 10f, 16.5f, 10f, 16f)
                verticalLineTo(7f)
            }
        }.build()
        return paperClip!!
    }

private var paperClip: ImageVector? = null