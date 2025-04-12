package io.github.madmaximuus.persianSymbols.reply.all

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.ReplyAll: ImageVector
    get() {
        if (replyAll != null) {
            return replyAll!!
        }
        replyAll = Builder(
            name = "reply-all-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.848f, 7.301f)
                curveTo(8.291f, 6.971f, 8.382f, 6.344f, 8.051f, 5.902f)
                curveTo(7.721f, 5.459f, 7.094f, 5.368f, 6.652f, 5.699f)
                lineTo(2.652f, 8.685f)
                curveTo(2.4f, 8.873f, 2.251f, 9.169f, 2.25f, 9.484f)
                curveTo(2.249f, 9.799f, 2.397f, 10.095f, 2.648f, 10.285f)
                lineTo(6.648f, 13.299f)
                curveTo(7.089f, 13.631f, 7.716f, 13.543f, 8.049f, 13.102f)
                curveTo(8.381f, 12.661f, 8.293f, 12.034f, 7.852f, 11.701f)
                lineTo(4.917f, 9.49f)
                lineTo(7.848f, 7.301f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.051f, 5.902f)
                curveTo(12.382f, 6.344f, 12.291f, 6.971f, 11.848f, 7.301f)
                lineTo(10.243f, 8.5f)
                horizontalLineTo(17.25f)
                curveTo(19.735f, 8.5f, 21.75f, 10.515f, 21.75f, 13f)
                verticalLineTo(17.5f)
                curveTo(21.75f, 18.052f, 21.302f, 18.5f, 20.75f, 18.5f)
                curveTo(20.198f, 18.5f, 19.75f, 18.052f, 19.75f, 17.5f)
                verticalLineTo(13f)
                curveTo(19.75f, 11.619f, 18.631f, 10.5f, 17.25f, 10.5f)
                horizontalLineTo(10.257f)
                lineTo(11.852f, 11.701f)
                curveTo(12.293f, 12.034f, 12.381f, 12.661f, 12.049f, 13.102f)
                curveTo(11.716f, 13.543f, 11.089f, 13.631f, 10.648f, 13.299f)
                lineTo(6.648f, 10.285f)
                curveTo(6.397f, 10.095f, 6.249f, 9.799f, 6.25f, 9.484f)
                curveTo(6.251f, 9.169f, 6.4f, 8.873f, 6.652f, 8.685f)
                lineTo(10.652f, 5.699f)
                curveTo(11.094f, 5.368f, 11.721f, 5.459f, 12.051f, 5.902f)
                close()
            }
        }.build()
        return replyAll!!
    }

private var replyAll: ImageVector? = null