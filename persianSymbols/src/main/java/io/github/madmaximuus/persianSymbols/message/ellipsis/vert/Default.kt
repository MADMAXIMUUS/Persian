package io.github.madmaximuus.persianSymbols.message.ellipsis.vert

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.MessageEllipsisVert: ImageVector
    get() {
        if (messageEllipsisVert != null) {
            return messageEllipsisVert!!
        }
        messageEllipsisVert = ImageVector.Builder(
            name = "message-ellipsis-vert-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.5f, 8f)
                curveTo(13.5f, 8.828f, 12.828f, 9.5f, 12f, 9.5f)
                curveTo(11.172f, 9.5f, 10.5f, 8.828f, 10.5f, 8f)
                curveTo(10.5f, 7.172f, 11.172f, 6.5f, 12f, 6.5f)
                curveTo(12.828f, 6.5f, 13.5f, 7.172f, 13.5f, 8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 13.5f)
                curveTo(12.828f, 13.5f, 13.5f, 12.828f, 13.5f, 12f)
                curveTo(13.5f, 11.172f, 12.828f, 10.5f, 12f, 10.5f)
                curveTo(11.172f, 10.5f, 10.5f, 11.172f, 10.5f, 12f)
                curveTo(10.5f, 12.828f, 11.172f, 13.5f, 12f, 13.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 17.5f)
                curveTo(12.828f, 17.5f, 13.5f, 16.828f, 13.5f, 16f)
                curveTo(13.5f, 15.172f, 12.828f, 14.5f, 12f, 14.5f)
                curveTo(11.172f, 14.5f, 10.5f, 15.172f, 10.5f, 16f)
                curveTo(10.5f, 16.828f, 11.172f, 17.5f, 12f, 17.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.5f, 4f)
                curveTo(4.015f, 4f, 2f, 6.015f, 2f, 8.5f)
                verticalLineTo(21f)
                curveTo(2f, 21.332f, 2.165f, 21.642f, 2.439f, 21.828f)
                curveTo(2.714f, 22.014f, 3.063f, 22.052f, 3.371f, 21.928f)
                lineTo(7.746f, 20.179f)
                curveTo(8.041f, 20.061f, 8.356f, 20f, 8.674f, 20f)
                horizontalLineTo(17.5f)
                curveTo(19.985f, 20f, 22f, 17.985f, 22f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(22f, 6.015f, 19.985f, 4f, 17.5f, 4f)
                horizontalLineTo(6.5f)
                close()
                moveTo(4f, 8.5f)
                curveTo(4f, 7.119f, 5.119f, 6f, 6.5f, 6f)
                horizontalLineTo(17.5f)
                curveTo(18.881f, 6f, 20f, 7.119f, 20f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(20f, 16.881f, 18.881f, 18f, 17.5f, 18f)
                horizontalLineTo(8.674f)
                curveTo(8.102f, 18f, 7.534f, 18.109f, 7.003f, 18.322f)
                lineTo(4f, 19.523f)
                verticalLineTo(8.5f)
                close()
            }
        }.build()

        return messageEllipsisVert!!
    }

private var messageEllipsisVert: ImageVector? = null