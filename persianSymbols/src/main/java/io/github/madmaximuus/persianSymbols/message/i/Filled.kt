package io.github.madmaximuus.persianSymbols.message.i

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.MessageI: ImageVector
    get() {
        if (messageI != null) {
            return messageI!!
        }
        messageI = ImageVector.Builder(
            name = "message-i-filled",
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
                moveTo(11.996f, 16.875f)
                curveTo(12.41f, 16.875f, 12.746f, 16.539f, 12.746f, 16.125f)
                lineTo(12.746f, 10.651f)
                curveTo(12.746f, 10.237f, 12.41f, 9.901f, 11.996f, 9.901f)
                curveTo(11.582f, 9.901f, 11.246f, 10.237f, 11.246f, 10.651f)
                lineTo(11.246f, 16.125f)
                curveTo(11.246f, 16.539f, 11.582f, 16.875f, 11.996f, 16.875f)
                close()
                moveTo(13f, 8.125f)
                curveTo(13f, 7.573f, 12.552f, 7.125f, 12f, 7.125f)
                curveTo(11.448f, 7.125f, 11f, 7.573f, 11f, 8.125f)
                curveTo(11f, 8.677f, 11.448f, 9.125f, 12f, 9.125f)
                curveTo(12.552f, 9.125f, 13f, 8.677f, 13f, 8.125f)
                close()
            }
        }.build()

        return messageI!!
    }

private var messageI: ImageVector? = null