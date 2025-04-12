package io.github.madmaximuus.persianSymbols.message.ellipsis.vert

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.MessageEllipsisVert: ImageVector
    get() {
        if (messageEllipsisVert != null) {
            return messageEllipsisVert!!
        }
        messageEllipsisVert = ImageVector.Builder(
            name = "message-ellipsis-vert-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.4f, 4f)
                horizontalLineTo(17.6f)
                curveTo(20.03f, 4f, 22f, 6.017f, 22f, 8.506f)
                verticalLineTo(15.878f)
                curveTo(22f, 18.367f, 20.03f, 20.384f, 17.6f, 20.384f)
                horizontalLineTo(8.166f)
                curveTo(7.762f, 20.384f, 7.361f, 20.456f, 6.981f, 20.596f)
                lineTo(3.339f, 21.939f)
                curveTo(2.687f, 22.179f, 2f, 21.684f, 2f, 20.975f)
                verticalLineTo(8.506f)
                curveTo(2f, 6.017f, 3.97f, 4f, 6.4f, 4f)
                close()
                moveTo(13.5f, 8f)
                curveTo(13.5f, 8.828f, 12.828f, 9.5f, 12f, 9.5f)
                curveTo(11.172f, 9.5f, 10.5f, 8.828f, 10.5f, 8f)
                curveTo(10.5f, 7.172f, 11.172f, 6.5f, 12f, 6.5f)
                curveTo(12.828f, 6.5f, 13.5f, 7.172f, 13.5f, 8f)
                close()
                moveTo(12f, 13.5f)
                curveTo(12.828f, 13.5f, 13.5f, 12.828f, 13.5f, 12f)
                curveTo(13.5f, 11.172f, 12.828f, 10.5f, 12f, 10.5f)
                curveTo(11.172f, 10.5f, 10.5f, 11.172f, 10.5f, 12f)
                curveTo(10.5f, 12.828f, 11.172f, 13.5f, 12f, 13.5f)
                close()
                moveTo(12f, 17.5f)
                curveTo(12.828f, 17.5f, 13.5f, 16.828f, 13.5f, 16f)
                curveTo(13.5f, 15.172f, 12.828f, 14.5f, 12f, 14.5f)
                curveTo(11.172f, 14.5f, 10.5f, 15.172f, 10.5f, 16f)
                curveTo(10.5f, 16.828f, 11.172f, 17.5f, 12f, 17.5f)
                close()
            }
        }.build()

        return messageEllipsisVert!!
    }

private var messageEllipsisVert: ImageVector? = null