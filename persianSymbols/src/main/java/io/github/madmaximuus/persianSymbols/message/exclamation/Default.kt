package io.github.madmaximuus.persianSymbols.message.exclamation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.MessageExclamation: ImageVector
    get() {
        if (messageExclamation != null) {
            return messageExclamation!!
        }
        messageExclamation = Builder(
            name = "message-exclamation-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.996f, 6.125f)
                curveTo(12.41f, 6.125f, 12.746f, 6.461f, 12.746f, 6.875f)
                lineTo(12.746f, 12.349f)
                curveTo(12.746f, 12.763f, 12.41f, 13.099f, 11.996f, 13.099f)
                curveTo(11.582f, 13.099f, 11.246f, 12.763f, 11.246f, 12.349f)
                lineTo(11.246f, 6.875f)
                curveTo(11.246f, 6.461f, 11.582f, 6.125f, 11.996f, 6.125f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13f, 14.875f)
                curveTo(13f, 15.427f, 12.552f, 15.875f, 12f, 15.875f)
                curveTo(11.448f, 15.875f, 11f, 15.427f, 11f, 14.875f)
                curveTo(11f, 14.323f, 11.448f, 13.875f, 12f, 13.875f)
                curveTo(12.552f, 13.875f, 13f, 14.323f, 13f, 14.875f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.5f, 3f)
                curveTo(4.015f, 3f, 2f, 5.015f, 2f, 7.5f)
                verticalLineTo(20f)
                curveTo(2f, 20.332f, 2.165f, 20.642f, 2.439f, 20.828f)
                curveTo(2.714f, 21.014f, 3.063f, 21.052f, 3.371f, 20.928f)
                lineTo(7.746f, 19.179f)
                curveTo(8.041f, 19.061f, 8.356f, 19f, 8.674f, 19f)
                horizontalLineTo(17.5f)
                curveTo(19.985f, 19f, 22f, 16.985f, 22f, 14.5f)
                verticalLineTo(7.5f)
                curveTo(22f, 5.015f, 19.985f, 3f, 17.5f, 3f)
                horizontalLineTo(6.5f)
                close()
                moveTo(4f, 7.5f)
                curveTo(4f, 6.119f, 5.119f, 5f, 6.5f, 5f)
                horizontalLineTo(17.5f)
                curveTo(18.881f, 5f, 20f, 6.119f, 20f, 7.5f)
                verticalLineTo(14.5f)
                curveTo(20f, 15.881f, 18.881f, 17f, 17.5f, 17f)
                horizontalLineTo(8.674f)
                curveTo(8.102f, 17f, 7.534f, 17.109f, 7.003f, 17.322f)
                lineTo(4f, 18.523f)
                verticalLineTo(7.5f)
                close()
            }
        }.build()
        return messageExclamation!!
    }

private var messageExclamation: ImageVector? = null