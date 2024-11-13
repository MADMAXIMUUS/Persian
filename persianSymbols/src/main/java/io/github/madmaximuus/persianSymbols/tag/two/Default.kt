package io.github.madmaximuus.persianSymbols.tag.two

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Tag2: ImageVector
    get() {
        if (tag2 != null) {
            return tag2!!
        }
        tag2 = Builder(
            name = "tag-2-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.368f, 5f)
                horizontalLineTo(3f)
                lineTo(9.5f, 12f)
                lineTo(3f, 19f)
                horizontalLineTo(14.368f)
                lineTo(21f, 12f)
                lineTo(14.368f, 5f)
                close()
            }
        }.build()
        return tag2!!
    }

private var tag2: ImageVector? = null