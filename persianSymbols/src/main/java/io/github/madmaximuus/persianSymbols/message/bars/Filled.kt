package io.github.madmaximuus.persianSymbols.message.bars

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.MessageBars: ImageVector
    get() {
        if (messageBars != null) {
            return messageBars!!
        }
        messageBars = Builder(
            name = "message-bars-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.4f, 3.21f)
                horizontalLineTo(17.6f)
                curveTo(20.03f, 3.21f, 22f, 5.227f, 22f, 7.716f)
                verticalLineTo(15.088f)
                curveTo(22f, 17.577f, 20.03f, 19.594f, 17.6f, 19.594f)
                horizontalLineTo(8.166f)
                curveTo(7.762f, 19.594f, 7.361f, 19.666f, 6.981f, 19.806f)
                lineTo(3.339f, 21.149f)
                curveTo(2.687f, 21.389f, 2f, 20.894f, 2f, 20.185f)
                verticalLineTo(7.716f)
                curveTo(2f, 5.227f, 3.97f, 3.21f, 6.4f, 3.21f)
                close()
                moveTo(7f, 7.46f)
                curveTo(6.586f, 7.46f, 6.25f, 7.796f, 6.25f, 8.21f)
                curveTo(6.25f, 8.624f, 6.586f, 8.96f, 7f, 8.96f)
                horizontalLineTo(17f)
                curveTo(17.414f, 8.96f, 17.75f, 8.624f, 17.75f, 8.21f)
                curveTo(17.75f, 7.796f, 17.414f, 7.46f, 17f, 7.46f)
                horizontalLineTo(7f)
                close()
                moveTo(7f, 10.46f)
                curveTo(6.586f, 10.46f, 6.25f, 10.796f, 6.25f, 11.21f)
                curveTo(6.25f, 11.624f, 6.586f, 11.96f, 7f, 11.96f)
                horizontalLineTo(17f)
                curveTo(17.414f, 11.96f, 17.75f, 11.624f, 17.75f, 11.21f)
                curveTo(17.75f, 10.796f, 17.414f, 10.46f, 17f, 10.46f)
                horizontalLineTo(7f)
                close()
                moveTo(6.25f, 14.21f)
                curveTo(6.25f, 13.796f, 6.586f, 13.46f, 7f, 13.46f)
                horizontalLineTo(13f)
                curveTo(13.414f, 13.46f, 13.75f, 13.796f, 13.75f, 14.21f)
                curveTo(13.75f, 14.624f, 13.414f, 14.96f, 13f, 14.96f)
                horizontalLineTo(7f)
                curveTo(6.586f, 14.96f, 6.25f, 14.624f, 6.25f, 14.21f)
                close()
            }
        }.build()
        return messageBars!!
    }

private var messageBars: ImageVector? = null