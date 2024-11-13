package io.github.madmaximuus.persianSymbols.reply

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Reply: ImageVector
    get() {
        if (reply != null) {
            return reply!!
        }
        reply = Builder(
            name = "reply-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.848f, 7.301f)
                curveTo(9.291f, 6.971f, 9.382f, 6.344f, 9.051f, 5.902f)
                curveTo(8.721f, 5.459f, 8.094f, 5.368f, 7.652f, 5.699f)
                lineTo(3.652f, 8.685f)
                curveTo(3.4f, 8.873f, 3.251f, 9.169f, 3.25f, 9.484f)
                curveTo(3.249f, 9.799f, 3.397f, 10.095f, 3.648f, 10.285f)
                lineTo(7.648f, 13.299f)
                curveTo(8.089f, 13.631f, 8.716f, 13.543f, 9.049f, 13.102f)
                curveTo(9.381f, 12.661f, 9.293f, 12.034f, 8.852f, 11.701f)
                lineTo(7.257f, 10.5f)
                horizontalLineTo(16.25f)
                curveTo(17.631f, 10.5f, 18.75f, 11.619f, 18.75f, 13f)
                verticalLineTo(17.5f)
                curveTo(18.75f, 18.052f, 19.198f, 18.5f, 19.75f, 18.5f)
                curveTo(20.302f, 18.5f, 20.75f, 18.052f, 20.75f, 17.5f)
                verticalLineTo(13f)
                curveTo(20.75f, 10.515f, 18.735f, 8.5f, 16.25f, 8.5f)
                horizontalLineTo(7.243f)
                lineTo(8.848f, 7.301f)
                close()
            }
        }.build()
        return reply!!
    }

private var reply: ImageVector? = null