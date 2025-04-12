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
                moveTo(8.214f, 16.61f)
                curveTo(8.237f, 16.538f, 8.25f, 16.46f, 8.25f, 16.38f)
                verticalLineTo(4.38f)
                lineTo(17.506f, 4.38f)
                curveTo(18.293f, 4.38f, 19.008f, 4.842f, 19.33f, 5.56f)
                lineTo(21.824f, 11.114f)
                curveTo(21.94f, 11.372f, 22f, 11.651f, 22f, 11.933f)
                verticalLineTo(14.38f)
                curveTo(22f, 15.484f, 21.105f, 16.38f, 20f, 16.38f)
                horizontalLineTo(15.074f)
                curveTo(14.494f, 16.38f, 14.035f, 16.872f, 14.076f, 17.451f)
                lineTo(14.298f, 20.547f)
                curveTo(14.365f, 21.488f, 13.21f, 21.99f, 12.567f, 21.298f)
                lineTo(8.214f, 16.61f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.75f, 4.38f)
                verticalLineTo(16.38f)
                curveTo(6.75f, 16.38f, 6.75f, 16.38f, 6.75f, 16.38f)
                lineTo(4f, 16.38f)
                curveTo(2.895f, 16.38f, 2f, 15.484f, 2f, 14.38f)
                verticalLineTo(6.38f)
                curveTo(2f, 5.275f, 2.895f, 4.38f, 4f, 4.38f)
                lineTo(6.75f, 4.38f)
                close()
            }
        }.build()
        return thumbDown!!
    }

private var thumbDown: ImageVector? = null