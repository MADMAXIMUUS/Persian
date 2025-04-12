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
                moveTo(8.214f, 7.39f)
                curveTo(8.237f, 7.463f, 8.25f, 7.54f, 8.25f, 7.62f)
                verticalLineTo(19.62f)
                lineTo(17.506f, 19.62f)
                curveTo(18.293f, 19.62f, 19.008f, 19.158f, 19.33f, 18.44f)
                lineTo(21.824f, 12.886f)
                curveTo(21.94f, 12.628f, 22f, 12.349f, 22f, 12.067f)
                verticalLineTo(9.62f)
                curveTo(22f, 8.516f, 21.105f, 7.62f, 20f, 7.62f)
                horizontalLineTo(15.074f)
                curveTo(14.494f, 7.62f, 14.035f, 7.128f, 14.076f, 6.549f)
                lineTo(14.298f, 3.453f)
                curveTo(14.365f, 2.512f, 13.21f, 2.01f, 12.567f, 2.702f)
                lineTo(8.214f, 7.39f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.75f, 19.62f)
                verticalLineTo(7.62f)
                curveTo(6.75f, 7.62f, 6.75f, 7.62f, 6.75f, 7.62f)
                lineTo(4f, 7.62f)
                curveTo(2.895f, 7.62f, 2f, 8.516f, 2f, 9.62f)
                verticalLineTo(17.62f)
                curveTo(2f, 18.725f, 2.895f, 19.62f, 4f, 19.62f)
                lineTo(6.75f, 19.62f)
                close()
            }
        }.build()
        return thumbUp!!
    }

private var thumbUp: ImageVector? = null