package io.github.madmaximuus.persianSymbols.tag.two

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.Tag2: ImageVector
    get() {
        if (tag2 != null) {
            return tag2!!
        }
        tag2 = Builder(
            name = "tag-2-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.415f, 4f)
                horizontalLineTo(2.763f)
                curveTo(2.076f, 4f, 1.708f, 4.81f, 2.161f, 5.327f)
                lineTo(7.539f, 11.473f)
                curveTo(7.803f, 11.775f, 7.803f, 12.225f, 7.539f, 12.527f)
                lineTo(2.161f, 18.673f)
                curveTo(1.708f, 19.191f, 2.076f, 20f, 2.763f, 20f)
                horizontalLineTo(13.415f)
                curveTo(13.957f, 20f, 14.476f, 19.78f, 14.853f, 19.39f)
                lineTo(21.462f, 12.556f)
                curveTo(21.762f, 12.246f, 21.762f, 11.754f, 21.462f, 11.444f)
                lineTo(14.853f, 4.61f)
                curveTo(14.476f, 4.22f, 13.957f, 4f, 13.415f, 4f)
                close()
            }
        }.build()
        return tag2!!
    }

private var tag2: ImageVector? = null