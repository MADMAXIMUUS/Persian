package io.github.madmaximuus.persianSymbols.thumb.down

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.ThumbDown: ImageVector
    get() {
        if (thumbDown != null) {
            return thumbDown!!
        }
        thumbDown = Builder(
            name = "thumb-down-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.214f, 15.17f)
                curveTo(8.237f, 15.098f, 8.25f, 15.02f, 8.25f, 14.94f)
                verticalLineTo(2.94f)
                lineTo(17.506f, 2.94f)
                curveTo(18.293f, 2.94f, 19.008f, 3.402f, 19.33f, 4.12f)
                lineTo(21.824f, 9.674f)
                curveTo(21.94f, 9.932f, 22f, 10.211f, 22f, 10.493f)
                verticalLineTo(12.94f)
                curveTo(22f, 14.044f, 21.105f, 14.94f, 20f, 14.94f)
                horizontalLineTo(15.074f)
                curveTo(14.494f, 14.94f, 14.035f, 15.432f, 14.076f, 16.011f)
                lineTo(14.399f, 20.523f)
                curveTo(14.432f, 20.994f, 13.855f, 21.245f, 13.534f, 20.899f)
                lineTo(8.214f, 15.17f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.75f, 2.94f)
                verticalLineTo(14.94f)
                curveTo(6.75f, 14.94f, 6.75f, 14.94f, 6.75f, 14.94f)
                lineTo(4f, 14.94f)
                curveTo(2.895f, 14.94f, 2f, 14.044f, 2f, 12.94f)
                verticalLineTo(4.94f)
                curveTo(2f, 3.835f, 2.895f, 2.94f, 4f, 2.94f)
                lineTo(6.75f, 2.94f)
                close()
            }
        }.build()
        return thumbDown!!
    }

private var thumbDown: ImageVector? = null