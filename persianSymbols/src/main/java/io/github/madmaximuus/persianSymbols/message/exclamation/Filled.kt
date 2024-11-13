package io.github.madmaximuus.persianSymbols.message.exclamation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.MessageExclamation: ImageVector
    get() {
        if (messageExclamation != null) {
            return messageExclamation!!
        }
        messageExclamation = Builder(
            name = "message-exclamation-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.4f, 3f)
                horizontalLineTo(17.6f)
                curveTo(20.03f, 3f, 22f, 5.017f, 22f, 7.506f)
                verticalLineTo(14.878f)
                curveTo(22f, 17.367f, 20.03f, 19.384f, 17.6f, 19.384f)
                horizontalLineTo(8.166f)
                curveTo(7.762f, 19.384f, 7.361f, 19.456f, 6.981f, 19.596f)
                lineTo(3.339f, 20.939f)
                curveTo(2.687f, 21.179f, 2f, 20.684f, 2f, 19.975f)
                verticalLineTo(7.506f)
                curveTo(2f, 5.017f, 3.97f, 3f, 6.4f, 3f)
                close()
                moveTo(11.996f, 6.125f)
                curveTo(12.41f, 6.125f, 12.746f, 6.461f, 12.746f, 6.875f)
                lineTo(12.746f, 12.349f)
                curveTo(12.746f, 12.763f, 12.41f, 13.099f, 11.996f, 13.099f)
                curveTo(11.582f, 13.099f, 11.246f, 12.763f, 11.246f, 12.349f)
                lineTo(11.246f, 6.875f)
                curveTo(11.246f, 6.461f, 11.582f, 6.125f, 11.996f, 6.125f)
                close()
                moveTo(13f, 14.875f)
                curveTo(13f, 15.427f, 12.552f, 15.875f, 12f, 15.875f)
                curveTo(11.448f, 15.875f, 11f, 15.427f, 11f, 14.875f)
                curveTo(11f, 14.323f, 11.448f, 13.875f, 12f, 13.875f)
                curveTo(12.552f, 13.875f, 13f, 14.323f, 13f, 14.875f)
                close()
            }
        }.build()
        return messageExclamation!!
    }

private var messageExclamation: ImageVector? = null