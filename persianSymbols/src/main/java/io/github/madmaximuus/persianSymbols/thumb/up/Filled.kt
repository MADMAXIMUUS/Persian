package io.github.madmaximuus.persianSymbols.thumb.up

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.ThumbUp: ImageVector
    get() {
        if (thumbUp != null) {
            return thumbUp!!
        }
        thumbUp = Builder(
            name = "thumb-up-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.214f, 8.83f)
                curveTo(8.237f, 8.902f, 8.25f, 8.98f, 8.25f, 9.06f)
                verticalLineTo(21.06f)
                lineTo(17.506f, 21.06f)
                curveTo(18.293f, 21.06f, 19.008f, 20.598f, 19.33f, 19.88f)
                lineTo(21.824f, 14.326f)
                curveTo(21.94f, 14.068f, 22f, 13.789f, 22f, 13.507f)
                verticalLineTo(11.06f)
                curveTo(22f, 9.956f, 21.105f, 9.06f, 20f, 9.06f)
                horizontalLineTo(15.074f)
                curveTo(14.494f, 9.06f, 14.035f, 8.568f, 14.076f, 7.989f)
                lineTo(14.399f, 3.477f)
                curveTo(14.432f, 3.006f, 13.855f, 2.755f, 13.534f, 3.101f)
                lineTo(8.214f, 8.83f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.75f, 21.06f)
                verticalLineTo(9.06f)
                curveTo(6.75f, 9.06f, 6.75f, 9.06f, 6.75f, 9.06f)
                lineTo(4f, 9.06f)
                curveTo(2.895f, 9.06f, 2f, 9.956f, 2f, 11.06f)
                verticalLineTo(19.06f)
                curveTo(2f, 20.165f, 2.895f, 21.06f, 4f, 21.06f)
                lineTo(6.75f, 21.06f)
                close()
            }
        }.build()
        return thumbUp!!
    }

private var thumbUp: ImageVector? = null