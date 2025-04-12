package io.github.madmaximuus.persianSymbols.message.i

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.MessageI: ImageVector
    get() {
        if (messageI != null) {
            return messageI!!
        }
        messageI = ImageVector.Builder(
            name = "message-i-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.996f, 16.875f)
                curveTo(12.41f, 16.875f, 12.746f, 16.539f, 12.746f, 16.125f)
                lineTo(12.746f, 10.651f)
                curveTo(12.746f, 10.237f, 12.41f, 9.901f, 11.996f, 9.901f)
                curveTo(11.582f, 9.901f, 11.246f, 10.237f, 11.246f, 10.651f)
                lineTo(11.246f, 16.125f)
                curveTo(11.246f, 16.539f, 11.582f, 16.875f, 11.996f, 16.875f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13f, 8.125f)
                curveTo(13f, 7.573f, 12.552f, 7.125f, 12f, 7.125f)
                curveTo(11.448f, 7.125f, 11f, 7.573f, 11f, 8.125f)
                curveTo(11f, 8.677f, 11.448f, 9.125f, 12f, 9.125f)
                curveTo(12.552f, 9.125f, 13f, 8.677f, 13f, 8.125f)
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

        return messageI!!
    }

private var messageI: ImageVector? = null